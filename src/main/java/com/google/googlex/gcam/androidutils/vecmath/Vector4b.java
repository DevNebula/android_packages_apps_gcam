package com.google.googlex.gcam.androidutils.vecmath;

import p000.khx;

/* compiled from: PG */
public class Vector4b {
    /* renamed from: w */
    public byte f2700w;
    /* renamed from: x */
    public byte f2701x;
    /* renamed from: y */
    public byte f2702y;
    /* renamed from: z */
    public byte f2703z;

    public Vector4b(byte b, byte b2, byte b3, byte b4) {
        this.f2701x = b;
        this.f2702y = b2;
        this.f2703z = b3;
        this.f2700w = b4;
    }

    public Vector4b(int i, int i2, int i3, int i4) {
        this.f2701x = (byte) i;
        this.f2702y = (byte) i2;
        this.f2703z = (byte) i3;
        this.f2700w = (byte) i4;
    }

    public Vector4b(Vector4b vector4b) {
        this.f2701x = vector4b.f2701x;
        this.f2702y = vector4b.f2702y;
        this.f2703z = vector4b.f2703z;
        this.f2700w = vector4b.f2700w;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector4b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector4b vector4b = (Vector4b) obj;
        if (this.f2701x == vector4b.f2701x && this.f2702y == vector4b.f2702y && this.f2703z == vector4b.f2703z && this.f2700w == vector4b.f2700w) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f2701x * 31) + this.f2702y) * 31) + this.f2703z) * 31) + this.f2700w;
    }

    public String toString() {
        byte b = this.f2701x;
        byte b2 = this.f2702y;
        byte b3 = this.f2703z;
        byte b4 = this.f2700w;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("(");
        stringBuilder.append(b);
        stringBuilder.append(", ");
        stringBuilder.append(b2);
        stringBuilder.append(", ");
        stringBuilder.append(b3);
        stringBuilder.append(", ");
        stringBuilder.append(b4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        String a = khx.m4997a(this.f2701x);
        String a2 = khx.m4997a(this.f2702y);
        String a3 = khx.m4997a(this.f2703z);
        String a4 = khx.m4997a(this.f2700w);
        int length = String.valueOf(a).length();
        int length2 = String.valueOf(a2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 8) + length2) + String.valueOf(a3).length()) + String.valueOf(a4).length());
        stringBuilder.append("(");
        stringBuilder.append(a);
        stringBuilder.append(", ");
        stringBuilder.append(a2);
        stringBuilder.append(", ");
        stringBuilder.append(a3);
        stringBuilder.append(", ");
        stringBuilder.append(a4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
