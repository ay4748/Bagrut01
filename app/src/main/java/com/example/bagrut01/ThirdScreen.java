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
    TextView tV5or0, tV5or1;
    TextView tVName;
    TextView tVBestAvg, tVAvg1, tVAvg2,tVAvg3, tVAvg4, tVAvg5, tVAvg6, tVAvg7;
    Intent dodging;


    int gradeHebrew, gradeSafrut, gradeHistory, gradeEzrahut, gradeBible, gradeMath, gradeEnglish, gradeFirst, gradeSecond, gradeThird;
    int unitsMath, unitsEnglish;
    String name, subjectFirst, subjectSecond, subjectThird;
    int numHug, sum = 0, sumUnits= 10;
    boolean is3;
    float avg;


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
        is3 = dodging.getBooleanExtra("is3", true);
        name = dodging.getStringExtra("name");


        tVName.setText("Hello, " + name + " this is your bagrut: ");
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

        tVGradeMath.setText(gradeMath + "");
        if(unitsMath ==4)
        {
            gradeMath+=15;
        }
        else if(unitsMath == 5)
        {
            gradeMath += 30;
        }
        sumUnits += unitsMath;
        sum += gradeMath;
        tVGradeMathWith.setText(gradeMath + "");
        tVUnitsEnglish.setText(unitsEnglish + "");
        tVUnitsMath.setText(unitsMath + "");

        tVGradeEnglish.setText(gradeEnglish + "");
        if(unitsEnglish ==4)
        {
            gradeEnglish+=15;
        }
        else if(unitsEnglish == 5)

        {
            gradeEnglish += 30;
        }
        sumUnits += unitsEnglish;
        sum += gradeEnglish;
        tVGradeEngWith.setText(gradeEnglish + "");

        tVGradeFirst.setText(gradeFirst+ "");
        gradeFirst += 20;
        tVGradeFirstWith.setText(gradeFirst + "");
        if(numHug == 1)
        {
            tVGradeThird.setVisibility(View.INVISIBLE);
            tVGradeThirdWith.setVisibility(View.INVISIBLE);
            tVThirdSubject.setVisibility(View.INVISIBLE);
            tV5or0.setVisibility(View.INVISIBLE);
            tV5or1.setText("1");
            tVGradeSecond.setText(gradeSecond + "");
            tVGradeSecondWith.setText(gradeSecond + "");

        }
        else if(numHug == 2)
        {
            tVGradeThird.setVisibility(View.INVISIBLE);
            tVGradeThirdWith.setVisibility(View.INVISIBLE);
            tVThirdSubject.setVisibility(View.INVISIBLE);
            tV5or0.setVisibility(View.INVISIBLE);
            tV5or1.setText("5");
            tVGradeSecond.setText(gradeSecond + "");
            gradeSecond += 20;
            tVGradeSecondWith.setText(gradeSecond + "");
        }
        if(is3)
        {
            tV5or0.setText("5");
            tVGradeThird.setText(gradeThird + "");
            gradeThird+=20;
            tVGradeThirdWith.setText(gradeThird + "");
            tVGradeThird.setVisibility(View.VISIBLE);
            tVGradeThirdWith.setVisibility(View.VISIBLE);
            tVThirdSubject.setVisibility(View.VISIBLE);
            tV5or0.setVisibility(View.VISIBLE);
            tV5or1.setText("5");
            tVGradeSecond.setText(gradeSecond + "");
            gradeSecond += 20;
            tVGradeSecondWith.setText(gradeSecond + "");
        }

        avg = gradeHebrew * 2 + gradeSafrut * 2 + gradeHistory * 2 + gradeEzrahut * 2 + gradeBible * 2 +  gradeMath * unitsMath + gradeEnglish * unitsEnglish;
        if(numHug == 1 && !is3)
        {
            sumUnits+=6;
            avg +=gradeSecond + gradeFirst * 5;
            avg = avg/sumUnits;
            tVBestAvg.setText("Your best average is " + avg);
            tVAvg1.setText(sumUnits +"");

            tVAvg2.setVisibility(View.GONE);
            tVAvg3.setVisibility(View.GONE);
            tVAvg4.setVisibility(View.GONE);
            tVAvg5.setVisibility(View.GONE);
            tVAvg6.setVisibility(View.GONE);
            tVAvg7.setVisibility(View.GONE);

        }
        else if(numHug == 2)
        {
            float[] arr1 = new float[3];
            arr1[0] = (avg + gradeFirst * 5 + gradeSecond *5) / (sumUnits + 10);
            arr1[1] = (avg + gradeFirst * 5) / (sumUnits + 5);
            arr1[2] = (avg + gradeSecond * 5) / (sumUnits + 5);

            selectionSort(arr1);
            tVAvg1.setText(arr1[0] + "");
            tVAvg2.setText(arr1[1] + "");
            tVAvg3.setText(arr1[2] + "");

            tVBestAvg.setText("Your best average is:" + arr1[2]);

            tVAvg4.setVisibility(View.GONE);
            tVAvg5.setVisibility(View.GONE);
            tVAvg6.setVisibility(View.GONE);
            tVAvg7.setVisibility(View.GONE);

        }
        else if(numHug == 3 || is3)
        {
            float[] arr1 = new float[7];
            arr1[0] = (avg + gradeFirst * 5 + gradeSecond *5 + gradeThird * 5) / (sumUnits + 15);
            arr1[1] = (avg + gradeFirst * 5 ) / (sumUnits + 5);
            arr1[2] = (avg + gradeSecond *5) / (sumUnits + 5);
            arr1[3] = (avg + gradeThird * 5) / (sumUnits + 5);
            arr1[4] = (avg + gradeFirst * 5 + gradeSecond *5) / (sumUnits + 10);
            arr1[5] = (avg + gradeFirst * 5 + gradeThird *5) / (sumUnits + 10);
            arr1[6] = (avg + gradeSecond * 5 + gradeThird *5) / (sumUnits + 10);

            selectionSort(arr1);

            tVAvg1.setText(arr1[0] + "");
            tVAvg2.setText(arr1[1] + "");
            tVAvg3.setText(arr1[2] + "");
            tVAvg4.setText(arr1[3] + "");
            tVAvg5.setText(arr1[4] + "");
            tVAvg6.setText(arr1[5] + "");
            tVAvg7.setText(arr1[6] + "");

            tVBestAvg.setText("Your best Average is: " + arr1[6]);

        }

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

        tV5or0 = findViewById(R.id.tV5or0);
        tV5or1 = findViewById(R.id.tV5or1);
        tVName = findViewById(R.id.tVName);

        tVBestAvg = findViewById(R.id.tVBestAvg);
        tVAvg1 = findViewById(R.id.tVAvg1);
        tVAvg2 = findViewById(R.id.tVavg2);
        tVAvg3 = findViewById(R.id.tVAvg3);
        tVAvg4 = findViewById(R.id.tVAvg4);
        tVAvg5 = findViewById(R.id.tVAvg5);
        tVAvg6 = findViewById(R.id.tVAvg6);
        tVAvg7 = findViewById(R.id.tVAvg7);

    }

    void selectionSort(float[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                float swap = a[i];
                a[i] = a[min];
                a[min] = swap;
            }
        }
    }

    public void goBack(View view) {
        finish();
    }
}