package com.example.calculator;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;
    Button btn0;
    Button btnAdd;
    Button btnSub;
    Button btnMul;
    Button btnDiv;
    Button btnEqual;
    Button btnClr;
    Button btnDot;
    EditText edi;

    float result1;
    float result2;
    boolean Add;
    boolean Sub;
    boolean Div;
    boolean Mul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.AbtnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDot = (Button) findViewById(R.id.btnDot);
        btnEqual = (Button) findViewById(R.id.btneqal);
        btnClr = (Button) findViewById(R.id.btnClr);
        edi = (EditText) findViewById(R.id.editText);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + "0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText(edi.getText() + ".");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edi != null) {

                    result1 = Float.parseFloat(edi.getText() + "");
                    Add = true;
                    edi.setText(null);
                }
                if (edi == null) {
                    assert false;
                    edi.setText("");
                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edi != null) {

                    result1 = Float.parseFloat(edi.getText() + "");
                    Sub = true;
                    edi.setText(null);
                }
                if (edi == null) {
                    assert false;
                    edi.setText("");
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edi != null) {

                    result1 = Float.parseFloat(edi.getText() + "");
                    Mul = true;
                    edi.setText(null);
                }
                if (edi == null) {
                    assert false;
                    edi.setText("");
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edi != null) {

                    result1 = Float.parseFloat(edi.getText() + "");
                    Div = true;
                    edi.setText(null);
                }
                if (edi == null) {
                    assert false;
                    edi.setText("");
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2 = Float.parseFloat(edi.getText() + "");
                if (Add) {
                    edi.setText(result1 + result2 + "");
                    Add = false;
                }
                if (Sub) {
                    edi.setText(result1 - result2 + "");
                    Sub = false;
                }
                if (Mul) {
                    edi.setText(result1 * result2 + "");
                    Mul = false;
                }
                if (Div) {
                    edi.setText(result1 / result2 + "");
                    Div = false;
                }
            }
        });
        btnClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edi.setText("");
            }
        });

    }

}