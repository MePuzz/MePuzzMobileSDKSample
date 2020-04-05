# MePuzzMobileSDKSample
MePuzzMobileSDKSample

1. Add firebase to your project
https://firebase.google.com/docs/android/setup#add_firebase_to_your_app

2. Add repo to root build.gradle
 maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }
 
 allprojects {
    repositories {
        google()
        jcenter()
        maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }
    }
}

3. Add dependent
implementation 'com.mepuzz:mobilesdk:1.0.0'
