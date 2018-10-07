package p000;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzc;

/* renamed from: iis */
public final class iis implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IntentFilter[] intentFilterArr = null;
        int a = htl.m3449a(parcel);
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    iBinder = htl.m3505k(parcel, readInt);
                    break;
                case 3:
                    intentFilterArr = (IntentFilter[]) htl.m3494b(parcel, readInt, IntentFilter.CREATOR);
                    break;
                case 4:
                    str2 = htl.m3504j(parcel, readInt);
                    break;
                case 5:
                    str = htl.m3504j(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
            IntentFilter[] intentFilterArr2 = intentFilterArr;
            String str3 = str;
            str = str2;
            IntentFilter[] intentFilterArr3 = intentFilterArr2;
            String str4 = str3;
            intentFilterArr = intentFilterArr3;
            str2 = str;
            str = str4;
        }
        if (parcel.dataPosition() == a) {
            return new zzc(iBinder, intentFilterArr, str2, str);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
