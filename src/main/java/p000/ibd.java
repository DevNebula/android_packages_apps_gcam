package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;
import com.google.android.gms.internal.zzbgq;

/* renamed from: ibd */
public final class ibd implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        zzaf zzaf = null;
        int a = htl.m3449a(parcel);
        ConnectionResult connectionResult = null;
        int i = 0;
        while (true) {
            zzaf zzaf2 = zzaf;
            if (parcel.dataPosition() < a) {
                ConnectionResult connectionResult2;
                int i2;
                int readInt = parcel.readInt();
                switch ((char) readInt) {
                    case 1:
                        i = htl.m3502h(parcel, readInt);
                        zzaf = zzaf2;
                        connectionResult2 = connectionResult;
                        i2 = i;
                        break;
                    case 2:
                        i2 = i;
                        ConnectionResult connectionResult3 = (ConnectionResult) htl.m3454a(parcel, readInt, ConnectionResult.CREATOR);
                        zzaf = zzaf2;
                        connectionResult2 = connectionResult3;
                        break;
                    case 3:
                        zzaf = (zzaf) htl.m3454a(parcel, readInt, zzaf.CREATOR);
                        connectionResult2 = connectionResult;
                        i2 = i;
                        break;
                    default:
                        htl.m3499e(parcel, readInt);
                        zzaf = zzaf2;
                        connectionResult2 = connectionResult;
                        i2 = i;
                        break;
                }
                i = i2;
                connectionResult = connectionResult2;
            } else if (parcel.dataPosition() == a) {
                return new zzbgq(i, connectionResult, zzaf2);
            } else {
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Overread allowed size end=");
                stringBuilder.append(a);
                throw new aci(stringBuilder.toString(), parcel);
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbgq[i];
    }
}
