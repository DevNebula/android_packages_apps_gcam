package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.internal.zzbgo;

/* renamed from: ibc */
public final class ibc implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        zzad zzad = null;
        while (parcel.dataPosition() < a) {
            zzad zzad2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    readInt = htl.m3502h(parcel, readInt);
                    zzad2 = zzad;
                    break;
                case 2:
                    int i2 = i;
                    zzad2 = (zzad) htl.m3454a(parcel, readInt, zzad.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    readInt = i;
                    zzad2 = zzad;
                    break;
            }
            zzad = zzad2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzbgo(i, zzad);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgo[i];
    }
}
