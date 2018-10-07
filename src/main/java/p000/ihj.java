package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.internal.zzbj;

/* renamed from: ihj */
public final class ihj implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        ConnectionConfiguration[] connectionConfigurationArr = null;
        while (parcel.dataPosition() < a) {
            ConnectionConfiguration[] connectionConfigurationArr2;
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    readInt = htl.m3502h(parcel, readInt);
                    connectionConfigurationArr2 = connectionConfigurationArr;
                    break;
                case 3:
                    int i2 = i;
                    connectionConfigurationArr2 = (ConnectionConfiguration[]) htl.m3494b(parcel, readInt, ConnectionConfiguration.CREATOR);
                    readInt = i2;
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    readInt = i;
                    connectionConfigurationArr2 = connectionConfigurationArr;
                    break;
            }
            connectionConfigurationArr = connectionConfigurationArr2;
            i = readInt;
        }
        if (parcel.dataPosition() == a) {
            return new zzbj(i, connectionConfigurationArr);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbj[i];
    }
}
