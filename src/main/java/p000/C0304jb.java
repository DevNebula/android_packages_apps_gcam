package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: jb */
public class C0304jb implements Parcelable {
    public static final Creator CREATOR = new C0305jc();
    /* renamed from: d */
    public static final C0304jb f7996d = new C0304jb((byte) 0);
    /* renamed from: e */
    public final Parcelable f7997e;

    private C0304jb() {
        this.f7997e = null;
    }

    private C0304jb(byte b) {
        this();
    }

    public C0304jb(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        if (readParcelable == null) {
            readParcelable = f7996d;
        }
        this.f7997e = readParcelable;
    }

    public C0304jb(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        if (parcelable == f7996d) {
            parcelable = null;
        }
        this.f7997e = parcelable;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f7997e, i);
    }
}
