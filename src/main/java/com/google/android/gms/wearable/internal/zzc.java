package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.ihq;
import p000.ihr;
import p000.iip;
import p000.iis;

public class zzc extends zza {
    public static final Creator CREATOR = new iis();
    /* renamed from: a */
    private final ihq f23608a;
    /* renamed from: b */
    private final IntentFilter[] f23609b;
    /* renamed from: c */
    private final String f23610c;
    /* renamed from: d */
    private final String f23611d;

    public zzc(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        if (iBinder != null) {
            this.f23608a = ihr.m12457a(iBinder);
        } else {
            this.f23608a = null;
        }
        this.f23609b = intentFilterArr;
        this.f23610c = str;
        this.f23611d = str2;
    }

    public zzc(iip iip) {
        this.f23608a = iip;
        this.f23609b = iip.f24627b;
        this.f23610c = null;
        this.f23611d = null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        ihq ihq = this.f23608a;
        htl.m3467a(parcel, 2, ihq != null ? ihq.asBinder() : null);
        htl.m3474a(parcel, 3, this.f23609b, i);
        htl.m3469a(parcel, 4, this.f23610c);
        htl.m3469a(parcel, 5, this.f23611d);
        htl.m3496c(parcel, b);
    }
}
