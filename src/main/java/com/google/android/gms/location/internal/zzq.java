package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iex;
import p000.iez;
import p000.ifh;
import p000.ifj;
import p000.ifl;
import p000.ifm;
import p000.ifo;

public class zzq extends zza {
    public static final Creator CREATOR = new ifh();
    /* renamed from: a */
    private int f23538a;
    /* renamed from: b */
    private zzo f23539b;
    /* renamed from: c */
    private ifm f23540c;
    /* renamed from: d */
    private PendingIntent f23541d;
    /* renamed from: e */
    private ifj f23542e;
    /* renamed from: f */
    private iex f23543f;

    public zzq(int i, zzo zzo, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        ifm ifm;
        IInterface queryLocalInterface;
        ifj ifj;
        iex iex;
        this.f23538a = i;
        this.f23539b = zzo;
        if (iBinder == null) {
            ifm = null;
        } else if (iBinder != null) {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            ifm = (queryLocalInterface != null && (queryLocalInterface instanceof ifm)) ? (ifm) queryLocalInterface : new ifo(iBinder);
        } else {
            ifm = null;
        }
        this.f23540c = ifm;
        this.f23541d = pendingIntent;
        if (iBinder2 == null) {
            ifj = null;
        } else if (iBinder2 != null) {
            queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            ifj = (queryLocalInterface != null && (queryLocalInterface instanceof ifj)) ? (ifj) queryLocalInterface : new ifl(iBinder2);
        } else {
            ifj = null;
        }
        this.f23542e = ifj;
        if (iBinder3 == null) {
            iex = null;
        } else if (iBinder3 != null) {
            queryLocalInterface = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            iex = (queryLocalInterface != null && (queryLocalInterface instanceof iex)) ? (iex) queryLocalInterface : new iez(iBinder3);
        } else {
            iex = null;
        }
        this.f23543f = iex;
    }

    /* renamed from: a */
    public static zzq m15387a(ifm ifm, iex iex) {
        return new zzq(2, null, ifm.asBinder(), null, null, iex != null ? iex.asBinder() : null);
    }

    public void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder = null;
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23538a);
        htl.m3468a(parcel, 2, this.f23539b, i);
        ifm ifm = this.f23540c;
        htl.m3467a(parcel, 3, ifm != null ? ifm.asBinder() : null);
        htl.m3468a(parcel, 4, this.f23541d, i);
        ifj ifj = this.f23542e;
        htl.m3467a(parcel, 5, ifj != null ? ifj.asBinder() : null);
        iex iex = this.f23543f;
        if (iex != null) {
            iBinder = iex.asBinder();
        }
        htl.m3467a(parcel, 6, iBinder);
        htl.m3496c(parcel, b);
    }
}
