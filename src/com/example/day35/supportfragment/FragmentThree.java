package com.example.day35.supportfragment;

import com.example.day35.R;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentThree extends Fragment {
	//���ص�view�������ΪfragmentOne��������ʾ����Ļ��
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_three, null);
//		View v = View.inflate(getActivity(), resource, root);
		return v;
	}

}
