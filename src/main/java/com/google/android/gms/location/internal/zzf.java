package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hux;
import p000.iew;

public final class zzf extends zza implements hux {
    public static final Creator CREATOR = new iew();
    /* renamed from: a */
    public final Status f23531a;

    static {
        zzf zzf = new zzf(Status.f23355a);
    }

    public zzf(Status status) {
        this.f23531a = status;
    }

    /* renamed from: a */
    public final Status mo8154a() {
        return this.f23531a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3468a(parcel, 1, this.f23531a, i);
        htl.m3496c(parcel, b);
    }
}
