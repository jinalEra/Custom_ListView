package android.example.simplelistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String fruits [] = {"Apple", "Banana", "Strawberry", "Guava", "Graps"};
    ListView listview;

    final Button gotoCustom = findViewById(R.id.gotoCustom);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        gotoCustom.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent iv = new Intent(MainActivity.this, MainActivity2.class);
//                startActivity(iv);
//            }
//        });

        listview = findViewById(R.id.listviewid);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_simpe_list_view, R.id.listitem, fruits);
        listview.setAdapter(arrayAdapter);
    }
}