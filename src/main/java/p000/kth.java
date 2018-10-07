package p000;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kth */
final class kth implements ktr {
    /* renamed from: a */
    private static final int[] f21984a = new int[0];
    /* renamed from: b */
    private static final Unsafe f21985b = kul.m5375a();
    /* renamed from: c */
    private final int[] f21986c;
    /* renamed from: d */
    private final Object[] f21987d;
    /* renamed from: e */
    private final int f21988e;
    /* renamed from: f */
    private final int f21989f;
    /* renamed from: g */
    private final kte f21990g;
    /* renamed from: h */
    private final boolean f21991h;
    /* renamed from: i */
    private final boolean f21992i;
    /* renamed from: j */
    private final boolean f21993j;
    /* renamed from: k */
    private final boolean f21994k;
    /* renamed from: l */
    private final int[] f21995l;
    /* renamed from: m */
    private final int f21996m;
    /* renamed from: n */
    private final int f21997n;
    /* renamed from: o */
    private final ksq f21998o;
    /* renamed from: p */
    private final kug f21999p;
    /* renamed from: q */
    private final krp f22000q;
    /* renamed from: r */
    private final kta f22001r;

    private kth(int[] iArr, Object[] objArr, int i, int i2, kte kte, boolean z, int[] iArr2, int i3, int i4, ktk ktk, ksq ksq, kug kug, krp krp, kta kta) {
        this.f21986c = iArr;
        this.f21987d = objArr;
        this.f21988e = i;
        this.f21989f = i2;
        this.f21992i = kte instanceof kry;
        this.f21993j = z;
        boolean z2 = krp == null ? false : kte instanceof ksb;
        this.f21991h = z2;
        this.f21994k = false;
        this.f21995l = iArr2;
        this.f21996m = i3;
        this.f21997n = i4;
        this.f21998o = ksq;
        this.f21999p = kug;
        this.f22000q = krp;
        this.f21990g = kte;
        this.f22001r = kta;
    }

    /* renamed from: a */
    private final boolean m14183a(Object obj, Object obj2, int i) {
        return m14179a(obj, i) == m14179a(obj2, i);
    }

