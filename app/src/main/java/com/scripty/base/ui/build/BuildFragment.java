package com.scripty.base.ui.build;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.scripty.base.R;
import com.scripty.base.ui.BaseFragment;

public class BuildFragment extends BaseFragment {

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
               return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
