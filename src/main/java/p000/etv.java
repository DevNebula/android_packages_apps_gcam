package p000;

import android.media.MediaFormat;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: etv */
public final class etv implements kwk {
    /* renamed from: a */
    private final kwk f17797a;
    /* renamed from: b */
    private final kwk f17798b;
    /* renamed from: c */
    private final kwk f17799c;

    private etv(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f17797a = kwk;
        this.f17798b = kwk2;
        this.f17799c = kwk3;
    }

    /* renamed from: a */
    public static etv m10104a(kwk kwk, kwk kwk2, kwk kwk3) {
        return new etv(kwk, kwk2, kwk3);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return new ets((MediaFormat) this.f17797a.mo10566a(), (exb) this.f17798b.mo10566a(), (Handler) this.f17799c.mo10566a());
    }
}
