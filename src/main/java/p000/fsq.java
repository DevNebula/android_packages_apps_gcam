package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fsq */
public final class fsq implements AutoCloseable {
    /* renamed from: a */
    public final Set f4922a;
    /* renamed from: b */
    public final List f4923b = new ArrayList();
    /* renamed from: c */
    public final fss f4924c;
    /* renamed from: d */
    private final List f4925d = new ArrayList();

    public fsq(Set set, fss fss) {
        this.f4922a = set;
        this.f4924c = fss;
    }

    public final void close() {
        kow.m13878a(iel.m3775a(kow.m13872a(this.f4923b), kow.m13872a(this.f4925d), new fsu(this)), new fst(this), kpq.f8776a);
    }
}
