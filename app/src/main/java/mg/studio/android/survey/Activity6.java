package mg.studio.android.survey;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

public class Activity6 extends AppCompatActivity {
    EditText temp;
    static String report6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question_six);
        temp=findViewById(R.id.txt6_1);
    }
    public void clicked6(View view){

        report6=temp.getText().toString();
        if(report6.equals("")) {
            Toast.makeText(Activity6.this,"Please input your answers.",Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(this, Activity7.class);
            startActivity(intent);
        }

        MainActivity.allactivities.add(this);
    }
}

