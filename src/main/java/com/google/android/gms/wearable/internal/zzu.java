package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.Channel;
import p000.htl;
import p000.iiz;

public class zzu extends zza implements Channel {
    public static final Creator CREATOR = new iiz();
    /* renamed from: a */
    private final String f23647a;
    /* renamed from: b */
    private final String f23648b;
    /* renamed from: c */
    private final String f23649c;

    public zzu(String str, String str2, String str3) {
        this.f23647a = (String) htl.m3488b((Object) str);
        this.f23648b = (String) htl.m3488b((Object) str2);
        this.f23649c = (String) htl.m3488b((Object) str3);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzu)) {
            return false;
        }
        zzu zzu = (zzu) obj;
        return this.f23647a.equals(zzu.f23647a) && htl.m3483a(zzu.f23648b, this.f23648b) && htl.m3483a(zzu.f23649c, this.f23649c);
    }

    public int hashCode() {
        return this.f23647a.hashCode();
    }

    public String toString() {
        String str = this.f23647a;
        String str2 = this.f23648b;
        String str3 = this.f23649c;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 43) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append("ChannelImpl{, token='");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(", nodeId='");
        stringBuilder.append(str2);
        stringBuilder.append("'");
        stringBuilder.append(", path='");
        stringBuilder.append(str3);
        stringBuilder.append("'");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23647a);
        htl.m3469a(parcel, 3, this.f23648b);
        htl.m3469a(parcel, 4, this.f23649c);
        htl.m3496c(parcel, b);
    }
}
