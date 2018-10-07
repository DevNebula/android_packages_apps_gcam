package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzs;
import com.google.android.gms.wearable.internal.zzu;

/* renamed from: iiy */
public final class iiy implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        zzu zzu = null;
        while (true) {
            int i4 = i3;
            if (parcel.dataPosition() < a) {
                int readInt = parcel.readInt();
                switch ((char) readInt) {
                    case 2:
                        zzu = (zzu) htl.m3454a(parcel, readInt, zzu.CREATOR);
                        break;
                    case 3:
                        i2 = htl.m3502h(parcel, readInt);
                        break;
                    case 4:
                        i = htl.m3502h(parcel, readInt);
                        break;
                    case 5:
                        i4 = htl.m3502h(parcel, readInt);
                        break;
                    default:
                        htl.m3499e(parcel, readInt);
                        break;
                }
                zzu zzu2 = zzu;
                int i5 = i4;
                i4 = i;
                i = i2;
                zzu zzu3 = zzu2;
                i3 = i5;
                zzu = zzu3;
                i2 = i;
                i = i4;
            } else if (parcel.dataPosition() == a) {
                return new zzs(zzu, i2, i, i4);
            } else {
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Overread allowed size end=");
                stringBuilder.append(a);
                throw new aci(stringBuilder.toString(), parcel);
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
