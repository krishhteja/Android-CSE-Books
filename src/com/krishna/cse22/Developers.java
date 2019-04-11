package com.krishna.cse22;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Developers extends Activity {
	String season[]  = {"BITS CSE", "BITS ME", "BITS CIV", "BITS EEE", "BITS ECE"} ;	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_developers);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.developers, menu);
		return true;
	}

}
