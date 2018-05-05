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

public class MainActivityStir extends AppCompatActivity {

    private ListView listView;
    List<Other> others = new ArrayList<>();
    int dataSize3;
    public Other listOther = new Other();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    initInstances();


}

    private void initInstances() {

        prepareData();

        ListAdapterStir adapter = new ListAdapterStir(MainActivityStir.this, listOther);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListener);

    }

    private void prepareData() {

        int otherId[] = {R.drawable.oth1, R.drawable.oth2, R.drawable.oth3, R.drawable.oth4
                , R.drawable.oth5, R.drawable.oth6, R.drawable.oth7, R.drawable.oth8, R.drawable.oth9,
                R.drawable.oth10,};

        String otherfood[] = {"ข้าวผัดกุนเชียง", "ผัดกระเพราหมูสับ", "ผัดคะน้าหมูกรอบ", "สลัดผักหมูย่าง",
                "ผัดซีอิ้ว", "ขาหมูพะโล้", "แกงจืดเต้าหู้หมูสับา", "ผัดเปรี้ยวหวานหมู", "ผัดผักแขนงหมูกรอบ",
                "ข้าวผัดหมูแดง"};


       /* String description[] = {getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3), getString(R.string.menu4)
                , getString(R.string.menu5), getString(R.string.menu6), getString(R.string.menu6), getString(R.string.menu7), getString(R.string.menu8)
                , getString(R.string.menu10), getString(R.string.menu11), getString(R.string.menu12), getString(R.string.menu14), getString(R.string.menu15)
                , getString(R.string.menu17), getString(R.string.menu18), getString(R.string.menu19), getString(R.string.menu19)
                , getString(R.string.menu20), getString(R.string.menu21),};

       */
        dataSize3 = otherId.length;


        Log.d("khem", "dataSize3 " + otherId.length);
        Log.d("khem", "otherfood" + otherId.length);
        Log.d("khem", "otherdescription " + otherId.length);



        for (int i = 0; i < dataSize3; i++) {
            Log.d("khem", " " + i);
            Other Other = new Other(otherId[i],otherfood[i]); //description[i]);
            others.add(Other);
        }

        listOther.setOthers(others);

        //Log.d("khem",listOther);
    }

    /*************************
     * Listener
     ***************************/

    AdapterView.OnItemClickListener listViewClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivityStir.this, "POSITION:= " + position,
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivityStir.this,ShowDetailActivity.class);
            intent.putExtra("otherId", listOther.getOthers().get(position).getotherId());
            intent.putExtra("otherfood", listOther.getOthers().get(position).getotherfood());
            intent.putExtra("otherdescription", listOther.getOthers().get(position).getotherdescription());

            startActivity(intent);
        }
    };

}
