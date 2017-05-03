package com.example.netra3d;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class splash2 extends Activity {
protected boolean _active = true;
protected int _splashTime = 4000; // time to display the splash screen in ms



@Override
public void onCreate(Bundle savedInstanceState) {

	//this.requestWindowFeature(Window.FEATURE_NO_TITLE);
	
	super.onCreate(savedInstanceState);
    
  
 
    setContentView(R.layout.splashscreen2);


    Thread splashTread = new Thread() {
        @Override
        public void run() {
            try {
                int waited = 0;
                while (_active && (waited < _splashTime)) {
                    sleep(100);
                    if (_active) {
                        waited += 100;
                    }
                }
            } catch (Exception e) {

            } finally {

                startActivity(new Intent(splash2.this,
                        InstructionBegin.class));
                finish();
             
            }
        };
             };
    splashTread.start();
   
}
 }