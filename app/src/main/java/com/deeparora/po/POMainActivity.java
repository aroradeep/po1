package com.deeparora.po;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class POMainActivity extends AppCompatActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener{

        @InjectView(R.id.spinnerlogin)
        Spinner splogin;
    @InjectView(R.id.editTextEmail)
    EditText eTxtEmail;

    @InjectView(R.id.editTextMobile)
    EditText eTxtMobile;
         ArrayAdapter<String>adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pomain);
        ButterKnife.inject(this);
        eTxtEmail.setVisibility(View.INVISIBLE);
        eTxtMobile.setVisibility(View.INVISIBLE);
        adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item);
        adapter.add("--Login by email or mobile--"); //0
        adapter.add("Email");
        adapter.add("Mobile");

        splogin.setAdapter(adapter);

       splogin.setOnItemSelectedListener(this);


    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String name = adapter.getItem(i);
        //user.city = city;
        if(name== "Email"){
            eTxtMobile.setVisibility(View.INVISIBLE);
            eTxtEmail.setVisibility(View.VISIBLE);

        }else if(name== "Mobile"){
            eTxtEmail.setVisibility(View.INVISIBLE);
            eTxtMobile.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
