package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: ice */
public final class ice {
    /* renamed from: a */
    public final C0691ih f7292a = new C0691ih();
    /* renamed from: b */
    public final ifw f7293b = new ifw();
    /* renamed from: c */
    private int f7294c;
    /* renamed from: d */
    private boolean f7295d = false;

    public ice(Iterable iterable) {
        for (hva hva : iterable) {
            this.f7292a.put(hva.f7067b, null);
        }
        this.f7294c = this.f7292a.keySet().size();
    }

    /* renamed from: a */
    public final void mo8353a(icd icd, ConnectionResult connectionResult) {
        this.f7292a.put(icd, connectionResult);
        this.f7294c--;
        if (!connectionResult.mo14631b()) {
            this.f7295d = true;
        }
        if (this.f7294c != 0) {
            return;
        }
        if (this.f7295d) {
            Object huz = new huz(this.f7292a);
            ifv ifv = this.f7293b.f7356a;
            htl.m3489b(huz, (Object) "Exception must not be null");
            synchronized (ifv.f20992a) {
                ifv.mo13651c();
                ifv.f20994c = true;
                ifv.f20995d = huz;
            }
            ifv.f20993b.mo8434a(ifv);
            return;
        }
        this.f7293b.mo8431a();
    }
}
