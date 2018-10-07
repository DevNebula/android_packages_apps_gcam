package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;

/* compiled from: PG */
/* renamed from: do */
public final class C0668do extends C0304jb {
    public static final Creator CREATOR = new C0194dp();
    /* renamed from: a */
    public SparseArray f14221a;

    public C0668do(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f14221a = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f14221a.append(iArr[i], readParcelableArray[i]);
        }
    }

    public C0668do(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int size;
        int i2 = 0;
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f14221a;
        if (sparseArray != null) {
            size = sparseArray.size();
        } else {
            size = 0;
        }
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        while (i2 < size) {
            iArr[i2] = this.f14221a.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f14221a.valueAt(i2);
            i2++;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
