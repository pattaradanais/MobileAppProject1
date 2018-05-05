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

public class MainActivityDest extends AppCompatActivity {

    private ListView listView;
    List<Dessert> Desserts = new ArrayList<>();
    int dataSize5;
    public Dessert listDessert = new Dessert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();


    }

    private void initInstances() {

        prepareData();

        ListAdapterDest adapter = new ListAdapterDest(MainActivityDest.this, listDessert);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListener);

    }

    private void prepareData() {

        int dessertId[] = {R.drawable.des1, R.drawable.des2, R.drawable.des3, R.drawable.des4
                , R.drawable.des5, R.drawable.des6, R.drawable.des7, R.drawable.des8, R.drawable.des9,
                R.drawable.des10, R.drawable.des11, R.drawable.des12, R.drawable.des13, R.drawable.des14
                , R.drawable.des15,  R.drawable.des16, R.drawable.des17, R.drawable.des18,
                R.drawable.des19, R.drawable.des20,R.drawable.des21, R.drawable.des22,
                R.drawable.des23,};

        String dessertfood[] = {"ข้าวต้มหัวหงอก", "ตะโก้เผือก", "ข้าวเหนียวแก้วใบเตย", "ขนมข้าวเหนียวตัดหน้างา",
                "ขนมถ้วย", "ข้าวเหนียวทุเรียน", "ข้าวเหนียวดอกโสน", "ข้าวเหนียวมะม่วง", "ข้าวเหนียวขนุน",
                "ข้าวเหนียมมูน", "ข้าวเหนียวสังขยาิ", "ขนมตะโก้", "ข้าวเหนียวหน้านวล", "ขนมตาล",
                "ข้าวต้มมัด", "ข้าวเกรียบปากหม้อ", "ฟักทองสังขยา ", "ขนมข้าวเกรียบอ่อน", "ทองหยิบ",
                "ขนมทองหยอด", "มันเชื่อม", "กล้วยเชื่อม", "มะพร้าวแก้ว"};


       /* String description[] = {getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3), getString(R.string.menu4)
                , getString(R.string.menu5), getString(R.string.menu6), getString(R.string.menu6), getString(R.string.menu7), getString(R.string.menu8)
                , getString(R.string.menu10), getString(R.string.menu11), getString(R.string.menu12), getString(R.string.menu14), getString(R.string.menu15)
                , getString(R.string.menu17), getString(R.string.menu18), getString(R.string.menu19), getString(R.string.menu19)
                , getString(R.string.menu20), getString(R.string.menu21),};

       */
        dataSize5 = dessertId.length;


        Log.d("khem", "dataSize2 " + dessertId.length);
        Log.d("khem", "dessertfood" + dessertId.length);
        Log.d("khem", "dessertdescription " + dessertId.length);



        for (int i = 0; i < dataSize5; i++) {
            Log.d("khem", " " + i);
            Dessert Dessert = new Dessert(dessertId[i], dessertfood[i]); //description[i]);
            Desserts.add(Dessert);
        }

        listDessert.setDesserts(Desserts);

        //Log.d("khem",listDessert);
    }

    /*************************
     * Listener
     ***************************/

    AdapterView.OnItemClickListener listViewClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivityDest.this, "POSITION:= " + position,
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivityDest.this,ShowDetailActivity.class);
            intent.putExtra("dessertId", listDessert.getDesserts().get(position).getdessertId());
            intent.putExtra("dessertfood", listDessert.getDesserts().get(position).getdessertfood());
            intent.putExtra("dessertdescription", listDessert.getDesserts().get(position).getdessertdescription());

            startActivity(intent);
        }
    };

}
