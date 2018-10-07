package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bho */
public final class bho implements bhl {
    /* renamed from: a */
    public static final String f11395a = bli.m887a("CamCapSesCreator");
    /* renamed from: b */
    public final iwl f11396b;
    /* renamed from: c */
    public final ijx f11397c;

    public bho(iwl iwl, ijx ijx) {
        this.f11396b = iwl;
        this.f11397c = ijx;
    }

    /* renamed from: a */
    public final kpk mo1951a(Surface surface, Surface surface2, kbg kbg, kbg kbg2) {
        kpk d = kpw.m18486d();
        this.f11397c.execute(new bhp(this, surface, surface2, kbg, d, kbg2));
        return d;
    }
}
