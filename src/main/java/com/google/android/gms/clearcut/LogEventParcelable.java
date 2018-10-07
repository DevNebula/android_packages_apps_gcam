package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htk;
import p000.htl;
import p000.hty;
import p000.ibw;

public class LogEventParcelable extends zza {
    public static final Creator CREATOR = new hty();
    /* renamed from: a */
    public PlayLoggerContext f23329a;
    /* renamed from: b */
    public byte[] f23330b;
    /* renamed from: c */
    public final ibw f23331c;
    /* renamed from: d */
    public final htk f23332d;
    /* renamed from: e */
    public final htk f23333e;
    /* renamed from: f */
    private int[] f23334f;
    /* renamed from: g */
    private String[] f23335g;
    /* renamed from: h */
    private int[] f23336h;
    /* renamed from: i */
    private byte[][] f23337i;
    /* renamed from: j */
    private boolean f23338j;

    public LogEventParcelable(PlayLoggerContext playLoggerContext, ibw ibw, htk htk, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr, boolean z) {
        this.f23329a = playLoggerContext;
        this.f23331c = ibw;
        this.f23332d = null;
        this.f23333e = null;
        this.f23334f = iArr;
        this.f23335g = strArr;
        this.f23336h = iArr2;
        this.f23337i = bArr;
        this.f23338j = z;
    }

    public LogEventParcelable(PlayLoggerContext playLoggerContext, byte[] bArr, int[] iArr, String[] strArr, int[] iArr2, byte[][] bArr2, boolean z) {
        this.f23329a = playLoggerContext;
        this.f23330b = bArr;
        this.f23334f = iArr;
        this.f23335g = strArr;
        this.f23331c = null;
        this.f23332d = null;
        this.f23333e = null;
        this.f23336h = iArr2;
        this.f23337i = bArr2;
        this.f23338j = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogEventParcelable)) {
            return false;
        }
        LogEventParcelable logEventParcelable = (LogEventParcelable) obj;
        return htl.m3483a(this.f23329a, logEventParcelable.f23329a) && Arrays.equals(this.f23330b, logEventParcelable.f23330b) && Arrays.equals(this.f23334f, logEventParcelable.f23334f) && Arrays.equals(this.f23335g, logEventParcelable.f23335g) && htl.m3483a(this.f23331c, logEventParcelable.f23331c) && htl.m3483a(this.f23332d, logEventParcelable.f23332d) && htl.m3483a(null, null) && Arrays.equals(this.f23336h, logEventParcelable.f23336h) && Arrays.deepEquals(this.f23337i, logEventParcelable.f23337i) && this.f23338j == logEventParcelable.f23338j;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23329a, this.f23330b, this.f23334f, this.f23335g, this.f23331c, this.f23332d, null, this.f23336h, this.f23337i, Boolean.valueOf(this.f23338j)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("LogEventParcelable[");
        stringBuilder.append(this.f23329a);
        stringBuilder.append(", ");
        stringBuilder.append("LogEventBytes: ");
        byte[] bArr = this.f23330b;
        stringBuilder.append(bArr != null ? new String(bArr) : null);
        stringBuilder.append(", ");
        stringBuilder.append("TestCodes: ");
        stringBuilder.append(Arrays.toString(this.f23334f));
        stringBuilder.append(", ");
        stringBuilder.append("MendelPackages: ");
        stringBuilder.append(Arrays.toString(this.f23335g));
        stringBuilder.append(", ");
        stringBuilder.append("LogEvent: ");
        stringBuilder.append(this.f23331c);
        stringBuilder.append(", ");
        stringBuilder.append("ExtensionProducer: ");
        stringBuilder.append(this.f23332d);
        stringBuilder.append(", ");
        stringBuilder.append("VeProducer: ");
        stringBuilder.append(null);
        stringBuilder.append(", ");
        stringBuilder.append("ExperimentIDs: ");
        stringBuilder.append(Arrays.toString(this.f23336h));
        stringBuilder.append(", ");
        stringBuilder.append("ExperimentTokens: ");
        stringBuilder.append(Arrays.toString(this.f23337i));
        stringBuilder.append(", ");
        stringBuilder.append("AddPhenotypeExperimentTokens: ");
        stringBuilder.append(this.f23338j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3468a(parcel, 2, this.f23329a, i);
        htl.m3472a(parcel, 3, this.f23330b);
        htl.m3473a(parcel, 4, this.f23334f);
        htl.m3475a(parcel, 5, this.f23335g);
        htl.m3473a(parcel, 6, this.f23336h);
        byte[][] bArr = this.f23337i;
        if (bArr != null) {
            int b2 = htl.m3487b(parcel, 7);
            parcel.writeInt(r4);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            htl.m3496c(parcel, b2);
        }
        htl.m3471a(parcel, 8, this.f23338j);
        htl.m3496c(parcel, b);
    }
}
