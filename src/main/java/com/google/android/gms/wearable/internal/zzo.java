package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.iix;

public class zzo extends zza {
    public static final Creator CREATOR = new iix();
    /* renamed from: a */
    private final String f23641a;
    /* renamed from: b */
    private final List f23642b;

    public zzo(String str, List list) {
        Object obj = new Object();
        this.f23641a = str;
        this.f23642b = list;
        htl.m3488b(this.f23641a);
        htl.m3488b(this.f23642b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzo zzo = (zzo) obj;
        String str = this.f23641a;
        if (!str == null ? str.equals(zzo.f23641a) : zzo.f23641a == null) {
            return false;
        }
        List list = this.f23642b;
        if (list != null) {
            if (list.equals(zzo.f23642b)) {
                return true;
            }
        } else if (zzo.f23642b == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        String str = this.f23641a;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        List list = this.f23642b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f23641a;
        String valueOf = String.valueOf(this.f23642b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 18) + String.valueOf(valueOf).length());
        stringBuilder.append("CapabilityInfo{");
        stringBuilder.append(str);
        stringBuilder.append(", ");
        stringBuilder.append(valueOf);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23641a);
        htl.m3470a(parcel, 3, this.f23642b);
        htl.m3496c(parcel, b);
    }
}
