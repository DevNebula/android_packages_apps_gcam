package p000;

import android.util.LongSparseArray;
import java.util.AbstractList;

/* compiled from: PG */
/* renamed from: jzq */
public final class jzq extends AbstractList {
    /* renamed from: a */
    private final /* synthetic */ LongSparseArray f8517a;

    public jzq(LongSparseArray longSparseArray) {
        this.f8517a = longSparseArray;
    }

    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(this.f8517a.keyAt(i));
    }

    public final int indexOf(Object obj) {
        if (obj instanceof Long) {
            return this.f8517a.indexOfKey(((Long) obj).longValue());
        }
        return -1;
    }

    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        this.f8517a.removeAt(indexOf);
        return true;
    }

    public final int size() {
        return this.f8517a.size();
    }
}
