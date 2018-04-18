package kku.sukruam.pattaradanai.projectmappv1;

import android.app.Activity;
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
        IBtnCat1 = (ImageButton) findViewById(R.id.ImgBtn_Cat1);
        IBtnCat2 = (ImageButton) findViewById(R.id.ImgBtn_Cat2);
        IBtnCat3 = (ImageButton) findViewById(R.id.ImgBtn_Cat3);
        IBtnCat4 = (ImageButton) findViewById(R.id.ImgBtn_Cat4);
        IBtnCat5 = (ImageButton) findViewById(R.id.ImgBtn_Cat5);
        IBtnCat6 = (ImageButton) findViewById(R.id.ImgBtn_Cat6);
        IBtnCat7 = (ImageButton) findViewById(R.id.ImgBtn_Cat7);
        IBtnCat8 = (ImageButton) findViewById(R.id.ImgBtn_Cat8);
        IBtnCat9 = (ImageButton) findViewById(R.id.ImgBtn_Cat9);
    }

    @Override
    public void onClick(View view) {

    }
}
