package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eyz */
public final class eyz implements kwk {
    /* renamed from: a */
    private final kwk f18048a;
    /* renamed from: b */
    private final kwk f18049b;
    /* renamed from: c */
    private final kwk f18050c;
    /* renamed from: d */
    private final kwk f18051d;
    /* renamed from: e */
    private final kwk f18052e;

    private eyz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f18048a = kwk;
        this.f18049b = kwk2;
        this.f18050c = kwk3;
        this.f18051d = kwk4;
        this.f18052e = kwk5;
    }

    /* renamed from: a */
    public static eyz m10276a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new eyz(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18048a;
        return new eyy((exd) kwk.mo10566a(), this.f18049b, (bmb) this.f18050c.mo10566a(), (Executor) this.f18051d.mo10566a(), (Context) this.f18052e.mo10566a());
    }
}
