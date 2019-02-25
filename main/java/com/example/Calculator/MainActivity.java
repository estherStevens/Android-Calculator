package com.example.Calculator;

import android.renderscript.Sampler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.stopwatch.R;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button buttonAC;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonMinus;
    private Button buttonAdd;
    private Button buttonDecimal;
    private Button buttonEquals;
    private EditText enteredText;
    private TextView textResult;

    public String result;

    private double Value1 = Double.NaN;
    private double Value2;

    public boolean addition;
    public boolean subtraction;
    public boolean multiplication;
    public boolean divison;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button0 = (Button) findViewById(R.id.button0);
        buttonAC = (Button) findViewById(R.id.buttonAC);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonDecimal = (Button) findViewById(R.id.buttonDecimal);
        buttonEquals = (Button) findViewById(R.id.buttonEquals);
        enteredText = (EditText) findViewById(R.id.enteredText);
        textResult = (TextView) findViewById(R.id.textResult);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button0.setOnClickListener(this);
        buttonDecimal.setOnClickListener(this);
        buttonAC.setOnClickListener(this);
        buttonEquals.setOnClickListener(this);
        buttonAdd.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
    }


    private void calculation() {

/*        if (Double.isNaN(Value1)) {
            Value1 = 0;
        }*/

/*        if (enteredText.getText().toString() == "") {
            Value2 = 0;
        } else {
        }
        */

        Value2 = Double.parseDouble(enteredText.getText().toString());
        result = Double.toString(Value1) + Double.toString(Value2);
        if (subtraction == true) {
//            textResult.setText(null);
            enteredText.setText(Value1 - Value2 + "");
            subtraction = false;
            result = (Value1 - Value2 + "");
            textResult.setText(result);
        }

        if (addition == true) {
//            textResult.setText(null);
            enteredText.setText(Value1 + Value2 + "");
            addition = false;
            result = (Value1 + Value2 + "");
            textResult.setText(result);


        }

        if (multiplication == true) {
//            textResult.setText(null);
            enteredText.setText(Value1 * Value2 + "");
            multiplication = false;
            result = (Value1 * Value2 + "");
            textResult.setText(result);
        }

        if (divison == true) {
//            textResult.setText(null);
            enteredText.setText(Value1 / Value2 + "");
            divison = false;
            result = (Value1 / Value2 + "");
            textResult.setText(result);
        }
    }

    private boolean checkTextFieldIsEmpty() {
        if(enteredText.getText() + "" == "")
        {
            return true;
        }
        return false;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                enteredText.setText(enteredText.getText() + "1");
                break;

            case R.id.button2:
                enteredText.setText(enteredText.getText() + "2");
                break;

            case R.id.button3:
                enteredText.setText(enteredText.getText() + "3");
                break;

            case R.id.button4:
                enteredText.setText(enteredText.getText() + "4");
                break;

            case R.id.button5:
                enteredText.setText(enteredText.getText() + "5");
                break;

            case R.id.button6:
                enteredText.setText(enteredText.getText() + "6");
                break;

            case R.id.button7:
                enteredText.setText(enteredText.getText() + "7");
                break;

            case R.id.button8:
                enteredText.setText(enteredText.getText() + "8");
                break;

            case R.id.button9:
                enteredText.setText(enteredText.getText() + "9");
                break;

            case R.id.button0:
                enteredText.setText(enteredText.getText() + "0");
                break;

            case R.id.buttonDecimal:
                enteredText.setText(enteredText.getText() + ".");
                break;

            case R.id.buttonAC:
                enteredText.setText("");
                textResult.setText("");
                break;

            case R.id.buttonMultiply:
                if(checkTextFieldIsEmpty() == true)
                {
                    return;
                }
                calculation();
                Value1 = Double.parseDouble(enteredText.getText() + "");
                multiplication = true;
                enteredText.setText(null);

                result = Double.toString(Value1);
                textResult.setText(result);
                break;

            case R.id.buttonMinus:
                if(checkTextFieldIsEmpty() == true)
                {
                    return;
                }
                calculation();
                Value1 = Double.parseDouble(enteredText.getText() + "");
                subtraction = true;
                enteredText.setText(null);

                result = Double.toString(Value1);
                textResult.setText(result);
                break;

            case R.id.buttonAdd:
                if(checkTextFieldIsEmpty() == true)
                {
                    return;
                }
                calculation();
                Value1 = Double.parseDouble(enteredText.getText() + "");
                addition = true;
                enteredText.setText(null);

                result = Double.toString(Value1);
                textResult.setText(result);
                break;

            case R.id.buttonDivide:
                if(checkTextFieldIsEmpty() == true)
                {
                    return;
                }
                calculation();
                Value1 = Double.parseDouble(enteredText.getText() + "");
                divison = true;
                enteredText.setText(null);

                result = Double.toString(Value1);
                textResult.setText(result);
                break;

            case R.id.buttonEquals:
                if(checkTextFieldIsEmpty() == true)
                {
                    return;
                }
                calculation();
                result = Double.toString(Value1) + Double.toString(Value2);
//                textResult.setText(result);
                enteredText.setText(null);
                break;
        }
    }
}
