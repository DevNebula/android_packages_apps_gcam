package p000;

import android.view.WindowInsets;

/* compiled from: PG */
/* renamed from: kj */
public final class C0333kj {
    /* renamed from: a */
    private final Object f8692a;

    private C0333kj(Object obj) {
        this.f8692a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0333kj c0333kj = (C0333kj) obj;
        Object obj2 = this.f8692a;
        if (obj2 != null) {
            return obj2.equals(c0333kj.f8692a);
        }
        if (c0333kj.f8692a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo10071a() {
        return ((WindowInsets) this.f8692a).getSystemWindowInsetBottom();
    }

    /* renamed from: b */
    public final int mo10073b() {
        return ((WindowInsets) this.f8692a).getSystemWindowInsetLeft();
    }

    /* renamed from: c */
    public final int mo10074c() {
        return ((WindowInsets) this.f8692a).getSystemWindowInsetRight();
    }

    /* renamed from: d */
    public final int mo10075d() {
        return ((WindowInsets) this.f8692a).getSystemWindowInsetTop();
    }

    public final int hashCode() {
        Object obj = this.f8692a;
        return obj != null ? obj.hashCode() : 0;
    }

    /* renamed from: e */
    public final boolean mo10076e() {
        return ((WindowInsets) this.f8692a).isConsumed();
    }

    /* renamed from: a */
    public final C0333kj mo10072a(int i, int i2, int i3, int i4) {
        return new C0333kj(((WindowInsets) this.f8692a).replaceSystemWindowInsets(i, i2, i3, i4));
    }

    /* renamed from: a */
    static Object m5034a(C0333kj c0333kj) {
        return c0333kj != null ? c0333kj.f8692a : null;
    }

    /* renamed from: a */
    static C0333kj m5035a(Object obj) {
        return obj != null ? new C0333kj(obj) : null;
    }
}
