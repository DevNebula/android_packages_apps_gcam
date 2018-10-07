package com.google.android.gms.location.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
import p000.htl;
import p000.ifg;

public class zzo extends zza {
    public static final Creator CREATOR = new ifg();
    /* renamed from: a */
    public static final List f23532a = Collections.emptyList();
    /* renamed from: b */
    private LocationRequest f23533b;
    /* renamed from: c */
    private List f23534c;
    /* renamed from: d */
    private String f23535d;
    /* renamed from: e */
    private boolean f23536e;
    /* renamed from: f */
    private boolean f23537f;

    public zzo(LocationRequest locationRequest, List list, String str, boolean z, boolean z2) {
        this.f23533b = locationRequest;
        this.f23534c = list;
        this.f23535d = str;
        this.f23536e = z;
        this.f23537f = z2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zzo)) {
            return false;
        }
        zzo zzo = (zzo) obj;
        return htl.m3483a(this.f23533b, zzo.f23533b) && htl.m3483a(this.f23534c, zzo.f23534c) && htl.m3483a(this.f23535d, zzo.f23535d) && this.f23536e == zzo.f23536e && this.f23537f == zzo.f23537f;
    }

    public int hashCode() {
        return this.f23533b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.f23533b.toString());
        if (this.f23535d != null) {
            stringBuilder.append(" tag=");
            stringBuilder.append(this.f23535d);
        }
        stringBuilder.append(" hideAppOps=");
        stringBuilder.append(this.f23536e);
        stringBuilder.append(" clients=");
        stringBuilder.append(this.f23534c);
        stringBuilder.append(" forceCoarseLocation=");
        stringBuilder.append(this.f23537f);
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3468a(parcel, 1, this.f23533b, i);
        htl.m3470a(parcel, 5, this.f23534c);
        htl.m3469a(parcel, 6, this.f23535d);
        htl.m3471a(parcel, 7, this.f23536e);
        htl.m3471a(parcel, 8, this.f23537f);
        htl.m3496c(parcel, b);
    }
}
