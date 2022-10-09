package android.example.simplelistviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    String fruitName[] = {"Apple", "Banana", "Mango", "Orange", "Pemgranant", "Watermelon" };
    String prices[] = {"150", "50", "100", "80", "90", "40"};
    int fruitImage[] = {R.drawable.apple, R.drawable.banana, R.drawable.mango, R.drawable.orange, R.drawable.pomegranut, R.drawable.watermelon};

    ListView customlistview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        customlistview = findViewById(R.id.customlistviewid);
        CustomFruitListViewBaseAdapter customBaseAdapter = new CustomFruitListViewBaseAdapter(getApplicationContext(), fruitName, prices, fruitImage);
        customlistview.setAdapter(customBaseAdapter);

        customlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("Custom List view", "Item is selected at position : " + i);
            }
        });
    }
}

