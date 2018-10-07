package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: gkg */
final /* synthetic */ class gkg implements Runnable {
    /* renamed from: a */
    private final gke f5544a;

    gkg(gke gke) {
        this.f5544a = gke;
    }

    public final void run() {
        SensorEventListener sensorEventListener = this.f5544a;
        Sensor sensor = sensorEventListener.f5537c;
        if (sensor != null) {
            sensorEventListener.f5536b.unregisterListener(sensorEventListener, sensor);
        }
        sensor = sensorEventListener.f5538d;
        if (sensor != null) {
            sensorEventListener.f5536b.unregisterListener(sensorEventListener, sensor);
        }
    }
}
