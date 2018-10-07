package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: apy */
public final class apy {
    /* renamed from: a */
    private final List f877a = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo1675a(Class cls, adr adr) {
        this.f877a.add(new apz(cls, adr));
    }

    /* renamed from: a */
    public final synchronized adr mo1674a(Class cls) {
        adr adr;
        int size = this.f877a.size();
        for (int i = 0; i < size; i++) {
            apz apz = (apz) this.f877a.get(i);
            if (apz.f878a.isAssignableFrom(cls)) {
                adr = apz.f879b;
                break;
            }
        }
        adr = null;
        return adr;
    }
}
