package p000;

/* compiled from: PG */
/* renamed from: bco */
public final class bco implements iqo {
    /* renamed from: a */
    public final iqo f11173a;
    /* renamed from: b */
    private final Object f11174b;
    /* renamed from: c */
    private int f11175c;
    /* renamed from: d */
    private boolean f11176d;

    public bco(iqo iqo) {
        this(iqo, (byte) 0);
    }

    private bco(iqo iqo, byte b) {
        jri.m13406b(true, (Object) "initialReferenceCount is not greater than 0.");
        this.f11174b = new Object();
        this.f11173a = iqo;
        this.f11175c = 1;
        this.f11176d = false;
    }

    public final void close() {
        synchronized (this.f11174b) {
            if (this.f11176d) {
                return;
            }
            this.f11175c--;
            if (this.f11175c > 0) {
                return;
            }
            this.f11176d = true;
            this.f11173a.close();
        }
    }
}
