package com.example.day35.senddata;

import com.example.day35.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FragmentOneData extends Fragment {
	//���ص�view�������ΪfragmentOne��������ʾ����Ļ��
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View v = inflater.inflate(R.layout.fragment_one, null);
//		View v = View.inflate(getActivity(), resource, root);
		Button one_button = (Button) v.findViewById(R.id.one_button);
		final EditText one_edit = (EditText) v.findViewById(R.id.one_edit);
		one_button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				String text = one_edit.getText().toString();
				//�����ݴ��ݸ�activity
				((TestSendDataFragment)getActivity()).setText(text);
			}
			
		});
		
		
		return v;
	}

}
