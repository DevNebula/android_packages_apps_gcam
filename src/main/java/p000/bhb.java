package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;

/* compiled from: PG */
/* renamed from: bhb */
final class bhb implements kaw {
    /* renamed from: a */
    private final /* synthetic */ iwn f11359a;
    /* renamed from: b */
    private final /* synthetic */ bhj f11360b;
    /* renamed from: c */
    private final /* synthetic */ bhs f11361c;
    /* renamed from: d */
    private final /* synthetic */ kpw f11362d;
    /* renamed from: e */
    private final /* synthetic */ bgx f11363e;

    bhb(bgx bgx, iwn iwn, bhj bhj, bhs bhs, kpw kpw) {
        this.f11363e = bgx;
        this.f11359a = iwn;
        this.f11360b = bhj;
        this.f11361c = bhs;
        this.f11362d = kpw;
    }

    /* renamed from: a */
    private final Void m7454a() {
        try {
            iwn iwn = this.f11359a;
            Key key = CaptureRequest.CONTROL_AE_LOCK;
            Boolean valueOf = Boolean.valueOf(true);
            iwn.mo9134a(key, valueOf);
            this.f11360b.mo12379a(fiv.REPEATING, this.f11359a, this.f11363e.f11346b, this.f11361c);
            this.f11363e.f11354j.mo8826a(valueOf);
        } catch (Throwable e) {
            this.f11362d.mo15642a(e);
        }
        return null;
    }
}
