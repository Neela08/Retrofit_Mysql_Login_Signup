package com.bitwisey.retrofit_mysql_login_signup;

import android.app.ProgressDialog;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.Toast;

import com.bitwisey.retrofit_mysql_login_signup.Networking.Client;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RegisterActivity extends AppCompatActivity {
EditText name,user,password,phone;String name1,user1,password1,phone1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
      /**  Window window = RegisterActivity.this.getWindow();

        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

        window.setStatusBarColor(ContextCompat.getColor(RegisterActivity.this,R.color.white));**/


        name=(EditText)findViewById(R.id.editName);
        user=(EditText)findViewById(R.id.edituser);
        password=(EditText)findViewById(R.id.editpass);
        phone=(EditText)findViewById(R.id.editphone);


    }

    public void save(View view) {
        insertInfo();

    }
    public void insertInfo()
    {

        name1=name.getText().toString();
        user1=user.getText().toString();
        password1=password.getText().toString();
        phone1=phone.getText().toString();
        if (name1.isEmpty()) {
            name.setError("Enter name");
            name.requestFocus();
            return;
        }
        if (user1.isEmpty()) {
            user.setError("Enter User Name");
            user.requestFocus();
            return;
        }
        if (password1.isEmpty()) {
            password.setError("Enter Password");
            password.requestFocus();
            return;
        }
        if (phone1.isEmpty()) {
            phone.setError("Enter phone Number");
            phone.requestFocus();
            return;
        }

        Call<ResponseBody> call=Client.getInstance().getMyApi().register(name1,user1,password1,phone1);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                Toast.makeText(RegisterActivity.this,"Registration Successful",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(RegisterActivity.this,"Something went wrong, Please try again later",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
