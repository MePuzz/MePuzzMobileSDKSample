# MePuzzMobileSDKSample

1.  Add firebase to your project<br/>https://firebase.google.com/docs/android/setup\#add\_firebase\_to\_your\_app

2.  Add repo to root build.gradle<br/>maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }<br/>
allprojects {<br/>
&nbsp;&nbsp;repositories {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;google()<br/>
&nbsp;&nbsp;&nbsp;&nbsp;jcenter()<br/>
&nbsp;&nbsp;&nbsp;&nbsp;maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }<br/>
&nbsp;&nbsp;}<br/>
}<br/>

3.  Add dependent<br/>implementation 'com.mepuzz:mobilesdk:1.0.0'

4.  Init MePuzzService in activity<br/>
MePuzzService.init(<AppID>, context);<br/><br/>
public class MainActivity extends AppCompatActivity {<br/><br/>

&nbsp;&nbsp;@Override<br/>
&nbsp;&nbsp;protected void onCreate(Bundle savedInstanceState) {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;super.onCreate(savedInstanceState);<br/>
&nbsp;&nbsp;&nbsp;&nbsp;setContentView(R.layout.activity_main);<br/>
&nbsp;&nbsp;&nbsp;&nbsp;MePuzzService.init("BXQ9JLy4nE", this);<br/>
&nbsp;&nbsp;&nbsp;&nbsp;}<br/>
&nbsp;&nbsp;}<br/>

