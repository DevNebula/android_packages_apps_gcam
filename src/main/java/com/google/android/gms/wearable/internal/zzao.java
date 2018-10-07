package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import p000.htl;
import p000.igi;
import p000.igz;

public class zzao extends zza {
    public static final Creator CREATOR = new igz();
    /* renamed from: a */
    private final Uri f23572a;
    /* renamed from: b */
    private final Map f23573b;
    /* renamed from: c */
    private byte[] f23574c;

    public zzao(Uri uri, Bundle bundle, byte[] bArr) {
        this.f23572a = uri;
        Map hashMap = new HashMap();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (String str : bundle.keySet()) {
            hashMap.put(str, (DataItemAssetParcelable) bundle.getParcelable(str));
        }
        this.f23573b = hashMap;
        this.f23574c = bArr;
    }

    public String toString() {
        boolean isLoggable = Log.isLoggable("DataItem", 3);
        StringBuilder stringBuilder = new StringBuilder("DataItemParcelable[");
        stringBuilder.append("@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f23574c;
        String valueOf = String.valueOf(bArr != null ? Integer.valueOf(bArr.length) : "null");
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
        stringBuilder2.append(",dataSz=");
        stringBuilder2.append(valueOf);
        stringBuilder.append(stringBuilder2.toString());
        int size = this.f23573b.size();
        StringBuilder stringBuilder3 = new StringBuilder(23);
        stringBuilder3.append(", numAssets=");
        stringBuilder3.append(size);
        stringBuilder.append(stringBuilder3.toString());
        valueOf = String.valueOf(this.f23572a);
        stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 6);
        stringBuilder2.append(", uri=");
        stringBuilder2.append(valueOf);
        stringBuilder.append(stringBuilder2.toString());
        if (isLoggable) {
            stringBuilder.append("]\n  assets: ");
            for (String valueOf2 : this.f23573b.keySet()) {
                String valueOf3 = String.valueOf(this.f23573b.get(valueOf2));
                StringBuilder stringBuilder4 = new StringBuilder((String.valueOf(valueOf2).length() + 7) + String.valueOf(valueOf3).length());
                stringBuilder4.append("\n    ");
                stringBuilder4.append(valueOf2);
                stringBuilder4.append(": ");
                stringBuilder4.append(valueOf3);
                stringBuilder.append(stringBuilder4.toString());
            }
            stringBuilder.append("\n  ]");
            return stringBuilder.toString();
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3468a(parcel, 2, this.f23572a, i);
        Bundle bundle = new Bundle();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        for (Entry entry : this.f23573b.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((igi) entry.getValue()));
        }
        htl.m3466a(parcel, 4, bundle);
        htl.m3472a(parcel, 5, this.f23574c);
        htl.m3496c(parcel, b);
    }
}
