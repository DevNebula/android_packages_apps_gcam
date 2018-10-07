package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p000.htl;
import p000.ijd;

public class PutDataRequest extends zza {
    public static final Creator CREATOR = new ijd();
    /* renamed from: d */
    private static final long f23557d = TimeUnit.MINUTES.toMillis(30);
    /* renamed from: a */
    public final Uri f23558a;
    /* renamed from: b */
    public byte[] f23559b;
    /* renamed from: c */
    public long f23560c;
    /* renamed from: e */
    private final Bundle f23561e;

    static {
        SecureRandom secureRandom = new SecureRandom();
    }

    private PutDataRequest(Uri uri) {
        this(uri, new Bundle(), null, f23557d);
    }

    public PutDataRequest(Uri uri, Bundle bundle, byte[] bArr, long j) {
        this.f23558a = uri;
        this.f23561e = bundle;
        this.f23561e.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        this.f23559b = bArr;
        this.f23560c = j;
    }

    /* renamed from: a */
    public static PutDataRequest m15390a(Uri uri) {
        return new PutDataRequest(uri);
    }

    /* renamed from: a */
    public static PutDataRequest m15391a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("An empty path was supplied.");
        } else if (!str.startsWith("/")) {
            throw new IllegalArgumentException("A path must start with a single / .");
        } else if (!str.startsWith("//")) {
            return m15390a(new Builder().scheme("wear").path(str).build());
        } else {
            throw new IllegalArgumentException("A path must start with a single / .");
        }
    }

    /* renamed from: a */
    public final PutDataRequest mo14689a(String str, Asset asset) {
        htl.m3488b((Object) str);
        htl.m3488b((Object) asset);
        this.f23561e.putParcelable(str, asset);
        return this;
    }

    /* renamed from: a */
    public final Map mo14690a() {
        Map hashMap = new HashMap();
        for (String str : this.f23561e.keySet()) {
            hashMap.put(str, (Asset) this.f23561e.getParcelable(str));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    public String toString() {
        boolean isLoggable = Log.isLoggable("DataMap", 3);
        StringBuilder stringBuilder = new StringBuilder("PutDataRequest[");
        byte[] bArr = this.f23559b;
        String valueOf = String.valueOf(bArr != null ? Integer.valueOf(bArr.length) : "null");
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 7);
        stringBuilder2.append("dataSz=");
        stringBuilder2.append(valueOf);
        stringBuilder.append(stringBuilder2.toString());
        int size = this.f23561e.size();
        StringBuilder stringBuilder3 = new StringBuilder(23);
        stringBuilder3.append(", numAssets=");
        stringBuilder3.append(size);
        stringBuilder.append(stringBuilder3.toString());
        valueOf = String.valueOf(this.f23558a);
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 6);
        stringBuilder2.append(", uri=");
        stringBuilder2.append(valueOf);
        stringBuilder.append(stringBuilder2.toString());
        long j = this.f23560c;
        StringBuilder stringBuilder4 = new StringBuilder(35);
        stringBuilder4.append(", syncDeadline=");
        stringBuilder4.append(j);
        stringBuilder.append(stringBuilder4.toString());
        if (isLoggable) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.f23561e.keySet()) {
                String valueOf3 = String.valueOf(this.f23561e.getParcelable(valueOf2));
                StringBuilder stringBuilder5 = new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length());
                stringBuilder5.append("\n    ");
                stringBuilder5.append(valueOf2);
                stringBuilder5.append(": ");
                stringBuilder5.append(valueOf3);
                stringBuilder.append(stringBuilder5.toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3468a(parcel, 2, this.f23558a, i);
        htl.m3466a(parcel, 4, this.f23561e);
        htl.m3472a(parcel, 5, this.f23559b);
        htl.m3465a(parcel, 6, this.f23560c);
        htl.m3496c(parcel, b);
    }
}
