package p000;

import java.util.Map;
import java.util.NavigableMap;

/* compiled from: PG */
/* renamed from: iqj */
public final class iqj extends iqk {
    /* renamed from: a */
    private final /* synthetic */ int f21208a;
    /* renamed from: b */
    private final /* synthetic */ iqc f21209b;

    public iqj(NavigableMap navigableMap, int i, iqc iqc) {
        this.f21208a = i;
        this.f21209b = iqc;
        super(navigableMap);
    }

    /* renamed from: a */
    private final Object m12632a() {
        return size() > this.f21208a ? super.remove(this.f21209b.mo8766a(super.navigableKeySet())) : null;
    }

    public final Object put(Object obj, Object obj2) {
        Object put = super.put(obj, obj2);
        return put != null ? put : m12632a();
    }

    public final void putAll(Map map) {
        super.putAll(map);
        do {
        } while (m12632a() != null);
    }
}
