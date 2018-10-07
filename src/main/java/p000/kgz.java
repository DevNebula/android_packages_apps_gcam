package p000;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: kgz */
class kgz extends kfx implements SortedSet {
    /* renamed from: a */
    public final kgx f24951a;

    kgz(kgx kgx) {
        this.f24951a = kgx;
    }

    public Comparator comparator() {
        return this.f24951a.mo14051a();
    }

    public Object first() {
        kfu k = this.f24951a.mo14057k();
        if (k != null) {
            return k.mo9987a();
        }
        throw new NoSuchElementException();
    }

    public SortedSet headSet(Object obj) {
        return this.f24951a.mo14052a(obj, kcy.OPEN).mo14056j();
    }

    public Iterator iterator() {
        return khb.m4947b(this.f24951a.mo9948g().iterator());
    }

    public Object last() {
        kfu l = this.f24951a.mo14058l();
        if (l != null) {
            return l.mo9987a();
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    final /* synthetic */ kft mo14026a() {
        return this.f24951a;
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return this.f24951a.mo14053a(obj, kcy.CLOSED, obj2, kcy.OPEN).mo14056j();
    }

    public SortedSet tailSet(Object obj) {
        return this.f24951a.mo14054b(obj, kcy.CLOSED).mo14056j();
    }
}
