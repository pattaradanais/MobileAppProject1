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

public class ListAdapterStir extends BaseAdapter {
    Context context;
    //Other others = new Other();
    Other others;
    ListAdapterStir(Context context, Other others) {
        this.context = context;
        this.others =others;
    }

    @Override
    public int getCount() {
        if (others == null)
            return 0;
        if (others.getOthers() == null)
            return 0;

        return others.getOthers().size();
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


        if (others != null && others.getOthers() != null){
            textView.setText(others.getOthers().get(position).getotherfood());
            imageView.setImageResource(others.getOthers().get(position).getotherId());
            textDesc.setText(others.getOthers().get(position).getotherdescription());
        }


//        if (convertView != null)
//            view = convertView;
        return view;


    }
}