package com.example.netra3d;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;

public class Stage1activity  extends Activity {
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        String path ="/mnt/sdcard/netra3d/activity2.blend";
		
		String path2="/mnt/extsd/netra3d/activity2.blend";
		String path3=Environment.getExternalStorageDirectory()+"netra3d/activity2.blend";
		

		File file4 = new File(path);
		File file5=new File(path2);
		File file6=new File(path3);
		if(file4.exists())
		{
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setDataAndType(Uri.fromFile(file4), "application/blender");
		intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
		startActivity(intent);
		finish();
		}
		
		else if(file5.exists())
		{
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(Uri.fromFile(file5), "application/blender");
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
			startActivity(intent);
			finish();
		}

		else if(file6.exists())
		{
			Intent intent = new Intent(Intent.ACTION_VIEW);
			intent.setDataAndType(Uri.fromFile(file6), "application/blender");
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
			startActivity(intent);
			finish();
		}
	}

		
		

	}

