package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.ijc;

public class ConnectionConfiguration extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new ijc();
    /* renamed from: a */
    private final String f23548a;
    /* renamed from: b */
    private final String f23549b;
    /* renamed from: c */
    private final int f23550c;
    /* renamed from: d */
    private final int f23551d;
    /* renamed from: e */
    private final boolean f23552e;
    /* renamed from: f */
    private boolean f23553f;
    /* renamed from: g */
    private String f23554g;
    /* renamed from: h */
    private boolean f23555h;
    /* renamed from: i */
    private String f23556i;

    public ConnectionConfiguration(String str, String str2, int i, int i2, boolean z, boolean z2, String str3, boolean z3, String str4) {
        this.f23548a = str;
        this.f23549b = str2;
        this.f23550c = i;
        this.f23551d = i2;
        this.f23552e = z;
        this.f23553f = z2;
        this.f23554g = str3;
        this.f23555h = z3;
        this.f23556i = str4;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ConnectionConfiguration)) {
            return false;
        }
        ConnectionConfiguration connectionConfiguration = (ConnectionConfiguration) obj;
        return htl.m3483a(this.f23548a, connectionConfiguration.f23548a) && htl.m3483a(this.f23549b, connectionConfiguration.f23549b) && htl.m3483a(Integer.valueOf(this.f23550c), Integer.valueOf(connectionConfiguration.f23550c)) && htl.m3483a(Integer.valueOf(this.f23551d), Integer.valueOf(connectionConfiguration.f23551d)) && htl.m3483a(Boolean.valueOf(this.f23552e), Boolean.valueOf(connectionConfiguration.f23552e)) && htl.m3483a(Boolean.valueOf(this.f23555h), Boolean.valueOf(connectionConfiguration.f23555h));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23548a, this.f23549b, Integer.valueOf(this.f23550c), Integer.valueOf(this.f23551d), Boolean.valueOf(this.f23552e), Boolean.valueOf(this.f23555h)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("ConnectionConfiguration[ ");
        String valueOf = String.valueOf(this.f23548a);
        String str = "mName=";
        stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        valueOf = String.valueOf(this.f23549b);
        str = ", mAddress=";
        stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        int i = this.f23550c;
        StringBuilder stringBuilder2 = new StringBuilder(19);
        stringBuilder2.append(", mType=");
        stringBuilder2.append(i);
        stringBuilder.append(stringBuilder2.toString());
        i = this.f23551d;
        stringBuilder2 = new StringBuilder(19);
        stringBuilder2.append(", mRole=");
        stringBuilder2.append(i);
        stringBuilder.append(stringBuilder2.toString());
        boolean z = this.f23552e;
        stringBuilder2 = new StringBuilder(16);
        stringBuilder2.append(", mEnabled=");
        stringBuilder2.append(z);
        stringBuilder.append(stringBuilder2.toString());
        z = this.f23553f;
        stringBuilder2 = new StringBuilder(20);
        stringBuilder2.append(", mIsConnected=");
        stringBuilder2.append(z);
        stringBuilder.append(stringBuilder2.toString());
        valueOf = String.valueOf(this.f23554g);
        str = ", mPeerNodeId=";
        stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        z = this.f23555h;
        stringBuilder2 = new StringBuilder(21);
        stringBuilder2.append(", mBtlePriority=");
        stringBuilder2.append(z);
        stringBuilder.append(stringBuilder2.toString());
        valueOf = String.valueOf(this.f23556i);
        str = ", mNodeId=";
        stringBuilder.append(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23548a);
        htl.m3469a(parcel, 3, this.f23549b);
        htl.m3497c(parcel, 4, this.f23550c);
        htl.m3497c(parcel, 5, this.f23551d);
        htl.m3471a(parcel, 6, this.f23552e);
        htl.m3471a(parcel, 7, this.f23553f);
        htl.m3469a(parcel, 8, this.f23554g);
        htl.m3471a(parcel, 9, this.f23555h);
        htl.m3469a(parcel, 10, this.f23556i);
        htl.m3496c(parcel, b);
    }
}
