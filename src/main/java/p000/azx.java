package p000;

import com.google.googlex.gcam.FloatDeque;

/* compiled from: PG */
/* renamed from: azx */
public final class azx implements azw {
    /* renamed from: a */
    public FloatDeque f11097a;

    public azx() {
        this.f11097a = new FloatDeque();
    }

    public azx(FloatDeque floatDeque) {
        this.f11097a = floatDeque;
    }

    /* renamed from: a */
    public final float mo1868a(int i) {
        return this.f11097a.getitem(i);
    }

    /* renamed from: a */
    public final void mo1870a(float f) {
        this.f11097a.push_back(f);
    }

    /* renamed from: a */
    public final long mo1869a() {
        return this.f11097a.size();
    }
}
