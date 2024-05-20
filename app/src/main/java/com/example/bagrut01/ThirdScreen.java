package com.example.bagrut01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class ThirdScreen extends AppCompatActivity {
    TextView tVUnitsMath,tVUnitsEnglish;

    TextView tVGradeHebrew, tVGradeHebrewWith;
    TextView tVGradeSafrut, tVGradeSafrutWith;
    TextView tVGradeHistory, tVGradeHistoryWith;
    TextView tVGradeEzrahut, tVGradeEzrahutWith;
    TextView tVGradeBible, tVGradeBibleWith;
    TextView tVGradeMath, tVGradeMathWith;
    TextView tVGradeEnglish, tVGradeEngWith;
    TextView tVGradeFirst, tVGradeFirstWith;
    TextView tVGradeSecond, tVGradeSecondWith;
    TextView tVGradeThird, tVGradeThirdWith;
    TextView tVFirstSubject, tVSecondSubject, tVThirdSubject;
    Intent dodging;

    int gradeHebrew, gradeSafrut, gradeHistory, gradeEzrahut, gradeBible, gradeMath, gradeEnglish, gradeFirst, gradeSecond, gradeThird;
    int unitsMath, unitsEnglish;
    String name, subjectFirst, subjectSecond, subjectThird;
    int numHug, sum = 0, sumUnits= 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_screen);

        initViews();
        dodging = getIntent();
        gradeHebrew = dodging.getIntExtra("gradeHebrew", 1);
        gradeSafrut = dodging.getIntExtra("gradeSafrut", 1);
        gradeHistory = dodging.getIntExtra("gradeHistory",1);
        gradeEzrahut = dodging.getIntExtra("gradeEzrahut",1);
        gradeBible = dodging.getIntExtra("gradeBible",1);


        gradeMath = dodging.getIntExtra("mathGrade", 1);
        gradeEnglish = dodging.getIntExtra("englishGrade", 1);
        unitsEnglish = dodging.getIntExtra("englishUnits", 3);
        unitsMath = dodging.getIntExtra("mathUnits", 3);

        subjectFirst = dodging.getStringExtra("subjectFirst");
        subjectSecond  = dodging.getStringExtra("subjectSecond");
        subjectThird = dodging.getStringExtra("subjectThird");


        gradeFirst = dodging.getIntExtra("gradeFirst", 1);
        gradeSecond = dodging.getIntExtra("gradeSecond", 1);
        gradeThird = dodging.getIntExtra("gradeThird", 1);

        numHug = dodging.getIntExtra("numHug", 1);

        tVFirstSubject.setText(subjectFirst);
        tVSecondSubject.setText(subjectSecond);
        tVThirdSubject.setText(subjectThird);

        tVGradeHebrew.setText(gradeHebrew + "");
        tVGradeHebrewWith.setText(gradeHebrew + "");
        sum += gradeHebrew;

        tVGradeSafrut.setText(gradeSafrut + "");
        tVGradeSafrutWith.setText(gradeSafrut + "");
        sum += gradeSafrut;

        tVGradeHistory.setText(gradeHistory + "");
        tVGradeHistoryWith.setText(gradeHistory + "");
        sum += gradeHistory;

        tVGradeEzrahut.setText(gradeEzrahut + "");
        tVGradeEzrahutWith.setText(gradeEzrahut + "");
        sum += gradeEzrahut;

        tVGradeBible.setText(gradeBible + "");
        tVGradeBibleWith.setText(gradeBible + "");
        sum += gradeBible;







    }

    private void initViews()
    {
        tVUnitsMath = findViewById(R.id.tVUnitsMath);
        tVUnitsEnglish = findViewById(R.id.tVUnitsEnglish);

        tVGradeHebrew = findViewById(R.id.tVGradeHebrew);
        tVGradeHebrewWith = findViewById(R.id.tVGradeHebrewWith);

        tVGradeSafrut = findViewById(R.id.tVGradeSafrut);
        tVGradeSafrutWith = findViewById(R.id.tVGradeSafrutWith);

        tVGradeHistory = findViewById(R.id.tVGradeHistory);
        tVGradeHistoryWith = findViewById(R.id.tVGradeHistoryWith);

        tVGradeEzrahut = findViewById(R.id.tVGradeEzrahut);
        tVGradeEzrahutWith = findViewById(R.id.tVGradeEzrahutWith);

        tVGradeBible = findViewById(R.id.tVGradeBible);
        tVGradeBibleWith = findViewById(R.id.tVGradeBibleWith);

        tVGradeMath = findViewById(R.id.tVGradeMath);
        tVGradeMathWith = findViewById(R.id.tVGradeMathWith);

        tVGradeEnglish = findViewById(R.id.tVGradeEnglish);
        tVGradeEngWith = findViewById(R.id.tVGradeEngWith);

        tVGradeFirst = findViewById(R.id.tVGradeFirst);
        tVGradeFirstWith = findViewById(R.id.tVGradeFirstWith);

        tVGradeSecond = findViewById(R.id.tVGradeSecond);
        tVGradeSecondWith = findViewById(R.id.tVGradeSecondWith);

        tVGradeThird = findViewById(R.id.tVGradeThird);
        tVGradeThirdWith = findViewById(R.id.tVGradeThirdWith);

        tVFirstSubject = findViewById(R.id.tVFirstSubject);
        tVSecondSubject = findViewById(R.id.tVSecondSubject);
        tVThirdSubject = findViewById(R.id.tVThirdSubject);



    }
}