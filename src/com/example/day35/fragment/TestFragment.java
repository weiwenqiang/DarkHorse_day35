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
			//把FragmentOne的界面显示至帧布局中
			//创建fragment对象
			FragmentOne fgOne = new FragmentOne();
			//获取fragment管理器
			FragmentManager fm = getFragmentManager();
			//打开事务
			FragmentTransaction ft = fm.beginTransaction();
			//把内容显示至帧布局
			ft.replace(R.id.b1_frame, fgOne);
			//提交
			ft.commit();
			break;
		}
		case R.id.b1_two:
		{
			//把FragmentOne的界面显示至帧布局中
			//创建fragment对象
			FragmentTwo fgTwo = new FragmentTwo();
			//获取fragment管理器
			FragmentManager fm = getFragmentManager();
			//打开事务
			FragmentTransaction ft = fm.beginTransaction();
			//把内容显示至帧布局
			ft.replace(R.id.b1_frame, fgTwo);
			//提交
			ft.commit();
			break;
		}
		case R.id.b1_three:
		{
			//把FragmentOne的界面显示至帧布局中
			//创建fragment对象
			FragmentThree fgThree = new FragmentThree();
			//获取fragment管理器
			FragmentManager fm = getFragmentManager();
			//打开事务
			FragmentTransaction ft = fm.beginTransaction();
			//把内容显示至帧布局
			ft.replace(R.id.b1_frame, fgThree);
			//提交
			ft.commit();
			break;
		}
		default:
			break;
		}
	}

}
