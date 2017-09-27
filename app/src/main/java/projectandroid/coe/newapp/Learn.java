package projectandroid.coe.newapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Learn extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);


        String[] str = { "Number", "Times and Date", "Greeting" ,"General Conversation", "Direction and Place","Transportation",
                "Accommodation", "Emergency","Shopping","Occasion Phrases"};




        ListView listView = (ListView)findViewById(R.id.list_item);
        listView.setAdapter(new ArrayAdapter<>(this
                , android.R.layout.simple_list_item_1,str ));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch(position) {
                    case 0 :
                        intent = new Intent(getApplicationContext()
                                , Number.class);
                        startActivity(intent);
                        break;
                    case 1 :
                        intent = new Intent(getApplicationContext()
                                , Times.class);
                        startActivity(intent);
                        break;
                    case 2 :
                        intent = new Intent(getApplicationContext()
                                , Greet.class);
                        startActivity(intent);
                        break;
                    case 3 :
                        intent = new Intent(getApplicationContext()
                                , General.class);
                        startActivity(intent);
                        break;
                    case 4 :
                        intent = new Intent(getApplicationContext()
                                , Direction.class);
                        startActivity(intent);
                        break;
                }

            }
        });


       /* listView = (ListView)findViewById(R.id.list_item);
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(Learn.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.learn_names));
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Learn.this,SecondActivity.class);
                intent.putExtra("learn_names",listView.getItemAtPosition(position).toString());
                startActivity(intent);

            }
        });
        listView.setAdapter(mAdapter);*/
    }

}



