package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzav;
import com.google.android.gms.wearable.internal.zzo;

/* renamed from: ihc */
public final class ihc implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        zzo zzo = null;
        while (parcel.dataPosition() < a) {
            zzo zzo2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    readInt = htl.m3502h(parcel, readInt);
                    zzo2 = zzo;
                    break;
                case 3:
                    int i2 = i;
                    zzo2 = (zzo) htl.m3454a(parcel, readInt, zzo.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    readInt = i;
                    zzo2 = zzo;
                    break;
            }
            zzo = zzo2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzav(i, zzo);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzav[i];
    }
}
