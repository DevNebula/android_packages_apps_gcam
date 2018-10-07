package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzaf;
import p000.htl;
import p000.ibd;

public class zzbgq extends zza {
    public static final Creator CREATOR = new ibd();
    /* renamed from: a */
    public final ConnectionResult f23518a;
    /* renamed from: b */
    public final zzaf f23519b;
    /* renamed from: c */
    private final int f23520c;

    public zzbgq() {
        this(new ConnectionResult(8, null));
    }

    public zzbgq(int i, ConnectionResult connectionResult, zzaf zzaf) {
        this.f23520c = i;
        this.f23518a = connectionResult;
        this.f23519b = zzaf;
    }

    private zzbgq(ConnectionResult connectionResult) {
        this(1, connectionResult, null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23520c);
        htl.m3468a(parcel, 2, this.f23518a, i);
        htl.m3468a(parcel, 3, this.f23519b, i);
        htl.m3496c(parcel, b);
    }
}
