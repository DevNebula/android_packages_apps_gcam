package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iif;

public class zzch extends zza {
    public static final Creator CREATOR = new iif();
    /* renamed from: a */
    public final int f23618a;
    /* renamed from: b */
    public final zzao f23619b;

    public zzch(int i, zzao zzao) {
        this.f23618a = i;
        this.f23619b = zzao;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23618a);
        htl.m3468a(parcel, 3, this.f23619b, i);
        htl.m3496c(parcel, b);
    }
}
