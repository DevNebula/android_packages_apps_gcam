package p000;

import android.content.Context;
import android.view.View;

/* compiled from: PG */
/* renamed from: qd */
final class C0747qd extends C0408pc {
    /* renamed from: d */
    private final /* synthetic */ C0836py f22244d;

    public C0747qd(C0836py c0836py, Context context, C0734op c0734op, View view) {
        this.f22244d = c0836py;
        super(context, c0734op, view, true);
        mo10839a(c0836py.f25443n);
    }

    /* renamed from: d */
    protected final void mo10843d() {
        C0836py c0836py = this.f22244d;
        if (c0836py.f22158c != null) {
            c0836py.f22158c.close();
        }
        this.f22244d.f25440k = null;
        super.mo10843d();
    }
}
