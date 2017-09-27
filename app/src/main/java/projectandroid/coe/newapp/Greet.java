package projectandroid.coe.newapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Greet extends AppCompatActivity implements AdapterView.OnItemClickListener{
    ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {"What's your name?", "My name is...", "Where do you com from?", "I come from...(country).",
            "How old are you?", "I'm 22 years old.", "Where are you study?", "I study at...", "Nice to meet you.",
            "I'm a college student.", "Keep in touch!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greet);

        listView = (ListView) findViewById(R.id.list);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, strings);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);

    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView tv = (TextView) view;
        final ArrayList<MediaPlayer> list = new ArrayList<>();
        if (mMedia != null) {
            mMedia.release();
        }
        switch (position) {
            case 0:
                Toast.makeText(this, "คุณชื่ออะไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g1);
                mMedia.start();
                break;
            case 1:
                Toast.makeText(this, "ฉันชื่อ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g2);
                mMedia.start();
                break;
            case 2:
                Toast.makeText(this, "คุณมาจากที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g3);
                mMedia.start();
                break;
            case 3:
                Toast.makeText(this, "ฉันมาจากประเทศ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g4);
                mMedia.start();
                break;
            case 4:
                Toast.makeText(this, "คุณอายุเท่าไร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g5);
                mMedia.start();
                break;
            case 5:
                Toast.makeText(this, "ฉันอายุ 22 ปี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g6);
                mMedia.start();
                break;
            case 6:
                Toast.makeText(this, "คุณเรียนอยู่ที่ไหน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g7);
                mMedia.start();
                break;
            case 7:
                Toast.makeText(this, "ฉันเรียนอยู่ที่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g8);
                mMedia.start();
                break;
            case 8:
                Toast.makeText(this, "ยินดีที่ได้รู้จัก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g9);
                mMedia.start();
                break;
            case 9:
                Toast.makeText(this, "ฉันเป็นนักศึกษา", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g10);
                mMedia.start();
                break;
            case 10:
                Toast.makeText(this, "ติดต่อกันอีกนะ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Greet.this, R.raw.g11);
                mMedia.start();
                break;


        }
    }
}
