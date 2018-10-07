package p000;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* renamed from: kei */
class kei extends kej {
    /* renamed from: a */
    public Object[] f21877a;
    /* renamed from: b */
    public int f21878b = 0;
    /* renamed from: c */
    public boolean f21879c;

    kei(int i) {
        khb.m4919a(i, "initialCapacity");
        this.f21877a = new Object[i];
    }

    /* renamed from: a */
    public kei mo9849b(Object obj) {
        jri.m13404b(obj);
        m13703a(this.f21878b + 1);
        Object[] objArr = this.f21877a;
        int i = this.f21878b;
        this.f21878b = i + 1;
        objArr[i] = obj;
        return this;
    }

    /* renamed from: a */
    public kej mo9847a(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            m13703a(this.f21878b + collection.size());
            if (collection instanceof keh) {
                this.f21878b = ((keh) collection).mo9832a(this.f21877a, this.f21878b);
                return this;
            }
        }
        super.mo9847a(iterable);
        return this;
    }

    /* renamed from: a */
    private final void m13703a(int i) {
        Object obj = this.f21877a;
        int length = obj.length;
        if (length < i) {
            this.f21877a = Arrays.copyOf(obj, kej.m4861a(length, i));
            this.f21879c = false;
        } else if (this.f21879c) {
            this.f21877a = (Object[]) obj.clone();
            this.f21879c = false;
        }
    }
}
