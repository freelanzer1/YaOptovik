package com.konstantinov.yaoptovik.ui.suppliers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.konstantinov.yaoptovik.Fab;
import com.konstantinov.yaoptovik.MainActivity;
import com.konstantinov.yaoptovik.R;

public class SuppliersFragment extends Fragment {

    private SuppliersViewModel suppliersViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        suppliersViewModel =
                ViewModelProviders.of(this).get(SuppliersViewModel.class);
        View root = inflater.inflate(R.layout.fragment_suppliers, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        suppliersViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        Fab.fabAction (MainActivity.navController, MainActivity.fab, true);
        return root;
    }
}
