package p000;

import android.hardware.SensorManager;

/* compiled from: PG */
/* renamed from: bwn */
public final class bwn implements kwk {
    /* renamed from: a */
    private final kwk f11875a;
    /* renamed from: b */
    private final kwk f11876b;

    public bwn(kwk kwk, kwk kwk2) {
        this.f11875a = kwk;
        this.f11876b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        Object ccq;
        kwk kwk = this.f11875a;
        kbg kbg = (kbg) kwk.mo10566a();
        SensorManager sensorManager = (SensorManager) this.f11876b.mo10566a();
        if (kbg.mo9709b()) {
            bwo ccq2 = (bwo) kbg.mo9706a();
        } else {
            ccq2 = new ccq(sensorManager);
        }
        return (bwo) ktm.m14219a(ccq2, "Cannot return null from a non-@Nullable @Provides method");
    }
}
