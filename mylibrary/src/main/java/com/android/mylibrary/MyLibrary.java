package com.android.mylibrary;

import android.util.Log;

import com.android.NikssModule.HelloNikss;

/**
 * Created by Nikunj Paradva.
 */
public class MyLibrary {
    public static void hi() {
        Log.e("MyLibrary", "MyLibrary called SuccessFully--> Next Call is from Nikss Module");
        HelloNikss.hi();

    }
}
