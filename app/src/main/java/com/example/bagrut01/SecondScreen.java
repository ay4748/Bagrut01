package com.example.bagrut01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondScreen extends AppCompatActivity {
    EditText eTUnitsMath,eTGradeMath,eTUnitsEng,eTGradeEng,eTSubjectFirst,eTGradeFirst,eTSubjectSecond,eTSecondGrade,eTSecondHagSub, eTSecHagGrade;
    RadioButton rB5or0first, rB5or0Second;
    int gradeHebrew, gradeSafrut, gradeHistory, gradeEzrahut, gradeBible, gradeMath, gradeEnglish, gradeFirst, gradeSecond, gradeThird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        initViews();

        Intent gi = getIntent();
        gradeHebrew = gi.getIntExtra("Hebrew", 1);
        gradeSafrut = gi.getIntExtra("Safrut", 1);
        gradeHistory = gi.getIntExtra("History", 1);
        gradeEzrahut = gi.getIntExtra("Ezrahut", 1);
        gradeBible = gi.getIntExtra("Bible", 1);

    }

    private void initViews()
    {
        eTUnitsMath = findViewById(R.id.eTUnitsMath);
        eTGradeMath = findViewById(R.id.eTGradeMath);
        eTUnitsEng = findViewById(R.id.eTUnitsEng);
        eTGradeEng = findViewById(R.id.eTGradeEng);
        eTSubjectFirst = findViewById(R.id.eTSubjectFirst);
        eTGradeFirst = findViewById(R.id.eTGradeFirst);
        eTSubjectSecond  = findViewById(R.id.eTSubjectSecond);
        eTSecondGrade = findViewById(R.id.eTSecondGrade);
        eTSecondHagSub = findViewById(R.id.eTSecondHagSub);
        eTSecHagGrade = findViewById(R.id.eTSecHagGrade);

        rB5or0first = findViewById(R.id.rB5or0first);
        rB5or0Second = findViewById(R.id.rB5or0Second);
    }

    public void clickedMavoMadaim(View view)
    {
        eTSecHagGrade.setVisibility(View.INVISIBLE);
        rB5or0first.setVisibility(View.INVISIBLE);
        rB5or0Second.setVisibility(View.INVISIBLE);
        eTSecondHagSub.setVisibility(View.INVISIBLE);
    }

    public void clickedhagshni(View view)
    {
        eTSecHagGrade.setVisibility(View.VISIBLE);
        rB5or0first.setVisibility(View.VISIBLE);
        rB5or0Second.setVisibility(View.VISIBLE);
        eTSecondHagSub.setVisibility(View.VISIBLE);
    }

    public void clickedNothird(View view)
    {
        eTSecondHagSub.setVisibility(View.INVISIBLE);
        eTSecHagGrade.setVisibility(View.INVISIBLE);

    }

    public void clikedYesThird(View view) {
        eTSecondHagSub.setVisibility(View.VISIBLE);
        eTSecHagGrade.setVisibility(View.VISIBLE);
    }

    public static boolean containsOnlyLetters(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void clickedGoThird(View view)
    {

    }

    private boolean checkInput()
    {
        if(eTUnitsMath.getText().toString().isEmpty() || eTGradeMath.getText().toString().isEmpty() || eTUnitsEng.getText().toString().isEmpty() || eTGradeEng.getText().toString().isEmpty() || eTSubjectFirst.getText().toString().isEmpty() || eTSubjectSecond.getText().toString().isEmpty() || eTSecondGrade.getText().toString().isEmpty() || eTSecondHagSub.getText().toString().isEmpty() || eTSecondHagSub.getText().toString().isEmpty())
        {
            Toast.makeText(this, "One or more of the field is empty", Toast.LENGTH_LONG).show();
            return false;
        }
        gradeMath = Integer.parseInt(eTGradeMath.getText().toString());
        gradeEnglish = Integer.parseInt(eTGradeMath.getText().toString());
        gradeFirst = Integer.parseInt(eTGradeFirst.getText().toString());
        gradeSecond = Integer.parseInt(eTSecondGrade.getText().toString());


    }

}