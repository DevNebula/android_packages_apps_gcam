package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Vector4f {
    /* renamed from: w */
    public float f2704w;
    /* renamed from: x */
    public float f2705x;
    /* renamed from: y */
    public float f2706y;
    /* renamed from: z */
    public float f2707z;

    public Vector4f(float f, float f2, float f3, float f4) {
        this.f2705x = f;
        this.f2706y = f2;
        this.f2707z = f3;
        this.f2704w = f4;
    }

    public Vector4f(Vector4f vector4f) {
        this.f2705x = vector4f.f2705x;
        this.f2706y = vector4f.f2706y;
        this.f2707z = vector4f.f2707z;
        this.f2704w = vector4f.f2704w;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector4f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector4f vector4f = (Vector4f) obj;
        if (this.f2705x == vector4f.f2705x && this.f2706y == vector4f.f2706y && this.f2707z == vector4f.f2707z && this.f2704w == vector4f.f2704w) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f2705x) * 31) + Float.floatToIntBits(this.f2706y)) * 31) + Float.floatToIntBits(this.f2707z)) * 31) + Float.floatToIntBits(this.f2704w);
    }

    public String toString() {
        float f = this.f2705x;
        float f2 = this.f2706y;
        float f3 = this.f2707z;
        float f4 = this.f2704w;
        StringBuilder stringBuilder = new StringBuilder(68);
        stringBuilder.append("(");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        stringBuilder.append(", ");
        stringBuilder.append(f4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
