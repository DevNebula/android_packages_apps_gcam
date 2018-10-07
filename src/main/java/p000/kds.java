package p000;

import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kds */
abstract class kds extends kdx implements kgx {
    /* renamed from: a */
    private transient Comparator f26583a;
    /* renamed from: b */
    private transient NavigableSet f26584b;
    /* renamed from: c */
    private transient Set f26585c;

    kds() {
    }

    /* renamed from: c */
    abstract Iterator mo15590c();

    /* renamed from: d */
    abstract kgx mo13974b();

    /* renamed from: a */
    public final Comparator mo14051a() {
        Comparator comparator = this.f26583a;
        if (comparator != null) {
            return comparator;
        }
        kgd kgd;
        comparator = mo13974b().mo14051a();
        if (comparator instanceof kgd) {
            kgd = (kgd) comparator;
        } else {
            kgd = new kdm(comparator);
        }
        comparator = kgd.mo9965a();
        this.f26583a = comparator;
        return comparator;
    }

    /* renamed from: f */
    protected final kft mo15094f() {
        return mo13974b();
    }

    /* renamed from: i */
    public final kgx mo14055i() {
        return mo13974b();
    }

    /* renamed from: j */
    public final NavigableSet mo9946e() {
        NavigableSet navigableSet = this.f26584b;
        if (navigableSet != null) {
            return navigableSet;
        }
        navigableSet = new kha(this);
        this.f26584b = navigableSet;
        return navigableSet;
    }

    /* renamed from: g */
    public final Set mo9948g() {
        Set set = this.f26585c;
        if (set != null) {
            return set;
        }
        set = new kdt(this);
        this.f26585c = set;
        return set;
    }

    /* renamed from: k */
    public final kfu mo14057k() {
        return mo13974b().mo14058l();
    }

    /* renamed from: a */
    public final kgx mo14052a(Object obj, kcy kcy) {
        return mo13974b().mo14054b(obj, kcy).mo14055i();
    }

    public Iterator iterator() {
        return khb.m4926a((kft) this);
    }

    /* renamed from: l */
    public final kfu mo14058l() {
        return mo13974b().mo14057k();
    }

    /* renamed from: m */
    public final kfu mo14059m() {
        return mo13974b().mo14060n();
    }

    /* renamed from: n */
    public final kfu mo14060n() {
        return mo13974b().mo14059m();
    }

    /* renamed from: a */
    public final kgx mo14053a(Object obj, kcy kcy, Object obj2, kcy kcy2) {
        return mo13974b().mo14053a(obj2, kcy2, obj, kcy).mo14055i();
    }

    /* renamed from: b */
    public final kgx mo14054b(Object obj, kcy kcy) {
        return mo13974b().mo14052a(obj, kcy).mo14055i();
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int size = size();
        if (objArr.length >= size) {
            objArr2 = objArr;
        } else {
            objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        int i = 0;
        for (Object obj : this) {
            int i2 = i + 1;
            objArr2[i] = obj;
            i = i2;
        }
        if (objArr2.length > size) {
            objArr2[size] = null;
        }
        return objArr2;
    }

    public String toString() {
        return mo9948g().toString();
    }
}
