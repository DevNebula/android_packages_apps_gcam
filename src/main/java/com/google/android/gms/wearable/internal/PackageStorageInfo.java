package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iie;

public class PackageStorageInfo extends zza {
    public static final Creator CREATOR = new iie();
    /* renamed from: a */
    private final String f23564a;
    /* renamed from: b */
    private final String f23565b;
    /* renamed from: c */
    private final long f23566c;

    public PackageStorageInfo(String str, String str2, long j) {
        this.f23564a = str;
        this.f23565b = str2;
        this.f23566c = j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23564a);
        htl.m3469a(parcel, 3, this.f23565b);
        htl.m3465a(parcel, 4, this.f23566c);
        htl.m3496c(parcel, b);
    }
}
