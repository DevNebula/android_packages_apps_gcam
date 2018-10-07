package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: PG */
/* renamed from: bwu */
public final class bwu implements SensorEventListener {
    /* renamed from: a */
    private long f1693a = 1;
    /* renamed from: b */
    private final /* synthetic */ ccq f1694b;

    public bwu(ccq ccq) {
        this.f1694b = ccq;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.sensor != null && sensorEvent.sensor.getType() == 4) {
            float[] fArr = sensorEvent.values;
            synchronized (this.f1694b) {
                ccq ccq = this.f1694b;
                bwr bwr = (bwr) ccq.f12164a.get(ccq.f12166c);
                long j = this.f1693a;
                this.f1693a = 1 + j;
                bwr.f1688d = j;
                bwr.f1689e = sensorEvent.timestamp;
                bwr.f1690f = fArr[0];
                bwr.f1691g = fArr[1];
                bwr.f1692h = fArr[2];
                ccq = this.f1694b;
                ccq.f12166c = (ccq.f12166c + 1) % 400;
            }
        }
    }
}
