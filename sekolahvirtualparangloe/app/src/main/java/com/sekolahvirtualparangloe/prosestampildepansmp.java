package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampildepansmp extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampildepansmp backgroundtampildepansmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampildepansmp);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_depansmp);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampildepansmp task = backgroundtampildepansmp;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }
        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView.Options.TYPE_MONO;


        String panoImageName = "smpdepan.jpg";

        task = new tampildepansmp (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampildepansmp = task;

    }
}



