package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: kev */
public final class kev extends kei {
    /* renamed from: d */
    private Object[] f24914d;
    /* renamed from: e */
    private int f24915e;

    public kev() {
        super(4);
    }

    kev(int i) {
        super(i);
        this.f24914d = new Object[keu.m13736b(i)];
    }

    /* renamed from: c */
    public final kev mo9849b(Object obj) {
        jri.m13404b(obj);
        if (this.f24914d != null) {
            int b = keu.m13736b(this.f21878b);
            int length = this.f24914d.length;
            if (b <= length) {
                length--;
                int hashCode = obj.hashCode();
                b = khb.m4953c(hashCode);
                while (true) {
                    b &= length;
                    Object[] objArr = this.f24914d;
                    Object obj2 = objArr[b];
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                            break;
                        }
                        b++;
                    } else {
                        objArr[b] = obj;
                        this.f24915e += hashCode;
                        super.mo9849b(obj);
                        break;
                    }
                }
                return this;
            }
        }
        this.f24914d = null;
        super.mo9849b(obj);
        return this;
    }

    /* renamed from: b */
    public final kev mo9847a(Iterable iterable) {
        jri.m13404b((Object) iterable);
        if (this.f24914d != null) {
            for (Object c : iterable) {
                mo9849b(c);
            }
        } else {
            super.mo9847a(iterable);
        }
        return this;
    }

    /* renamed from: a */
    public final keu mo15109a() {
        switch (this.f21878b) {
            case 0:
                return kgn.f24941a;
            case 1:
                return keu.m13727a(this.f21877a[0]);
            default:
                keu a;
                if (this.f24914d == null || keu.m13736b(this.f21878b) != this.f24914d.length) {
                    a = keu.m13726a(this.f21878b, this.f21877a);
                    this.f21878b = a.size();
                } else {
                    Object[] copyOf;
                    if (keu.m13735a(this.f21878b, this.f21877a.length)) {
                        copyOf = Arrays.copyOf(this.f21877a, this.f21878b);
                    } else {
                        copyOf = this.f21877a;
                    }
                    int i = this.f24915e;
                    Object[] objArr = this.f24914d;
                    a = new kgn(copyOf, i, objArr, objArr.length - 1, this.f21878b);
                }
                this.f21879c = true;
                this.f24914d = null;
                return a;
        }
    }
}
