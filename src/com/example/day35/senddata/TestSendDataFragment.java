package com.example.day35.senddata;

import com.example.day35.R;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.EditText;

public class TestSendDataFragment extends Activity implements OnClickListener {
	EditText et_data;
	private FragmentTwoData fgTwo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b1_fragment);
		findViewById(R.id.b1_one).setOnClickListener(this);
		findViewById(R.id.b1_two).setOnClickListener(this);
		findViewById(R.id.b1_three).setOnClickListener(this);
		et_data = (EditText) findViewById(R.id.b1_edit);
		findViewById(R.id.b1_senddata).setOnClickListener(this);
		fgTwo = new FragmentTwoData();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b1_one:
		{
			//��FragmentOne�Ľ�����ʾ��֡������
			//����fragment����
			FragmentOneData fgOne = new FragmentOneData();
			//��ȡfragment������
			FragmentManager fm = getFragmentManager();
			//������
			FragmentTransaction ft = fm.beginTransaction();
			//��������ʾ��֡����
			ft.replace(R.id.b1_frame, fgOne);
			//�ύ
			ft.commit();
			break;
		}
		case R.id.b1_two:
		{
			//��FragmentOne�Ľ�����ʾ��֡������
			//����fragment����
			fgTwo = new FragmentTwoData();
			//��ȡfragment������
			FragmentManager fm = getFragmentManager();
			//������
			FragmentTransaction ft = fm.beginTransaction();
			//��������ʾ��֡����
			ft.replace(R.id.b1_frame, fgTwo);
			//�ύ
			ft.commit();
			break;
		}
		case R.id.b1_three:
		{
			//��FragmentOne�Ľ�����ʾ��֡������
			//����fragment����
			FragmentThreeData fgThree = new FragmentThreeData();
			//��ȡfragment������
			FragmentManager fm = getFragmentManager();
			//������
			FragmentTransaction ft = fm.beginTransaction();
			//��������ʾ��֡����
			ft.replace(R.id.b1_frame, fgThree);
			//�ύ
			ft.commit();
			break;
		}
		case R.id.b1_senddata:
		{
			String text = et_data.getText().toString();
			fgTwo.setText(text);
			break;
		}
		default:
			break;
		}
	}
	public void setText(String text){
		et_data.setText(text);
	}
}
