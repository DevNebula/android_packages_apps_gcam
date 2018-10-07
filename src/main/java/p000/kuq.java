package p000;

import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kuq */
abstract class kuq {
    /* renamed from: a */
    public Unsafe f8961a;

    kuq(Unsafe unsafe) {
        this.f8961a = unsafe;
    }

    /* renamed from: a */
    public abstract void mo10430a(Object obj, long j, byte b);

    /* renamed from: a */
    public abstract void mo10431a(Object obj, long j, double d);

    /* renamed from: a */
    public abstract void mo10432a(Object obj, long j, float f);

    /* renamed from: a */
    public abstract void mo10435a(Object obj, long j, boolean z);

    /* renamed from: a */
    public abstract boolean mo10436a(Object obj, long j);

    /* renamed from: b */
    public abstract byte mo10437b(Object obj, long j);

    /* renamed from: c */
    public abstract double mo10438c(Object obj, long j);

    /* renamed from: d */
    public abstract float mo10439d(Object obj, long j);

    /* renamed from: e */
    public final int mo10440e(Object obj, long j) {
        return this.f8961a.getInt(obj, j);
    }

    /* renamed from: f */
    public final long mo10441f(Object obj, long j) {
        return this.f8961a.getLong(obj, j);
    }

    /* renamed from: a */
    public final void mo10433a(Object obj, long j, int i) {
        this.f8961a.putInt(obj, j, i);
    }

    /* renamed from: a */
    public final void mo10434a(Object obj, long j, long j2) {
        this.f8961a.putLong(obj, j, j2);
    }
}
