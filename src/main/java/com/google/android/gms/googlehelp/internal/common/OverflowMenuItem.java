package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hyz;

public final class OverflowMenuItem extends zza {
    public static final Creator CREATOR = new hyz();
    /* renamed from: a */
    private final int f23507a;
    /* renamed from: b */
    private final String f23508b;
    /* renamed from: c */
    private final Intent f23509c;

    public OverflowMenuItem(int i, String str, Intent intent) {
        this.f23507a = i;
        this.f23508b = str;
        this.f23509c = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 2, this.f23507a);
        htl.m3469a(parcel, 3, this.f23508b);
        htl.m3468a(parcel, 4, this.f23509c, i);
        htl.m3496c(parcel, b);
    }
}
