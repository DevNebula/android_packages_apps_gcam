package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: ikd */
public final class ikd extends ijx {
    /* renamed from: a */
    private static final ThreadLocal f21023a = new ike();

    public ikd() {
        super(new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public static void m12501a() {
        jri.m13406b(ikd.m12502b(), (Object) "Not main thread.");
    }

    /* renamed from: b */
    public static boolean m12502b() {
        Boolean bool = (Boolean) f21023a.get();
        return bool != null && bool.booleanValue();
    }

    /* renamed from: a */
    public final void mo13667a(Runnable runnable) {
        if (ikd.m12502b()) {
            runnable.run();
        } else {
            execute(runnable);
        }
    }
}
