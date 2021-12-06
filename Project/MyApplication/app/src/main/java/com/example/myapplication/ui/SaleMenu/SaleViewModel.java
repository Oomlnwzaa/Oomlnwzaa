package com.example.myapplication.ui.SaleMenu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SaleViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SaleViewModel() {
    }

    public LiveData<String> getText() {
        return mText;
    }
}