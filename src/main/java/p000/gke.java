package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gke */
public final class gke implements SensorEventListener {
    /* renamed from: e */
    private static final String f5534e = bli.m887a("HeadingSensor");
    /* renamed from: a */
    public int f5535a;
    /* renamed from: b */
    public final SensorManager f5536b;
    /* renamed from: c */
    public final Sensor f5537c;
    /* renamed from: d */
    public final Sensor f5538d;
    /* renamed from: f */
    private final gki f5539f;
    /* renamed from: g */
    private final float[] f5540g;
    /* renamed from: h */
    private final float[] f5541h;
    /* renamed from: i */
    private final float[] f5542i;

    public gke(SensorManager sensorManager) {
        this(sensorManager, kpq.f8776a);
    }

    public gke(SensorManager sensorManager, Executor executor) {
        this.f5535a = -1;
        this.f5540g = new float[3];
        this.f5541h = new float[3];
        this.f5542i = new float[16];
        this.f5536b = sensorManager;
        this.f5539f = new gki(executor);
        this.f5537c = this.f5536b.getDefaultSensor(1);
        this.f5538d = this.f5536b.getDefaultSensor(2);
    }

    /* renamed from: a */
    public final void mo7163a() {
        this.f5539f.execute(new gkf(this));
    }

    /* renamed from: b */
    public final void mo7164b() {
        this.f5539f.execute(new gkg(this));
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr;
        int type = sensorEvent.sensor.getType();
        if (type == 1) {
            fArr = this.f5540g;
        } else if (type == 2) {
            fArr = this.f5541h;
        } else {
            bli.m898e(f5534e, String.format(null, "Unexpected sensor type %s", new Object[]{sensorEvent.sensor.getName()}));
            return;
        }
        for (int i = 0; i < 3; i++) {
            fArr[i] = sensorEvent.values[i];
        }
        fArr = new float[3];
        SensorManager.getRotationMatrix(this.f5542i, new float[3], this.f5540g, this.f5541h);
        SensorManager.getOrientation(this.f5542i, fArr);
        this.f5535a = ((int) (((double) (fArr[0] * 180.0f)) / 3.141592653589793d)) % 360;
        type = this.f5535a;
        if (type < 0) {
            this.f5535a = type + 360;
        }
    }
}
