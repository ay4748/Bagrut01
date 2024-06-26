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
    RadioButton rB5or0first, rB5or0Second,rB5or1Second;
    int gradeHebrew, gradeSafrut, gradeHistory, gradeEzrahut, gradeBible, gradeMath, gradeEnglish, gradeFirst, gradeSecond, gradeThird;
    int unitsMath, unitsEngish;
    Intent gi;
    String name, subjectFirst, subjectSecond, subjectThird;
    int numHug = 3;
    int RESULT_OK = 369;

    boolean s5or1;
    boolean s5or0;
    boolean hug3 = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        initViews();

        gi = getIntent();

        gradeHebrew = gi.getIntExtra("Hebrew", 1);
        gradeSafrut = gi.getIntExtra("Safrut", 1);
        gradeHistory = gi.getIntExtra("History", 1);
        gradeEzrahut = gi.getIntExtra("Ezrahut", 1);
        gradeBible = gi.getIntExtra("Bible", 1);
        name = gi.getStringExtra("Name");

        gradeMath = gi.getIntExtra("mathGrade", -1);
        gradeEnglish = gi.getIntExtra("englishGrade", -1);
        unitsEngish = gi.getIntExtra("englishUnits",-1);
        unitsMath = gi.getIntExtra("mathUnits", -1);

        subjectFirst = gi.getStringExtra("subjectFirst");
        subjectSecond  = gi.getStringExtra("subjectSecond");
        subjectThird = gi.getStringExtra("subjectThird");


        gradeFirst = gi.getIntExtra("gradeFirst", -1);
        gradeSecond = gi.getIntExtra("gradeSecond", -1);
        gradeThird = gi.getIntExtra("gradeThird", -1);

        numHug = gi.getIntExtra("numHug", 1);
        s5or1 = gi.getBooleanExtra("s5or1", true);
        s5or0 = gi.getBooleanExtra("s5or0", true);

        if(!s5or1)
        {
            rB5or0first.setChecked(true);
            eTSecHagGrade.setVisibility(View.INVISIBLE);
            rB5or0first.setVisibility(View.INVISIBLE);
            rB5or0Second.setVisibility(View.INVISIBLE);
            eTSecondHagSub.setVisibility(View.INVISIBLE);

        }
        if(!s5or0)
        {
            rB5or0Second.setChecked(true);
            eTSecondHagSub.setVisibility(View.INVISIBLE);
            eTSecHagGrade.setVisibility(View.INVISIBLE);
        }

        checkminus(eTGradeMath,gradeMath);
        checkminus(eTGradeEng, gradeEnglish);
        checkminus(eTUnitsMath,unitsMath);
        checkminus(eTUnitsEng,unitsEngish);
        checkminus(eTGradeFirst, gradeFirst);
        checkminus(eTSecondGrade,gradeSecond);
        checkminus(eTSecHagGrade, gradeThird);

        eTSubjectFirst.setText(subjectFirst);
        eTSubjectSecond.setText(subjectSecond);
        eTSecondHagSub.setText(subjectThird);

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
        rB5or1Second = findViewById(R.id.rB5or1Second);
    }

    public void clickedMavoMadaim(View view)
    {
        eTSecHagGrade.setVisibility(View.INVISIBLE);
        rB5or0first.setVisibility(View.INVISIBLE);
        rB5or0Second.setVisibility(View.INVISIBLE);
        eTSecondHagSub.setVisibility(View.INVISIBLE);

        eTSecHagGrade.setText("1");
        eTSecondHagSub.setText("dodge");
        numHug = 1;
        s5or1 = false;
        hug3 = false;

    }

    public void clickedhagshni(View view)
    {
        eTSecHagGrade.setVisibility(View.VISIBLE);
        rB5or0first.setVisibility(View.VISIBLE);
        rB5or0Second.setVisibility(View.VISIBLE);
        eTSecondHagSub.setVisibility(View.VISIBLE);

        eTSecHagGrade.setText("");
        eTSecondHagSub.setText("");
        numHug = 2;
        s5or1 = true;
        hug3 = false;

    }


    public void clickedNothird(View view)
    {
        eTSecondHagSub.setVisibility(View.INVISIBLE);
        eTSecHagGrade.setVisibility(View.INVISIBLE);

        eTSecondHagSub.setText("dodge");
        eTSecHagGrade.setText("1");

        numHug = 2;
        s5or0 = false;
        hug3 = false;


    }

    public void clikedYesThird(View view) {
        eTSecondHagSub.setVisibility(View.VISIBLE);
        eTSecHagGrade.setVisibility(View.VISIBLE);

        eTSecondHagSub.setText("");
        eTSecHagGrade.setText("");
        numHug = 3;
        s5or0 = true;

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
        if(checkInput())
        {
            Intent dodge = new Intent(this,ThirdScreen.class);
            dodge.putExtra("subjectFirst",subjectFirst);
            dodge.putExtra("subjectSecond", subjectSecond);
            dodge.putExtra("subjectThird", subjectThird);

            dodge.putExtra("gradeHebrew",gradeHebrew);
            dodge.putExtra("gradeSafrut",gradeSafrut);
            dodge.putExtra("gradeHistory",gradeHistory);
            dodge.putExtra("gradeEzrahut",gradeEzrahut);
            dodge.putExtra("gradeBible",gradeBible);

            dodge.putExtra("mathGrade",gradeMath);
            dodge.putExtra("englishGrade",gradeEnglish);
            dodge.putExtra("mathUnits", unitsMath);
            dodge.putExtra("englishUnits", unitsEngish);

            dodge.putExtra("gradeFirst", gradeFirst);
            dodge.putExtra("gradeSecond", gradeSecond);
            dodge.putExtra("gradeThird", gradeThird);
            dodge.putExtra("numHug",numHug);
            dodge.putExtra("is3",hug3);
            dodge.putExtra("name",name) ;
            startActivity(dodge);
        }
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
        gradeThird = Integer.parseInt(eTSecHagGrade.getText().toString());

        unitsMath = Integer.parseInt(eTUnitsMath.getText().toString());
        unitsEngish = Integer.parseInt(eTUnitsEng.getText().toString());

        subjectFirst = eTSubjectFirst.getText().toString();
        subjectSecond = eTSubjectSecond.getText().toString();
        subjectThird = eTSecondHagSub.getText().toString();

        if(unitsMath < 3 || unitsMath > 5 || unitsEngish < 3 || unitsEngish > 5)
        {
            Toast.makeText(this, "One or more of the units is wrong", Toast.LENGTH_LONG).show();
            return false;
        }
        if(gradeMath < 0 ||gradeMath > 100 || gradeEnglish < 0 ||gradeEnglish > 100 || gradeFirst < 0 ||gradeFirst > 100 || gradeSecond < 0 ||gradeSecond > 100 || gradeThird < 0 ||gradeThird > 100)
        {
            Toast.makeText(this, "One or more of the grades are wrong", Toast.LENGTH_LONG).show();
            return false;
        }
        if(!(containsOnlyLetters(subjectFirst) && containsOnlyLetters(subjectSecond) && containsOnlyLetters(subjectThird)))
        {
            Toast.makeText(this, "One or more of the subjects are wrong", Toast.LENGTH_LONG).show();
            return false;
        }
        return true;
    }


    public void goBackToFirst(View view) {
        if(checkInput()) {
            gi.putExtra("mathGrade", gradeMath);
            gi.putExtra("englishGrade", gradeEnglish);
            gi.putExtra("mathUnits", unitsMath);
            gi.putExtra("englishUnits", unitsEngish);

            gi.putExtra("subjectFirst", subjectFirst);
            gi.putExtra("subjectSecond", subjectSecond);
            gi.putExtra("subjectThird", subjectThird);

            gi.putExtra("gradeFirst", gradeFirst);
            gi.putExtra("gradeSecond", gradeSecond);
            gi.putExtra("gradeThird", gradeThird);
            gi.putExtra("s5or1",s5or1);
            gi.putExtra("s5or0",s5or0);

            gi.putExtra("numHug", numHug);


            setResult(RESULT_OK,gi);
            finish();

        }
    }

    public static void checkminus(EditText et, int grade)
    {
        if(grade == -1)
        {
            et.setText("");
        }
        else
        {
            et.setText(grade + "");
        }
    }
}