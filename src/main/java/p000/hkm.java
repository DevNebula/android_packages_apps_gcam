package p000;

/* compiled from: PG */
/* renamed from: hkm */
final class hkm implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ hkk f6672a;

    hkm(hkk hkk) {
        this.f6672a = hkk;
    }

    public final void run() {
        synchronized (this.f6672a.f6662g) {
            hkk hkk = this.f6672a;
            if (hkk.f6657b != null && hkk.f6665j == C0252go.f5906bz) {
                hke hke = this.f6672a.f6659d;
                this.f6672a.f6667l.mo7533a((System.currentTimeMillis() - this.f6672a.f6657b.mo12369b()) - this.f6672a.f6657b.mo12368a());
            }
        }
    }
}
