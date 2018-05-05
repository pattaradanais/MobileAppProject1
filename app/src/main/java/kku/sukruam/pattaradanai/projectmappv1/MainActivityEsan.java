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

public class MainActivityEsan extends AppCompatActivity {

    private ListView listView;
    List<esan> esans = new ArrayList<>();
    int dataSize2;
    public esan listEsan = new esan();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();


    }

    private void initInstances() {

        prepareData();

        ListAdapterEsan adapter = new ListAdapterEsan(MainActivityEsan.this, listEsan);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListener);

    }

    private void prepareData() {

        int esannId[] = {R.drawable.esan1, R.drawable.esan2, R.drawable.esan3, R.drawable.esan4
                , R.drawable.esan5, R.drawable.esan6, R.drawable.esan7, R.drawable.esan8, R.drawable.esan9,
                R.drawable.esan10, R.drawable.esan11, R.drawable.esan12, R.drawable.esan13, R.drawable.esan14
                , R.drawable.esan15,  R.drawable.esan17, R.drawable.esan18, R.drawable.esan19,
                R.drawable.esan20,};

        String esanfood[] = {"พล่ากุ้ง", "ไก่ย่างเขาสวนกวาง", "ปลาบึกผัดฉ่า", "ยำหมูยอ",
                "แกงเห็ดเผาะใส่ผักหวาน", "กบทอดกระเทียมพริกไทย", "พวงนมหมูย่าง", "ต้มแซ่บปลาคัง", "ลาบพวงไข่ไก่",
                "ลาบเป็ด", "ไก่รวนปลาร้า", "พล่าหนวดปลาหมึก", "อกไก่ย่างตะไคร้", "ไส้กรอกอีสาน",
                "แหนมคลุก", "แกงส้มปลาโจก", "แกงลาว", "ตับหวาน", "ซุปหน่อไม้",
                "แกงหน่อไม้ใบย่านาง"};


       /* String description[] = {getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3), getString(R.string.menu4)
                , getString(R.string.menu5), getString(R.string.menu6), getString(R.string.menu6), getString(R.string.menu7), getString(R.string.menu8)
                , getString(R.string.menu10), getString(R.string.menu11), getString(R.string.menu12), getString(R.string.menu14), getString(R.string.menu15)
                , getString(R.string.menu17), getString(R.string.menu18), getString(R.string.menu19), getString(R.string.menu19)
                , getString(R.string.menu20), getString(R.string.menu21),};

       */
        dataSize2 = esannId.length;


        Log.d("khem", "dataSize2 " + esannId.length);
        Log.d("khem", "esanfood" + esannId.length);
        Log.d("khem", "esanndescription " + esannId.length);



        for (int i = 0; i < dataSize2; i++) {
            Log.d("khem", " " + i);
            esan esan = new esan(esannId[i], esanfood[i]); //description[i]);
            esans.add(esan);
        }

        listEsan.setEsans(esans);

        //Log.d("khem",listEsan);
    }

    /*************************
     * Listener
     ***************************/

    AdapterView.OnItemClickListener listViewClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivityEsan.this, "POSITION:= " + position,
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivityEsan.this,ShowDetailActivity.class);
            intent.putExtra("esannId", listEsan.getEsans().get(position).getesannId());
            intent.putExtra("esanfood", listEsan.getEsans().get(position).getesanfood());
            intent.putExtra("esanndescription", listEsan.getEsans().get(position).getesanndescription());

            startActivity(intent);
        }
    };

}
