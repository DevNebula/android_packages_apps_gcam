package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: khh */
final class khh extends khl implements NavigableSet {
    public static final long serialVersionUID = 0;
    /* renamed from: b */
    private transient NavigableSet f26744b;

    khh(NavigableSet navigableSet, Object obj) {
        super(navigableSet, obj);
    }

    public final Object ceiling(Object obj) {
        Object ceiling;
        synchronized (this.f8653a) {
            ceiling = ((NavigableSet) super.mo15131c()).ceiling(obj);
        }
        return ceiling;
    }

    /* renamed from: a */
    final /* synthetic */ Object mo9985a() {
        return (NavigableSet) super.mo15131c();
    }

    /* renamed from: b */
    final /* synthetic */ Collection mo14063b() {
        return (NavigableSet) super.mo15131c();
    }

    /* renamed from: c */
    final /* synthetic */ Set mo15131c() {
        return (NavigableSet) super.mo15131c();
    }

    /* renamed from: d */
    final /* synthetic */ SortedSet mo15630d() {
        return (NavigableSet) super.mo15131c();
    }

    public final Iterator descendingIterator() {
        return ((NavigableSet) super.mo15131c()).descendingIterator();
    }

    public final NavigableSet descendingSet() {
        NavigableSet navigableSet;
        synchronized (this.f8653a) {
            navigableSet = this.f26744b;
            if (navigableSet != null) {
            } else {
                navigableSet = khb.m4930a(((NavigableSet) super.mo15131c()).descendingSet(), this.f8653a);
                this.f26744b = navigableSet;
            }
        }
        return navigableSet;
    }

    public final Object floor(Object obj) {
        Object floor;
        synchronized (this.f8653a) {
            floor = ((NavigableSet) super.mo15131c()).floor(obj);
        }
        return floor;
    }

    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        NavigableSet a;
        synchronized (this.f8653a) {
            a = khb.m4930a(((NavigableSet) super.mo15131c()).headSet(obj, z), this.f8653a);
        }
        return a;
    }

    public final Object higher(Object obj) {
        Object higher;
        synchronized (this.f8653a) {
            higher = ((NavigableSet) super.mo15131c()).higher(obj);
        }
        return higher;
    }

    public final Object lower(Object obj) {
        Object lower;
        synchronized (this.f8653a) {
            lower = ((NavigableSet) super.mo15131c()).lower(obj);
        }
        return lower;
    }

    public final Object pollFirst() {
        Object pollFirst;
        synchronized (this.f8653a) {
            pollFirst = ((NavigableSet) super.mo15131c()).pollFirst();
        }
        return pollFirst;
    }

    public final Object pollLast() {
        Object pollLast;
        synchronized (this.f8653a) {
            pollLast = ((NavigableSet) super.mo15131c()).pollLast();
        }
        return pollLast;
    }

    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        NavigableSet a;
        synchronized (this.f8653a) {
            a = khb.m4930a(((NavigableSet) super.mo15131c()).subSet(obj, z, obj2, z2), this.f8653a);
        }
        return a;
    }

    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        NavigableSet a;
        synchronized (this.f8653a) {
            a = khb.m4930a(((NavigableSet) super.mo15131c()).tailSet(obj, z), this.f8653a);
        }
        return a;
    }
}
