package p000;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: cht */
public final class cht {
    /* renamed from: a */
    private static Object f2183a = new Object();
    /* renamed from: b */
    private static ExecutorService f2184b = null;

    /* renamed from: a */
    public static Executor m1154a() {
        return cht.m1155a(2);
    }

    /* renamed from: b */
    public static Executor m1156b() {
        return cht.m1155a(1);
    }

    /* renamed from: c */
    public static ExecutorService m1157c() {
        return Executors.newFixedThreadPool(2);
    }

    /* renamed from: a */
    private static ExecutorService m1155a(int i) {
        return new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new jzm(), new cks());
    }

    /* renamed from: a */
    public static ijx m1153a(HandlerThread handlerThread) {
        jri.m13404b((Object) handlerThread);
        return new ijx(new Handler(handlerThread.getLooper()));
    }

    /* renamed from: d */
    public static ExecutorService m1158d() {
        return cht.m1155a(2);
    }

    /* renamed from: e */
    public static ExecutorService m1159e() {
        synchronized (f2183a) {
            if (f2184b == null) {
                f2184b = Executors.newFixedThreadPool(2);
            }
        }
        return f2184b;
    }
}
