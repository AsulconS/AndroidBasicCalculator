package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    Button button0, button1, button2, button3, button4, button5, button6,
           button7, button8, button9, buttonAdd, buttonSub, buttonDiv,
           buttonMul, button10, buttonC, buttonEql;

    EditText editText;

    float val0, val1;

    boolean isAdding, isSubtracting, isMultiplying, isDividing;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSub = (Button) findViewById(R.id.buttonSub);
        buttonMul = (Button) findViewById(R.id.buttonMul);
        buttonDiv = (Button) findViewById(R.id.buttonDiv);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEql = (Button) findViewById(R.id.buttonEql);
        editText = (EditText) findViewById(R.id.editText);

        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "8");
            }
        });

        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(editText.getText() == null)
                    editText.setText("");
                else
                {
                    val0 = Float.parseFloat(editText.getText() + "");
                    isAdding = true;
                    editText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(editText.getText() == null)
                    editText.setText("");
                else
                {
                    val0 = Float.parseFloat(editText.getText() + "");
                    isSubtracting = true;
                    editText.setText(null);
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(editText.getText() == null)
                    editText.setText("");
                else
                {
                    val0 = Float.parseFloat(editText.getText() + "");
                    isMultiplying = true;
                    editText.setText(null);
                }
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(editText.getText() == null)
                    editText.setText("");
                else
                {
                    val0 = Float.parseFloat(editText.getText() + "");
                    isDividing = true;
                    editText.setText(null);
                }
            }
        });

        buttonEql.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                val1 = Float.parseFloat(editText.getText() + "");

                if(isAdding)
                {
                    editText.setText(val0 + val1 + "");
                    isAdding = false;
                }

                if(isSubtracting)
                {
                    editText.setText(val0 - val1 + "");
                    isSubtracting = false;
                }

                if(isMultiplying)
                {
                    editText.setText(val0 * val1 + "");
                    isMultiplying = false;
                }

                if(isSubtracting)
                {
                    editText.setText(val0 / val1 + "");
                    isSubtracting = false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                editText.setText(editText.getText() + ".");
            }
        });
    }
}
