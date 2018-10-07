package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: iq */
final class C0294iq implements Iterator {
    /* renamed from: a */
    private final int f7673a;
    /* renamed from: b */
    private int f7674b;
    /* renamed from: c */
    private int f7675c;
    /* renamed from: d */
    private boolean f7676d = false;
    /* renamed from: e */
    private final /* synthetic */ C0293ip f7677e;

    C0294iq(C0293ip c0293ip, int i) {
        this.f7677e = c0293ip;
        this.f7673a = i;
        this.f7674b = c0293ip.mo8703c();
    }

    public final boolean hasNext() {
        return this.f7675c < this.f7674b;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f7677e.mo8694a(this.f7675c, this.f7673a);
            this.f7675c++;
            this.f7676d = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f7676d) {
            this.f7675c--;
            this.f7674b--;
            this.f7676d = false;
            this.f7677e.mo8697a(this.f7675c);
            return;
        }
        throw new IllegalStateException();
    }
}
