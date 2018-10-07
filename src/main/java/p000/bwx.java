package p000;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bwx */
public final class bwx implements kwk {
    /* renamed from: a */
    private final kwk f11882a;
    /* renamed from: b */
    private final kwk f11883b;
    /* renamed from: c */
    private final kwk f11884c;
    /* renamed from: d */
    private final kwk f11885d;

    private bwx(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f11882a = kwk;
        this.f11883b = kwk2;
        this.f11884c = kwk3;
        this.f11885d = kwk4;
    }

    /* renamed from: a */
    public static bwx m7921a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new bwx(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return new bwv((cdk) this.f11882a.mo10566a(), (Integer) this.f11883b.mo10566a(), (Executor) this.f11884c.mo10566a(), (Set) this.f11885d.mo10566a());
    }
}
