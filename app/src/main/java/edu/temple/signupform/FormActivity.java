package edu.temple.signupform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView name = findViewById(R.id.txtName);
        TextView email = findViewById(R.id.txtEmail);
        final TextView password = findViewById(R.id.txtPassword);
        final TextView confirmPassword = findViewById(R.id.txtConfirm);

        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Must enter a name", Toast.LENGTH_LONG).show();
                }
                else if (email.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Must enter a name", Toast.LENGTH_LONG).show();
                }
                else if (password.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Must enter a name", Toast.LENGTH_LONG).show();
                }
                else if (confirmPassword.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Must enter a name", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}