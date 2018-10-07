package p000;

import android.annotation.TargetApi;
import android.view.Surface;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bjl */
public final class bjl implements bjk {
    /* renamed from: a */
    public final biw f22787a;
    /* renamed from: b */
    public final Object f22788b = new Object();
    /* renamed from: c */
    public boolean f22789c;
    /* renamed from: d */
    private final bic f22790d;

    static {
        bli.m887a("CdrMediaRecStarter");
    }

    public bjl(biw biw, bic bic) {
        this.f22787a = biw;
        this.f22790d = bic;
    }

    public final void close() {
        synchronized (this.f22788b) {
            this.f22789c = true;
            this.f22790d.close();
        }
    }

    /* renamed from: a */
    public final kpk mo12386a(bhj bhj, Surface surface, bhs bhs, iop iop) {
        kpk d = kpw.m18486d();
        synchronized (this.f22788b) {
            if (this.f22789c) {
                d = kow.m13874a(new IllegalStateException("MediaRecorder is closed"));
            } else {
                kow.m13878a(this.f22790d.mo12383a(bhj, surface, bhs), new bjm(this, iop, d), kpq.f8776a);
            }
        }
        return d;
    }
}
