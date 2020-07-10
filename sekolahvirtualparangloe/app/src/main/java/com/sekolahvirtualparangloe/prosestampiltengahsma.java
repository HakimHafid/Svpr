package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampiltengahsma extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampiltengahsma backgroundtampiltengahsma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampiltengahsma);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_tengahsma);
        loadPanoImage();
    }
    private synchronized void loadPanoImage() {
        tampiltengahsma task = backgroundtampiltengahsma;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }


        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView. Options.TYPE_MONO;


        String panoImageName = "smatengah.jpg";

        task = new tampiltengahsma (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampiltengahsma = task;

    }

}