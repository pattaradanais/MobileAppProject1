package kku.sukruam.pattaradanai.projectmappv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListAdapterCurry extends BaseAdapter {
    Context context;
    //Curry Curries = new Curry();
    Curry currys;
    ListAdapterCurry(Context context, Curry currys) {
        this.context = context;
        this.currys =currys;
    }

    @Override
    public int getCount() {
        if (currys == null)
            return 0;
        if (currys.getCurries() == null)
            return 0;

        return currys.getCurries().size();
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


        if (currys!= null && currys.getCurries() != null){
            textView.setText(currys.getCurries().get(position).getcurryfood());
            imageView.setImageResource(currys.getCurries().get(position).getcurryId());
            textDesc.setText(currys.getCurries().get(position).getcurrydescription());
        }


//        if (convertView != null)
//            view = convertView;
        return view;


    }
}


