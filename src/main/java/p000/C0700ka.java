package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: ka */
public final class C0700ka extends C0304jb {
    public static final Creator CREATOR = new C0326kb();
    /* renamed from: a */
    public int f21831a;
    /* renamed from: b */
    public Parcelable f21832b;
    /* renamed from: c */
    public ClassLoader f21833c;

    C0700ka(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            classLoader = getClass().getClassLoader();
        }
        this.f21831a = parcel.readInt();
        this.f21832b = parcel.readParcelable(classLoader);
        this.f21833c = classLoader;
    }

    public C0700ka(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("FragmentPager.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" position=");
        stringBuilder.append(this.f21831a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f21831a);
        parcel.writeParcelable(this.f21832b, i);
    }
}
