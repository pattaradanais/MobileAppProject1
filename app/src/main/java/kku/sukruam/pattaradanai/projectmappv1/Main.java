package kku.sukruam.pattaradanai.projectmappv1;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by MThai on 4/18/2018.
 */

public class Main extends Activity implements View.OnClickListener {
   Button IBtnMenu,IBtnCat,IBtnPop,IBtnAbout;

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
        IBtnMenu = (Button) findViewById(R.id.MenuBtn1);
        IBtnCat = (Button) findViewById(R.id.MenuBtn2);
        IBtnPop = (Button) findViewById(R.id.MenuBtn3);
        IBtnAbout = (Button) findViewById(R.id.MenuBtn4);
    }

    @Override
    public void onClick(View view) {
        Intent intent = null;
        switch (view.getId()) {
            case R.id.MenuBtn1:

                //intent = new Intent(getApplicationContext(),Category.class);
                break;
            case R.id.MenuBtn2:
                intent = new Intent(getApplicationContext(),Category.class);
                break;

            case R.id.MenuBtn3:

            case R.id.MenuBtn4:

        }
        startActivity(intent);
    }


}
