package com.example.jocelyn.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Hold info about the expression to calculate */
    int operand1 = 0;
    int operand2 = 0;
    String operator = "";
    boolean onOperand1 = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /* Display the expression to the screen of the calculator */
    private void display( String expression ) {
        TextView textView = (TextView) findViewById( R.id.textView2 );
        textView.setText( expression );
    }

    /* Adds a number 0 to the end of the number */
    public void number0(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 1 to the end of the number */
    public void number1(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 1;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 1;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 2 to the end of the number */
    public void number2(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 2;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 2;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 3 to the end of the number */
    public void number3(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 3;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 3;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 4 to the end of the number */
    public void number4(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 4;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 4;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 5 to the end of the number */
    public void number5(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 5;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 5;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 6 to the end of the number */
    public void number6(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 6;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 6;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 7 to the end of the number */
    public void number7(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 7;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 7;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 8 to the end of the number */
    public void number8(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 8;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 8;
            display( operand1 + operator + operand2 );
        }
    }

    /* Adds a number 9 to the end of the number */
    public void number9(View view) {
        if( onOperand1 ) {
            operand1 = operand1*10 + 9;
            display( "" + operand1 );
        }
        else {
            operand2 = operand2*10 + 9;
            display( operand1 + operator + operand2 );
        }
    }

    /* Appends a plus sign to the expression */
    public void add(View view) {
        onOperand1 = false;
        operator = "+";
        display( operand1 + operator );
    }

    /* Appends a subtract sign to the expression */
    public void subtract(View view) {
        onOperand1 = false;
        operator = "-";
        display( operand1 + operator );
    }

    public void multiply(View view) {
        onOperand1 = false;
        operator = "*";
        display( operand1 + operator );
    }

    public void divide(View view) {
        onOperand1 = false;
        operator = "/";
        display( operand1 + operator );
    }

    public void mod(View view) {
        onOperand1 = false;
        operator = "%";
        display( operand1 + operator );
    }

    public void delete(View view) {
        if( onOperand1 ) {
            operand1 /= 10;
            display( "" + operand1 );
        }
        else {
            operand2 /= 10;
            if (operand2 == 0) {
                onOperand1 = true;
                display(operand1 + operator);
            } else {
                display(operand1 + operator + operand2);

            }
        }
    }

    public void clear(View view) {
        operand1 = 0;
        operand2 = 0;
        operator = "";
        display( operand1 + "" );
    }

    public void answer(View view) {
        double ans = 0;

        if( operator == "" ) return;

        switch( operator ) {

            case "+":
                ans = operand1 + operand2;
                break;
            case "-":
                ans = operand1 - operand2;
                break;
            case "*":
                ans = operand1 * operand2;
                break;
            case "/":
                if( operand2 != 0 ) ans = operand1 / operand2;
                else ans = 0;
                break;
            case "%":
                ans = operand1 % operand2;
                break;

        }

        display( operand1 + operator + operand2 + "=" + ans );

        operand1 = 0;
        operand2 = 0;
        operator = "";
        onOperand1 = true;
    }



}
