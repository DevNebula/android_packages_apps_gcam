package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzy;

/* renamed from: ija */
public final class ija implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = htl.m3502h(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzy(i);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzy[i];
    }
}
