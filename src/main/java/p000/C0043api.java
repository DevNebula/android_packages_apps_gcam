package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* renamed from: api */
public final class C0043api {
    /* renamed from: a */
    public final Set f859a = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: b */
    public final List f860b = new ArrayList();
    /* renamed from: c */
    public boolean f861c;

    /* renamed from: a */
    public final boolean mo1658a(aqb aqb, boolean z) {
        boolean z2 = true;
        if (aqb != null) {
            boolean remove = this.f859a.remove(aqb);
            if (!(this.f860b.remove(aqb) || remove)) {
                z2 = false;
            }
            if (z2) {
                aqb.mo1678c();
                if (z) {
                    aqb.mo1684i();
                }
            }
        }
        return z2;
    }

    public final String toString() {
        String obj = super.toString();
        int size = this.f859a.size();
        boolean z = this.f861c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(obj).length() + 41);
        stringBuilder.append(obj);
        stringBuilder.append("{numRequests=");
        stringBuilder.append(size);
        stringBuilder.append(", isPaused=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
