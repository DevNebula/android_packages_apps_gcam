package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bwv */
public final class bwv extends fiw {
    /* renamed from: a */
    public final cdk f11878a;
    /* renamed from: b */
    public final int f11879b;
    /* renamed from: c */
    public final Set f11880c;
    /* renamed from: d */
    private final Executor f11881d;

    public bwv(cdk cdk, Integer num, Executor executor, Set set) {
        this.f11878a = cdk;
        this.f11879b = num.intValue();
        this.f11881d = executor;
        this.f11880c = set;
    }

    /* renamed from: a_ */
    public final void mo6826a_(iwp iwp) {
        super.mo6826a_(iwp);
        this.f11881d.execute(new bww(this, iwp));
    }
}
