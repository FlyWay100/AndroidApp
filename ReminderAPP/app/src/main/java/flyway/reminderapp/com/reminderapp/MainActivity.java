package flyway.reminderapp.com.reminderapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final ListView myListView = (ListView) findViewById(R.id.listView);

        final ArrayList<String> myArray = new ArrayList<String>();


        myArray.add("John");
        myArray.add("Cena");
        myArray.add("Robert");
        myArray.add("Myself");


        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, myArray);
        myListView.setAdapter(itemsAdapter);

        //make it so that when an item is clicked does something
        myListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

//                Log.i("clicked on: ", myArray.get(position));

                Intent info = new Intent(MainActivity.this, AddInfo.class);
                //start the activity now or it won't work
                startActivity(info);
            }
        });




    }
}
