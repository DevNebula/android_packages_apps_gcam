package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.ihb;

public class zzat extends zza {
    public static final Creator CREATOR = new ihb();
    /* renamed from: a */
    private final int f23577a;
    /* renamed from: b */
    private final List f23578b;

    public zzat(int i, List list) {
        this.f23577a = i;
        this.f23578b = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23577a);
        htl.m3470a(parcel, 3, this.f23578b);
        htl.m3496c(parcel, b);
    }
}
