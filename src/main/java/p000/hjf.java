package p000;

import android.annotation.TargetApi;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: hjf */
public final class hjf {
    /* renamed from: a */
    public static final boolean f6630a = true;
    /* renamed from: d */
    private static hjf f6631d = null;
    /* renamed from: e */
    private static final Object f6632e = new Object();
    /* renamed from: b */
    public final ivy f6633b;
    /* renamed from: c */
    public final ivx f6634c;

    private hjf(ivy ivy, ivx ivx) {
        this.f6633b = ivy;
        this.f6634c = ivx;
    }

    @Deprecated
    /* renamed from: a */
    public static hjf m3248a() {
        synchronized (f6632e) {
            if (f6631d == null) {
                f6631d = new hjf(ivy.m4328a(), ivx.m4327a());
            }
        }
        return f6631d;
    }

    /* renamed from: b */
    public final boolean mo7904b() {
        ivy ivy = this.f6633b;
        return ivy.f7875e || ivy.f7874d;
    }

    /* renamed from: c */
    public final boolean mo7905c() {
        ivy ivy = this.f6633b;
        if (ivy.f7876f || ivy.f7877g || ivy.f7878h) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo7906d() {
        ivy ivy = this.f6633b;
        if (ivy.f7880j || ivy.f7879i) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo7907e() {
        boolean z = false;
        if (this.f6634c.f7869d) {
            if (mo7905c()) {
                z = true;
            } else if (mo7906d()) {
                return true;
            }
        }
        return z;
    }
}
