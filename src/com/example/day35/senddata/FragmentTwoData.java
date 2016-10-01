package com.example.day35.senddata;

import com.example.day35.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentTwoData extends Fragment {
	private TextView tv;
	//返回的view对象会作为fragmentOne的内容显示在屏幕上
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_two, null);
		tv = (TextView) v.findViewById(R.id.two_text);
		return v;
	}
	public void setText(String text){
		tv.setText(text);
	}
}
