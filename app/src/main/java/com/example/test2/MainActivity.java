package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et1=(EditText)findViewById(R.id.editText1);
        EditText et2=(EditText)findViewById(R.id.editText2);
        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        TextView tv1=(TextView)findViewById(R.id.textView2);
        ImageView iv1=(ImageView)findViewById(R.id.imageView);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();
                int result=Integer.parseInt(str1)+Integer.parseInt(str2);

                String str3=str1+" + "+str2+" = "+result;
               tv1.setText(str3+"입니다");
               iv1.setImageResource(R.drawable.op1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();
                int result=Integer.parseInt(str1)-Integer.parseInt(str2);

                String str3=str1+" - "+str2+" = "+result;
                tv1.setText(str3+"입니다");
                iv1.setImageResource(R.drawable.op2);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();
                int result=Integer.parseInt(str1)*Integer.parseInt(str2);

                String str3=str1+" * "+str2+" = "+result;
                tv1.setText(str3+"입니다");
                iv1.setImageResource(R.drawable.op3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str1=et1.getText().toString();
                String str2=et2.getText().toString();
                int result=Integer.parseInt(str1)/Integer.parseInt(str2);

                String str3=str1+" / "+str2+" = "+result;
                tv1.setText(str3+"입니다");
                iv1.setImageResource(R.drawable.op4);
            }
        });

    }
}