package flyway.reminderapp.com.reminderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TimePicker;


public class AddInfo extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_info);




        //EditView Herre
        EditText textInput = (EditText) findViewById(R.id.inputText);


        //TextClock add the time
        TimePicker clock = (TimePicker) findViewById(R.id.timePicker);






    //DatePicker add the date
//        DatePicker date = (DatePicker) findViewById(R.id.datePicker);
    }

    //on button clicked method
    public void nextActivity(View view){
        Log.i("TApped", "Clicked");
        Intent intent = new Intent(AddInfo.this, MainActivity2.class);
        //Start the activity
        startActivity(intent);
    }
}
