package com.example.bagrut01;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int gradeHebrew, gradeSafrut, gradeHistory, gradeEzrahut, gradeBible;
    EditText eTHebrew, eTSafrut, eTHistory, eTEzrahut, eTBible, eTName;
    String name = " ";
    int REQUEST_CODE = 369;

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

        if(checkIput())
        {

            gradeHebrew = Integer.parseInt(eTHebrew.getText().toString());
            gradeSafrut = Integer.parseInt(eTSafrut.getText().toString());
            gradeHistory = Integer.parseInt(eTHistory.getText().toString());
            gradeEzrahut = Integer.parseInt(eTEzrahut.getText().toString());
            gradeBible = Integer.parseInt(eTBible.getText().toString());
            name = eTName.getText().toString();

            Intent si = new Intent(this,SecondScreen.class);
            si.putExtra("Name", name);
            si.putExtra("Hebrew", gradeHebrew );
            si.putExtra("Safrut", gradeSafrut );
            si.putExtra("History", gradeHistory );
            si.putExtra("Ezrahut", gradeEzrahut );
            si.putExtra("Bible" ,gradeBible );

            startActivityForResult(si,REQUEST_CODE);
        }


    }

    private boolean checkIput()
    {
        if (eTHebrew.getText().toString().isEmpty() || eTSafrut.getText().toString().isEmpty() || eTHistory.getText().toString().isEmpty() || eTEzrahut.getText().toString().isEmpty() || eTBible.getText().toString().isEmpty() || eTName.getText().toString().isEmpty())
        {
            Toast.makeText(this, "One or more of the field is empty", Toast.LENGTH_LONG).show();
            return false;
        }
        gradeHebrew = Integer.parseInt(eTHebrew.getText().toString());
        gradeSafrut = Integer.parseInt(eTSafrut.getText().toString());
        gradeHistory = Integer.parseInt(eTHistory.getText().toString());
        gradeEzrahut = Integer.parseInt(eTEzrahut.getText().toString());
        gradeBible = Integer.parseInt(eTBible.getText().toString());
        name = eTName.getText().toString();
        if(gradeHebrew < 0 || gradeHebrew > 100 || gradeSafrut < 0 || gradeSafrut > 100 || gradeHistory < 0 || gradeHistory > 100 ||  gradeEzrahut < 0 || gradeEzrahut > 100 || gradeBible < 0 || gradeBible > 100)
        {
            Toast.makeText(this, "One or more of the grades are wrong", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }
    protected void onActivityResult(int source, int result, @Nullable Intent data_back){
        super.onActivityResult(source, result, data_back);
        if (source == REQUEST_CODE) {
            if (result == Activity.RESULT_OK) {
                if (data_back != null) {

                }
            }
        }
    }

}