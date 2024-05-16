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
    int unitsMath, unitsEngish;
    Intent gi;
    String name, subjectFirst, subjectSecond, subjectThird;

    int numHug = 1;
    int RESULT_OK = 369;

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
        //name = gi.getStringExtra("Name", "");

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

        eTSecHagGrade.setText("1");
        eTSecondHagSub.setText("dodge");
        numHug = 1;
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
    }

    public void clickedNothird(View view)
    {
        eTSecondHagSub.setVisibility(View.INVISIBLE);
        eTSecHagGrade.setVisibility(View.INVISIBLE);

        eTSecondHagSub.setText("dodge");
        eTSecHagGrade.setText("1");


        numHug = 2;

    }

    public void clikedYesThird(View view) {
        eTSecondHagSub.setVisibility(View.VISIBLE);
        eTSecHagGrade.setVisibility(View.VISIBLE);

        eTSecondHagSub.setText("");
        eTSecHagGrade.setText("");
        numHug = 3;
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

    public void clickedGoToFirst(View view)
    {
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

            gi.putExtra("numHug", numHug);

            setResult(RESULT_OK,gi);
            finish();

        }
    }
}