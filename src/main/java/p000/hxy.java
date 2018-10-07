package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.FileTeleporter;

/* renamed from: hxy */
public final class hxy implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ParcelFileDescriptor parcelFileDescriptor = null;
        int a = htl.m3449a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    parcelFileDescriptor = (ParcelFileDescriptor) htl.m3454a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                    break;
                case 3:
                    str2 = htl.m3504j(parcel, readInt);
                    break;
                case 4:
                    str = htl.m3504j(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
            String str3 = str;
            str = str2;
            ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptor2;
            String str4 = str3;
            parcelFileDescriptor = parcelFileDescriptor3;
            str2 = str;
            str = str4;
        }
        if (parcel.dataPosition() == a) {
            return new FileTeleporter(parcelFileDescriptor, str2, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FileTeleporter[i];
    }
}
