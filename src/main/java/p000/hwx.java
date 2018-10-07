package p000;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hwx */
public final class hwx implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        PendingIntent pendingIntent = null;
        int a = htl.m3449a(parcel);
        int i = 0;
        int i2 = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i2 = htl.m3502h(parcel, readInt);
                    break;
                case 2:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 3:
                    pendingIntent = (PendingIntent) htl.m3454a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 4:
                    str = htl.m3504j(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
            PendingIntent pendingIntent2 = pendingIntent;
            String str2 = str;
            PendingIntent pendingIntent3 = pendingIntent2;
            String str3 = str2;
            pendingIntent = pendingIntent3;
            str = str3;
        }
        if (parcel.dataPosition() == a) {
            return new ConnectionResult(i2, i, pendingIntent, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
