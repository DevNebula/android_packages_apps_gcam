package com.google.googlex.gcam.androidutils.vecmath;

import p000.khx;

/* compiled from: PG */
public class Vector3i {
    /* renamed from: x */
    public int f2697x;
    /* renamed from: y */
    public int f2698y;
    /* renamed from: z */
    public int f2699z;

    public Vector3i(int i, int i2, int i3) {
        this.f2697x = i;
        this.f2698y = i2;
        this.f2699z = i3;
    }

    public Vector3i(Vector3i vector3i) {
        this.f2697x = vector3i.f2697x;
        this.f2698y = vector3i.f2698y;
        this.f2699z = vector3i.f2699z;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector3i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector3i vector3i = (Vector3i) obj;
        if (this.f2697x == vector3i.f2697x && this.f2698y == vector3i.f2698y && this.f2699z == vector3i.f2699z) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f2697x * 31) + this.f2698y) * 31) + this.f2699z;
    }

    public String toString() {
        int i = this.f2697x;
        int i2 = this.f2698y;
        int i3 = this.f2699z;
        StringBuilder stringBuilder = new StringBuilder(39);
        stringBuilder.append("(");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(", ");
        stringBuilder.append(i3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        String a = khx.m4998a(this.f2697x);
        String a2 = khx.m4998a(this.f2698y);
        String a3 = khx.m4998a(this.f2699z);
        int length = String.valueOf(a).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 6) + String.valueOf(a2).length()) + String.valueOf(a3).length());
        stringBuilder.append("(");
        stringBuilder.append(a);
        stringBuilder.append(", ");
        stringBuilder.append(a2);
        stringBuilder.append(", ");
        stringBuilder.append(a3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
