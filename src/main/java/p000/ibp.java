package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: ibp */
final class ibp implements Cloneable {
    /* renamed from: a */
    private ibn f7274a;
    /* renamed from: b */
    private Object f7275b;
    /* renamed from: c */
    private List f7276c = new ArrayList();

    ibp() {
    }

    /* renamed from: d */
    private final ibp m3699d() {
        int i = 0;
        ibp ibp = new ibp();
        try {
            ibp.f7274a = this.f7274a;
            Collection collection = this.f7276c;
            if (collection != null) {
                ibp.f7276c.addAll(collection);
            } else {
                ibp.f7276c = null;
            }
            Object obj = this.f7275b;
            if (obj != null) {
                Object obj2;
                if (obj instanceof ibr) {
                    ibp.f7275b = (ibr) ((ibr) obj).clone();
                } else if (obj instanceof byte[]) {
                    ibp.f7275b = ((byte[]) obj).clone();
                } else if (obj instanceof byte[][]) {
                    byte[][] bArr = (byte[][]) obj;
                    obj2 = new byte[bArr.length][];
                    ibp.f7275b = obj2;
                    while (i < bArr.length) {
                        obj2[i] = (byte[]) bArr[i].clone();
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    ibp.f7275b = ((boolean[]) obj).clone();
                } else if (obj instanceof int[]) {
                    ibp.f7275b = ((int[]) obj).clone();
                } else if (obj instanceof long[]) {
                    ibp.f7275b = ((long[]) obj).clone();
                } else if (obj instanceof float[]) {
                    ibp.f7275b = ((float[]) obj).clone();
                } else if (obj instanceof double[]) {
                    ibp.f7275b = ((double[]) obj).clone();
                } else if (obj instanceof ibr[]) {
                    ibr[] ibrArr = (ibr[]) obj;
                    obj2 = new ibr[ibrArr.length];
                    ibp.f7275b = obj2;
                    while (i < ibrArr.length) {
                        obj2[i] = (ibr) ibrArr[i].clone();
                        i++;
                    }
                }
            }
            return ibp;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: a */
    final int mo8337a() {
        if (this.f7275b == null) {
            Iterator it = this.f7276c.iterator();
            if (!it.hasNext()) {
                return 0;
            }
            it.next();
            throw new NoSuchMethodError();
        }
        throw new NoSuchMethodError();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ibp)) {
            return false;
        }
        ibp ibp = (ibp) obj;
        if (this.f7275b == null || ibp.f7275b == null) {
            List list = this.f7276c;
            if (list != null) {
                List list2 = ibp.f7276c;
                if (list2 != null) {
                    return list.equals(list2);
                }
            }
            try {
                return Arrays.equals(m3698c(), ibp.m3698c());
            } catch (Throwable e) {
                throw new IllegalStateException(e);
            }
        }
        ibn ibn = this.f7274a;
        if (ibn != ibp.f7274a) {
            return false;
        }
        if (!ibn.f7270a.isArray()) {
            return this.f7275b.equals(ibp.f7275b);
        }
        Object obj2 = this.f7275b;
        return obj2 instanceof byte[] ? Arrays.equals((byte[]) obj2, (byte[]) ibp.f7275b) : obj2 instanceof int[] ? Arrays.equals((int[]) obj2, (int[]) ibp.f7275b) : obj2 instanceof long[] ? Arrays.equals((long[]) obj2, (long[]) ibp.f7275b) : obj2 instanceof float[] ? Arrays.equals((float[]) obj2, (float[]) ibp.f7275b) : obj2 instanceof double[] ? Arrays.equals((double[]) obj2, (double[]) ibp.f7275b) : !(obj2 instanceof boolean[]) ? Arrays.deepEquals((Object[]) obj2, (Object[]) ibp.f7275b) : Arrays.equals((boolean[]) obj2, (boolean[]) ibp.f7275b);
    }

    public final int hashCode() {
        try {
            return Arrays.hashCode(m3698c()) + 527;
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: c */
    private final byte[] m3698c() {
        byte[] bArr = new byte[mo8337a()];
        ibl.m3677a(bArr, 0);
        mo8338b();
        return bArr;
    }

    /* renamed from: b */
    final void mo8338b() {
        if (this.f7275b == null) {
            Iterator it = this.f7276c.iterator();
            if (it.hasNext()) {
                it.next();
                throw new NoSuchMethodError();
            }
            return;
        }
        throw new NoSuchMethodError();
    }
}
