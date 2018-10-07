package p000;

import java.util.AbstractMap.SimpleImmutableEntry;

/* compiled from: PG */
/* renamed from: kgk */
final class kgk extends ken {
    /* renamed from: a */
    private final /* synthetic */ kgj f24935a;

    kgk(kgj kgj) {
        this.f24935a = kgj;
    }

    public final /* synthetic */ Object get(int i) {
        jri.m13390a(i, this.f24935a.f24933c);
        kgj kgj = this.f24935a;
        Object[] objArr = kgj.f24931a;
        int i2 = i + i;
        int i3 = kgj.f24932b;
        return new SimpleImmutableEntry(objArr[i2 + i3], objArr[(i3 ^ 1) + i2]);
    }

    /* renamed from: b */
    public final boolean mo9836b() {
        return true;
    }

    public final int size() {
        return this.f24935a.f24933c;
    }
}
