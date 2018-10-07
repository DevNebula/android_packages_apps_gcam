package p000;

import android.graphics.Bitmap;

/* compiled from: PG */
/* renamed from: alv */
public final class alv implements agi, agn {
    /* renamed from: a */
    private final Bitmap f10394a;
    /* renamed from: b */
    private final agw f10395b;

    public alv(Bitmap bitmap, agw agw) {
        this.f10394a = (Bitmap) aqe.m610a((Object) bitmap, "Bitmap must not be null");
        this.f10395b = (agw) aqe.m610a((Object) agw, "BitmapPool must not be null");
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo262b() {
        return this.f10394a;
    }

    /* renamed from: c */
    public final Class mo263c() {
        return Bitmap.class;
    }

    /* renamed from: d */
    public final int mo264d() {
        return arq.m672a(this.f10394a);
    }

    /* renamed from: a */
    public final void mo257a() {
        this.f10394a.prepareToDraw();
    }

    /* renamed from: a */
    public static alv m6679a(Bitmap bitmap, agw agw) {
        if (bitmap == null) {
            return null;
        }
        return new alv(bitmap, agw);
    }

    /* renamed from: e */
    public final void mo265e() {
        this.f10395b.mo284a(this.f10394a);
    }
}
