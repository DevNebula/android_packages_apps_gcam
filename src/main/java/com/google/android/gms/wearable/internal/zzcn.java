package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iii;

public class zzcn extends zza {
    public static final Creator CREATOR = new iii();
    /* renamed from: a */
    private final int f23623a;
    /* renamed from: b */
    private final int f23624b;

    public zzcn(int i, int i2) {
        this.f23623a = i;
        this.f23624b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23623a);
        htl.m3497c(parcel, 3, this.f23624b);
        htl.m3496c(parcel, b);
    }
}
