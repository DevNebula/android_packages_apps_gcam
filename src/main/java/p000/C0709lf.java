package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: lf */
public final class C0709lf extends C0304jb {
    public static final Creator CREATOR = new C0349lg();
    /* renamed from: a */
    public int f22029a = 0;
    /* renamed from: b */
    public int f22030b;
    /* renamed from: c */
    public int f22031c;
    /* renamed from: f */
    public int f22032f;
    /* renamed from: g */
    public int f22033g;

    public C0709lf(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f22029a = parcel.readInt();
        this.f22030b = parcel.readInt();
        this.f22031c = parcel.readInt();
        this.f22032f = parcel.readInt();
        this.f22033g = parcel.readInt();
    }

    public C0709lf(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22029a);
        parcel.writeInt(this.f22030b);
        parcel.writeInt(this.f22031c);
        parcel.writeInt(this.f22032f);
        parcel.writeInt(this.f22033g);
    }
}
