package p000;

import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: PG */
/* renamed from: kha */
final class kha extends kgz implements NavigableSet {
    kha(kgx kgx) {
        super(kgx);
    }

    public final Object ceiling(Object obj) {
        kfu k = this.f24951a.mo14054b(obj, kcy.CLOSED).mo14057k();
        return k != null ? k.mo9987a() : null;
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet descendingSet() {
        return new kha(this.f24951a.mo14055i());
    }

    public final Object floor(Object obj) {
        kfu l = this.f24951a.mo14052a(obj, kcy.CLOSED).mo14058l();
        return l != null ? l.mo9987a() : null;
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new kha(this.f24951a.mo14052a(obj, kcy.m4826a(z)));
    }

    public final Object higher(Object obj) {
        kfu k = this.f24951a.mo14054b(obj, kcy.OPEN).mo14057k();
        return k != null ? k.mo9987a() : null;
    }

    public final Object lower(Object obj) {
        kfu l = this.f24951a.mo14052a(obj, kcy.OPEN).mo14058l();
        return l != null ? l.mo9987a() : null;
    }

    public final Object pollFirst() {
        kfu m = this.f24951a.mo14059m();
        return m != null ? m.mo9987a() : null;
    }

    public final Object pollLast() {
        kfu n = this.f24951a.mo14060n();
        return n != null ? n.mo9987a() : null;
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new kha(this.f24951a.mo14053a(obj, kcy.m4826a(z), obj2, kcy.m4826a(z2)));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new kha(this.f24951a.mo14054b(obj, kcy.m4826a(z)));
    }
}
