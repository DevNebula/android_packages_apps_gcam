package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: apr */
public final class apr {
    /* renamed from: a */
    private final List f863a = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo1664a(Class cls, adi adi) {
        this.f863a.add(new aps(cls, adi));
    }

    /* renamed from: a */
    public final synchronized adi mo1663a(Class cls) {
        adi adi;
        for (aps aps : this.f863a) {
            if (aps.f864a.isAssignableFrom(cls)) {
                adi = aps.f865b;
                break;
            }
        }
        adi = null;
        return adi;
    }
}
