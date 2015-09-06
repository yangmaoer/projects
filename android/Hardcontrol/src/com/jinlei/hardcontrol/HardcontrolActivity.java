package com.jinlei.hardcontrol;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class HardcontrolActivity extends Activity {
	// �����ؼ�����
	Button btnControl = null;
	RadioGroup rdoGupLed = null;
	RadioButton rdoLed0 = null;
	RadioButton rdoLed1 = null;
	RadioButton rdoLed2 = null;
	RadioButton rdoLed3 = null;
	CheckBox chkLed0 = null;
	CheckBox chkLed1 = null;
	CheckBox chkLed2 = null;
	CheckBox chkLed3 = null;

	

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardcontrol);
   //ͨ���ؼ�ID��ÿؼ�����
        btnControl = (Button)findViewById(R.id.btnControl);
        rdoGupLed = (RadioGroup)findViewById(R.id.rdoGupLed);
        rdoLed0 = (RadioButton)findViewById(R.id.rdoLed0);
        rdoLed1 = (RadioButton)findViewById(R.id.rdoLed1);
        rdoLed2 = (RadioButton)findViewById(R.id.rdoLed2);
        rdoLed3 = (RadioButton)findViewById(R.id.rdoLed3);

  
        chkLed0 = (CheckBox)findViewById(R.id.chkLed0);
        chkLed1 = (CheckBox)findViewById(R.id.chkLed1);
        chkLed2 = (CheckBox)findViewById(R.id.chkLed2);
        chkLed3 = (CheckBox)findViewById(R.id.chkLed3);
        
      
        
        
     //����btnControl������
        btnControl.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
			}
		});
       //����rdoGupLed������
        rdoGupLed.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
			
			/* (non-Javadoc)
			 * @see android.widget.RadioGroup.OnCheckedChangeListener#onCheckedChanged(android.widget.RadioGroup, int)
			 */
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
//				Toast.makeText(HardcontrolActivity.this,Integer.valueOf(checkedId).toString() , Toast.LENGTH_SHORT).show();
	
			if(checkedId == rdoLed0.getId())
			{
				Toast.makeText(HardcontrolActivity.this, "rdoLed0 chedked", Toast.LENGTH_SHORT).show();
			}
			else if(checkedId == rdoLed1.getId())
			{
				Toast.makeText(HardcontrolActivity.this, "rdoLed1 chedked", Toast.LENGTH_SHORT).show();
			}
			else if(checkedId == rdoLed2.getId())
			{
				Toast.makeText(HardcontrolActivity.this, "rdoLed3 chedked", Toast.LENGTH_SHORT).show();
			}
			else if(checkedId == rdoLed3.getId())
			{
				Toast.makeText(HardcontrolActivity.this, "rdoLed4 chedked", Toast.LENGTH_SHORT).show();
			}
		
			
			}
		});
        //����chkLed0������
        chkLed0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				  Led.ledOpen();
				if(isChecked)
				{
					Led.ledControl(0, 1);
					Toast.makeText(HardcontrolActivity.this, "chkLed0 chedked", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Led.ledControl(0, 0);
					Toast.makeText(HardcontrolActivity.this, "chkLed0 unchedked", Toast.LENGTH_SHORT).show();
				}
				Led.ledClose();
			}
		});
        
        //����chkLed1������
        chkLed1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				  Led.ledOpen();
				if(isChecked)
				{
					Led.ledControl(1, 1);
					Toast.makeText(HardcontrolActivity.this, "chkLed0 chedked", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Led.ledControl(1, 0);
					Toast.makeText(HardcontrolActivity.this, "chkLed0 unchedked", Toast.LENGTH_SHORT).show();
				}
				Led.ledClose();
			}
		});
        //����chkLed2������
        chkLed2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				  Led.ledOpen();
				if(isChecked)
				{
					Led.ledControl(2, 1);
					Toast.makeText(HardcontrolActivity.this, "chkLed0 chedked", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Led.ledControl(2, 0);
					Toast.makeText(HardcontrolActivity.this, "chkLed0 unchedked", Toast.LENGTH_SHORT).show();
				}
				Led.ledClose();
			}
		});
        //����chkLed3������
        chkLed3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				// TODO Auto-generated method stub
				  Led.ledOpen();
				if(isChecked)
				{
					Led.ledControl(3, 1);
					Toast.makeText(HardcontrolActivity.this, "chkLed0 chedked", Toast.LENGTH_SHORT).show();
				}
				else
				{
					Led.ledControl(3, 0);
					Toast.makeText(HardcontrolActivity.this, "chkLed0 unchedked", Toast.LENGTH_SHORT).show();
				}
				Led.ledClose();
			}
		});
        
        
        
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hardcontrol, menu);
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
