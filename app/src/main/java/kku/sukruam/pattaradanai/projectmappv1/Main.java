package kku.sukruam.pattaradanai.projectmappv1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by MThai on 4/18/2018.
 */

public class Main extends Activity implements View.OnClickListener {
    ImageButton IBtnMenu,IBtnCat,IBtnPop,IBtnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        init();

        IBtnMenu.setOnClickListener(this);
        IBtnCat.setOnClickListener(this);
        IBtnPop.setOnClickListener(this);
        IBtnAbout.setOnClickListener(this);
    }

    private void init() {
        IBtnMenu = (ImageButton) findViewById(R.id.ImgBtn_Menu);
        IBtnCat = (ImageButton) findViewById(R.id.ImgBtn_catagory);
        IBtnPop = (ImageButton) findViewById(R.id.ImgBtn_Pop);
        IBtnAbout = (ImageButton) findViewById(R.id.ImgBtn_About);
    }

    @Override
    public void onClick(View view) {

    }
}
