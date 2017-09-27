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

public class Number extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;
    MediaPlayer mMedia;
    private ArrayAdapter adapter;
    String[] strings = {
            "one", "two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
            "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", "Twenty"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);


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
                Toast.makeText(this, "หนึง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n1);
                mMedia.start();
                break;
            case  1:
                Toast.makeText(this, "สอง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n2);
                mMedia.start();
                break;
            case  2:
                Toast.makeText(this, "สาม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n3);
                mMedia.start();
                break;
            case  3:
                Toast.makeText(this, "สี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n4);
                mMedia.start();
                break;
            case  4:
                Toast.makeText(this, "ห้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n5);
                mMedia.start();
                break;
            case  5:
                Toast.makeText(this, "หก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n6);
                mMedia.start();
                break;
            case  6:
                Toast.makeText(this, "เจ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n7);
                mMedia.start();
                break;
            case  7:
                Toast.makeText(this, "เแปด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n8);
                mMedia.start();
                break;
            case  8:
                Toast.makeText(this, "เก้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n9);
                mMedia.start();
                break;
            case  9:
                Toast.makeText(this, "สิบ", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n10);
                mMedia.start();
                break;
            case  10:
                Toast.makeText(this, "สิบเอ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n11);
                mMedia.start();
                break;
            case  11:
                Toast.makeText(this, "สิบสอง", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n12);
                mMedia.start();
                break;
            case  12:
                Toast.makeText(this, "สิบสาม", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n13);
                mMedia.start();
                break;
            case  13:
                Toast.makeText(this, "สิบสี่", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n14);
                mMedia.start();
                break;
            case  14:
                Toast.makeText(this, "สิบห้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n15);
                mMedia.start();
                break;
            case  15:
                Toast.makeText(this, "สิบหก", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n16);
                mMedia.start();
                break;
            case  16:
                Toast.makeText(this, "สิบเจ็ด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n17);
                mMedia.start();
                break;
            case  18:
                Toast.makeText(this, "สิบแปด", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n19);
                mMedia.start();
                break;
            case  19:
                Toast.makeText(this, "สิบเก้า", Toast.LENGTH_LONG).show();
                mMedia = MediaPlayer.create(Number.this, R.raw.n20);
                mMedia.start();
                break;

        }

    }


};




