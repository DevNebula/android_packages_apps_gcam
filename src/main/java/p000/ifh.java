package p000;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.internal.zzo;
import com.google.android.gms.location.internal.zzq;

/* renamed from: ifh */
public final class ifh implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder iBinder = null;
        int a = htl.m3449a(parcel);
        int i = 1;
        IBinder iBinder2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder3 = null;
        zzo zzo = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 2:
                    zzo = (zzo) htl.m3454a(parcel, readInt, zzo.CREATOR);
                    break;
                case 3:
                    iBinder3 = htl.m3505k(parcel, readInt);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) htl.m3454a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = htl.m3505k(parcel, readInt);
                    break;
                case 6:
                    iBinder = htl.m3505k(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzq(i, zzo, iBinder3, pendingIntent, iBinder2, iBinder);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
