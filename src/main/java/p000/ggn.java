package p000;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: ggn */
public final class ggn extends ggx {
    /* renamed from: a */
    public static final String f24354a = bli.m887a("TaskCompMImg2Jpg");
    /* renamed from: b */
    private final ird f24355b;

    public ggn(gfw gfw, Executor executor, gfv gfv, get get, ird ird) {
        super(gfw, executor, gfv, C0252go.f5822aU, get);
        this.f24355b = ird;
    }

    public final void run() {
        this.f24355b.mo8856a(f24354a);
        gfw gfw = (gfw) jri.m13404b(this.f5405g);
        ((grg) jri.m13404b(this.f5406h.mo7077h())).mo7376b();
        if (gfw.f5387b.mo13741c() != 35) {
            this.f5401c.mo7116a(gfw.f5387b, this.f5402d);
            throw new IllegalArgumentException("Unsupported input image format for TaskCompressMarkedImageToJpeg");
        }
        ggt ggt = new ggt(this.f5405g.f5388c, gfw.f5387b.mo13745g(), gfw.f5387b.mo13742d());
        ggt ggt2 = new ggt(this.f5405g.f5388c, gfw.f5387b.mo13745g(), gfw.f5387b.mo13742d());
        byte[] bArr;
        try {
            int i;
            int i2;
            int i3;
            int i4;
            mo7122a(this.f5403e, ggt2, C0252go.f5825aX);
            iwz iwz = gfw.f5387b;
            List e = iwz.mo13743e();
            ByteBuffer a = ((ixa) e.get(0)).mo9144a();
            ByteBuffer a2 = ((ixa) e.get(1)).mo9144a();
            ByteBuffer a3 = ((ixa) e.get(2)).mo9144a();
            bArr = new byte[(a3.capacity() + (a.capacity() + a2.capacity()))];
            int g = iwz.mo13745g();
            int d = iwz.mo13742d();
            List e2 = iwz.mo13743e();
            ByteBuffer a4 = ((ixa) e2.get(0)).mo9144a();
            ByteBuffer a5 = ((ixa) e2.get(1)).mo9144a();
            ByteBuffer a6 = ((ixa) e2.get(2)).mo9144a();
            int b = ((ixa) e2.get(0)).mo9145b();
            int c = ((ixa) e2.get(0)).mo9146c();
            int b2 = ((ixa) e2.get(1)).mo9145b();
            int c2 = ((ixa) e2.get(1)).mo9146c();
            int i5 = g * d;
            for (i = 0; i < g; i++) {
                for (i2 = 0; i2 < d; i2++) {
                    bArr[(i2 * g) + i] = a4.get((i * b) + (i2 * c));
                }
            }
            i = 0;
            while (true) {
                i2 = i;
                if (i2 >= d / 2) {
                    break;
                }
                for (i = 0; i < g / 2; i++) {
                    i3 = ((g * i2) + i5) + (i + i);
                    b = (i2 * c2) + (i * b2);
                    bArr[i3] = a6.get(b);
                    bArr[i3 + 1] = a5.get(b);
                }
                i = i2 + 1;
            }
            r7 = new int[3];
            i = ggt.f5410c;
            r7[0] = i;
            r7[1] = i;
            r7[2] = i;
            i2 = gfw.f5387b.mo13745g();
            d = gfw.f5387b.mo13742d();
            i3 = i2 * d;
            int i6 = 0;
            while (true) {
                i = i6;
                if (i >= 20) {
                    break;
                }
                for (i6 = 0; i6 < d / 2; i6++) {
                    i4 = ((i + i) + i3) + (i6 * i2);
                    bArr[i4] = (byte) -1;
                    bArr[i4 + 1] = (byte) -1;
                }
                i6 = i + 1;
            }
            for (i6 = (i2 - 40) / 2; i6 < i2 / 2; i6++) {
                for (i = 0; i < d / 2; i++) {
                    i4 = ((i6 + i6) + i3) + (i * i2);
                    bArr[i4] = (byte) -1;
                    bArr[i4 + 1] = (byte) -1;
                }
            }
            for (i6 = 0; i6 < i2 / 2; i6++) {
                for (i = 0; i < 20; i++) {
                    i4 = ((i6 + i6) + i3) + (i * i2);
                    bArr[i4] = (byte) -1;
                    bArr[i4 + 1] = (byte) -1;
                }
            }
            for (i6 = 0; i6 < i2 / 2; i6++) {
                for (i = (d - 40) / 2; i < d / 2; i++) {
                    i4 = ((i6 + i6) + i3) + (i * i2);
                    bArr[i4] = (byte) -1;
                    bArr[i4 + 1] = (byte) -1;
                }
            }
            this.f5401c.mo7117a((ggr) this, new ggo(this, C0252go.f5822aU, bArr, ggt, r7, ggt2, this.f5405g.f5389d));
            this.f24355b.mo8857b();
        } finally {
            gfv gfv = this.f5401c;
            gfw = gfw.f5387b;
            bArr = this.f5402d;
            gfv.mo7116a((iwz) gfw, (Executor) bArr);
        }
    }
}
