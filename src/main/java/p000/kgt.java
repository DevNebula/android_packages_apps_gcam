package p000;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: kgt */
abstract class kgt extends AbstractSet {
    kgt() {
    }

    public boolean removeAll(Collection collection) {
        return khb.m4941a((Set) this, collection);
    }

    public boolean retainAll(Collection collection) {
        return super.retainAll((Collection) jri.m13404b((Object) collection));
    }
}
