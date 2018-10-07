package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import java.util.List;

/* renamed from: hzi */
public final class hzi implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = htl.m3449a(parcel);
        int i = 0;
        String str = null;
        Account account = null;
        Bundle bundle = null;
        String str2 = null;
        String str3 = null;
        Bitmap bitmap = null;
        boolean z = false;
        boolean z2 = false;
        List list = null;
        Bundle bundle2 = null;
        Bitmap bitmap2 = null;
        byte[] bArr = null;
        int i2 = 0;
        int i3 = 0;
        String str4 = null;
        Uri uri = null;
        List list2 = null;
        int i4 = 0;
        ThemeSettings themeSettings = null;
        List list3 = null;
        boolean z3 = false;
        ErrorReport errorReport = null;
        TogglingData togglingData = null;
        int i5 = 0;
        PendingIntent pendingIntent = null;
        int i6 = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = htl.m3502h(parcel, readInt);
                    break;
                case 2:
                    str = htl.m3504j(parcel, readInt);
                    break;
                case 3:
                    account = (Account) htl.m3454a(parcel, readInt, Account.CREATOR);
                    break;
                case 4:
                    bundle = htl.m3506l(parcel, readInt);
                    break;
                case 5:
                    z = htl.m3500f(parcel, readInt);
                    break;
                case 6:
                    z2 = htl.m3500f(parcel, readInt);
                    break;
                case 7:
                    readInt = htl.m3498d(parcel, readInt);
                    int dataPosition = parcel.dataPosition();
                    if (readInt == 0) {
                        list = null;
                        break;
                    }
                    list = parcel.createStringArrayList();
                    parcel.setDataPosition(readInt + dataPosition);
                    break;
                case 10:
                    bundle2 = htl.m3506l(parcel, readInt);
                    break;
                case 11:
                    bitmap2 = (Bitmap) htl.m3454a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case 14:
                    str4 = htl.m3504j(parcel, readInt);
                    break;
                case 15:
                    uri = (Uri) htl.m3454a(parcel, readInt, Uri.CREATOR);
                    break;
                case 16:
                    list2 = htl.m3495c(parcel, readInt, OverflowMenuItem.CREATOR);
                    break;
                case 17:
                    i4 = htl.m3502h(parcel, readInt);
                    break;
                case 18:
                    list3 = htl.m3495c(parcel, readInt, OfflineSuggestion.CREATOR);
                    break;
                case 19:
                    bArr = htl.m3507m(parcel, readInt);
                    break;
                case 20:
                    i2 = htl.m3502h(parcel, readInt);
                    break;
                case 21:
                    i3 = htl.m3502h(parcel, readInt);
                    break;
                case 22:
                    z3 = htl.m3500f(parcel, readInt);
                    break;
                case 23:
                    errorReport = (ErrorReport) htl.m3454a(parcel, readInt, ErrorReport.CREATOR);
                    break;
                case 25:
                    themeSettings = (ThemeSettings) htl.m3454a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 28:
                    str2 = htl.m3504j(parcel, readInt);
                    break;
                case 31:
                    togglingData = (TogglingData) htl.m3454a(parcel, readInt, TogglingData.CREATOR);
                    break;
                case ' ':
                    i5 = htl.m3502h(parcel, readInt);
                    break;
                case '!':
                    pendingIntent = (PendingIntent) htl.m3454a(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case '\"':
                    str3 = htl.m3504j(parcel, readInt);
                    break;
                case '#':
                    bitmap = (Bitmap) htl.m3454a(parcel, readInt, Bitmap.CREATOR);
                    break;
                case '$':
                    i6 = htl.m3502h(parcel, readInt);
                    break;
                case '%':
                    z4 = htl.m3500f(parcel, readInt);
                    break;
                case '&':
                    z5 = htl.m3500f(parcel, readInt);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new GoogleHelp(i, str, account, bundle, str2, str3, bitmap, z, z2, list, bundle2, bitmap2, bArr, i2, i3, str4, uri, list2, i4, themeSettings, list3, z3, errorReport, togglingData, i5, pendingIntent, i6, z4, z5);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleHelp[i];
    }
}
