package com.example.bagrut01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int gradeHebrew, gradeSafrut, gradeHistory, gradeEzrahut, gradeBible;
    EditText eTHebrew, eTSafrut, eTHistory, eTEzrahut, eTBible, eTName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews()
    {
        eTHebrew = findViewById(R.id.eTHebrew);
        eTSafrut = findViewById(R.id.eTSafrut);
        eTHistory = findViewById(R.id.eTHistory);
        eTEzrahut = findViewById(R.id.eTEzrahut);
        eTBible = findViewById(R.id.eTBible);
        eTName = findViewById(R.id.eTName);



    }

    public void goToSec(View view)
    {
        gradeHebrew = Integer.parseInt(eTHebrew.getText().toString());
        gradeSafrut = Integer.parseInt(eTSafrut.getText().toString());
        gradeHistory = Integer.parseInt(eTHistory.getText().toString());
        gradeEzrahut = Integer.parseInt(eTEzrahut.getText().toString());
        gradeBible = Integer.parseInt(eTBible.getText().toString());

        Intent si = new Intent(this,SecondScreen.class);
        si.putExtra("Hebrew", gradeHebrew );
        si.putExtra("Safrut", gradeSafrut );
        si.putExtra("History", gradeHistory );
        si.putExtra("Ezrahut", gradeEzrahut );
        si.putExtra("Bible" ,gradeBible );

        startActivity(si);

    }
}