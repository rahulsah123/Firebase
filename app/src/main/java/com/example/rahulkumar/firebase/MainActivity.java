package com.example.rahulkumar.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private Button mFiredbbtn;
    private DatabaseReference mData;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFiredbbtn=(Button) findViewById(R.id.Firedbbtn);
        editText=(EditText)findViewById(R.id.txtview);
        mData= FirebaseDatabase.getInstance().getReference().child("User");

        mFiredbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str=editText.getText().toString().trim();
                mData.push().setValue(str);
            }
        });

    }
}
