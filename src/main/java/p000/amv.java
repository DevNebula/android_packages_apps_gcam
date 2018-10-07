package p000;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* renamed from: amv */
public final class amv implements agi, agn {
    /* renamed from: a */
    private final Resources f10401a;
    /* renamed from: b */
    private final agn f10402b;

    private amv(Resources resources, agn agn) {
        this.f10401a = (Resources) aqe.m610a((Object) resources, "Argument must not be null");
        this.f10402b = (agn) aqe.m610a((Object) agn, "Argument must not be null");
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo262b() {
        return new BitmapDrawable(this.f10401a, (Bitmap) this.f10402b.mo262b());
    }

    /* renamed from: c */
    public final Class mo263c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public final int mo264d() {
        return this.f10402b.sizeOf();
    }

    /* renamed from: a */
    public final void mo257a() {
        agn agn = this.f10402b;
        if (agn instanceof agi) {
            ((agi) agn).mo257a();
        }
    }

    /* renamed from: a */
    public static agn m6719a(Resources resources, agn agn) {
        if (agn == null) {
            return null;
        }
        return new amv(resources, agn);
    }

    /* renamed from: e */
    public final void mo265e() {
        this.f10402b.mo265e();
    }
}
