package com.google.android.libraries.smartburst.utils;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;
import p000.jri;
import p000.jza;

/* compiled from: PG */
public final class Feature {
    /* renamed from: a */
    private final jza f2660a;
    /* renamed from: b */
    private final float[] f2661b;

    public Feature(jza jza) {
        this(jza, new float[jza.f8493A]);
    }

    public Feature(jza jza, float f) {
        this(jza, new float[]{f});
    }

    public Feature(jza jza, float[] fArr) {
        boolean z;
        if (fArr.length == jza.f8493A) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f2660a = jza;
        this.f2661b = fArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (this.f2660a == feature.f2660a && Arrays.equals(this.f2661b, feature.f2661b)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final int m1385a(int i, int... iArr) {
        int[] iArr2 = this.f2660a.f8495C;
        for (int i2 = 0; i2 < iArr2.length - 1; i2++) {
            i = (iArr2[i2 + 1] * i) + iArr[i2];
        }
        return i;
    }

    public final jza getType() {
        return this.f2660a;
    }

    public final float getValue() {
        float[] fArr = this.f2661b;
        if (fArr.length == 1) {
            return fArr[0];
        }
        throw new RuntimeException("Cannot call getValue() on multi-valued feature!");
    }

    public final float getValueAt(int i, int... iArr) {
        return this.f2661b[m1385a(i, iArr)];
    }

    public final float[] getValues() {
        return this.f2661b;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f2660a, Integer.valueOf(Arrays.hashCode(this.f2661b))});
    }

    public final int length() {
        return this.f2661b.length;
    }

    public static Feature read(DataInputStream dataInputStream) {
        jza a = jza.m4765a(dataInputStream.readInt());
        if (a != null) {
            return readValues(a, a.f8493A, dataInputStream);
        }
        throw new RuntimeException(String.format("Unrecognized feature ID (%d)", new Object[]{Integer.valueOf(r0)}));
    }

    public static Feature readValues(jza jza, int i, DataInputStream dataInputStream) {
        int i2 = 0;
        if (jza == null) {
            while (i2 < i) {
                dataInputStream.readFloat();
                i2++;
            }
            return null;
        }
        if (jza.f8493A != i) {
            throw new IOException(String.format("Feature length error: %d requested, %d expected", new Object[]{Integer.valueOf(i), Integer.valueOf(jza.f8493A)}));
        }
        float[] fArr = new float[i];
        while (i2 < fArr.length) {
            fArr[i2] = dataInputStream.readFloat();
            i2++;
        }
        return new Feature(jza, fArr);
    }

    public final void setValueAt(float f, int i, int... iArr) {
        this.f2661b[m1385a(i, iArr)] = f;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2660a.name());
        String valueOf2 = String.valueOf(Arrays.toString(this.f2661b));
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    public final void write(DataOutputStream dataOutputStream) {
        writeHeader(dataOutputStream);
        writeValues(dataOutputStream);
    }

    public final void writeHeader(DataOutputStream dataOutputStream) {
        dataOutputStream.writeInt(this.f2660a.f8497z);
        dataOutputStream.writeInt(this.f2660a.f8493A);
    }

    public final void writeValues(DataOutputStream dataOutputStream) {
        for (float writeFloat : this.f2661b) {
            dataOutputStream.writeFloat(writeFloat);
        }
    }
}
