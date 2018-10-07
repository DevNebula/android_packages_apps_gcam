package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihm;

public class zzbp extends zza {
    public static final Creator CREATOR = new ihm();
    /* renamed from: a */
    private final int f23600a;
    /* renamed from: b */
    private final ParcelFileDescriptor f23601b;

    public zzbp(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.f23600a = i;
        this.f23601b = parcelFileDescriptor;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23600a);
        htl.m3468a(parcel, 3, this.f23601b, i | 1);
        htl.m3496c(parcel, b);
    }
}
