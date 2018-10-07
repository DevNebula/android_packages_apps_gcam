package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: hnb */
public final class hnb implements hhj, ilp {
    /* renamed from: a */
    private final /* synthetic */ Set f24494a;

    public hnb(Set set) {
        this.f24494a = set;
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        return hnc.f20204a;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo13673b() {
        kwk kwk = null;
        hhx hhx = (hhx) kwk.mo10566a();
        boolean z = hhx != null ? hhx.equals(hhx.PHOTO) : false;
        return Boolean.valueOf(z);
    }

    /* renamed from: a */
    public final void mo7877a() {
        for (hhj a : this.f24494a) {
            a.mo7877a();
        }
    }
}
