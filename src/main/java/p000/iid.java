package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzce;
import com.google.android.gms.wearable.internal.zzu;

/* renamed from: iid */
public final class iid implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        zzu zzu = null;
        while (parcel.dataPosition() < a) {
            zzu zzu2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    readInt = htl.m3502h(parcel, readInt);
                    zzu2 = zzu;
                    break;
                case 3:
                    int i2 = i;
                    zzu2 = (zzu) htl.m3454a(parcel, readInt, zzu.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    readInt = i;
                    zzu2 = zzu;
                    break;
            }
            zzu = zzu2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzce(i, zzu);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzce[i];
    }
}
