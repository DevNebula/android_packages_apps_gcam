package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Vector2f {
    /* renamed from: x */
    public float f2690x;
    /* renamed from: y */
    public float f2691y;

    public Vector2f(float f, float f2) {
        this.f2690x = f;
        this.f2691y = f2;
    }

    public Vector2f(Vector2f vector2f) {
        this.f2690x = vector2f.f2690x;
        this.f2691y = vector2f.f2691y;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector2f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector2f vector2f = (Vector2f) obj;
        if (this.f2690x == vector2f.f2690x && this.f2691y == vector2f.f2691y) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.floatToIntBits(this.f2690x) * 31) + Float.floatToIntBits(this.f2691y);
    }

    public String toString() {
        float f = this.f2690x;
        float f2 = this.f2691y;
        StringBuilder stringBuilder = new StringBuilder(34);
        stringBuilder.append("(");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
