package p000;

import java.util.HashMap;
import java.util.Set;

/* compiled from: PG */
/* renamed from: gqq */
public final class gqq {
    /* renamed from: a */
    public final HashMap f6001a = new HashMap();
    /* renamed from: b */
    private final gqi f6002b;
    /* renamed from: c */
    private boolean f6003c;

    public gqq(gqi gqi, Set set) {
        this.f6002b = gqi;
        for (Class put : set) {
            this.f6001a.put(put, Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    public final void mo7355a(Class cls, boolean z) {
        boolean containsKey = this.f6001a.containsKey(cls);
        String cls2 = cls.toString();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(cls2).length() + 50);
        stringBuilder.append("active state ");
        stringBuilder.append(cls2);
        stringBuilder.append(" must be one of the predicate states.");
        jri.m13396a(containsKey, stringBuilder.toString());
        this.f6001a.put(cls, Boolean.valueOf(z));
    }

    /* renamed from: a */
    public final void mo7356a(boolean z) {
        if (z != this.f6003c) {
            this.f6003c = z;
            if (this.f6003c) {
                this.f6002b.mo7343a();
            } else {
                this.f6002b.mo7344b();
            }
        }
    }
}
