package com.google.android.gms.googlehelp;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hzo;

public final class OfflineSuggestion extends zza {
    public static final Creator CREATOR = new hzo();
    /* renamed from: a */
    private final String f23503a;
    /* renamed from: b */
    private final String f23504b;
    /* renamed from: c */
    private final String f23505c;
    /* renamed from: d */
    private final String f23506d;

    public OfflineSuggestion(String str, String str2, String str3, String str4) {
        this.f23503a = str;
        this.f23504b = str2;
        this.f23505c = str4;
        this.f23506d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23503a);
        htl.m3469a(parcel, 3, this.f23504b);
        htl.m3469a(parcel, 4, this.f23505c);
        htl.m3469a(parcel, 5, this.f23506d);
        htl.m3496c(parcel, b);
    }
}
