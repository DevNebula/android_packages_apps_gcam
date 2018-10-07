package p000;

import android.view.View;

/* compiled from: PG */
/* renamed from: hkg */
public final class hkg {
    /* renamed from: a */
    private final hki f6655a;

    private hkg(hki hki) {
        jri.m13404b((Object) hki);
        this.f6655a = hki;
    }

    /* renamed from: a */
    public static hkg m3276a(View view) {
        return hkg.m3277a(new hkj(view));
    }

    /* renamed from: a */
    public static hkg m3277a(hki hki) {
        return new hkg(hki);
    }

    /* renamed from: a */
    public final Object mo7919a(int i) {
        jri.m13404b(this.f6655a);
        Object a = this.f6655a.mo7920a(i);
        jri.m13404b(a);
        return a;
    }
}
