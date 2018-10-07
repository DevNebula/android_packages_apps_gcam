package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihn;

public class zzbr extends zza {
    public static final Creator CREATOR = new ihn();
    /* renamed from: a */
    private final int f23602a;
    /* renamed from: b */
    private final zzcc f23603b;

    public zzbr(int i, zzcc zzcc) {
        this.f23602a = i;
        this.f23603b = zzcc;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23602a);
        htl.m3468a(parcel, 3, this.f23603b, i);
        htl.m3496c(parcel, b);
    }
}
