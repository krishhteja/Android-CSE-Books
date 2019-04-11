package com.krishna.cse22;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.annotation.SuppressLint;
import android.app.ListActivity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Unitc extends ListActivity {

	String season[]  = {"unit 1-2", "unit 2-1", "unit 3-1", "unit 4-1", "unit 4-1", "unit 5-1"} ;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_unitf);
		File direct = new File(Environment.getExternalStorageDirectory() + "/android/data/kris");

		if(!direct.exists())
		{
			if(direct.mkdir()) 
			{
				//directory is created;
			}
		}
		setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,season));

	}     


	@SuppressLint("SdCardPath")
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);

		if(position == 0){
			@SuppressLint("SdCardPath")
			// TODO Auto-generated method stub

			File file = new File("/sdcard/android/data/kris/c12.pdf");
			try{
				InputStream is = getResources().openRawResource(R.raw.c12);
				OutputStream os = new FileOutputStream(file);
				byte[] data = new byte[is.available()];
				is.read(data);
				os.write(data);
				is.close();
				os.close();

			}
			catch(IOException e){
				Toast.makeText(Unitc.this,"no pdf found",Toast.LENGTH_LONG).show();

			}
			File pdf = new File("/sdcard/android/data/kris/c12.pdf");
			if (pdf.exists()){
				Uri path1 = Uri.fromFile(pdf);
				Intent pdfintent = new Intent(Intent.ACTION_VIEW);
				pdfintent.setDataAndType(path1,"application/pdf");
				pdfintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

				try{
					startActivity(pdfintent);
				}
				catch(ActivityNotFoundException e){
					Toast.makeText(Unitc.this,"no application to view the pdf",Toast.LENGTH_LONG).show();
				}
			}
			else{
				startActivity(new Intent("android.intent.action.ONE"));
			}

		}

		if(position == 1){
			@SuppressLint("SdCardPath")
			// TODO Auto-generated method stub

			File file1 = new File("/sdcard/android/data/kris/c21.pdf");
			try{
				InputStream is = getResources().openRawResource(R.raw.c21);
				OutputStream os = new FileOutputStream(file1);
				byte[] data = new byte[is.available()];
				is.read(data);
				os.write(data);
				is.close();
				os.close();

			}
			catch(IOException e){
				Toast.makeText(Unitc.this,"no pdf found",Toast.LENGTH_LONG).show();

			}
			File pdf1 = new File("/sdcard/android/data/kris/c21.pdf");
			if (pdf1.exists()){
				Uri path1 = Uri.fromFile(pdf1);
				Intent pdfintent = new Intent(Intent.ACTION_VIEW);
				pdfintent.setDataAndType(path1,"application/pdf");
				pdfintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

				try{
					startActivity(pdfintent);
				}
				catch(ActivityNotFoundException e){
					Toast.makeText(Unitc.this,"no application to view the pdf",Toast.LENGTH_LONG).show();
				}
			}
			else{
				startActivity(new Intent("android.intent.action.ONE"));
			}
		}					
		if(position == 2){
			@SuppressLint("SdCardPath")
			// TODO Auto-generated method stub

			File file11 = new File("/sdcard/android/data/kris/c31.pdf");
			try{
				InputStream is = getResources().openRawResource(R.raw.c31);
				OutputStream os = new FileOutputStream(file11);
				byte[] data = new byte[is.available()];
				is.read(data);
				os.write(data);
				is.close();
				os.close();

			}
			catch(IOException e){
				Toast.makeText(Unitc.this,"no pdf found",Toast.LENGTH_LONG).show();

			}
			File pdf11 = new File("/sdcard/android/data/kris/c31.pdf");
			if (pdf11.exists()){
				Uri path1 = Uri.fromFile(pdf11);
				Intent pdfintent = new Intent(Intent.ACTION_VIEW);
				pdfintent.setDataAndType(path1,"application/pdf");
				pdfintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

				try{
					startActivity(pdfintent);
				}
				catch(ActivityNotFoundException e){
					Toast.makeText(Unitc.this,"no application to view the pdf",Toast.LENGTH_LONG).show();
				}
			}
			else{
				startActivity(new Intent("android.intent.action.ONE"));
			}
		}
		if(position == 3){
			@SuppressLint("SdCardPath")
			// TODO Auto-generated method stub

			File file2 = new File("/sdcard/android/data/kris/c41.pdf");
			try{
				InputStream is = getResources().openRawResource(R.raw.c41);
				OutputStream os = new FileOutputStream(file2);
				byte[] data = new byte[is.available()];
				is.read(data);
				os.write(data);
				is.close();
				os.close();

			}
			catch(IOException e){
				Toast.makeText(Unitc.this,"no pdf found",Toast.LENGTH_LONG).show();

			}
			File pdf111 = new File("/sdcard/android/data/kris/c41.pdf");
			if (pdf111.exists()){
				Uri path1 = Uri.fromFile(pdf111);
				Intent pdfintent = new Intent(Intent.ACTION_VIEW);
				pdfintent.setDataAndType(path1,"application/pdf");
				pdfintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

				try{
					startActivity(pdfintent);
				}
				catch(ActivityNotFoundException e){
					Toast.makeText(Unitc.this,"no application to view the pdf",Toast.LENGTH_LONG).show();
				}
			}
			else{
				startActivity(new Intent("android.intent.action.ONE"));
			}
		}

		if(position == 4){
			@SuppressLint("SdCardPath")
			// TODO Auto-generated method stub

			File file3 = new File("/sdcard/android/data/kris/c51.pdf");
			try{
				InputStream is = getResources().openRawResource(R.raw.c51);
				OutputStream os = new FileOutputStream(file3);
				byte[] data = new byte[is.available()];
				is.read(data);
				os.write(data);
				is.close();
				os.close();

			}
			catch(IOException e){
				Toast.makeText(Unitc.this,"no pdf found",Toast.LENGTH_LONG).show();

			}
			File pdf2 = new File("/sdcard/android/data/kris/c51.pdf");
			if (pdf2.exists()){
				Uri path1 = Uri.fromFile(pdf2);
				Intent pdfintent = new Intent(Intent.ACTION_VIEW);
				pdfintent.setDataAndType(path1,"application/pdf");
				pdfintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

				try{
					startActivity(pdfintent);
				}
				catch(ActivityNotFoundException e){
					Toast.makeText(Unitc.this,"no application to view the pdf",Toast.LENGTH_LONG).show();
				}
			}
			else{
				startActivity(new Intent("android.intent.action.ONE"));
			}
		}
		if(position == 5){
			@SuppressLint("SdCardPath")
			// TODO Auto-generated method stub

			File file21 = new File("/sdcard/android/data/kris/c51.pdf");
			try{
				InputStream is = getResources().openRawResource(R.raw.c51);
				OutputStream os = new FileOutputStream(file21);
				byte[] data = new byte[is.available()];
				is.read(data);
				os.write(data);
				is.close();
				os.close();

			}
			catch(IOException e){
				Toast.makeText(Unitc.this,"no pdf found",Toast.LENGTH_LONG).show();

			}
			File pdf21 = new File("/sdcard/android/data/kris/c51.pdf");
			if (pdf21.exists()){
				Uri path1 = Uri.fromFile(pdf21);
				Intent pdfintent = new Intent(Intent.ACTION_VIEW);
				pdfintent.setDataAndType(path1,"application/pdf");
				pdfintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

				try{
					startActivity(pdfintent);
				}
				catch(ActivityNotFoundException e){
					Toast.makeText(Unitc.this,"no application to view the pdf",Toast.LENGTH_LONG).show();
				}
			}
			else{
				startActivity(new Intent("android.intent.action.ONE"));
			}
		}																	

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
		getMenuInflater().inflate(R.menu.unitc, menu);
		return true;
	}

}
