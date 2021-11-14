package com.example.myapp_drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class BMIActivity extends AppCompatActivity {
    EditText e1, e2;
    TextView t1;
    double num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiactivity);
    }
    public boolean getNumbers() {

        // defining the edit text 1 to e1
        e1 = (EditText) findViewById(R.id.etext1);

        // defining the edit text 2 to e2
        e2 = (EditText) findViewById(R.id.etext2);

        // defining the text view to t1
        t1 = (TextView) findViewById(R.id.result);

        // taking input from text box 1
        String s1 = e1.getText().toString();

        // taking input from text box 2
        String s2 = e2.getText().toString();

        // condition to check if box is not empty
        if ((s1.equals(null) && s2.equals(null))
                || (s1.equals("") && s2.equals(""))) {

            String result = "Please enter a value";
            t1.setText(result);

            return false;
        } else {
            // converting string to int.
            num1 = Double.parseDouble(s1);

            // converting string to int.
            num2 = Double.parseDouble(s2);
        }

        return true;
    }
    public void doSum(View v) {

        // get the input numbers
        if (getNumbers()) {
            double sum = (double) (num1 / Math.pow(num2, 2));
            t1.setText(Double.toString(sum));
            if (sum < 18.5)
            {ExampleDialog exampleDialog = new ExampleDialog();
                exampleDialog.show(getSupportFragmentManager(), "example dialog");

            } else if (sum >= 18.5 && sum <= 24.9) {


            } else if (sum >= 25 && sum <= 29.9) {

            } else if (sum >= 30 && sum <= 34.9) {

            } else {

            }
        }
    }
}