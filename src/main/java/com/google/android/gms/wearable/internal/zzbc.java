package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihf;

public class zzbc extends zza {
    public static final Creator CREATOR = new ihf();
    /* renamed from: a */
    private final int f23585a;
    /* renamed from: b */
    private final boolean f23586b;

    public zzbc(int i, boolean z) {
        this.f23585a = i;
        this.f23586b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23585a);
        htl.m3471a(parcel, 3, this.f23586b);
        htl.m3496c(parcel, b);
    }
}
