package com.example.netra3d;

import android.app.Activity;
import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;




import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InstructionBegin extends Activity {
	
	protected boolean _active = true;
	protected int _splashTime = 5000; 


	WebView instructionbegin;
	ImageButton buttoninstructionbegin;


	
	@SuppressLint("SetJavaScriptEnabled")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.instructionbegin);
		instructionbegin = (WebView) findViewById(R.id.webViewinstructionbegin);
		instructionbegin.setWebViewClient(new WebViewClient());
   		//instructionbegin.getSettings().setJavaScriptEnabled(true);
   		instructionbegin.loadUrl("file:///android_asset/disclaimer.html");
   		
   		Handler handler = new Handler();

   	    // run a thread after 3 seconds to start the home screen
   	    handler.postDelayed(new Runnable() {

   		public void run()
   		{
   			finish();


   	startActivity(new Intent (InstructionBegin.this,MainActivity.class));

   	finish();

   	}
   	},6000);
   		}
   	}

				


   		
   	
   		
		
		
	

/*public class InstructionBegin extends Activity {
	
	Button buttoninstructionbegin;
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		   ActionBar bar = getActionBar();
			  bar.hide();
			  
		
		setContentView(R.layout.instructionbegin);
	
	buttoninstructionbegin = (Button) findViewById(R.id.buttoninstructionBegin);
    buttoninstructionbegin.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            // Perform action on click
        	
        	Intent intentinstructionBegin = new Intent(InstructionBegin.this,MainActivity.class);
        	startActivity(intentinstructionBegin);
        	finish();
        	
        }
    });

	}
}*/

