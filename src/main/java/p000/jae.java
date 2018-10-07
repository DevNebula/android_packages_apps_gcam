package p000;

/* compiled from: PG */
/* renamed from: jae */
final class jae implements Runnable {
    /* renamed from: a */
    private final kpk f7968a;
    /* renamed from: b */
    private final izh f7969b;

    public jae(kpk kpk, izh izh) {
        this.f7968a = kpk;
        this.f7969b = izh;
    }

    public final void run() {
        try {
            kow.m13881c(this.f7968a);
        } catch (kqe e) {
            this.f7969b.mo9216a(jar.m4449a(e.getCause()));
        }
    }
}
