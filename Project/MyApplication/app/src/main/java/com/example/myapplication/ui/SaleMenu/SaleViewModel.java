package com.example.myapplication.ui.SaleMenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SaleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SaleViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Sale fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}