package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bhm */
public final class bhm implements bhl {
    /* renamed from: a */
    public static final String f11392a = bli.m887a("CamCapSesCreatorHfr");
    /* renamed from: b */
    public final iwl f11393b;
    /* renamed from: c */
    private final ijx f11394c;

    public bhm(iwl iwl, ijx ijx) {
        this.f11393b = iwl;
        this.f11394c = ijx;
    }

    /* renamed from: a */
    public final kpk mo1951a(Surface surface, Surface surface2, kbg kbg, kbg kbg2) {
        jri.m13395a(kbg.mo9709b() ^ 1);
        kpk d = kpw.m18486d();
        this.f11394c.execute(new bhn(this, surface, surface2, d));
        return d;
    }
}
