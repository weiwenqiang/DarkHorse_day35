package com.example.day35.fragment;

import com.example.day35.R;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class TestFragment extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b1_fragment);
		findViewById(R.id.b1_one).setOnClickListener(this);
		findViewById(R.id.b1_two).setOnClickListener(this);
		findViewById(R.id.b1_three).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b1_one:
		{
			//��FragmentOne�Ľ�����ʾ��֡������
			//����fragment����
			FragmentOne fgOne = new FragmentOne();
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
			FragmentTwo fgTwo = new FragmentTwo();
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
			FragmentThree fgThree = new FragmentThree();
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
		default:
			break;
		}
	}

}
