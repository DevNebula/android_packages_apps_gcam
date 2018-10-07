package p000;

import android.graphics.Rect;
import android.media.Image;
import android.media.Image.Plane;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* renamed from: itv */
public final class itv implements iwe, iwz {
    /* renamed from: a */
    private final Object f24669a = new Object();
    /* renamed from: b */
    private final Image f24670b;
    /* renamed from: c */
    private final int f24671c;
    /* renamed from: d */
    private final int f24672d;
    /* renamed from: e */
    private final int f24673e;
    /* renamed from: f */
    private final long f24674f;
    /* renamed from: g */
    private volatile ken f24675g;
    /* renamed from: h */
    private Rect f24676h;

    public itv(Image image) {
        this.f24670b = image;
        this.f24671c = this.f24670b.getFormat();
        this.f24672d = this.f24670b.getWidth();
        this.f24673e = this.f24670b.getHeight();
        this.f24674f = this.f24670b.getTimestamp();
    }

    public final void close() {
        synchronized (this.f24669a) {
            this.f24670b.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof iwz)) {
            return false;
        }
        iwz iwz = (iwz) obj;
        if (iwz.mo13741c() == this.f24671c && iwz.mo13745g() == this.f24672d && iwz.mo13742d() == this.f24673e && iwz.mo13744f() == this.f24674f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final iud mo9118a() {
        return new iud(this.f24670b);
    }

    /* renamed from: b */
    public final Rect mo13740b() {
        Rect rect;
        synchronized (this.f24669a) {
            try {
                this.f24676h = this.f24670b.getCropRect();
                rect = this.f24676h;
            } catch (IllegalStateException e) {
                rect = this.f24676h;
            }
        }
        return rect;
    }

    /* renamed from: c */
    public final int mo13741c() {
        return this.f24671c;
    }

    /* renamed from: d */
    public final int mo13742d() {
        return this.f24673e;
    }

    /* renamed from: e */
    public final List mo13743e() {
        return m16463h();
    }

    /* renamed from: f */
    public final long mo13744f() {
        return this.f24674f;
    }

    /* renamed from: g */
    public final int mo13745g() {
        return this.f24672d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f24671c), Integer.valueOf(this.f24672d), Integer.valueOf(this.f24673e), Long.valueOf(this.f24674f)});
    }

    /* renamed from: h */
    private final ken m16463h() {
        ken ken = this.f24675g;
        if (ken == null) {
            synchronized (this.f24669a) {
                ken = this.f24675g;
                if (ken == null) {
                    Plane[] planes = this.f24670b.getPlanes();
                    if (planes == null) {
                        ken = ken.m13719e();
                    } else {
                        keo keo = new keo();
                        for (Plane itw : planes) {
                            keo.mo15104c(new itw(itw));
                        }
                        ken = keo.mo15102a();
                    }
                    this.f24675g = ken;
                }
            }
        }
        return ken;
    }

    /* renamed from: a */
    public final void mo13739a(Rect rect) {
        synchronized (this.f24669a) {
            this.f24676h = rect;
            try {
                this.f24670b.setCropRect(rect);
            } catch (IllegalStateException e) {
            }
        }
    }

    public final String toString() {
        String b = ion.m4019b(this.f24671c);
        int i = this.f24672d;
        long j = this.f24674f;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 39);
        stringBuilder.append("Image-");
        stringBuilder.append(b);
        stringBuilder.append("w");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(j);
        return stringBuilder.toString();
    }
}
