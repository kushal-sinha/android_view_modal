package com.example.view_model;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private MutableLiveData<Integer> counterLiveData = new MutableLiveData<>();

    public void increaseCounter(View view) {
       int currentValue = counterLiveData.getValue()!=null?counterLiveData.getValue():0;
        counterLiveData.setValue(++currentValue);

    }

    public LiveData<Integer> getCounter() {
        return counterLiveData;
    }
}
