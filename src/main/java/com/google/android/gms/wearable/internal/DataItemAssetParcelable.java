package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.igi;
import p000.igy;

@KeepName
public class DataItemAssetParcelable extends zza implements ReflectedParcelable, igi {
    public static final Creator CREATOR = new igy();
    /* renamed from: a */
    private final String f23562a;
    /* renamed from: b */
    private final String f23563b;

    public DataItemAssetParcelable(igi igi) {
        this.f23562a = (String) htl.m3488b(igi.mo8436b());
        this.f23563b = (String) htl.m3488b(igi.mo8435a());
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.f23562a = str;
        this.f23563b = str2;
    }

    /* renamed from: a */
    public final String mo8435a() {
        return this.f23563b;
    }

    /* renamed from: b */
    public final String mo8436b() {
        return this.f23562a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DataItemAssetParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.f23562a != null) {
            stringBuilder.append(",");
            stringBuilder.append(this.f23562a);
        } else {
            stringBuilder.append(",noid");
        }
        stringBuilder.append(", key=");
        stringBuilder.append(this.f23563b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23562a);
        htl.m3469a(parcel, 3, this.f23563b);
        htl.m3496c(parcel, b);
    }
}
