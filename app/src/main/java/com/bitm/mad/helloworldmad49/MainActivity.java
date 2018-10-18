package com.bitm.mad.helloworldmad49;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    private TextView TextView1;
    private EditText ETName;
    private EditText ETPhone;
    private EditText ETEmail;
    private EditText ETCity;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView1 = findViewById(R.id.TextView1);
        ETName = findViewById(R.id.ETName);
        ETPhone = findViewById(R.id.ETPhone);
        ETEmail = findViewById(R.id.ETEmail);
        ETCity = findViewById(R.id.ETCity);
      // String text = TextView1.getText().toString();

    }

    public void save(View view){
        String name = ETName.getText().toString();
        String phone = ETPhone.getText().toString();
        String email = ETEmail.getText().toString();
        String city = ETCity.getText().toString();

        if (name.isEmpty()){
            ETName.setError("Enter name");
            return;
        }

        if (phone.isEmpty()){
            ETPhone.setError("Enter Phone Number");
            return;
        }
        if (email.isEmpty()){
            ETEmail.setError("Enter Email");
            return;
        }
        if (city.isEmpty()){
            ETCity.setError("Enter City");
            return;
        }

        Person p = new Person(name,phone,email,city);
        TextView1.setText(p.toString());





    }
}
