package com.example.netra3d;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends Activity {

	 ImageButton button,buttono,buttonp;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		overridePendingTransition(R.anim.fadein, R.anim.fadeout);
		setContentView(R.layout.activity_main);
		button = (ImageButton) findViewById(R.id.imageButton1);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	button.setBackgroundResource(R.drawable.structureofeyegrey2);
            	
            	Intent intent1 = new Intent(MainActivity.this,Stage1.class);
            	startActivity(intent1);
            	
            	
            }
        });
         buttono = (ImageButton) findViewById(R.id.imageButton2);
        buttono.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	buttono.setBackgroundResource(R.drawable.workingofeyegrey2);
            	Intent intent2 = new Intent(MainActivity.this,ThirdMainActivity.class);
            	startActivity(intent2);
            }
        });
         buttonp = (ImageButton) findViewById(R.id.imageButton3);
        buttonp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
            	buttonp.setBackgroundResource(R.drawable.adaptationgrey);
            	Intent intent3 = new Intent(MainActivity.this,Stage3.class);
            	startActivity(intent3);
            }
        });
	}

	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		button.setBackgroundResource(R.drawable.structureofeye2);
		buttono.setBackgroundResource(R.drawable.workingofeye2);
		buttonp.setBackgroundResource(R.drawable.adaptation);
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub

		MenuInflater menuInflater = getMenuInflater();
	    menuInflater.inflate(R.menu.menu, menu);
	    return true;
	}

	public boolean onOptionsItemSelected(MenuItem item)
	{

	    switch (item.getItemId())
	    {
	    case R.id.menu_Credits:
	        
	    	Intent intentcredits;
	         intentcredits = new Intent(MainActivity.this, credits.class);                        
	         startActivity(intentcredits); 
	         return true;
	    	/*AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    	//builder.setIcon(R.drawable.icon);
	    	builder.setTitle("Credits");
	    	builder.setMessage("Application developed by: \n - Shraddha Naik \n - Ritika Ray \n - Lavina Advani ")
	    	
	    	       .setCancelable(true)
	    	       .setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    	           public void onClick(DialogInterface dialog, int id) {
	    	        	
	    	           }
	    	       });
	    	AlertDialog alert = builder.create();   
	    	alert.show();
	        return true;*/

	    case R.id.menu_Instructions:
	    	 Intent intentinstruction;
	         intentinstruction = new Intent(MainActivity.this, Instruction.class);                        
	         startActivity(intentinstruction); 
	         return true;
	          
	    case R.id.menu_aboutus:
	    	 Intent intentaboutus;
	         intentaboutus = new Intent(MainActivity.this, aboutus.class);                        
	         startActivity(intentaboutus);  
	         return true;
	         
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}           
	    
	}
	

