package p000;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: ihy */
final class ihy extends iik {
    /* renamed from: a */
    private WeakReference f26516a;
    /* renamed from: b */
    private WeakReference f26517b;

    ihy(Map map, Object obj, ici ici) {
        super(ici);
        this.f26516a = new WeakReference(map);
        this.f26517b = new WeakReference(obj);
    }

    /* renamed from: a */
    public final void mo13656a(Status status) {
        Map map = (Map) this.f26516a.get();
        Object obj = this.f26517b.get();
        if (!(status.f23359e != 4002 || map == null || obj == null)) {
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
