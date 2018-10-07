package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.ifp;

public final class LocationRequest extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new ifp();
    /* renamed from: a */
    public int f23521a;
    /* renamed from: b */
    public long f23522b;
    /* renamed from: c */
    public long f23523c;
    /* renamed from: d */
    public boolean f23524d;
    /* renamed from: e */
    private long f23525e;
    /* renamed from: f */
    private int f23526f;
    /* renamed from: g */
    private float f23527g;
    /* renamed from: h */
    private long f23528h;

    public LocationRequest() {
        this.f23521a = 102;
        this.f23522b = 3600000;
        this.f23523c = 600000;
        this.f23524d = false;
        this.f23525e = Long.MAX_VALUE;
        this.f23526f = LfuScheduler.MAX_PRIORITY;
        this.f23527g = 0.0f;
        this.f23528h = 0;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.f23521a = i;
        this.f23522b = j;
        this.f23523c = j2;
        this.f23524d = z;
        this.f23525e = j3;
        this.f23526f = i2;
        this.f23527g = f;
        this.f23528h = j4;
    }

    /* renamed from: a */
    public static void m15383a() {
    }

    /* renamed from: a */
    public static void m15384a(long j) {
        if (j < 0) {
            StringBuilder stringBuilder = new StringBuilder(38);
            stringBuilder.append("invalid interval: ");
            stringBuilder.append(j);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: b */
    private final long m15385b() {
        long j = this.f23528h;
        long j2 = this.f23522b;
        return j >= j2 ? j : j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationRequest)) {
            return false;
        }
        LocationRequest locationRequest = (LocationRequest) obj;
        return this.f23521a == locationRequest.f23521a && this.f23522b == locationRequest.f23522b && this.f23523c == locationRequest.f23523c && this.f23524d == locationRequest.f23524d && this.f23525e == locationRequest.f23525e && this.f23526f == locationRequest.f23526f && this.f23527g == locationRequest.f23527g && m15385b() == locationRequest.m15385b();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23521a), Long.valueOf(this.f23522b), Float.valueOf(this.f23527g), Long.valueOf(this.f23528h)});
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Request[");
        switch (this.f23521a) {
            case 100:
                str = "PRIORITY_HIGH_ACCURACY";
                break;
            case 102:
                str = "PRIORITY_BALANCED_POWER_ACCURACY";
                break;
            case 104:
                str = "PRIORITY_LOW_POWER";
                break;
            case 105:
                str = "PRIORITY_NO_POWER";
                break;
            default:
                str = "???";
                break;
        }
        stringBuilder.append(str);
        if (this.f23521a != 105) {
            stringBuilder.append(" requested=");
            stringBuilder.append(this.f23522b);
            stringBuilder.append("ms");
        }
        stringBuilder.append(" fastest=");
        stringBuilder.append(this.f23523c);
        stringBuilder.append("ms");
        if (this.f23528h > this.f23522b) {
            stringBuilder.append(" maxWait=");
            stringBuilder.append(this.f23528h);
            stringBuilder.append("ms");
        }
        if (this.f23527g > 0.0f) {
            stringBuilder.append(" smallestDisplacement=");
            stringBuilder.append(this.f23527g);
            stringBuilder.append("m");
        }
        long j = this.f23525e;
        if (j != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            stringBuilder.append(" expireIn=");
            stringBuilder.append(j - elapsedRealtime);
            stringBuilder.append("ms");
        }
        if (this.f23526f != LfuScheduler.MAX_PRIORITY) {
            stringBuilder.append(" num=");
            stringBuilder.append(this.f23526f);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23521a);
        htl.m3465a(parcel, 2, this.f23522b);
        htl.m3465a(parcel, 3, this.f23523c);
        htl.m3471a(parcel, 4, this.f23524d);
        htl.m3465a(parcel, 5, this.f23525e);
        htl.m3497c(parcel, 6, this.f23526f);
        float f = this.f23527g;
        htl.m3491b(parcel, 7, 4);
        parcel.writeFloat(f);
        htl.m3465a(parcel, 8, this.f23528h);
        htl.m3496c(parcel, b);
    }
}
