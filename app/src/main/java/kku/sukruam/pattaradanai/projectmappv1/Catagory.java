package kku.sukruam.pattaradanai.projectmappv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by MThai on 4/18/2018.
 */

public class Catagory extends Activity implements View.OnClickListener {

    ImageButton IBtnCat1,IBtnCat2,IBtnCat3,IBtnCat4,IBtnCat5,IBtnCat6,IBtnCat7,IBtnCat8,IBtnCat9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catagory);
        IBtnCat1.setOnClickListener(this);
        IBtnCat2.setOnClickListener(this);
        IBtnCat3.setOnClickListener(this);
        IBtnCat4.setOnClickListener(this);
        IBtnCat5.setOnClickListener(this);
        IBtnCat6.setOnClickListener(this);
        IBtnCat7.setOnClickListener(this);
        IBtnCat8.setOnClickListener(this);
        IBtnCat9.setOnClickListener(this);
    }



    private void init() {
        IBtnCat1 = (ImageButton) findViewById(R.id.ImgBtn_Cat1);  //อัด
        IBtnCat2 = (ImageButton) findViewById(R.id.ImgBtn_Cat2);  //ทอด
        IBtnCat3 = (ImageButton) findViewById(R.id.ImgBtn_Cat3);  //ยำ
        IBtnCat4 = (ImageButton) findViewById(R.id.ImgBtn_Cat4);  //ต้มจืด แกง
        IBtnCat5 = (ImageButton) findViewById(R.id.ImgBtn_Cat5);  //อีสาน
        IBtnCat6 = (ImageButton) findViewById(R.id.ImgBtn_Cat6);  //นึ่ง ตุ๋น ต้ม
        IBtnCat7 = (ImageButton) findViewById(R.id.ImgBtn_Cat7);  // น้ำพริก
        IBtnCat8 = (ImageButton) findViewById(R.id.ImgBtn_Cat8); // ปิ้ง ย่าง อบ
        IBtnCat9 = (ImageButton) findViewById(R.id.ImgBtn_Cat9); //ของหวาน
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.ImgBtn_Cat1:
                //intent = new Intent(getApplicationContext(),Cat1.class);
                break;
            case R.id.ImgBtn_Cat2:
            case R.id.ImgBtn_Cat3:
            case R.id.ImgBtn_Cat4:
            case R.id.ImgBtn_Cat5:
            case R.id.ImgBtn_Cat6:
            case R.id.ImgBtn_Cat7:
            case R.id.ImgBtn_Cat8:
            case R.id.ImgBtn_Cat9:


        }


    }
}
