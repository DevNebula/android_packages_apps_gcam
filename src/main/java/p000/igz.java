package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.wearable.internal.zzao;

/* renamed from: igz */
public final class igz implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Uri uri = null;
        int a = htl.m3449a(parcel);
        byte[] bArr = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    uri = (Uri) htl.m3454a(parcel, readInt, Uri.CREATOR);
                    break;
                case 4:
                    bundle = htl.m3506l(parcel, readInt);
                    break;
                case 5:
                    bArr = htl.m3507m(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
            Uri uri2 = uri;
            byte[] bArr2 = bArr;
            Bundle bundle2 = bundle;
            Uri uri3 = uri2;
            byte[] bArr3 = bArr2;
            uri = uri3;
            bundle = bundle2;
            bArr = bArr3;
        }
        if (parcel.dataPosition() == a) {
            return new zzao(uri, bundle, bArr);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzao[i];
    }
}
