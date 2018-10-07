package p000;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.zzc;

/* renamed from: hwb */
public final class hwb implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int i = 0;
        zzc[] zzcArr = null;
        int a = htl.m3449a(parcel);
        Account account = null;
        Bundle bundle = null;
        Scope[] scopeArr = null;
        IBinder iBinder = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i3 = htl.m3502h(parcel, readInt);
                    break;
                case 2:
                    i2 = htl.m3502h(parcel, readInt);
                    break;
                case 3:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 4:
                    str = htl.m3504j(parcel, readInt);
                    break;
                case 5:
                    iBinder = htl.m3505k(parcel, readInt);
                    break;
                case 6:
                    scopeArr = (Scope[]) htl.m3494b(parcel, readInt, Scope.CREATOR);
                    break;
                case 7:
                    bundle = htl.m3506l(parcel, readInt);
                    break;
                case 8:
                    account = (Account) htl.m3454a(parcel, readInt, Account.CREATOR);
                    break;
                case 10:
                    zzcArr = (zzc[]) htl.m3494b(parcel, readInt, zzc.CREATOR);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new zzj(i3, i2, i, str, iBinder, scopeArr, bundle, account, zzcArr);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
