package com.Hossein.Photo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import com.Hossein.Photo.R;


public class MainActivity extends Activity {


	private GridView mPhoto;


	private PhotoAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mPhoto = (GridView) findViewById(R.id.photo);
		adapter = new PhotoAdapter(this, 0, Images.imageUrl, mPhoto);
		mPhoto.setAdapter(adapter);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		adapter.cancelAllTasks();
	}

}
