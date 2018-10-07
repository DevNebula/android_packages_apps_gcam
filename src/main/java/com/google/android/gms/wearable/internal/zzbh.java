package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;
import p000.htl;
import p000.ihi;

@Deprecated
public class zzbh extends zza {
    public static final Creator CREATOR = new ihi();
    /* renamed from: a */
    private final int f23592a;
    /* renamed from: b */
    private final ConnectionConfiguration f23593b;

    public zzbh(int i, ConnectionConfiguration connectionConfiguration) {
        this.f23592a = i;
        this.f23593b = connectionConfiguration;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23592a);
        htl.m3468a(parcel, 3, this.f23593b, i);
        htl.m3496c(parcel, b);
    }
}
