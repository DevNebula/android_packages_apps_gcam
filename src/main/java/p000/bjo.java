package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bjo */
public final class bjo implements bjn {
    /* renamed from: a */
    public static final String f11472a = bli.m887a("CdrMediaRecStop");
    /* renamed from: b */
    public final Executor f11473b;
    /* renamed from: c */
    public final biw f11474c;
    /* renamed from: d */
    private final ijx f11475d;

    public bjo(ijx ijx, Executor executor, biw biw) {
        this.f11475d = ijx;
        this.f11473b = executor;
        this.f11474c = biw;
    }

    /* renamed from: a */
    public final kpk mo1985a(bhj bhj, boolean z) {
        kpk d = kpw.m18486d();
        this.f11475d.execute(new bjp(this, bhj, d));
        return d;
    }
}
