package com.sharath.fragmentslifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("FragmentA", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("FragmentA", "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("FragmentA", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("FragmentA", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("FragmentA", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("FragmentA", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("FragmentA", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("FragmentA", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("FragmentA", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("FragmentA", "onDetach");
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i("FragmentA", "onCreateView");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}
