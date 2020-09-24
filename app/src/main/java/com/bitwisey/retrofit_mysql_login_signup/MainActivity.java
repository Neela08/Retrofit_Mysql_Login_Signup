package com.bitwisey.retrofit_mysql_login_signup;

import android.arch.lifecycle.AndroidViewModel;
import android.content.Intent;

import android.os.Build;
import android.os.Bundle;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.bitwisey.retrofit_mysql_login_signup.Model.RetroInfo;
import com.bitwisey.retrofit_mysql_login_signup.Networking.Client;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

   EditText ed1,ed2;
   TextView tv1,tv2,tv3;
   String name1,pass1;
   Button logoutbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       ed1=(EditText)findViewById(R.id.editText1);
       ed2=(EditText)findViewById(R.id.editText2);
       tv1=(TextView)findViewById(R.id.textView1);
        tv2=(TextView)findViewById(R.id.textView2);
        tv3=(TextView)findViewById(R.id.welcome);
        logoutbtn=(Button)findViewById(R.id.logout);
        logoutbtn.setVisibility(View.INVISIBLE);
        logoutbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logoutbtn.setVisibility(View.GONE);
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                Toast.makeText(MainActivity.this,"Logged Out",Toast.LENGTH_SHORT).show();
            }
        });
        //uncomment if you want to change status bar color ,requires api 21
       /** Window window = MainActivity.this.getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.white));**/


    }

    public void reg(View view) {
        Intent i=new Intent(MainActivity.this,RegisterActivity.class);
        startActivity(i);
    }
    public void save(View view)
    {
        seeProfile();
    }
    public void seeProfile()
    {
        name1=ed1.getText().toString();
        pass1=ed2.getText().toString();
        if (name1.isEmpty()) {
            ed1.setError("Enter name");
            ed1.requestFocus();
            return;
        }
        if (pass1.isEmpty()) {
            ed2.setError("Enter password");
            ed2.requestFocus();
            return;
        }

        Call<RetroInfo> call=Client.getInstance().getMyApi().logininfo(name1,pass1);

        call.enqueue(new Callback<RetroInfo>() {
            @Override
            public void onResponse(Call<RetroInfo> call, Response<RetroInfo> response) {

                RetroInfo retroInfo=response.body();
                if (retroInfo.getResponse().equals("ok")) { 
                   
                    tv3.setText("Welcome");
                    tv1.setText(retroInfo.getName());
                    tv2.setText("Your Phone Number : "+retroInfo.getPhone());
                    logoutbtn.setVisibility(View.VISIBLE);

                } else if(retroInfo.getResponse().equals("failed")){
                    
                    tv3.setText("");
                    tv1.setText("");
                    tv2.setText("");
                    Toast.makeText(MainActivity.this, retroInfo.getResponse() +", Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<RetroInfo> call, Throwable t) {

                tv1.setText("");
                tv2.setText("");
                Toast.makeText(MainActivity.this, "Something went wrong, Please try again later", Toast.LENGTH_SHORT).show();
            }
        });
    }

    }


