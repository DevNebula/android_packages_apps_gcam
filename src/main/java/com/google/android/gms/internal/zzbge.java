package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hux;
import p000.iax;

public class zzbge extends zza implements hux {
    public static final Creator CREATOR = new iax();
    /* renamed from: a */
    private final int f23513a;
    /* renamed from: b */
    private int f23514b;
    /* renamed from: c */
    private Intent f23515c;

    public zzbge() {
        this((byte) 0);
    }

    private zzbge(byte b) {
        this(2, 0, null);
    }

    public zzbge(int i, int i2, Intent intent) {
        this.f23513a = i;
        this.f23514b = i2;
        this.f23515c = intent;
    }

    /* renamed from: a */
    public final Status mo8154a() {
        return this.f23514b != 0 ? Status.f23358d : Status.f23355a;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23513a);
        htl.m3497c(parcel, 2, this.f23514b);
        htl.m3468a(parcel, 3, this.f23515c, i);
        htl.m3496c(parcel, b);
    }
}
