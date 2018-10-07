package p000;

/* compiled from: PG */
/* renamed from: bmq */
final class bmq implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ bmp f1352a;

    bmq(bmp bmp) {
        this.f1352a = bmp;
    }

    public final void run() {
        Object obj;
        boolean b = this.f1352a.mo2030b();
        synchronized (this.f1352a.f1347a) {
            bmp bmp = this.f1352a;
            obj = bmp.f1348b;
            bmp.f1348b = null;
        }
        ((kpw) jri.m13404b(obj)).mo15641a(Boolean.valueOf(b));
    }
}
