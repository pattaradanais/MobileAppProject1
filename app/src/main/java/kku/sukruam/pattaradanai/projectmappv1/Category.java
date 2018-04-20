package kku.sukruam.pattaradanai.projectmappv1;

import android.app.Activity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by MThai on 4/18/2018.
 */

public class Category extends Fragment  {

    Button BtnCat1,BtnCat2,BtnCat3,BtnCat4,BtnCat5,BtnCat6,BtnCat7,BtnCat8;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.frangment_category, container, false);
        BtnCat1 = (Button) view.findViewById(R.id.CatBtn1);
        BtnCat1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        BtnCat2 = (Button) view.findViewById(R.id.CatBtn2);
        BtnCat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        BtnCat3 = (Button) view.findViewById(R.id.CatBtn3);
        BtnCat3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        BtnCat4 = (Button) view.findViewById(R.id.CatBtn4);
        BtnCat4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        BtnCat5 = (Button) view.findViewById(R.id.CatBtn5);
        BtnCat5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        BtnCat6 = (Button) view.findViewById(R.id.CatBtn6);
        BtnCat6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        BtnCat7 = (Button) view.findViewById(R.id.CatBtn7);
        BtnCat7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


        BtnCat8 = (Button) view.findViewById(R.id.CatBtn8);
        BtnCat8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });




        return view;
    }

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private MainFragment.OnFragmentInteractionListener mListener;



    public Category() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }




    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainFragment.OnFragmentInteractionListener) {
            mListener = (MainFragment.OnFragmentInteractionListener) context;
        } else {
            Toast.makeText(context,"Main",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}




    // setContentView(R.layout.frangment_category);
        /*IBtnCat1.setOnClickListener(this);
        IBtnCat2.setOnClickListener(this);
        IBtnCat3.setOnClickListener(this);
        IBtnCat4.setOnClickListener(this);
        IBtnCat5.setOnClickListener(this);
        IBtnCat6.setOnClickListener(this);
        IBtnCat7.setOnClickListener(this);
        IBtnCat8.setOnClickListener(this);
        IBtnCat9.setOnClickListener(this);  */




   /* private void init() {
        IBtnCat1 = (ImageButton) findViewById(R.id.ImgBtn_Cat1);  //ผัด ทอก
        IBtnCat2 = (ImageButton) findViewById(R.id.ImgBtn_Cat2);  //ต้มจืด แกง
        IBtnCat3 = (ImageButton) findViewById(R.id.ImgBtn_Cat3);  //ยำ
        IBtnCat4 = (ImageButton) findViewById(R.id.ImgBtn_Cat4);  //ติ้ง ย่าง อบ
        IBtnCat5 = (ImageButton) findViewById(R.id.ImgBtn_Cat5);  //อีสาน
        IBtnCat6 = (ImageButton) findViewById(R.id.ImgBtn_Cat6);  //นึ่ง ตุ๋น ต้ม
        IBtnCat7 = (ImageButton) findViewById(R.id.ImgBtn_Cat7);  // น้ำพริก
        IBtnCat8 = (ImageButton) findViewById(R.id.ImgBtn_Cat8); // ของหวาน
        IBtnCat9 = (ImageButton) findViewById(R.id.ImgBtn_Cat9); //อื่นๆ


        IBtnCat1 = (Button) findViewById(R.id.CatBtn1);  //ผัด ทอก
        IBtnCat2 = (Button) findViewById(R.id.CatBtn2);  //ต้มจืด แกง
        IBtnCat3 = (Button) findViewById(R.id.CatBtn3);  //ยำ
        IBtnCat4 = (Button) findViewById(R.id.CatBtn4);  //ติ้ง ย่าง อบ
        IBtnCat5 = (Button) findViewById(R.id.CatBtn5);  //อีสาน
        IBtnCat6 = (Button) findViewById(R.id.CatBtn6);  //นึ่ง ตุ๋น ต้ม
        IBtnCat7 = (Button) findViewById(R.id.CatBtn7);  // ของหวาน
      IBtnCat8 = (Button) findViewById(R.id.CatBtn8);  //อื่นๆ

    }  */






