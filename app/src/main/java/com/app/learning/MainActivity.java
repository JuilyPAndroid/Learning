package com.app.learning;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edt_name ,edt_address,edt_phn,edt_email;
    Button btn_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_name=findViewById(R.id.edt_name);
        edt_address=findViewById(R.id.edt_address);
        edt_phn=findViewById(R.id.edt_phn);
        edt_email=findViewById(R.id.edt_email);
        btn_add=findViewById(R.id.btn_add);
        //set on click listener
      btn_add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              String name=edt_name.getText().toString();
              String address=edt_address.getText().toString();
              String phone=edt_phn.getText().toString();
              String email=edt_email.getText().toString();
              String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
              if (name.equals(""))
              {
                  edt_name.setError("Enter Name");
              }
             else if (address.equals(""))
              {
                  edt_address.setError("Enter Address");
              }
             else if (phone.equals(""))
              {
                  edt_phn.setError("Enter Phone Number");
              }
             else if (email.equals(""))
              {
                  edt_email.setError("Enter Email");
              }
             else if (!email.matches(emailPattern))
              {
                  edt_email.setError("Enter Valid Email Id");
              }

             else
              {
                  Toast.makeText(MainActivity.this, "Ok", Toast.LENGTH_SHORT).show();
              }
             // Toast.makeText(MainActivity.this, "Name- " +name, Toast.LENGTH_SHORT).show();
          }
      });

    }
}