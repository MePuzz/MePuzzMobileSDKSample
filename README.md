# MePuzzMobileSDKSample
### 1. Add Firebase to your project
[Install firebase to your project](https://firebase.google.com/docs/android/setup\#add\_firebase\_to\_your\_app)

### 2. Add dependency
Add repository to root build.gradle
```Groovy
allprojects {
    repositories {
        ......
        maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }
    }
}
```
Add dependency in app build.gradle
```groovy
dependencies {
    ....
    implementation 'com.mepuzz:mobilesdk:1.0.3'
}
```
### 3. Init MepuzzService
Open your main Activity
```java
import com.mepuzz.mobilesdk.MePuzzService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String appId = "YOUR_APP_ID";
        MePuzzService.init(appId, this);
    }
}
```

### 4. Send event
```java
MePuzzService.sendEventToServer("Your event name", context);
```
