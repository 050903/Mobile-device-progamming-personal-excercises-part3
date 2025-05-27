
# Mobile-device-progamming-personal-excercises-part3

## Assigment 1: 

![image](https://github.com/user-attachments/assets/3fac2dc5-061c-4487-a469-f947d29504c2)

### 📱 Description of the Images

- These two screenshots represent the user interface and behavior of a simple Android app named "My First App".

Left Image (Before Button Click):
- Displays a centered greeting message:
"Hello"
- with a button labeled "Say Hi!" at the bottom.

Right Image (After Button Click):
- After tapping the "Say Hi!" button, the message changes to:
![image](https://github.com/user-attachments/assets/08e99fc4-be7a-46ec-b2f9-29930dd960c7)
The user's name "Trần Thế Hảo" is styled in bold using a SpannableString.
### 🧠 Implementation Explanation (Code Breakdown)
#### 1. AndroidManifest.xml
![image](https://github.com/user-attachments/assets/3c7ed086-4836-4b37-889f-d84629e38f1a)
- Registers MainActivity as the launcher activity.
- Assigns the app theme and entry point for execution.
#### 2. MainActivity.kt
![image](https://github.com/user-attachments/assets/31b5a344-e0ce-44e4-8e51-960390d72d2d)
- Sets up a click listener for the "Say Hi!" button.
- On click, constructs a message with your name on a new line.
- Uses SpannableString to apply bold formatting to your name.
- Updates the TextView to display the stylized message.
#### 3. activity_main.xml
------------
![image](https://github.com/user-attachments/assets/d8d82e44-7021-422b-8717-74380ee437b4)
---------------
- Initially displays "Hello" as set in the strings.xml.
-------------
![image](https://github.com/user-attachments/assets/4a98af7c-5b6a-499e-9e7d-549810dec112)
--------------
- When clicked, triggers the logic in MainActivity.kt.
#### Summary:
- This exercise demonstrates:
- Basic layout using LinearLayout
- View binding in Kotlin (findViewById)
- Click event handling
- Dynamic text update using SpannableString
- Personalization by inserting and styling the developer’s name.
  
##  Assigment 2: 
![image](https://github.com/user-attachments/assets/4f6400a8-1628-40a8-a2c8-82803e43a187)
✅ Jetpack Compose app launch and operation process
When the user starts the application:
________________________________________
### 1. MainActivity is created
The app starts in MainActivity, which inherits from ComponentActivity – which is designed to work well with Jetpack Compose.
### 2. Jetpack Compose starts setting up the interface
In the onCreate() method, setContent {} is called. Here's the key point: instead of using the traditional XML layout (activity_main.xml), the entire UI is defined in Kotlin using @Composable functions.
________________________________________
### 3. Basic theme and background applied
•	JetpackComposeUIAppTheme { ... } is used to wrap the entire interface, applying the Material Design theme (including colors, fonts, shapes).
•	Surface { ... } is drawn first inside the theme, acting as a background with a consistent color taken from the MaterialTheme.
________________________________________
### 4. App navigation is set up
In the setContent {} body, the AppNavigation() function is called.
•	rememberNavController() creates a navigation controller.
•	NavHost(...) sets up the navigation graph, specifying the first screen as "welcome_screen".
•	Each screen is defined via composable("route_name") { ScreenComposable() }.
________________________________________
### 5. The WelcomeScreen is displayed.
Once NavHost is set up:
•	Compose will "compose" the first screen: WelcomeScreen().
•	In WelcomeScreen(), UI components like Text, Button, Image, etc. are constructed using @Composable functions.
•	Modifiers are applied to customize elements such as size, padding, color, position, etc.
________________________________________
### 6. Layout is arranged using Composable layouts
•	Column, Row, and Box are used to organize the layout of UI elements visually.
•	For example: Column is used to arrange components vertically, Row is used horizontally, Box is used to overlap components or position freely.
________________________________________
### 7. User interaction with UI
•	When the user clicks a button in WelcomeScreen, the onClick event is fired and calls: 
navController.navigate("components_list_screen").
•	NavHost immediately switches to the corresponding ComponentsListScreen() .
________________________________________
### 8. The list or detail screen is displayed next.
•	If ComponentsListScreen has a detailed navigation button, for example:
navController.navigate("components_detail_screen/Button")
then NavHost displays ComponentsDetailScreen, and passes the "Button" parameter to that screen.
________________________________________
### 9. The app continues to work smoothly with Compose
•	Whenever there is a change in state, Compose automatically recomposes – redrawing only the necessary parts without affecting the entire interface.
•	The entire user experience is guaranteed to be modern, smooth, and optimized.
________________________________________
### 🔧 About XML Layout (No longer used)
•	activity_main.xml is no longer used in this activity flow.
•	The interface is completely controlled by Jetpack Compose, so retaining or referencing traditional XML like ConstraintLayout is no longer necessary.
________________________________________
### 📦 Gradle and library dependencies
•	Libraries like androidx.navigation:navigation-compose, androidx.compose.material3,... have been declared in build.gradle, ensuring all Compose and navigation components work smoothly.
________________________________________
### 🧩 Conclusion
The entire UI is being built and managed in a modern way using Jetpack Compose , allowing you to build fast, scalable, maintainable interfaces that take advantage of the Material Design ecosystem and Compose navigation. No more relying on traditional XML – all the structure and interactions are in Kotlin.
## Assignment 4
![image](https://github.com/user-attachments/assets/b633542f-f9f5-478f-9748-1546748b60cd)
![image](https://github.com/user-attachments/assets/267fa60e-91da-4e7d-ba56-b3c6af391c82)
![image](https://github.com/user-attachments/assets/e441b4bf-2620-45d1-adcd-6a658d0a1865)
![image](https://github.com/user-attachments/assets/0638d522-2071-4461-8d8f-f4c6087169e6)
💡 You can combine nested layouts to create complex interfaces.
________________________________________
## ✅ CONCLUSION
•	Jetpack Compose provides modern UI components that help you code interfaces in pure Kotlin without XML.
•	Layouts like Column, Row, Box allow for flexible and clear layout organization.
•	The entire interface can be redesigned quickly – easy to control – easy to maintain .
Project Summary: Android Jetpack Compose UI Components Demo
### 1. Project Overview
This project is an Android application demonstrating basic UI components using Jetpack Compose — Google's modern declarative UI toolkit for Android development with Kotlin. It showcases common components like buttons, text fields, checkboxes, radio buttons, switches, sliders, and layout containers.
________________________________________
### 2. Technologies and Techniques Used
#### Programming Language
•	Kotlin : the primary language for modern Android development, supporting functional and object-oriented programming.
Frameworks and Libraries
•	Jetpack Compose : Android's modern UI toolkit for building native UI declaratively.
•	Material3 (Material You) : modern UI design system by Google with support for light/dark themes.
•	Android Gradle Plugin : build and dependency management system.
•	Kotlinx Coroutines (optional): for asynchronous programming if needed.
Techniques
•	State Management in Compose : using remember and mutableStateOf for UI state handling.
•	Theming : custom Material3 themes supporting day/night modes.
•	Declarative UI Paradigm : defining UI components as composable functions.
#### Demonstrated UI Components
•	Button
•	TextField
•	Checkbox
•	RadioButton
•	Switch
•	Slider
•	Layout containers: Row, Box
### 3. Project Structure
![image](https://github.com/user-attachments/assets/d35b76c5-917a-4d3e-944c-d12e632c4149)
•	MainActivity.kt: main Activity setting the Compose content.
•	themes.xml: theme and style definitions using Material3.
•	AndroidManifest.xml: app manifest declaring activity and metadata.
### 4. Setup and Run Instructions
#### Environment Requirements
•	Android Studio Flamingo or newer (supports Jetpack Compose)
•	JDK 17+
•	Gradle 8.0+
•	Kotlin 1.9.22 (or compatible with Compose version)
•	Android SDK API level 35 or higher (required by androidx.core:core-ktx 1.16.0+)
#### Steps to Run
##### 1.	Clone or download the project:
![image](https://github.com/user-attachments/assets/e64104a4-b7f6-4aa6-936b-428eb28debad)
##### 2.	Open the project in Android Studio:
•	Select Open and choose the gdnduxui folder.
##### 3.	Verify and update dependencies:
•	In build.gradle (app level), ensure:
o	compileSdk is 35 or 36+
o	Kotlin version is 1.9.22 or compatible with Compose
o	Compose dependencies are up to date, eg:
![image](https://github.com/user-attachments/assets/69b196d3-e94e-46a3-bf5c-d6f845eefd15)
##### 4.	Build and Run:
•	Choose an emulator or physical device with API level 35+.
•	Press Run to build and launch the app.
##### 5. License
![image](https://github.com/user-attachments/assets/8de48743-b076-4453-abb2-d0ab9a5a4ff1)
![image](https://github.com/user-attachments/assets/af56d527-c7c7-4b82-8960-2daffcd88f7d)

## 👤 Author: Trần Thế Hảo - University of Transport and Communications, HCMC (UTH)







