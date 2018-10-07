package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: zs */
public abstract class C0619zs {
    /* renamed from: i */
    public static final aby f10099i = new aby("CamAgnt");

    /* renamed from: a */
    public abstract abg mo11589a();

    /* renamed from: a */
    public abstract void mo11590a(abi abi);

    /* renamed from: b */
    public abstract abi mo11592b();

    /* renamed from: c */
    protected abstract Handler mo11593c();

    /* renamed from: d */
    protected abstract abq mo11594d();

    /* renamed from: e */
    public abstract abs mo11595e();

    /* renamed from: f */
    public abstract void mo11596f();

    /* renamed from: a */
    public final void mo11591a(boolean z) {
        if (z) {
            try {
                if (!mo11594d().mo81c()) {
                    aaw aaw = new aaw();
                    mo11595e().mo83a(new C0621zu(this, aaw), aaw.f39b, "camera release");
                    return;
                }
                return;
            } catch (RuntimeException e) {
                mo11592b().mo59a(e);
                return;
            }
        }
        mo11595e().mo82a(new C0622zv(this));
    }
}
