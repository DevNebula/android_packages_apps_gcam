package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihh;

public class zzbg extends zza {
    public static final Creator CREATOR = new ihh();
    /* renamed from: a */
    private final int f23590a;
    /* renamed from: b */
    private final boolean f23591b;

    public zzbg(int i, boolean z) {
        this.f23590a = i;
        this.f23591b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23590a);
        htl.m3471a(parcel, 3, this.f23591b);
        htl.m3496c(parcel, b);
    }
}
