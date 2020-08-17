package com.konstantinov.yaoptovik.ui.suppliers;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.konstantinov.yaoptovik.Fab;
import com.konstantinov.yaoptovik.MainActivity;
import com.konstantinov.yaoptovik.R;

public class SuppliersAddFragment extends Fragment {

    private SuppliersAddViewModel mViewModel;

    public static SuppliersAddFragment newInstance() {
        return new SuppliersAddFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_suppliers_add, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SuppliersAddViewModel.class);
        // TODO: Use the ViewModel
        Fab.fabAction (MainActivity.navController, MainActivity.fab, false);
    }

}
