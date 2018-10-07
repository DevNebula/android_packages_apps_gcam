package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hwy;

public class zzc extends zza {
    public static final Creator CREATOR = new hwy();
    /* renamed from: a */
    private final String f23396a;
    /* renamed from: b */
    private final int f23397b;

    public zzc(String str, int i) {
        this.f23396a = str;
        this.f23397b = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 1, this.f23396a);
        htl.m3497c(parcel, 2, this.f23397b);
        htl.m3496c(parcel, b);
    }
}
