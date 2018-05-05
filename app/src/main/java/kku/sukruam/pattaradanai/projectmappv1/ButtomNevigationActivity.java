package kku.sukruam.pattaradanai.projectmappv1;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class ButtomNevigationActivity extends AppCompatActivity {


    /*private MainFragment mainFragment;
    private favFragment favorite;
    private AccountFragment account;

    private FrameLayout mainFrame;  */







    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            switch (item.getItemId()) {
                case R.id.navigation_home:

                    transaction.replace(R.id.main_frame,new Category()).commit();
                    //setFragment(mainFragment);
                    return true;
                case R.id.navigation_favorite:
                    transaction.replace(R.id.main_frame, new favFragment()).commit();
                    //setFragment(favorite);
                    return true;
                case R.id.navigation_account:
                    transaction.replace(R.id.main_frame,new AccountFragment()).commit();
                   // setFragment(account);
                    return true;



            }
            return false;

        }


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttom_nevigation);

       // mainFrame = (FrameLayout) findViewById(R.id.main_frame);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.main_frame,new Category()).commit();

       /* mainFragment = new MainFragment();
        favorite = new favFragment();
        account = new AccountFragment();
  */

    }


  /*  private void setFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
           FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }  */
};

