package p000;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ilg */
final class ilg implements iqt {
    /* renamed from: a */
    private final iqt f21040a;
    /* renamed from: b */
    private final Executor f21041b;
    /* renamed from: c */
    private final ikb f21042c;
    /* renamed from: d */
    private ikb f21043d = this.f21042c.mo8558b();

    ilg(iqt iqt, Executor executor, ikb ikb) {
        this.f21040a = iqt;
        this.f21041b = executor;
        this.f21042c = ikb;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        ilp ilp = (ilp) obj;
        ikb ikb = this.f21043d;
        this.f21043d = this.f21042c.mo8558b();
        this.f21043d.mo8557a(ilp.mo13672a(this.f21040a, this.f21041b));
        ikb.close();
    }
}
