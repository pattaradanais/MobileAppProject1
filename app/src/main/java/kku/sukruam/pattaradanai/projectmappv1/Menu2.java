package kku.sukruam.pattaradanai.projectmappv1;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Menu2 extends Activity {


    /**
     * Created by USER on 19/4/2561.
     */

        private String[] data;
        private ListView listView1;
        private ArrayList<listEntry> data_normal;
        private EditText menu;
        private ArrayList<listEntry> data_sreach;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.menu2);

            data = getResources().getStringArray(R.array.data);

            data_normal = new ArrayList<listEntry>();

            for (int i = 0; i < data.length; i++) {
                listEntry listEntry1 = new listEntry();
                listEntry1.setTitle(data[i]);
                data_normal.add(listEntry1);


            }
            menu = (EditText) findViewById(R.id.menu);
            listView1 = (ListView) findViewById(R.id.listView1);
            doListNormal();


            menu.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {

                    if (menu.length() !=0){
                        data_sreach=new ArrayList<listEntry>();
                        for (int i=0; i<data_normal.size();i++){
                            if (data_normal.get(i).getTitle().toLowerCase().contains(s)){
                                listEntry listEntry1=new listEntry();
                                listEntry1.setTitle(data_normal.get(i).getTitle());
                                data_sreach.add(listEntry1);
                            }
                        }
                        doListSearch();
                    }else {
                        doListNormal();
                    }
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            });
        }

        private void doListSearch()
        {
            listView1.setAdapter(new CustomAdapter(data_sreach));
            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(Menu2.this,data_sreach.get(position).getTitle(),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Menu2.this,Menu3.class);
                    intent.putExtra("title",data_sreach.get(position).getTitle());
                    startActivity(intent);
                }
            });
        }


        private void doListNormal()
        {
            listView1.setAdapter(new CustomAdapter(data_normal));
            listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(Menu2.this,data_normal.get(position).getTitle(),Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(Menu2.this,Menu3.class);
                    intent.putExtra("title",data_normal.get(position).getTitle());
                    startActivity(intent);
                }
            });
        }

        public class CustomAdapter extends BaseAdapter{
            private  ArrayList<listEntry>mdata;
            private Holder holder=new Holder();

            public CustomAdapter(ArrayList<listEntry> data){
                this.mdata=data;
            }
            @Override
            public int getCount()
            {
                //return 0;
                return mdata.size();
            }

            @Override
            public Object getItem(int position)
            {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                convertView = View.inflate(Menu2.this,R.layout.list_item_layout,null);

                if (convertView !=null) {

                    holder.title=(TextView) convertView.findViewById(R.id.list_item_title);

                    holder.title.setText(mdata.get(position).getTitle());
                    convertView.setTag(holder);
                }else {
                    convertView = (View) convertView.getTag();
                }
                return convertView;
            }
            public class Holder{
                public TextView title;
            }


        }
    }



