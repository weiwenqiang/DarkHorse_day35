package com.example.day35.drawableanimation;

import com.example.day35.R;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

public class TestDrawableAnimation extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b4_animation);
		
		ImageView rocketImage = (ImageView) findViewById(R.id.b4_image);
		//��֡������Դ�ļ�ָ��Ϊiv�ı���
		rocketImage.setBackgroundResource(R.drawable.frameanimation);
		//ת��Ϊ���������Կ�ʼ��ͣ
		AnimationDrawable rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
		rocketAnimation.start();
	}

}
