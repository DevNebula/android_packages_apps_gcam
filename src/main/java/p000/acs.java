package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: acs */
final class acs implements Callable {
    /* renamed from: a */
    private final /* synthetic */ acr f270a;

    acs(acr acr) {
        this.f270a = acr;
    }

    /* renamed from: a */
    private final Void m136a() {
        synchronized (this.f270a) {
            acr acr = this.f270a;
            if (acr.f258c == null) {
            } else {
                acr.mo140c();
                if (this.f270a.mo137a()) {
                    this.f270a.mo139b();
                    this.f270a.f259d = 0;
                }
            }
        }
        return null;
    }
}
