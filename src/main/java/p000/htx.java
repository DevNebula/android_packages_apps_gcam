package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;

/* renamed from: htx */
public final class htx implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        String str = null;
        int i = 0;
        int a = htl.m3449a(parcel);
        boolean z = true;
        boolean z2 = false;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str4 = htl.m3504j(parcel, readInt);
                    break;
                case 3:
                    i3 = htl.m3502h(parcel, readInt);
                    break;
                case 4:
                    i2 = htl.m3502h(parcel, readInt);
                    break;
                case 5:
                    str3 = htl.m3504j(parcel, readInt);
                    break;
                case 6:
                    str2 = htl.m3504j(parcel, readInt);
                    break;
                case 7:
                    z = htl.m3500f(parcel, readInt);
                    break;
                case 8:
                    str = htl.m3504j(parcel, readInt);
                    break;
                case 9:
                    z2 = htl.m3500f(parcel, readInt);
                    break;
                case 10:
                    i = htl.m3502h(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new PlayLoggerContext(str4, i3, i2, str3, str2, z, str, z2, i);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new PlayLoggerContext[i];
    }
}
