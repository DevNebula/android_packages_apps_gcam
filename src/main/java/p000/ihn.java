package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzbr;
import com.google.android.gms.wearable.internal.zzcc;

/* renamed from: ihn */
public final class ihn implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        zzcc zzcc = null;
        while (parcel.dataPosition() < a) {
            zzcc zzcc2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    readInt = htl.m3502h(parcel, readInt);
                    zzcc2 = zzcc;
                    break;
                case 3:
                    int i2 = i;
                    zzcc2 = (zzcc) htl.m3454a(parcel, readInt, zzcc.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    readInt = i;
                    zzcc2 = zzcc;
                    break;
            }
            zzcc = zzcc2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzbr(i, zzcc);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbr[i];
    }
}
