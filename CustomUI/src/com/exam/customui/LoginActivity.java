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
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
