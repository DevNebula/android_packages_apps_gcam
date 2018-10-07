package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: akg */
final class akg implements adw, adx {
    /* renamed from: a */
    private final List f10357a;
    /* renamed from: b */
    private final C0300iw f10358b;
    /* renamed from: c */
    private int f10359c = 0;
    /* renamed from: d */
    private acg f10360d;
    /* renamed from: e */
    private adx f10361e;
    /* renamed from: f */
    private List f10362f;

    akg(List list, C0300iw c0300iw) {
        this.f10358b = c0300iw;
        aqe.m612a((Collection) list);
        this.f10357a = list;
    }

    /* renamed from: b */
    public final void mo188b() {
        for (adw b : this.f10357a) {
            b.mo188b();
        }
    }

    /* renamed from: c */
    public final void mo189c() {
        List list = this.f10362f;
        if (list != null) {
            this.f10358b.mo9114a(list);
        }
        this.f10362f = null;
        for (adw c : this.f10357a) {
            c.mo189c();
        }
    }

    /* renamed from: a */
    public final Class mo186a() {
        return ((adw) this.f10357a.get(0)).mo186a();
    }

    /* renamed from: d */
    public final adf mo190d() {
        return ((adw) this.f10357a.get(0)).mo190d();
    }

    /* renamed from: a */
    public final void mo187a(acg acg, adx adx) {
        this.f10360d = acg;
        this.f10361e = adx;
        this.f10362f = (List) this.f10358b.mo9113a();
        ((adw) this.f10357a.get(this.f10359c)).mo187a(acg, this);
    }

    /* renamed from: a */
    public final void mo192a(Object obj) {
        if (obj != null) {
            this.f10361e.mo192a(obj);
        } else {
            m6614e();
        }
    }

    /* renamed from: a */
    public final void mo191a(Exception exception) {
        ((List) aqe.m610a(this.f10362f, "Argument must not be null")).add(exception);
        m6614e();
    }

    /* renamed from: e */
    private final void m6614e() {
        if (this.f10359c < this.f10357a.size() - 1) {
            this.f10359c++;
            mo187a(this.f10360d, this.f10361e);
            return;
        }
        aqe.m610a(this.f10362f, "Argument must not be null");
        this.f10361e.mo191a(new agg("Fetch failed", new ArrayList(this.f10362f)));
    }
}
