package com.example.netra3d;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class credits extends Activity {

	WebView credits;

	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.credits);
		credits = (WebView) findViewById(R.id.webViewcredits);
		 credits.setWebViewClient(new WebViewClient());
		credits.getSettings().setJavaScriptEnabled(true);
		credits.loadUrl("file:///android_asset/credits.html");	
	}



}
