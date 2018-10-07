package com.google.googlex.gcam.androidutils.vecmath;

import android.graphics.Rect;

/* compiled from: PG */
public class Rect2f {
    public final Vector2f origin;
    public final Vector2f size;

    public Rect2f() {
        this.origin = new Vector2f();
        this.size = new Vector2f();
    }

    public Rect2f(float f, float f2) {
        this.origin = new Vector2f();
        this.size = new Vector2f(f, f2);
    }

    public Rect2f(float f, float f2, float f3, float f4) {
        this.origin = new Vector2f(f, f2);
        this.size = new Vector2f(f3, f4);
    }

    public Rect2f(Rect2f rect2f) {
        this.origin = new Vector2f(rect2f.origin());
        this.size = new Vector2f(rect2f.size());
    }

    public Rect2f(Vector2f vector2f, Vector2f vector2f2) {
        this.origin = new Vector2f(vector2f);
        this.size = new Vector2f(vector2f2);
    }

    public Vector4f asOriginAndSize() {
        Vector2f vector2f = this.origin;
        float f = vector2f.f2690x;
        float f2 = vector2f.f2691y;
        Vector2f vector2f2 = this.size;
        return new Vector4f(f, f2, vector2f2.f2690x, vector2f2.f2691y);
    }

    public static Rect2f flipUD(Rect2f rect2f, float f) {
        Rect2f standardized = rect2f.standardized();
        standardized.origin().f2691y = f - standardized.max().f2691y;
        return standardized.standardized();
    }

    public static Rect2f fromPoints(Vector2f vector2f, Vector2f vector2f2) {
        float f = vector2f.f2690x;
        float f2 = vector2f.f2691y;
        return new Rect2f(f, f2, vector2f2.f2690x - f, vector2f2.f2691y - f2).standardized();
    }

    public static Rect2f fromRect(Rect rect) {
        return new Rect2f((float) rect.left, (float) rect.top, (float) rect.width(), (float) rect.height());
    }

    public float height() {
        return this.size.f2691y;
    }

    public Vector2f max() {
        Vector2f vector2f = this.origin;
        return VecmathFunctions.max(vector2f, VecmathFunctions.add(vector2f, this.size));
    }

    public Vector2f min() {
        Vector2f vector2f = this.origin;
        return VecmathFunctions.min(vector2f, VecmathFunctions.add(vector2f, this.size));
    }

    public Vector2f origin() {
        return this.origin;
    }

    public Vector2f size() {
        return this.size;
    }

    public Rect2f standardized() {
        float f;
        float f2;
        Vector2f vector2f = this.size;
        float f3 = vector2f.f2690x;
        if (f3 > 0.0f) {
            f = this.origin.f2690x;
        } else {
            f = this.origin.f2690x + f3;
            f3 = -f3;
        }
        float f4 = vector2f.f2691y;
        if (f4 > 0.0f) {
            f2 = this.origin.f2691y;
        } else {
            f2 = this.origin.f2691y + f4;
            f4 = -f4;
        }
        return new Rect2f(f, f2, f3, f4);
    }

    public String toString() {
        Object[] objArr = new Object[4];
        Vector2f vector2f = this.origin;
        objArr[0] = Float.valueOf(vector2f.f2690x);
        objArr[1] = Float.valueOf(vector2f.f2691y);
        vector2f = this.size;
        objArr[2] = Float.valueOf(vector2f.f2690x);
        objArr[3] = Float.valueOf(vector2f.f2691y);
        return String.format("Rect2f: origin = (%f, %f), size = (%f, %f)", objArr);
    }

    public float width() {
        return this.size.f2690x;
    }
}
