package com.example.day35.supportfragment;

import com.example.day35.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;

public class TestSupportFragment extends FragmentActivity implements OnClickListener {

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
		case R.id.b1_one: {
			// ��FragmentOne�Ľ�����ʾ��֡������
			// ����fragment����
			FragmentOne fgOne = new FragmentOne();
			// ��ȡfragment������
			FragmentManager fm = getSupportFragmentManager();
			// ������
			FragmentTransaction ft = fm.beginTransaction();
			// ��������ʾ��֡����
			ft.replace(R.id.b1_frame, fgOne);
			// �ύ
			ft.commit();
			break;
		}
		case R.id.b1_two: {
			// ��FragmentOne�Ľ�����ʾ��֡������
			// ����fragment����
			FragmentTwo fgTwo = new FragmentTwo();
			// ��ȡfragment������
			FragmentManager fm = getSupportFragmentManager();
			// ������
			FragmentTransaction ft = fm.beginTransaction();
			// ��������ʾ��֡����
			ft.replace(R.id.b1_frame, fgTwo);
			// �ύ
			ft.commit();
			break;
		}
		case R.id.b1_three: {
			// ��FragmentOne�Ľ�����ʾ��֡������
			// ����fragment����
			FragmentThree fgThree = new FragmentThree();
			// ��ȡfragment������
			FragmentManager fm = getSupportFragmentManager();
			// ������
			FragmentTransaction ft = fm.beginTransaction();
			// ��������ʾ��֡����
			ft.replace(R.id.b1_frame, fgThree);
			// �ύ
			ft.commit();
			break;
		}
		default:
			break;
		}
	}

}
