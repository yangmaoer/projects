package com.jinlei.calc;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class CalcActivity extends Activity {
	
	Button btnEqual = null;
	TextView tvAdd;
	EditText edtFactor1;
	EditText edtFactor2;
	String strFactor1;
	String strFactor2;
	int intResult;
	String strResult;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        btnEqual = (Button)findViewById(R.id.btnEqual);
		tvAdd = (TextView)findViewById(R.id.tvAdd);
		edtFactor1 = (EditText)findViewById(R.id.edtFactor1);
		edtFactor2 = (EditText)findViewById(R.id.edtFactor2);
		edtFactor1.setText("0");
		edtFactor2.setText("0");
		
		btnEqual.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				strFactor1 = edtFactor1.getText().toString();
				strFactor2 = edtFactor2.getText().toString();
				intResult = Integer.parseInt(strFactor1) + Integer.parseInt(strFactor2);
				strResult = Integer.toString(intResult);
				btnEqual.setText(strResult);
				Toast.makeText(CalcActivity.this, strResult, Toast.LENGTH_SHORT).show();
	
				
			}
		});
		
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.calc, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
