package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hvk;
import p000.hwl;

public class zzaf extends zza {
    public static final Creator CREATOR = new hvk();
    /* renamed from: a */
    public IBinder f23382a;
    /* renamed from: b */
    public ConnectionResult f23383b;
    /* renamed from: c */
    public boolean f23384c;
    /* renamed from: d */
    public boolean f23385d;
    /* renamed from: e */
    private final int f23386e;

    public zzaf(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.f23386e = i;
        this.f23382a = iBinder;
        this.f23383b = connectionResult;
        this.f23384c = z;
        this.f23385d = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaf)) {
            return false;
        }
        zzaf zzaf = (zzaf) obj;
        return this.f23383b.equals(zzaf.f23383b) && hwl.m12250a(this.f23382a).equals(hwl.m12250a(zzaf.f23382a));
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23386e);
        htl.m3467a(parcel, 2, this.f23382a);
        htl.m3468a(parcel, 3, this.f23383b, i);
        htl.m3471a(parcel, 4, this.f23384c);
        htl.m3471a(parcel, 5, this.f23385d);
        htl.m3496c(parcel, b);
    }
}
