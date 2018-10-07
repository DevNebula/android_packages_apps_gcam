package p000;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* compiled from: PG */
/* renamed from: elf */
final class elf implements SensorEventListener {
    /* renamed from: a */
    private final /* synthetic */ eld f4154a;

    elf(eld eld) {
        this.f4154a = eld;
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        eld eld;
        float f;
        float[] fArr;
        if (sensorEvent.sensor.getType() == 1) {
            eld = this.f4154a;
            eld.f4133e.mo6244a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
            if (eld.f4135g) {
                f = eld.f4136h;
                float f2 = 1.0f - f;
                ejk ejk = eld.f4134f;
                ejk.f3880a = (sensorEvent.values[0] * f) + (ejk.f3880a * f2);
                ejk.f3881b = (sensorEvent.values[1] * f) + (ejk.f3881b * f2);
                ejk.f3882c = (f * sensorEvent.values[2]) + (f2 * ejk.f3882c);
            } else {
                eld.f4134f.mo6244a(sensorEvent.values[0], sensorEvent.values[1], sensorEvent.values[2]);
                eld.f4135g = true;
            }
            eld = this.f4154a;
            if (eld.f4130b) {
                eld.f4142n.mo6296a(sensorEvent.values, sensorEvent.timestamp);
            }
        } else if (sensorEvent.sensor.getType() == 2) {
            fArr = this.f4154a.f4137i;
            fArr[0] = sensorEvent.values[0];
            fArr[1] = sensorEvent.values[1];
            fArr[2] = sensorEvent.values[2];
        } else if (sensorEvent.sensor.getType() == 4) {
            fArr = sensorEvent.values;
            f = fArr[0];
            eld eld2 = this.f4154a;
            float[] fArr2 = eld2.f4140l;
            fArr[0] = f - fArr2[0];
            fArr = sensorEvent.values;
            fArr[1] = fArr[1] - fArr2[1];
            fArr = sensorEvent.values;
            fArr[2] = fArr[2] - fArr2[2];
            eld2.f4145q = ((sensorEvent.values[0] * sensorEvent.values[0]) + (sensorEvent.values[1] * sensorEvent.values[1])) + (sensorEvent.values[2] * sensorEvent.values[2]);
            emc emc = eld2.f4144p;
            if (emc != null) {
                emc.mo6325a(Float.valueOf(eld2.f4145q));
            }
            eld eld3 = this.f4154a;
            long j = eld3.f4138j;
            if (j != 0) {
                float f3 = ((float) (sensorEvent.timestamp - j)) * 1.0E-9f;
                synchronized (eld3) {
                    float[] fArr3 = eld3.f4139k;
                    fArr3[0] = fArr3[0] + (sensorEvent.values[0] * f3);
                    fArr3[1] = fArr3[1] + (sensorEvent.values[1] * f3);
                    fArr3[2] = (f3 * sensorEvent.values[2]) + fArr3[2];
                    eld3.f4141m++;
                }
            }
            eld3.f4138j = sensorEvent.timestamp;
            eld = this.f4154a;
            if (eld.f4130b) {
                eld.f4142n.mo6298b(sensorEvent.values, sensorEvent.timestamp);
            }
        }
    }
}
