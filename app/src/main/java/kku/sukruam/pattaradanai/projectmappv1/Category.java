package kku.sukruam.pattaradanai.projectmappv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by MThai on 4/18/2018.
 */

public class Category extends Activity implements View.OnClickListener {

    Button IBtnCat1,IBtnCat2,IBtnCat3,IBtnCat4,IBtnCat5,IBtnCat6,IBtnCat7,IBtnCat8,IBtnCat9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frangment_category);
        /*IBtnCat1.setOnClickListener(this);
        IBtnCat2.setOnClickListener(this);
        IBtnCat3.setOnClickListener(this);
        IBtnCat4.setOnClickListener(this);
        IBtnCat5.setOnClickListener(this);
        IBtnCat6.setOnClickListener(this);
        IBtnCat7.setOnClickListener(this);
        IBtnCat8.setOnClickListener(this);
        IBtnCat9.setOnClickListener(this);  */
    }



    private void init() {
        /*IBtnCat1 = (ImageButton) findViewById(R.id.ImgBtn_Cat1);  //ผัด ทอก
        IBtnCat2 = (ImageButton) findViewById(R.id.ImgBtn_Cat2);  //ต้มจืด แกง
        IBtnCat3 = (ImageButton) findViewById(R.id.ImgBtn_Cat3);  //ยำ
        IBtnCat4 = (ImageButton) findViewById(R.id.ImgBtn_Cat4);  //ติ้ง ย่าง อบ
        IBtnCat5 = (ImageButton) findViewById(R.id.ImgBtn_Cat5);  //อีสาน
        IBtnCat6 = (ImageButton) findViewById(R.id.ImgBtn_Cat6);  //นึ่ง ตุ๋น ต้ม
        IBtnCat7 = (ImageButton) findViewById(R.id.ImgBtn_Cat7);  // น้ำพริก
        IBtnCat8 = (ImageButton) findViewById(R.id.ImgBtn_Cat8); // ของหวาน
        IBtnCat9 = (ImageButton) findViewById(R.id.ImgBtn_Cat9); //อื่นๆ
    */

        IBtnCat1 = (Button) findViewById(R.id.CatBtn1);  //ผัด ทอก
        IBtnCat2 = (Button) findViewById(R.id.CatBtn2);  //ต้มจืด แกง
        IBtnCat3 = (Button) findViewById(R.id.CatBtn3);  //ยำ
        IBtnCat4 = (Button) findViewById(R.id.CatBtn4);  //ติ้ง ย่าง อบ
        IBtnCat5 = (Button) findViewById(R.id.CatBtn5);  //อีสาน
        IBtnCat6 = (Button) findViewById(R.id.CatBtn6);  //นึ่ง ตุ๋น ต้ม
        IBtnCat7 = (Button) findViewById(R.id.CatBtn7);  // ของหวาน
        IBtnCat8 = (Button) findViewById(R.id.CatBtn8);  //อื่นๆ

    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()){
            case R.id.CatBtn1:
                //intent = new Intent(getApplicationContext(),Cat1.class);
                break;
            case R.id.CatBtn2:
            case R.id.CatBtn3:
            case R.id.CatBtn4:
            case R.id.CatBtn5:
            case R.id.CatBtn6:
            case R.id.CatBtn7:
            case R.id.CatBtn8:



        }


    }
}
