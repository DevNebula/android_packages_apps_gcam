package p000;

import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kup */
final class kup extends kuq {
    kup(Unsafe unsafe) {
        super(unsafe);
    }

    /* renamed from: a */
    public final boolean mo10436a(Object obj, long j) {
        return this.f8961a.getBoolean(obj, j);
    }

    /* renamed from: b */
    public final byte mo10437b(Object obj, long j) {
        return this.f8961a.getByte(obj, j);
    }

    /* renamed from: c */
    public final double mo10438c(Object obj, long j) {
        return this.f8961a.getDouble(obj, j);
    }

    /* renamed from: d */
    public final float mo10439d(Object obj, long j) {
        return this.f8961a.getFloat(obj, j);
    }

    /* renamed from: a */
    public final void mo10435a(Object obj, long j, boolean z) {
        this.f8961a.putBoolean(obj, j, z);
    }

    /* renamed from: a */
    public final void mo10430a(Object obj, long j, byte b) {
        this.f8961a.putByte(obj, j, b);
    }

    /* renamed from: a */
    public final void mo10431a(Object obj, long j, double d) {
        this.f8961a.putDouble(obj, j, d);
    }

    /* renamed from: a */
    public final void mo10432a(Object obj, long j, float f) {
        this.f8961a.putFloat(obj, j, f);
    }
}
