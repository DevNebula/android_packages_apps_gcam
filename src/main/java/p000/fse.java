package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: fse */
final class fse implements gfn {
    /* renamed from: a */
    private final /* synthetic */ kpw f18753a;
    /* renamed from: b */
    private final /* synthetic */ iqm f18754b;
    /* renamed from: c */
    private final /* synthetic */ kpw f18755c;

    fse(kpw kpw, iqm iqm, kpw kpw2) {
        this.f18753a = kpw;
        this.f18754b = iqm;
        this.f18755c = kpw2;
    }

    /* renamed from: a */
    public final void mo7114a(ggu ggu, ggs ggs) {
        throw new IllegalStateException("No compressed result expected for thumbnail generation");
    }

    /* renamed from: a */
    public final void mo7115a(ggu ggu, ggv ggv) {
        int[] iArr = ggv.f5414a;
        ggt ggt = ggu.f5413c;
        Object createBitmap = Bitmap.createBitmap(iArr, ggt.f5410c, ggt.f5409b, Config.ARGB_8888);
        if (ggu.f5411a == C0252go.f5823aV) {
            this.f18753a.mo15641a(createBitmap);
        } else if (ggu.f5411a == C0252go.f5824aW) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) this.f18754b.f7692e);
            this.f18755c.mo15641a(Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true));
        }
    }

    /* renamed from: a */
    public final void mo7113a(ggu ggu, Uri uri) {
        throw new IllegalStateException("No URI expected for thumbnail generation");
    }

    /* renamed from: a */
    public final void mo7112a(ggu ggu) {
    }
}
