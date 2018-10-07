package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

/* compiled from: PG */
/* renamed from: lm */
public final class C0352lm extends BaseSavedState {
    public static final Creator CREATOR = new C0353ln();
    /* renamed from: a */
    public int f9149a;

    C0352lm(Parcel parcel) {
        super(parcel);
        this.f9149a = parcel.readInt();
    }

    public C0352lm(Parcelable parcelable) {
        super(parcelable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("HorizontalScrollView.SavedState{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" scrollPosition=");
        stringBuilder.append(this.f9149a);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f9149a);
    }
}
