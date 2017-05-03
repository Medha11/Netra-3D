package com.example.netra3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.ImageButton;


public class Stage2 extends Activity {
	
	ImageButton button,buttonactivity;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.stage2);
		button = (ImageButton) findViewById(R.id.imageButton1);
		//JustifiedText jtv,jtv2;
		//jtv= new JustifiedText(getApplicationContext(), "Lorem ipsum dolor sit amet... ");
		//RelativeLayout place = (RelativeLayout) findViewById(R.id.rellay);
		//place.addView(jtv);
		
	 //jtv2= new JustifiedText(getApplicationContext(), "Lorem ipsum dolor sit amet... ");
		//RelativeLayout place2 = (RelativeLayout) findViewById(R.id.textView3);
		//place2.addView(jtv2);
        
		button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            	
            	Intent intent1 = new Intent(Stage2.this,ThirdMainActivity.class);
            	startActivity(intent1);
            	
            	
            }
        });
        
        buttonactivity = (ImageButton) findViewById(R.id.imageButton3);
        buttonactivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            	//Intent intent2 = new Intent(Stage2.this,Stage2activity.class);
            	//startActivity(intent2);
            }
        });

	}
}
