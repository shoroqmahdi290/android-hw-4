package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.app.ProgressDialog.show;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText x = findViewById(R.id.editTextTextPersonName);
        final EditText y = findViewById(R.id.tf);
        final EditText w = findViewById(R.id.fu);
        final EditText a = findViewById(R.id.pg);
        final TextView t = findViewById(R.id.textView);
        Button cal = findViewById(R.id.button);
        Button r = findViewById(R.id.rest);

     r.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             x.setText("");
             y.setText("");
             a.setText("");
             w.setText("");
             t.setText("");
         }
     });


     cal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                double editTextTextPersonName = Double.parseDouble(x.getText().toString());
                double tf = Double.parseDouble(y.getText().toString());
                double fu = Double.parseDouble(w.getText().toString());
                double pg = Double.parseDouble(a.getText().toString());

                double sum = editTextTextPersonName + tf + fu + pg;

                if ( sum  < 60) {
                    t.setText(" F. صاقط يالحب 🤡");
                    t.setTextColor(Color.RED);

                }
                else if (sum  < 70){
                    t.setText(" D. عل حفه 😬😰");
                    t.setTextColor(Color.parseColor("#FFDD6D4A"));

                }
                else if (sum  < 80) {
                    t.setText("C. شد حيلك 😅😶");
                    t.setTextColor(Color.parseColor("#FFFBE83C"));

                }
                else if (sum  < 90){
                    t.setText("B. Good work 😎");
                    t.setTextColor(Color.BLUE);

                }
                else {
                    t.setText("A. كفووووو \uD83D\uDE0D\uD83E\uDD47 ");
                    t.setTextColor(Color.parseColor("#FF048F0A"));


                }
            }
        });
    }




}
