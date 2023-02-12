package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "nhu";
    private Button btnDangnhap;
    private EditText editTextname;
    private EditText editTextpass;
    private TextView txtNoiDung1;
    private Button btnBai3;
    private EditText editTextBai3;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

       /* btnDangnhap = (Button) findViewById(R.id.btnDangNhap);
        editTextname = (EditText) findViewById(R.id.editTextName);
        editTextpass = (EditText) findViewById(R.id.editTextPassword);*/
        btnBai3 =(Button)findViewById(R.id.btnBai3);
        editTextBai3 = (EditText) findViewById(R.id.editTextBai3);
        textView2 =(TextView)findViewById(R.id.textView2);
/*        btnDangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editTextname.getText().toString().equals("admin")
                        && editTextpass.getText().toString().equals("admin")) {
                    //txtNoiDung1.setText("Đăng nhập thành công!");
                    Toast.makeText(MainActivity.this, "Đăng nhập thành công!", Toast.LENGTH_SHORT).show();
                } else {
                   // txtNoiDung1.setText("Đăng nhập thất bại" +
                     //       editTextpass.getText().toString());
                    Toast.makeText(MainActivity.this, "Đăng nhập thất bại!", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
        List<Integer> arrays = new ArrayList<>();
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n = Integer.parseInt(editTextBai3.getText().toString());
                String kq ="";
                for(int i=0;i<n;i++)
                {
                    arrays.add((int)(Math.random()*100 +1));
                }
                for(int i=0;i<arrays.size();i++)
                {
                    if (isPrime(arrays.get(i))==true) {
                        kq=kq+" "+arrays.get(i).toString();
                    }
                }
                textView2.setText(kq);
                Toast.makeText(MainActivity.this,kq, Toast.LENGTH_SHORT).show();
              /*  String n = editTextBai3.getText().toString();
                String[] list = n.split(" ");
                int i = 0;
                for (String s : list) {
                    if (isPrime(Integer.valueOf(s)))
                        Log.d("Element " + i++, s);
                }*/

                /*if(isPrime(Integer. parseInt(editTextBai3.getText().toString()))==true)
                {
                    textView2.setText("So nguyen to");
                    Toast.makeText(MainActivity.this, "Số nguyên tố", Toast.LENGTH_SHORT).show();
                }
                else {
                    textView2.setText("Khong phai nguyen to ");
                    Toast.makeText(MainActivity.this, "Không phải số nguyên tố", Toast.LENGTH_SHORT).show();
                }*/
            }
        });


    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}