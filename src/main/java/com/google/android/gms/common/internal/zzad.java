package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.hvj;

public class zzad extends zza {
    public static final Creator CREATOR = new hvj();
    /* renamed from: a */
    private final int f23378a;
    /* renamed from: b */
    private final Account f23379b;
    /* renamed from: c */
    private final int f23380c;
    /* renamed from: d */
    private final GoogleSignInAccount f23381d;

    public zzad(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f23378a = i;
        this.f23379b = account;
        this.f23380c = i2;
        this.f23381d = googleSignInAccount;
    }

    public zzad(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23378a);
        htl.m3468a(parcel, 2, this.f23379b, i);
        htl.m3497c(parcel, 3, this.f23380c);
        htl.m3468a(parcel, 4, this.f23381d, i);
        htl.m3496c(parcel, b);
    }
}
