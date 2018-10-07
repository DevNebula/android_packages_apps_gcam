package p000;

import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: atd */
public final class atd implements atc, iqo {
    /* renamed from: a */
    public final bpt f10712a;
    /* renamed from: b */
    public final fbg f10713b;
    /* renamed from: c */
    public final kpw f10714c = kpw.m18486d();
    /* renamed from: d */
    public final kpw f10715d = kpw.m18486d();
    /* renamed from: e */
    public final OnClickListener f10716e = new ate(this);
    /* renamed from: f */
    private final iqo f10717f;
    /* renamed from: g */
    private boolean f10718g;
    /* renamed from: h */
    private final OnClickListener f10719h = new atf(this);

    public atd(bpt bpt, bps bps, fbg fbg) {
        this.f10712a = bpt;
        this.f10713b = fbg;
        bpt.mo2081a(this.f10719h);
        this.f10717f = bps.f1444b.mo13672a(new atg(this), kpq.f8776a);
    }

    public final void close() {
        if (!this.f10718g) {
            this.f10718g = true;
            this.f10717f.close();
            this.f10712a.mo2081a(null);
            if (!this.f10714c.isDone()) {
                this.f10714c.mo15641a(Boolean.valueOf(false));
            }
            if (!this.f10715d.isDone()) {
                this.f10715d.mo15641a(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: a */
    public final kpk mo1792a() {
        return this.f10714c;
    }

    /* renamed from: b */
    public final kpk mo1793b() {
        return this.f10715d;
    }
}
