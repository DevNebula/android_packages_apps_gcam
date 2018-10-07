package p000;

/* compiled from: PG */
/* renamed from: cgb */
final class cgb implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f2126a;
    /* renamed from: b */
    private final /* synthetic */ cga f2127b;

    cgb(cga cga, int i) {
        this.f2127b = cga;
        this.f2126a = i;
    }

    public final void run() {
        if (this.f2126a == 0) {
            cfk cfk = this.f2127b.f12338a;
            cfk.f23106ab.mo13144a(cfk.f23065M);
            return;
        }
        this.f2127b.f12338a.f23065M.mo5752l();
    }
}
