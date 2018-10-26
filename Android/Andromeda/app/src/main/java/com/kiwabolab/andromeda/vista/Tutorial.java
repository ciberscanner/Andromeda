package com.kiwabolab.andromeda.vista;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Tutorial extends Activity {
    //----------------------------------------------------------------------------------------------
    //Variables
    //----------------------------------------------------------------------------------------------
    //Constructor
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(this, Home2.class));
        finish();
    }
}
