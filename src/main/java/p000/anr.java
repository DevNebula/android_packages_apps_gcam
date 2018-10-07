package p000;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: anr */
final class anr extends anq {
    private anr(Drawable drawable) {
        super(drawable);
    }

    /* renamed from: c */
    public final Class mo263c() {
        return this.f10604a.getClass();
    }

    /* renamed from: d */
    public final int mo264d() {
        return Math.max(1, (this.f10604a.getIntrinsicWidth() * this.f10604a.getIntrinsicHeight()) << 2);
    }

    /* renamed from: a */
    static agn m14926a(Drawable drawable) {
        return drawable != null ? new anr(drawable) : null;
    }

    /* renamed from: e */
    public final void mo265e() {
    }
}
