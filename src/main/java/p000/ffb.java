package p000;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ffb */
public final class ffb implements kwk {
    /* renamed from: a */
    private final kwk f18198a;
    /* renamed from: b */
    private final kwk f18199b;
    /* renamed from: c */
    private final kwk f18200c;
    /* renamed from: d */
    private final kwk f18201d;
    /* renamed from: e */
    private final kwk f18202e;
    /* renamed from: f */
    private final kwk f18203f;
    /* renamed from: g */
    private final kwk f18204g;
    /* renamed from: h */
    private final kwk f18205h;
    /* renamed from: i */
    private final kwk f18206i;
    /* renamed from: j */
    private final kwk f18207j;
    /* renamed from: k */
    private final kwk f18208k;

    private ffb(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11) {
        this.f18198a = kwk;
        this.f18199b = kwk2;
        this.f18200c = kwk3;
        this.f18201d = kwk4;
        this.f18202e = kwk5;
        this.f18203f = kwk6;
        this.f18204g = kwk7;
        this.f18205h = kwk8;
        this.f18206i = kwk9;
        this.f18207j = kwk10;
        this.f18208k = kwk11;
    }

    /* renamed from: a */
    public static ffb m10470a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11) {
        return new ffb(kwk, kwk2, kwk3, kwk4, kwk5, kwk6, kwk7, kwk8, kwk9, kwk10, kwk11);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18198a;
        kwk kwk2 = this.f18199b;
        kwk kwk3 = this.f18200c;
        kwk kwk4 = this.f18201d;
        kwk kwk5 = this.f18202e;
        kwk kwk6 = this.f18203f;
        kwk kwk7 = this.f18204g;
        kwk kwk8 = this.f18205h;
        kwk kwk9 = this.f18206i;
        kwk kwk10 = this.f18207j;
        kwk kwk11 = this.f18208k;
        ikb ikb = (ikb) kwk.mo10566a();
        kpk kpk = (kpk) kwk2.mo10566a();
        Set set = (Set) kwk3.mo10566a();
        ivr ivr = (ivr) kwk4.mo10566a();
        ira ira = (ira) kwk5.mo10566a();
        kwk6.mo10566a();
        bpq bpq = (bpq) kwk8.mo10566a();
        hjf hjf = (hjf) kwk9.mo10566a();
        ird ird = (ird) kwk10.mo10566a();
        Executor executor = (Executor) kwk11.mo10566a();
        ive ive = ((fyy) kwk7.mo10566a()).f5059a;
        iqp iqp = ive.f7861b;
        return (ivl) ktm.m14219a(new ivl(ikb, kpk, set, ivr, ira, bpq, kbg.m4804c(new InputConfiguration(iqp.f7695a, iqp.f7696b, ive.f7860a)), hjf.f6634c, ird, executor), "Cannot return null from a non-@Nullable @Provides method");
    }
}
