package p000;

/* compiled from: PG */
/* renamed from: zu */
final class C0621zu implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ aaw f10104a;
    /* renamed from: b */
    private final /* synthetic */ C0619zs f10105b;

    C0621zu(C0619zs c0619zs, aaw aaw) {
        this.f10105b = c0619zs;
        this.f10104a = aaw;
    }

    public final void run() {
        this.f10105b.mo11593c().obtainMessage(2).sendToTarget();
        this.f10105b.mo11593c().post(this.f10104a.f38a);
    }
}
