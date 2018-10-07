package p000;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

/* compiled from: PG */
/* renamed from: gkh */
public final class gkh {
    /* renamed from: a */
    private final SensorManager f5545a;
    /* renamed from: b */
    private final Sensor f5546b;

    public gkh(Context context) {
        this.f5545a = (SensorManager) context.getSystemService("sensor");
        for (Sensor sensor : this.f5545a.getSensorList(-1)) {
            if ("Double Twist".equals(sensor.getName()) && "Google".equals(sensor.getVendor())) {
                break;
            }
        }
        Sensor sensor2 = null;
        this.f5546b = sensor2;
    }

    /* renamed from: a */
    public final boolean mo7169a(SensorEventListener sensorEventListener) {
        Sensor sensor = this.f5546b;
        if (sensor == null || !this.f5545a.registerListener(sensorEventListener, sensor, 3)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo7170b(SensorEventListener sensorEventListener) {
        Sensor sensor = this.f5546b;
        if (sensor != null) {
            this.f5545a.unregisterListener(sensorEventListener, sensor);
        }
    }
}