    /* renamed from: a */
    public final boolean mo10364a(Object obj, Object obj2) {
        int length = this.f21986c.length;
        for (int i = 0; i < length; i += 3) {
            boolean z;
            int f = m14197f(i);
            long j = (long) (f & 1048575);
            switch (kth.m14195e(f)) {
                case 0:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5400i(obj, j) == kul.m5400i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 1:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5399h(obj, j) == kul.m5399h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 2:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5400i(obj, j) == kul.m5400i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 3:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5400i(obj, j) == kul.m5400i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 4:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5399h(obj, j) == kul.m5399h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 5:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5400i(obj, j) == kul.m5400i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 6:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5399h(obj, j) == kul.m5399h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 7:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5384a(obj, j) == kul.m5384a(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 8:
                    if (m14183a(obj, obj2, i)) {
                        if (!ktt.m5306a(kul.m5401j(obj, j), kul.m5401j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 9:
                    if (m14183a(obj, obj2, i)) {
                        if (!ktt.m5306a(kul.m5401j(obj, j), kul.m5401j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 10:
                    if (m14183a(obj, obj2, i)) {
                        if (!ktt.m5306a(kul.m5401j(obj, j), kul.m5401j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 11:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5399h(obj, j) == kul.m5399h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 12:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5399h(obj, j) == kul.m5399h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 13:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5399h(obj, j) == kul.m5399h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 14:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5400i(obj, j) == kul.m5400i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 15:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5399h(obj, j) == kul.m5399h(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 16:
                    if (m14183a(obj, obj2, i)) {
                        if (kul.m5400i(obj, j) == kul.m5400i(obj2, j)) {
                            z = true;
                            break;
                        }
                        z = false;
                        break;
                    }
                    z = false;
                    break;
                case 17:
                    if (m14183a(obj, obj2, i)) {
                        if (!ktt.m5306a(kul.m5401j(obj, j), kul.m5401j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = ktt.m5306a(kul.m5401j(obj, j), kul.m5401j(obj2, j));
                    break;
                case 50:
                    z = ktt.m5306a(kul.m5401j(obj, j), kul.m5401j(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long d = (long) (m14194d(i) & 1048575);
                    if (kul.m5399h(obj, d) == kul.m5399h(obj2, d)) {
                        if (!ktt.m5306a(kul.m5401j(obj, j), kul.m5401j(obj2, j))) {
                            z = false;
                            break;
                        }
                        z = true;
                        break;
                    }
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (!z) {
                return false;
            }
        }
        if (!((kry) obj).f26607e.equals(((kry) obj2).f26607e)) {
            return false;
        }
        if (this.f21991h) {
            return ((ksb) obj).f26750g.equals(((ksb) obj2).f26750g);
        }
        return true;
    }

    /* renamed from: a */
    private final Object m14170a(Object obj, int i, Object obj2, kug kug) {
        int i2 = this.f21986c[i];
        Object j = kul.m5401j(obj, (long) (m14197f(i) & 1048575));
        if (j == null) {
            return obj2;
        }
        ksf a = m14173a(i);
        if (a != null) {
            return kth.m14169a(i2, (ksz) j, a, obj2, kug);
        }
        return obj2;
    }

    /* renamed from: a */
    private static Object m14169a(int i, Map map, ksf ksf, Object obj, kug kug) {
        kta.m5224a();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (ksf.mo10278a(((Integer) entry.getValue()).intValue()) == null) {
                if (obj == null) {
                    obj = kuh.m5367b();
                }
                kue b = kqx.m5119b(ksx.m14157a(entry.getKey(), entry.getValue()));
                try {
                    ksx.m14158a(b.f22011a, entry.getKey(), entry.getValue());
                    ((kuh) obj).mo10413a((i << 3) | 2, (Object) b.mo14193d());
                    it.remove();
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return obj;
    }

    /* renamed from: a */
    private final ksf m14173a(int i) {
        int i2 = i / 3;
        return (ksf) this.f21987d[(i2 + i2) + 1];
    }

    /* renamed from: b */
    private final ktr m14184b(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        ktr ktr = (ktr) this.f21987d[i3];
        if (ktr != null) {
            return ktr;
        }
        ktr = kto.f8910a.mo10314a((Class) this.f21987d[i3 + 1]);
        this.f21987d[i3] = ktr;
        return ktr;
    }

    /* renamed from: a */
    public final int mo10360a(Object obj) {
        int i;
        int i2;
        int i3;
        int e;
        int i4;
        Object j;
        kug kug;
        if (this.f21993j) {
            Unsafe unsafe = f21985b;
            i = 0;
            i2 = 0;
            while (true) {
                i3 = i;
                if (i3 < this.f21986c.length) {
                    i = m14197f(i3);
                    e = kth.m14195e(i);
                    i4 = this.f21986c[i3];
                    long j2 = (long) (i & 1048575);
                    if (e < krt.DOUBLE_LIST_PACKED.f8877k || e <= krt.SINT64_LIST_PACKED.f8877k) {
                    }
                    switch (e) {
                        case 0:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14074b(i4);
                            break;
                        case 1:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14094f(i4);
                            break;
                        case 2:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14060a(i4, kul.m5400i(obj, j2));
                            break;
                        case 3:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14086c(i4, kul.m5400i(obj, j2));
                            break;
                        case 4:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14075b(i4, kul.m5399h(obj, j2));
                            break;
                        case 5:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14092e(i4);
                            break;
                        case 6:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14089d(i4);
                            break;
                        case 7:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14058a(i4);
                            break;
                        case 8:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            j = kul.m5401j(obj, j2);
                            if (!(j instanceof kqx)) {
                                i2 += krh.m14061a(i4, (String) j);
                                break;
                            }
                            i2 += krh.m14062a(i4, (kqx) j);
                            break;
                        case 9:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += ktt.m5291a(i4, kul.m5401j(obj, j2), m14184b(i3));
                            break;
                        case 10:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14062a(i4, (kqx) kul.m5401j(obj, j2));
                            break;
                        case 11:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14090d(i4, kul.m5399h(obj, j2));
                            break;
                        case 12:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14059a(i4, kul.m5399h(obj, j2));
                            break;
                        case 13:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14099h(i4);
                            break;
                        case 14:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14100i(i4);
                            break;
                        case 15:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14085c(i4, kul.m5399h(obj, j2));
                            break;
                        case 16:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14076b(i4, kul.m5400i(obj, j2));
                            break;
                        case 17:
                            if (!m14179a(obj, i3)) {
                                break;
                            }
                            i2 += krh.m14065a(i4, (kte) kul.m5401j(obj, j2), m14184b(i3));
                            break;
                        case 18:
                            i2 += ktt.m5320e(i4, kth.m14172a(obj, j2));
                            break;
                        case 19:
                            i2 += ktt.m5317d(i4, kth.m14172a(obj, j2));
                            break;
                        case 20:
                            i2 += ktt.m5326g(i4, kth.m14172a(obj, j2));
                            break;
                        case 21:
                            i2 += ktt.m5340l(i4, kth.m14172a(obj, j2));
                            break;
                        case 22:
                            i2 += ktt.m5323f(i4, kth.m14172a(obj, j2));
                            break;
                        case 23:
                            i2 += ktt.m5320e(i4, kth.m14172a(obj, j2));
                            break;
                        case 24:
                            i2 += ktt.m5317d(i4, kth.m14172a(obj, j2));
                            break;
                        case 25:
                            i2 += ktt.m5292a(i4, kth.m14172a(obj, j2));
                            break;
                        case 26:
                            i2 += ktt.m5335j(i4, kth.m14172a(obj, j2));
                            break;
                        case 27:
                            i2 += ktt.m5308b(i4, kth.m14172a(obj, j2), m14184b(i3));
                            break;
                        case 28:
                            i2 += ktt.m5307b(i4, kth.m14172a(obj, j2));
                            break;
                        case 29:
                            i2 += ktt.m5338k(i4, kth.m14172a(obj, j2));
                            break;
                        case 30:
                            i2 += ktt.m5314c(i4, kth.m14172a(obj, j2));
                            break;
                        case 31:
                            i2 += ktt.m5317d(i4, kth.m14172a(obj, j2));
                            break;
                        case 32:
                            i2 += ktt.m5320e(i4, kth.m14172a(obj, j2));
                            break;
                        case 33:
                            i2 += ktt.m5329h(i4, kth.m14172a(obj, j2));
                            break;
                        case 34:
                            i2 += ktt.m5332i(i4, kth.m14172a(obj, j2));
                            break;
                        case 35:
                            i = ktt.m5318d((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 36:
                            i = ktt.m5315c((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 37:
                            i = ktt.m5324f((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 38:
                            i = ktt.m5336j((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 39:
                            i = ktt.m5321e((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 40:
                            i = ktt.m5318d((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 41:
                            i = ktt.m5315c((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 42:
                            i = ktt.m5294a((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 43:
                            i = ktt.m5333i((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 44:
                            i = ktt.m5309b((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 45:
                            i = ktt.m5315c((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 46:
                            i = ktt.m5318d((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 47:
                            i = ktt.m5327g((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 48:
                            i = ktt.m5330h((List) unsafe.getObject(obj, j2));
                            if (i <= 0) {
                                break;
                            }
                            i2 += i + (krh.m14102k(i4) + krh.m14103l(i));
                            break;
                        case 49:
                            i2 += ktt.m5293a(i4, kth.m14172a(obj, j2), m14184b(i3));
                            break;
                        case 50:
                            i2 += kta.m5222a(kul.m5401j(obj, j2));
                            break;
                        case 51:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14074b(i4);
                            break;
                        case 52:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14094f(i4);
                            break;
                        case 53:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14060a(i4, kth.m14198f(obj, j2));
                            break;
                        case 54:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14086c(i4, kth.m14198f(obj, j2));
                            break;
                        case 55:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14075b(i4, kth.m14196e(obj, j2));
                            break;
                        case 56:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14092e(i4);
                            break;
                        case 57:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14089d(i4);
                            break;
                        case 58:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14058a(i4);
                            break;
                        case 59:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            j = kul.m5401j(obj, j2);
                            if (!(j instanceof kqx)) {
                                i2 += krh.m14061a(i4, (String) j);
                                break;
                            }
                            i2 += krh.m14062a(i4, (kqx) j);
                            break;
                        case 60:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += ktt.m5291a(i4, kul.m5401j(obj, j2), m14184b(i3));
                            break;
                        case 61:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14062a(i4, (kqx) kul.m5401j(obj, j2));
                            break;
                        case 62:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14090d(i4, kth.m14196e(obj, j2));
                            break;
                        case 63:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14059a(i4, kth.m14196e(obj, j2));
                            break;
                        case 64:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14099h(i4);
                            break;
                        case 65:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14100i(i4);
                            break;
                        case 66:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14085c(i4, kth.m14196e(obj, j2));
                            break;
                        case 67:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14076b(i4, kth.m14198f(obj, j2));
                            break;
                        case 68:
                            if (!m14180a(obj, i4, i3)) {
                                break;
                            }
                            i2 += krh.m14065a(i4, (kte) kul.m5401j(obj, j2), m14184b(i3));
                            break;
                        default:
                            break;
                    }
                    i = i3 + 3;
                } else {
                    kug = this.f21999p;
                    return ((kry) obj).f26607e.mo10412a() + i2;
                }
            }
        }
        int i5;
        Unsafe unsafe2 = f21985b;
        i2 = -1;
        e = 0;
        i3 = 0;
        i = 0;
        while (i3 < this.f21986c.length) {
            int f = m14197f(i3);
            int i6 = this.f21986c[i3];
            int e2 = kth.m14195e(f);
            if (e2 <= 17) {
                i4 = this.f21986c[i3 + 2];
                i5 = 1048575 & i4;
                i4 = 1 << (i4 >>> 20);
                if (i5 != i2) {
                    i = unsafe2.getInt(obj, (long) i5);
                    i2 = i5;
                }
                i5 = i2;
                i2 = i;
                i = i4;
            } else {
                i5 = i2;
                i2 = i;
                i = 0;
            }
            long j3 = (long) (1048575 & f);
            switch (e2) {
                case 0:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14074b(i6);
                    break;
                case 1:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14094f(i6);
                    break;
                case 2:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14060a(i6, unsafe2.getLong(obj, j3));
                    break;
                case 3:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14086c(i6, unsafe2.getLong(obj, j3));
                    break;
                case 4:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14075b(i6, unsafe2.getInt(obj, j3));
                    break;
                case 5:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14092e(i6);
                    break;
                case 6:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14089d(i6);
                    break;
                case 7:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14058a(i6);
                    break;
                case 8:
                    if ((i & i2) == 0) {
                        break;
                    }
                    j = unsafe2.getObject(obj, j3);
                    if (!(j instanceof kqx)) {
                        e += krh.m14061a(i6, (String) j);
                        break;
                    }
                    e += krh.m14062a(i6, (kqx) j);
                    break;
                case 9:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += ktt.m5291a(i6, unsafe2.getObject(obj, j3), m14184b(i3));
                    break;
                case 10:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14062a(i6, (kqx) unsafe2.getObject(obj, j3));
                    break;
                case 11:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14090d(i6, unsafe2.getInt(obj, j3));
                    break;
                case 12:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14059a(i6, unsafe2.getInt(obj, j3));
                    break;
                case 13:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14099h(i6);
                    break;
                case 14:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14100i(i6);
                    break;
                case 15:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14085c(i6, unsafe2.getInt(obj, j3));
                    break;
                case 16:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14076b(i6, unsafe2.getLong(obj, j3));
                    break;
                case 17:
                    if ((i & i2) == 0) {
                        break;
                    }
                    e += krh.m14065a(i6, (kte) unsafe2.getObject(obj, j3), m14184b(i3));
                    break;
                case 18:
                    e += ktt.m5320e(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 19:
                    e += ktt.m5317d(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 20:
                    e += ktt.m5326g(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 21:
                    e += ktt.m5340l(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 22:
                    e += ktt.m5323f(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 23:
                    e += ktt.m5320e(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 24:
                    e += ktt.m5317d(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 25:
                    e += ktt.m5292a(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 26:
                    e += ktt.m5335j(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 27:
                    e += ktt.m5308b(i6, (List) unsafe2.getObject(obj, j3), m14184b(i3));
                    break;
                case 28:
                    e += ktt.m5307b(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 29:
                    e += ktt.m5338k(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 30:
                    e += ktt.m5314c(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 31:
                    e += ktt.m5317d(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 32:
                    e += ktt.m5320e(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 33:
                    e += ktt.m5329h(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 34:
                    e += ktt.m5332i(i6, (List) unsafe2.getObject(obj, j3));
                    break;
                case 35:
                    i = ktt.m5318d((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 36:
                    i = ktt.m5315c((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 37:
                    i = ktt.m5324f((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 38:
                    i = ktt.m5336j((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 39:
                    i = ktt.m5321e((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 40:
                    i = ktt.m5318d((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 41:
                    i = ktt.m5315c((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 42:
                    i = ktt.m5294a((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 43:
                    i = ktt.m5333i((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 44:
                    i = ktt.m5309b((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 45:
                    i = ktt.m5315c((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 46:
                    i = ktt.m5318d((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 47:
                    i = ktt.m5327g((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 48:
                    i = ktt.m5330h((List) unsafe2.getObject(obj, j3));
                    if (i <= 0) {
                        break;
                    }
                    e += i + (krh.m14102k(i6) + krh.m14103l(i));
                    break;
                case 49:
                    e += ktt.m5293a(i6, (List) unsafe2.getObject(obj, j3), m14184b(i3));
                    break;
                case 50:
                    e += kta.m5222a(unsafe2.getObject(obj, j3));
                    break;
                case 51:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14074b(i6);
                    break;
                case 52:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14094f(i6);
                    break;
                case 53:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14060a(i6, kth.m14198f(obj, j3));
                    break;
                case 54:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14086c(i6, kth.m14198f(obj, j3));
                    break;
                case 55:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14075b(i6, kth.m14196e(obj, j3));
                    break;
                case 56:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14092e(i6);
                    break;
                case 57:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14089d(i6);
                    break;
                case 58:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14058a(i6);
                    break;
                case 59:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    j = unsafe2.getObject(obj, j3);
                    if (!(j instanceof kqx)) {
                        e += krh.m14061a(i6, (String) j);
                        break;
                    }
                    e += krh.m14062a(i6, (kqx) j);
                    break;
                case 60:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += ktt.m5291a(i6, unsafe2.getObject(obj, j3), m14184b(i3));
                    break;
                case 61:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14062a(i6, (kqx) unsafe2.getObject(obj, j3));
                    break;
                case 62:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14090d(i6, kth.m14196e(obj, j3));
                    break;
                case 63:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14059a(i6, kth.m14196e(obj, j3));
                    break;
                case 64:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14099h(i6);
                    break;
                case 65:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14100i(i6);
                    break;
                case 66:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14085c(i6, kth.m14196e(obj, j3));
                    break;
                case 67:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14076b(i6, kth.m14198f(obj, j3));
                    break;
                case 68:
                    if (!m14180a(obj, i6, i3)) {
                        break;
                    }
                    e += krh.m14065a(i6, (kte) unsafe2.getObject(obj, j3), m14184b(i3));
                    break;
                default:
                    break;
            }
            i3 += 3;
            i = i2;
            i2 = i5;
        }
        kug = this.f21999p;
        i5 = e + ((kry) obj).f26607e.mo10412a();
        if (!this.f21991h) {
            return i5;
        }
        krr krr = ((ksb) obj).f26750g;
        i = 0;
        i2 = 0;
        while (true) {
            i3 = i;
            if (i3 < krr.f8818a.mo10374c()) {
                Entry a = krr.f8818a.mo10371a(i3);
                i2 += krr.m5176a((krs) a.getKey(), a.getValue());
                i = i3 + 1;
            } else {
                for (Entry entry : krr.f8818a.mo10378d()) {
                    i2 += krr.m5176a((krs) entry.getKey(), entry.getValue());
                }
                return i5 + i2;
            }
        }
    }

    /* renamed from: b */
    public final int mo10365b(Object obj) {
        int i = 0;
        int length = this.f21986c.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int f = m14197f(i2);
            int i3 = this.f21986c[i2];
            long j = (long) (1048575 & f);
            Object j2;
            switch (kth.m14195e(f)) {
                case 0:
                    i = (i * 53) + ksd.m5189a(Double.doubleToLongBits(kul.m5397f(obj, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(kul.m5398g(obj, j));
                    break;
                case 2:
                    i = (i * 53) + ksd.m5189a(kul.m5400i(obj, j));
                    break;
                case 3:
                    i = (i * 53) + ksd.m5189a(kul.m5400i(obj, j));
                    break;
                case 4:
                    i = (i * 53) + kul.m5399h(obj, j);
                    break;
                case 5:
                    i = (i * 53) + ksd.m5189a(kul.m5400i(obj, j));
                    break;
                case 6:
                    i = (i * 53) + kul.m5399h(obj, j);
                    break;
                case 7:
                    i = (i * 53) + ksd.m5190a(kul.m5384a(obj, j));
                    break;
                case 8:
                    i = ((String) kul.m5401j(obj, j)).hashCode() + (i * 53);
                    break;
                case 9:
                    j2 = kul.m5401j(obj, j);
                    if (j2 != null) {
                        f = j2.hashCode();
                    } else {
                        f = 37;
                    }
                    i = (i * 53) + f;
                    break;
                case 10:
                    i = (i * 53) + kul.m5401j(obj, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + kul.m5399h(obj, j);
                    break;
                case 12:
                    i = (i * 53) + kul.m5399h(obj, j);
                    break;
                case 13:
                    i = (i * 53) + kul.m5399h(obj, j);
                    break;
                case 14:
                    i = (i * 53) + ksd.m5189a(kul.m5400i(obj, j));
                    break;
                case 15:
                    i = (i * 53) + kul.m5399h(obj, j);
                    break;
                case 16:
                    i = (i * 53) + ksd.m5189a(kul.m5400i(obj, j));
                    break;
                case 17:
                    j2 = kul.m5401j(obj, j);
                    if (j2 != null) {
                        f = j2.hashCode();
                    } else {
                        f = 37;
                    }
                    i = (i * 53) + f;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + kul.m5401j(obj, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + kul.m5401j(obj, j).hashCode();
                    break;
                case 51:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5189a(Double.doubleToLongBits(kth.m14190c(obj, j)));
                    break;
                case 52:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + Float.floatToIntBits(kth.m14193d(obj, j));
                    break;
                case 53:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5189a(kth.m14198f(obj, j));
                    break;
                case 54:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5189a(kth.m14198f(obj, j));
                    break;
                case 55:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m14196e(obj, j);
                    break;
                case 56:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5189a(kth.m14198f(obj, j));
                    break;
                case 57:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m14196e(obj, j);
                    break;
                case 58:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5190a(kth.m14189b(obj, j));
                    break;
                case 59:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = ((String) kul.m5401j(obj, j)).hashCode() + (i * 53);
                    break;
                case 60:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kul.m5401j(obj, j).hashCode();
                    break;
                case 61:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kul.m5401j(obj, j).hashCode();
                    break;
                case 62:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m14196e(obj, j);
                    break;
                case 63:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m14196e(obj, j);
                    break;
                case 64:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m14196e(obj, j);
                    break;
                case 65:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5189a(kth.m14198f(obj, j));
                    break;
                case 66:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kth.m14196e(obj, j);
                    break;
                case 67:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + ksd.m5189a(kth.m14198f(obj, j));
                    break;
                case 68:
                    if (!m14180a(obj, i3, i2)) {
                        break;
                    }
                    i = (i * 53) + kul.m5401j(obj, j).hashCode();
                    break;
                default:
                    break;
            }
        }
        i = ((kry) obj).f26607e.hashCode() + (i * 53);
        if (this.f21991h) {
            return (i * 53) + ((ksb) obj).f26750g.hashCode();
        }
        return i;
    }

    /* renamed from: c */
    private static boolean m14192c(int i) {
        return (536870912 & i) != 0;
    }

    /* renamed from: a */
    private final boolean m14179a(Object obj, int i) {
        int f;
        if (this.f21993j) {
            f = m14197f(i);
            long j = (long) (1048575 & f);
            switch (kth.m14195e(f)) {
                case 0:
                    if (kul.m5397f(obj, j) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (kul.m5398g(obj, j) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (kul.m5400i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (kul.m5400i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (kul.m5399h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (kul.m5400i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (kul.m5399h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return kul.m5384a(obj, j);
                case 8:
                    Object j2 = kul.m5401j(obj, j);
                    if (j2 instanceof String) {
                        return ((String) j2).isEmpty() ^ 1;
                    }
                    if (j2 instanceof kqx) {
                        return kqx.f8795a.equals(j2) ^ 1;
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (kul.m5401j(obj, j) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    return kqx.f8795a.equals(kul.m5401j(obj, j)) ^ 1;
                case 11:
                    if (kul.m5399h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (kul.m5399h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (kul.m5399h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (kul.m5400i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (kul.m5399h(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (kul.m5400i(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (kul.m5401j(obj, j) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
        }
        f = m14194d(i);
        if (((1 << (f >>> 20)) & kul.m5399h(obj, (long) (1048575 & f))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m14181a(Object obj, int i, int i2, int i3) {
        if (this.f21993j) {
            return m14179a(obj, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: c */
    public final boolean mo10367c(Object obj) {
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        while (i3 < this.f21996m) {
            int i4;
            int i5;
            int i6 = this.f21995l[i3];
            int i7 = this.f21986c[i6];
            int f = m14197f(i6);
            if (this.f21993j) {
                i4 = i;
                i = i2;
                i2 = 0;
            } else {
                i4 = this.f21986c[i6 + 2];
                i5 = 1048575 & i4;
                i4 = 1 << (i4 >>> 20);
                if (i5 != i) {
                    i = f21985b.getInt(obj, (long) i5);
                    i2 = i4;
                    i4 = i5;
                } else {
                    int i8 = i4;
                    i4 = i;
                    i = i2;
                    i2 = i8;
                }
            }
            if ((268435456 & f) != 0 && !m14181a(obj, i6, i, i2)) {
                return false;
            }
            Object obj2;
            switch (kth.m14195e(f)) {
                case 9:
                case 17:
                    if (m14181a(obj, i6, i, i2) && !kth.m14182a(obj, f, m14184b(i6))) {
                        return false;
                    }
                case 27:
                case 49:
                    List list = (List) kul.m5401j(obj, (long) (1048575 & f));
                    if (list.isEmpty()) {
                        obj2 = 1;
                    } else {
                        ktr b = m14184b(i6);
                        i5 = 0;
                        while (i5 < list.size()) {
                            if (b.mo10367c(list.get(i5))) {
                                i5++;
                            } else {
                                obj2 = null;
                            }
                        }
                        obj2 = 1;
                    }
                    if (obj2 != null) {
                        break;
                    }
                    return false;
                case 50:
                    ksz ksz = (ksz) kul.m5401j(obj, (long) (1048575 & f));
                    if (ksz.isEmpty()) {
                        obj2 = 1;
                    } else {
                        kta.m5224a();
                        if (null.f8982d == gcb.f5299k) {
                            ktr ktr = null;
                            for (Object next : ksz.values()) {
                                if (ktr == null) {
                                    ktr = kto.f8910a.mo10314a(next.getClass());
                                }
                                if (!ktr.mo10367c(next)) {
                                    obj2 = null;
                                }
                            }
                            obj2 = 1;
                        } else {
                            obj2 = 1;
                        }
                    }
                    if (obj2 != null) {
                        break;
                    }
                    return false;
                case 60:
                case 68:
                    if (m14180a(obj, i7, i6) && !kth.m14182a(obj, f, m14184b(i6))) {
                        return false;
                    }
                default:
                    break;
            }
            i3++;
            i2 = i;
            i = i4;
        }
        if (!this.f21991h || ((ksb) obj).f26750g.mo10270b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m14182a(Object obj, int i, ktr ktr) {
        return ktr.mo10367c(kul.m5401j(obj, (long) (1048575 & i)));
    }

    /* renamed from: a */
    private final boolean m14180a(Object obj, int i, int i2) {
        return kul.m5399h(obj, (long) (m14194d(i2) & 1048575)) == i;
    }

    /* renamed from: a */
    private static List m14172a(Object obj, long j) {
        return (List) kul.m5401j(obj, j);
    }

    /* renamed from: d */
    public final void mo10368d(Object obj) {
        int i = this.f21996m;
        while (true) {
            int i2 = i;
            i = this.f21997n;
            if (i2 >= i) {
                break;
            }
            long f = (long) (m14197f(this.f21995l[i2]) & 1048575);
            Object j = kul.m5401j(obj, f);
            if (j != null) {
                ((ksz) j).f8905a = false;
                kul.m5381a(obj, f, j);
            }
            i = i2 + 1;
        }
        int length = this.f21995l.length;
        while (i < length) {
            this.f21998o.mo10295a(obj, (long) this.f21995l[i]);
            i++;
        }
        kug.m5363b(obj);
        if (this.f21991h) {
            krp.m5172b(obj);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086 A:{Catch:{ all -> 0x0224 }} */
    /* renamed from: a */
    public final void mo10362a(java.lang.Object r16, p000.ktq r17, p000.krn r18) {
        /*
        r15 = this;
        if (r18 != 0) goto L_0x0008;
    L_0x0002:
        r2 = new java.lang.NullPointerException;
        r2.<init>();
        throw r2;
    L_0x0008:
        r7 = r15.f21999p;
        r4 = 0;
        r5 = 0;
    L_0x000c:
        r8 = r17.mo10316a();	 Catch:{ all -> 0x0224 }
        r2 = r15.f21988e;	 Catch:{ all -> 0x0224 }
        if (r8 < r2) goto L_0x08e9;
    L_0x0014:
        r2 = r15.f21989f;	 Catch:{ all -> 0x0224 }
        if (r8 > r2) goto L_0x08e6;
    L_0x0018:
        r2 = r15.f21986c;	 Catch:{ all -> 0x0224 }
        r2 = r2.length;	 Catch:{ all -> 0x0224 }
        r2 = r2 / 3;
        r2 = r2 + -1;
        r3 = 0;
    L_0x0020:
        if (r3 > r2) goto L_0x08e3;
    L_0x0022:
        r6 = r2 + r3;
        r9 = r6 >>> 1;
        r6 = r9 * 3;
        r10 = r15.f21986c;	 Catch:{ all -> 0x0224 }
        r10 = r10[r6];	 Catch:{ all -> 0x0224 }
        if (r8 == r10) goto L_0x0036;
    L_0x002e:
        if (r8 >= r10) goto L_0x0033;
    L_0x0030:
        r2 = r9 + -1;
        goto L_0x0020;
    L_0x0033:
        r3 = r9 + 1;
        goto L_0x0020;
    L_0x0036:
        r2 = r6;
    L_0x0037:
        if (r2 >= 0) goto L_0x0192;
    L_0x0039:
        r2 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        if (r8 == r2) goto L_0x0177;
    L_0x003e:
        r2 = r15.f21991h;	 Catch:{ all -> 0x0224 }
        if (r2 == 0) goto L_0x0174;
    L_0x0042:
        r2 = r15.f21990g;	 Catch:{ all -> 0x0224 }
        r0 = r18;
        r2 = p000.krp.m5168a(r0, r2, r8);	 Catch:{ all -> 0x0224 }
    L_0x004a:
        if (r2 == 0) goto L_0x0149;
    L_0x004c:
        if (r5 != 0) goto L_0x0146;
    L_0x004e:
        r3 = p000.krp.m5169a(r16);	 Catch:{ all -> 0x0224 }
    L_0x0052:
        r2 = (p000.krl) r2;	 Catch:{ all -> 0x0224 }
        r5 = r2.f8808d;	 Catch:{ all -> 0x0224 }
        r6 = r5.f8822b;	 Catch:{ all -> 0x0224 }
        r5 = r5.f8823c;	 Catch:{ all -> 0x0224 }
        r8 = p000.kuw.ENUM;	 Catch:{ all -> 0x0224 }
        if (r5 != r8) goto L_0x0093;
    L_0x005e:
        r5 = r17.mo10341j();	 Catch:{ all -> 0x0224 }
        r8 = 0;
        r8 = r8.mo10278a(r5);	 Catch:{ all -> 0x0224 }
        if (r8 != 0) goto L_0x0070;
    L_0x0069:
        r2 = p000.ktt.m5296a(r6, r5, r4, r7);	 Catch:{ all -> 0x0224 }
    L_0x006d:
        r5 = r3;
        r4 = r2;
        goto L_0x000c;
    L_0x0070:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0224 }
    L_0x0074:
        r6 = r2.f8808d;	 Catch:{ all -> 0x0224 }
        r6 = r6.f8823c;	 Catch:{ all -> 0x0224 }
        r6 = r6.ordinal();	 Catch:{ all -> 0x0224 }
        switch(r6) {
            case 9: goto L_0x0086;
            case 10: goto L_0x0086;
            default: goto L_0x007f;
        };	 Catch:{ all -> 0x0224 }
    L_0x007f:
        r2 = r2.f8808d;	 Catch:{ all -> 0x0224 }
        r3.mo10269b(r2, r5);	 Catch:{ all -> 0x0224 }
        r2 = r4;
        goto L_0x006d;
    L_0x0086:
        r6 = r2.f8808d;	 Catch:{ all -> 0x0224 }
        r6 = r3.mo10266a(r6);	 Catch:{ all -> 0x0224 }
        if (r6 == 0) goto L_0x007f;
    L_0x008e:
        r5 = p000.ksd.m5193a(r6, r5);	 Catch:{ all -> 0x0224 }
        goto L_0x007f;
    L_0x0093:
        r5 = r2.f8808d;	 Catch:{ all -> 0x0224 }
        r5 = r5.f8823c;	 Catch:{ all -> 0x0224 }
        r5 = r5.ordinal();	 Catch:{ all -> 0x0224 }
        switch(r5) {
            case 0: goto L_0x00a0;
            case 1: goto L_0x013c;
            case 2: goto L_0x0132;
            case 3: goto L_0x0128;
            case 4: goto L_0x011e;
            case 5: goto L_0x0114;
            case 6: goto L_0x010a;
            case 7: goto L_0x0100;
            case 8: goto L_0x00fa;
            case 9: goto L_0x00ea;
            case 10: goto L_0x00db;
            case 11: goto L_0x00d6;
            case 12: goto L_0x00cd;
            case 13: goto L_0x08ec;
            case 14: goto L_0x00c4;
            case 15: goto L_0x00bb;
            case 16: goto L_0x00b2;
            case 17: goto L_0x00a9;
            default: goto L_0x009e;
        };	 Catch:{ all -> 0x0224 }
    L_0x009e:
        r5 = 0;
        goto L_0x0074;
    L_0x00a0:
        r8 = r17.mo10331e();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Double.valueOf(r8);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00a9:
        r8 = r17.mo10351o();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00b2:
        r5 = r17.mo10349n();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00bb:
        r8 = r17.mo10347m();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00c4:
        r5 = r17.mo10345l();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00cd:
        r5 = r17.mo10357r();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00d6:
        r5 = r17.mo10329d();	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00db:
        r5 = r2.f8807c;	 Catch:{ all -> 0x0224 }
        r5 = r5.getClass();	 Catch:{ all -> 0x0224 }
        r0 = r17;
        r1 = r18;
        r5 = r0.mo10323b(r5, r1);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00ea:
        r5 = r2.f8807c;	 Catch:{ all -> 0x0224 }
        r5 = r5.getClass();	 Catch:{ all -> 0x0224 }
        r0 = r17;
        r1 = r18;
        r5 = r0.mo10317a(r5, r1);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x00fa:
        r5 = r17.mo10353p();	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x0100:
        r5 = r17.mo10328c();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Boolean.valueOf(r5);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x010a:
        r5 = r17.mo10335g();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x0114:
        r8 = r17.mo10337h();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x011e:
        r5 = r17.mo10341j();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x0128:
        r8 = r17.mo10358s();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x0132:
        r8 = r17.mo10343k();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Long.valueOf(r8);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x013c:
        r5 = r17.mo10339i();	 Catch:{ all -> 0x0224 }
        r5 = java.lang.Float.valueOf(r5);	 Catch:{ all -> 0x0224 }
        goto L_0x0074;
    L_0x0146:
        r3 = r5;
        goto L_0x0052;
    L_0x0149:
        if (r4 != 0) goto L_0x0172;
    L_0x014b:
        r3 = p000.kug.m5358a(r16);	 Catch:{ all -> 0x0224 }
    L_0x014f:
        r0 = r17;
        r2 = r7.mo10411a(r3, r0);	 Catch:{ all -> 0x0908 }
        if (r2 != 0) goto L_0x0917;
    L_0x0157:
        r2 = r15.f21996m;
    L_0x0159:
        r4 = r15.f21997n;
        if (r2 >= r4) goto L_0x016a;
    L_0x015d:
        r4 = r15.f21995l;
        r4 = r4[r2];
        r0 = r16;
        r3 = r15.m14170a(r0, r4, r3, r7);
        r2 = r2 + 1;
        goto L_0x0159;
    L_0x016a:
        if (r3 == 0) goto L_0x0171;
    L_0x016c:
        r0 = r16;
        p000.kug.m5362a(r0, (p000.kuh) r3);
    L_0x0171:
        return;
    L_0x0172:
        r3 = r4;
        goto L_0x014f;
    L_0x0174:
        r2 = 0;
        goto L_0x004a;
    L_0x0177:
        r2 = r15.f21996m;
    L_0x0179:
        r3 = r15.f21997n;
        if (r2 >= r3) goto L_0x018a;
    L_0x017d:
        r3 = r15.f21995l;
        r3 = r3[r2];
        r0 = r16;
        r4 = r15.m14170a(r0, r3, r4, r7);
        r2 = r2 + 1;
        goto L_0x0179;
    L_0x018a:
        if (r4 == 0) goto L_0x0171;
    L_0x018c:
        r0 = r16;
        p000.kug.m5362a(r0, (p000.kuh) r4);
        goto L_0x0171;
    L_0x0192:
        r3 = r15.m14197f(r2);	 Catch:{ all -> 0x0224 }
        r6 = p000.kth.m14195e(r3);	 Catch:{ ksi -> 0x01e8 }
        switch(r6) {
            case 0: goto L_0x08ce;
            case 1: goto L_0x08b9;
            case 2: goto L_0x08a4;
            case 3: goto L_0x088f;
            case 4: goto L_0x087a;
            case 5: goto L_0x0865;
            case 6: goto L_0x0850;
            case 7: goto L_0x083b;
            case 8: goto L_0x082d;
            case 9: goto L_0x07e6;
            case 10: goto L_0x07d1;
            case 11: goto L_0x07bc;
            case 12: goto L_0x0795;
            case 13: goto L_0x0780;
            case 14: goto L_0x076b;
            case 15: goto L_0x0756;
            case 16: goto L_0x0741;
            case 17: goto L_0x06fa;
            case 18: goto L_0x06e6;
            case 19: goto L_0x06d2;
            case 20: goto L_0x06be;
            case 21: goto L_0x06aa;
            case 22: goto L_0x0696;
            case 23: goto L_0x0682;
            case 24: goto L_0x066e;
            case 25: goto L_0x065a;
            case 26: goto L_0x062c;
            case 27: goto L_0x0612;
            case 28: goto L_0x05fe;
            case 29: goto L_0x05ea;
            case 30: goto L_0x05ce;
            case 31: goto L_0x05ba;
            case 32: goto L_0x05a6;
            case 33: goto L_0x0592;
            case 34: goto L_0x057e;
            case 35: goto L_0x056a;
            case 36: goto L_0x0556;
            case 37: goto L_0x0542;
            case 38: goto L_0x052e;
            case 39: goto L_0x051a;
            case 40: goto L_0x0506;
            case 41: goto L_0x04f2;
            case 42: goto L_0x04de;
            case 43: goto L_0x04ca;
            case 44: goto L_0x04ae;
            case 45: goto L_0x049a;
            case 46: goto L_0x0486;
            case 47: goto L_0x0472;
            case 48: goto L_0x045e;
            case 49: goto L_0x0444;
            case 50: goto L_0x0401;
            case 51: goto L_0x03e8;
            case 52: goto L_0x03cf;
            case 53: goto L_0x03b6;
            case 54: goto L_0x039d;
            case 55: goto L_0x0384;
            case 56: goto L_0x036b;
            case 57: goto L_0x0352;
            case 58: goto L_0x0339;
            case 59: goto L_0x032b;
            case 60: goto L_0x02e0;
            case 61: goto L_0x02cb;
            case 62: goto L_0x02b2;
            case 63: goto L_0x0287;
            case 64: goto L_0x026e;
            case 65: goto L_0x0255;
            case 66: goto L_0x023c;
            case 67: goto L_0x020b;
            case 68: goto L_0x01cb;
            default: goto L_0x019d;
        };	 Catch:{ ksi -> 0x01e8 }
    L_0x019d:
        if (r4 != 0) goto L_0x01c9;
    L_0x019f:
        r3 = p000.kuh.m5367b();	 Catch:{ ksi -> 0x01e8 }
    L_0x01a3:
        r0 = r17;
        r2 = r7.mo10411a(r3, r0);	 Catch:{ ksi -> 0x090b, all -> 0x090e }
        if (r2 != 0) goto L_0x01c6;
    L_0x01ab:
        r2 = r15.f21996m;
    L_0x01ad:
        r4 = r15.f21997n;
        if (r2 >= r4) goto L_0x01be;
    L_0x01b1:
        r4 = r15.f21995l;
        r4 = r4[r2];
        r0 = r16;
        r3 = r15.m14170a(r0, r4, r3, r7);
        r2 = r2 + 1;
        goto L_0x01ad;
    L_0x01be:
        if (r3 == 0) goto L_0x0171;
    L_0x01c0:
        r0 = r16;
        p000.kug.m5362a(r0, (p000.kuh) r3);
        goto L_0x0171;
    L_0x01c6:
        r4 = r3;
        goto L_0x000c;
    L_0x01c9:
        r3 = r4;
        goto L_0x01a3;
    L_0x01cb:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;
        r3 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r3 = r0.mo10318a(r3, r1);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x01e8:
        r2 = move-exception;
        r3 = r4;
    L_0x01ea:
        if (r3 != 0) goto L_0x01f0;
    L_0x01ec:
        r3 = p000.kug.m5358a(r16);	 Catch:{ all -> 0x0911 }
    L_0x01f0:
        r0 = r17;
        r2 = r7.mo10411a(r3, r0);	 Catch:{ all -> 0x0914 }
        if (r2 != 0) goto L_0x0905;
    L_0x01f8:
        r2 = r15.f21996m;
    L_0x01fa:
        r4 = r15.f21997n;
        if (r2 >= r4) goto L_0x08f4;
    L_0x01fe:
        r4 = r15.f21995l;
        r4 = r4[r2];
        r0 = r16;
        r3 = r15.m14170a(r0, r4, r3, r7);
        r2 = r2 + 1;
        goto L_0x01fa;
    L_0x020b:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;
        r12 = r17.mo10351o();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Long.valueOf(r12);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0224:
        r2 = move-exception;
        r3 = r4;
    L_0x0226:
        r4 = r15.f21996m;
        r14 = r4;
        r4 = r3;
        r3 = r14;
    L_0x022b:
        r5 = r15.f21997n;
        if (r3 >= r5) goto L_0x08fd;
    L_0x022f:
        r5 = r15.f21995l;
        r5 = r5[r3];
        r0 = r16;
        r4 = r15.m14170a(r0, r5, r4, r7);
        r3 = r3 + 1;
        goto L_0x022b;
    L_0x023c:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;
        r3 = r17.mo10349n();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0255:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r12 = r17.mo10347m();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Long.valueOf(r12);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x026e:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10345l();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0287:
        r6 = r17.mo10333f();	 Catch:{ ksi -> 0x01e8 }
        r9 = r15.m14173a(r2);	 Catch:{ ksi -> 0x01e8 }
        if (r9 == 0) goto L_0x029d;
    L_0x0291:
        r9 = r9.mo10278a(r6);	 Catch:{ ksi -> 0x01e8 }
        if (r9 != 0) goto L_0x029d;
    L_0x0297:
        r4 = p000.ktt.m5296a(r8, r6, r4, r7);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x029d:
        r9 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r9;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Integer.valueOf(r6);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x02b2:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10357r();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x02cb:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10329d();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x02e0:
        r0 = r16;
        r6 = r15.m14180a(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        if (r6 == 0) goto L_0x030f;
    L_0x02e8:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r3 = p000.kul.m5401j(r0, r10);	 Catch:{ ksi -> 0x01e8 }
        r6 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r6 = r0.mo10324b(r6, r1);	 Catch:{ ksi -> 0x01e8 }
        r3 = p000.ksd.m5193a(r3, r6);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
    L_0x0308:
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x030f:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r3 = r0.mo10324b(r3, r1);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x0308;
    L_0x032b:
        r0 = r16;
        r1 = r17;
        r15.m14176a(r0, r3, r1);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0339:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10328c();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Boolean.valueOf(r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0352:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10335g();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x036b:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r12 = r17.mo10337h();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Long.valueOf(r12);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0384:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10341j();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x039d:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r12 = r17.mo10358s();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Long.valueOf(r12);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x03b6:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r12 = r17.mo10343k();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Long.valueOf(r12);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x03cf:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10339i();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Float.valueOf(r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x03e8:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r12 = r17.mo10331e();	 Catch:{ ksi -> 0x01e8 }
        r3 = java.lang.Double.valueOf(r12);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r10, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14186b(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0401:
        r2 = r15.m14197f(r2);	 Catch:{ ksi -> 0x01e8 }
        r3 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r2 = r2 & r3;
        r8 = (long) r2;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r3 = p000.kul.m5401j(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        if (r3 != 0) goto L_0x042b;
    L_0x0412:
        r2 = p000.ksz.f8904b;	 Catch:{ ksi -> 0x01e8 }
        r2 = r2.mo10299b();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
    L_0x041d:
        r2 = (p000.ksz) r2;	 Catch:{ ksi -> 0x01e8 }
        p000.kta.m5224a();	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r0.mo10321a(r2, r1);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x042b:
        r0 = r3;
        r0 = (p000.ksz) r0;	 Catch:{ ksi -> 0x01e8 }
        r2 = r0;
        r2 = r2.f8905a;	 Catch:{ ksi -> 0x01e8 }
        r2 = r2 ^ 1;
        if (r2 == 0) goto L_0x091a;
    L_0x0435:
        r2 = p000.ksz.f8904b;	 Catch:{ ksi -> 0x01e8 }
        r2 = r2.mo10299b();	 Catch:{ ksi -> 0x01e8 }
        p000.kta.m5223a(r2, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x041d;
    L_0x0444:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r2 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r3 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r3 = r3.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r0.mo10320a(r3, r2, r1);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x045e:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10348m(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0472:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10346l(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0486:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10344k(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x049a:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10342j(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x04ae:
        r6 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r9 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r9;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r3 = r6.mo10297b(r0, r10);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10330d(r3);	 Catch:{ ksi -> 0x01e8 }
        r2 = r15.m14173a(r2);	 Catch:{ ksi -> 0x01e8 }
        r4 = p000.ktt.m5297a(r8, r3, r2, r4, r7);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x04ca:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10354p(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x04de:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10319a(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x04f2:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10332e(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0506:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10334f(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x051a:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10338h(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x052e:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10356q(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0542:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10340i(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0556:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10336g(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x056a:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10327c(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x057e:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10348m(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0592:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10346l(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x05a6:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10344k(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x05ba:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10342j(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x05ce:
        r6 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r9 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r9;
        r10 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r3 = r6.mo10297b(r0, r10);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10330d(r3);	 Catch:{ ksi -> 0x01e8 }
        r2 = r15.m14173a(r2);	 Catch:{ ksi -> 0x01e8 }
        r4 = p000.ktt.m5297a(r8, r3, r2, r4, r7);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x05ea:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10354p(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x05fe:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10325b(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0612:
        r2 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r3 = r3.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r0.mo10326b(r3, r2, r1);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x062c:
        r2 = p000.kth.m14192c(r3);	 Catch:{ ksi -> 0x01e8 }
        if (r2 == 0) goto L_0x0646;
    L_0x0632:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10352o(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0646:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10350n(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x065a:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10319a(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x066e:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10332e(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0682:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10334f(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0696:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10338h(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x06aa:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10356q(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x06be:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10340i(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x06d2:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10336g(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x06e6:
        r2 = r15.f21998o;	 Catch:{ ksi -> 0x01e8 }
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r2 = r2.mo10297b(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r0.mo10327c(r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x06fa:
        r0 = r16;
        r6 = r15.m14179a(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        if (r6 == 0) goto L_0x0724;
    L_0x0702:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r3 = p000.kul.m5401j(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r2 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r2 = r0.mo10318a(r2, r1);	 Catch:{ ksi -> 0x01e8 }
        r2 = p000.ksd.m5193a(r3, r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0724:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r3 = r0.mo10318a(r3, r1);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0741:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r10 = r17.mo10351o();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5380a(r0, r8, r10);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0756:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10349n();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5379a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x076b:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r10 = r17.mo10347m();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5380a(r0, r8, r10);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0780:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10345l();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5379a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0795:
        r6 = r17.mo10333f();	 Catch:{ ksi -> 0x01e8 }
        r9 = r15.m14173a(r2);	 Catch:{ ksi -> 0x01e8 }
        if (r9 == 0) goto L_0x07ab;
    L_0x079f:
        r9 = r9.mo10278a(r6);	 Catch:{ ksi -> 0x01e8 }
        if (r9 != 0) goto L_0x07ab;
    L_0x07a5:
        r4 = p000.ktt.m5296a(r8, r6, r4, r7);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x07ab:
        r8 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r8;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5379a(r0, r8, r6);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x07bc:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10357r();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5379a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x07d1:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10329d();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x07e6:
        r0 = r16;
        r6 = r15.m14179a(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        if (r6 == 0) goto L_0x0810;
    L_0x07ee:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r3 = p000.kul.m5401j(r0, r8);	 Catch:{ ksi -> 0x01e8 }
        r2 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r2 = r0.mo10324b(r2, r1);	 Catch:{ ksi -> 0x01e8 }
        r2 = p000.ksd.m5193a(r3, r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r8, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0810:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r15.m14184b(r2);	 Catch:{ ksi -> 0x01e8 }
        r0 = r17;
        r1 = r18;
        r3 = r0.mo10324b(r3, r1);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5381a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x082d:
        r0 = r16;
        r1 = r17;
        r15.m14176a(r0, r3, r1);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x083b:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10328c();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5382a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0850:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10335g();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5379a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x0865:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r10 = r17.mo10337h();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5380a(r0, r8, r10);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x087a:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10341j();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5379a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x088f:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r10 = r17.mo10358s();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5380a(r0, r8, r10);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x08a4:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r10 = r17.mo10343k();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5380a(r0, r8, r10);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x08b9:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r3 = r17.mo10339i();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5378a(r0, r8, r3);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x08ce:
        r6 = 1048575; // 0xfffff float:1.469367E-39 double:5.18065E-318;
        r3 = r3 & r6;
        r8 = (long) r3;	 Catch:{ ksi -> 0x01e8 }
        r10 = r17.mo10331e();	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        p000.kul.m5377a(r0, r8, r10);	 Catch:{ ksi -> 0x01e8 }
        r0 = r16;
        r15.m14185b(r0, r2);	 Catch:{ ksi -> 0x01e8 }
        goto L_0x000c;
    L_0x08e3:
        r2 = -1;
        goto L_0x0037;
    L_0x08e6:
        r2 = -1;
        goto L_0x0037;
    L_0x08e9:
        r2 = -1;
        goto L_0x0037;
    L_0x08ec:
        r2 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x0224 }
        r3 = "Shouldn't reach here.";
        r2.<init>(r3);	 Catch:{ all -> 0x0224 }
        throw r2;	 Catch:{ all -> 0x0224 }
    L_0x08f4:
        if (r3 == 0) goto L_0x0171;
    L_0x08f6:
        r0 = r16;
        p000.kug.m5362a(r0, (p000.kuh) r3);
        goto L_0x0171;
    L_0x08fd:
        if (r4 == 0) goto L_0x0904;
    L_0x08ff:
        r0 = r16;
        p000.kug.m5362a(r0, (p000.kuh) r4);
    L_0x0904:
        throw r2;
    L_0x0905:
        r4 = r3;
        goto L_0x000c;
    L_0x0908:
        r2 = move-exception;
        goto L_0x0226;
    L_0x090b:
        r2 = move-exception;
        goto L_0x01ea;
    L_0x090e:
        r2 = move-exception;
        goto L_0x0226;
    L_0x0911:
        r2 = move-exception;
        goto L_0x0226;
    L_0x0914:
        r2 = move-exception;
        goto L_0x0226;
    L_0x0917:
        r4 = r3;
        goto L_0x000c;
    L_0x091a:
        r2 = r3;
        goto L_0x041d;
        */
        throw new UnsupportedOperationException("Method not decompiled: kth.a(java.lang.Object, ktq, krn):void");
    }

    /* renamed from: b */
    public final void mo10366b(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i = 0; i < this.f21986c.length; i += 3) {
                int f = m14197f(i);
                long j = (long) (1048575 & f);
                int i2 = this.f21986c[i];
                switch (kth.m14195e(f)) {
                    case 0:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5377a(obj, j, kul.m5397f(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 1:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5378a(obj, j, kul.m5398g(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 2:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5380a(obj, j, kul.m5400i(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 3:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5380a(obj, j, kul.m5400i(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 4:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5379a(obj, j, kul.m5399h(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 5:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5380a(obj, j, kul.m5400i(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 6:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5379a(obj, j, kul.m5399h(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 7:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5382a(obj, j, kul.m5384a(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 8:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5381a(obj, j, kul.m5401j(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 9:
                        m14187b(obj, obj2, i);
                        break;
                    case 10:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5381a(obj, j, kul.m5401j(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 11:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5379a(obj, j, kul.m5399h(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 12:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5379a(obj, j, kul.m5399h(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 13:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5379a(obj, j, kul.m5399h(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 14:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5380a(obj, j, kul.m5400i(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 15:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5379a(obj, j, kul.m5399h(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 16:
                        if (!m14179a(obj2, i)) {
                            break;
                        }
                        kul.m5380a(obj, j, kul.m5400i(obj2, j));
                        m14185b(obj, i);
                        break;
                    case 17:
                        m14187b(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f21998o.mo10296a(obj, obj2, j);
                        break;
                    case 50:
                        ktt.m5303a(obj, obj2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m14180a(obj2, i2, i)) {
                            break;
                        }
                        kul.m5381a(obj, j, kul.m5401j(obj2, j));
                        m14186b(obj, i2, i);
                        break;
                    case 60:
                        m14191c(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m14180a(obj2, i2, i)) {
                            break;
                        }
                        kul.m5381a(obj, j, kul.m5401j(obj2, j));
                        m14186b(obj, i2, i);
                        break;
                    case 68:
                        m14191c(obj, obj2, i);
                        break;
                    default:
                        break;
                }
            }
            if (!this.f21993j) {
                ktt.m5305a(this.f21999p, obj, obj2);
                if (this.f21991h) {
                    ktt.m5304a(this.f22000q, obj, obj2);
                    return;
                }
                return;
            }
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    private final void m14187b(Object obj, Object obj2, int i) {
        long f = (long) (m14197f(i) & 1048575);
        if (m14179a(obj2, i)) {
            Object j = kul.m5401j(obj, f);
            Object j2 = kul.m5401j(obj2, f);
            if (j != null && j2 != null) {
                kul.m5381a(obj, f, ksd.m5193a(j, j2));
                m14185b(obj, i);
            } else if (j2 != null) {
                kul.m5381a(obj, f, j2);
                m14185b(obj, i);
            }
        }
    }

    /* renamed from: c */
    private final void m14191c(Object obj, Object obj2, int i) {
        int f = m14197f(i);
        int i2 = this.f21986c[i];
        long j = (long) (f & 1048575);
        if (m14180a(obj2, i2, i)) {
            Object j2 = kul.m5401j(obj, j);
            Object j3 = kul.m5401j(obj2, j);
            if (j2 != null && j3 != null) {
                kul.m5381a(obj, j, ksd.m5193a(j2, j3));
                m14186b(obj, i2, i);
            } else if (j3 != null) {
                kul.m5381a(obj, j, j3);
                m14186b(obj, i2, i);
            }
        }
    }

    /* renamed from: a */
    public final Object mo10361a() {
        return ((kry) this.f21990g).mo15667a(C0252go.f5879bY, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0186  */
    /* renamed from: a */
    static p000.kth m14174a(p000.ktc r35, p000.ktk r36, p000.ksq r37, p000.kug r38, p000.krp r39, p000.kta r40) {
        /*
        r0 = r35;
        r2 = r0 instanceof p000.ktp;
        if (r2 == 0) goto L_0x04fe;
    L_0x0006:
        r35 = (p000.ktp) r35;
        r2 = r35.mo10308b();
        r3 = p000.C0252go.f5910cc;
        if (r2 != r3) goto L_0x04fb;
    L_0x0010:
        r8 = 1;
    L_0x0011:
        r0 = r35;
        r0 = r0.f22007b;
        r25 = r0;
        r26 = r25.length();
        r2 = 0;
        r0 = r25;
        r2 = r0.charAt(r2);
        r3 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r3) goto L_0x04f6;
    L_0x0027:
        r3 = r2 & 8191;
        r4 = 1;
        r2 = 13;
    L_0x002c:
        r5 = r4 + 1;
        r0 = r25;
        r4 = r0.charAt(r4);
        r6 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r6) goto L_0x0041;
    L_0x0039:
        r4 = r4 & 8191;
        r4 = r4 << r2;
        r3 = r3 | r4;
        r2 = r2 + 13;
        r4 = r5;
        goto L_0x002c;
    L_0x0041:
        r2 = r4 << r2;
        r2 = r2 | r3;
        r20 = r2;
    L_0x0046:
        r4 = r5 + 1;
        r0 = r25;
        r2 = r0.charAt(r5);
        r3 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r3) goto L_0x04f3;
    L_0x0053:
        r3 = r2 & 8191;
        r2 = 13;
    L_0x0057:
        r5 = r4 + 1;
        r0 = r25;
        r4 = r0.charAt(r4);
        r6 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r6) goto L_0x006c;
    L_0x0064:
        r4 = r4 & 8191;
        r4 = r4 << r2;
        r3 = r3 | r4;
        r2 = r2 + 13;
        r4 = r5;
        goto L_0x0057;
    L_0x006c:
        r2 = r4 << r2;
        r2 = r2 | r3;
        r11 = r5;
    L_0x0070:
        if (r2 != 0) goto L_0x0373;
    L_0x0072:
        r9 = f21984a;
        r7 = 0;
        r5 = 0;
        r6 = 0;
        r4 = 0;
        r3 = 0;
        r10 = 0;
        r2 = 0;
        r12 = r7;
        r13 = r11;
        r7 = r3;
    L_0x007e:
        r27 = f21985b;
        r0 = r35;
        r0 = r0.f22008c;
        r28 = r0;
        r0 = r35;
        r3 = r0.f22006a;
        r29 = r3.getClass();
        r3 = r4 * 3;
        r3 = new int[r3];
        r4 = r4 + r4;
        r4 = new java.lang.Object[r4];
        r11 = r10 + r7;
        r18 = 0;
        r7 = 0;
        r24 = r7;
        r17 = r11;
        r16 = r10;
        r15 = r2;
        r23 = r13;
    L_0x00a3:
        r0 = r23;
        r1 = r26;
        if (r0 >= r1) goto L_0x035f;
    L_0x00a9:
        r13 = r23 + 1;
        r0 = r25;
        r1 = r23;
        r2 = r0.charAt(r1);
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r7) goto L_0x035a;
    L_0x00b8:
        r7 = r2 & 8191;
        r2 = 13;
    L_0x00bc:
        r14 = r13 + 1;
        r0 = r25;
        r13 = r0.charAt(r13);
        r19 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        r0 = r19;
        if (r13 < r0) goto L_0x00d3;
    L_0x00cb:
        r13 = r13 & 8191;
        r13 = r13 << r2;
        r7 = r7 | r13;
        r2 = r2 + 13;
        r13 = r14;
        goto L_0x00bc;
    L_0x00d3:
        r2 = r13 << r2;
        r2 = r2 | r7;
        r19 = r2;
    L_0x00d8:
        r13 = r14 + 1;
        r0 = r25;
        r2 = r0.charAt(r14);
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r7) goto L_0x0355;
    L_0x00e5:
        r7 = r2 & 8191;
        r2 = 13;
    L_0x00e9:
        r14 = r13 + 1;
        r0 = r25;
        r13 = r0.charAt(r13);
        r21 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        r0 = r21;
        if (r13 < r0) goto L_0x0100;
    L_0x00f8:
        r13 = r13 & 8191;
        r13 = r13 << r2;
        r7 = r7 | r13;
        r2 = r2 + 13;
        r13 = r14;
        goto L_0x00e9;
    L_0x0100:
        r2 = r13 << r2;
        r2 = r2 | r7;
        r21 = r2;
    L_0x0105:
        r0 = r21;
        r0 = r0 & 255;
        r30 = r0;
        r0 = r21;
        r2 = r0 & 1024;
        if (r2 == 0) goto L_0x0117;
    L_0x0111:
        r2 = r18 + 1;
        r9[r18] = r24;
        r18 = r2;
    L_0x0117:
        r2 = p000.krt.MAP;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 <= r2) goto L_0x0214;
    L_0x011f:
        r13 = r14 + 1;
        r0 = r25;
        r2 = r0.charAt(r14);
        r7 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r7) goto L_0x0211;
    L_0x012c:
        r7 = r2 & 8191;
        r2 = 13;
    L_0x0130:
        r14 = r13 + 1;
        r0 = r25;
        r13 = r0.charAt(r13);
        r22 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        r0 = r22;
        if (r13 < r0) goto L_0x0147;
    L_0x013f:
        r13 = r13 & 8191;
        r13 = r13 << r2;
        r7 = r7 | r13;
        r2 = r2 + 13;
        r13 = r14;
        goto L_0x0130;
    L_0x0147:
        r2 = r13 << r2;
        r2 = r2 | r7;
    L_0x014a:
        r7 = p000.krt.MESSAGE;
        r7 = r7.f8877k;
        r7 = r7 + 51;
        r0 = r30;
        if (r0 == r7) goto L_0x015e;
    L_0x0154:
        r7 = p000.krt.GROUP;
        r7 = r7.f8877k;
        r7 = r7 + 51;
        r0 = r30;
        if (r0 != r7) goto L_0x01fc;
    L_0x015e:
        r13 = r24 / 3;
        r7 = r15 + 1;
        r13 = r13 + r13;
        r13 = r13 + 1;
        r15 = r28[r15];
        r4[r13] = r15;
    L_0x0169:
        r13 = r2 + r2;
        r2 = r28[r13];
        r15 = r2 instanceof java.lang.reflect.Field;
        if (r15 == 0) goto L_0x01f0;
    L_0x0171:
        r2 = (java.lang.reflect.Field) r2;
    L_0x0173:
        r0 = r27;
        r22 = r0.objectFieldOffset(r2);
        r0 = r22;
        r15 = (int) r0;
        r13 = r13 + 1;
        r2 = r28[r13];
        r0 = r2 instanceof java.lang.reflect.Field;
        r22 = r0;
        if (r22 == 0) goto L_0x01e5;
    L_0x0186:
        r2 = (java.lang.reflect.Field) r2;
    L_0x0188:
        r0 = r27;
        r22 = r0.objectFieldOffset(r2);
        r0 = r22;
        r2 = (int) r0;
        r13 = 0;
        r22 = r7;
        r23 = r14;
        r14 = r13;
        r13 = r2;
    L_0x0198:
        r2 = 18;
        r0 = r30;
        if (r0 < r2) goto L_0x01e2;
    L_0x019e:
        r2 = 49;
        r0 = r30;
        if (r0 > r2) goto L_0x01df;
    L_0x01a4:
        r2 = r17 + 1;
        r9[r17] = r15;
        r7 = r2;
    L_0x01a9:
        r31 = r24 + 1;
        r3[r24] = r19;
        r19 = r31 + 1;
        r0 = r21;
        r2 = r0 & 512;
        if (r2 == 0) goto L_0x01db;
    L_0x01b5:
        r2 = 536870912; // 0x20000000 float:1.0842022E-19 double:2.652494739E-315;
        r17 = r2;
    L_0x01b9:
        r0 = r21;
        r2 = r0 & 256;
        if (r2 == 0) goto L_0x01d9;
    L_0x01bf:
        r2 = 268435456; // 0x10000000 float:2.5243549E-29 double:1.32624737E-315;
    L_0x01c1:
        r2 = r2 | r17;
        r17 = r30 << 20;
        r2 = r2 | r17;
        r2 = r2 | r15;
        r3[r31] = r2;
        r2 = r19 + 1;
        r14 = r14 << 20;
        r13 = r13 | r14;
        r3[r19] = r13;
        r24 = r2;
        r17 = r7;
        r15 = r22;
        goto L_0x00a3;
    L_0x01d9:
        r2 = 0;
        goto L_0x01c1;
    L_0x01db:
        r2 = 0;
        r17 = r2;
        goto L_0x01b9;
    L_0x01df:
        r7 = r17;
        goto L_0x01a9;
    L_0x01e2:
        r7 = r17;
        goto L_0x01a9;
    L_0x01e5:
        r2 = (java.lang.String) r2;
        r0 = r29;
        r2 = p000.kth.m14171a(r0, r2);
        r28[r13] = r2;
        goto L_0x0188;
    L_0x01f0:
        r2 = (java.lang.String) r2;
        r0 = r29;
        r2 = p000.kth.m14171a(r0, r2);
        r28[r13] = r2;
        goto L_0x0173;
    L_0x01fc:
        r7 = p000.krt.ENUM;
        r7 = r7.f8877k;
        r7 = r7 + 51;
        r0 = r30;
        if (r0 != r7) goto L_0x020e;
    L_0x0206:
        r7 = r20 & 1;
        r13 = 1;
        if (r7 == r13) goto L_0x015e;
    L_0x020b:
        r7 = r15;
        goto L_0x0169;
    L_0x020e:
        r7 = r15;
        goto L_0x0169;
    L_0x0211:
        r14 = r13;
        goto L_0x014a;
    L_0x0214:
        r7 = r15 + 1;
        r2 = r28[r15];
        r2 = (java.lang.String) r2;
        r0 = r29;
        r15 = p000.kth.m14171a(r0, r2);
        r2 = p000.krt.MESSAGE;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 == r2) goto L_0x0230;
    L_0x0228:
        r2 = p000.krt.GROUP;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 != r2) goto L_0x02d3;
    L_0x0230:
        r2 = r24 / 3;
        r2 = r2 + r2;
        r2 = r2 + 1;
        r13 = r15.getType();
        r4[r2] = r13;
        r13 = r7;
        r7 = r16;
    L_0x023e:
        r0 = r27;
        r22 = r0.objectFieldOffset(r15);
        r0 = r22;
        r0 = (int) r0;
        r22 = r0;
        r2 = r20 & 1;
        r15 = 1;
        if (r2 != r15) goto L_0x02c5;
    L_0x024e:
        r2 = p000.krt.GROUP;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 > r2) goto L_0x02b7;
    L_0x0256:
        r15 = r14 + 1;
        r0 = r25;
        r2 = r0.charAt(r14);
        r14 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r14) goto L_0x02b3;
    L_0x0263:
        r14 = r2 & 8191;
        r2 = 13;
    L_0x0267:
        r16 = r15 + 1;
        r0 = r25;
        r15 = r0.charAt(r15);
        r23 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        r0 = r23;
        if (r15 < r0) goto L_0x027f;
    L_0x0276:
        r15 = r15 & 8191;
        r15 = r15 << r2;
        r14 = r14 | r15;
        r2 = r2 + 13;
        r15 = r16;
        goto L_0x0267;
    L_0x027f:
        r2 = r15 << r2;
        r2 = r2 | r14;
        r14 = r2;
    L_0x0283:
        r2 = r12 + r12;
        r15 = r14 / 32;
        r15 = r15 + r2;
        r2 = r28[r15];
        r0 = r2 instanceof java.lang.reflect.Field;
        r23 = r0;
        if (r23 == 0) goto L_0x02a8;
    L_0x0290:
        r2 = (java.lang.reflect.Field) r2;
    L_0x0292:
        r0 = r27;
        r32 = r0.objectFieldOffset(r2);
        r0 = r32;
        r2 = (int) r0;
        r14 = r14 % 32;
        r15 = r22;
        r23 = r16;
        r16 = r7;
        r22 = r13;
        r13 = r2;
        goto L_0x0198;
    L_0x02a8:
        r2 = (java.lang.String) r2;
        r0 = r29;
        r2 = p000.kth.m14171a(r0, r2);
        r28[r15] = r2;
        goto L_0x0292;
    L_0x02b3:
        r14 = r2;
        r16 = r15;
        goto L_0x0283;
    L_0x02b7:
        r15 = 0;
        r2 = 0;
        r16 = r7;
        r23 = r14;
        r14 = r15;
        r15 = r22;
        r22 = r13;
        r13 = r2;
        goto L_0x0198;
    L_0x02c5:
        r15 = 0;
        r2 = 0;
        r16 = r7;
        r23 = r14;
        r14 = r15;
        r15 = r22;
        r22 = r13;
        r13 = r2;
        goto L_0x0198;
    L_0x02d3:
        r2 = p000.krt.MESSAGE_LIST;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 == r2) goto L_0x02e3;
    L_0x02db:
        r2 = p000.krt.GROUP_LIST;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 != r2) goto L_0x02f3;
    L_0x02e3:
        r13 = r24 / 3;
        r2 = r7 + 1;
        r13 = r13 + r13;
        r13 = r13 + 1;
        r7 = r28[r7];
        r4[r13] = r7;
        r7 = r16;
        r13 = r2;
        goto L_0x023e;
    L_0x02f3:
        r2 = p000.krt.ENUM;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 == r2) goto L_0x030b;
    L_0x02fb:
        r2 = p000.krt.ENUM_LIST;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 == r2) goto L_0x030b;
    L_0x0303:
        r2 = p000.krt.ENUM_LIST_PACKED;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 != r2) goto L_0x0325;
    L_0x030b:
        r2 = r20 & 1;
        r13 = 1;
        if (r2 != r13) goto L_0x0320;
    L_0x0310:
        r13 = r24 / 3;
        r2 = r7 + 1;
        r13 = r13 + r13;
        r13 = r13 + 1;
        r7 = r28[r7];
        r4[r13] = r7;
        r7 = r16;
        r13 = r2;
        goto L_0x023e;
    L_0x0320:
        r13 = r7;
        r7 = r16;
        goto L_0x023e;
    L_0x0325:
        r2 = p000.krt.MAP;
        r2 = r2.f8877k;
        r0 = r30;
        if (r0 != r2) goto L_0x0350;
    L_0x032d:
        r2 = r16 + 1;
        r9[r16] = r24;
        r13 = r24 / 3;
        r16 = r13 + r13;
        r13 = r7 + 1;
        r7 = r28[r7];
        r4[r16] = r7;
        r0 = r21;
        r7 = r0 & 2048;
        if (r7 == 0) goto L_0x034d;
    L_0x0341:
        r7 = r13 + 1;
        r16 = r16 + 1;
        r13 = r28[r13];
        r4[r16] = r13;
        r13 = r7;
        r7 = r2;
        goto L_0x023e;
    L_0x034d:
        r7 = r2;
        goto L_0x023e;
    L_0x0350:
        r13 = r7;
        r7 = r16;
        goto L_0x023e;
    L_0x0355:
        r21 = r2;
        r14 = r13;
        goto L_0x0105;
    L_0x035a:
        r19 = r2;
        r14 = r13;
        goto L_0x00d8;
    L_0x035f:
        r2 = new kth;
        r0 = r35;
        r7 = r0.f22006a;
        r12 = r36;
        r13 = r37;
        r14 = r38;
        r15 = r39;
        r16 = r40;
        r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16);
        return r2;
    L_0x0373:
        r4 = r11 + 1;
        r0 = r25;
        r7 = r0.charAt(r11);
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r7 < r2) goto L_0x04f0;
    L_0x0380:
        r3 = r7 & 8191;
        r2 = 13;
    L_0x0384:
        r5 = r4 + 1;
        r0 = r25;
        r4 = r0.charAt(r4);
        r6 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r6) goto L_0x0399;
    L_0x0391:
        r4 = r4 & 8191;
        r4 = r4 << r2;
        r3 = r3 | r4;
        r2 = r2 + 13;
        r4 = r5;
        goto L_0x0384;
    L_0x0399:
        r2 = r4 << r2;
        r7 = r3 | r2;
    L_0x039d:
        r4 = r5 + 1;
        r0 = r25;
        r2 = r0.charAt(r5);
        r3 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r3) goto L_0x04ec;
    L_0x03aa:
        r3 = r2 & 8191;
        r2 = 13;
    L_0x03ae:
        r5 = r4 + 1;
        r0 = r25;
        r4 = r0.charAt(r4);
        r6 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r6) goto L_0x03c3;
    L_0x03bb:
        r4 = r4 & 8191;
        r4 = r4 << r2;
        r3 = r3 | r4;
        r2 = r2 + 13;
        r4 = r5;
        goto L_0x03ae;
    L_0x03c3:
        r2 = r4 << r2;
        r2 = r2 | r3;
        r13 = r2;
    L_0x03c7:
        r4 = r5 + 1;
        r0 = r25;
        r5 = r0.charAt(r5);
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r5 < r2) goto L_0x04e9;
    L_0x03d4:
        r3 = r5 & 8191;
        r2 = 13;
    L_0x03d8:
        r5 = r4 + 1;
        r0 = r25;
        r4 = r0.charAt(r4);
        r6 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r6) goto L_0x03ed;
    L_0x03e5:
        r4 = r4 & 8191;
        r4 = r4 << r2;
        r3 = r3 | r4;
        r2 = r2 + 13;
        r4 = r5;
        goto L_0x03d8;
    L_0x03ed:
        r2 = r4 << r2;
        r2 = r2 | r3;
        r34 = r2;
        r2 = r5;
        r5 = r34;
    L_0x03f5:
        r4 = r2 + 1;
        r0 = r25;
        r6 = r0.charAt(r2);
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r6 < r2) goto L_0x04e6;
    L_0x0402:
        r3 = r6 & 8191;
        r2 = 13;
    L_0x0406:
        r6 = r4 + 1;
        r0 = r25;
        r4 = r0.charAt(r4);
        r9 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r9) goto L_0x041b;
    L_0x0413:
        r4 = r4 & 8191;
        r4 = r4 << r2;
        r3 = r3 | r4;
        r2 = r2 + 13;
        r4 = r6;
        goto L_0x0406;
    L_0x041b:
        r2 = r4 << r2;
        r2 = r2 | r3;
        r34 = r2;
        r2 = r6;
        r6 = r34;
    L_0x0423:
        r4 = r2 + 1;
        r0 = r25;
        r2 = r0.charAt(r2);
        r3 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r3) goto L_0x04df;
    L_0x0430:
        r3 = r2 & 8191;
        r2 = 13;
    L_0x0434:
        r9 = r4 + 1;
        r0 = r25;
        r4 = r0.charAt(r4);
        r10 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r4 < r10) goto L_0x0449;
    L_0x0441:
        r4 = r4 & 8191;
        r4 = r4 << r2;
        r3 = r3 | r4;
        r2 = r2 + 13;
        r4 = r9;
        goto L_0x0434;
    L_0x0449:
        r2 = r4 << r2;
        r4 = r3 | r2;
        r2 = r9;
    L_0x044e:
        r9 = r2 + 1;
        r0 = r25;
        r3 = r0.charAt(r2);
        r2 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r3 < r2) goto L_0x0478;
    L_0x045b:
        r3 = r3 & 8191;
        r2 = 13;
    L_0x045f:
        r10 = r9 + 1;
        r0 = r25;
        r9 = r0.charAt(r9);
        r11 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r9 < r11) goto L_0x0474;
    L_0x046c:
        r9 = r9 & 8191;
        r9 = r9 << r2;
        r3 = r3 | r9;
        r2 = r2 + 13;
        r9 = r10;
        goto L_0x045f;
    L_0x0474:
        r2 = r9 << r2;
        r3 = r3 | r2;
        r9 = r10;
    L_0x0478:
        r10 = r9 + 1;
        r0 = r25;
        r2 = r0.charAt(r9);
        r9 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r9) goto L_0x04dc;
    L_0x0485:
        r9 = r2 & 8191;
        r2 = 13;
    L_0x0489:
        r11 = r10 + 1;
        r0 = r25;
        r10 = r0.charAt(r10);
        r12 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r10 < r12) goto L_0x049e;
    L_0x0496:
        r10 = r10 & 8191;
        r10 = r10 << r2;
        r9 = r9 | r10;
        r2 = r2 + 13;
        r10 = r11;
        goto L_0x0489;
    L_0x049e:
        r2 = r10 << r2;
        r2 = r2 | r9;
        r12 = r2;
    L_0x04a2:
        r10 = r11 + 1;
        r0 = r25;
        r2 = r0.charAt(r11);
        r9 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r2 < r9) goto L_0x04d9;
    L_0x04af:
        r9 = r2 & 8191;
        r2 = 13;
    L_0x04b3:
        r11 = r10 + 1;
        r0 = r25;
        r10 = r0.charAt(r10);
        r14 = 55296; // 0xd800 float:7.7486E-41 double:2.732E-319;
        if (r10 < r14) goto L_0x04c8;
    L_0x04c0:
        r10 = r10 & 8191;
        r10 = r10 << r2;
        r9 = r9 | r10;
        r2 = r2 + 13;
        r10 = r11;
        goto L_0x04b3;
    L_0x04c8:
        r2 = r10 << r2;
        r10 = r9 | r2;
    L_0x04cc:
        r2 = r10 + r3;
        r2 = r2 + r12;
        r9 = new int[r2];
        r2 = r7 + r7;
        r2 = r2 + r13;
        r12 = r7;
        r13 = r11;
        r7 = r3;
        goto L_0x007e;
    L_0x04d9:
        r11 = r10;
        r10 = r2;
        goto L_0x04cc;
    L_0x04dc:
        r12 = r2;
        r11 = r10;
        goto L_0x04a2;
    L_0x04df:
        r34 = r2;
        r2 = r4;
        r4 = r34;
        goto L_0x044e;
    L_0x04e6:
        r2 = r4;
        goto L_0x0423;
    L_0x04e9:
        r2 = r4;
        goto L_0x03f5;
    L_0x04ec:
        r13 = r2;
        r5 = r4;
        goto L_0x03c7;
    L_0x04f0:
        r5 = r4;
        goto L_0x039d;
    L_0x04f3:
        r11 = r4;
        goto L_0x0070;
    L_0x04f6:
        r5 = 1;
        r20 = r2;
        goto L_0x0046;
    L_0x04fb:
        r8 = 0;
        goto L_0x0011;
    L_0x04fe:
        r2 = new java.lang.NoSuchMethodError;
        r2.<init>();
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: kth.a(ktc, ktk, ksq, kug, krp, kta):kth");
    }

    /* renamed from: b */
    private static boolean m14189b(Object obj, long j) {
        return ((Boolean) kul.m5401j(obj, j)).booleanValue();
    }

    /* renamed from: c */
    private static double m14190c(Object obj, long j) {
        return ((Double) kul.m5401j(obj, j)).doubleValue();
    }

    /* renamed from: d */
    private static float m14193d(Object obj, long j) {
        return ((Float) kul.m5401j(obj, j)).floatValue();
    }

    /* renamed from: e */
    private static int m14196e(Object obj, long j) {
        return ((Integer) kul.m5401j(obj, j)).intValue();
    }

    /* renamed from: f */
    private static long m14198f(Object obj, long j) {
        return ((Long) kul.m5401j(obj, j)).longValue();
    }

    /* renamed from: d */
    private final int m14194d(int i) {
        return this.f21986c[i + 2];
    }

    /* renamed from: a */
    private final void m14176a(Object obj, int i, ktq ktq) {
        if (kth.m14192c(i)) {
            kul.m5381a(obj, (long) (i & 1048575), ktq.mo10355q());
        } else if (this.f21992i) {
            kul.m5381a(obj, (long) (i & 1048575), ktq.mo10353p());
        } else {
            kul.m5381a(obj, (long) (i & 1048575), ktq.mo10329d());
        }
    }

    /* renamed from: a */
    private static Field m14171a(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder stringBuilder = new StringBuilder(((String.valueOf(str).length() + 40) + String.valueOf(name).length()) + String.valueOf(arrays).length());
            stringBuilder.append("Field ");
            stringBuilder.append(str);
            stringBuilder.append(" for ");
            stringBuilder.append(name);
            stringBuilder.append(" not found. Known fields are ");
            stringBuilder.append(arrays);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private final void m14185b(Object obj, int i) {
        if (!this.f21993j) {
            int d = m14194d(i);
            long j = (long) (1048575 & d);
            kul.m5379a(obj, j, (1 << (d >>> 20)) | kul.m5399h(obj, j));
        }
    }

    /* renamed from: b */
    private final void m14186b(Object obj, int i, int i2) {
        kul.m5379a(obj, (long) (m14194d(i2) & 1048575), i);
    }

    /* renamed from: e */
    private static int m14195e(int i) {
        return (267386880 & i) >>> 20;
    }

    /* renamed from: f */
    private final int m14197f(int i) {
        return this.f21986c[i + 1];
    }

    /* renamed from: b */
    private final void m14188b(Object obj, kvb kvb) {
        Iterator it;
        Entry entry;
        if (this.f21991h) {
            krr krr = ((ksb) obj).f26750g;
            if (krr.f8818a.isEmpty()) {
                it = null;
                entry = null;
            } else {
                it = krr.mo10271c();
                entry = (Entry) it.next();
            }
        } else {
            it = null;
            entry = null;
        }
        int length = this.f21986c.length;
        Unsafe unsafe = f21985b;
        int i = 0;
        int i2 = -1;
        Entry entry2 = entry;
        int i3 = 0;
        while (i < length) {
            int i4;
            Entry entry3;
            int i5;
            int f = m14197f(i);
            int i6 = this.f21986c[i];
            int e = kth.m14195e(f);
            if (this.f21993j) {
                i4 = 0;
                entry3 = entry2;
                i5 = i2;
                i2 = i3;
            } else if (e <= 17) {
                int i7 = this.f21986c[i + 2];
                i4 = 1048575 & i7;
                if (i4 != i2) {
                    i3 = unsafe.getInt(obj, (long) i4);
                } else {
                    i4 = i2;
                }
                i2 = 1 << (i7 >>> 20);
                entry3 = entry2;
                i5 = i4;
                i4 = i2;
                i2 = i3;
            } else {
                i4 = 0;
                entry3 = entry2;
                i5 = i2;
                i2 = i3;
            }
            while (entry3 != null && krp.m5167a(entry3) <= i6) {
                krp.m5171a(kvb, entry3);
                if (it.hasNext()) {
                    entry3 = (Entry) it.next();
                } else {
                    entry3 = null;
                }
            }
            long j = (long) (1048575 & f);
            switch (e) {
                case 0:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10452a(i6, kul.m5397f(obj, j));
                    break;
                case 1:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10453a(i6, kul.m5398g(obj, j));
                    break;
                case 2:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10463b(i6, unsafe.getLong(obj, j));
                    break;
                case 3:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10470e(i6, unsafe.getLong(obj, j));
                    break;
                case 4:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10465c(i6, unsafe.getInt(obj, j));
                    break;
                case 5:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10455a(i6, unsafe.getLong(obj, j));
                    break;
                case 6:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10462b(i6, unsafe.getInt(obj, j));
                    break;
                case 7:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10460a(i6, kul.m5384a(obj, j));
                    break;
                case 8:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kth.m14175a(i6, unsafe.getObject(obj, j), kvb);
                    break;
                case 9:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10464b(i6, unsafe.getObject(obj, j), m14184b(i));
                    break;
                case 10:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10459a(i6, (kqx) unsafe.getObject(obj, j));
                    break;
                case 11:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10471f(i6, unsafe.getInt(obj, j));
                    break;
                case 12:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10454a(i6, unsafe.getInt(obj, j));
                    break;
                case 13:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10467d(i6, unsafe.getInt(obj, j));
                    break;
                case 14:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10466c(i6, unsafe.getLong(obj, j));
                    break;
                case 15:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10469e(i6, unsafe.getInt(obj, j));
                    break;
                case 16:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10468d(i6, unsafe.getLong(obj, j));
                    break;
                case 17:
                    if ((i2 & i4) == 0) {
                        break;
                    }
                    kvb.mo10457a(i6, unsafe.getObject(obj, j), m14184b(i));
                    break;
                case 18:
                    ktt.m5313b(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 19:
                    ktt.m5325f(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 20:
                    ktt.m5331h(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 21:
                    ktt.m5343n(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 22:
                    ktt.m5328g(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 23:
                    ktt.m5322e(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 24:
                    ktt.m5319d(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 25:
                    ktt.m5301a(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 26:
                    ktt.m5311b(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb);
                    break;
                case 27:
                    ktt.m5312b(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, m14184b(i));
                    break;
                case 28:
                    ktt.m5299a(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb);
                    break;
                case 29:
                    ktt.m5342m(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 30:
                    ktt.m5316c(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 31:
                    ktt.m5334i(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 32:
                    ktt.m5337j(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 33:
                    ktt.m5339k(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 34:
                    ktt.m5341l(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, false);
                    break;
                case 35:
                    ktt.m5313b(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 36:
                    ktt.m5325f(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 37:
                    ktt.m5331h(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 38:
                    ktt.m5343n(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 39:
                    ktt.m5328g(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 40:
                    ktt.m5322e(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 41:
                    ktt.m5319d(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 42:
                    ktt.m5301a(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 43:
                    ktt.m5342m(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 44:
                    ktt.m5316c(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 45:
                    ktt.m5334i(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 46:
                    ktt.m5337j(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 47:
                    ktt.m5339k(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 48:
                    ktt.m5341l(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, true);
                    break;
                case 49:
                    ktt.m5300a(this.f21986c[i], (List) unsafe.getObject(obj, j), kvb, m14184b(i));
                    break;
                case 50:
                    kth.m14178a(kvb, i6, unsafe.getObject(obj, j));
                    break;
                case 51:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10452a(i6, kth.m14190c(obj, j));
                    break;
                case 52:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10453a(i6, kth.m14193d(obj, j));
                    break;
                case 53:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10463b(i6, kth.m14198f(obj, j));
                    break;
                case 54:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10470e(i6, kth.m14198f(obj, j));
                    break;
                case 55:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10465c(i6, kth.m14196e(obj, j));
                    break;
                case 56:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10455a(i6, kth.m14198f(obj, j));
                    break;
                case 57:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10462b(i6, kth.m14196e(obj, j));
                    break;
                case 58:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10460a(i6, kth.m14189b(obj, j));
                    break;
                case 59:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kth.m14175a(i6, unsafe.getObject(obj, j), kvb);
                    break;
                case 60:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10464b(i6, unsafe.getObject(obj, j), m14184b(i));
                    break;
                case 61:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10459a(i6, (kqx) unsafe.getObject(obj, j));
                    break;
                case 62:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10471f(i6, kth.m14196e(obj, j));
                    break;
                case 63:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10454a(i6, kth.m14196e(obj, j));
                    break;
                case 64:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10467d(i6, kth.m14196e(obj, j));
                    break;
                case 65:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10466c(i6, kth.m14198f(obj, j));
                    break;
                case 66:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10469e(i6, kth.m14196e(obj, j));
                    break;
                case 67:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10468d(i6, kth.m14198f(obj, j));
                    break;
                case 68:
                    if (!m14180a(obj, i6, i)) {
                        break;
                    }
                    kvb.mo10457a(i6, unsafe.getObject(obj, j), m14184b(i));
                    break;
                default:
                    break;
            }
            i += 3;
            i3 = i2;
            i2 = i5;
            entry2 = entry3;
        }
        entry = entry2;
        while (entry != null) {
            krp.m5171a(kvb, entry);
            if (it.hasNext()) {
                entry = (Entry) it.next();
            } else {
                entry = null;
            }
        }
        kth.m14177a(this.f21999p, obj, kvb);
    }

    /* renamed from: a */
    private static void m14178a(kvb kvb, int i, Object obj) {
        if (obj != null) {
            kta.m5224a();
            for (Entry entry : ((ksz) obj).entrySet()) {
                kvb.f9001a.mo14177h(i, 2);
                kvb.f9001a.mo14183p(ksx.m14157a(entry.getKey(), entry.getValue()));
                ksx.m14158a(kvb.f9001a, entry.getKey(), entry.getValue());
            }
        }
    }

    /* renamed from: a */
    private static void m14175a(int i, Object obj, kvb kvb) {
        if (obj instanceof String) {
            kvb.mo10458a(i, (String) obj);
        } else {
            kvb.mo10459a(i, (kqx) obj);
        }
    }

    /* renamed from: a */
    public final void mo10363a(Object obj, kvb kvb) {
        Iterator it;
        Entry entry;
        int length;
        int f;
        int i;
        Entry entry2;
        if (C0252go.f5911cd == C0252go.f5912ce) {
            kth.m14177a(this.f21999p, obj, kvb);
            if (this.f21991h) {
                krr krr = ((ksb) obj).f26750g;
                if (krr.f8818a.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    if (krr.f8820c) {
                        it = new ksm(krr.f8818a.mo10373b().iterator());
                    } else {
                        it = krr.f8818a.mo10373b().iterator();
                    }
                    entry = (Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            length = this.f21986c.length - 3;
            while (length >= 0) {
                f = m14197f(length);
                i = this.f21986c[length];
                entry2 = entry;
                while (entry2 != null && krp.m5167a(entry2) > i) {
                    krp.m5171a(kvb, entry2);
                    if (it.hasNext()) {
                        entry2 = (Entry) it.next();
                    } else {
                        entry2 = null;
                    }
                }
                switch (kth.m14195e(f)) {
                    case 0:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10452a(i, kul.m5397f(obj, (long) (1048575 & f)));
                        break;
                    case 1:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10453a(i, kul.m5398g(obj, (long) (1048575 & f)));
                        break;
                    case 2:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10463b(i, kul.m5400i(obj, (long) (1048575 & f)));
                        break;
                    case 3:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10470e(i, kul.m5400i(obj, (long) (1048575 & f)));
                        break;
                    case 4:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10465c(i, kul.m5399h(obj, (long) (1048575 & f)));
                        break;
                    case 5:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10455a(i, kul.m5400i(obj, (long) (1048575 & f)));
                        break;
                    case 6:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10462b(i, kul.m5399h(obj, (long) (1048575 & f)));
                        break;
                    case 7:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10460a(i, kul.m5384a(obj, (long) (1048575 & f)));
                        break;
                    case 8:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kth.m14175a(i, kul.m5401j(obj, (long) (1048575 & f)), kvb);
                        break;
                    case 9:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10464b(i, kul.m5401j(obj, (long) (1048575 & f)), m14184b(length));
                        break;
                    case 10:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10459a(i, (kqx) kul.m5401j(obj, (long) (1048575 & f)));
                        break;
                    case 11:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10471f(i, kul.m5399h(obj, (long) (1048575 & f)));
                        break;
                    case 12:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10454a(i, kul.m5399h(obj, (long) (1048575 & f)));
                        break;
                    case 13:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10467d(i, kul.m5399h(obj, (long) (1048575 & f)));
                        break;
                    case 14:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10466c(i, kul.m5400i(obj, (long) (1048575 & f)));
                        break;
                    case 15:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10469e(i, kul.m5399h(obj, (long) (1048575 & f)));
                        break;
                    case 16:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10468d(i, kul.m5400i(obj, (long) (1048575 & f)));
                        break;
                    case 17:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10457a(i, kul.m5401j(obj, (long) (1048575 & f)), m14184b(length));
                        break;
                    case 18:
                        ktt.m5313b(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 19:
                        ktt.m5325f(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 20:
                        ktt.m5331h(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 21:
                        ktt.m5343n(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 22:
                        ktt.m5328g(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 23:
                        ktt.m5322e(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 24:
                        ktt.m5319d(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 25:
                        ktt.m5301a(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 26:
                        ktt.m5311b(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb);
                        break;
                    case 27:
                        ktt.m5312b(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, m14184b(length));
                        break;
                    case 28:
                        ktt.m5299a(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb);
                        break;
                    case 29:
                        ktt.m5342m(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 30:
                        ktt.m5316c(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 31:
                        ktt.m5334i(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 32:
                        ktt.m5337j(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 33:
                        ktt.m5339k(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 34:
                        ktt.m5341l(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, false);
                        break;
                    case 35:
                        ktt.m5313b(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 36:
                        ktt.m5325f(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 37:
                        ktt.m5331h(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 38:
                        ktt.m5343n(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 39:
                        ktt.m5328g(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 40:
                        ktt.m5322e(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 41:
                        ktt.m5319d(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 42:
                        ktt.m5301a(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 43:
                        ktt.m5342m(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 44:
                        ktt.m5316c(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 45:
                        ktt.m5334i(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 46:
                        ktt.m5337j(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 47:
                        ktt.m5339k(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 48:
                        ktt.m5341l(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, true);
                        break;
                    case 49:
                        ktt.m5300a(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & f)), kvb, m14184b(length));
                        break;
                    case 50:
                        kth.m14178a(kvb, i, kul.m5401j(obj, (long) (1048575 & f)));
                        break;
                    case 51:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10452a(i, kth.m14190c(obj, (long) (1048575 & f)));
                        break;
                    case 52:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10453a(i, kth.m14193d(obj, (long) (1048575 & f)));
                        break;
                    case 53:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10463b(i, kth.m14198f(obj, (long) (1048575 & f)));
                        break;
                    case 54:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10470e(i, kth.m14198f(obj, (long) (1048575 & f)));
                        break;
                    case 55:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10465c(i, kth.m14196e(obj, (long) (1048575 & f)));
                        break;
                    case 56:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10455a(i, kth.m14198f(obj, (long) (1048575 & f)));
                        break;
                    case 57:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10462b(i, kth.m14196e(obj, (long) (1048575 & f)));
                        break;
                    case 58:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10460a(i, kth.m14189b(obj, (long) (1048575 & f)));
                        break;
                    case 59:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kth.m14175a(i, kul.m5401j(obj, (long) (1048575 & f)), kvb);
                        break;
                    case 60:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10464b(i, kul.m5401j(obj, (long) (1048575 & f)), m14184b(length));
                        break;
                    case 61:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10459a(i, (kqx) kul.m5401j(obj, (long) (1048575 & f)));
                        break;
                    case 62:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10471f(i, kth.m14196e(obj, (long) (1048575 & f)));
                        break;
                    case 63:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10454a(i, kth.m14196e(obj, (long) (1048575 & f)));
                        break;
                    case 64:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10467d(i, kth.m14196e(obj, (long) (1048575 & f)));
                        break;
                    case 65:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10466c(i, kth.m14198f(obj, (long) (1048575 & f)));
                        break;
                    case 66:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10469e(i, kth.m14196e(obj, (long) (1048575 & f)));
                        break;
                    case 67:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10468d(i, kth.m14198f(obj, (long) (1048575 & f)));
                        break;
                    case 68:
                        if (!m14180a(obj, i, length)) {
                            break;
                        }
                        kvb.mo10457a(i, kul.m5401j(obj, (long) (1048575 & f)), m14184b(length));
                        break;
                    default:
                        break;
                }
                length -= 3;
                entry = entry2;
            }
            while (entry != null) {
                krp.m5171a(kvb, entry);
                if (it.hasNext()) {
                    entry = (Entry) it.next();
                } else {
                    entry = null;
                }
            }
        } else if (this.f21993j) {
            if (this.f21991h) {
                krr krr2 = ((ksb) obj).f26750g;
                if (krr2.f8818a.isEmpty()) {
                    it = null;
                    entry = null;
                } else {
                    it = krr2.mo10271c();
                    entry = (Entry) it.next();
                }
            } else {
                it = null;
                entry = null;
            }
            f = this.f21986c.length;
            length = 0;
            while (length < f) {
                i = m14197f(length);
                int i2 = this.f21986c[length];
                entry2 = entry;
                while (entry2 != null && krp.m5167a(entry2) <= i2) {
                    krp.m5171a(kvb, entry2);
                    if (it.hasNext()) {
                        entry2 = (Entry) it.next();
                    } else {
                        entry2 = null;
                    }
                }
                switch (kth.m14195e(i)) {
                    case 0:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10452a(i2, kul.m5397f(obj, (long) (1048575 & i)));
                        break;
                    case 1:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10453a(i2, kul.m5398g(obj, (long) (1048575 & i)));
                        break;
                    case 2:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10463b(i2, kul.m5400i(obj, (long) (1048575 & i)));
                        break;
                    case 3:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10470e(i2, kul.m5400i(obj, (long) (1048575 & i)));
                        break;
                    case 4:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10465c(i2, kul.m5399h(obj, (long) (1048575 & i)));
                        break;
                    case 5:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10455a(i2, kul.m5400i(obj, (long) (1048575 & i)));
                        break;
                    case 6:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10462b(i2, kul.m5399h(obj, (long) (1048575 & i)));
                        break;
                    case 7:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10460a(i2, kul.m5384a(obj, (long) (1048575 & i)));
                        break;
                    case 8:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kth.m14175a(i2, kul.m5401j(obj, (long) (1048575 & i)), kvb);
                        break;
                    case 9:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10464b(i2, kul.m5401j(obj, (long) (1048575 & i)), m14184b(length));
                        break;
                    case 10:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10459a(i2, (kqx) kul.m5401j(obj, (long) (1048575 & i)));
                        break;
                    case 11:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10471f(i2, kul.m5399h(obj, (long) (1048575 & i)));
                        break;
                    case 12:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10454a(i2, kul.m5399h(obj, (long) (1048575 & i)));
                        break;
                    case 13:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10467d(i2, kul.m5399h(obj, (long) (1048575 & i)));
                        break;
                    case 14:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10466c(i2, kul.m5400i(obj, (long) (1048575 & i)));
                        break;
                    case 15:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10469e(i2, kul.m5399h(obj, (long) (1048575 & i)));
                        break;
                    case 16:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10468d(i2, kul.m5400i(obj, (long) (1048575 & i)));
                        break;
                    case 17:
                        if (!m14179a(obj, length)) {
                            break;
                        }
                        kvb.mo10457a(i2, kul.m5401j(obj, (long) (1048575 & i)), m14184b(length));
                        break;
                    case 18:
                        ktt.m5313b(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 19:
                        ktt.m5325f(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 20:
                        ktt.m5331h(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 21:
                        ktt.m5343n(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 22:
                        ktt.m5328g(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 23:
                        ktt.m5322e(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 24:
                        ktt.m5319d(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 25:
                        ktt.m5301a(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 26:
                        ktt.m5311b(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb);
                        break;
                    case 27:
                        ktt.m5312b(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, m14184b(length));
                        break;
                    case 28:
                        ktt.m5299a(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb);
                        break;
                    case 29:
                        ktt.m5342m(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 30:
                        ktt.m5316c(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 31:
                        ktt.m5334i(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 32:
                        ktt.m5337j(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 33:
                        ktt.m5339k(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 34:
                        ktt.m5341l(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, false);
                        break;
                    case 35:
                        ktt.m5313b(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 36:
                        ktt.m5325f(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 37:
                        ktt.m5331h(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 38:
                        ktt.m5343n(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 39:
                        ktt.m5328g(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 40:
                        ktt.m5322e(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 41:
                        ktt.m5319d(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 42:
                        ktt.m5301a(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 43:
                        ktt.m5342m(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 44:
                        ktt.m5316c(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 45:
                        ktt.m5334i(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 46:
                        ktt.m5337j(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 47:
                        ktt.m5339k(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 48:
                        ktt.m5341l(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, true);
                        break;
                    case 49:
                        ktt.m5300a(this.f21986c[length], (List) kul.m5401j(obj, (long) (1048575 & i)), kvb, m14184b(length));
                        break;
                    case 50:
                        kth.m14178a(kvb, i2, kul.m5401j(obj, (long) (1048575 & i)));
                        break;
                    case 51:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10452a(i2, kth.m14190c(obj, (long) (1048575 & i)));
                        break;
                    case 52:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10453a(i2, kth.m14193d(obj, (long) (1048575 & i)));
                        break;
                    case 53:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10463b(i2, kth.m14198f(obj, (long) (1048575 & i)));
                        break;
                    case 54:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10470e(i2, kth.m14198f(obj, (long) (1048575 & i)));
                        break;
                    case 55:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10465c(i2, kth.m14196e(obj, (long) (1048575 & i)));
                        break;
                    case 56:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10455a(i2, kth.m14198f(obj, (long) (1048575 & i)));
                        break;
                    case 57:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10462b(i2, kth.m14196e(obj, (long) (1048575 & i)));
                        break;
                    case 58:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10460a(i2, kth.m14189b(obj, (long) (1048575 & i)));
                        break;
                    case 59:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kth.m14175a(i2, kul.m5401j(obj, (long) (1048575 & i)), kvb);
                        break;
                    case 60:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10464b(i2, kul.m5401j(obj, (long) (1048575 & i)), m14184b(length));
                        break;
                    case 61:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10459a(i2, (kqx) kul.m5401j(obj, (long) (1048575 & i)));
                        break;
                    case 62:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10471f(i2, kth.m14196e(obj, (long) (1048575 & i)));
                        break;
                    case 63:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10454a(i2, kth.m14196e(obj, (long) (1048575 & i)));
                        break;
                    case 64:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10467d(i2, kth.m14196e(obj, (long) (1048575 & i)));
                        break;
                    case 65:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10466c(i2, kth.m14198f(obj, (long) (1048575 & i)));
                        break;
                    case 66:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10469e(i2, kth.m14196e(obj, (long) (1048575 & i)));
                        break;
                    case 67:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10468d(i2, kth.m14198f(obj, (long) (1048575 & i)));
                        break;
                    case 68:
                        if (!m14180a(obj, i2, length)) {
                            break;
                        }
                        kvb.mo10457a(i2, kul.m5401j(obj, (long) (1048575 & i)), m14184b(length));
                        break;
                    default:
                        break;
                }
                length += 3;
                entry = entry2;
            }
            while (entry != null) {
                krp.m5171a(kvb, entry);
                if (it.hasNext()) {
                    entry = (Entry) it.next();
                } else {
                    entry = null;
                }
            }
            kth.m14177a(this.f21999p, obj, kvb);
        } else {
            m14188b(obj, kvb);
        }
    }

    /* renamed from: a */
    private static void m14177a(kug kug, Object obj, kvb kvb) {
        ((kry) obj).f26607e.mo10414a(kvb);
    }
}
