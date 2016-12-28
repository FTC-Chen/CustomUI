package com.exam.customui;

import android.app.Activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;

public class LoginActivity extends Activity {

	FrameLayout  loginBack,loginUser,loginPassward;
	EditText etUserName;
	EditText etPassword;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		initView();
	}

	
	private void initView() {
//		loginBack=(FrameLayout) findViewById(R.id.loginbackground1);
		loginUser=(FrameLayout) findViewById(R.id.loginuserlayout);
		loginPassward=(FrameLayout) findViewById(R.id.loginpasswardlayout);
		
		etUserName=(EditText) findViewById(R.id.loginuserEdit);
		etPassword=(EditText) findViewById(R.id.loginpasswardEdit);
	}
	
	public void loginIn(View view) {
		// TODO Auto-generated method stub
		//1.暂时先无网络请求
		
		Intent intent=new Intent(getApplicationContext(),MainActivity.class);
		startActivity(intent);
		finish();
	}
	

}
