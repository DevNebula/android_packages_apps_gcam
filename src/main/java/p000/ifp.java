package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;

/* renamed from: ifp */
public final class ifp implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 102;
        long j = 3600000;
        long j2 = 600000;
        boolean z = false;
        long j3 = Long.MAX_VALUE;
        int i2 = LfuScheduler.MAX_PRIORITY;
        float f = 0.0f;
        long j4 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 2:
                    j = htl.m3503i(parcel, readInt);
                    break;
                case 3:
                    j2 = htl.m3503i(parcel, readInt);
                    break;
                case 4:
                    z = htl.m3500f(parcel, readInt);
                    break;
                case 5:
                    j3 = htl.m3503i(parcel, readInt);
                    break;
                case 6:
                    i2 = htl.m3502h(parcel, readInt);
                    break;
                case 7:
                    htl.m3464a(parcel, readInt, 4);
                    f = parcel.readFloat();
                    break;
                case 8:
                    j4 = htl.m3503i(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }
}
