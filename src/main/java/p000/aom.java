package p000;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* renamed from: aom */
public final class aom implements aoo {
    /* renamed from: a */
    private final agw f10629a;
    /* renamed from: b */
    private final aoo f10630b;
    /* renamed from: c */
    private final aoo f10631c;

    public aom(agw agw, aoo aoo, aoo aoo2) {
        this.f10629a = agw;
        this.f10630b = aoo;
        this.f10631c = aoo2;
    }

    /* renamed from: a */
    public final agn mo1636a(agn agn, adp adp) {
        Drawable drawable = (Drawable) agn.mo262b();
        if (drawable instanceof BitmapDrawable) {
            return this.f10630b.mo1636a(alv.m6679a(((BitmapDrawable) drawable).getBitmap(), this.f10629a), adp);
        }
        return drawable instanceof any ? this.f10631c.mo1636a(agn, adp) : null;
    }
}
