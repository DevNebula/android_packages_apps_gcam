package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gcc */
public final class gcc implements ilp {
    /* renamed from: a */
    public final gbv f24336a;
    /* renamed from: b */
    private final ikd f24337b = new ikd();

    public gcc(gbv gbv) {
        this.f24336a = gbv;
    }

    /* renamed from: a */
    public final iqo mo13672a(iqt iqt, Executor executor) {
        gbw gcd = new gcd(executor, iqt);
        this.f24336a.mo7026a(gcd);
        this.f24337b.execute(new gcf(this, executor, iqt));
        return new gch(this, gcd);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo13673b() {
        return this.f24336a.f5283e;
    }
}
