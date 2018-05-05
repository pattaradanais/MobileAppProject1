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

public class ListAdapterGrill extends BaseAdapter {
    Context context;
    //Grill Grills = new Grill();
    Grill grills;
    ListAdapterGrill(Context context, Grill banks) {
        this.context = context;
        this.grills =banks;
    }

    @Override
    public int getCount() {
        if (grills == null)
            return 0;
        if (grills.getGrills() == null)
            return 0;

        return grills.getGrills().size();
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


        if (grills != null && grills.getGrills() != null){
            textView.setText(grills.getGrills().get(position).getgrillbake());
            imageView.setImageResource(grills.getGrills().get(position).getGrillId());
            textDesc.setText(grills.getGrills().get(position).getgrilldescription());
        }


//        if (convertView != null)
//            view = convertView;
        return view;


    }
}
