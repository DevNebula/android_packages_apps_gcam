package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hvd;

public final class Scope extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hvd();
    /* renamed from: a */
    public final String f23353a;
    /* renamed from: b */
    private final int f23354b;

    public Scope(int i, String str) {
        htl.m3461a(str, (Object) "scopeUri must not be null or empty");
        this.f23354b = i;
        this.f23353a = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        return this != obj ? obj instanceof Scope ? this.f23353a.equals(((Scope) obj).f23353a) : false : true;
    }

    public final int hashCode() {
        return this.f23353a.hashCode();
    }

    public final String toString() {
        return this.f23353a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23354b);
        htl.m3469a(parcel, 2, this.f23353a);
        htl.m3496c(parcel, b);
    }
}
