package p000;

/* compiled from: PG */
/* renamed from: ezg */
public final class ezg implements ezi {
    /* renamed from: a */
    private final exk f18069a;
    /* renamed from: b */
    private gid f18070b = null;

    public ezg(exk exk) {
        this.f18069a = exk;
    }

    /* renamed from: a */
    public final String mo6686a() {
        return "motion blur";
    }

    /* renamed from: a */
    public final synchronized boolean mo6687a(gid gid, gid gid2) {
        boolean z = false;
        synchronized (this) {
            gid gid3 = this.f18070b;
            if (gid3 == null || Math.abs(gid.f19184a - gid3.f19184a) > 100000000) {
                this.f18070b = gid;
            } else {
                float a = this.f18069a.mo6669a(gid, gid3);
                long j = gid.f19185b;
                this.f18070b = gid;
                if (a * ((float) j) > 1.0E9f) {
                    this.f18070b = null;
                    z = true;
                }
            }
        }
        return z;
    }
}
