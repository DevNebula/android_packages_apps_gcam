package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihq;
import p000.ihr;
import p000.iig;

public class zzcj extends zza {
    public static final Creator CREATOR = new iig();
    /* renamed from: a */
    private final int f23620a;
    /* renamed from: b */
    private final ihq f23621b;

    public zzcj(int i, IBinder iBinder) {
        this.f23620a = i;
        if (iBinder != null) {
            this.f23621b = ihr.m12457a(iBinder);
        } else {
            this.f23621b = null;
        }
    }

    public zzcj(ihq ihq) {
        this.f23620a = 1;
        this.f23621b = ihq;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23620a);
        ihq ihq = this.f23621b;
        htl.m3467a(parcel, 2, ihq != null ? ihq.asBinder() : null);
        htl.m3496c(parcel, b);
    }
}
