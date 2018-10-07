package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iiv;

public final class zzk extends zza {
    public static final Creator CREATOR = new iiv();
    /* renamed from: a */
    private int f23629a;
    /* renamed from: b */
    private final String f23630b;
    /* renamed from: c */
    private final String f23631c;
    /* renamed from: d */
    private final String f23632d;
    /* renamed from: e */
    private final String f23633e;
    /* renamed from: f */
    private final String f23634f;
    /* renamed from: g */
    private final String f23635g;
    /* renamed from: h */
    private final byte f23636h;
    /* renamed from: i */
    private final byte f23637i;
    /* renamed from: j */
    private final byte f23638j;
    /* renamed from: k */
    private final byte f23639k;
    /* renamed from: l */
    private final String f23640l;

    public zzk(int i, String str, String str2, String str3, String str4, String str5, String str6, byte b, byte b2, byte b3, byte b4, String str7) {
        this.f23629a = i;
        this.f23630b = str;
        this.f23631c = str2;
        this.f23632d = str3;
        this.f23633e = str4;
        this.f23634f = str5;
        this.f23635g = str6;
        this.f23636h = b;
        this.f23637i = b2;
        this.f23638j = b3;
        this.f23639k = b4;
        this.f23640l = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        zzk zzk = (zzk) obj;
        if (this.f23629a != zzk.f23629a || this.f23636h != zzk.f23636h || this.f23637i != zzk.f23637i || this.f23638j != zzk.f23638j || this.f23639k != zzk.f23639k || !this.f23630b.equals(zzk.f23630b)) {
            return false;
        }
        String str = this.f23631c;
        if (str != null) {
            if (!str.equals(zzk.f23631c)) {
                return false;
            }
        } else if (zzk.f23631c != null) {
            return false;
        }
        if (!this.f23632d.equals(zzk.f23632d) || !this.f23633e.equals(zzk.f23633e) || !this.f23634f.equals(zzk.f23634f)) {
            return false;
        }
        str = this.f23635g;
        if (str != null) {
            if (!str.equals(zzk.f23635g)) {
                return false;
            }
        } else if (zzk.f23635g != null) {
            return false;
        }
        str = this.f23640l;
        return str != null ? str.equals(zzk.f23640l) : zzk.f23640l == null;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = (((this.f23629a + 31) * 31) + this.f23630b.hashCode()) * 31;
        String str = this.f23631c;
        hashCode = ((((((((str != null ? str.hashCode() : 0) + hashCode) * 31) + this.f23632d.hashCode()) * 31) + this.f23633e.hashCode()) * 31) + this.f23634f.hashCode()) * 31;
        str = this.f23635g;
        int hashCode2 = ((((((((((str != null ? str.hashCode() : 0) + hashCode) * 31) + this.f23636h) * 31) + this.f23637i) * 31) + this.f23638j) * 31) + this.f23639k) * 31;
        String str2 = this.f23640l;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        int i = this.f23629a;
        String str = this.f23630b;
        String str2 = this.f23631c;
        String str3 = this.f23632d;
        String str4 = this.f23633e;
        String str5 = this.f23634f;
        String str6 = this.f23635g;
        byte b = this.f23636h;
        byte b2 = this.f23637i;
        byte b3 = this.f23638j;
        byte b4 = this.f23639k;
        String str7 = this.f23640l;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        int length3 = String.valueOf(str3).length();
        int length4 = String.valueOf(str4).length();
        int length5 = String.valueOf(str5).length();
        StringBuilder stringBuilder = new StringBuilder(((((((length + 211) + length2) + length3) + length4) + length5) + String.valueOf(str6).length()) + String.valueOf(str7).length());
        stringBuilder.append("AncsNotificationParcelable{, id=");
        stringBuilder.append(i);
        stringBuilder.append(", appId='");
        stringBuilder.append(str);
        stringBuilder.append("'");
        stringBuilder.append(", dateTime='");
        stringBuilder.append(str2);
        stringBuilder.append("'");
        stringBuilder.append(", notificationText='");
        stringBuilder.append(str3);
        stringBuilder.append("'");
        stringBuilder.append(", title='");
        stringBuilder.append(str4);
        stringBuilder.append("'");
        stringBuilder.append(", subtitle='");
        stringBuilder.append(str5);
        stringBuilder.append("'");
        stringBuilder.append(", displayName='");
        stringBuilder.append(str6);
        stringBuilder.append("'");
        stringBuilder.append(", eventId=");
        stringBuilder.append(b);
        stringBuilder.append(", eventFlags=");
        stringBuilder.append(b2);
        stringBuilder.append(", categoryId=");
        stringBuilder.append(b3);
        stringBuilder.append(", categoryCount=");
        stringBuilder.append(b4);
        stringBuilder.append(", packageName='");
        stringBuilder.append(str7);
        stringBuilder.append("'");
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23629a);
        htl.m3469a(parcel, 3, this.f23630b);
        htl.m3469a(parcel, 4, this.f23631c);
        htl.m3469a(parcel, 5, this.f23632d);
        htl.m3469a(parcel, 6, this.f23633e);
        htl.m3469a(parcel, 7, this.f23634f);
        String str = this.f23635g;
        if (str == null) {
            str = this.f23630b;
        }
        htl.m3469a(parcel, 8, str);
        htl.m3463a(parcel, 9, this.f23636h);
        htl.m3463a(parcel, 10, this.f23637i);
        htl.m3463a(parcel, 11, this.f23638j);
        htl.m3463a(parcel, 12, this.f23639k);
        htl.m3469a(parcel, 13, this.f23640l);
        htl.m3496c(parcel, b);
    }
}
