package com.google.googlex.gcam.androidutils.vecmath;

/* compiled from: PG */
public class Vector4s {
    /* renamed from: w */
    public short f2712w;
    /* renamed from: x */
    public short f2713x;
    /* renamed from: y */
    public short f2714y;
    /* renamed from: z */
    public short f2715z;

    public Vector4s(Vector4s vector4s) {
        this.f2713x = vector4s.f2713x;
        this.f2714y = vector4s.f2714y;
        this.f2715z = vector4s.f2715z;
        this.f2712w = vector4s.f2712w;
    }

    public Vector4s(short s, short s2, short s3, short s4) {
        this.f2713x = s;
        this.f2714y = s2;
        this.f2715z = s3;
        this.f2712w = s4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector4s)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector4s vector4s = (Vector4s) obj;
        if (this.f2713x == vector4s.f2713x && this.f2714y == vector4s.f2714y && this.f2715z == vector4s.f2715z && this.f2712w == vector4s.f2712w) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f2713x * 31) + this.f2714y) * 31) + this.f2715z) * 31) + this.f2712w;
    }

    public String toString() {
        short s = this.f2713x;
        short s2 = this.f2714y;
        short s3 = this.f2715z;
        short s4 = this.f2712w;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append("(");
        stringBuilder.append(s);
        stringBuilder.append(", ");
        stringBuilder.append(s2);
        stringBuilder.append(", ");
        stringBuilder.append(s3);
        stringBuilder.append(", ");
        stringBuilder.append(s4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        short s = this.f2713x;
        short s2 = this.f2714y;
        short s3 = this.f2715z;
        short s4 = this.f2712w;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("(");
        stringBuilder.append((char) s);
        stringBuilder.append(", ");
        stringBuilder.append((char) s2);
        stringBuilder.append(", ");
        stringBuilder.append((char) s3);
        stringBuilder.append(", ");
        stringBuilder.append((char) s4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
