package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: fkt */
final class fkt implements fia {
    /* renamed from: a */
    public final AtomicBoolean f18380a = new AtomicBoolean(false);
    /* renamed from: b */
    public final AtomicBoolean f18381b = new AtomicBoolean(false);
    /* renamed from: c */
    public final /* synthetic */ fyr f18382c;
    /* renamed from: d */
    public final /* synthetic */ fks f18383d;

    fkt(fks fks, fyr fyr) {
        this.f18383d = fks;
        this.f18382c = fyr;
    }

    /* renamed from: a */
    public final void mo6799a() {
        jri.m13405b(this.f18381b.get() ^ 1);
        if (!this.f18380a.getAndSet(true)) {
            this.f18382c.close();
        }
    }

    /* renamed from: b */
    public final fiw mo6800b() {
        return fds.m10420a(this.f18383d.f18375b, new fku(this));
    }

    /* renamed from: c */
    public final Set mo6801c() {
        return this.f18383d.f18374a;
    }
}
