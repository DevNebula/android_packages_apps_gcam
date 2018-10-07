package p000;

import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: fqa */
final class fqa implements gfn {
    /* renamed from: a */
    private final gkr f18622a;
    /* renamed from: b */
    private final fbm f18623b;

    fqa(gkr gkr, fbm fbm) {
        this.f18622a = gkr;
        this.f18623b = fbm;
    }

    /* renamed from: a */
    public final void mo7114a(ggu ggu, ggs ggs) {
        if (ggu.f5411a == C0252go.f5825aX) {
            Options options = new Options();
            options.inSampleSize = 4;
            byte[] bArr = ggs.f5407a;
            this.f18622a.mo13363a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options), isx.m4216a(isx.m4219a(ggs.f5407a)).f7692e);
            this.f18623b.mo6730a(ggs.f5407a);
        }
    }

    /* renamed from: a */
    public final void mo7115a(ggu ggu, ggv ggv) {
    }

    /* renamed from: a */
    public final void mo7113a(ggu ggu, Uri uri) {
    }

    /* renamed from: a */
    public final void mo7112a(ggu ggu) {
    }
}
