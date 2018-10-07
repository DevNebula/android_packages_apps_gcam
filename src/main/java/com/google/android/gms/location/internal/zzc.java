package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iet;

public class zzc extends zza {
    public static final Creator CREATOR = new iet();
    /* renamed from: a */
    private final int f23529a;
    /* renamed from: b */
    private final String f23530b;

    public zzc(int i, String str) {
        this.f23529a = i;
        this.f23530b = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof zzc)) {
            return false;
        }
        zzc zzc = (zzc) obj;
        return zzc.f23529a == this.f23529a && htl.m3483a(zzc.f23530b, this.f23530b);
    }

    public int hashCode() {
        return this.f23529a;
    }

    public String toString() {
        return String.format("%d:%s", new Object[]{Integer.valueOf(this.f23529a), this.f23530b});
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23529a);
        htl.m3469a(parcel, 2, this.f23530b);
        htl.m3496c(parcel, b);
    }
}
