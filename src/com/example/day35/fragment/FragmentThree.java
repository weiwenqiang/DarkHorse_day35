package com.example.day35.fragment;

import com.example.day35.R;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentThree extends Fragment {
	//返回的view对象会作为fragmentOne的内容显示在屏幕上
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_three, null);
//		View v = View.inflate(getActivity(), resource, root);
		return v;
	}
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("Three", "onCreate");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d("Three", "onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d("Three", "onResume");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d("Three", "onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d("Three", "onStop");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("Three", "onDestroy");
	}
}
