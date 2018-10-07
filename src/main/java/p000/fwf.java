package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: fwf */
final class fwf implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f4991a;
    /* renamed from: b */
    private final /* synthetic */ int f4992b;
    /* renamed from: c */
    private final /* synthetic */ fwd f4993c;

    fwf(fwd fwd, Bitmap bitmap, int i) {
        this.f4993c = fwd;
        this.f4991a = bitmap;
        this.f4992b = i;
    }

    public final void run() {
        this.f4993c.f24316b.mo13363a(this.f4991a, this.f4992b);
    }
}
