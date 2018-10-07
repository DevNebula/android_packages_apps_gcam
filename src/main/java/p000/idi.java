package p000;

import com.google.android.gms.internal.zzbgq;
import java.lang.ref.WeakReference;

/* renamed from: idi */
final class idi extends iaz {
    /* renamed from: a */
    private final WeakReference f24597a;

    idi(idb idb) {
        super((byte) 0);
        this.f24597a = new WeakReference(idb);
    }

    /* renamed from: a */
    public final void mo8314a(zzbgq zzbgq) {
        idb idb = (idb) this.f24597a.get();
        if (idb != null) {
            idb.f20923a.mo14989a(new idj(idb, idb, zzbgq));
        }
    }
}
