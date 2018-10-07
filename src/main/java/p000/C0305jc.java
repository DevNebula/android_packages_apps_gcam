package p000;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

/* compiled from: PG */
/* renamed from: jc */
final class C0305jc implements ClassLoaderCreator {
    C0305jc() {
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return C0305jc.m4451a(parcel, null);
    }

    /* renamed from: a */
    private static C0304jb m4451a(Parcel parcel, ClassLoader classLoader) {
        if (parcel.readParcelable(classLoader) == null) {
            return C0304jb.f7996d;
        }
        throw new IllegalStateException("superState must be null");
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new C0304jb[i];
    }
}
