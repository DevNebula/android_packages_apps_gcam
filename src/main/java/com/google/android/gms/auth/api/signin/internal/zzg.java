package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htc;
import p000.htl;

public class zzg extends zza {
    public static final Creator CREATOR = new htc();
    /* renamed from: a */
    public int f23326a;
    /* renamed from: b */
    private final int f23327b;
    /* renamed from: c */
    private Bundle f23328c;

    public zzg(int i, int i2, Bundle bundle) {
        this.f23327b = i;
        this.f23326a = i2;
        this.f23328c = bundle;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23327b);
        htl.m3497c(parcel, 2, this.f23326a);
        htl.m3466a(parcel, 3, this.f23328c);
        htl.m3496c(parcel, b);
    }
}
