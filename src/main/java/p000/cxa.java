package p000;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* renamed from: cxa */
final class cxa implements kov {
    /* renamed from: a */
    private final /* synthetic */ bcl f13397a;
    /* renamed from: b */
    private final /* synthetic */ cwi f13398b;
    /* renamed from: c */
    private final /* synthetic */ ikb f13399c;
    /* renamed from: d */
    private final /* synthetic */ cwz f13400d;

    cxa(cwz cwz, bcl bcl, cwi cwi, ikb ikb) {
        this.f13400d = cwz;
        this.f13397a = bcl;
        this.f13398b = cwi;
        this.f13399c = ikb;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        if (th instanceof CancellationException) {
            bli.m894c(cwz.f13382a, "OneCamera open sequence was canceled, shutting down lifetime.");
        } else {
            bli.m899e(cwz.f13382a, "OneCamera failed to open, closing lifetime.", th);
        }
        this.f13399c.close();
        this.f13398b.mo15642a(new isr("OneCamera failed to open"));
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        obj = (fbj) obj;
        jri.m13404b(obj);
        bli.m894c(cwz.f13382a, "OneCamera started!");
        cwz cwz = this.f13400d;
        cwz.f13385d = obj;
        cwz.f13384c = null;
        if (!this.f13397a.f11172a.get()) {
            cwi cwi = this.f13398b;
            cwz cwz2 = this.f13400d;
            cwi.mo15711a(new cwh(cwz2.f13385d, this.f13399c, cwz2.f13387f, cwz2.f13388g));
        }
    }
}
