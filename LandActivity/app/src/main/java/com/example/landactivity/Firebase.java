package com.example.landactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Firebase extends AppCompatActivity {

    EditText editTextName;
    EditText editTextCitizen;
    EditText editTextLocation;
    EditText editTextArea;
    EditText editTextTax;
    Button buttonRegister;

    DatabaseReference databaseLandOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firebase);

        databaseLandOwner= FirebaseDatabase.getInstance().getReference("LandOwner");

        editTextName=(EditText)findViewById(R.id.editTextName);
        editTextCitizen=(EditText)findViewById(R.id.editTextCitizen);
        editTextLocation=(EditText)findViewById(R.id.editTextLocation);
        editTextArea=(EditText)findViewById(R.id.editTextArea);
        editTextTax=(EditText)findViewById(R.id.editTextTax);

        buttonRegister=(Button) findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Register();
            }
        });
    }

    private void Register(){

        String name=editTextName.getText().toString().trim();
        String citizen=editTextCitizen.getText().toString().trim();
        String location=editTextLocation.getText().toString().trim();
        String area=editTextArea.getText().toString().trim();
        String tax = editTextTax.getText().toString().trim();

        if(!TextUtils.isEmpty(name) || !TextUtils.isEmpty(citizen) || !TextUtils.isEmpty(location)
                || !TextUtils.isEmpty(area) || !TextUtils.isEmpty(tax)){
            String id=databaseLandOwner.push().getKey();
            LandOwner landowner=new LandOwner(name,location,area,citizen,tax);
            databaseLandOwner.child(id).setValue(landowner);
            Toast.makeText(this,"Data added",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"You should enter all data",Toast.LENGTH_LONG).show();
        }
    }
}
