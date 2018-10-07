package p000;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: kgv */
final class kgv extends kea implements Serializable, NavigableSet {
    public static final long serialVersionUID = 0;
    /* renamed from: a */
    private final NavigableSet f26741a;
    /* renamed from: b */
    private final SortedSet f26742b;
    /* renamed from: c */
    private transient kgv f26743c;

    kgv(NavigableSet navigableSet) {
        this.f26741a = (NavigableSet) jri.m13404b((Object) navigableSet);
        this.f26742b = Collections.unmodifiableSortedSet(navigableSet);
    }

    public final Object ceiling(Object obj) {
        return this.f26741a.ceiling(obj);
    }

    /* renamed from: F_ */
    protected final /* synthetic */ Object mo9820F_() {
        return this.f26742b;
    }

    /* renamed from: b */
    protected final /* synthetic */ Collection mo13974b() {
        return this.f26742b;
    }

    /* renamed from: c */
    protected final /* synthetic */ Set mo15095c() {
        return this.f26742b;
    }

    /* renamed from: d */
    protected final SortedSet mo15593d() {
        return this.f26742b;
    }

    public final Iterator descendingIterator() {
        return khb.m4961d(this.f26741a.descendingIterator());
    }

    public final NavigableSet descendingSet() {
        NavigableSet navigableSet = this.f26743c;
        if (navigableSet != null) {
            return navigableSet;
        }
        navigableSet = new kgv(this.f26741a.descendingSet());
        this.f26743c = navigableSet;
        navigableSet.f26743c = this;
        return navigableSet;
    }

    public final Object floor(Object obj) {
        return this.f26741a.floor(obj);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return khb.m4929a(this.f26741a.headSet(obj, z));
    }

    public final Object higher(Object obj) {
        return this.f26741a.higher(obj);
    }

    public final Object lower(Object obj) {
        return this.f26741a.lower(obj);
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return khb.m4929a(this.f26741a.subSet(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return khb.m4929a(this.f26741a.tailSet(obj, z));
    }
}
