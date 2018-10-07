package com.google.android.gms.feedback;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.List;
import p000.htl;
import p000.hxx;

public class FeedbackOptions extends zza {
    public static final Creator CREATOR = new hxx();
    /* renamed from: a */
    public String f23454a;
    /* renamed from: b */
    public Bundle f23455b;
    /* renamed from: c */
    public String f23456c;
    /* renamed from: d */
    public ApplicationErrorReport f23457d;
    /* renamed from: e */
    public String f23458e;
    /* renamed from: f */
    public BitmapTeleporter f23459f;
    /* renamed from: g */
    public String f23460g;
    /* renamed from: h */
    public List f23461h;
    /* renamed from: i */
    public boolean f23462i;
    /* renamed from: j */
    public ThemeSettings f23463j;
    /* renamed from: k */
    public LogOptions f23464k;

    public FeedbackOptions(ApplicationErrorReport applicationErrorReport) {
        this(null, null, null, applicationErrorReport, null, null, null, null, true, null, null);
    }

    public FeedbackOptions(String str, Bundle bundle, String str2, ApplicationErrorReport applicationErrorReport, String str3, BitmapTeleporter bitmapTeleporter, String str4, List list, boolean z, ThemeSettings themeSettings, LogOptions logOptions) {
        this.f23454a = str;
        this.f23455b = bundle;
        this.f23456c = str2;
        this.f23457d = applicationErrorReport;
        this.f23458e = str3;
        this.f23459f = bitmapTeleporter;
        this.f23460g = str4;
        this.f23461h = list;
        this.f23462i = z;
        this.f23463j = themeSettings;
        this.f23464k = logOptions;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3469a(parcel, 2, this.f23454a);
        htl.m3466a(parcel, 3, this.f23455b);
        htl.m3469a(parcel, 5, this.f23456c);
        htl.m3468a(parcel, 6, this.f23457d, i);
        htl.m3469a(parcel, 7, this.f23458e);
        htl.m3468a(parcel, 8, this.f23459f, i);
        htl.m3469a(parcel, 9, this.f23460g);
        htl.m3470a(parcel, 10, this.f23461h);
        htl.m3471a(parcel, 11, this.f23462i);
        htl.m3468a(parcel, 12, this.f23463j, i);
        htl.m3468a(parcel, 13, this.f23464k, i);
        htl.m3496c(parcel, b);
    }

    /* renamed from: a */
    public static /* synthetic */ FeedbackOptions m15368a(FeedbackOptions feedbackOptions) {
        return feedbackOptions;
    }
}
