package p000;

import android.view.Window.Callback;

/* compiled from: PG */
/* renamed from: mm */
final class C0715mm implements C0411pf {
    /* renamed from: a */
    private final /* synthetic */ C0713mg f22084a;

    C0715mm(C0713mg c0713mg) {
        this.f22084a = c0713mg;
    }

    /* renamed from: a */
    public final void mo10854a(C0734op c0734op, boolean z) {
        this.f22084a.mo14217a(c0734op);
    }

    /* renamed from: a */
    public final boolean mo10855a(C0734op c0734op) {
        Callback callback = this.f22084a.f22060c.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, c0734op);
        }
        return true;
    }
}
