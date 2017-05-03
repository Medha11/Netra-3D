package com.example.netra3d;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;

public class InstructionForActivity3 extends Activity {
ImageButton button;
	
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.instructionactivity3);
		button = (ImageButton) findViewById(R.id.imageButton1);
		
        
		button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	
            	
            	Intent intentrun = new Intent(InstructionForActivity3.this,FifthMainActivity.class);
            	startActivity(intentrun);
            	finish();
            	
            	
            }
        });
 }
}