package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ija;

public class zzy extends zza {
    public static final Creator CREATOR = new ija();
    /* renamed from: a */
    private final int f23650a;

    public zzy(int i) {
        this.f23650a = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23650a);
        htl.m3496c(parcel, b);
    }
}
