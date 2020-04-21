# MePuzzMobileSDKSample
### Firebase
[Instal firebase to your project](https://firebase.google.com/docs/android/setup\#add\_firebase\_to\_your\_app)

### Maven
Add repo to root

```bash
maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }
allprojects {
  repositories {
    google()
    jcenter()
    maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }
  }
}
```
## Usage
**Import**

```bash
implementation 'com.mepuzz:mobilesdk:1.0.3
```
**Initialization**

```bash
MePuzzService.init(AppID, context);

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    MePuzzService.init("BXQ9JLy4nE", this);
    }
  }
```
**Event tracking**
```bash
MePuzzService.sendEventToServer("Event name", this);
```

