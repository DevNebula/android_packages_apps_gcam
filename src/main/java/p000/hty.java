package p000;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;

/* renamed from: hty */
public final class hty implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        boolean z = true;
        byte[][] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[] bArr2 = null;
        PlayLoggerContext playLoggerContext = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) htl.m3454a(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr2 = htl.m3507m(parcel, readInt);
                    break;
                case 4:
                    iArr2 = htl.m3508n(parcel, readInt);
                    break;
                case 5:
                    strArr = htl.m3484a(parcel, readInt);
                    break;
                case 6:
                    iArr = htl.m3508n(parcel, readInt);
                    break;
                case 7:
                    int d = htl.m3498d(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (d == 0) {
                        bArr = null;
                        break;
                    }
                    int readInt2 = parcel.readInt();
                    bArr = new byte[readInt2][];
                    for (readInt = 0; readInt < readInt2; readInt++) {
                        bArr[readInt] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(dataPosition + d);
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
            return new LogEventParcelable(playLoggerContext, bArr2, iArr2, strArr, iArr, bArr, z);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }
}
