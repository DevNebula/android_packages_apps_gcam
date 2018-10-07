package p000;

import java.lang.ref.WeakReference;

/* renamed from: iec */
public class iec {
    /* renamed from: a */
    public WeakReference f7335a;

    /* renamed from: a */
    public void mo8393a() {
        idn idn = (idn) this.f7335a.get();
        if (idn != null) {
            idn.m12412a(idn);
        }
    }

    iec(idn idn) {
        this();
        this.f7335a = new WeakReference(idn);
    }
}
