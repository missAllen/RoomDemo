package com.example.seele.roomdemo;

import android.app.FragmentBreadCrumbs;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.seele.bean.ToastUtils;
import com.example.seele.bean.Users;

public class MainActivity extends AppCompatActivity {
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"onCreate",Toast.LENGTH_SHORT).show();
        tv = (TextView) findViewById(R.id.tv);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Users users = new Users.UserBuilder("李","恒")
                        .age(23)
                        .gender("男")
                        .phoneNumber("13827455247")
                        .contry().build();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_SHORT).show();
    }
}
