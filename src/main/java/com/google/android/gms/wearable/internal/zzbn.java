package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihl;

public class zzbn extends zza {
    public static final Creator CREATOR = new ihl();
    /* renamed from: a */
    private final int f23598a;
    /* renamed from: b */
    private final zzao f23599b;

    public zzbn(int i, zzao zzao) {
        this.f23598a = i;
        this.f23599b = zzao;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23598a);
        htl.m3468a(parcel, 3, this.f23599b, i);
        htl.m3496c(parcel, b);
    }
}
