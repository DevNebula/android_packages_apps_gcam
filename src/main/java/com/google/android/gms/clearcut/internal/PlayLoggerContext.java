package com.google.android.gms.clearcut.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.htx;

public class PlayLoggerContext extends zza {
    public static final Creator CREATOR = new htx();
    /* renamed from: a */
    public final int f23339a;
    /* renamed from: b */
    public final String f23340b;
    /* renamed from: c */
    private final String f23341c;
    /* renamed from: d */
    private final int f23342d;
    /* renamed from: e */
    private final String f23343e;
    /* renamed from: f */
    private final String f23344f;
    /* renamed from: g */
    private final boolean f23345g;
    /* renamed from: h */
    private final boolean f23346h;
    /* renamed from: i */
    private final int f23347i;

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, String str4, boolean z, int i3) {
        this.f23341c = (String) htl.m3488b((Object) str);
        this.f23342d = i;
        this.f23339a = i2;
        this.f23340b = str2;
        this.f23343e = str3;
        this.f23344f = str4;
        this.f23345g = z ^ 1;
        this.f23346h = z;
        this.f23347i = i3;
    }

    public PlayLoggerContext(String str, int i, int i2, String str2, String str3, boolean z, String str4, boolean z2, int i3) {
        this.f23341c = str;
        this.f23342d = i;
        this.f23339a = i2;
        this.f23343e = str2;
        this.f23344f = str3;
        this.f23345g = z;
        this.f23340b = str4;
        this.f23346h = z2;
        this.f23347i = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayLoggerContext)) {
            return false;
        }
        PlayLoggerContext playLoggerContext = (PlayLoggerContext) obj;
        return this.f23341c.equals(playLoggerContext.f23341c) && this.f23342d == playLoggerContext.f23342d && this.f23339a == playLoggerContext.f23339a && htl.m3483a(this.f23340b, playLoggerContext.f23340b) && htl.m3483a(this.f23343e, playLoggerContext.f23343e) && htl.m3483a(this.f23344f, playLoggerContext.f23344f) && this.f23345g == playLoggerContext.f23345g && this.f23346h == playLoggerContext.f23346h && this.f23347i == playLoggerContext.f23347i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23341c, Integer.valueOf(this.f23342d), Integer.valueOf(this.f23339a), this.f23340b, this.f23343e, this.f23344f, Boolean.valueOf(this.f23345g), Boolean.valueOf(this.f23346h), Integer.valueOf(this.f23347i)});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("PlayLoggerContext[");
        stringBuilder.append("package=");
        stringBuilder.append(this.f23341c);
        stringBuilder.append(',');
        stringBuilder.append("packageVersionCode=");
        stringBuilder.append(this.f23342d);
        stringBuilder.append(',');
        stringBuilder.append("logSource=");
        stringBuilder.append(this.f23339a);
        stringBuilder.append(',');
        stringBuilder.append("logSourceName=");
        stringBuilder.append(this.f23340b);
        stringBuilder.append(',');
        stringBuilder.append("uploadAccount=");
        stringBuilder.append(this.f23343e);
        stringBuilder.append(',');
        stringBuilder.append("loggingId=");
        stringBuilder.append(this.f23344f);
        stringBuilder.append(',');
        stringBuilder.append("logAndroidId=");
        stringBuilder.append(this.f23345g);
        stringBuilder.append(',');
        stringBuilder.append("isAnonymous=");
        stringBuilder.append(this.f23346h);
        stringBuilder.append(',');
        stringBuilder.append("qosTier=");
        stringBuilder.append(this.f23347i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23341c);
        htl.m3497c(parcel, 3, this.f23342d);
        htl.m3497c(parcel, 4, this.f23339a);
        htl.m3469a(parcel, 5, this.f23343e);
        htl.m3469a(parcel, 6, this.f23344f);
        htl.m3471a(parcel, 7, this.f23345g);
        htl.m3469a(parcel, 8, this.f23340b);
        htl.m3471a(parcel, 9, this.f23346h);
        htl.m3497c(parcel, 10, this.f23347i);
        htl.m3496c(parcel, b);
    }
}
