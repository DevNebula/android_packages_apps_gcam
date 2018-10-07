package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: ihx */
final class ihx extends iik {
    /* renamed from: a */
    private WeakReference f26514a;
    /* renamed from: b */
    private WeakReference f26515b;

    ihx(Map map, Object obj, ici ici) {
        super(ici);
        this.f26514a = new WeakReference(map);
        this.f26515b = new WeakReference(obj);
    }

    /* renamed from: a */
    public final void mo13656a(Status status) {
        Map map = (Map) this.f26514a.get();
        Object obj = this.f26515b.get();
        if (!(status.mo14640b() || map == null || obj == null)) {
            synchronized (map) {
                iip iip = (iip) map.remove(obj);
                if (iip != null) {
                    iip.mo15003a();
                }
            }
        }
        mo15002a(status);
    }
}
