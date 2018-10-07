package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.igv;

public class zzaa extends zza {
    public static final Creator CREATOR = new igv();
    /* renamed from: a */
    private final int f23570a;

    public zzaa(int i) {
        this.f23570a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23570a);
        htl.m3496c(parcel, b);
    }
}
