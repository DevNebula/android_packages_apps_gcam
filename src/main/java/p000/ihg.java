package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzbe;

/* renamed from: ihg */
public final class ihg implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        int a = htl.m3449a(parcel);
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 3:
                    z2 = htl.m3500f(parcel, readInt);
                    break;
                case 4:
                    z = htl.m3500f(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzbe(i, z2, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbe[i];
    }
}
