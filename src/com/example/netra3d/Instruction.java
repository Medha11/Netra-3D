package com.example.netra3d;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Instruction extends Activity {

	WebView Instruction;

	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instruction);
		Instruction = (WebView) findViewById(R.id.webViewinstruction);
		 Instruction.setWebViewClient(new WebViewClient());
		Instruction.getSettings().setJavaScriptEnabled(true);
		Instruction.loadUrl("file:///android_asset/instructions.html");	
	}



}
