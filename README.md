
# Mobile-device-progamming-personal-excercises-part3
![image](https://github.com/user-attachments/assets/3fac2dc5-061c-4487-a469-f947d29504c2)

## 📱 Description of the Images

- These two screenshots represent the user interface and behavior of a simple Android app named "My First App".

Left Image (Before Button Click):
- Displays a centered greeting message:
"Hello"
- with a button labeled "Say Hi!" at the bottom.

Right Image (After Button Click):
- After tapping the "Say Hi!" button, the message changes to:
![image](https://github.com/user-attachments/assets/08e99fc4-be7a-46ec-b2f9-29930dd960c7)
The user's name "Trần Thế Hảo" is styled in bold using a SpannableString.
## 🧠 Implementation Explanation (Code Breakdown)
### 1. AndroidManifest.xml
![image](https://github.com/user-attachments/assets/3c7ed086-4836-4b37-889f-d84629e38f1a)
- Registers MainActivity as the launcher activity.
- Assigns the app theme and entry point for execution.
### 2. MainActivity.kt
![image](https://github.com/user-attachments/assets/31b5a344-e0ce-44e4-8e51-960390d72d2d)
- Sets up a click listener for the "Say Hi!" button.
- On click, constructs a message with your name on a new line.
- Uses SpannableString to apply bold formatting to your name.
- Updates the TextView to display the stylized message.
### 3. activity_main.xml
------------
![image](https://github.com/user-attachments/assets/d8d82e44-7021-422b-8717-74380ee437b4)
---------------
- Initially displays "Hello" as set in the strings.xml.
-------------
![image](https://github.com/user-attachments/assets/4a98af7c-5b6a-499e-9e7d-549810dec112)
--------------
- When clicked, triggers the logic in MainActivity.kt.
### Summary:
- This exercise demonstrates:
- Basic layout using LinearLayout
- View binding in Kotlin (findViewById)
- Click event handling
- Dynamic text update using SpannableString
- Personalization by inserting and styling the developer’s name.


