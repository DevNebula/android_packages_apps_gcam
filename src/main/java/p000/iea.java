package p000;

import android.os.Looper;

/* renamed from: iea */
public final class iea extends icy {
    /* renamed from: b */
    private final hva f24613b;

    public iea(hva hva) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f24613b = hva;
    }

    /* renamed from: d */
    public final Looper mo8143d() {
        return this.f24613b.f7068c;
    }

    /* renamed from: a */
    public final ich mo8134a(ich ich) {
        return this.f24613b.mo8160a(0, ich);
    }

    /* renamed from: b */
    public final ich mo8138b(ich ich) {
        return this.f24613b.mo8160a(1, ich);
    }
}
