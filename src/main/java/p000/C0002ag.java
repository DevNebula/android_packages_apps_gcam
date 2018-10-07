package p000;

/* compiled from: PG */
/* renamed from: ag */
abstract class C0002ag {
    /* renamed from: a */
    public final C0003ai f426a;
    /* renamed from: b */
    public boolean f427b;
    /* renamed from: c */
    public int f428c = -1;
    /* renamed from: d */
    private final /* synthetic */ C0000ac f429d;

    C0002ag(C0000ac c0000ac, C0003ai c0003ai) {
        this.f429d = c0000ac;
        this.f426a = c0003ai;
    }

    /* renamed from: a */
    abstract boolean mo240a();

    /* renamed from: a */
    final void mo239a(boolean z) {
        if (z != this.f427b) {
            int i;
            this.f427b = z;
            int access$300 = this.f429d.mActiveCount;
            C0000ac c0000ac = this.f429d;
            int access$3002 = c0000ac.mActiveCount;
            if (this.f427b) {
                i = 1;
            } else {
                i = -1;
            }
            c0000ac.mActiveCount = i + access$3002;
            if (access$300 == 0 && this.f427b) {
                this.f429d.onActive();
            }
            if (this.f429d.mActiveCount == 0 && !this.f427b) {
                this.f429d.onInactive();
            }
            if (this.f427b) {
                this.f429d.dispatchingValue(this);
            }
        }
    }

    /* renamed from: b */
    void mo242b() {
    }

    /* renamed from: a */
    boolean mo241a(C0587y c0587y) {
        return false;
    }
}
