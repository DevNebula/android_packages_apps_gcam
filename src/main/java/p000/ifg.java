package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.zzc;
import com.google.android.gms.location.internal.zzo;
import java.util.List;

/* renamed from: ifg */
public final class ifg implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        boolean z = false;
        int a = htl.m3449a(parcel);
        List list = zzo.f23532a;
        boolean z2 = false;
        LocationRequest locationRequest = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    locationRequest = (LocationRequest) htl.m3454a(parcel, readInt, LocationRequest.CREATOR);
                    break;
                case 5:
                    list = htl.m3495c(parcel, readInt, zzc.CREATOR);
                    break;
                case 6:
                    str = htl.m3504j(parcel, readInt);
                    break;
                case 7:
                    z2 = htl.m3500f(parcel, readInt);
                    break;
                case 8:
                    z = htl.m3500f(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzo(locationRequest, list, str, z2, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
