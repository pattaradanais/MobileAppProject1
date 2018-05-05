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

public class ListAdapterSpicy extends BaseAdapter {
    Context context;
    //Spicy Curries = new Spicy();
    Spicy spicys;
    ListAdapterSpicy(Context context, Spicy spicys) {
        this.context = context;
        this.spicys =spicys;
    }

    @Override
    public int getCount() {
        if (spicys == null)
            return 0;
        if (spicys.getspicys() == null)
            return 0;

        return spicys.getspicys().size();
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


        if (spicys!= null && spicys.getspicys() != null){
            textView.setText(spicys.getspicys().get(position).getspicyfood());
            imageView.setImageResource(spicys.getspicys().get(position).getspicyId());
            textDesc.setText(spicys.getspicys().get(position).getspicydescription());
        }


//        if (convertView != null)
//            view = convertView;
        return view;


    }
}
