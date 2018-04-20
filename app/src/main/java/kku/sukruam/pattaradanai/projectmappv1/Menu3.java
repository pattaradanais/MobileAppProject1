package kku.sukruam.pattaradanai.projectmappv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import android.R;
import java.lang.reflect.AccessibleObject;

public class Menu3 extends Activity {
    private TextView menu2;
    // private TextView menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu2);

        Intent getIntent=getIntent();
        String title =getIntent.getStringExtra("title");

        menu2=(TextView) findViewById(R.id.menu3);
        menu2.setText(title);
    }
}

