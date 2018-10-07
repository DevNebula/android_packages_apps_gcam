package com.google.googlex.gcam.androidutils.vecmath;

import p000.khx;

/* compiled from: PG */
public class Vector4i {
    /* renamed from: w */
    public int f2708w;
    /* renamed from: x */
    public int f2709x;
    /* renamed from: y */
    public int f2710y;
    /* renamed from: z */
    public int f2711z;

    public Vector4i(int i, int i2, int i3, int i4) {
        this.f2709x = i;
        this.f2710y = i2;
        this.f2711z = i3;
        this.f2708w = i4;
    }

    public Vector4i(Vector4i vector4i) {
        this.f2709x = vector4i.f2709x;
        this.f2710y = vector4i.f2710y;
        this.f2711z = vector4i.f2711z;
        this.f2708w = vector4i.f2708w;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector4i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector4i vector4i = (Vector4i) obj;
        if (this.f2709x == vector4i.f2709x && this.f2710y == vector4i.f2710y && this.f2711z == vector4i.f2711z && this.f2708w == vector4i.f2708w) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f2709x * 31) + this.f2710y) * 31) + this.f2711z) * 31) + this.f2708w;
    }

    public String toString() {
        int i = this.f2709x;
        int i2 = this.f2710y;
        int i3 = this.f2711z;
        int i4 = this.f2708w;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("(");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(", ");
        stringBuilder.append(i3);
        stringBuilder.append(", ");
        stringBuilder.append(i4);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        String a = khx.m4998a(this.f2709x);
        String a2 = khx.m4998a(this.f2710y);
        String a3 = khx.m4998a(this.f2711z);
        String a4 = khx.m4998a(this.f2708w);
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
