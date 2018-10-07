package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* renamed from: htg */
public final class htg implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        ArrayList arrayList = null;
        int a = htl.m3449a(parcel);
        String str = null;
        String str2 = null;
        boolean z2 = false;
        boolean z3 = false;
        Account account = null;
        ArrayList arrayList2 = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 2:
                    arrayList2 = htl.m3495c(parcel, readInt, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) htl.m3454a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    z3 = htl.m3500f(parcel, readInt);
                    break;
                case 5:
                    z2 = htl.m3500f(parcel, readInt);
                    break;
                case 6:
                    z = htl.m3500f(parcel, readInt);
                    break;
                case 7:
                    str2 = htl.m3504j(parcel, readInt);
                    break;
                case 8:
                    str = htl.m3504j(parcel, readInt);
                    break;
                case 9:
                    arrayList = htl.m3495c(parcel, readInt, zzg.CREATOR);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GoogleSignInOptions(i, arrayList2, account, z3, z2, z, str2, str, arrayList);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
