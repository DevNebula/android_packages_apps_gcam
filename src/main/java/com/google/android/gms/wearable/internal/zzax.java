package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihd;

public class zzax extends zza {
    public static final Creator CREATOR = new ihd();
    /* renamed from: a */
    private final int f23581a;
    /* renamed from: b */
    private final ParcelFileDescriptor f23582b;

    public zzax(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f23581a = i;
        this.f23582b = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23581a);
        htl.m3468a(parcel, 3, this.f23582b, i);
        htl.m3496c(parcel, b);
    }
}
