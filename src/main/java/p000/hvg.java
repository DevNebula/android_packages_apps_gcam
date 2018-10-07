package p000;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: hvg */
public final class hvg implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Bundle bundle = null;
        int i = 0;
        int a = htl.m3449a(parcel);
        int i2 = 0;
        CursorWindow[] cursorWindowArr = null;
        String[] strArr = null;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    strArr = htl.m3484a(parcel, readInt);
                    break;
                case 2:
                    cursorWindowArr = (CursorWindow[]) htl.m3494b(parcel, readInt, CursorWindow.CREATOR);
                    break;
                case 3:
                    i2 = htl.m3502h(parcel, readInt);
                    break;
                case 4:
                    bundle = htl.m3506l(parcel, readInt);
                    break;
                case 1000:
                    i3 = htl.m3502h(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() != a) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Overread allowed size end=");
            stringBuilder.append(a);
            throw new aci(stringBuilder.toString(), parcel);
        }
        DataHolder dataHolder = new DataHolder(i3, strArr, cursorWindowArr, i2, bundle);
        dataHolder.f23369b = new Bundle();
        i3 = 0;
        while (true) {
            strArr = dataHolder.f23368a;
            if (i3 >= strArr.length) {
                dataHolder.f23371d = new int[dataHolder.f23370c.length];
                i3 = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr2 = dataHolder.f23370c;
                    if (i < cursorWindowArr2.length) {
                        dataHolder.f23371d[i] = i3;
                        i3 += dataHolder.f23370c[i].getNumRows() - (i3 - cursorWindowArr2[i].getStartPosition());
                        i++;
                    } else {
                        dataHolder.f23372e = i3;
                        return dataHolder;
                    }
                }
            }
            dataHolder.f23369b.putInt(strArr[i3], i3);
            i3++;
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new DataHolder[i];
    }
}
