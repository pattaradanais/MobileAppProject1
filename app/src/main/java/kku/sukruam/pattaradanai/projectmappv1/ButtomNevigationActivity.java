package kku.sukruam.pattaradanai.projectmappv1;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;

public class ButtomNevigationActivity extends AppCompatActivity {


    private MainFragment mainFragment;
    private favFragment favorite;
    private AccountFragment account;

    private FrameLayout mainFrame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom_nevigation);

        mainFrame = (FrameLayout) findViewById(R.id.main_frame);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mainFragment = new MainFragment();
        favorite = new favFragment();
        account = new AccountFragment();

        setFragment(mainFragment);
    }






    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    setFragment(mainFragment);
                    return true;
                case R.id.navigation_favorite:
                    setFragment(favorite);
                    return true;
                case R.id.navigation_account:
                    setFragment(account);
                    return true;

                        default:
                            return false;
            }

        }


    };

    private void setFragment(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }
};

