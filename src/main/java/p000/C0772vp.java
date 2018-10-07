package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: vp */
public final class C0772vp extends C0304jb {
    public static final Creator CREATOR = new C0543vq();
    /* renamed from: a */
    public int f22351a;
    /* renamed from: b */
    public boolean f22352b;

    public C0772vp(Parcel parcel, ClassLoader classLoader) {
        boolean z;
        super(parcel, classLoader);
        this.f22351a = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f22352b = z;
    }

    public C0772vp(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f22351a);
        parcel.writeInt(this.f22352b);
    }
}
