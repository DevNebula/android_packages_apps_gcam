package p000;

import android.os.Looper;

/* compiled from: PG */
/* renamed from: age */
public final class age implements agn {
    /* renamed from: a */
    public final boolean f10251a;
    /* renamed from: b */
    public final agn f10252b;
    /* renamed from: c */
    private final boolean f10253c;
    /* renamed from: d */
    private agf f10254d;
    /* renamed from: e */
    private adl f10255e;
    /* renamed from: f */
    private int f10256f;
    /* renamed from: g */
    private boolean f10257g;

    public age(agn agn, boolean z, boolean z2) {
        this.f10252b = (agn) aqe.m610a((Object) agn, "Argument must not be null");
        this.f10251a = z;
        this.f10253c = z2;
    }

    /* renamed from: a */
    public final void mo11634a() {
        if (this.f10257g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.f10256f++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    /* renamed from: b */
    public final Object mo262b() {
        return this.f10252b.mo262b();
    }

    /* renamed from: c */
    public final Class mo263c() {
        return this.f10252b.mo263c();
    }

    /* renamed from: d */
    public final int mo264d() {
        return this.f10252b.sizeOf();
    }

    /* renamed from: e */
    public final void mo265e() {
        if (this.f10256f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f10257g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f10257g = true;
            if (this.f10253c) {
                this.f10252b.mo265e();
            }
        }
    }

    /* renamed from: f */
    final void mo11636f() {
        if (this.f10256f <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.f10256f - 1;
            this.f10256f = i;
            if (i == 0) {
                this.f10254d.mo246a(this.f10255e, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }

    /* renamed from: a */
    final void mo11635a(adl adl, agf agf) {
        this.f10255e = adl;
        this.f10254d = agf;
    }

    public final String toString() {
        boolean z = this.f10251a;
        String valueOf = String.valueOf(this.f10254d);
        String valueOf2 = String.valueOf(this.f10255e);
        int i = this.f10256f;
        boolean z2 = this.f10257g;
        String valueOf3 = String.valueOf(this.f10252b);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 101) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("EngineResource{isCacheable=");
        stringBuilder.append(z);
        stringBuilder.append(", listener=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", key=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", acquired=");
        stringBuilder.append(i);
        stringBuilder.append(", isRecycled=");
        stringBuilder.append(z2);
        stringBuilder.append(", resource=");
        stringBuilder.append(valueOf3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
