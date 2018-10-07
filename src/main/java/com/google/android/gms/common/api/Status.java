package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.hux;
import p000.hve;
import p000.hvi;

public final class Status extends zza implements ReflectedParcelable, hux {
    public static final Creator CREATOR = new hve();
    /* renamed from: a */
    public static final Status f23355a = new Status(0);
    /* renamed from: b */
    public static final Status f23356b = new Status(8);
    /* renamed from: c */
    public static final Status f23357c = new Status(15);
    /* renamed from: d */
    public static final Status f23358d = new Status(16);
    /* renamed from: e */
    public final int f23359e;
    /* renamed from: f */
    public final String f23360f;
    /* renamed from: g */
    private final int f23361g;
    /* renamed from: h */
    private final PendingIntent f23362h;

    static {
        Status status = new Status(14);
        status = new Status(17);
        status = new Status(18);
    }

    public Status(int i) {
        this(i, null);
    }

    public Status(int i, int i2, String str, PendingIntent pendingIntent) {
        this.f23361g = i;
        this.f23359e = i2;
        this.f23360f = str;
        this.f23362h = pendingIntent;
    }

    public Status(int i, String str) {
        this(1, i, str, null);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(1, i, str, pendingIntent);
    }

    /* renamed from: a */
    public final Status mo8154a() {
        return this;
    }

    /* renamed from: b */
    public final boolean mo14640b() {
        return this.f23359e <= 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f23361g == status.f23361g && this.f23359e == status.f23359e && htl.m3483a(this.f23360f, status.f23360f) && htl.m3483a(this.f23362h, status.f23362h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23361g), Integer.valueOf(this.f23359e), this.f23360f, this.f23362h});
    }

    public final String toString() {
        hvi a = htl.m3455a((Object) this);
        Object obj = this.f23360f;
        if (obj == null) {
            obj = htl.m3458a(this.f23359e);
        }
        return a.mo8170a("statusCode", obj).mo8170a("resolution", this.f23362h).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23359e);
        htl.m3469a(parcel, 2, this.f23360f);
        htl.m3468a(parcel, 3, this.f23362h, i);
        htl.m3497c(parcel, 1000, this.f23361g);
        htl.m3496c(parcel, b);
    }
}
