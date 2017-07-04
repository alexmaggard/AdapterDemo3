package com.example.a660252397.adapterdemo3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AdapterDemoActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_demo);

        //get listview object
        listView = (ListView) findViewById(R.id.listView);

        String [] values = getResources().getStringArray(R.array.list_adapter_array);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                android.R.id.text1, values);
        //assign adapter to the list view
        listView.setAdapter(adapter);

        //listview item click listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                int itemPosition = position +1;

                String itemValue = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),
                        "Position: " + itemPosition + "\n" +"ListItem: " +
                                itemValue, Toast.LENGTH_LONG).show();
            }
        });

    }
}
