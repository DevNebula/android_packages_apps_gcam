package p000;

import android.annotation.TargetApi;
import android.graphics.PointF;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: ctu */
public final class ctu {
    /* renamed from: a */
    public final float f2918a;
    /* renamed from: b */
    public final PointF f2919b;
    /* renamed from: c */
    public final float f2920c;
    /* renamed from: d */
    private final float f2921d;
    /* renamed from: e */
    private final PointF f2922e;
    /* renamed from: f */
    private final float f2923f;
    /* renamed from: g */
    private final float f2924g;
    /* renamed from: h */
    private final float f2925h;

    public ctu(float f, float f2, PointF pointF, PointF pointF2, float f3, float f4, float f5, float f6) {
        this.f2918a = f;
        this.f2921d = f2;
        this.f2919b = (PointF) jri.m13404b((Object) pointF);
        this.f2922e = (PointF) jri.m13404b((Object) pointF2);
        this.f2920c = f3;
        this.f2923f = f4;
        this.f2924g = f5;
        this.f2925h = f6;
    }

    /* renamed from: a */
    public final float mo5810a(float f) {
        float f2 = this.f2924g;
        return f2 + ((this.f2925h - f2) * f);
    }

    /* renamed from: b */
    public final float mo5811b(float f) {
        float f2 = this.f2920c;
        return f2 + ((this.f2923f - f2) * f);
    }

    /* renamed from: c */
    public final float mo5812c(float f) {
        float f2 = this.f2918a;
        return f2 + ((this.f2921d - f2) * f);
    }

    /* renamed from: d */
    public final PointF mo5813d(float f) {
        PointF pointF = this.f2919b;
        float f2 = pointF.x;
        PointF pointF2 = this.f2922e;
        return new PointF(f2 + ((pointF2.x - pointF.x) * f), ((pointF2.y - pointF.y) * f) + pointF.y);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.valueOf(getClass().getName()).concat(" {"));
        float f = this.f2918a;
        float f2 = this.f2921d;
        StringBuilder stringBuilder2 = new StringBuilder(42);
        stringBuilder2.append(" scale: ");
        stringBuilder2.append(f);
        stringBuilder2.append(" -> ");
        stringBuilder2.append(f2);
        stringBuilder.append(stringBuilder2.toString());
        String valueOf = String.valueOf(this.f2919b);
        String valueOf2 = String.valueOf(this.f2922e);
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(valueOf).length() + 19) + String.valueOf(valueOf2).length());
        stringBuilder3.append(", translation: ");
        stringBuilder3.append(valueOf);
        stringBuilder3.append(" -> ");
        stringBuilder3.append(valueOf2);
        stringBuilder.append(stringBuilder3.toString());
        f = this.f2920c;
        f2 = this.f2923f;
        stringBuilder2 = new StringBuilder(44);
        stringBuilder2.append(", radius: ");
        stringBuilder2.append(f);
        stringBuilder2.append(" -> ");
        stringBuilder2.append(f2);
        stringBuilder.append(stringBuilder2.toString());
        f = this.f2924g;
        f2 = this.f2925h;
        stringBuilder2 = new StringBuilder(45);
        stringBuilder2.append(", bgAlpha: ");
        stringBuilder2.append(f);
        stringBuilder2.append(" -> ");
        stringBuilder2.append(f2);
        stringBuilder.append(stringBuilder2.toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
