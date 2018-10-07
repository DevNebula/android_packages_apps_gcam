package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: kul */
final class kul {
    /* renamed from: a */
    public static final boolean f8951a = kul.m5395d();
    /* renamed from: b */
    public static final boolean f8952b = kul.m5391c();
    /* renamed from: c */
    public static final boolean f8953c = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN);
    /* renamed from: d */
    private static final Logger f8954d = Logger.getLogger(kul.class.getName());
    /* renamed from: e */
    private static final Unsafe f8955e = kul.m5375a();
    /* renamed from: f */
    private static final Class f8956f = kqs.f8793a;
    /* renamed from: g */
    private static final boolean f8957g = kul.m5392c(Long.TYPE);
    /* renamed from: h */
    private static final boolean f8958h = kul.m5392c(Integer.TYPE);
    /* renamed from: i */
    private static final kuq f8959i;
    /* renamed from: j */
    private static final long f8960j = ((long) kul.m5372a(byte[].class));

    static {
        Field field = null;
        kuq kuo = f8955e != null ? kqs.m5112a() ? f8957g ? new kuo(f8955e) : f8958h ? new kun(f8955e) : null : new kup(f8955e) : null;
        f8959i = kuo;
        kul.m5372a(boolean[].class);
        kul.m5385b(boolean[].class);
        kul.m5372a(int[].class);
        kul.m5385b(int[].class);
        kul.m5372a(long[].class);
        kul.m5385b(long[].class);
        kul.m5372a(float[].class);
        kul.m5385b(float[].class);
        kul.m5372a(double[].class);
        kul.m5385b(double[].class);
        kul.m5372a(Object[].class);
        kul.m5385b(Object[].class);
        kul.m5373a(kul.m5386b());
        Field a = kul.m5374a(String.class, "value");
        if (a != null && a.getType() == char[].class) {
            field = a;
        }
        kul.m5373a(field);
    }

    private kul() {
    }

    /* renamed from: a */
    private static int m5372a(Class cls) {
        if (f8952b) {
            return f8959i.f8961a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static int m5385b(Class cls) {
        if (f8952b) {
            return f8959i.f8961a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: b */
    private static Field m5386b() {
        Field a;
        if (kqs.m5112a()) {
            a = kul.m5374a(Buffer.class, "effectiveDirectAddress");
            if (a != null) {
                return a;
            }
        }
        a = kul.m5374a(Buffer.class, "address");
        return (a == null || a.getType() != Long.TYPE) ? null : a;
    }

    /* renamed from: c */
    private static boolean m5392c(Class cls) {
        if (!kqs.m5112a()) {
            return false;
        }
        try {
            Class cls2 = f8956f;
            cls2.getMethod("peekLong", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeLong", new Class[]{cls, Long.TYPE, Boolean.TYPE});
            cls2.getMethod("pokeInt", new Class[]{cls, Integer.TYPE, Boolean.TYPE});
            cls2.getMethod("peekInt", new Class[]{cls, Boolean.TYPE});
            cls2.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls2.getMethod("peekByte", new Class[]{cls});
            cls2.getMethod("pokeByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            cls2.getMethod("peekByteArray", new Class[]{cls, byte[].class, Integer.TYPE, Integer.TYPE});
            return true;
        } catch (Throwable th) {
            return false;
        }
    }

    /* renamed from: a */
    private static Field m5374a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    private static long m5373a(Field field) {
        if (field == null || f8959i == null) {
            return -1;
        }
        return f8959i.f8961a.objectFieldOffset(field);
    }

    /* renamed from: a */
    static boolean m5384a(Object obj, long j) {
        return f8959i.mo10436a(obj, j);
    }

    /* renamed from: b */
    static boolean m5389b(Object obj, long j) {
        return kul.m5394d(obj, j) != (byte) 0;
    }

    /* renamed from: c */
    static boolean m5393c(Object obj, long j) {
        return kul.m5396e(obj, j) != (byte) 0;
    }

    /* renamed from: a */
    static byte m5371a(byte[] bArr, long j) {
        return f8959i.mo10437b(bArr, f8960j + j);
    }

    /* renamed from: d */
    static byte m5394d(Object obj, long j) {
        return (byte) (kul.m5399h(obj, -4 & j) >>> ((int) (((-1 ^ j) & 3) << 3)));
    }

    /* renamed from: e */
    static byte m5396e(Object obj, long j) {
        return (byte) (kul.m5399h(obj, -4 & j) >>> ((int) ((3 & j) << 3)));
    }

    /* renamed from: f */
    static double m5397f(Object obj, long j) {
        return f8959i.mo10438c(obj, j);
    }

    /* renamed from: g */
    static float m5398g(Object obj, long j) {
        return f8959i.mo10439d(obj, j);
    }

    /* renamed from: h */
    static int m5399h(Object obj, long j) {
        return f8959i.mo10440e(obj, j);
    }

    /* renamed from: i */
    static long m5400i(Object obj, long j) {
        return f8959i.mo10441f(obj, j);
    }

    /* renamed from: j */
    static Object m5401j(Object obj, long j) {
        return f8959i.f8961a.getObject(obj, j);
    }

    /* renamed from: a */
    static Unsafe m5375a() {
        try {
            return (Unsafe) AccessController.doPrivileged(new kum());
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    static void m5382a(Object obj, long j, boolean z) {
        f8959i.mo10435a(obj, j, z);
    }

    /* renamed from: b */
    static void m5388b(Object obj, long j, boolean z) {
        kul.m5376a(obj, j, (byte) z);
    }

    /* renamed from: c */
    static void m5390c(Object obj, long j, boolean z) {
        kul.m5387b(obj, j, (byte) z);
    }

    /* renamed from: a */
    static void m5383a(byte[] bArr, long j, byte b) {
        f8959i.mo10430a((Object) bArr, f8960j + j, b);
    }

    /* renamed from: a */
    static void m5376a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = ((((int) j) ^ -1) & 3) << 3;
        kul.m5379a(obj, j2, ((b & Illuminant.kOther) << i) | (kul.m5399h(obj, j2) & ((Illuminant.kOther << i) ^ -1)));
    }

    /* renamed from: b */
    static void m5387b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        kul.m5379a(obj, j2, ((b & Illuminant.kOther) << i) | (kul.m5399h(obj, j2) & ((Illuminant.kOther << i) ^ -1)));
    }

    /* renamed from: a */
    static void m5377a(Object obj, long j, double d) {
        f8959i.mo10431a(obj, j, d);
    }

    /* renamed from: a */
    static void m5378a(Object obj, long j, float f) {
        f8959i.mo10432a(obj, j, f);
    }

    /* renamed from: a */
    static void m5379a(Object obj, long j, int i) {
        f8959i.mo10433a(obj, j, i);
    }

    /* renamed from: a */
    static void m5380a(Object obj, long j, long j2) {
        f8959i.mo10434a(obj, j, j2);
    }

    /* renamed from: a */
    static void m5381a(Object obj, long j, Object obj2) {
        f8959i.f8961a.putObject(obj, j, obj2);
    }

    /* renamed from: c */
    private static boolean m5391c() {
        if (f8955e == null) {
            return false;
        }
        try {
            Class cls = f8955e.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
            cls.getMethod("arrayIndexScale", new Class[]{Class.class});
            cls.getMethod("getInt", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putInt", new Class[]{Object.class, Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putLong", new Class[]{Object.class, Long.TYPE, Long.TYPE});
            cls.getMethod("getObject", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putObject", new Class[]{Object.class, Long.TYPE, Object.class});
            if (kqs.m5112a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putByte", new Class[]{Object.class, Long.TYPE, Byte.TYPE});
            cls.getMethod("getBoolean", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE});
            cls.getMethod("getFloat", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putFloat", new Class[]{Object.class, Long.TYPE, Float.TYPE});
            cls.getMethod("getDouble", new Class[]{Object.class, Long.TYPE});
            cls.getMethod("putDouble", new Class[]{Object.class, Long.TYPE, Double.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f8954d;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringBuilder.toString());
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m5395d() {
        if (f8955e == null) {
            return false;
        }
        try {
            Class cls = f8955e.getClass();
            cls.getMethod("objectFieldOffset", new Class[]{Field.class});
            cls.getMethod("getLong", new Class[]{Object.class, Long.TYPE});
            if (kul.m5386b() == null) {
                return false;
            }
            if (kqs.m5112a()) {
                return true;
            }
            cls.getMethod("getByte", new Class[]{Long.TYPE});
            cls.getMethod("putByte", new Class[]{Long.TYPE, Byte.TYPE});
            cls.getMethod("getInt", new Class[]{Long.TYPE});
            cls.getMethod("putInt", new Class[]{Long.TYPE, Integer.TYPE});
            cls.getMethod("getLong", new Class[]{Long.TYPE});
            cls.getMethod("putLong", new Class[]{Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
            cls.getMethod("copyMemory", new Class[]{Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE});
            return true;
        } catch (Throwable th) {
            Logger logger = f8954d;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 71);
            stringBuilder.append("platform method missing - proto runtime falling back to safer methods: ");
            stringBuilder.append(valueOf);
            logger.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringBuilder.toString());
            return false;
        }
    }
}
