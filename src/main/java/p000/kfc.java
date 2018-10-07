package p000;

import java.util.NoSuchElementException;

/* compiled from: PG */
/* renamed from: kfc */
final class kfc extends khy {
    /* renamed from: a */
    private boolean f21890a;
    /* renamed from: b */
    private final /* synthetic */ Object f21891b;

    kfc(Object obj) {
        this.f21891b = obj;
    }

    public final boolean hasNext() {
        return this.f21890a ^ 1;
    }

    public final Object next() {
        if (this.f21890a) {
            throw new NoSuchElementException();
        }
        this.f21890a = true;
        return this.f21891b;
    }
}
