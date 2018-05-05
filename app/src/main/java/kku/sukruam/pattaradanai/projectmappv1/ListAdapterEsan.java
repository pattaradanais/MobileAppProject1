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

public class ListAdapterEsan extends BaseAdapter {
    Context context;
    //esan esans = new esan();
    esan esans;
    ListAdapterEsan(Context context, esan esans) {
        this.context = context;
        this.esans =esans;
    }

    @Override
    public int getCount() {
        if (esans == null)
            return 0;
        if (esans.getEsans() == null)
            return 0;

        return esans.getEsans().size();
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


        if (esans != null && esans.getEsans() != null){
            textView.setText(esans.getEsans().get(position).getesanfood());
            imageView.setImageResource(esans.getEsans().get(position).getesannId());
            textDesc.setText(esans.getEsans().get(position).getesanndescription());
        }


//        if (convertView != null)
//            view = convertView;
        return view;


    }
}
