package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: jqv */
public final class jqv implements agw {
    /* renamed from: a */
    private final jqo f21661a;

    public jqv(jqo jqo) {
        this.f21661a = jqo;
    }

    /* renamed from: a */
    public final void mo281a() {
    }

    /* renamed from: b */
    private static void m13365b(Bitmap bitmap) {
        if (bitmap.hasAlpha() && !bitmap.isPremultiplied()) {
            bitmap.setPremultiplied(true);
        }
    }

    /* renamed from: a */
    public final Bitmap mo280a(int i, int i2, Config config) {
        Bitmap bitmap = (Bitmap) this.f21661a.mo9529a("Pool adapter (get)", i, i2, config).mo9673d();
        jqv.m13365b(bitmap);
        return bitmap;
    }

    /* renamed from: b */
    public final Bitmap mo285b(int i, int i2, Config config) {
        Bitmap bitmap = (Bitmap) this.f21661a.mo9529a("Pool adapter (getDirty)", i, i2, config).mo9673d();
        jqv.m13365b(bitmap);
        return bitmap;
    }

    /* renamed from: a */
    public final void mo284a(Bitmap bitmap) {
        this.f21661a.mo9530a("Pool adapter (put)", bitmap).mo15063a();
    }

    /* renamed from: a */
    public final void mo282a(float f) {
    }

    /* renamed from: a */
    public final void mo283a(int i) {
    }
}
