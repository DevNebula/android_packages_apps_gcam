package p000;

import android.view.Surface;
import java.util.Collection;
import java.util.HashSet;

/* compiled from: PG */
/* renamed from: ivr */
public final class ivr {
    /* renamed from: a */
    private final Object f7862a = new Object();
    /* renamed from: b */
    private final HashSet f7863b = new HashSet();

    /* renamed from: a */
    public final void mo9106a(Collection collection) {
        synchronized (this.f7862a) {
            this.f7863b.addAll(collection);
        }
    }

    /* renamed from: a */
    public final boolean mo9107a(Surface surface) {
        boolean contains;
        synchronized (this.f7862a) {
            contains = this.f7863b.contains(surface);
        }
        return contains;
    }
}
