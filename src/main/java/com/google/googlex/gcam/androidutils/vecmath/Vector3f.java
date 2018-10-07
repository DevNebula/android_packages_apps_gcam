package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Vector3f {
    /* renamed from: x */
    public float f2694x;
    /* renamed from: y */
    public float f2695y;
    /* renamed from: z */
    public float f2696z;

    public Vector3f(float f, float f2, float f3) {
        this.f2694x = f;
        this.f2695y = f2;
        this.f2696z = f3;
    }

    public Vector3f(Vector3f vector3f) {
        this.f2694x = vector3f.f2694x;
        this.f2695y = vector3f.f2695y;
        this.f2696z = vector3f.f2696z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector3f)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector3f vector3f = (Vector3f) obj;
        if (this.f2694x == vector3f.f2694x && this.f2695y == vector3f.f2695y && this.f2696z == vector3f.f2696z) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f2694x) * 31) + Float.floatToIntBits(this.f2695y)) * 31) + Float.floatToIntBits(this.f2696z);
    }

    public String toString() {
        float f = this.f2694x;
        float f2 = this.f2695y;
        float f3 = this.f2696z;
        StringBuilder stringBuilder = new StringBuilder(51);
        stringBuilder.append("(");
        stringBuilder.append(f);
        stringBuilder.append(", ");
        stringBuilder.append(f2);
        stringBuilder.append(", ");
        stringBuilder.append(f3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
