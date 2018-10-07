package p000;

import android.graphics.Bitmap.Config;

/* compiled from: PG */
/* renamed from: ahk */
final class ahk implements ahh {
    /* renamed from: a */
    public int f10310a;
    /* renamed from: b */
    public Config f10311b;
    /* renamed from: c */
    private final ahl f10312c;

    public ahk(ahl ahl) {
        this.f10312c = ahl;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ahk)) {
            return false;
        }
        ahk ahk = (ahk) obj;
        if (this.f10310a == ahk.f10310a && arq.m683b(this.f10311b, ahk.f10311b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = this.f10310a * 31;
        Config config = this.f10311b;
        if (config != null) {
            hashCode = config.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + i;
    }

    /* renamed from: a */
    public final void mo298a() {
        this.f10312c.mo278a(this);
    }

    public final String toString() {
        return ahi.m6518a(this.f10310a, this.f10311b);
    }
}
