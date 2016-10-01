package com.example.day35.animator;

import com.example.day35.R;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.Toast;

public class TestAnimator extends Activity implements OnClickListener {
	ImageView iv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.b5_amonganimation);
		findViewById(R.id.b5_translate).setOnClickListener(this);
		findViewById(R.id.b5_scale).setOnClickListener(this);
		findViewById(R.id.b5_alpha).setOnClickListener(this);
		findViewById(R.id.b5_rotate).setOnClickListener(this);
		findViewById(R.id.b5_fly).setOnClickListener(this);
		findViewById(R.id.b7_xml).setOnClickListener(this);
		iv = (ImageView) findViewById(R.id.b5_image);
		iv.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b5_translate:
		{
			//target:动画作用于那个组件
			ObjectAnimator oa = ObjectAnimator.ofFloat(iv, "translationX", 10, 70, 20, 100);
			oa.setDuration(2000);
			oa.setRepeatCount(1);
			oa.setRepeatMode(ValueAnimator.REVERSE);
			oa.start();
			break;
		}
		case R.id.b5_scale:
		{
			ObjectAnimator oa = ObjectAnimator.ofFloat(iv, "scaleX", 1, 1.6f, 1.2f, 2);
			oa.setDuration(2000);
			oa.start();
			break;
		}
		case R.id.b5_alpha:
		{
			ObjectAnimator oa = ObjectAnimator.ofFloat(iv, "alpha", 1, 0.6f, 0.2f, 2);
			oa.setDuration(2000);
			oa.start();
			break;
		}
		case R.id.b5_rotate:
		{
			ObjectAnimator oa = ObjectAnimator.ofFloat(iv, "rotation", 0, 180, -90, 360);
			oa.setDuration(2000);
			oa.start();
			break;
		}
		case R.id.b5_fly:
		{
			AnimatorSet set = new AnimatorSet();
			//一个一个顺序播放
//			set.playSequentially(items);
			ObjectAnimator oa1 = ObjectAnimator.ofFloat(iv, "translationX", 10, 70, 20, 100);
			oa1.setDuration(2000);
			ObjectAnimator oa2 = ObjectAnimator.ofFloat(iv, "scaleX", 1, 1.6f, 1.2f, 2);
			oa2.setDuration(2000);
			ObjectAnimator oa3 = ObjectAnimator.ofFloat(iv, "alpha", 1, 0.6f, 0.2f, 2);
			oa3.setDuration(2000);
			ObjectAnimator oa4 = ObjectAnimator.ofFloat(iv, "rotation", 0, 180, -90, 360);
			oa4.setDuration(2000);
			
			set.playTogether(oa1, oa2, oa3, oa4);
			set.start();
			break;
		}
		case R.id.b5_image:
			Toast.makeText(TestAnimator.this, "点不到我", 0).show();
			break;
		case R.id.b7_xml:
		{
			//xml属性动画
			Animator at =AnimatorInflater.loadAnimator(this, R.animator.objanimator);
			//设置作用于那个组件
			at.setTarget(iv);
			at.start();
			break;
		}
		default:
			break;
		}
	}
}
