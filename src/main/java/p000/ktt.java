package p000;

import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.RandomAccess;

/* compiled from: PG */
/* renamed from: ktt */
final class ktt {
    /* renamed from: a */
    public static final kug f8913a = ktt.m5298a(false);
    /* renamed from: b */
    public static final kug f8914b = ktt.m5298a(true);
    /* renamed from: c */
    public static final kug f8915c = new kug((byte) 0);
    /* renamed from: d */
    private static final Class f8916d = ktt.m5295a();

    /* renamed from: a */
    static int m5292a(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * krh.m14058a(i);
    }

    /* renamed from: a */
    static int m5294a(List list) {
        return list.size();
    }

    /* renamed from: b */
    static int m5307b(int i, List list) {
        int i2 = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k = size * krh.m14102k(i);
        while (true) {
            size = i2;
            if (size >= list.size()) {
                return k;
            }
            k += krh.m14068a((kqx) list.get(size));
            i2 = size + 1;
        }
    }

    /* renamed from: c */
    static int m5314c(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m14102k(i)) + ktt.m5309b(list);
    }

    /* renamed from: b */
    static int m5309b(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        int c;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            i2 = 0;
            while (i2 < size) {
                c = krh.m14084c(ksc.mo15174c(i2)) + i;
                i2++;
                i = c;
            }
            return i;
        }
        i2 = 0;
        for (c = 0; c < size; c++) {
            i2 += krh.m14084c(((Integer) list.get(c)).intValue());
        }
        return i2;
    }

    /* renamed from: d */
    static int m5317d(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * krh.m14089d(i);
    }

    /* renamed from: c */
    static int m5315c(List list) {
        return list.size() << 2;
    }

    /* renamed from: e */
    static int m5320e(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * krh.m14092e(i);
    }

    /* renamed from: d */
    static int m5318d(List list) {
        return list.size() << 3;
    }

    /* renamed from: a */
    static int m5293a(int i, List list, ktr ktr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += krh.m14065a(i, (kte) list.get(i3), ktr);
        }
        return i2;
    }

    /* renamed from: f */
    static int m5323f(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m14102k(i)) + ktt.m5321e(list);
    }

    /* renamed from: e */
    static int m5321e(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        int g;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            i2 = 0;
            while (i2 < size) {
                g = krh.m14096g(ksc.mo15174c(i2)) + i;
                i2++;
                i = g;
            }
            return i;
        }
        i2 = 0;
        for (g = 0; g < size; g++) {
            i2 += krh.m14096g(((Integer) list.get(g)).intValue());
        }
        return i2;
    }

    /* renamed from: g */
    static int m5326g(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return ktt.m5324f(list) + (list.size() * krh.m14102k(i));
    }

    /* renamed from: f */
    static int m5324f(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        int a;
        if (list instanceof kst) {
            kst kst = (kst) list;
            i2 = 0;
            while (i2 < size) {
                a = krh.m14066a(kst.mo15181b(i2)) + i;
                i2++;
                i = a;
            }
            return i;
        }
        i2 = 0;
        for (a = 0; a < size; a++) {
            i2 += krh.m14066a(((Long) list.get(a)).longValue());
        }
        return i2;
    }

    /* renamed from: a */
    static int m5291a(int i, Object obj, ktr ktr) {
        if (obj instanceof ksn) {
            return krh.m14078b(i, (ksn) obj);
        }
        return krh.m14079b(i, (kte) obj, ktr);
    }

    /* renamed from: b */
    static int m5308b(int i, List list, ktr ktr) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k = krh.m14102k(i) * size;
        int i2 = 0;
        while (i2 < size) {
            int a;
            Object obj = list.get(i2);
            if (obj instanceof ksn) {
                a = krh.m14069a((ksn) obj);
            } else {
                a = krh.m14071a((kte) obj, ktr);
            }
            i2++;
            k = a + k;
        }
        return k;
    }

    /* renamed from: h */
    static int m5329h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m14102k(i)) + ktt.m5327g(list);
    }

    /* renamed from: g */
    static int m5327g(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        int j;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            i2 = 0;
            while (i2 < size) {
                j = krh.m14101j(ksc.mo15174c(i2)) + i;
                i2++;
                i = j;
            }
            return i;
        }
        i2 = 0;
        for (j = 0; j < size; j++) {
            i2 += krh.m14101j(((Integer) list.get(j)).intValue());
        }
        return i2;
    }

    /* renamed from: i */
    static int m5332i(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m14102k(i)) + ktt.m5330h(list);
    }

    /* renamed from: h */
    static int m5330h(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        int b;
        if (list instanceof kst) {
            kst kst = (kst) list;
            i2 = 0;
            while (i2 < size) {
                b = krh.m14080b(kst.mo15181b(i2)) + i;
                i2++;
                i = b;
            }
            return i;
        }
        i2 = 0;
        for (b = 0; b < size; b++) {
            i2 += krh.m14080b(((Long) list.get(b)).longValue());
        }
        return i2;
    }

    /* renamed from: j */
    static int m5335j(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int k = krh.m14102k(i) * size;
        int i2;
        Object b;
        int a;
        if (list instanceof ksp) {
            ksp ksp = (ksp) list;
            i2 = 0;
            while (i2 < size) {
                b = ksp.mo10292b(i2);
                if (b instanceof kqx) {
                    a = krh.m14068a((kqx) b);
                } else {
                    a = krh.m14067a((String) b);
                }
                i2++;
                k = a + k;
            }
            return k;
        }
        i2 = 0;
        while (i2 < size) {
            b = list.get(i2);
            if (b instanceof kqx) {
                a = krh.m14068a((kqx) b);
            } else {
                a = krh.m14067a((String) b);
            }
            i2++;
            k = a + k;
        }
        return k;
    }

    /* renamed from: k */
    static int m5338k(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m14102k(i)) + ktt.m5333i(list);
    }

    /* renamed from: i */
    static int m5333i(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        int l;
        if (list instanceof ksc) {
            ksc ksc = (ksc) list;
            i2 = 0;
            while (i2 < size) {
                l = krh.m14103l(ksc.mo15174c(i2)) + i;
                i2++;
                i = l;
            }
            return i;
        }
        i2 = 0;
        for (l = 0; l < size; l++) {
            i2 += krh.m14103l(((Integer) list.get(l)).intValue());
        }
        return i2;
    }

    /* renamed from: l */
    static int m5340l(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (size * krh.m14102k(i)) + ktt.m5336j(list);
    }

    /* renamed from: j */
    static int m5336j(List list) {
        int i = 0;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2;
        int c;
        if (list instanceof kst) {
            kst kst = (kst) list;
            i2 = 0;
            while (i2 < size) {
                c = krh.m14087c(kst.mo15181b(i2)) + i;
                i2++;
                i = c;
            }
            return i;
        }
        i2 = 0;
        for (c = 0; c < size; c++) {
            i2 += krh.m14087c(((Long) list.get(c)).longValue());
        }
        return i2;
    }

    /* renamed from: a */
    static Object m5297a(int i, List list, ksf ksf, Object obj, kug kug) {
        if (ksf == null) {
            return obj;
        }
        int intValue;
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            int i3 = 0;
            Object obj2 = obj;
            while (i2 < size) {
                Object obj3;
                intValue = ((Integer) list.get(i2)).intValue();
                if (ksf.mo10278a(intValue) != null) {
                    if (i2 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    intValue = i3 + 1;
                    obj3 = obj2;
                } else {
                    int i4 = i3;
                    obj3 = ktt.m5296a(i, intValue, obj2, kug);
                    intValue = i4;
                }
                i2++;
                obj2 = obj3;
                i3 = intValue;
            }
            if (i3 == size) {
                return obj2;
            }
            list.subList(i3, size).clear();
            return obj2;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            intValue = ((Integer) it.next()).intValue();
            if (ksf.mo10278a(intValue) == null) {
                obj = ktt.m5296a(i, intValue, obj, kug);
                it.remove();
            }
        }
        return obj;
    }

    /* renamed from: a */
    private static Class m5295a() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static kug m5298a(boolean z) {
        try {
            Class b = ktt.m5310b();
            if (b == null) {
                return null;
            }
            return (kug) b.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: b */
    private static Class m5310b() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static void m5304a(krp krp, Object obj, Object obj2) {
        krr krr = ((ksb) obj2).f26750g;
        if (!krr.f8818a.isEmpty()) {
            krr a = krp.m5169a(obj);
            for (int i = 0; i < krr.f8818a.mo10374c(); i++) {
                a.mo10268b(krr.f8818a.mo10371a(i));
            }
            for (Entry b : krr.f8818a.mo10378d()) {
                a.mo10268b(b);
            }
        }
    }

    /* renamed from: a */
    static void m5303a(Object obj, Object obj2, long j) {
        kul.m5381a(obj, j, kta.m5223a(kul.m5401j(obj, j), kul.m5401j(obj2, j)));
    }

    /* renamed from: a */
    static void m5305a(kug kug, Object obj, Object obj2) {
        kuh kuh = ((kry) obj).f26607e;
        kuh kuh2 = ((kry) obj2).f26607e;
        if (!kuh2.equals(kuh.f8940a)) {
            kuh = kuh.m5365a(kuh, kuh2);
        }
        kug.m5362a(obj, kuh);
    }

    /* renamed from: a */
    public static void m5302a(Class cls) {
        if (!kry.class.isAssignableFrom(cls) && f8916d != null && !f8916d.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* renamed from: a */
    static boolean m5306a(Object obj, Object obj2) {
        boolean z = true;
        if (obj != obj2) {
            if (obj == null) {
                z = false;
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return z;
    }

    /* renamed from: a */
    static Object m5296a(int i, int i2, Object obj, kug kug) {
        if (obj == null) {
            obj = kuh.m5367b();
        }
        ((kuh) obj).mo10413a(i << 3, Long.valueOf((long) i2));
        return obj;
    }

    /* renamed from: a */
    public static void m5301a(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Boolean) list.get(i4)).booleanValue();
                    i3 += krh.m14073b();
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14153a(((Boolean) list.get(i2)).booleanValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14158a(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m5299a(int i, List list, kvb kvb) {
        if (list != null && !list.isEmpty()) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < list.size()) {
                    kvb.f9001a.mo14164c(i, (kqx) list.get(i3));
                    i2 = i3 + 1;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public static void m5313b(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    i3 += krh.m14083c();
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14154a(((Double) list.get(i2)).doubleValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14156a(i, ((Double) list.get(i2)).doubleValue());
                i2++;
            }
        }
    }

    /* renamed from: c */
    public static void m5316c(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m14084c(((Integer) list.get(i4)).intValue());
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14181n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14173f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: d */
    public static void m5319d(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += krh.m14088d();
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14180m(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14170e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: e */
    public static void m5322e(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += krh.m14091e();
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14169d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14167d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: f */
    public static void m5325f(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    i3 += krh.m14093f();
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14155a(((Float) list.get(i2)).floatValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14157a(i, ((Float) list.get(i2)).floatValue());
                i2++;
            }
        }
    }

    /* renamed from: a */
    public static void m5300a(int i, List list, kvb kvb, ktr ktr) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                kvb.mo10457a(i, list.get(i2), ktr);
            }
        }
    }

    /* renamed from: g */
    public static void m5328g(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m14096g(((Integer) list.get(i4)).intValue());
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14181n(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14173f(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: h */
    public static void m5331h(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m14066a(((Long) list.get(i4)).longValue());
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14175f(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14174f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m5312b(int i, List list, kvb kvb, ktr ktr) {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                kvb.mo10464b(i, list.get(i2), ktr);
            }
        }
    }

    /* renamed from: i */
    public static void m5334i(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    i3 += krh.m14095g();
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14180m(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14170e(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: j */
    public static void m5337j(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    i3 += krh.m14098h();
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14169d(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14167d(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: k */
    public static void m5339k(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m14101j(((Integer) list.get(i4)).intValue());
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14182o(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14176g(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: l */
    public static void m5341l(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m14080b(((Long) list.get(i4)).longValue());
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14172e(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14171e(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    /* renamed from: b */
    public static void m5311b(int i, List list, kvb kvb) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (list instanceof ksp) {
                ksp ksp = (ksp) list;
                while (true) {
                    int i3 = i2;
                    if (i3 < list.size()) {
                        Object b = ksp.mo10292b(i3);
                        if (b instanceof String) {
                            kvb.f9001a.mo14160b(i, (String) b);
                        } else {
                            kvb.f9001a.mo14164c(i, (kqx) b);
                        }
                        i2 = i3 + 1;
                    } else {
                        return;
                    }
                }
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14160b(i, (String) list.get(i2));
                i2++;
            }
        }
    }

    /* renamed from: m */
    public static void m5342m(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m14103l(((Integer) list.get(i4)).intValue());
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14183p(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14179i(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    /* renamed from: n */
    public static void m5343n(int i, List list, kvb kvb, boolean z) {
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            if (z) {
                kvb.f9001a.mo14177h(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += krh.m14087c(((Long) list.get(i4)).longValue());
                }
                kvb.f9001a.mo14183p(i3);
                while (i2 < list.size()) {
                    kvb.f9001a.mo14175f(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                kvb.f9001a.mo14174f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }
}
