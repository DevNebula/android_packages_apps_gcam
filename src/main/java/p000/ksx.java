package p000;

import com.google.lens.sdk.LensApi.LensAvailabilityCallback;

/* compiled from: PG */
/* renamed from: ksx */
public final class ksx implements hqu {
    /* renamed from: a */
    private final LensAvailabilityCallback f21980a;

    public ksx(LensAvailabilityCallback lensAvailabilityCallback) {
        this.f21980a = lensAvailabilityCallback;
    }

    /* renamed from: a */
    static int m14157a(Object obj, Object obj2) {
        return krr.m5177a(null, 1, obj) + krr.m5177a(null, 2, obj2);
    }

    /* renamed from: a */
    public final void mo8037a(boolean z) {
        this.f21980a.mo5638a(z ^ 1);
    }

    /* renamed from: a */
    static void m14158a(krh krh, Object obj, Object obj2) {
        krr.m5179a(krh, null, 1, obj);
        krr.m5179a(krh, null, 2, obj2);
    }
}
