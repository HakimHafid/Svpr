package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampildepansd extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampildepansd backgroundtampildepansd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampildepansd);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_depansd);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampildepansd task = backgroundtampildepansd;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }


        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView.Options.TYPE_MONO;


        String panoImageName = "sddepan.jpg";

        task = new tampildepansd (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampildepansd = task;

    }
}