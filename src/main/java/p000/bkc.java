package p000;

import android.hardware.camera2.CaptureRequest;
import android.util.Range;

/* compiled from: PG */
/* renamed from: bkc */
final class bkc implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ kpw f1259a;
    /* renamed from: b */
    public final /* synthetic */ kpw f1260b;
    /* renamed from: c */
    public final /* synthetic */ kpw f1261c;
    /* renamed from: d */
    public final /* synthetic */ bjz f1262d;
    /* renamed from: e */
    private final /* synthetic */ bhj f1263e;

    bkc(bjz bjz, bhj bhj, kpw kpw, kpw kpw2, kpw kpw3) {
        this.f1262d = bjz;
        this.f1263e = bhj;
        this.f1259a = kpw;
        this.f1260b = kpw2;
        this.f1261c = kpw3;
    }

    public final void run() {
        try {
            Object obj;
            int i;
            bhr bhr = this.f1262d.f22793c;
            iwn a = this.f1263e.mo12377a(4);
            bhr.mo1955a(a);
            Range b = bhr.f1188b.mo1945b();
            a.mo9134a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, b);
            String str = bhr.f1187a;
            String valueOf = String.valueOf(b);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
            stringBuilder.append("CONTROL_AE_TARGET_FPS_RANGE=");
            stringBuilder.append(valueOf);
            bli.m894c(str, stringBuilder.toString());
            if (!bhr.f1190d.mo8610b()) {
                obj = null;
            } else if (((Boolean) bhr.f1189c.mo13673b()).booleanValue()) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                i = 1;
            } else {
                i = 3;
            }
            a.mo9134a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
            String str2 = bhr.f1187a;
            StringBuilder stringBuilder2 = new StringBuilder(27);
            stringBuilder2.append("CONTROL_AF_MODE=");
            stringBuilder2.append(i);
            bli.m896d(str2, stringBuilder2.toString());
            a.mo9135a(this.f1262d.f22796f.mo13753g());
            a.mo9134a(CaptureRequest.JPEG_QUALITY, this.f1262d.f22792b);
            a.mo9134a(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf(((iqm) this.f1262d.f22798h.mo13673b()).f7692e));
            this.f1263e.mo12379a(fiv.NON_REPEATING, a, new bhw(), new bkd(this));
        } catch (Throwable e) {
            this.f1260b.mo15642a(e);
        }
    }
}
