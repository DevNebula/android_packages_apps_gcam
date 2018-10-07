package p000;

/* compiled from: PG */
/* renamed from: zv */
final class C0622zv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ C0619zs f10106a;

    C0622zv(C0619zs c0619zs) {
        this.f10106a = c0619zs;
    }

    public final void run() {
        this.f10106a.mo11593c().removeCallbacksAndMessages(null);
        this.f10106a.mo11593c().obtainMessage(2).sendToTarget();
    }
}
