package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hxz;

public class LogOptions extends zza {
    public static final Creator CREATOR = new hxz();
    /* renamed from: a */
    private String f23469a;
    /* renamed from: b */
    private boolean f23470b;

    public LogOptions(String str, boolean z) {
        this.f23469a = str;
        this.f23470b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23469a);
        htl.m3471a(parcel, 3, this.f23470b);
        htl.m3496c(parcel, b);
    }
}
