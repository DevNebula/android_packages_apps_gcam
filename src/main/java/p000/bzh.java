package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.camera.jni.yuv.YuvUtilNative;
import com.google.googlex.gcam.BaseFrameCallback;

/* compiled from: PG */
/* renamed from: bzh */
final class bzh extends BaseFrameCallback {
    /* renamed from: a */
    private final /* synthetic */ bzx f12043a;
    /* renamed from: b */
    private final /* synthetic */ bze f12044b;

    bzh(bze bze, bzx bzx) {
        this.f12044b = bze;
        this.f12043a = bzx;
    }

    public final void Run(int i, int i2, long j) {
        boolean z;
        String str = bze.f1762a;
        Object[] objArr = new Object[3];
        Object valueOf = Integer.valueOf(i2);
        objArr[0] = valueOf;
        Object valueOf2 = Long.valueOf(j);
        objArr[1] = valueOf2;
        objArr[2] = Integer.valueOf(i);
        bli.m888a(str, String.format(null, "Base frame selected as %d (timestamp %d), shotId = %d", objArr));
        if (this.f12044b.f1780s == C0252go.f5954z) {
            z = true;
        } else {
            z = false;
        }
        jri.m13405b(z);
        if (i2 < this.f12044b.f1765d.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13398a(z, "Base frame index %s >= payload timestamps size %s", i2, this.f12044b.f1765d.size());
        if (i2 < this.f12044b.f1764c.size()) {
            z = true;
        } else {
            z = false;
        }
        jri.m13398a(z, "Base frame index %s >= payload metadata size %s", i2, this.f12044b.f1764c.size());
        if (((Long) this.f12044b.f1765d.get(i2)).longValue() == j) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Base frame timestamps don't match");
        if (this.f12043a.mo2234a().mo9709b()) {
            bzy bzy = (bzy) this.f12043a.mo2234a().mo9706a();
            Object obj = (iwp) this.f12044b.f1764c.get(i2);
            ccy ccy = bzy.f1791a;
            kbg kbg = bzy.f1792b;
            fwa fwa = bzy.f1793c;
            int i3 = bzy.f1794d;
            knk knk = bzy.f1795e;
            knk knk2 = bzy.f1796f;
            knk knk3 = bzy.f1797g;
            if (kbg.mo9709b()) {
                eyh eyh = (eyh) kbg.mo9706a();
                kbg a = ((etc) eyh.f4584g.f4575a.mo9706a()).mo6576a(j);
                if (a.mo9709b()) {
                    eym eym = eyh.f4584g.f4576b;
                    eyl eyl = new eyl(eym.f4587b, eym.f4586a, eyh.f4581d, eyh.f4582e, eyh.f4578a);
                    eyh.f4581d.mo15641a((iwz) a.mo9706a());
                    eyh.f4579b.mo15644b(kny.m18475a(eyh.f4578a, eyi.f18018a, kpq.f8776a));
                } else {
                    eyh.f4579b.mo15641a(kau.f21835a);
                }
            }
            etj etj = ccy.f12194f;
            if (etj.f4451a.mo9709b()) {
                kbg = ((etc) etj.f4451a.mo9706a()).mo6576a(j);
            } else {
                kbg = kau.f21835a;
            }
            if (kbg.mo9709b()) {
                Bitmap a2 = YuvUtilNative.m1379a((iwz) kbg.mo9706a());
                ((iwz) kbg.mo9706a()).close();
                if (a2 != null) {
                    fwa.f4984d.mo13290a(a2, i3);
                }
            }
            knk.mo15641a(valueOf);
            knk2.mo15641a(valueOf2);
            knk3.mo15641a(obj);
        }
    }
}
