package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import java.util.Collections;

/* compiled from: PG */
/* renamed from: fej */
public final class fej implements fde {
    /* renamed from: a */
    private final iqz f18176a;
    /* renamed from: b */
    private final ird f18177b;

    fej(ird ird, ira ira) {
        this.f18177b = ird;
        this.f18176a = ira.mo8854a("Simultaneous3A");
    }

    /* renamed from: a */
    public final fdf mo6751a(fip fip, fdg fdg, fim fim) {
        Object fec = new fec(fip, fdg, new fio(fim), this.f18177b, this.f18176a);
        try {
            Object obj;
            iqz iqz = this.f18176a;
            String valueOf = String.valueOf(fdg);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 19);
            stringBuilder.append("Acquiring 3A Lock: ");
            stringBuilder.append(valueOf);
            iqz.mo8832b(stringBuilder.toString());
            fdh fdh = fdg.f4707b;
            int obj2;
            if (fdh == fdh.CONVERGED) {
                obj2 = 1;
            } else if (fdh != fdh.LOCKED) {
                obj2 = null;
            } else {
                obj2 = 1;
            }
            fdh fdh2 = fdg.f4706a;
            fdh fdh3 = fdh.CONVERGED;
            if (fdg.f4708c != fdh.CONVERGED) {
                Object obj3 = null;
            } else {
                int obj32 = 1;
            }
            if (!(obj2 == null && fdh2 != fdh3 && obj32 == null)) {
                fdx fdx;
                fdx fdx2;
                fdx a;
                fdx fbt;
                ird ird;
                long b;
                long j;
                long j2;
                fec.f18159b.mo8837e("waitForConvergence");
                fio fio = new fio(fec.f18162e);
                fio fio2 = new fio(fec.f18162e);
                if (fec.f18160c.f4707b == fdh.ANY) {
                    fdx = null;
                } else {
                    fdx = fec.mo13231b(fec.f18160c.f4707b, fio, fio2);
                }
                if (fec.f18160c.f4706a == fdh.ANY) {
                    fdx2 = null;
                } else {
                    fdx2 = fec.mo13230a(fec.f18160c.f4706a, fio, fio2);
                }
                if (fec.f18160c.f4708c != fdh.ANY) {
                    a = fec.m10438a(fio, fio2);
                } else {
                    a = null;
                }
                if (fec.f18160c.f4706a == fdh.CONVERGED) {
                    Key key = CaptureRequest.CONTROL_AE_LOCK;
                    Boolean valueOf2 = Boolean.valueOf(false);
                    fio.mo6809a(key, valueOf2);
                    fio2.mo6809a(CaptureRequest.CONTROL_AE_LOCK, valueOf2);
                    fbt = new fbt();
                    fio2.mo6813a(fds.m10428c(fbt));
                } else {
                    fbt = null;
                }
                fec.f18158a.mo8856a("SubmitIdle");
                fec.f18161d.mo6816a(Collections.singletonList(fio2.mo6807a()), fiv.REPEATING);
                fec.f18158a.mo8857b();
                if (fbt != null) {
                    fec.f18158a.mo8856a("UnlockAE");
                    fbt.mo13229a();
                    fec.f18158a.mo8857b();
                }
                fec.f18158a.mo8856a("SubmitTrigger");
                fec.f18161d.mo6816a(Collections.singletonList(fio.mo6807a()), fiv.NON_REPEATING);
                fec.f18158a.mo8857b();
                if (fdx != null) {
                    ird = fec.f18158a;
                    String valueOf3 = String.valueOf(fec.f18160c.f4707b);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf3).length() + 3);
                    stringBuilder2.append("AF-");
                    stringBuilder2.append(valueOf3);
                    ird.mo8856a(stringBuilder2.toString());
                    b = fdx.mo13229a().mo13731b();
                    fec.f18158a.mo8857b();
                    j = b;
                } else {
                    j = -1;
                }
                if (fdx2 != null) {
                    ird = fec.f18158a;
                    valueOf = String.valueOf(fec.f18160c.f4706a);
                    StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 3);
                    stringBuilder3.append("AE-");
                    stringBuilder3.append(valueOf);
                    ird.mo8856a(stringBuilder3.toString());
                    b = fdx2.mo13229a().mo13731b();
                    fec.f18158a.mo8857b();
                    j2 = b;
                } else {
                    j2 = -1;
                }
                if (a != null) {
                    ird = fec.f18158a;
                    valueOf = String.valueOf(fec.f18160c.f4708c);
                    StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(valueOf).length() + 4);
                    stringBuilder4.append("AWB-");
                    stringBuilder4.append(valueOf);
                    ird.mo8856a(stringBuilder4.toString());
                    b = a.mo13229a().mo13731b();
                    fec.f18158a.mo8857b();
                } else {
                    b = -1;
                }
                fec.f18163f = Math.max(Math.max(j2, j), b);
            }
            return fec;
        } catch (Throwable th) {
            fec.close();
        }
    }
}
