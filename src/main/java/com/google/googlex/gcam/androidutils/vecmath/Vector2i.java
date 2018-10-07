package com.google.googlex.gcam.androidutils.vecmath;

import p000.khx;

/* compiled from: PG */
public class Vector2i {
    /* renamed from: x */
    public int f2692x;
    /* renamed from: y */
    public int f2693y;

    public Vector2i(int i, int i2) {
        this.f2692x = i;
        this.f2693y = i2;
    }

    public Vector2i(Vector2i vector2i) {
        this.f2692x = vector2i.f2692x;
        this.f2693y = vector2i.f2693y;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Vector2i)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        Vector2i vector2i = (Vector2i) obj;
        if (this.f2692x == vector2i.f2692x && this.f2693y == vector2i.f2693y) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f2692x * 31) + this.f2693y;
    }

    public String toString() {
        int i = this.f2692x;
        int i2 = this.f2693y;
        StringBuilder stringBuilder = new StringBuilder(26);
        stringBuilder.append("(");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public String toStringUnsigned() {
        String a = khx.m4998a(this.f2692x);
        String a2 = khx.m4998a(this.f2693y);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 4) + String.valueOf(a2).length());
        stringBuilder.append("(");
        stringBuilder.append(a);
        stringBuilder.append(", ");
        stringBuilder.append(a2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
