package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihe;

public class zzaz extends zza {
    public static final Creator CREATOR = new ihe();
    /* renamed from: a */
    private final int f23583a;
    /* renamed from: b */
    private final ParcelFileDescriptor f23584b;

    public zzaz(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f23583a = i;
        this.f23584b = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23583a);
        htl.m3468a(parcel, 3, this.f23584b, i);
        htl.m3496c(parcel, b);
    }
}
