package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampiltengahsd extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampiltengahsd backgroundtampiltengahsd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampiltengahsd);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_tengahsd);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampiltengahsd task = backgroundtampiltengahsd;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }


        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView. Options.TYPE_MONO;


        String panoImageName = "sdtengah.jpg";

        task = new tampiltengahsd (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampiltengahsd = task;

    }

}

