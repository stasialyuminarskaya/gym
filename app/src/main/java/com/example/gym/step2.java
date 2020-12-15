package com.example.gym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class step2 extends AppCompatActivity {

    public static int MaleOfFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
        MaleOfFemale = 2;
    }
    public void PressMale(View view){
        MaleOfFemale = 1;
    }
    public void PressFemale(View view){
        MaleOfFemale = 0;
    }
    public void GoToStepThree(View view){
        if (MaleOfFemale == 1){
            Intent intent = new Intent(this, step3m.class);
            startActivity(intent);
        }
        else if(MaleOfFemale == 0){
            Intent intent = new Intent(this, step3f.class);
            startActivity(intent);
        }
        else {
            Toast.makeText(getApplicationContext(), "You have not chosen a gender!", Toast.LENGTH_LONG).show();
        }

    }
}