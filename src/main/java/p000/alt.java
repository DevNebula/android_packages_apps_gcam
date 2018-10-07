package p000;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: PG */
/* renamed from: alt */
public final class alt extends anq implements agi {
    /* renamed from: b */
    private final agw f22483b;

    public alt(BitmapDrawable bitmapDrawable, agw agw) {
        super(bitmapDrawable);
        this.f22483b = agw;
    }

    /* renamed from: c */
    public final Class mo263c() {
        return BitmapDrawable.class;
    }

    /* renamed from: d */
    public final int mo264d() {
        return arq.m672a(((BitmapDrawable) this.f10604a).getBitmap());
    }

    /* renamed from: a */
    public final void mo257a() {
        ((BitmapDrawable) this.f10604a).getBitmap().prepareToDraw();
    }

    /* renamed from: e */
    public final void mo265e() {
        this.f22483b.mo284a(((BitmapDrawable) this.f10604a).getBitmap());
    }
}
