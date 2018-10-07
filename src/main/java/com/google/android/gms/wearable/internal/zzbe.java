package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihg;

public class zzbe extends zza {
    public static final Creator CREATOR = new ihg();
    /* renamed from: a */
    private final int f23587a;
    /* renamed from: b */
    private final boolean f23588b;
    /* renamed from: c */
    private final boolean f23589c;

    public zzbe(int i, boolean z, boolean z2) {
        this.f23587a = i;
        this.f23588b = z;
        this.f23589c = z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23587a);
        htl.m3471a(parcel, 3, this.f23588b);
        htl.m3471a(parcel, 4, this.f23589c);
        htl.m3496c(parcel, b);
    }
}
