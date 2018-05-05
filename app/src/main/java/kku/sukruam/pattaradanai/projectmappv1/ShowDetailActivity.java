package kku.sukruam.pattaradanai.projectmappv1;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;


public class ShowDetailActivity extends AppCompatActivity {
    private int Id;
    private String name;
    private String description;
    private ImageView imageView;
    //private TextView tvDescription;
    private TextView tvbakegrill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        initInstances();
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("ส่วนประกอบ"));
        tabLayout.addTab(tabLayout.newTab().setText("วิธีทำ"));
        tabLayout.addTab(tabLayout.newTab().setText("Tab 3"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.pager);
        final PagerAdapter adapter = new PagerAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    private void initInstances() {
        Bundle extras = getIntent().getExtras();
        if (extras.containsKey("resId")) {
            Id = getIntent().getIntExtra("resId",0);
            name = getIntent().getStringExtra("bakegrill");
        } else if (extras.containsKey("otherId")) {
            Id = getIntent().getIntExtra("otherId",0);
            name = getIntent().getStringExtra("otherfood");
        } else if (extras.containsKey("curryId")) {
            Id = getIntent().getIntExtra("curryId",0);
            name = getIntent().getStringExtra("curryfood");
        }else if (extras.containsKey("GrillId")) {
            Id = getIntent().getIntExtra("GrillId", 0);
            name = getIntent().getStringExtra("grillbake");
        }else if (extras.containsKey("spicyId")) {
            Id = getIntent().getIntExtra("spicyId", 0);
            name = getIntent().getStringExtra("spicyfood");
        }else if (extras.containsKey("esannId")) {
            Id = getIntent().getIntExtra("esannId", 0);
            name = getIntent().getStringExtra("esanfood");
        }else if (extras.containsKey("dessertId")) {
            Id = getIntent().getIntExtra("dessertId", 0);
            name = getIntent().getStringExtra("dessertfood");
        }

        //Id = getIntent().getIntExtra("resId",0);
        //name = getIntent().getStringExtra("bakegrill");
        //description = getIntent().getStringExtra("desc");

        //tvDescription = (TextView) findViewById(R.id.desc);
        tvbakegrill = (TextView) findViewById(R.id.title);
        imageView = (ImageView) findViewById(R.id.image);

        //tvDescription.setText(description);
        tvbakegrill.setText(name);
        imageView.setImageResource(Id);
    }

}

