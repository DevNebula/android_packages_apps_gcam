package p000;

import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;

/* compiled from: PG */
/* renamed from: dy */
final class C0671dy extends C0203ea {
    /* renamed from: a */
    public int[] f16958a;
    /* renamed from: b */
    public int f16959b = 0;
    /* renamed from: c */
    public float f16960c = 0.0f;
    /* renamed from: d */
    public int f16961d = 0;
    /* renamed from: e */
    public float f16962e = 1.0f;
    /* renamed from: f */
    public int f16963f = 0;
    /* renamed from: g */
    public float f16964g = 1.0f;
    /* renamed from: h */
    public float f16965h = 0.0f;
    /* renamed from: i */
    public float f16966i = 1.0f;
    /* renamed from: j */
    public float f16967j = 0.0f;
    /* renamed from: k */
    public Cap f16968k = Cap.BUTT;
    /* renamed from: l */
    public Join f16969l = Join.MITER;
    /* renamed from: m */
    public float f16970m = 4.0f;

    public C0671dy(C0671dy c0671dy) {
        super(c0671dy);
        this.f16958a = c0671dy.f16958a;
        this.f16959b = c0671dy.f16959b;
        this.f16960c = c0671dy.f16960c;
        this.f16962e = c0671dy.f16962e;
        this.f16961d = c0671dy.f16961d;
        this.f16963f = c0671dy.f16963f;
        this.f16964g = c0671dy.f16964g;
        this.f16965h = c0671dy.f16965h;
        this.f16966i = c0671dy.f16966i;
        this.f16967j = c0671dy.f16967j;
        this.f16968k = c0671dy.f16968k;
        this.f16969l = c0671dy.f16969l;
        this.f16970m = c0671dy.f16970m;
    }

    final float getFillAlpha() {
        return this.f16964g;
    }

    final int getFillColor() {
        return this.f16961d;
    }

    final float getStrokeAlpha() {
        return this.f16962e;
    }

    final int getStrokeColor() {
        return this.f16959b;
    }

    final float getStrokeWidth() {
        return this.f16960c;
    }

    final float getTrimPathEnd() {
        return this.f16966i;
    }

    final float getTrimPathOffset() {
        return this.f16967j;
    }

    final float getTrimPathStart() {
        return this.f16965h;
    }

    final void setFillAlpha(float f) {
        this.f16964g = f;
    }

    final void setFillColor(int i) {
        this.f16961d = i;
    }

    final void setStrokeAlpha(float f) {
        this.f16962e = f;
    }

    final void setStrokeColor(int i) {
        this.f16959b = i;
    }

    final void setStrokeWidth(float f) {
        this.f16960c = f;
    }

    final void setTrimPathEnd(float f) {
        this.f16966i = f;
    }

    final void setTrimPathOffset(float f) {
        this.f16967j = f;
    }

    final void setTrimPathStart(float f) {
        this.f16965h = f;
    }
}
