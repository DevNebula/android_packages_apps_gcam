package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.Asset;

/* renamed from: ijb */
public final class ijb implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri = null;
        int a = htl.m3449a(parcel);
        Uri uri2 = null;
        ParcelFileDescriptor parcelFileDescriptor = null;
        String str = null;
        while (true) {
            byte[] bArr = uri;
            if (parcel.dataPosition() < a) {
                String str2;
                byte[] bArr2;
                int readInt = parcel.readInt();
                Object uri22;
                switch ((char) readInt) {
                    case 2:
                        bArr = htl.m3507m(parcel, readInt);
                        uri = uri22;
                        uri22 = parcelFileDescriptor;
                        str2 = str;
                        bArr2 = bArr;
                        break;
                    case 3:
                        str = htl.m3504j(parcel, readInt);
                        uri = uri22;
                        uri22 = parcelFileDescriptor;
                        str2 = str;
                        bArr2 = bArr;
                        break;
                    case 4:
                        str2 = str;
                        bArr2 = bArr;
                        ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) htl.m3454a(parcel, readInt, ParcelFileDescriptor.CREATOR);
                        uri = uri22;
                        uri22 = parcelFileDescriptor2;
                        break;
                    case 5:
                        uri = (Uri) htl.m3454a(parcel, readInt, Uri.CREATOR);
                        uri22 = parcelFileDescriptor;
                        str2 = str;
                        bArr2 = bArr;
                        break;
                    default:
                        htl.m3499e(parcel, readInt);
                        uri = uri22;
                        uri22 = parcelFileDescriptor;
                        str2 = str;
                        bArr2 = bArr;
                        break;
                }
                bArr = bArr2;
                str = str2;
                Object parcelFileDescriptor3 = uri22;
            } else if (parcel.dataPosition() == a) {
                return new Asset(bArr, str, parcelFileDescriptor3, uri22);
            } else {
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Overread allowed size end=");
                stringBuilder.append(a);
                throw new aci(stringBuilder.toString(), parcel);
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new Asset[i];
    }
}
