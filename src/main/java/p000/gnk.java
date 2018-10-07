package p000;

/* compiled from: PG */
/* renamed from: gnk */
public final class gnk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f5745a;
    /* renamed from: b */
    private final /* synthetic */ int f5746b;
    /* renamed from: c */
    private final /* synthetic */ gnh f5747c;

    public gnk(gnh gnh, byte[] bArr, int i) {
        this.f5747c = gnh;
        this.f5745a = bArr;
        this.f5746b = i;
    }

    public final void run() {
        synchronized (this.f5747c.f5736a) {
            for (glq a : this.f5747c.f5736a) {
                a.mo7211a(this.f5745a, this.f5746b);
            }
        }
    }
}
