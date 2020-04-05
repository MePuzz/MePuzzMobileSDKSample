# MePuzzMobileSDKSample

1.  Add firebase to your project<br/>https://firebase.google.com/docs/android/setup\#add\_firebase\_to\_your\_app

2.  Add repo to root build.gradle<br/>maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }
<p>
allprojects {<br/>
&nbsp;&nbsp;repositories {<br/>
&nbsp;&nbsp;&nbsp;&nbsp;google()<br/>
&nbsp;&nbsp;&nbsp;&nbsp;jcenter()<br/>
&nbsp;&nbsp;&nbsp;&nbsp;maven { url 'https://dl.bintray.com/mepuzz88/mepuzz/' }<br/>
&nbsp;&nbsp;}<br/>
}<br/></p>

1.  Add dependent<br/>implementation 'com.mepuzz:mobilesdk:1.0.0'

