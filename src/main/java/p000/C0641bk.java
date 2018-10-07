package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: bk */
public final class C0641bk extends C0304jb {
    public static final Creator CREATOR = new C0058bl();
    /* renamed from: a */
    public final int f11484a;

    public C0641bk(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f11484a = parcel.readInt();
    }

    public C0641bk(Parcelable parcelable, int i) {
        super(parcelable);
        this.f11484a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f11484a);
    }
}
