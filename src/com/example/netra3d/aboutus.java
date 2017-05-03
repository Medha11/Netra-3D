package com.example.netra3d;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aboutus extends Activity {

	WebView aboutus;

	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutus);
		aboutus = (WebView) findViewById(R.id.webViewaboutus);
		 aboutus.setWebViewClient(new WebViewClient());
		aboutus.getSettings().setJavaScriptEnabled(true);
		aboutus.loadUrl("file:///android_asset/aboutus.html");	
		
	}



}
