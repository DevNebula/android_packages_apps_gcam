package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: us */
public final class C0765us extends C0304jb {
    public static final Creator CREATOR = new C0526ut();
    /* renamed from: a */
    public Parcelable f22342a;

    C0765us(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = C0517ug.class.getClassLoader();
        }
        this.f22342a = parcel.readParcelable(classLoader);
    }

    public C0765us(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f22342a, 0);
    }
}
