package com.google.android.gms.feedback;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.hxw;

public class ErrorReport extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hxw();
    /* renamed from: A */
    private int f23398A;
    /* renamed from: B */
    private String f23399B;
    /* renamed from: C */
    private String f23400C;
    /* renamed from: D */
    private String f23401D;
    /* renamed from: E */
    private String f23402E;
    /* renamed from: F */
    private String f23403F;
    /* renamed from: G */
    private String[] f23404G;
    /* renamed from: H */
    private String[] f23405H;
    /* renamed from: I */
    private String[] f23406I;
    /* renamed from: J */
    private String f23407J;
    /* renamed from: K */
    private String f23408K;
    /* renamed from: L */
    private byte[] f23409L;
    /* renamed from: M */
    private int f23410M;
    /* renamed from: N */
    private int f23411N;
    /* renamed from: O */
    private int f23412O;
    /* renamed from: P */
    private int f23413P;
    /* renamed from: Q */
    private String f23414Q;
    /* renamed from: R */
    private String f23415R;
    /* renamed from: S */
    private boolean f23416S;
    /* renamed from: T */
    private int f23417T;
    /* renamed from: U */
    private int f23418U;
    /* renamed from: V */
    private boolean f23419V;
    @Deprecated
    /* renamed from: W */
    private String f23420W;
    /* renamed from: X */
    private String f23421X;
    /* renamed from: Y */
    private String f23422Y;
    /* renamed from: Z */
    private String[] f23423Z;
    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public ApplicationErrorReport f23424a = new ApplicationErrorReport();
    /* renamed from: aa */
    private String f23425aa;
    /* renamed from: ab */
    private boolean f23426ab;
    /* renamed from: ac */
    private Bundle f23427ac;
    /* renamed from: ad */
    private List f23428ad;
    /* renamed from: b */
    public String f23429b;
    /* renamed from: c */
    public String f23430c;
    /* renamed from: d */
    public Bundle f23431d;
    /* renamed from: e */
    public String f23432e;
    /* renamed from: f */
    public String f23433f;
    /* renamed from: g */
    public int f23434g;
    /* renamed from: h */
    public String f23435h;
    /* renamed from: i */
    public String f23436i;
    /* renamed from: j */
    public String f23437j;
    /* renamed from: k */
    public String f23438k;
    /* renamed from: l */
    public String f23439l;
    /* renamed from: m */
    public BitmapTeleporter f23440m;
    /* renamed from: n */
    public FileTeleporter[] f23441n;
    /* renamed from: o */
    public boolean f23442o;
    /* renamed from: p */
    public String f23443p;
    /* renamed from: q */
    public ThemeSettings f23444q;
    /* renamed from: r */
    public LogOptions f23445r;
    /* renamed from: s */
    private int f23446s;
    /* renamed from: t */
    private String f23447t;
    /* renamed from: u */
    private String f23448u;
    /* renamed from: v */
    private String f23449v;
    /* renamed from: w */
    private String f23450w;
    /* renamed from: x */
    private String f23451x;
    /* renamed from: y */
    private String f23452y;
    /* renamed from: z */
    private String f23453z;

    @TargetApi(14)
    public ErrorReport(ApplicationErrorReport applicationErrorReport, String str, int i, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, String str9, String str10, String str11, String str12, String str13, String[] strArr, String[] strArr2, String[] strArr3, String str14, String str15, byte[] bArr, int i3, int i4, int i5, int i6, String str16, String str17, String str18, Bundle bundle, boolean z, int i7, int i8, boolean z2, String str19, String str20, int i9, String str21, String str22, String str23, String str24, String str25, String str26, String str27, BitmapTeleporter bitmapTeleporter, String str28, FileTeleporter[] fileTeleporterArr, String[] strArr4, boolean z3, String str29, ThemeSettings themeSettings, LogOptions logOptions, String str30, boolean z4, Bundle bundle2, List list) {
        this.f23424a = applicationErrorReport;
        this.f23429b = str;
        this.f23446s = i;
        this.f23447t = str2;
        this.f23448u = str3;
        this.f23449v = str4;
        this.f23450w = str5;
        this.f23451x = str6;
        this.f23452y = str7;
        this.f23453z = str8;
        this.f23398A = i2;
        this.f23399B = str9;
        this.f23400C = str10;
        this.f23401D = str11;
        this.f23402E = str12;
        this.f23403F = str13;
        this.f23404G = strArr;
        this.f23405H = strArr2;
        this.f23406I = strArr3;
        this.f23407J = str14;
        this.f23408K = str15;
        this.f23409L = bArr;
        this.f23410M = i3;
        this.f23411N = i4;
        this.f23412O = i5;
        this.f23413P = i6;
        this.f23414Q = str16;
        this.f23430c = str17;
        this.f23415R = str18;
        this.f23431d = bundle;
        this.f23416S = z;
        this.f23417T = i7;
        this.f23418U = i8;
        this.f23419V = z2;
        this.f23432e = str19;
        this.f23433f = str20;
        this.f23434g = i9;
        this.f23435h = str21;
        this.f23436i = str22;
        this.f23437j = str23;
        this.f23438k = str24;
        this.f23439l = str25;
        this.f23420W = str26;
        this.f23421X = str27;
        this.f23440m = bitmapTeleporter;
        this.f23422Y = str28;
        this.f23441n = fileTeleporterArr;
        this.f23423Z = strArr4;
        this.f23442o = z3;
        this.f23443p = str29;
        this.f23444q = themeSettings;
        this.f23445r = logOptions;
        this.f23425aa = str30;
        this.f23426ab = z4;
        this.f23427ac = bundle2;
        this.f23428ad = list;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3468a(parcel, 2, this.f23424a, i);
        htl.m3469a(parcel, 3, this.f23429b);
        htl.m3497c(parcel, 4, this.f23446s);
        htl.m3469a(parcel, 5, this.f23447t);
        htl.m3469a(parcel, 6, this.f23448u);
        htl.m3469a(parcel, 7, this.f23449v);
        htl.m3469a(parcel, 8, this.f23450w);
        htl.m3469a(parcel, 9, this.f23451x);
        htl.m3469a(parcel, 10, this.f23452y);
        htl.m3469a(parcel, 11, this.f23453z);
        htl.m3497c(parcel, 12, this.f23398A);
        htl.m3469a(parcel, 13, this.f23399B);
        htl.m3469a(parcel, 14, this.f23400C);
        htl.m3469a(parcel, 15, this.f23401D);
        htl.m3469a(parcel, 16, this.f23402E);
        htl.m3469a(parcel, 17, this.f23403F);
        htl.m3475a(parcel, 18, this.f23404G);
        htl.m3475a(parcel, 19, this.f23405H);
        htl.m3475a(parcel, 20, this.f23406I);
        htl.m3469a(parcel, 21, this.f23407J);
        htl.m3469a(parcel, 22, this.f23408K);
        htl.m3472a(parcel, 23, this.f23409L);
        htl.m3497c(parcel, 24, this.f23410M);
        htl.m3497c(parcel, 25, this.f23411N);
        htl.m3497c(parcel, 26, this.f23412O);
        htl.m3497c(parcel, 27, this.f23413P);
        htl.m3469a(parcel, 28, this.f23414Q);
        htl.m3469a(parcel, 29, this.f23430c);
        htl.m3469a(parcel, 30, this.f23415R);
        htl.m3466a(parcel, 31, this.f23431d);
        htl.m3471a(parcel, 32, this.f23416S);
        htl.m3497c(parcel, 33, this.f23417T);
        htl.m3497c(parcel, 34, this.f23418U);
        htl.m3471a(parcel, 35, this.f23419V);
        htl.m3469a(parcel, 36, this.f23432e);
        htl.m3469a(parcel, 37, this.f23433f);
        htl.m3497c(parcel, 38, this.f23434g);
        htl.m3469a(parcel, 39, this.f23435h);
        htl.m3469a(parcel, 40, this.f23436i);
        htl.m3469a(parcel, 41, this.f23437j);
        htl.m3469a(parcel, 42, this.f23438k);
        htl.m3469a(parcel, 43, this.f23439l);
        htl.m3469a(parcel, 44, this.f23420W);
        htl.m3469a(parcel, 45, this.f23421X);
        htl.m3468a(parcel, 46, this.f23440m, i);
        htl.m3469a(parcel, 47, this.f23422Y);
        htl.m3474a(parcel, 48, this.f23441n, i);
        htl.m3475a(parcel, 49, this.f23423Z);
        htl.m3471a(parcel, 50, this.f23442o);
        htl.m3469a(parcel, 51, this.f23443p);
        htl.m3468a(parcel, 52, this.f23444q, i);
        htl.m3468a(parcel, 53, this.f23445r, i);
        htl.m3469a(parcel, 54, this.f23425aa);
        htl.m3471a(parcel, 55, this.f23426ab);
        htl.m3466a(parcel, 56, this.f23427ac);
        htl.m3470a(parcel, 57, this.f23428ad);
        htl.m3496c(parcel, b);
    }
}
