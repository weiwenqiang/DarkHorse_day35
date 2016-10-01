package com.example.day35.fragment;

import com.example.day35.R;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentOne extends Fragment {
	//返回的view对象会作为fragmentOne的内容显示在屏幕上
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_one, null);
//		View v = View.inflate(getActivity(), resource, root);
		return v;
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("One", "onCreate");
	}

	@Override
	public void onStart() {
		super.onStart();
		Log.d("One", "onStart");
	}

	@Override
	public void onResume() {
		super.onResume();
		Log.d("One", "onResume");
	}

	@Override
	public void onPause() {
		super.onPause();
		Log.d("One", "onPause");
	}

	@Override
	public void onStop() {
		super.onStop();
		Log.d("One", "onStop");
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d("One", "onDestroy");
	}

}
