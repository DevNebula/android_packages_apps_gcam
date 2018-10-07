package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.ConnectionConfiguration;
import p000.htl;
import p000.ihj;

public class zzbj extends zza {
    public static final Creator CREATOR = new ihj();
    /* renamed from: a */
    private final int f23594a;
    /* renamed from: b */
    private final ConnectionConfiguration[] f23595b;

    public zzbj(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.f23594a = i;
        this.f23595b = connectionConfigurationArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23594a);
        htl.m3474a(parcel, 3, this.f23595b, i);
        htl.m3496c(parcel, b);
    }
}
