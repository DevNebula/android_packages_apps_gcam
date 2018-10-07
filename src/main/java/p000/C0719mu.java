package p000;

import android.view.Menu;
import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: mu */
final class C0719mu implements C0411pf {
    /* renamed from: a */
    private final /* synthetic */ C0713mg f22089a;

    C0719mu(C0713mg c0713mg) {
        this.f22089a = c0713mg;
    }

    /* renamed from: a */
    public final void mo10854a(C0734op c0734op, boolean z) {
        Menu menu;
        Menu d = c0734op.mo14320d();
        C0713mg c0713mg = this.f22089a;
        if (d != c0734op) {
            menu = d;
        } else {
            Object menu2 = c0734op;
        }
        C0375mt a = c0713mg.mo14213a(menu2);
        if (a == null) {
            return;
        }
        if (d != c0734op) {
            this.f22089a.mo14215a(a.f9202a, a, d);
            this.f22089a.mo14216a(a, true);
            return;
        }
        this.f22089a.mo14216a(a, z);
    }

    /* renamed from: a */
    public final boolean mo10855a(C0734op c0734op) {
        if (c0734op == null) {
            C0713mg c0713mg = this.f22089a;
            if (c0713mg.f22069l) {
                Callback callback = c0713mg.f22060c.getCallback();
                if (!(callback == null || this.f22089a.f22071n)) {
                    callback.onMenuOpened(108, c0734op);
                }
            }
        }
        return true;
    }
}
