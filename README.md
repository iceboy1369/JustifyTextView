# TextViewJustify

This is a custom library for android that can justify your textView... Amazing!

in the below you can see the screenshot


<img src="https://user-images.githubusercontent.com/27196670/50384099-11538e00-06d5-11e9-8f19-122eae0cd7a7.png" width="400" height="700">

Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.iceboy1369:JustifyTextView:1.0'
	}
	


Step 3. Add TextViewJustify in your xml files like this:

	<icegroup.textviewjustify.TextViewJustify
		android:id="@+id/txt_justify"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"/>


Step 4. Then in your code use the 'true' after your text param to do justify that like below line:

	TextViewJustify txt_justify = findViewById (R.id.txt_justify);
	txt_justify.setText( "your text" , true );
