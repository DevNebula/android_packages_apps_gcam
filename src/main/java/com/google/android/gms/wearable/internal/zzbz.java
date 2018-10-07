package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.igm;
import p000.iib;

public class zzbz extends zza implements igm {
    public static final Creator CREATOR = new iib();
    /* renamed from: a */
    private final int f23604a;
    /* renamed from: b */
    private final String f23605b;
    /* renamed from: c */
    private final byte[] f23606c;
    /* renamed from: d */
    private final String f23607d;

    public zzbz(int i, String str, byte[] bArr, String str2) {
        this.f23604a = i;
        this.f23605b = str;
        this.f23606c = bArr;
        this.f23607d = str2;
    }

    /* renamed from: a */
    public final String mo8442a() {
        return this.f23605b;
    }

    public String toString() {
        int i = this.f23604a;
        String str = this.f23605b;
        byte[] bArr = this.f23606c;
        String valueOf = String.valueOf(bArr != null ? Integer.valueOf(bArr.length) : "null");
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 43) + String.valueOf(valueOf).length());
        stringBuilder.append("MessageEventParcelable[");
        stringBuilder.append(i);
        stringBuilder.append(",");
        stringBuilder.append(str);
        stringBuilder.append(", size=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23604a);
        htl.m3469a(parcel, 3, this.f23605b);
        htl.m3472a(parcel, 4, this.f23606c);
        htl.m3469a(parcel, 5, this.f23607d);
        htl.m3496c(parcel, b);
    }
}
