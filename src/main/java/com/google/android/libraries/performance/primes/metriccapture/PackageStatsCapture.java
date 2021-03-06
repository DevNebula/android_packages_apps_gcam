package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p000.jcc;
import p000.jhx;
import p000.jhy;
import p000.jhz;
import p000.jqk;

/* compiled from: PG */
public final class PackageStatsCapture {
    public static final PackageStatsInvocation[] GETTER_INVOCATIONS;

    /* compiled from: PG */
    final class PackageStatsCallback extends Stub {
        /* renamed from: a */
        public final Semaphore f2656a = new Semaphore(1);
        /* renamed from: b */
        public volatile PackageStats f2657b;

        PackageStatsCallback() {
        }

        public final void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (z) {
                String valueOf = String.valueOf(packageStats);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
                stringBuilder.append("Success getting PackageStats: ");
                stringBuilder.append(valueOf);
                jcc.m4459a(3, "PackageStatsCapture", stringBuilder.toString(), new Object[0]);
                this.f2657b = packageStats;
            } else {
                jcc.m4459a(5, "PackageStatsCapture", "Failure getting PackageStats", new Object[0]);
            }
            this.f2656a.release();
        }
    }

    /* compiled from: PG */
    public abstract class PackageStatsInvocation {
        /* renamed from: a */
        private final String f2658a;
        /* renamed from: b */
        private final Class[] f2659b;

        public PackageStatsInvocation(String str, Class[] clsArr) {
            this.f2658a = str;
            this.f2659b = clsArr;
        }

        /* renamed from: a */
        public abstract Object[] mo2816a(String str, int i, IPackageStatsObserver iPackageStatsObserver);

        boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            Object e;
            StringBuilder stringBuilder;
            try {
                packageManager.getClass().getMethod(this.f2658a, this.f2659b).invoke(packageManager, mo2816a(str, i, iPackageStatsObserver));
                return true;
            } catch (Throwable e2) {
                jcc.m4463a("PackageStatsCapture", "PackageStats getter not found", e2, new Object[0]);
                return false;
            } catch (Exception e3) {
                e = e3;
                stringBuilder = new StringBuilder();
                stringBuilder.append(e.getClass().getSimpleName());
                stringBuilder.append(" for ");
                stringBuilder.append(this.f2658a);
                stringBuilder.append('(');
                stringBuilder.append(Arrays.asList(this.f2659b));
                stringBuilder.append(") invocation");
                jcc.m4459a(4, "PackageStatsCapture", stringBuilder.toString(), new Object[0]);
                return false;
            } catch (Error e4) {
                e = e4;
                stringBuilder = new StringBuilder();
                stringBuilder.append(e.getClass().getSimpleName());
                stringBuilder.append(" for ");
                stringBuilder.append(this.f2658a);
                stringBuilder.append('(');
                stringBuilder.append(Arrays.asList(this.f2659b));
                stringBuilder.append(") invocation");
                jcc.m4459a(4, "PackageStatsCapture", stringBuilder.toString(), new Object[0]);
                return false;
            }
        }
    }

    static {
        r0 = new PackageStatsInvocation[3];
        r0[0] = new jhx("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class});
        r0[1] = new jhy("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class});
        r0[2] = new jhz("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class});
        GETTER_INVOCATIONS = r0;
    }

    private PackageStatsCapture() {
    }

    public static PackageStats getPackageStats(Context context) {
        jqk.m13344a();
        return jcc.m4452a(context);
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        int i = 0;
        if (m1383a()) {
            PackageStatsCallback packageStatsCallback = new PackageStatsCallback();
            try {
                packageStatsCallback.f2656a.acquire();
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int myUid = Process.myUid();
                int length = packageStatsInvocationArr.length;
                while (i < length) {
                    if (packageStatsInvocationArr[i].invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                        jcc.m4459a(4, "PackageStatsCapture", "Success invoking PackageStats capture.", new Object[0]);
                        if (packageStatsCallback.f2656a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                            return packageStatsCallback.f2657b;
                        }
                        jcc.m4459a(5, "PackageStatsCapture", "Timeout while waiting for PackageStats callback", new Object[0]);
                        return null;
                    }
                    i++;
                }
                jcc.m4459a(5, "PackageStatsCapture", "Couldn't capture PackageStats.", new Object[0]);
                return null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        jcc.m4459a(5, "PackageStatsCapture", "Callback implementation stripped by proguard.", new Object[0]);
        return null;
    }

    /* renamed from: a */
    private static boolean m1383a() {
        Throwable e;
        try {
            return Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", new Class[]{PackageStats.class, Boolean.TYPE}).getModifiers()) ^ 1;
        } catch (Exception e2) {
            e = e2;
            jcc.m4463a("PackageStatsCapture", "failure", e, new Object[0]);
            return false;
        } catch (Error e3) {
            e = e3;
            jcc.m4463a("PackageStatsCapture", "failure", e, new Object[0]);
            return false;
        }
    }
}
