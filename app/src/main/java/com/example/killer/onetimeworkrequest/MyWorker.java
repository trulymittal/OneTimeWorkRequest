package com.example.killer.onetimeworkrequest;

import android.support.annotation.NonNull;
import android.util.Log;

import androidx.work.Worker;

public class MyWorker extends Worker {

    private static final String TAG = "MyWorker";

    @NonNull
    @Override
    public Result doWork() {

        int number1 = 23;
        int number2 = 26;

        Log.e(TAG, "doWork: addition of two number " + String.valueOf(number1+number2 ));

        return Result.SUCCESS;


    }
}
