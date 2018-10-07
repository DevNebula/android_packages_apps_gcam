package p000;

import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
/* compiled from: PG */
/* renamed from: khx */
public class khx {
    /* renamed from: a */
    public static boolean m5002a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Object m4996a(Future future) {
        Object obj = null;
        while (true) {
            try {
                Object obj2 = future.get();
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
                return obj2;
            } catch (InterruptedException e) {
                obj = 1;
            } catch (Throwable th) {
                if (obj != null) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* renamed from: b */
    private static int m5004b(long[] jArr, long j, int i, int i2) {
        for (int i3 = i; i3 < i2; i3++) {
            if (jArr[i3] == j) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static kpm m5001a(ExecutorService executorService) {
        if (executorService instanceof kpm) {
            return (kpm) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            return new kpt((ScheduledExecutorService) executorService);
        }
        return new kps(executorService);
    }

    /* renamed from: a */
    public static kpm m5000a() {
        return new kpr();
    }

    /* renamed from: a */
    public static Executor m4999a(Executor executor, knk knk) {
        jri.m13404b((Object) executor);
        jri.m13404b((Object) knk);
        return executor == kpq.f8776a ? executor : new kpo(executor, knk);
    }

    /* renamed from: a */
    public static int m4994a(long j) {
        if (j > 2147483647L) {
            return LfuScheduler.MAX_PRIORITY;
        }
        if (j < -2147483648L) {
            return kvl.UNSET_ENUM_VALUE;
        }
        return (int) j;
    }

    /* renamed from: a */
    public static long[] m5003a(Collection collection) {
        if (collection instanceof kmk) {
            kmk kmk = (kmk) collection;
            return Arrays.copyOfRange(kmk.f8708a, kmk.f8709b, kmk.f8710c);
        }
        Object[] toArray = collection.toArray();
        int length = toArray.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = ((Number) jri.m13404b(toArray[i])).longValue();
        }
        return jArr;
    }

    /* renamed from: a */
    public static String m4997a(byte b) {
        jri.m13397a(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        return Integer.toString(b & Illuminant.kOther, 10);
    }

    /* renamed from: a */
    public static String m4998a(int i) {
        return Long.toString(((long) i) & 4294967295L, 10);
    }
}
