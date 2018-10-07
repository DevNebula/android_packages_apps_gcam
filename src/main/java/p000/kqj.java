package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: kqj */
final class kqj extends WeakReference {
    /* renamed from: a */
    private final int f8790a;

    public kqj(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th == null) {
            throw new NullPointerException("The referent cannot be null");
        }
        this.f8790a = System.identityHashCode(th);
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        kqj kqj = (kqj) obj;
        if (this.f8790a == kqj.f8790a && get() == kqj.get()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8790a;
    }
}
