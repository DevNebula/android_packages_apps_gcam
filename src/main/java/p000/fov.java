package p000;

import java.util.LinkedList;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: fov */
public final class fov implements iqo {
    /* renamed from: a */
    public final bcz f18539a;
    /* renamed from: b */
    private final Object f18540b = new Object();
    /* renamed from: c */
    private final Queue f18541c;
    /* renamed from: d */
    private int f18542d;
    /* renamed from: e */
    private final ilb f18543e;
    /* renamed from: f */
    private final int f18544f;
    /* renamed from: g */
    private volatile boolean f18545g = false;

    public fov(int i) {
        this.f18542d = i;
        this.f18544f = -1;
        this.f18541c = new LinkedList();
        this.f18539a = new bcz();
        this.f18543e = new ilb(Integer.valueOf(this.f18542d));
    }

    public final void close() {
        this.f18545g = true;
    }

    /* renamed from: a */
    final void mo13266a() {
        synchronized (this.f18540b) {
            foy foy = (foy) this.f18541c.poll();
            if (foy == null) {
                this.f18542d++;
                this.f18543e.mo8826a(Integer.valueOf(this.f18542d));
                return;
            }
            m10775a(foy.f4878a, foy.f4879b, foy.f4880c);
        }
    }

    /* renamed from: a */
    private final void m10775a(fow fow, fyr fyr, kpw kpw) {
        kow.m13878a(fow.mo6864a(), new fox(this, kpw, fyr), kpq.f8776a);
    }

    /* renamed from: a */
    public final kpk mo13265a(fow fow) {
        if (this.f18545g) {
            return fow.mo6865b();
        }
        kpk d = kpw.m18486d();
        fyr a = this.f18539a.mo15475a();
        synchronized (this.f18540b) {
            if (this.f18542d > 0) {
                jri.m13405b(this.f18541c.isEmpty());
                this.f18542d--;
                this.f18543e.mo8826a(Integer.valueOf(this.f18542d));
                m10775a(fow, a, d);
                return d;
            }
            int i = this.f18544f;
            if (i < 0 || (i >= 0 && this.f18541c.size() < this.f18544f)) {
                this.f18541c.add(new foy(fow, a, d));
                return d;
            }
            a.close();
            d = kow.m13874a(new isr("Not enough capacity."));
            return d;
        }
    }
}
