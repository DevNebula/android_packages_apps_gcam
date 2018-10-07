package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.zzc;
import p000.htl;
import p000.huc;
import p000.hvh;
import p000.hwb;
import p000.hwl;

public class zzj extends zza {
    public static final Creator CREATOR = new hwb();
    /* renamed from: a */
    public String f23387a;
    /* renamed from: b */
    public IBinder f23388b;
    /* renamed from: c */
    public Scope[] f23389c;
    /* renamed from: d */
    public Bundle f23390d;
    /* renamed from: e */
    public Account f23391e;
    /* renamed from: f */
    public zzc[] f23392f;
    /* renamed from: g */
    private final int f23393g;
    /* renamed from: h */
    private final int f23394h;
    /* renamed from: i */
    private int f23395i;

    public zzj(int i) {
        this.f23393g = 3;
        this.f23395i = huc.f7033c;
        this.f23394h = i;
    }

    public zzj(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, zzc[] zzcArr) {
        this.f23393g = i;
        this.f23394h = i2;
        this.f23395i = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f23387a = "com.google.android.gms";
        } else {
            this.f23387a = str;
        }
        if (i >= 2) {
            this.f23388b = iBinder;
            this.f23391e = account;
        } else {
            this.f23391e = iBinder != null ? hvh.m16260a(hwl.m12250a(iBinder)) : null;
        }
        this.f23389c = scopeArr;
        this.f23390d = bundle;
        this.f23392f = zzcArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23393g);
        htl.m3497c(parcel, 2, this.f23394h);
        htl.m3497c(parcel, 3, this.f23395i);
        htl.m3469a(parcel, 4, this.f23387a);
        htl.m3467a(parcel, 5, this.f23388b);
        htl.m3474a(parcel, 6, this.f23389c, i);
        htl.m3466a(parcel, 7, this.f23390d);
        htl.m3468a(parcel, 8, this.f23391e, i);
        htl.m3474a(parcel, 10, this.f23392f, i);
        htl.m3496c(parcel, b);
    }
}
