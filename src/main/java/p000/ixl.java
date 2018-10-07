package p000;

import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: ixl */
public final class ixl implements ixm {
    /* renamed from: a */
    private final ixm f21348a;
    /* renamed from: b */
    private final iqx f21349b;
    /* renamed from: c */
    private final iqz f21350c;

    public ixl(ixm ixm, iqz iqz) {
        String valueOf = String.valueOf(ixm);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
        stringBuilder.append("ringbuffer [");
        stringBuilder.append(valueOf);
        stringBuilder.append("] insertions");
        valueOf = stringBuilder.toString();
        this.f21350c = iqz;
        this.f21348a = ixm;
        this.f21349b = new iqx(iqz, valueOf);
    }

    /* renamed from: a */
    public final void mo9155a(long j, Object obj) {
        this.f21349b.mo8829a();
        this.f21348a.mo9155a(j, obj);
    }

    /* renamed from: a */
    public final int mo9153a() {
        return this.f21348a.mo9153a();
    }

    /* renamed from: a */
    public final Object mo9154a(long j) {
        return this.f21348a.mo9154a(j);
    }

    /* renamed from: b */
    public final List mo9157b() {
        return this.f21348a.mo9157b();
    }

    /* renamed from: c */
    public final Object mo9158c() {
        return this.f21348a.mo9158c();
    }

    /* renamed from: d */
    public final Object mo9159d() {
        return this.f21348a.mo9159d();
    }

    /* renamed from: e */
    public final Collection mo9160e() {
        iqz iqz = this.f21350c;
        String valueOf = String.valueOf(this.f21348a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("Removing all elements from ");
        stringBuilder.append(valueOf);
        iqz.mo8832b(stringBuilder.toString());
        return this.f21348a.mo9160e();
    }

    /* renamed from: f */
    public final Object mo9161f() {
        iqz iqz = this.f21350c;
        String valueOf = String.valueOf(this.f21348a);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("Removing first element from ");
        stringBuilder.append(valueOf);
        iqz.mo8832b(stringBuilder.toString());
        return this.f21348a.mo9161f();
    }

    /* renamed from: a */
    public final boolean mo9156a(int i) {
        return this.f21348a.mo9156a(i);
    }

    /* renamed from: g */
    public final int mo9162g() {
        return this.f21348a.mo9162g();
    }
}
