//package kku.sukruam.pattaradanai.projectmappv1;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//
//public class CatTest extends Activity implements View.OnClickListener {
//    Button btn1, btn2,btn3,btn4,btn5,btn6,btn7;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_cat_test);
//
//       init();
//        btn1.setOnClickListener(this);
//        btn2.setOnClickListener(this);
//        btn3.setOnClickListener(this);
//        btn4.setOnClickListener(this);
//        btn5.setOnClickListener(this);
//        btn6.setOnClickListener(this);
//        btn7.setOnClickListener(this);
//    }
//
//    private void init() {
//        btn1 = (Button) findViewById(R.id.fried_btn);
//        btn2 = (Button) findViewById(R.id.stir_btn);
//        btn3 = (Button) findViewById(R.id.curry_btn);
//        btn4 = (Button) findViewById(R.id.grill_btn);
//        btn5 = (Button) findViewById(R.id.spivy_btn);
//        btn6 = (Button) findViewById(R.id.esan_btn);
//        btn7 = (Button) findViewById(R.id.dessert_btn);
//
//
//    }
//
//    @Override
//    public void onClick(View view) {
//        Intent i = null;
//        switch (view.getId()) {
//            case R.id.fried_btn:
//                i = new Intent(getApplicationContext(), MainActivity.class);
//                break;
//            case R.id.stir_btn:
//                i = new Intent(getApplicationContext(), MainActivityStir.class);
//                break;
//            case R.id.curry_btn:
//                i = new Intent(getApplicationContext(), MainActivityCurry.class);
//                break;
//            case R.id.grill_btn:
//                i = new Intent(getApplicationContext(), MainActivityGrill.class);
//                break;
//            case R.id.spivy_btn:
//                i = new Intent(getApplicationContext(), MainActivitySpicy.class);
//                break;
//            case R.id.esan_btn:
//                i = new Intent(getApplicationContext(), MainActivityEsan.class);
//                break;
//            case R.id.dessert_btn:
//                i = new Intent(getApplicationContext(), MainActivityDest.class);
//                break;
//        }
//        startActivity(i);
//        }
//    }
//
