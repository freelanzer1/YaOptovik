package com.konstantinov.yaoptovik.ui.suppliers;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SuppliersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SuppliersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Отображаем поставщиков");
    }

    public LiveData<String> getText() {
        return mText;
    }
}