package p000;

/* renamed from: ezw */
final /* synthetic */ class ezw implements Runnable {
    /* renamed from: a */
    private final Object f4620a;
    /* renamed from: b */
    private final kpw f4621b;
    /* renamed from: c */
    private final Throwable f4622c;
    /* renamed from: d */
    private final kpk f4623d;

    ezw(Object obj, kpw kpw, Throwable th, kpk kpk) {
        this.f4620a = obj;
        this.f4621b = kpw;
        this.f4622c = th;
        this.f4623d = kpk;
    }

    public final void run() {
        ezu.m2255a(this.f4620a, this.f4621b, this.f4622c, this.f4623d);
    }
}
