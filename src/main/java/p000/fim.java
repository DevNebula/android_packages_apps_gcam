package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fim */
public final class fim {
    /* renamed from: a */
    public final int f4795a;
    /* renamed from: b */
    public final Set f4796b;
    /* renamed from: c */
    public final Set f4797c;
    /* renamed from: d */
    public final Set f4798d;
    /* renamed from: e */
    public final kbg f4799e;

    public fim(int i, Set set, Set set2, Set set3, kbg kbg) {
        this.f4795a = i;
        this.f4796b = keu.m13732a((Collection) set);
        this.f4797c = keu.m13732a((Collection) set2);
        this.f4798d = keu.m13732a((Collection) set3);
        this.f4799e = kbg;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof fim)) {
            fim fim = (fim) obj;
            if (kbf.m16778b(Integer.valueOf(this.f4795a), Integer.valueOf(fim.f4795a)) && kbf.m16778b(this.f4796b, fim.f4796b) && kbf.m16778b(this.f4798d, fim.f4798d) && kbf.m16778b(this.f4797c, fim.f4797c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4795a), this.f4796b, this.f4798d, this.f4797c});
    }
}
