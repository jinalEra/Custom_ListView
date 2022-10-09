package android.example.simplelistviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomFruitListViewBaseAdapter extends BaseAdapter {

    Context context;
    String fruitNameList[];
    String fruitPrice[];
    int fruitImageList[];
    LayoutInflater inflater;

    public CustomFruitListViewBaseAdapter(Context ctx, String [] fruitName, String [] prices, int [] fruitImage){
        this.context = ctx;
        this.fruitNameList = fruitName;
        this.fruitPrice = prices;
        this.fruitImageList = fruitImage;
        inflater = LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return fruitNameList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        view = inflater.inflate(R.layout.activity_custom_list_view, null);
        TextView textView = view.findViewById(R.id.customlistitem);
        TextView priceView = view.findViewById(R.id.customlistitemsub);
        ImageView imgView = view.findViewById(R.id.imageIcon);
        textView.setText(fruitNameList[i]);
        priceView.setText(fruitPrice[i]);
        imgView.setImageResource(fruitImageList[i]);
        return view;
    }
}
