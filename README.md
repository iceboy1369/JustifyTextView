# TextViewJustify

[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=16)
<img src="https://img.shields.io/badge/version-1.2-green.svg"/>
<img src="https://jitpack.io/v/iceboy1369/JustifyTextView.svg"/>
[![Android Arsenal]( https://img.shields.io/badge/Android%20Arsenal-TextViewJustify-green.svg?style=flat )]( https://android-arsenal.com/details/1/7437 )

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
	        implementation 'com.github.iceboy1369:JustifyTextView:1.2'
	}
	


Step 3. Add TextViewJustify in your xml files like this:

	<icegroup.textviewjustify.TextViewJustify
		android:id="@+id/txt_justify"
		android:layout_width="match_parent"
		android:layout_height="wrap_content"/>


Step 4. Then in your code use the 'true' after your text param to do justify that like below line:

	TextViewJustify txt_justify = findViewById (R.id.txt_justify);
	txt_justify.setText( "your text" , true );
