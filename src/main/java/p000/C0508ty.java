package p000;

import android.database.Observable;

/* compiled from: PG */
/* renamed from: ty */
public final class C0508ty extends Observable {
    C0508ty() {
    }

    /* renamed from: a */
    public final boolean mo11194a() {
        return this.mObservers.isEmpty() ^ 1;
    }

    /* renamed from: b */
    public final void mo11195b() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C0509tz) this.mObservers.get(size)).mo11196a();
        }
    }
}
