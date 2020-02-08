package com.example.studentportal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Login extends AppCompatActivity {

    EditText username,password;
    Button login;

    ArrayList<User> users = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=findViewById(R.id.stud_id);
        password=findViewById(R.id.stud_pass);
        login=findViewById(R.id.login);
        addUsers();

    }
    private void addUsers()
    {
        User usr1 = new User();
        usr1.setUsername("shivam");
        usr1.setPassword("shivam");
        User usr2 = new User();
        usr2.setUsername("neeru");
        usr2.setPassword("neeru");
        User usr3 = new User();
        usr3.setUsername("tarunpreet");
        usr3.setPassword("tarunpreet");
        User usr4 = new User();
        usr4.setUsername("sai");
        usr4.setPassword("sai");
        User usr5 = new User();
        usr5.setUsername("sangamesh");
        usr5.setPassword("sangamesh");
        users.add(usr1);
        users.add(usr2);
        users.add(usr3);
        users.add(usr4);
        users.add(usr5);
    }

    public void onClickLogin(View v) {
        final String uname = username.getText().toString();
        String pass = password.getText().toString();
        List<User> filteredUser = users.stream().filter(p->p.username.equals(uname) && p.password.equals(pass)).collect(Collectors.toList());
        if(filteredUser.size()>0)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this, "Wrong Username or Password", Toast.LENGTH_LONG).show();
        }
    }

}


