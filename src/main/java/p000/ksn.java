package p000;

/* compiled from: PG */
/* renamed from: ksn */
public class ksn {
    /* renamed from: a */
    public kqx f8899a;
    /* renamed from: b */
    public volatile kte f8900b;
    /* renamed from: c */
    public volatile kqx f8901c;

    static {
        krn.m5164a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksn)) {
            return false;
        }
        ksn ksn = (ksn) obj;
        kte kte = this.f8900b;
        kte kte2 = ksn.f8900b;
        if (kte == null && kte2 == null) {
            return mo10288b().equals(ksn.mo10288b());
        }
        if (kte != null && kte2 != null) {
            return kte.equals(kte2);
        }
        if (kte != null) {
            return kte.equals(ksn.m5210a(kte.mo10312d()));
        }
        return m5210a(kte2.mo10312d()).equals(kte2);
    }

    /* renamed from: a */
    private final kte m5210a(kte kte) {
        if (this.f8900b == null) {
            synchronized (this) {
                if (this.f8900b != null) {
                } else {
                    try {
                        this.f8900b = kte;
                        this.f8901c = kqx.f8795a;
                    } catch (ksh e) {
                        this.f8900b = kte;
                        this.f8901c = kqx.f8795a;
                    }
                }
            }
        }
        return this.f8900b;
    }

    public int hashCode() {
        return 1;
    }

    /* renamed from: b */
    public final kqx mo10288b() {
        if (this.f8901c != null) {
            return this.f8901c;
        }
        synchronized (this) {
            kqx kqx;
            if (this.f8901c != null) {
                kqx = this.f8901c;
                return kqx;
            }
            if (this.f8900b == null) {
                this.f8901c = kqx.f8795a;
            } else {
                this.f8901c = this.f8900b.mo14186c();
            }
            kqx = this.f8901c;
            return kqx;
        }
    }
}
