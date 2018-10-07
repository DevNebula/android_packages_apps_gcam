package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: ddd */
final class ddd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f3203a;
    /* renamed from: b */
    private final /* synthetic */ ddc f3204b;

    ddd(ddc ddc, Bitmap bitmap) {
        this.f3204b = ddc;
        this.f3203a = bitmap;
    }

    public final void run() {
        this.f3204b.f13721a.f1623a.mo2154a(new dat(this.f3203a));
    }
}
