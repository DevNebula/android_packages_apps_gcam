package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Matrix;
import android.net.Uri;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: frd */
final class frd implements gfn {
    /* renamed from: a */
    private final gkr f18695a;
    /* renamed from: b */
    private final iqm f18696b;
    /* renamed from: c */
    private final fbm f18697c;

    frd(gkr gkr, iqm iqm, fbm fbm) {
        this.f18695a = gkr;
        this.f18696b = iqm;
        this.f18697c = fbm;
    }

    /* renamed from: a */
    public final void mo7114a(ggu ggu, ggs ggs) {
        if (ggu.f5411a == C0252go.f5825aX) {
            this.f18695a.mo13374b(95);
            this.f18697c.mo6730a(ggs.f5407a);
        }
    }

    /* renamed from: a */
    public final void mo7115a(ggu ggu, ggv ggv) {
        int[] iArr;
        switch (ggu.f5411a - 1) {
            case 0:
                iArr = ggv.f5414a;
                ggt ggt = ggu.f5413c;
                this.f18695a.mo13363a(Bitmap.createBitmap(iArr, ggt.f5410c, ggt.f5409b, Config.ARGB_8888), this.f18696b.f7692e);
                return;
            case 1:
                iArr = ggv.f5414a;
                ggt ggt2 = ggu.f5413c;
                Bitmap createBitmap = Bitmap.createBitmap(iArr, ggt2.f5410c, ggt2.f5409b, Config.ARGB_8888);
                Matrix matrix = new Matrix();
                matrix.postRotate((float) this.f18696b.f7692e);
                this.f18695a.mo13362a(Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, true));
                this.f18695a.mo13370a(hci.m11979a((int) R.string.session_saving_image, new Object[0]));
                this.f18695a.mo13374b(25);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final void mo7113a(ggu ggu, Uri uri) {
    }

    /* renamed from: a */
    public final void mo7112a(ggu ggu) {
        switch (ggu.f5411a - 1) {
            case 0:
                this.f18695a.mo13374b(0);
                return;
            default:
                return;
        }
    }
}
