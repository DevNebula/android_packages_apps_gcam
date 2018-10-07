package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;

/* renamed from: hyz */
public final class hyz implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Intent intent = null;
        int a = htl.m3449a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 3:
                    str = htl.m3504j(parcel, readInt);
                    break;
                case 4:
                    intent = (Intent) htl.m3454a(parcel, readInt, Intent.CREATOR);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new OverflowMenuItem(i, str, intent);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new OverflowMenuItem[i];
    }
}
