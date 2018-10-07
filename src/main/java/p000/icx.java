package p000;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

/* renamed from: icx */
public final class icx {
    /* renamed from: a */
    public final Map f7303a = Collections.synchronizedMap(new WeakHashMap());
    /* renamed from: b */
    public final Map f7304b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    final void mo8369a(boolean z, Status status) {
        synchronized (this.f7303a) {
            Map hashMap = new HashMap(this.f7303a);
        }
        synchronized (this.f7304b) {
            Map hashMap2 = new HashMap(this.f7304b);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((ick) entry.getKey()).mo13624c(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((ifw) entry2.getKey()).mo8432a(new bpm(status));
            }
        }
    }
}
