package com.example.uts01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragmentsoalbangundatar extends Fragment{

	 EditText sisipersegi,hasilluas1;
	 Button hasiljawab;
	    
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragmentsoalbangundatar, container, false);
    
    sisipersegi =(EditText)rootView.findViewById(R.id.sisi1);
    hasilluas1 = (EditText)rootView.findViewById(R.id.hasiljawaban);
    hasiljawab =(Button)rootView.findViewById(R.id.tombol1);
    
    hasiljawab.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			int s =Integer.parseInt(sisipersegi.getText().toString());
			int L = s*s;
			hasilluas1.setText(String.valueOf(L));
		}
	});
    
    return rootView;
    
	}
	
}
