package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iih;

public class zzcl extends zza {
    public static final Creator CREATOR = new iih();
    /* renamed from: a */
    private final int f23622a;

    public zzcl(int i) {
        this.f23622a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23622a);
        htl.m3496c(parcel, b);
    }
}
