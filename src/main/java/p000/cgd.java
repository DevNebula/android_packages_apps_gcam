package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: cgd */
final class cgd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ err f2129a;
    /* renamed from: b */
    private final /* synthetic */ hio f2130b;
    /* renamed from: c */
    private final /* synthetic */ int f2131c;
    /* renamed from: d */
    private final /* synthetic */ cgc f2132d;

    cgd(cgc cgc, err err, hio hio, int i) {
        this.f2132d = cgc;
        this.f2129a = err;
        this.f2130b = hio;
        this.f2131c = i;
    }

    public final void run() {
        err e;
        cre d = this.f2132d.f2128a.f23059G.mo7836d(0);
        if (d != cre.f2792c) {
            e = d.mo5692e();
        } else {
            e = null;
        }
        if (e == this.f2129a) {
            hio hio = this.f2130b;
            if (hio == null || !hio.f6606a.mo9709b()) {
                int i = this.f2131c;
                if (i == 0 || (this.f2132d.f2128a.f23189x && i == 1)) {
                    this.f2132d.f2128a.f23190y.mo7475b();
                    this.f2132d.f2128a.f23185t.mo7423b();
                    this.f2132d.f2128a.f23065M.mo5753m();
                    return;
                }
                return;
            }
            Bitmap bitmap = (Bitmap) this.f2130b.f6606a.mo9706a();
            String str = cfk.f23052a;
            String valueOf = String.valueOf(new iqp(bitmap.getWidth(), bitmap.getHeight()));
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 52);
            stringBuilder.append("updateCaptureIndicatorWithFirstFilmstripItem bitmap=");
            stringBuilder.append(valueOf);
            bli.m896d(str, stringBuilder.toString());
            this.f2132d.f2128a.f23190y.mo7471a(bitmap, 0);
            this.f2132d.f2128a.f23185t.mo7422a(new gss(bitmap, iqm.CLOCKWISE_0));
            this.f2132d.f2128a.f23065M.mo5738a(bitmap);
            return;
        }
        bli.m896d(cfk.f23052a, "first filmstrip item changed, cancel indicator update");
    }
}
