package com.example.day35.supportfragment;

import com.example.day35.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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

}
