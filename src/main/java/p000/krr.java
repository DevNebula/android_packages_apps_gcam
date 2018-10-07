package p000;

import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: krr */
public final class krr {
    /* renamed from: d */
    public static final krr f8817d = new krr((byte) 0);
    /* renamed from: a */
    public final ktu f8818a = ktu.m5345b(16);
    /* renamed from: b */
    public boolean f8819b;
    /* renamed from: c */
    public boolean f8820c = false;

    private krr() {
    }

    private krr(byte b) {
        mo10273d();
    }

    /* renamed from: a */
    public final krr clone() {
        krr krr = new krr();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= this.f8818a.mo10374c()) {
                break;
            }
            Entry a = this.f8818a.mo10371a(i2);
            krr.mo10269b((krs) a.getKey(), a.getValue());
            i = i2 + 1;
        }
        for (Entry entry : this.f8818a.mo10378d()) {
            krr.mo10269b((krs) entry.getKey(), entry.getValue());
        }
        krr.f8820c = this.f8820c;
        return krr;
    }

    /* renamed from: a */
    private static Object m5178a(Object obj) {
        if (obj instanceof ktj) {
            return ((ktj) obj).mo15185a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Object obj2 = new byte[length];
        System.arraycopy(bArr, 0, obj2, 0, length);
        return obj2;
    }

    /* renamed from: a */
    static int m5177a(kuw kuw, int i, Object obj) {
        int c;
        int k = krh.m14102k(i);
        if (kuw == kuw.GROUP) {
            k += k;
            ksd.m5195a();
        }
        switch (kuw.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                c = krh.m14083c();
                break;
            case 1:
                ((Float) obj).floatValue();
                c = krh.m14093f();
                break;
            case 2:
                c = krh.m14066a(((Long) obj).longValue());
                break;
            case 3:
                c = krh.m14087c(((Long) obj).longValue());
                break;
            case 4:
                c = krh.m14096g(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).longValue();
                c = krh.m14091e();
                break;
            case 6:
                ((Integer) obj).intValue();
                c = krh.m14088d();
                break;
            case 7:
                ((Boolean) obj).booleanValue();
                c = krh.m14073b();
                break;
            case 8:
                if (!(obj instanceof kqx)) {
                    c = krh.m14067a((String) obj);
                    break;
                }
                c = krh.m14068a((kqx) obj);
                break;
            case 9:
                c = krh.m14070a((kte) obj);
                break;
            case 10:
                if (!(obj instanceof ksk)) {
                    c = krh.m14081b((kte) obj);
                    break;
                }
                c = krh.m14069a((ksk) obj);
                break;
            case 11:
                if (!(obj instanceof kqx)) {
                    c = krh.m14072a((byte[]) obj);
                    break;
                }
                c = krh.m14068a((kqx) obj);
                break;
            case 12:
                c = krh.m14103l(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof kse)) {
                    c = krh.m14084c(((Integer) obj).intValue());
                    break;
                }
                c = krh.m14084c(((kse) obj).mo10277a());
                break;
            case 14:
                ((Integer) obj).intValue();
                c = krh.m14095g();
                break;
            case 15:
                ((Long) obj).longValue();
                c = krh.m14098h();
                break;
            case 16:
                c = krh.m14101j(((Integer) obj).intValue());
                break;
            case 17:
                c = krh.m14080b(((Long) obj).longValue());
                break;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return k + c;
    }

    /* renamed from: a */
    public static int m5176a(krs krs, Object obj) {
        return krr.m5177a(krs.f8823c, krs.f8822b, obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krr)) {
            return false;
        }
        return this.f8818a.equals(((krr) obj).f8818a);
    }

    /* renamed from: a */
    public final Object mo10266a(krs krs) {
        Object obj = this.f8818a.get(krs);
        if (obj instanceof ksk) {
            return ksk.m14140a();
        }
        return obj;
    }

    /* renamed from: a */
    static int m5175a(Entry entry) {
        krs krs = (krs) entry.getKey();
        Object value = entry.getValue();
        if (krs.f8823c.f8982d != gcb.f5299k) {
            return krr.m5176a(krs, value);
        }
        if (value instanceof ksk) {
            return krh.m14063a(((krs) entry.getKey()).f8822b, (ksk) value);
        }
        return krh.m14064a(((krs) entry.getKey()).f8822b, (kte) value);
    }

    public final int hashCode() {
        return this.f8818a.hashCode();
    }

    /* renamed from: b */
    public final boolean mo10270b() {
        for (int i = 0; i < this.f8818a.mo10374c(); i++) {
            if (!krr.m5180c(this.f8818a.mo10371a(i))) {
                return false;
            }
        }
        for (Entry c : this.f8818a.mo10378d()) {
            if (!krr.m5180c(c)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m5180c(Entry entry) {
        if (((krs) entry.getKey()).f8823c.f8982d == gcb.f5299k) {
            Object value = entry.getValue();
            if (value instanceof kte) {
                if (!((kte) value).mo10313f()) {
                    return false;
                }
            } else if (value instanceof ksk) {
                return true;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    /* renamed from: c */
    public final Iterator mo10271c() {
        if (this.f8820c) {
            return new ksm(this.f8818a.entrySet().iterator());
        }
        return this.f8818a.entrySet().iterator();
    }

    /* renamed from: d */
    public final void mo10273d() {
        if (!this.f8819b) {
            this.f8818a.mo10379e();
            this.f8819b = true;
        }
    }

    /* renamed from: b */
    final void mo10268b(Entry entry) {
        krs krs = (krs) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof ksk) {
            value = ksk.m14140a();
        }
        if (krs.f8823c.f8982d == gcb.f5299k) {
            Object a = mo10266a(krs);
            if (a == null) {
                this.f8818a.put(krs, krr.m5178a(value));
                return;
            } else if (a instanceof ktj) {
                throw new UnsupportedOperationException();
            } else {
                this.f8818a.put(krs, ((krz) ((kte) a).mo14189h()).mo15158a((kry) ((kte) value)).mo14191c());
                return;
            }
        }
        this.f8818a.put(krs, krr.m5178a(value));
    }

    /* renamed from: b */
    public final void mo10269b(krs krs, Object obj) {
        boolean z = false;
        kuw kuw = krs.f8823c;
        ksd.m5192a(obj);
        switch (kuw.f8982d - 1) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if (!(obj instanceof kqx)) {
                    if (obj instanceof byte[]) {
                        z = true;
                        break;
                    }
                }
                z = true;
                break;
                break;
            case 7:
                if (!(obj instanceof Integer)) {
                    if (obj instanceof kse) {
                        z = true;
                        break;
                    }
                }
                z = true;
                break;
                break;
            case 8:
                if (!(obj instanceof kte)) {
                    if (obj instanceof ksk) {
                        z = true;
                        break;
                    }
                }
                z = true;
                break;
                break;
        }
        if (z) {
            if (obj instanceof ksk) {
                this.f8820c = true;
            }
            this.f8818a.put(krs, obj);
            return;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: a */
    static void m5179a(krh krh, kuw kuw, int i, Object obj) {
        kuw kuw2 = null;
        if (kuw.GROUP == null) {
            kte kte = (kte) obj;
            ksd.m5195a();
            krh.mo14177h(i, 3);
            kte.mo14185a(krh);
            krh.mo14177h(i, 4);
            return;
        }
        krh.mo14177h(i, kuw2.f8983e);
        switch (kuw2.ordinal()) {
            case 0:
                krh.mo14154a(((Double) obj).doubleValue());
                return;
            case 1:
                krh.mo14155a(((Float) obj).floatValue());
                return;
            case 2:
                krh.mo14175f(((Long) obj).longValue());
                return;
            case 3:
                krh.mo14175f(((Long) obj).longValue());
                return;
            case 4:
                krh.mo14181n(((Integer) obj).intValue());
                return;
            case 5:
                krh.mo14169d(((Long) obj).longValue());
                return;
            case 6:
                krh.mo14180m(((Integer) obj).intValue());
                return;
            case 7:
                krh.mo14153a(((Boolean) obj).booleanValue());
                return;
            case 8:
                if (obj instanceof kqx) {
                    krh.mo14163b((kqx) obj);
                    return;
                } else {
                    krh.mo14162b((String) obj);
                    return;
                }
            case 9:
                ((kte) obj).mo14185a(krh);
                return;
            case 10:
                krh.mo14166c((kte) obj);
                return;
            case 11:
                if (obj instanceof kqx) {
                    krh.mo14163b((kqx) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                krh.mo14159a(bArr, bArr.length);
                return;
            case 12:
                krh.mo14183p(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof kse) {
                    krh.mo14181n(((kse) obj).mo10277a());
                    return;
                } else {
                    krh.mo14181n(((Integer) obj).intValue());
                    return;
                }
            case 14:
                krh.mo14180m(((Integer) obj).intValue());
                return;
            case 15:
                krh.mo14169d(((Long) obj).longValue());
                return;
            case 16:
                krh.mo14182o(((Integer) obj).intValue());
                return;
            case 17:
                krh.mo14172e(((Long) obj).longValue());
                return;
            default:
                return;
        }
    }
}
