package p000;

import android.location.Location;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: iel */
public final class iel {
    /* renamed from: a */
    public static void m3776a(kpk kpk, iqb iqb, Executor executor) {
        kow.m13878a(kpk, new ijt(iqb), executor);
    }

    /* renamed from: a */
    public static Executor m3771a() {
        return new ikf(new ikd());
    }

    /* renamed from: a */
    public static Location m3769a(huq huq) {
        try {
            return ieo.m3782a(huq).f26713m.mo8419a();
        } catch (Exception e) {
            return null;
        }
    }

    /* renamed from: a */
    public static kpk m3775a(kpk kpk, kpk kpk2, iqg iqg) {
        return iel.m3773a(kpk, kpk2, new ijw(iqg));
    }

    /* renamed from: a */
    public static kpk m3773a(kpk kpk, kpk kpk2, iju iju) {
        Iterable arrayList = new ArrayList(2);
        arrayList.add(kpk);
        arrayList.add(kpk2);
        return kny.m18476a(kow.m13872a(arrayList), new ifc(iju), kpq.f8776a);
    }

    /* renamed from: a */
    public static kpk m3774a(kpk kpk, kpk kpk2, iju iju, Executor executor) {
        Iterable arrayList = new ArrayList(2);
        arrayList.add(kpk);
        arrayList.add(kpk2);
        return kny.m18476a(kow.m13872a(arrayList), new ifd(iju), executor);
    }

    /* renamed from: a */
    public static ExecutorService m3772a(String str, int i) {
        return Executors.newFixedThreadPool(i, iel.m3779d(str, 0));
    }

    /* renamed from: b */
    public static ExecutorService m3777b(String str, int i) {
        return Executors.newFixedThreadPool(2, iel.m3779d(str, i));
    }

    /* renamed from: c */
    public static ThreadFactory m3778c(String str, int i) {
        return new ikl(i, str);
    }

    /* renamed from: d */
    public static ThreadFactory m3779d(String str, int i) {
        boolean z;
        if (str.length() <= 13) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        return new ikk(i, str);
    }

    /* renamed from: e */
    public static ScheduledExecutorService m3780e(String str, int i) {
        return Executors.newScheduledThreadPool(i, iel.m3779d(str, 0));
    }

    /* renamed from: a */
    public static Object m3770a(kpk kpk) {
        Object obj = null;
        if (kpk.isDone() && !kpk.isCancelled()) {
            Object obj2 = null;
            while (true) {
                try {
                    obj = kpk.get();
                    if (obj2 != null) {
                        Thread.currentThread().interrupt();
                    }
                } catch (InterruptedException e) {
                    obj2 = 1;
                } catch (ExecutionException e2) {
                    if (obj2 != null) {
                        Thread.currentThread().interrupt();
                    }
                } catch (Throwable th) {
                    if (obj2 != null) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
        return obj;
    }
}
