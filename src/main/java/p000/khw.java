package p000;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* renamed from: khw */
final class khw {
    /* renamed from: a */
    public Object f8674a;

    khw() {
    }

    /* renamed from: a */
    public final void mo10006a(Object obj, Object obj2) {
        if (this.f8674a != obj) {
            throw new ConcurrentModificationException();
        }
        this.f8674a = obj2;
    }
}
