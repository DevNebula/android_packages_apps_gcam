package p000;

import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kuo */
final class kuo extends kuq {
    kuo(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final boolean mo10436a(Object obj, long j) {
        if (kul.f8953c) {
            return kul.m5389b(obj, j);
        }
        return kul.m5393c(obj, j);
    }

    /* renamed from: b */
    public final byte mo10437b(Object obj, long j) {
        if (kul.f8953c) {
            return kul.m5394d(obj, j);
        }
        return kul.m5396e(obj, j);
    }

    /* renamed from: c */
    public final double mo10438c(Object obj, long j) {
        return Double.longBitsToDouble(mo10441f(obj, j));
    }

    /* renamed from: d */
    public final float mo10439d(Object obj, long j) {
        return Float.intBitsToFloat(mo10440e(obj, j));
    }

    /* renamed from: a */
    public final void mo10435a(Object obj, long j, boolean z) {
        if (kul.f8953c) {
            kul.m5388b(obj, j, z);
        } else {
            kul.m5390c(obj, j, z);
        }
    }

    /* renamed from: a */
    public final void mo10430a(Object obj, long j, byte b) {
        if (kul.f8953c) {
            kul.m5376a(obj, j, b);
        } else {
            kul.m5387b(obj, j, b);
        }
    }

    /* renamed from: a */
    public final void mo10431a(Object obj, long j, double d) {
        mo10434a(obj, j, Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public final void mo10432a(Object obj, long j, float f) {
        mo10433a(obj, j, Float.floatToIntBits(f));
    }
}
