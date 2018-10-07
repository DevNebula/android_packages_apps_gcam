package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzad;
import p000.htl;
import p000.ibc;

public class zzbgo extends zza {
    public static final Creator CREATOR = new ibc();
    /* renamed from: a */
    private final int f23516a;
    /* renamed from: b */
    private final zzad f23517b;

    public zzbgo(int i, zzad zzad) {
        this.f23516a = i;
        this.f23517b = zzad;
    }

    public zzbgo(zzad zzad) {
        this(1, zzad);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23516a);
        htl.m3468a(parcel, 2, this.f23517b, i);
        htl.m3496c(parcel, b);
    }
}
