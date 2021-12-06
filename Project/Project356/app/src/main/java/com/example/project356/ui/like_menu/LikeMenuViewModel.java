package com.example.project356.ui.like_menu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class LikeMenuViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public LikeMenuViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Like_menu fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}