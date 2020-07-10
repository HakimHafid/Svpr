package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampildepansma extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampildepansma backgroundtampildepansma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampildepansma);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_depansma);
        loadPanoImage();
    }
    private synchronized void loadPanoImage() {
        tampildepansma task = backgroundtampildepansma;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }
        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView.Options.TYPE_MONO;


        String panoImageName = "smadepan.jpg";

        task = new tampildepansma (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampildepansma = task;

    }
}