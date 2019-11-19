package com.example.uts01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

	
	public class Fragmentpertanyaan extends Fragment{
		ListView ltanya1;
		String[] menu = {"Aritamtika Dasar", "Bangun Datar", "Baris dan Deret"};
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.fragmentpertanyaan, container, false);
    
    ltanya1= (ListView)rootView.findViewById(R.id.lvtanya1);
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, menu);
    ltanya1.setAdapter(adapter);
    ltanya1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    	
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			if(arg2 == 0){
				Toast.makeText(getActivity(), "NOT MINE", Toast.LENGTH_LONG).show();
			}
			else if (arg2 == 1){
				Fragmentsoalbangundatar fragmentsoalbangundatar = new Fragmentsoalbangundatar();
				FragmentManager fragmentManager = getFragmentManager();
				FragmentTransaction ft = fragmentManager.beginTransaction();
				ft.replace(R.id.content_frame, fragmentsoalbangundatar);
				ft.commit();
			}
			else if (arg2 == 2){
				Toast.makeText(getActivity(), "not mine", Toast.LENGTH_LONG).show();
			}
		
		}
    
	});
    
    return rootView;
    
	}
    
}
