package com.krishna.cse22;

import java.io.File;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Notes extends ListActivity {
	String Season[] = {"FLAT", "OS", "DAA", "P & S", "CO"} ;
	int a[];
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
      	
      	if(position == 0){
  			startActivity(new Intent("android.intent.action.UNITF"));
      	}
      	if(position == 1){
  			startActivity(new Intent("android.intent.action.UNITO"));
      	}
      	if(position == 2){
  			startActivity(new Intent("android.intent.action.UNITD"));
      	}
      	if(position == 3){
  			startActivity(new Intent("android.intent.action.UNITP"));
      	}
      	if(position == 4){
  			startActivity(new Intent("android.intent.action.UNITC"));
      	}
	}
      	protected void onCreate(Bundle savedInstanceState) {
    		// TODO Auto-generated method stub
    		super.onCreate(savedInstanceState);
            setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Season));
    		
    	}
	
      	public void onBackPressed() {
    	    // TODO Auto-generated method stub
    	    super.onBackPressed();
    		File direct = new File(Environment.getExternalStorageDirectory() + "/android/data/kris");
    	    deleteDirectory(direct);
    	}
    	public static boolean deleteDirectory(File path) {
            if( path.exists() ) {
              File[] files = path.listFiles();
              if (files == null) {
                  return true;
              }
              for(int i=0; i<files.length; i++) {
                 if(files[i].isDirectory()) {
                   deleteDirectory(files[i]);
                 }
                 else {
                   files[i].delete();
                 }
              }
            }
            return( path.delete() );
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.notes, menu);
		return true;
	}

}
