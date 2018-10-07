package p000;

import android.hardware.HardwareBuffer;
import android.hardware.Sensor;
import android.hardware.SensorDirectChannel;
import android.hardware.SensorManager;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bxq */
public final class bxq implements bwo {
    /* renamed from: a */
    public cci f11928a = null;
    /* renamed from: b */
    private final SensorManager f11929b;
    /* renamed from: c */
    private final Set f11930c = new HashSet();

    public bxq(SensorManager sensorManager) {
        this.f11929b = sensorManager;
    }

    /* renamed from: a */
    public final synchronized void mo12441a(bwp bwp) {
        if (this.f11930c.remove(bwp) && this.f11930c.isEmpty()) {
            m7946a();
        }
    }

    /* renamed from: b */
    public final synchronized bwp mo2187b() {
        bwp bwh;
        if (this.f11930c.isEmpty()) {
            m7947c();
        }
        bwh = new bwh(this);
        this.f11930c.add(bwh);
        return bwh;
    }

    /* renamed from: a */
    private final synchronized void m7946a() {
        cci cci = this.f11928a;
        if (cci != null) {
            cci.f12146b.configure(cci.f12147c, 0);
            cci.f12146b.close();
            cci.f12145a.f1875a.close();
            this.f11928a = null;
        } else {
            bli.m898e("FastGyroProvider", "Tried to close sensor hardware which was already stopped");
        }
    }

    /* renamed from: c */
    private final synchronized void m7947c() {
        if (this.f11928a != null) {
            bli.m898e("FastGyroProvider", "Tried to open sensor hardware which was already running");
        } else {
            HardwareBuffer create = HardwareBuffer.create(41600, 1, 33, 1, 25165827);
            cdi cdi = new cdi(create);
            ccl ccl = new ccl(cdi);
            SensorDirectChannel createDirectChannel = this.f11929b.createDirectChannel(create);
            if (createDirectChannel == null) {
                throw new RuntimeException("Unable to open SensorDirectChannel");
            }
            Sensor defaultSensor = this.f11929b.getDefaultSensor(4);
            if (defaultSensor == null) {
                throw new RuntimeException("Unable to retrieve gyro sensor");
            } else if (createDirectChannel.configure(defaultSensor, 2) == 0) {
                throw new RuntimeException("Unable to start direct channel");
            } else {
                this.f11928a = new cci(cdi, createDirectChannel, defaultSensor, ccl);
            }
        }
    }
}
