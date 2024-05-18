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
    Integer gradeMath = null;
    Integer gradeEnglish = null;
    Integer gradeFirst = null;
    Integer gradeSecond = null;
    Integer gradeThird = null;
    Integer unitsMath = null;
    Integer unitsEnglish = null;
    Integer numHug = null;
    String subjectFirst= "", subjectSecond ="", subjectThird = "";
    Intent si;
    int count = 0;
    boolean s5or1 = true, s5or0 = true;


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

            si = new Intent(this, SecondScreen.class);

            si.putExtra("Name", name);
            si.putExtra("Hebrew", gradeHebrew);
            si.putExtra("Safrut", gradeSafrut);
            si.putExtra("History", gradeHistory);
            si.putExtra("Ezrahut", gradeEzrahut);
            si.putExtra("Bible", gradeBible);



            si.putExtra("mathGrade", gradeMath);
            si.putExtra("englishGrade", gradeEnglish);
            si.putExtra("mathUnits", unitsMath);
            si.putExtra("englishUnits", unitsEnglish);

            si.putExtra("subjectFirst", subjectFirst);
            si.putExtra("subjectSecond", subjectSecond);
            si.putExtra("subjectThird", subjectThird);

            si.putExtra("gradeFirst", gradeFirst);
            si.putExtra("gradeSecond", gradeSecond);
            si.putExtra("gradeThird", gradeThird);

            si.putExtra("numHug", numHug);
            si.putExtra("s5or1",s5or1);
            si.putExtra("s5or0",s5or0);


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


    protected void onActivityResult(int source, int result, @Nullable Intent data_back)
    {
        super.onActivityResult(source, result, data_back);
        if (data_back != null)
        {
            gradeMath = data_back.getIntExtra("mathGrade", 1);
            gradeEnglish = data_back.getIntExtra("englishGrade", 1);
            unitsEnglish = data_back.getIntExtra("englishUnits", 3);
            unitsMath = data_back.getIntExtra("mathUnits", 3);

            subjectFirst = data_back.getStringExtra("subjectFirst");
            subjectSecond  = data_back.getStringExtra("subjectSecond");
            subjectThird = data_back.getStringExtra("subjectThird");


            gradeFirst = data_back.getIntExtra("gradeFirst", 1);
            gradeSecond = data_back.getIntExtra("gradeSecond", 1);
            gradeThird = data_back.getIntExtra("gradeThird", 1);

            s5or1 = data_back.getBooleanExtra("s5or1",true);
            s5or0 = data_back.getBooleanExtra("s5or0",true);

            numHug = data_back.getIntExtra("numHug", 1);

        }

    }

}