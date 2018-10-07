package p000;

import java.io.Closeable;
import java.lang.reflect.Method;

/* compiled from: PG */
/* renamed from: kiw */
final class kiw implements kix {
    /* renamed from: a */
    public static final kiw f21918a = new kiw();
    /* renamed from: b */
    public static final Method f21919b = kiw.m13819a();

    kiw() {
    }

    /* renamed from: a */
    private static Method m13819a() {
        try {
            return Throwable.class.getMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Throwable th) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo10070a(Closeable closeable, Throwable th, Throwable th2) {
        if (th != th2) {
            try {
                f21919b.invoke(th, new Object[]{th2});
            } catch (Throwable th3) {
                kiv.f21917a.mo10070a(closeable, th, th2);
            }
        }
    }
}
