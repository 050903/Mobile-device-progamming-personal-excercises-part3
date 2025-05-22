package com.android4dev.btth // Thay bằng package name của bạn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.style.StyleSpan
import android.widget.Button
import android.widget.TextView
import android.text.Spannable
import android.graphics.Typeface


class MainActivity : AppCompatActivity() {

    // Khai báo các biến cho TextView và Button
    private lateinit var textViewMessage: TextView
    private lateinit var buttonSayHi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Liên kết layout XML với Activity

        // Ánh xạ các view từ layout XML vào các biến đã khai báo
        textViewMessage = findViewById(R.id.textViewMessage)
        buttonSayHi = findViewById(R.id.buttonSayHi)

        // Thiết lập sự kiện click cho Button
        buttonSayHi.setOnClickListener {
            val myName = "Trần Thế Hảo"
            val message = "I'm\n$myName"

            // Tạo SpannableString để áp dụng định dạng
            val spannable = SpannableString(message)

            // Tính vị trí bắt đầu và kết thúc của tên
            val start = message.indexOf(myName)
            val end = start + myName.length

            // Áp dụng style in đậm
            spannable.setSpan(
                StyleSpan(Typeface.BOLD),
                start,
                end,
                Spannable.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            // Gán vào TextView
            textViewMessage.text = spannable
        }

    }
}