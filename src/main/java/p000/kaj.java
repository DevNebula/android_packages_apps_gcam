package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: kaj */
public final class kaj implements Parcelable, Comparable {
    public static final Creator CREATOR = new kak();
    /* renamed from: a */
    public final String f8535a;
    /* renamed from: b */
    public final long f8536b;
    /* renamed from: c */
    public final int f8537c;
    /* renamed from: d */
    public final String f8538d;

    kaj(Parcel parcel) {
        this.f8535a = parcel.readString();
        this.f8536b = parcel.readLong();
        this.f8537c = parcel.readInt();
        this.f8538d = parcel.readString();
    }

    public kaj(String str, long j, int i, String str2) {
        this.f8535a = str;
        this.f8536b = j;
        this.f8537c = i;
        this.f8538d = str2;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        return this.f8535a.compareToIgnoreCase(((kaj) obj).f8535a);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f8535a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8535a);
        parcel.writeLong(this.f8536b);
        parcel.writeInt(this.f8537c);
        parcel.writeString(this.f8538d);
    }
}
