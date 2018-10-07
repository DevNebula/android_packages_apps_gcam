package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: kbr */
public final class kbr {
    /* renamed from: a */
    private static final Object f8553a;

    static {
        Object a = kbr.m4814a();
        f8553a = a;
        if (a != null) {
            kbr.m4816a("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        if (f8553a != null) {
            kbr.m4818b();
        }
    }

    /* renamed from: a */
    private static Object m4814a() {
        Object obj = null;
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return obj;
        }
    }

    /* renamed from: a */
    private static Method m4816a(String str, Class... clsArr) {
        Method method = null;
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable th) {
            return method;
        }
    }

    /* renamed from: b */
    private static Method m4818b() {
        try {
            Method a = kbr.m4816a("getStackTraceDepth", Throwable.class);
            if (a == null) {
                return null;
            }
            a.invoke(kbr.m4814a(), new Object[]{new Throwable()});
            return a;
        } catch (UnsupportedOperationException e) {
            return null;
        } catch (IllegalAccessException e2) {
            return null;
        } catch (InvocationTargetException e3) {
            return null;
        }
    }

    @Deprecated
    /* renamed from: a */
    public static RuntimeException m4815a(Throwable th) {
        kbr.m4819b(th);
        throw new RuntimeException(th);
    }

    /* renamed from: a */
    public static void m4817a(Throwable th, Class cls) {
        if (th != null) {
            jri.m13404b((Object) th);
            if (cls.isInstance(th)) {
                throw ((Throwable) cls.cast(th));
            }
        }
        if (th != null) {
            kbr.m4819b(th);
        }
    }

    /* renamed from: b */
    public static void m4819b(Throwable th) {
        jri.m13404b((Object) th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        }
    }
}
