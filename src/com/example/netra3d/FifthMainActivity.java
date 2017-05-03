package com.example.netra3d;


import java.io.File;

import android.app.Activity;
import android.content.Intent;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

public class FifthMainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String path ="/mnt/sdcard/netra3d/stage3_activity_eye8.blend";
		
		String path2="/mnt/extsd/netra3d/stage3_activity_eye8.blend";
		
		String path3=Environment.getExternalStorageDirectory()+"/netra3d/stage3_activity_eye8.blend";
		
		

		File file = new File(path);
		File file2=new File(path2);
		File file3=new File(path3);
		if(file.exists())
		{
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(Uri.fromFile(file), "application/blender");
		intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
		startActivity(intent);
		finish();
		}
		
		else if(file2.exists())
		{
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(Uri.fromFile(file2), "application/blender");
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
			startActivity(intent);
			finish();
		}

		else if(file3.exists())
		{
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(Uri.fromFile(file3), "application/blender");
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
			startActivity(intent);
			finish();
		}
	}

}