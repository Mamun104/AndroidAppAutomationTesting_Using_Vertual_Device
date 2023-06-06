# Android App Automation Testing Using Virtual Device

## Technology and Tool Used

- java
- Android Studio
- Appium
- Appium Inspector
- Vysor or NOX
- emulator-5554

## Prerequisites

- java
- Android Studio
- Appium
- Appium Inspector
- Vysor or NOX
- Debug APK

## Prerequisite To use APPIUM

- Java JDK Download, install, set JAVA_HOME and path in environment’s system variable.
- Appium Download & install.
- Android Studio Download, install, set ANDROID_HOME and path in environment’s system variable.
- Android Studio SDK Manager Setup
- Android Studio AVD(Android Virtual Devices) Manager Setup / Emulator
- Physical Device setup
- Eclipse or any other IDE download and install
- RUN!

## Install and configure Appium

- If you do not have installed appium, then [download](https://github.com/appium/appium-desktop/releases/tag/v1.20.2) it from here. If you are a windows user, download the .exe software
- After downloading, install it. Keep the all default configuration.
- Now start the Appium


![image](https://github.com/Mamun104/AndroidAppAutomationTesting_Using_Vertual_Device/assets/78067017/f34eb698-ded0-4332-8aba-e34c2b40471d)

- After starting the service, you will see this

![image](https://github.com/Mamun104/AndroidAppAutomationTesting_Using_Vertual_Device/assets/78067017/05486c08-d2eb-487c-9190-e5d0ec71aa0c)

## Run the mobile device

- Open the Android Stdio
- If you don't have virtual device then create a virtual device from the android stdio
- After create a virtual device then run the device
- Now start CMD with administrator privilege
- Hit following command:

        adb devices

- You will get the UUID number if device connected properly

![Screenshot 2023-06-06 at 5 32 29 PM (2)](https://github.com/Mamun104/AndroidAppAutomationTesting_Using_Vertual_Device/assets/78067017/d16795b3-76c9-4969-9af5-60379a144ac1)

- Now go to your Appium
- Click on the search icon

![image](https://github.com/Mamun104/AndroidAppAutomationTesting_Using_Vertual_Device/assets/78067017/3a2157eb-9771-4289-9fdc-1b89f8e71907)

- Input following texts as desired capabilities on the text boxes

![Screenshot 2023-06-06 at 5 43 20 PM](https://github.com/Mamun104/AndroidAppAutomationTesting_Using_Vertual_Device/assets/78067017/b8227922-583b-44fa-95cc-9862a919fe04)

- Notice that we have already our appPackage and appActivity previously
- On the right side, you will see a JSON body has been implemented automatically
- Now save as the configuration named as “name”

![image](https://github.com/Mamun104/AndroidAppAutomationTesting_Using_Vertual_Device/assets/78067017/571889b9-1673-4281-8f0e-8536624813ab)

- You will find the saved configuration on “Saved Capability Sets”
- Now Click on Start Session button
- Now you can see the calculator app has been launched and showing on your Appium

##  HOW TO RUN THIS PROJECT

- clone the project

- Start the appium server

- Connect mobile device with USB

- Set the debug mode on from mobile device

- Allow connection from phone

- Make sure the phone is unlocked

- Open build.gradle as project by intellIJ

-  give this command:

            gradle clean test
            

## Output

![a2](https://github.com/Mamun104/Android_AppAutomationTesting/assets/78067017/4eb5d330-36bb-4327-a97b-9d1e75527942)
![allure](https://github.com/Mamun104/Android_AppAutomationTesting/assets/78067017/3d508120-31a3-4f25-831e-454508c839ae)

