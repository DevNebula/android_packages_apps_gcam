package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: fiq */
public final class fiq {
    /* renamed from: a */
    public final ira f4807a;
    /* renamed from: b */
    public final ird f4808b;
    /* renamed from: c */
    private final ivr f4809c;

    public fiq(ira ira, ird ird, ivr ivr) {
        this.f4807a = ira;
        this.f4808b = ird;
        this.f4809c = ivr;
    }

    /* renamed from: a */
    public final fip mo6817a(iwg iwg, Handler handler) {
        return new fhe(iwg, this.f4809c, handler, this.f4808b);
    }
}
