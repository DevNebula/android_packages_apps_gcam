package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kra */
public final class kra implements Iterator {
    /* renamed from: a */
    private int f8798a = 0;
    /* renamed from: b */
    private final int f8799b = this.f8800c.mo10227b();
    /* renamed from: c */
    private final /* synthetic */ kqx f8800c;

    kra(kqx kqx) {
        this.f8800c = kqx;
    }

    public final boolean hasNext() {
        return this.f8798a < this.f8799b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m5131a());
    }

    /* renamed from: a */
    private final byte m5131a() {
        try {
            kqx kqx = this.f8800c;
            int i = this.f8798a;
            this.f8798a = i + 1;
            return kqx.mo10221a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
