package fr.Daysuk.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonPercent,button0,buttonComa,button1,button2,button3,button4,button5,button6,button7,button8,button9,buttonC,buttonSlash,buttonX,buttonLittleLess,buttonLess,buttonMore,buttonEquals;
    TextView TextString,TextResult;
    String Stringtocalc;
    double result;
    Service service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextString = (TextView)findViewById(R.id.TextString);
        TextResult = (TextView)findViewById(R.id.TextResult);

        buttonPercent = (Button)findViewById(R.id.buttonPercent);
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Stringtocalc = TextString.getText().toString();
                TextString.setText("");

                service = new Service(Stringtocalc);
                result = service.getPercent();

                TextResult.setText(String.valueOf(result));
            }
        });

        button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "0");
            }
        });

        buttonComa = (Button)findViewById(R.id.buttonComa);
        buttonComa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + ".");
            }
        });

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "1");
            }
        });

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "2");
            }
        });

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "3");
            }
        });

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "4");
            }
        });

        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "5");
            }
        });

        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "6");
            }
        });

        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "7");
            }
        });

        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "8");
            }
        });

        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "9");
            }
        });

        buttonC = (Button)findViewById(R.id.buttonC);
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText("");
            }
        });

        buttonSlash = (Button)findViewById(R.id.buttonSlash);
        buttonSlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "/");
            }
        });

        buttonX = (Button)findViewById(R.id.buttonX);
        buttonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "X");
            }
        });

        buttonLittleLess = (Button)findViewById(R.id.buttonLittleLess);
        buttonLittleLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "-");
            }
        });

        buttonLess = (Button)findViewById(R.id.buttonLess);
        buttonLess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "-");
            }
        });

        buttonMore = (Button)findViewById(R.id.buttonMore);
        buttonMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextString.setText(TextString.getText().toString() + "+");
            }
        });

        buttonEquals = (Button)findViewById(R.id.buttonEquals);
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Stringtocalc = TextString.getText().toString();
                TextString.setText("");

                service = new Service(Stringtocalc);
                result = service.getResult();

                TextResult.setText(String.valueOf(result));
            }
        });

    }
}
