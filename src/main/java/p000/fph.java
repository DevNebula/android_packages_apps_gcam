package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: fph */
public final class fph {
    /* renamed from: a */
    private final fre f4887a;
    /* renamed from: b */
    private final Collection f4888b;
    /* renamed from: c */
    private final gfx f4889c;

    public fph(fre fre, Collection collection, gfx gfx) {
        this.f4887a = fre;
        this.f4888b = collection;
        this.f4889c = gfx;
    }

    /* renamed from: a */
    public final kpk mo6868a(gfw gfw, boolean z) {
        if (z) {
            gfw = this.f4889c.mo7119a(gfw);
        }
        frj a = fri.m10893a(gfw.f5387b, gfw.f5389d);
        a.f4895a = gfw.f5388c;
        return this.f4887a.mo6872a(a.mo6876a(this.f4888b).mo6875a());
    }
}
