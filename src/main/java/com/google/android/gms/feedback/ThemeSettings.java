package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hya;

public class ThemeSettings extends zza {
    public static final Creator CREATOR = new hya();
    /* renamed from: a */
    public int f23471a;
    /* renamed from: b */
    private int f23472b;

    public ThemeSettings() {
        this(0, 0);
    }

    public ThemeSettings(int i, int i2) {
        this.f23471a = i;
        this.f23472b = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23471a);
        htl.m3497c(parcel, 3, this.f23472b);
        htl.m3496c(parcel, b);
    }
}
