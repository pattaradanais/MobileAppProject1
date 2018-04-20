package kku.sukruam.pattaradanai.projectmappv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
//import android.R;
import java.lang.reflect.AccessibleObject;

public class Menu3 extends Activity {
    private TextView menu3;
    // private TextView menu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu3);

        Intent getIntent=getIntent();
        String title =getIntent.getStringExtra("title");

        menu3=(TextView) findViewById(R.id.menu3);
        menu3.setText(title);
    }
}

