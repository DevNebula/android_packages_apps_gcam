package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: kso */
public final class kso extends kqr implements RandomAccess, ksp {
    /* renamed from: b */
    private final List f25370b;

    static {
        new kso().f21952a = false;
    }

    public kso() {
        this(10);
    }

    public kso(int i) {
        this(new ArrayList(i));
    }

    private kso(ArrayList arrayList) {
        this.f25370b = arrayList;
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo14139a();
        this.f25370b.add(i, str);
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo10291a(kqx kqx) {
        mo14139a();
        this.f25370b.add(kqx);
        this.modCount++;
    }

    public final boolean addAll(int i, Collection collection) {
        mo14139a();
        if (collection instanceof ksp) {
            collection = ((ksp) collection).mo10293d();
        }
        boolean addAll = this.f25370b.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    /* renamed from: a */
    private static String m17026a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof kqx) {
            return ((kqx) obj).mo10230d();
        }
        return ksd.m5197c((byte[]) obj);
    }

    public final void clear() {
        mo14139a();
        this.f25370b.clear();
        this.modCount++;
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f25370b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        String d;
        if (obj instanceof kqx) {
            kqx kqx = (kqx) obj;
            d = kqx.mo10230d();
            if (kqx.mo10226a()) {
                this.f25370b.set(i, d);
            }
            return d;
        }
        byte[] bArr = (byte[]) obj;
        d = ksd.m5197c(bArr);
        if (ksd.m5196b(bArr)) {
            this.f25370b.set(i, d);
        }
        return d;
    }

    /* renamed from: b */
    public final Object mo10292b(int i) {
        return this.f25370b.get(i);
    }

    /* renamed from: d */
    public final List mo10293d() {
        return Collections.unmodifiableList(this.f25370b);
    }

    /* renamed from: e */
    public final ksp mo10294e() {
        if (super.mo10280b()) {
            return new kui(this);
        }
        return this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo14139a();
        return kso.m17026a(this.f25370b.set(i, str));
    }

    public final int size() {
        return this.f25370b.size();
    }
}
