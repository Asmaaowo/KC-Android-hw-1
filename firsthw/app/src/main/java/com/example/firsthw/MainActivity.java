package com.example.firsthw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText numm = findViewById(R.id.num);
        EditText sosoo = findViewById(R.id.so);
        EditText idkk = findViewById(R.id.idk);
        EditText hi = findViewById(R.id.huh);
        Button op = findViewById(R.id.button2);
        TextView s = findViewById(R.id.textView5);
        Button button3 = findViewById(R.id.button3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                startActivity(getIntent());
            }
        });

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(numm.getText().toString());
                int num2 = Integer.parseInt(sosoo.getText().toString());
                int num3 = Integer.parseInt(idkk.getText().toString());
                int num4 = Integer.parseInt(hi.getText().toString());

                int result = num1 + num2 + num3 + num4;
                s.setText(String.valueOf(result));
            }
        });
    }
}