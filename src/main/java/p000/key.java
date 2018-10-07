package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: key */
public final class key extends kdu {
    /* renamed from: a */
    private final /* synthetic */ Iterable f21886a;
    /* renamed from: b */
    private final /* synthetic */ kaw f21887b;

    public key(Iterable iterable, kaw kaw) {
        this.f21886a = iterable;
        this.f21887b = kaw;
    }

    public final Iterator iterator() {
        return khb.m4925a(this.f21886a.iterator(), this.f21887b);
    }
}
