package p000;

import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* renamed from: ilc */
final class ilc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Object f7440a;
    /* renamed from: b */
    private final /* synthetic */ ilb f7441b;

    ilc(ilb ilb, Object obj) {
        this.f7441b = ilb;
        this.f7440a = obj;
    }

    public final void run() {
        ilb ilb = this.f7441b;
        ilb.f24630c = this.f7440a;
        for (iqt a : ilb.f24629b) {
            try {
                a.mo8826a(this.f7440a);
            } catch (RejectedExecutionException e) {
            }
        }
    }
}
