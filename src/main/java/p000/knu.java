package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* compiled from: PG */
/* renamed from: knu */
final class knu extends knl {
    /* renamed from: a */
    public static final Unsafe f21931a;
    /* renamed from: b */
    public static final long f21932b;
    /* renamed from: c */
    public static final long f21933c;
    /* renamed from: d */
    public static final long f21934d;
    /* renamed from: e */
    public static final long f21935e;
    /* renamed from: f */
    public static final long f21936f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new knv());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        try {
            Class cls = knk.class;
            f21933c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            f21932b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            f21934d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            f21935e = unsafe.objectFieldOffset(knw.class.getDeclaredField("thread"));
            f21936f = unsafe.objectFieldOffset(knw.class.getDeclaredField("next"));
            f21931a = unsafe;
        } catch (Throwable e3) {
            kbr.m4819b(e3);
            throw new RuntimeException(e3);
        }
    }

    knu() {
    }

    /* renamed from: a */
    final boolean mo10172a(knk knk, knp knp, knp knp2) {
        return f21931a.compareAndSwapObject(knk, f21932b, knp, knp2);
    }

    /* renamed from: a */
    final boolean mo10171a(knk knk, Object obj, Object obj2) {
        return f21931a.compareAndSwapObject(knk, f21934d, obj, obj2);
    }

    /* renamed from: a */
    final boolean mo10173a(knk knk, knw knw, knw knw2) {
        return f21931a.compareAndSwapObject(knk, f21933c, knw, knw2);
    }

    /* renamed from: a */
    final void mo10170a(knw knw, knw knw2) {
        f21931a.putObject(knw, f21936f, knw2);
    }

    /* renamed from: a */
    final void mo10169a(knw knw, Thread thread) {
        f21931a.putObject(knw, f21935e, thread);
    }
}
