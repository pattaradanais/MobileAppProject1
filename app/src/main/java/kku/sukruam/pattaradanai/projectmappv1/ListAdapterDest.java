package kku.sukruam.pattaradanai.projectmappv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by patipan on 9/21/2016 AD.
 */

public class ListAdapterDest extends BaseAdapter {
    Context context;
    //Dessert Desserts = new Dessert();
    Dessert desserts;
    ListAdapterDest(Context context, Dessert desserts) {
        this.context = context;
        this.desserts =desserts;
    }

    @Override
    public int getCount() {
        if (desserts == null)
            return 0;
        if (desserts.getDesserts() == null)
            return 0;

        return desserts.getDesserts().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        LayoutInflater mInflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = mInflater.inflate(R.layout.list_item, parent, false);
//        if(convertView != null){
//            view = convertView;
//        }else {
//            view = mInflater.inflate(R.layout.list_item, parent, false);
//        }

        TextView textView = (TextView) view.findViewById(R.id.title);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView textDesc = (TextView) view.findViewById(R.id.desc);


        if (desserts != null && desserts.getDesserts() != null){
            textView.setText(desserts.getDesserts().get(position).getdessertfood());
            imageView.setImageResource(desserts.getDesserts().get(position).getdessertId());
            textDesc.setText(desserts.getDesserts().get(position).getdessertdescription());
        }


//        if (convertView != null)
//            view = convertView;
        return view;


    }
}
