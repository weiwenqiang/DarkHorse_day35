package com.example.day35.amonganimation;

import com.example.day35.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.view.Window;
import android.widget.ImageView;

public class TestAmongAnimation extends Activity implements OnClickListener {
	ImageView iv;
	private TranslateAnimation ta;
	private ScaleAnimation sa;
	private AlphaAnimation aa;
	private RotateAnimation ra;
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
		iv = (ImageView) findViewById(R.id.b5_image);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.b5_translate:
			//定义位移动画
			
			ta = new TranslateAnimation(10, 100, 20, 200);
//			TranslateAnimation ta = new TranslateAnimation(Animation.RELATIVE_TO_PARENT, -1, Animation.RELATIVE_TO_PARENT, 3, Animation.RELATIVE_TO_PARENT, -0.5f, Animation.RELATIVE_TO_PARENT, 2);
			//设置播放时间
			ta.setDuration(2000);
			//设置重复次数
			ta.setRepeatCount(1);
			//重复模式，
			ta.setRepeatMode(Animation.REVERSE);
			iv.startAnimation(ta);
			break;
		case R.id.b5_scale:
			sa = new ScaleAnimation(0.5f, 2, 0.1f, 3, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
			sa.setDuration(2000);
			sa.setRepeatCount(1);
			sa.setRepeatMode(Animation.REVERSE);
			//填充动画的结束位置
			sa.setFillAfter(true);
			iv.startAnimation(sa);
			break;
		case R.id.b5_alpha:
			//定义透明动画
			
			aa = new AlphaAnimation(0, 1);
			aa.setDuration(2000);
			iv.startAnimation(aa);
			break;
		case R.id.b5_rotate:
			//定义旋转动画
//			RotateAnimation ra = new RotateAnimation(20, 180);
			
			ra = new RotateAnimation(20, 180,Animation.RELATIVE_TO_SELF, 1, Animation.RELATIVE_TO_SELF, 0);
			ra.setDuration(2000);
			iv.startAnimation(ra);
			break;
		case R.id.b5_fly:
			AnimationSet set = new AnimationSet(false);
			set.addAnimation(ta);
			set.addAnimation(sa);
			set.addAnimation(aa);
			set.addAnimation(ra);
			
			iv.startAnimation(set);
			break;
		default:
			break;
		}
	}
}
