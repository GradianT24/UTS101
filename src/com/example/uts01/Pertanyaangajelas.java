package com.example.uts01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Pertanyaangajelas extends Fragment{
	
	EditText ejawab1,ejawab2,ejawab3;
	Button bjawab1,bjawab2,bjawab3;
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
    View rootView = inflater.inflate(R.layout.pertanyaangajelas, container, false);
    
    ejawab1 = (EditText)rootView.findViewById(R.id.jawaban1);
    ejawab2 = (EditText)rootView.findViewById(R.id.jawaban2);
    ejawab3 = (EditText)rootView.findViewById(R.id.jawaban3);
    bjawab1 = (Button)rootView.findViewById(R.id.submit1);
    bjawab2 = (Button)rootView.findViewById(R.id.submit2);
    bjawab3 = (Button)rootView.findViewById(R.id.submit3);
    
    bjawab1.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String ans1 = ejawab1.getText().toString();
			if(ans1.equals("iya") || ans1.equals("Iya") || ans1.equals("IYA")){
				Toast.makeText(getActivity(), "Bisa dilihat dari wajahnya", Toast.LENGTH_LONG).show();
			}
			else if (ans1.equals("tidak") || ans1.equals("Tidak") || ans1.equals("TIDAK")){
				Toast.makeText(getActivity(), "Ohhhh iya kahhh?", Toast.LENGTH_LONG).show();
			}
		}
	});
    
    bjawab2.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String ans2 = ejawab2.getText().toString();
			if(ans2.equals("iya") || ans2.equals("Iya") || ans2.equals("IYA")){
				Toast.makeText(getActivity(), "SAMAAA!!!!!", Toast.LENGTH_LONG).show();	
			}		
			else if (ans2.equals("tidak") || ans2.equals("Tidak") || ans2.equals("TIDAK")){
				Toast.makeText(getActivity(), "Bomat lah!!!!", Toast.LENGTH_LONG).show();
			}
		}
	});
    
    bjawab3.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String ans3 = ejawab3.getText().toString();
			if(ans3.equals("iya") || ans3.equals("Iya") || ans3.equals("IYA")){
				Toast.makeText(getActivity(), "Add kuy Delta.NEO", Toast.LENGTH_LONG).show();
			}
			else if (ans3.equals("tidak") || ans3.equals("Tidak") || ans3.equals("TIDAK")){ 
				Toast.makeText(getActivity(), "DOWNLOAD LAH", Toast.LENGTH_LONG).show();
			}
		}
	});
    
    return rootView;

}
}