package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzaz;

/* renamed from: ihe */
public final class ihe implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < a) {
            ParcelFileDescriptor parcelFileDescriptor2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    readInt = htl.m3502h(parcel, readInt);
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    break;
                case 3:
                    int i2 = i;
                    parcelFileDescriptor2 = (ParcelFileDescriptor) htl.m3454a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    readInt = i;
                    parcelFileDescriptor2 = parcelFileDescriptor;
                    break;
            }
            parcelFileDescriptor = parcelFileDescriptor2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzaz(i, parcelFileDescriptor);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaz[i];
    }
}
