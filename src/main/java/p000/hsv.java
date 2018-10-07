package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: hsv */
final class hsv implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ Bitmap f6962a;
    /* renamed from: b */
    private final /* synthetic */ hsu f6963b;

    hsv(hsu hsu, Bitmap bitmap) {
        this.f6963b = hsu;
        this.f6962a = bitmap;
    }

    public final void run() {
        this.f6963b.f6956a.mo8103a(this.f6962a);
    }
}
