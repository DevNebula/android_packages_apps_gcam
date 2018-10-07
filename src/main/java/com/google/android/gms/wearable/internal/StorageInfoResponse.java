package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.iij;

public class StorageInfoResponse extends zza {
    public static final Creator CREATOR = new iij();
    /* renamed from: a */
    private final int f23567a;
    /* renamed from: b */
    private final long f23568b;
    /* renamed from: c */
    private final List f23569c;

    public StorageInfoResponse(int i, long j, List list) {
        this.f23567a = i;
        this.f23568b = j;
        this.f23569c = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23567a);
        htl.m3465a(parcel, 3, this.f23568b);
        htl.m3470a(parcel, 4, this.f23569c);
        htl.m3496c(parcel, b);
    }
}
