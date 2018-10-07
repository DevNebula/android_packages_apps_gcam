package p000;

import android.content.res.Resources;

/* compiled from: PG */
/* renamed from: alr */
public final class alr implements adq {
    /* renamed from: a */
    private final adq f10392a;
    /* renamed from: b */
    private final Resources f10393b;

    public alr(Resources resources, adq adq) {
        this.f10393b = (Resources) aqe.m610a((Object) resources, "Argument must not be null");
        this.f10392a = (adq) aqe.m610a((Object) adq, "Argument must not be null");
    }

    /* renamed from: a */
    public final agn mo179a(Object obj, int i, int i2, adp adp) {
        return amv.m6719a(this.f10393b, this.f10392a.mo179a(obj, i, i2, adp));
    }

    /* renamed from: a */
    public final boolean mo180a(Object obj, adp adp) {
        return this.f10392a.mo180a(obj, adp);
    }
}
