package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bjr */
public final class bjr implements bjn {
    /* renamed from: a */
    public static final String f11476a = bli.m887a("CdrMediaRecStop");
    /* renamed from: b */
    public final biw f11477b;
    /* renamed from: c */
    public final bhx f11478c;
    /* renamed from: d */
    private final Executor f11479d;

    public bjr(Executor executor, biw biw, bhx bhx) {
        this.f11479d = executor;
        this.f11477b = biw;
        this.f11478c = bhx;
    }

    /* renamed from: a */
    public final kpk mo1985a(bhj bhj, boolean z) {
        kpk d = kpw.m18486d();
        this.f11479d.execute(new bjs(this, d));
        if (z) {
            bli.m888a(f11476a, "Restart the preview after MediaRecorder is stopped");
            kow.m13878a(d, new bjt(this), kpq.f8776a);
        }
        return d;
    }
}
