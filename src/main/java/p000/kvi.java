package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* renamed from: kvi */
final class kvi implements Cloneable {
    /* renamed from: a */
    public kvg f9019a;
    /* renamed from: b */
    public Object f9020b;
    /* renamed from: c */
    public List f9021c;

    kvi() {
        this.f9021c = new ArrayList();
    }

    kvi(kvg kvg, Object obj) {
        this.f9019a = kvg;
        this.f9020b = obj;
    }

    /* renamed from: a */
    public final kvi clone() {
        int i = 0;
        kvi kvi = new kvi();
        try {
            kvi.f9019a = this.f9019a;
            Collection collection = this.f9021c;
            if (collection == null) {
                kvi.f9021c = null;
            } else {
                kvi.f9021c.addAll(collection);
            }
            Object obj = this.f9020b;
            if (obj != null) {
                if (obj instanceof kvl) {
                    kvi.f9020b = ((kvl) obj).clone();
                } else if (obj instanceof byte[]) {
                    kvi.f9020b = ((byte[]) obj).clone();
                } else if (obj instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) obj;
                    Object obj2 = new byte[bArr.length][];
                    kvi.f9020b = obj2;
                    while (true) {
                        int i2 = i;
                        if (i2 >= bArr.length) {
                            break;
                        }
                        obj2[i2] = (byte[]) bArr[i2].clone();
                        i = i2 + 1;
                    }
                } else if (obj instanceof boolean[]) {
                    kvi.f9020b = ((boolean[]) obj).clone();
                } else if (obj instanceof int[]) {
                    kvi.f9020b = ((int[]) obj).clone();
                } else if (obj instanceof long[]) {
                    kvi.f9020b = ((long[]) obj).clone();
                } else if (obj instanceof float[]) {
                    kvi.f9020b = ((float[]) obj).clone();
                } else if (obj instanceof double[]) {
                    kvi.f9020b = ((double[]) obj).clone();
                } else if (obj instanceof kvl[]) {
                    kvl[] kvlArr = (kvl[]) obj;
                    Object obj3 = new kvl[kvlArr.length];
                    kvi.f9020b = obj3;
                    while (i < kvlArr.length) {
                        obj3[i] = kvlArr[i].clone();
                        i++;
                    }
                }
            }
            return kvi;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    final int mo10516b() {
        if (this.f9020b == null) {
            Iterator it = this.f9021c.iterator();
            int i = 0;
            while (true) {
                int i2 = i;
                if (!it.hasNext()) {
                    return i2;
                }
                kvm kvm = (kvm) it.next();
                i = (kvm.f9025b.length + kvd.m5484b(kvm.f9024a)) + i2;
            }
        } else {
            throw new NoSuchMethodError();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kvi)) {
            return false;
        }
        kvi kvi = (kvi) obj;
        if (this.f9020b == null || kvi.f9020b == null) {
            List list = this.f9021c;
            if (list != null) {
                List list2 = kvi.f9021c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(m5509c(), kvi.m5509c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        kvg kvg = this.f9019a;
        if (kvg != kvi.f9019a) {
            return false;
        }
        if (!kvg.f9012a.isArray()) {
            return this.f9020b.equals(kvi.f9020b);
        }
        Object obj2 = this.f9020b;
        if (obj2 instanceof byte[]) {
            return Arrays.equals((byte[]) obj2, (byte[]) kvi.f9020b);
        }
        if (obj2 instanceof int[]) {
            return Arrays.equals((int[]) obj2, (int[]) kvi.f9020b);
        }
        if (obj2 instanceof long[]) {
            return Arrays.equals((long[]) obj2, (long[]) kvi.f9020b);
        }
        if (obj2 instanceof float[]) {
            return Arrays.equals((float[]) obj2, (float[]) kvi.f9020b);
        }
        if (obj2 instanceof double[]) {
            return Arrays.equals((double[]) obj2, (double[]) kvi.f9020b);
        }
        if (obj2 instanceof boolean[]) {
            return Arrays.equals((boolean[]) obj2, (boolean[]) kvi.f9020b);
        }
        return Arrays.deepEquals((Object[]) obj2, (Object[]) kvi.f9020b);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m5509c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    final void mo10515a(kvg kvg, Object obj) {
        this.f9019a = kvg;
        this.f9020b = obj;
        this.f9021c = null;
    }

    /* renamed from: c */
    private final byte[] m5509c() {
        byte[] bArr = new byte[mo10516b()];
        mo10514a(kvd.m5482a(bArr, 0, bArr.length));
        return bArr;
    }

    /* renamed from: a */
    final void mo10514a(kvd kvd) {
        if (this.f9020b == null) {
            for (kvm kvm : this.f9021c) {
                kvd.mo10501e(kvm.f9024a);
                kvd.mo10492a(kvm.f9025b);
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}
