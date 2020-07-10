package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampiltengahsmp extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampiltengahsmp backgroundtampiltengahsmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampiltengahsmp);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_tengahsmp);
        loadPanoImage();
    }
    private synchronized void loadPanoImage() {
        tampiltengahsmp task = backgroundtampiltengahsmp;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }


        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView. Options.TYPE_MONO;


        String panoImageName = "smptengah.jpg";

        task = new tampiltengahsmp (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampiltengahsmp = task;

    }

}
