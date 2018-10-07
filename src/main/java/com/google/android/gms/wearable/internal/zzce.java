package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iid;

public class zzce extends zza {
    public static final Creator CREATOR = new iid();
    /* renamed from: a */
    private final int f23616a;
    /* renamed from: b */
    private final zzu f23617b;

    public zzce(int i, zzu zzu) {
        this.f23616a = i;
        this.f23617b = zzu;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23616a);
        htl.m3468a(parcel, 3, this.f23617b, i);
        htl.m3496c(parcel, b);
    }
}
