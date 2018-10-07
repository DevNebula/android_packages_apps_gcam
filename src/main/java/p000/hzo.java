package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.OfflineSuggestion;

/* renamed from: hzo */
public final class hzo implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int a = htl.m3449a(parcel);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str4 = htl.m3504j(parcel, readInt);
                    break;
                case 3:
                    str3 = htl.m3504j(parcel, readInt);
                    break;
                case 4:
                    str = htl.m3504j(parcel, readInt);
                    break;
                case 5:
                    str2 = htl.m3504j(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new OfflineSuggestion(str4, str3, str2, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OfflineSuggestion[i];
    }
}
