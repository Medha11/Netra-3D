package com.example.netra3d;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Stage3 extends Activity {
	
	ImageButton button,buttonactivity;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.stage3);
		button = (ImageButton) findViewById(R.id.imageButton1);
	
        
		button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            	
            	Intent intent1 = new Intent(Stage3.this,instructionforstage3.class);
            	startActivity(intent1);
            	finish();
            	
            	
            }
        });
        
        buttonactivity = (ImageButton) findViewById(R.id.imageButton3);
        buttonactivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            	Intent intent2 = new Intent(Stage3.this,InstructionForActivity3.class);
            	startActivity(intent2);
            }
        });

	}
}
