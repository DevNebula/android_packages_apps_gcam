package p000;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ccq */
public final class ccq implements bwo, kwk {
    /* renamed from: a */
    public final List f12164a = new ArrayList(400);
    /* renamed from: b */
    public final iqr f12165b;
    /* renamed from: c */
    public int f12166c;
    /* renamed from: d */
    private final SensorManager f12167d;
    /* renamed from: e */
    private final Set f12168e;
    /* renamed from: f */
    private final SensorEventListener f12169f;
    /* renamed from: g */
    private final Sensor f12170g;

    public ccq(SensorManager sensorManager) {
        this.f12167d = sensorManager;
        this.f12170g = sensorManager.getDefaultSensor(4);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < 400) {
                this.f12164a.add(new bwr(104, 1, 4, 0, -1, 0.0f, 0.0f, 0.0f));
                i = i2 + 1;
            } else {
                this.f12166c = 0;
                this.f12169f = new bwu(this);
                this.f12168e = new HashSet();
                this.f12165b = new iqr(bws.f11877a, 400);
                return;
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo12447a(bwp bwp) {
        if (this.f12168e.remove(bwp) && this.f12168e.isEmpty()) {
            m8110c();
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: b */
    public final synchronized bwp mo2187b() {
        bwp bwt;
        if (this.f12168e.isEmpty()) {
            m8111d();
        }
        bwt = new bwt(this);
        this.f12168e.add(bwt);
        return bwt;
    }

    /* renamed from: a */
    public static String m8109a(ccp ccp) {
        return (String) ktm.m14219a(ccp.f1869a.authority, "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    private final synchronized void m8110c() {
        this.f12167d.unregisterListener(this.f12169f);
    }

    /* renamed from: d */
    private final synchronized void m8111d() {
        this.f12167d.registerListener(this.f12169f, this.f12170g, 0);
    }
}
