package p000;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.google.android.apps.camera.jni.gyro.ReadHardwareBufferJniFunctions;

/* compiled from: PG */
/* renamed from: bwl */
public final class bwl implements kwk {
    /* renamed from: a */
    private final kwk f11872a;
    /* renamed from: b */
    private final kwk f11873b;

    public bwl(kwk kwk, kwk kwk2) {
        this.f11872a = kwk;
        this.f11873b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object c;
        SensorManager sensorManager = (SensorManager) this.f11872a.mo10566a();
        if (((ivx) this.f11873b.mo10566a()).f7868c) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            Object obj = defaultSensor != null ? defaultSensor.isDirectChannelTypeSupported(2) ? defaultSensor.getHighestDirectReportRateLevel() >= 2 ? ReadHardwareBufferJniFunctions.isSupported() ? 1 : null : null : null : null;
            if (obj != null) {
                c = kbg.m4804c(new bxq(sensorManager));
                return (kbg) ktm.m14219a(c, "Cannot return null from a non-@Nullable @Provides method");
            }
        }
        c = kau.f21835a;
        return (kbg) ktm.m14219a(c, "Cannot return null from a non-@Nullable @Provides method");
    }
}
