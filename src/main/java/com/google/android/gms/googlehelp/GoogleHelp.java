package com.google.android.gms.googlehelp;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.ArrayList;
import java.util.List;
import p000.htl;
import p000.hzi;

public final class GoogleHelp extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hzi();
    /* renamed from: A */
    private int f23475A;
    /* renamed from: B */
    private PendingIntent f23476B;
    /* renamed from: a */
    public Bundle f23477a;
    /* renamed from: b */
    public Uri f23478b;
    /* renamed from: c */
    public TogglingData f23479c;
    /* renamed from: d */
    public int f23480d;
    /* renamed from: e */
    public boolean f23481e;
    /* renamed from: f */
    public boolean f23482f;
    /* renamed from: g */
    private final int f23483g;
    /* renamed from: h */
    private String f23484h;
    /* renamed from: i */
    private Account f23485i;
    /* renamed from: j */
    private String f23486j;
    /* renamed from: k */
    private String f23487k;
    /* renamed from: l */
    private Bitmap f23488l;
    /* renamed from: m */
    private boolean f23489m;
    /* renamed from: n */
    private boolean f23490n;
    /* renamed from: o */
    private List f23491o;
    @Deprecated
    /* renamed from: p */
    private Bundle f23492p;
    @Deprecated
    /* renamed from: q */
    private Bitmap f23493q;
    @Deprecated
    /* renamed from: r */
    private byte[] f23494r;
    @Deprecated
    /* renamed from: s */
    private int f23495s;
    @Deprecated
    /* renamed from: t */
    private int f23496t;
    /* renamed from: u */
    private String f23497u;
    /* renamed from: v */
    private List f23498v;
    /* renamed from: w */
    private ThemeSettings f23499w;
    /* renamed from: x */
    private List f23500x;
    /* renamed from: y */
    private boolean f23501y;
    /* renamed from: z */
    private ErrorReport f23502z;

    public GoogleHelp(int i, String str, Account account, Bundle bundle, String str2, String str3, Bitmap bitmap, boolean z, boolean z2, List list, Bundle bundle2, Bitmap bitmap2, byte[] bArr, int i2, int i3, String str4, Uri uri, List list2, int i4, ThemeSettings themeSettings, List list3, boolean z3, ErrorReport errorReport, TogglingData togglingData, int i5, PendingIntent pendingIntent, int i6, boolean z4, boolean z5) {
        this.f23502z = new ErrorReport();
        this.f23483g = i;
        this.f23480d = i6;
        this.f23481e = z4;
        this.f23482f = z5;
        this.f23484h = str;
        this.f23485i = account;
        this.f23477a = bundle;
        this.f23486j = str2;
        this.f23487k = str3;
        this.f23488l = bitmap;
        this.f23489m = z;
        this.f23490n = z2;
        this.f23491o = list;
        this.f23476B = pendingIntent;
        this.f23492p = bundle2;
        this.f23493q = bitmap2;
        this.f23494r = bArr;
        this.f23495s = i2;
        this.f23496t = i3;
        this.f23497u = str4;
        this.f23478b = uri;
        this.f23498v = list2;
        if (this.f23483g < 4) {
            ThemeSettings themeSettings2 = new ThemeSettings();
            themeSettings2.f23471a = i4;
            this.f23499w = themeSettings2;
        } else {
            if (themeSettings == null) {
                themeSettings = new ThemeSettings();
            }
            this.f23499w = themeSettings;
        }
        this.f23500x = list3;
        this.f23501y = z3;
        this.f23502z = errorReport;
        ErrorReport errorReport2 = this.f23502z;
        if (errorReport2 != null) {
            errorReport2.f23443p = "GoogleHelp";
        }
        this.f23479c = togglingData;
        this.f23475A = i5;
    }

    public GoogleHelp(String str) {
        this(11, str, null, null, null, null, null, true, true, new ArrayList(), null, null, null, 0, 0, null, null, new ArrayList(), 0, null, new ArrayList(), false, new ErrorReport(), null, 0, null, -1, false, false);
    }

    /* renamed from: a */
    public final GoogleHelp mo14659a(int i, String str, Intent intent) {
        this.f23498v.add(new OverflowMenuItem(i, str, intent));
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23483g);
        htl.m3469a(parcel, 2, this.f23484h);
        htl.m3468a(parcel, 3, this.f23485i, i);
        htl.m3466a(parcel, 4, this.f23477a);
        htl.m3471a(parcel, 5, this.f23489m);
        htl.m3471a(parcel, 6, this.f23490n);
        List list = this.f23491o;
        if (list != null) {
            int b2 = htl.m3487b(parcel, 7);
            parcel.writeStringList(list);
            htl.m3496c(parcel, b2);
        }
        htl.m3466a(parcel, 10, this.f23492p);
        htl.m3468a(parcel, 11, this.f23493q, i);
        htl.m3469a(parcel, 14, this.f23497u);
        htl.m3468a(parcel, 15, this.f23478b, i);
        htl.m3470a(parcel, 16, this.f23498v);
        htl.m3497c(parcel, 17, 0);
        htl.m3470a(parcel, 18, this.f23500x);
        htl.m3472a(parcel, 19, this.f23494r);
        htl.m3497c(parcel, 20, this.f23495s);
        htl.m3497c(parcel, 21, this.f23496t);
        htl.m3471a(parcel, 22, this.f23501y);
        htl.m3468a(parcel, 23, this.f23502z, i);
        htl.m3468a(parcel, 25, this.f23499w, i);
        htl.m3469a(parcel, 28, this.f23486j);
        htl.m3468a(parcel, 31, this.f23479c, i);
        htl.m3497c(parcel, 32, this.f23475A);
        htl.m3468a(parcel, 33, this.f23476B, i);
        htl.m3469a(parcel, 34, this.f23487k);
        htl.m3468a(parcel, 35, this.f23488l, i);
        htl.m3497c(parcel, 36, this.f23480d);
        htl.m3471a(parcel, 37, this.f23481e);
        htl.m3471a(parcel, 38, this.f23482f);
        htl.m3496c(parcel, b);
    }
}
