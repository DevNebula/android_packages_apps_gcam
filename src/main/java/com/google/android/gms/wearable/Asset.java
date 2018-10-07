package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.ijb;

public class Asset extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new ijb();
    /* renamed from: a */
    public byte[] f23544a;
    /* renamed from: b */
    public String f23545b;
    /* renamed from: c */
    public ParcelFileDescriptor f23546c;
    /* renamed from: d */
    public Uri f23547d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f23544a = bArr;
        this.f23545b = str;
        this.f23546c = parcelFileDescriptor;
        this.f23547d = uri;
    }

    /* renamed from: a */
    public static Asset m15388a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            return new Asset(null, null, parcelFileDescriptor, null);
        }
        throw new IllegalArgumentException("Asset fd cannot be null");
    }

    /* renamed from: a */
    public static Asset m15389a(byte[] bArr) {
        if (bArr != null) {
            return new Asset(bArr, null, null, null);
        }
        throw new IllegalArgumentException("Asset data cannot be null");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f23544a, asset.f23544a) && htl.m3483a(this.f23545b, asset.f23545b) && htl.m3483a(this.f23546c, asset.f23546c) && htl.m3483a(this.f23547d, asset.f23547d);
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f23544a, this.f23545b, this.f23546c, this.f23547d});
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Asset[@");
        stringBuilder.append(Integer.toHexString(hashCode()));
        if (this.f23545b != null) {
            stringBuilder.append(", ");
            stringBuilder.append(this.f23545b);
        } else {
            stringBuilder.append(", nodigest");
        }
        if (this.f23544a != null) {
            stringBuilder.append(", size=");
            stringBuilder.append(this.f23544a.length);
        }
        if (this.f23546c != null) {
            stringBuilder.append(", fd=");
            stringBuilder.append(this.f23546c);
        }
        if (this.f23547d != null) {
            stringBuilder.append(", uri=");
            stringBuilder.append(this.f23547d);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = i | 1;
        int b = htl.m3487b(parcel, 20293);
        htl.m3472a(parcel, 2, this.f23544a);
        htl.m3469a(parcel, 3, this.f23545b);
        htl.m3468a(parcel, 4, this.f23546c, i2);
        htl.m3468a(parcel, 5, this.f23547d, i2);
        htl.m3496c(parcel, b);
    }
}
