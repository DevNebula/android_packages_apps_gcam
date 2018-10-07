package p000;

import java.util.Collection;

/* compiled from: PG */
/* renamed from: kfx */
abstract class kfx extends kgt {
    kfx() {
    }

    /* renamed from: a */
    abstract kft mo14026a();

    public void clear() {
        mo14026a().clear();
    }

    public boolean contains(Object obj) {
        return mo14026a().contains(obj);
    }

    public boolean containsAll(Collection collection) {
        return mo14026a().containsAll(collection);
    }

    public boolean isEmpty() {
        return mo14026a().isEmpty();
    }

    public boolean remove(Object obj) {
        return mo14026a().mo9942b(obj, LfuScheduler.MAX_PRIORITY) > 0;
    }

    public int size() {
        return mo14026a().mo9948g().size();
    }
}
