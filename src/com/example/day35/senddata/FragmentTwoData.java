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
	//���ص�view�������ΪfragmentOne��������ʾ����Ļ��
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
