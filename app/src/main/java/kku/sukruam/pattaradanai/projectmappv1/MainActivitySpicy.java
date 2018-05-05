package kku.sukruam.pattaradanai.projectmappv1;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivitySpicy extends AppCompatActivity {

    private ListView listView;
    List<Spicy> Curries = new ArrayList<>();
    int dataSize6;
    public Spicy listSpicy = new Spicy();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();


    }

    private void initInstances() {

        prepareData();

        ListAdapterSpicy adapter = new ListAdapterSpicy(MainActivitySpicy.this, listSpicy);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListener);

    }

    private void prepareData() {

        int spicyId[] = {R.drawable.spicy1, R.drawable.spicy2, R.drawable.spicy3, R.drawable.spicy4,R.drawable.spicy5, R.drawable.spicy6, R.drawable.spicy7, R.drawable.spicy8, R.drawable.spicy9,
                R.drawable.spicy10, R.drawable.spicy11, R.drawable.spicy12, R.drawable.spicy13, R.drawable.spicy14
                , R.drawable.spicy15,  R.drawable.spicy17, R.drawable.spicy18, R.drawable.spicy19,
                R.drawable.spicy20, R.drawable.spicy21,R.drawable.spicy22, R.drawable.spicy23,
                R.drawable.spicy24, R.drawable.spicy25, R.drawable.spicy26,};

        String spicyfood[] = {"น้ำพริกระกำ", "น้ำพริกปลากรอบ", "ปลาดุกฟูคั่วกลิ้ง", "น้ำพริกปลาร้าสับ",
                "หลนปู", "น้ำปลาหวาน", "น้ำพริกตะไคร้", "น้ำพริกเต้าหู้ยี้", "น้ำพริกกากหมู",
                "น้ำพริกปลาสลิด", "น้ำพริกอ่องทูน่า", "น้ำพริกมะเขือพวง", "น้ำพริกปลาร้าผัด", "น้ำพริกหมูโคราช",
                "น้ำพริกตาแดง", "น้ำพริกปลาป่น", "น้ำพริกกุ้งป่น", "น้ำพริกกล้วยดิบ", "น้ำพริกเผากุ้ง",
                "น้ำพริกปักษ์ใต้", "น้ำพริกกลางดง", "น้ำพริกขี้กา", "น้ำพริกหมูกรอบ", "น้ำพริกปูม้า",
                "น้ำพริกพริกไทยสด", "น้ำพริกสุโขทัย"};


       /* String description[] = {getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3), getString(R.string.menu4)
                , getString(R.string.menu5), getString(R.string.menu6), getString(R.string.menu6), getString(R.string.menu7), getString(R.string.menu8)
                , getString(R.string.menu10), getString(R.string.menu11), getString(R.string.menu12), getString(R.string.menu14), getString(R.string.menu15)
                , getString(R.string.menu17), getString(R.string.menu18), getString(R.string.menu19), getString(R.string.menu19)
                , getString(R.string.menu20), getString(R.string.menu21),};

       */
        dataSize6 = spicyId.length;


        Log.d("khem", "dataSize6 " + spicyId.length);
        Log.d("khem", "spicyfood" + spicyId.length);
        Log.d("khem", "spicydescription " + spicyId.length);



        for (int i = 0; i < dataSize6; i++) {
            Log.d("khem", " " + i);
            Spicy Spicy = new Spicy(spicyId[i],spicyfood[i]); //description[i]);
            Curries.add(Spicy);
        }

        listSpicy.setspicys(Curries);

        //Log.d("khem",listSpicy);
    }

    /*************************
     * Listener
     ***************************/

    AdapterView.OnItemClickListener listViewClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivitySpicy.this, "POSITION:= " + position,
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivitySpicy.this,ShowDetailActivity.class);
            intent.putExtra("spicyId", listSpicy.getspicys().get(position).getspicyId());
            intent.putExtra("spicyfood", listSpicy.getspicys().get(position).getspicyfood());
            intent.putExtra("spicydescription", listSpicy.getspicys().get(position).getspicydescription());

            startActivity(intent);
        }
    };

}
