package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: eud */
public final class eud implements kwk {
    /* renamed from: a */
    private final kwk f17811a;
    /* renamed from: b */
    private final kwk f17812b;
    /* renamed from: c */
    private final kwk f17813c;
    /* renamed from: d */
    private final kwk f17814d;

    private eud(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17811a = kwk;
        this.f17812b = kwk2;
        this.f17813c = kwk3;
        this.f17814d = kwk4;
    }

    /* renamed from: a */
    public static eud m10117a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new eud(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return new eua((List) this.f17811a.mo10566a(), (eue) this.f17812b.mo10566a(), (eun) this.f17813c.mo10566a(), (Executor) this.f17814d.mo10566a());
    }
}
