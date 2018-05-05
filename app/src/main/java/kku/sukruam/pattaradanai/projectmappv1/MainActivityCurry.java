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

public class MainActivityCurry extends AppCompatActivity {

    private ListView listView;
    List<Curry> Curries = new ArrayList<>();
    int dataSize4;
    public Curry listCurry = new Curry();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();


    }

    private void initInstances() {

        prepareData();

        ListAdapterCurry adapter = new ListAdapterCurry(MainActivityCurry.this, listCurry);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListener);

    }

    private void prepareData() {

        int curryId[] = {R.drawable.curry1, R.drawable.curry2, R.drawable.curry3
                , R.drawable.curry4, R.drawable.curry5, R.drawable.curry6, R.drawable.curry7, R.drawable.curry8,
                R.drawable.curry9, R.drawable.curry10, R.drawable.curry11, R.drawable.curry12, R.drawable.curry13
                , R.drawable.curry14,  R.drawable.curry15, R.drawable.curry16, R.drawable.curry17,
                R.drawable.curry18,};

        String curryfood[] = {"ต้มจับฉ่าย", "แกงเลียงกุ้งสด", "แกงจืดสับปะรดกระดูกอ่อน", "แกงมัสมั่น",
                "แกงเขียวหวานไก่", "ต้มข่าไก่", "พะแนงเนื้อ", "แกงจืดฟักซี่โครงหมู", "แกงกะทิสายบัวปลาทู",
                "แกงมัสมั่นไก่", "ต้มยำปลานิล", "ต้มยำรวมมิตรทะเล", "ต้มยำปลาช่อน", "แกงกะหรี่ไก่",
                "แกงคั่วฟักไก่", "แกงจืดเต้าหู้ไข่ม้วน", "แกงป่าปลาช่อน", "แกงโฮะ"};


       /* String description[] = {getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3), getString(R.string.menu4)
                , getString(R.string.menu5), getString(R.string.menu6), getString(R.string.menu6), getString(R.string.menu7), getString(R.string.menu8)
                , getString(R.string.menu10), getString(R.string.menu11), getString(R.string.menu12), getString(R.string.menu14), getString(R.string.menu15)
                , getString(R.string.menu17), getString(R.string.menu18), getString(R.string.menu19), getString(R.string.menu19)
                , getString(R.string.menu20), getString(R.string.menu21),};

       */
        dataSize4 = curryId.length;


        Log.d("khem", "dataSize4 " + curryId.length);
        Log.d("khem", "curryfood" + curryId.length);
        Log.d("khem", "currydescription " + curryId.length);



        for (int i = 0; i < dataSize4; i++) {
            Log.d("khem", " " + i);
            Curry Curry = new Curry(curryId[i],curryfood[i]); //description[i]);
            Curries.add(Curry);
        }

        listCurry.setCurries(Curries);

        //Log.d("khem",listCurry);
    }

    /*************************
     * Listener
     ***************************/

    AdapterView.OnItemClickListener listViewClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivityCurry.this, "POSITION:= " + position,
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivityCurry.this,ShowDetailActivity.class);
            intent.putExtra("curryId", listCurry.getCurries().get(position).getcurryId());
            intent.putExtra("curryfood", listCurry.getCurries().get(position).getcurryfood());
            intent.putExtra("currydescription", listCurry.getCurries().get(position).getcurrydescription());

            startActivity(intent);
        }
    };

}
