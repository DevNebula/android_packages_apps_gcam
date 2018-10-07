package p000;

import android.graphics.Paint;

/* compiled from: PG */
/* renamed from: gwz */
public abstract class gwz implements gzh {
    /* renamed from: a */
    public static final String f19776a = bli.m887a("FocusRingRenderer");
    /* renamed from: b */
    public final gzk f19777b;
    /* renamed from: c */
    public final Paint f19778c;
    /* renamed from: d */
    public final gzg f19779d;
    /* renamed from: e */
    public final gzn f19780e;
    /* renamed from: f */
    public final gzn f19781f;
    /* renamed from: g */
    public final float f19782g;
    /* renamed from: h */
    public final float f19783h;
    /* renamed from: i */
    public int f19784i;
    /* renamed from: j */
    public int f19785j;
    /* renamed from: k */
    public long f19786k = 0;
    /* renamed from: l */
    public long f19787l = 0;
    /* renamed from: m */
    public long f19788m = 0;
    /* renamed from: n */
    public int f19789n = C0252go.f5888bh;

    gwz(gzk gzk, Paint paint, float f) {
        this.f19777b = gzk;
        this.f19778c = paint;
        this.f19782g = f;
        this.f19783h = 80.0f;
        this.f19780e = gzo.f6233a;
        this.f19781f = gzo.f6234b;
        this.f19779d = new gzg();
    }

    /* renamed from: a */
    public final boolean mo7587a() {
        return this.f19789n != C0252go.f5888bh;
    }

    /* renamed from: b */
    public final boolean mo13485b() {
        return this.f19789n == C0252go.f5891bk || this.f19789n == C0252go.f5892bl;
    }

    /* renamed from: a */
    public final void mo13484a(long j, float f, float f2) {
        if (this.f19789n != C0252go.f5888bh) {
            bli.m888a(f19776a, "start() called while the ring was still focusing.");
        }
        this.f19779d.mo7585b();
        gzg gzg = this.f19779d;
        gzg.f6220b = f;
        gzg.f6219a = f2;
        this.f19786k = j;
        this.f19789n = C0252go.f5889bi;
        this.f19777b.invalidate();
    }

    /* renamed from: a */
    public final void mo13483a(long j) {
        if (this.f19779d.mo7584a()) {
            this.f19779d.mo7585b();
        }
        this.f19789n = C0252go.f5892bl;
        long j2 = this.f19786k;
        float f = this.f19782g;
        if (((float) j2) + f > ((float) j)) {
            j -= (long) (gzo.m3009a(this.f19780e, this.f19781f, ((float) (j - j2)) / f) * 64.0f);
        }
        this.f19788m = j;
    }
}
