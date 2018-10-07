package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: bvf */
public final class bvf {
    /* renamed from: a */
    public static final String f1650a = bli.m887a("SpecTypeDb");
    /* renamed from: e */
    public static final String[] f1651e = new String[]{"special_type_id"};
    /* renamed from: b */
    public final kpw f1652b = kpw.m18486d();
    /* renamed from: c */
    public final kpw f1653c = kpw.m18486d();
    /* renamed from: d */
    public final Executor f1654d;

    public bvf(bvk bvk, Executor executor) {
        this.f1654d = executor;
        this.f1654d.execute(new bvg(this, bvk));
    }

    /* renamed from: a */
    public final kbg mo2170a(long j) {
        try {
            return (kbg) kny.m18475a(this.f1652b, new bvh(j), this.f1654d).get();
        } catch (InterruptedException e) {
        } catch (ExecutionException e2) {
        }
        return kau.f21835a;
    }
}
