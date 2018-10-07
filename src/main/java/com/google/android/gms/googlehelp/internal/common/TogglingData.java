package com.google.android.gms.googlehelp.internal.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hza;

public class TogglingData extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hza();
    /* renamed from: a */
    public String f23510a;
    /* renamed from: b */
    private String f23511b;
    /* renamed from: c */
    private String f23512c;

    private TogglingData() {
    }

    public TogglingData(String str, String str2, String str3) {
        this.f23511b = str;
        this.f23512c = str2;
        this.f23510a = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23511b);
        htl.m3469a(parcel, 3, this.f23512c);
        htl.m3469a(parcel, 4, this.f23510a);
        htl.m3496c(parcel, b);
    }
}
