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

public class MainActivityGrill extends AppCompatActivity {

    private ListView listView;
    List<Grill> Grills = new ArrayList<>();
    int dataSize1;
    public Grill listGrill = new Grill();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();


    }

    private void initInstances() {

        prepareData();

        ListAdapterGrill adapter = new ListAdapterGrill(MainActivityGrill.this, listGrill);
        listView = (ListView) findViewById(R.id.list_item);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(listViewClickListener);

    }

    private void prepareData() {

        int GrillId[] = {R.drawable.bg1, R.drawable.bg2, R.drawable.bg3, R.drawable.bg4
                , R.drawable.bg5, R.drawable.bg6, R.drawable.bg7, R.drawable.bg8, R.drawable.bg9,
                R.drawable.bg10, R.drawable.bg11, R.drawable.bg12, R.drawable.bg13, R.drawable.bg14
                , R.drawable.bg15,  R.drawable.bg17, R.drawable.bg18, R.drawable.bg19,
                R.drawable.bg20, R.drawable.bg21,R.drawable.bg22, R.drawable.bg23,
                R.drawable.bg24, R.drawable.bg25, R.drawable.bg26,};

        String grillbake[] = {"มะเขือม่วงหมูสับ", "สลัดผักหมูย่าง", "หมูสะเต๊ะเจ", "ไก่ย่างเขาสวนกวาง",
                "ปลาทับทิมย่างจิ้มแจ่ว", "หมูย่างมันฝรั่งบด", "หมูย่างดอกดาหลา", "กุ้งมังกรราดซอสข่า", "หมูม้วนอบซอส",
                "คอหมูย่าง สูตรน้ำผึ้ง", "ข้าวหน้าไก่เทอริยากิ", "ยากิโทริ", "อกไก่ย่างตะไคร้", "คอหมูย่าง สูตรนมสด",
                "ไส้กรอกอีสาน", "หมูปิ้ง สูตรกะทิ", "พุลโกกิ", "หมูปิ้ง", "ปลาซาบะย่างซีอิ๋ว",
                "หอยเชลล์ย่างซอสมิโซะยำ", "แหนมเนือง", "เสือร้องไห้", "ไก่ย่างมะนาวทาริยากิ", "ไก่ย่าง",
                "หมูย่างตะไคร้", "หมูแดง"};


       /* String description[] = {getString(R.string.menu1), getString(R.string.menu2), getString(R.string.menu3), getString(R.string.menu4)
                , getString(R.string.menu5), getString(R.string.menu6), getString(R.string.menu6), getString(R.string.menu7), getString(R.string.menu8)
                , getString(R.string.menu10), getString(R.string.menu11), getString(R.string.menu12), getString(R.string.menu14), getString(R.string.menu15)
                , getString(R.string.menu17), getString(R.string.menu18), getString(R.string.menu19), getString(R.string.menu19)
                , getString(R.string.menu20), getString(R.string.menu21),};

       */
        dataSize1 = GrillId.length;


        Log.d("khem", "dataSize1 " + GrillId.length);
        Log.d("khem", "bakegrill" + GrillId.length);
        Log.d("khem", "grilldescription " + GrillId.length);



        for (int i = 0; i < dataSize1; i++) {
            Log.d("khem", " " + i);
            Grill Grill = new Grill(GrillId[i], grillbake[i]); //description[i]);
            Grills.add(Grill);
        }

        listGrill.setGrills(Grills);

        //Log.d("khem",listGrill);
    }

    /*************************
     * Listener
     ***************************/

    AdapterView.OnItemClickListener listViewClickListener = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Toast.makeText(MainActivityGrill.this, "POSITION:= " + position,
                    Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivityGrill.this,ShowDetailActivity.class);
            intent.putExtra("GrillId", listGrill.getGrills().get(position).getGrillId());
            intent.putExtra("grillbake", listGrill.getGrills().get(position).getgrillbake());
            intent.putExtra("grilldescription", listGrill.getGrills().get(position).getgrilldescription());

            startActivity(intent);
        }
    };

}
