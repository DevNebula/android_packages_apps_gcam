package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.zzbh;

/* renamed from: ihi */
public final class ihi implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        ConnectionConfiguration connectionConfiguration = null;
        while (parcel.dataPosition() < a) {
            ConnectionConfiguration connectionConfiguration2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    readInt = htl.m3502h(parcel, readInt);
                    connectionConfiguration2 = connectionConfiguration;
                    break;
                case 3:
                    int i2 = i;
                    connectionConfiguration2 = (ConnectionConfiguration) htl.m3454a(parcel, readInt, ConnectionConfiguration.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    readInt = i;
                    connectionConfiguration2 = connectionConfiguration;
                    break;
            }
            connectionConfiguration = connectionConfiguration2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzbh(i, connectionConfiguration);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbh[i];
    }
}
