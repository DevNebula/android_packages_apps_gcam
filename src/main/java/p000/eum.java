package p000;

import android.media.MediaFormat;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eum */
public final class eum implements kwk {
    /* renamed from: a */
    private final kwk f17832a;
    /* renamed from: b */
    private final kwk f17833b;
    /* renamed from: c */
    private final kwk f17834c;
    /* renamed from: d */
    private final kwk f17835d;

    private eum(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17832a = kwk;
        this.f17833b = kwk2;
        this.f17834c = kwk3;
        this.f17835d = kwk4;
    }

    /* renamed from: a */
    public static eum m10128a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new eum(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return new euj((MediaFormat) this.f17832a.mo10566a(), (evo) this.f17833b.mo10566a(), (kpk) this.f17834c.mo10566a(), (Executor) this.f17835d.mo10566a());
    }
}
