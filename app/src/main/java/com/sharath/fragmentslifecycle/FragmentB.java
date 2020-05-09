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
public class FragmentB extends Fragment {

    public FragmentB() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("FragmentB", "onAttach");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("FragmentB", "onCreate");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("FragmentB", "onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("FragmentB", "onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("FragmentB", "onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("FragmentB", "onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("FragmentB", "onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("FragmentB", "onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("FragmentB", "onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("FragmentB", "onDetach");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }
}
