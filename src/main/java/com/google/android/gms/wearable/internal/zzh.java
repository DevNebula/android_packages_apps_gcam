package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iiu;

public class zzh extends zza {
    public static final Creator CREATOR = new iiu();
    /* renamed from: a */
    private byte f23626a;
    /* renamed from: b */
    private final byte f23627b;
    /* renamed from: c */
    private final String f23628c;

    public zzh(byte b, byte b2, String str) {
        this.f23626a = b;
        this.f23627b = b2;
        this.f23628c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzh zzh = (zzh) obj;
        return this.f23626a == zzh.f23626a ? this.f23627b == zzh.f23627b ? this.f23628c.equals(zzh.f23628c) : false : false;
    }

    public int hashCode() {
        return ((((this.f23626a + 31) * 31) + this.f23627b) * 31) + this.f23628c.hashCode();
    }

    public String toString() {
        byte b = this.f23626a;
        byte b2 = this.f23627b;
        String str = this.f23628c;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 73);
        stringBuilder.append("AmsEntityUpdateParcelable{, mEntityId=");
        stringBuilder.append(b);
        stringBuilder.append(", mAttributeId=");
        stringBuilder.append(b2);
        stringBuilder.append(", mValue='");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3463a(parcel, 2, this.f23626a);
        htl.m3463a(parcel, 3, this.f23627b);
        htl.m3469a(parcel, 4, this.f23628c);
        htl.m3496c(parcel, b);
    }
}
