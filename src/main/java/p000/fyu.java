package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: fyu */
public final class fyu {
    /* renamed from: a */
    public static final String f5058a = bli.m887a("CamTimeWaiter");

    /* renamed from: a */
    public static boolean m2474a(long j, fim fim, fip fip) {
        Object fyv = new fyv(j);
        new fio(fim).mo6813a(fds.m10428c(fyv));
        fip.mo6816a(Arrays.asList(new fim[]{r1.mo6807a()}), fiv.REPEATING);
        try {
            return ((Boolean) fyv.f18912a.get()).booleanValue();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
