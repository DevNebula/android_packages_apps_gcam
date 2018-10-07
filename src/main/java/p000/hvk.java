package p000;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zzaf;

/* renamed from: hvk */
public final class hvk implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        ConnectionResult connectionResult = null;
        boolean z = false;
        int a = htl.m3449a(parcel);
        boolean z2 = false;
        IBinder iBinder = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 2:
                    iBinder = htl.m3505k(parcel, readInt);
                    break;
                case 3:
                    connectionResult = (ConnectionResult) htl.m3454a(parcel, readInt, ConnectionResult.CREATOR);
                    break;
                case 4:
                    z2 = htl.m3500f(parcel, readInt);
                    break;
                case 5:
                    z = htl.m3500f(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzaf(i, iBinder, connectionResult, z2, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaf[i];
    }
}
