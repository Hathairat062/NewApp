package projectandroid.coe.newapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Times extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Weekday", "Weekend",
        "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December",
        "Morning"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_times);


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
                Toast.makeText(this, "วันจันทร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t1);
                mMedia.start();
                break;
            case  1:
                Toast.makeText(this, "วันอังคาร", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t2);
                mMedia.start();
                break;
            case  2:
                Toast.makeText(this, "วันพุธ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t3);
                mMedia.start();
                break;
            case  3:
                Toast.makeText(this, "วันพฤหัสบดี", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t4);
                mMedia.start();
                break;
            case  4:
                Toast.makeText(this, "วันศุกร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t5);
                mMedia.start();
                break;
            case  5:
                Toast.makeText(this, "วันเสาร์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t6);
                mMedia.start();
                break;
            case  6:
                Toast.makeText(this, "วันอาทิตย์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t7);
                mMedia.start();
                break;
            case  7:
                Toast.makeText(this, "วันทำงาน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t8);
                mMedia.start();
                break;
            case  8:
                Toast.makeText(this, "วันเสาร์-อาทิตย์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t9);
                mMedia.start();
                break;
            case  9:
                Toast.makeText(this, "เดือนมกราคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t10);
                mMedia.start();
                break;
            case  10:
                Toast.makeText(this, "เดือนกุมภาพันธ์", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t11);
                mMedia.start();
                break;
            case  11:
                Toast.makeText(this, "เดือนมีนาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t12);
                mMedia.start();
                break;
            case  12:
                Toast.makeText(this, "เดือนเมษายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t13);
                mMedia.start();
                break;
            case  13:
                Toast.makeText(this, "เดือนพฤษภาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t14);
                mMedia.start();
                break;
            case  14:
                Toast.makeText(this, "เดือนมิถุนายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t15);
                mMedia.start();
                break;
            case  15:
                Toast.makeText(this, "เดือนกรกฎาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t16);
                mMedia.start();
                break;
            case  16:
                Toast.makeText(this, "เดือนสิงหาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t17);
                mMedia.start();
                break;
            case  17:
                Toast.makeText(this, "เดือนกันยายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t18);
                mMedia.start();
                break;
            case  18:
                Toast.makeText(this, "เดือนเดือนตุลาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t19);
                mMedia.start();
                break;
            case  19:
                Toast.makeText(this, "เดือนพฤศจิกายน", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t20);
                mMedia.start();
                break;
            case  20:
                Toast.makeText(this, "เดือนธันวาคม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Times.this, R.raw.t21);
                mMedia.start();
                break;


        }
    }


}
