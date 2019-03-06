package com.hm.dailyaphorisms20;

import android.app.Activity;
import android.os.Bundle;

import com.hm.dailyaphorisms20.aphorism.AphorismService;

public class DisplayAphorismsActivity extends Activity {

    private AphorismService aphorismService = new AphorismService();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_aphorisms);
    }

    // Get Aphorisms for display
    private void getAphorisms() {
        aphorismService.getAphorisms();
    }
    
}
