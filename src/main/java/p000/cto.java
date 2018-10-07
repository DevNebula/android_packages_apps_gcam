package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: cto */
public final class cto {
    /* renamed from: a */
    public float f2905a;
    /* renamed from: b */
    public float f2906b;
    /* renamed from: c */
    public float f2907c;
    /* renamed from: d */
    private final float f2908d;
    /* renamed from: e */
    private final float f2909e;
    /* renamed from: f */
    private final float f2910f = 1.0f;
    /* renamed from: g */
    private final float f2911g = (this.f2910f * 0.0f);
    /* renamed from: h */
    private final float f2912h;
    /* renamed from: i */
    private final float f2913i;

    public cto(float f, float f2, float f3) {
        this.f2908d = f;
        this.f2909e = 0.8f * f;
        this.f2912h = f2;
        this.f2913i = f3;
        this.f2907c = 0.0f;
    }

    /* renamed from: a */
    public final float mo5796a() {
        float f = this.f2910f;
        return f + ((this.f2911g - f) * this.f2907c);
    }

    /* renamed from: b */
    public final float mo5797b() {
        float f = this.f2908d;
        return f + ((this.f2909e - f) * this.f2907c);
    }

    /* renamed from: c */
    public final PointF mo5798c() {
        return new PointF(this.f2912h + this.f2905a, this.f2913i + this.f2906b);
    }
}
