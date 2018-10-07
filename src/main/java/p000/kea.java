package p000;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: PG */
/* renamed from: kea */
public abstract class kea extends kdz implements SortedSet {
    protected kea() {
    }

    /* renamed from: d */
    protected abstract SortedSet mo15095c();

    public Comparator comparator() {
        return mo15095c().comparator();
    }

    public Object first() {
        return mo15095c().first();
    }

    public SortedSet headSet(Object obj) {
        return mo15095c().headSet(obj);
    }

    public Object last() {
        return mo15095c().last();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return mo15095c().subSet(obj, obj2);
    }

    public SortedSet tailSet(Object obj) {
        return mo15095c().tailSet(obj);
    }
}
