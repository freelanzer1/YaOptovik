package com.konstantinov.yaoptovik;

import android.content.Context;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Fab extends FloatingActionButton {
    public Fab(@NonNull Context context) {
        super(context);
    }

    public static void fabAction(final NavController navController, FloatingActionButton fab, boolean visibility) {

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navController.navigate(R.id.suppliersAddFragment);
            }
        });
        if (visibility == true) {
            MainActivity.fab.show();
        } else {
            MainActivity.fab.hide();
        }
    }

}
