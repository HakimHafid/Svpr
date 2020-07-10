package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampilkanansma extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampilkanansma backgroundtampilkanansma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkanansma);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_kanansma);
        loadPanoImage();
    }
    private synchronized void loadPanoImage() {
        tampilkanansma task = backgroundtampilkanansma;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }

        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView.Options.TYPE_MONO;


        String panoImageName = "smakanan.jpg";

        task = new tampilkanansma(panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampilkanansma = task;

    }
}