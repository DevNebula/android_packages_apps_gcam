package p000;

/* compiled from: PG */
/* renamed from: fwi */
final class fwi implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ float f4998a;
    /* renamed from: b */
    private final /* synthetic */ fwd f4999b;

    fwi(fwd fwd, float f) {
        this.f4999b = fwd;
        this.f4998a = f;
    }

    public final void run() {
        this.f4999b.f24316b.mo13374b((int) (this.f4998a * 100.0f));
    }
}
