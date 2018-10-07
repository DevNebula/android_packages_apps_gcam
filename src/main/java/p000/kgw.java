package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kgw */
final class kgw extends keu {
    /* renamed from: a */
    private final transient Object f24949a;
    /* renamed from: b */
    private transient int f24950b;

    kgw(Object obj) {
        this.f24949a = jri.m13404b(obj);
    }

    kgw(Object obj, int i) {
        this.f24949a = obj;
        this.f24950b = i;
    }

    public final boolean contains(Object obj) {
        return this.f24949a.equals(obj);
    }

    /* renamed from: a */
    final int mo9832a(Object[] objArr, int i) {
        objArr[i] = this.f24949a;
        return i + 1;
    }

    /* renamed from: e */
    final ken mo14003e() {
        return ken.m13708a(this.f24949a);
    }

    public final int hashCode() {
        int i = this.f24950b;
        if (i != 0) {
            return i;
        }
        i = this.f24949a.hashCode();
        this.f24950b = i;
        return i;
    }

    /* renamed from: d */
    final boolean mo14002d() {
        return this.f24950b != 0;
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return false;
    }

    /* renamed from: c */
    public final khy mo9837c() {
        return khb.m4935a(this.f24949a);
    }

    public final /* synthetic */ Iterator iterator() {
        return khb.m4935a(this.f24949a);
    }

    public final int size() {
        return 1;
    }

    public final String toString() {
        String obj = this.f24949a.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 2);
        stringBuilder.append('[');
        stringBuilder.append(obj);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
