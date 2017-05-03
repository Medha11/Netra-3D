package com.example.netra3d;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

public class ThirdMainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        String path ="/mnt/sdcard/netra3d/eye_cut.mp4";
		
		String path2="/mnt/extsd/netra3d/eye_cut.mp4";
		String path3=Environment.getExternalStorageDirectory()+"netra3d/eye_cut.mp4";
		

		File file = new File(path);
		File file2=new File(path2);
		File file3=new File(path3);
		
if(file.exists())
{
		Intent intent = new Intent();
		intent.setAction(android.content.Intent.ACTION_VIEW);
		
		intent.setDataAndType(Uri.fromFile(file), "video/*");
		startActivity(intent); 
		finish();
		
}

else if(file2.exists())
{
	Intent intent = new Intent();
	intent.setAction(android.content.Intent.ACTION_VIEW);
	
	intent.setDataAndType(Uri.fromFile(file2), "video/*");
	startActivity(intent); 
	finish();
	
}


else if(file3.exists())
{
	Intent intent = new Intent();
	intent.setAction(android.content.Intent.ACTION_VIEW);
	
	intent.setDataAndType(Uri.fromFile(file3), "video/*");
	startActivity(intent); 
	finish();
	
}

	}

}