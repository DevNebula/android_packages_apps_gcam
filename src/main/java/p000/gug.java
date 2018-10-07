package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: gug */
public final class gug implements guf {
    /* renamed from: a */
    public static final String f19616a = bli.m887a("StorageSpaceCheck");
    /* renamed from: b */
    public final long f19617b = 10485760;
    /* renamed from: c */
    public final long f19618c = 52428800;
    /* renamed from: d */
    public final gsx f19619d;
    /* renamed from: e */
    public final gub f19620e;
    /* renamed from: f */
    private final Executor f19621f;

    public gug(gsx gsx, Executor executor, gub gub) {
        this.f19619d = gsx;
        this.f19621f = executor;
        this.f19620e = gub;
    }

    /* renamed from: a */
    public final kpk mo7456a(boolean z) {
        kpk d = kpw.m18486d();
        this.f19621f.execute(new guh(this, d, z));
        return d;
    }
}
