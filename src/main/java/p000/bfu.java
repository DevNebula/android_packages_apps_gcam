package p000;

/* renamed from: bfu */
final /* synthetic */ class bfu implements Runnable {
    /* renamed from: a */
    private final bft f1148a;
    /* renamed from: b */
    private final kpw f1149b;
    /* renamed from: c */
    private final boolean f1150c;

    bfu(bft bft, kpw kpw, boolean z) {
        this.f1148a = bft;
        this.f1149b = kpw;
        this.f1150c = z;
    }

    public final void run() {
        bft bft = this.f1148a;
        this.f1149b.mo15644b(bft.f22666e.mo1985a(bft.f22664c, this.f1150c ^ 1));
    }
}
