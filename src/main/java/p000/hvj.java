package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zzad;

/* renamed from: hvj */
public final class hvj implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int a = htl.m3449a(parcel);
        int i2 = 0;
        Account account = null;
        while (true) {
            int i3 = i;
            GoogleSignInAccount googleSignInAccount2 = googleSignInAccount;
            if (parcel.dataPosition() < a) {
                int i4;
                int readInt = parcel.readInt();
                switch ((char) readInt) {
                    case 1:
                        i3 = htl.m3502h(parcel, readInt);
                        googleSignInAccount = googleSignInAccount2;
                        i = i2;
                        i2 = account;
                        i4 = i3;
                        break;
                    case 2:
                        i4 = i3;
                        Account account2 = (Account) htl.m3454a(parcel, readInt, Account.CREATOR);
                        googleSignInAccount = googleSignInAccount2;
                        i = i2;
                        i2 = account2;
                        break;
                    case 3:
                        i2 = htl.m3502h(parcel, readInt);
                        googleSignInAccount = googleSignInAccount2;
                        i = i2;
                        i2 = account;
                        i4 = i3;
                        break;
                    case 4:
                        googleSignInAccount = (GoogleSignInAccount) htl.m3454a(parcel, readInt, GoogleSignInAccount.CREATOR);
                        i = i2;
                        i2 = account;
                        i4 = i3;
                        break;
                    default:
                        htl.m3499e(parcel, readInt);
                        googleSignInAccount = googleSignInAccount2;
                        i = i2;
                        i2 = account;
                        i4 = i3;
                        break;
                }
                i3 = i4;
                account = i2;
            } else if (parcel.dataPosition() == a) {
                return new zzad(i3, account, i2, googleSignInAccount2);
            } else {
                StringBuilder stringBuilder = new StringBuilder(37);
                stringBuilder.append("Overread allowed size end=");
                stringBuilder.append(a);
                throw new aci(stringBuilder.toString(), parcel);
            }
        }
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzad[i];
    }
}
