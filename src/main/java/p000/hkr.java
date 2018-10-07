package p000;

/* compiled from: PG */
/* renamed from: hkr */
final class hkr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ hkk f6674a;

    hkr(hkk hkk) {
        this.f6674a = hkk;
    }

    public final void run() {
        synchronized (this.f6674a.f6662g) {
            if (this.f6674a.f6665j == C0252go.f5855bA) {
                this.f6674a.f6657b.mo12372i();
                gxz b = this.f6674a.f6667l;
                b.f6152c.setText(hkd.m3275a(b.f6150a));
                b.mo7532a();
                this.f6674a.f6665j = C0252go.f5906bz;
            }
        }
    }
}
