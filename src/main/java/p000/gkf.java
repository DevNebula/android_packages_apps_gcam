package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: gkf */
final /* synthetic */ class gkf implements Runnable {
    /* renamed from: a */
    private final gke f5543a;

    gkf(gke gke) {
        this.f5543a = gke;
    }

    public final void run() {
        SensorEventListener sensorEventListener = this.f5543a;
        Sensor sensor = sensorEventListener.f5537c;
        if (sensor != null) {
            sensorEventListener.f5536b.registerListener(sensorEventListener, sensor, 3);
        }
        sensor = sensorEventListener.f5538d;
        if (sensor != null) {
            sensorEventListener.f5536b.registerListener(sensorEventListener, sensor, 3);
        }
    }
}
