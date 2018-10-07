package p000;

import android.view.Surface;

/* compiled from: PG */
/* renamed from: bib */
public final class bib implements iqo, Runnable {
    /* renamed from: a */
    private final bic f11415a;
    /* renamed from: b */
    private final Surface f11416b;
    /* renamed from: c */
    private final bhj f11417c;
    /* renamed from: d */
    private final bhs f11418d;
    /* renamed from: e */
    private final Object f11419e = new Object();
    /* renamed from: f */
    private boolean f11420f = false;

    public bib(bic bic, Surface surface, bhj bhj, bhs bhs) {
        this.f11415a = bic;
        this.f11416b = surface;
        this.f11417c = bhj;
        this.f11418d = bhs;
    }

    public final void close() {
        synchronized (this.f11419e) {
            this.f11420f = true;
        }
    }

    public final void run() {
        synchronized (this.f11419e) {
            if (this.f11420f) {
                return;
            }
            this.f11415a.mo12383a(this.f11417c, this.f11416b, this.f11418d);
        }
    }
}
