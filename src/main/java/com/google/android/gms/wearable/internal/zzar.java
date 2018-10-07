package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iha;

public class zzar extends zza {
    public static final Creator CREATOR = new iha();
    /* renamed from: a */
    private final int f23575a;
    /* renamed from: b */
    private final int f23576b;

    public zzar(int i, int i2) {
        this.f23575a = i;
        this.f23576b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23575a);
        htl.m3497c(parcel, 3, this.f23576b);
        htl.m3496c(parcel, b);
    }
}
