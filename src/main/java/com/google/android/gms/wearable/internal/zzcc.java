package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iic;

public class zzcc extends zza {
    public static final Creator CREATOR = new iic();
    /* renamed from: a */
    private final String f23612a;
    /* renamed from: b */
    private final String f23613b;
    /* renamed from: c */
    private final int f23614c;
    /* renamed from: d */
    private final boolean f23615d;

    public zzcc(String str, String str2, int i, boolean z) {
        this.f23612a = str;
        this.f23613b = str2;
        this.f23614c = i;
        this.f23615d = z;
    }

    public boolean equals(Object obj) {
        return obj instanceof zzcc ? ((zzcc) obj).f23612a.equals(this.f23612a) : false;
    }

    public int hashCode() {
        return this.f23612a.hashCode();
    }

    public String toString() {
        String str = this.f23613b;
        String str2 = this.f23612a;
        int i = this.f23614c;
        boolean z = this.f23615d;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 45) + String.valueOf(str2).length());
        stringBuilder.append("Node{");
        stringBuilder.append(str);
        stringBuilder.append(", id=");
        stringBuilder.append(str2);
        stringBuilder.append(", hops=");
        stringBuilder.append(i);
        stringBuilder.append(", isNearby=");
        stringBuilder.append(z);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23612a);
        htl.m3469a(parcel, 3, this.f23613b);
        htl.m3497c(parcel, 4, this.f23614c);
        htl.m3471a(parcel, 5, this.f23615d);
        htl.m3496c(parcel, b);
    }
}
