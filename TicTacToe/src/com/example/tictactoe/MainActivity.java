package com.example.tictactoe;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
	int turn;
	int count=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		b1=(Button)findViewById(R.id.b1);
		b2=(Button)findViewById(R.id.b2);
		b3=(Button)findViewById(R.id.b3);
		b4=(Button)findViewById(R.id.b4);
		b5=(Button)findViewById(R.id.b5);
		b6=(Button)findViewById(R.id.b6);
		b7=(Button)findViewById(R.id.b7);
		b8=(Button)findViewById(R.id.b8);
		b9=(Button)findViewById(R.id.b9);
		turn=1;
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b1.getText().toString().equals(""))
				{
					if(turn==1)
					{
						b1.setText("X");
						b1.setTextColor(Color.parseColor("#f4d941"));
						//b1.setBackgroundColor(Color.parseColor("#41f1f4"));
						turn=2;
					}
					else if(turn==2)
					{
						b1.setText("O");
						b1.setTextColor(Color.parseColor("#f44192"));
						//b1.setBackgroundColor(Color.parseColor("#f4af41"));
						turn=1;
					}
					count++;
				}
				endgame();

				
			}
		});
	b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if(b2.getText().toString().equals(""))
				{
					if(turn==1)
					{
						b2.setTextColor(Color.parseColor("#f4d941"));
						b2.setText("X");
						//b2.setBackgroundColor(Color.parseColor("#41f1f4"));
						turn=2;
					}
					else if(turn==2)
					{
						b2.setTextColor(Color.parseColor("#f44192"));
						//b2.setBackgroundColor(Color.parseColor("#f4af41"));
						b2.setText("O");
						turn=1;
					}
					count++;
				}
				endgame();

				
			}
		});
	b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(b3.getText().toString().equals(""))
			{
				if(turn==1)
				{
					b3.setTextColor(Color.parseColor("#f4d941"));
					//b3.setBackgroundColor(Color.parseColor("#41f1f4"));
					b3.setText("X");
					turn=2;
				}
				else if(turn==2)
				{
					b3.setTextColor(Color.parseColor("#f44192"));
					//b3.setBackgroundColor(Color.parseColor("#f4af41"));
					b3.setText("O");
					turn=1;
				}
				count++;
			}
			endgame();

			
		}
	});
	b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(b4.getText().toString().equals(""))
			{
				if(turn==1)
				{
					b4.setTextColor(Color.parseColor("#f4d941"));
					//b4.setBackgroundColor(Color.parseColor("#41f1f4"));
					b4.setText("X");
					turn=2;
				}
				else if(turn==2)
				{
					b4.setTextColor(Color.parseColor("#f44192"));
					//b4.setBackgroundColor(Color.parseColor("#f4af41"));
					b4.setText("O");
					turn=1;
				}
				count++;
			}
			endgame();

			
		}
	});
	b5.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(b5.getText().toString().equals(""))
			{
				if(turn==1)
				{
					b5.setTextColor(Color.parseColor("#f4d941"));
					//b5.setBackgroundColor(Color.parseColor("#41f1f4"));
					b5.setText("X");
					turn=2;
				}
				else if(turn==2)
				{
					b5.setTextColor(Color.parseColor("#f44192"));
					//b5.setBackgroundColor(Color.parseColor("#f4af41"));
					b5.setText("O");
					turn=1;
				}
				count++;
			}
			endgame();

			
		}
	});
	b6.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(b6.getText().toString().equals(""))
			{
				if(turn==1)
				{
					b6.setTextColor(Color.parseColor("#f4d941"));
					//b6.setBackgroundColor(Color.parseColor("#41f1f4"));
					b6.setText("X");
					turn=2;
				}
				else if(turn==2)
				{
					b6.setTextColor(Color.parseColor("#f44192"));
					//b6.setBackgroundColor(Color.parseColor("#f4af41"));
					b6.setText("O");
					turn=1;
				}
				count++;
			}
			endgame();

			
		}
	});
	b7.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(b7.getText().toString().equals(""))
			{
				if(turn==1)
				{
					b7.setTextColor(Color.parseColor("#f4d941"));
					//b7.setBackgroundColor(Color.parseColor("#41f1f4"));
					b7.setText("X");
					turn=2;
				}
				else if(turn==2)
				{
					b7.setTextColor(Color.parseColor("#f44192"));
					//b7.setBackgroundColor(Color.parseColor("#f4af41"));
					b7.setText("O");
					turn=1;
				}
				count++;
			}
			endgame();

			
		}
	});
	b8.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(b8.getText().toString().equals(""))
			{
				if(turn==1)
				{
					b8.setTextColor(Color.parseColor("#f4d941"));
					//b8.setBackgroundColor(Color.parseColor("#41f1f4"));
					b8.setText("X");
					turn=2;
				}
				else if(turn==2)
				{
					b8.setTextColor(Color.parseColor("#f44192"));
					//b8.setBackgroundColor(Color.parseColor("#f4af41"));
					b8.setText("O");
					turn=1;
				}
				count++;
			}
			endgame();

			
		}
	});
	b9.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			if(b9.getText().toString().equals(""))
			{
				if(turn==1)
				{
					b9.setTextColor(Color.parseColor("#f4d941"));
					//b9.setBackgroundColor(Color.parseColor("#41f1f4"));
					b9.setText("X");
					turn=2;
				}
				else if(turn==2)
				{
					b9.setTextColor(Color.parseColor("#f44192"));
					//b9.setBackgroundColor(Color.parseColor("#f4af41"));
					b9.setText("O");
					turn=1;
				}
				count++;
			}
			endgame();
			
		}
	});
	
	}
	protected void endgame() {
		String a=b1.getText().toString();
		String b=b2.getText().toString();
		String c=b3.getText().toString();
		String d=b4.getText().toString();
		String e=b5.getText().toString();
		String f=b6.getText().toString();
		String g=b7.getText().toString();
		String h=b8.getText().toString();
		String i=b9.getText().toString();
		boolean end=false;
		
		if(a.equals(b) && b.equals(c) && a.equals("X") && b.equals("X") && c.equals("X"))
		{
			 Toast.makeText(getApplicationContext(),"Player X Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(d.equals(e) && e.equals(f) && d.equals("X") && e.equals("X") && f.equals("X"))
		{
			 Toast.makeText(getApplicationContext(),"Player X Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(g.equals(h) && h.equals(i) && g.equals("X") && h.equals("X") && i.equals("X"))
		{
			 Toast.makeText(getApplicationContext(),"Player X Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(a.equals(d) && d.equals(g) && a.equals("X") && d.equals("X") && g.equals("X"))
		{
			 Toast.makeText(getApplicationContext(),"Player X Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(b.equals(e) && e.equals(h) && b.equals("X") && e.equals("X") && h.equals("X"))
		{
			 Toast.makeText(getApplicationContext(),"Player X Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(c.equals(f) && f.equals(i) && c.equals("X") && f.equals("X") && i.equals("X"))
		{
			 Toast.makeText(getApplicationContext(),"Player X Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(a.equals(e) && e.equals(i) && a.equals("X") && e.equals("X") && i.equals("X"))
		{
			 Toast.makeText(getApplicationContext(),"Player X Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(c.equals(e) && e.equals(g) && c.equals("X") && e.equals("X") && g.equals("X"))
		{
			 Toast.makeText(getApplicationContext(),"Player X Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		
		if(a.equals(b) && b.equals(c) && a.equals("O") && b.equals("O") && c.equals("O"))
		{
			 Toast.makeText(getApplicationContext(),"Player O Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(d.equals(e) && e.equals(f) && d.equals("O") && e.equals("O") && f.equals("O"))
		{
			 Toast.makeText(getApplicationContext(),"Player O Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(g.equals(h) && h.equals(i) && g.equals("O") && h.equals("O") && i.equals("O"))
		{
			 Toast.makeText(getApplicationContext(),"Player O Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(a.equals(d) && d.equals(g) && a.equals("O") && d.equals("O") && g.equals("O"))
		{
			 Toast.makeText(getApplicationContext(),"Player O Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(b.equals(e) && e.equals(h) && b.equals("O") && e.equals("O") && h.equals("O"))
		{
			 Toast.makeText(getApplicationContext(),"Player O Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(c.equals(f) && f.equals(i) && c.equals("O") && f.equals("O") && i.equals("O"))
		{
			 Toast.makeText(getApplicationContext(),"Player O Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(a.equals(e) && e.equals(i) && a.equals("O") && e.equals("O") && i.equals("O"))
		{
			 Toast.makeText(getApplicationContext(),"Player O Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(c.equals(e) && e.equals(g) && c.equals("O") && e.equals("O") && g.equals("O"))
		{
			 Toast.makeText(getApplicationContext(),"Player O Wins",Toast.LENGTH_LONG).show();
			 end=true;
		}
		if(end)
		{
		Intent ig = new Intent(this,MainActivity.class);
		startActivity(ig);
		}
		if(count==9 && end==false)
		{
			Intent ig = new Intent(this,MainActivity.class);
			startActivity(ig);
			Toast.makeText(getApplicationContext(), "Match draw",Toast.LENGTH_LONG).show();
		}
		
	}



}
