package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampilkanansmp extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampilkanansmp backgroundtampilkanansmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkanansmp);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_kanansmp);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampilkanansmp task = backgroundtampilkanansmp;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }

        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView.Options.TYPE_MONO;


        String panoImageName = "smpkanan.jpg";

        task = new tampilkanansmp(panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampilkanansmp = task;

    }
}
