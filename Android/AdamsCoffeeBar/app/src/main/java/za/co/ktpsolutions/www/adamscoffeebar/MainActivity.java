package za.co.ktpsolutions.www.adamscoffeebar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button login;
    Button register;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (Button) findViewById(R.id.btn_login);
        register = (Button) findViewById(R.id.btn_register);
        username = (EditText) findViewById(R.id.et_username);
        password = (EditText) findViewById(R.id.et_password_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LandingActivity.class));
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RegisterActivity.class));
            }
        });

    }


}
