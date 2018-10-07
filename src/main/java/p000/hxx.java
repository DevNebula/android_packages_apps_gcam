package p000;

import android.app.ApplicationErrorReport;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.List;

/* renamed from: hxx */
public final class hxx implements Creator {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        LogOptions logOptions = null;
        int a = htl.m3449a(parcel);
        boolean z = false;
        ThemeSettings themeSettings = null;
        List list = null;
        String str = null;
        BitmapTeleporter bitmapTeleporter = null;
        String str2 = null;
        ApplicationErrorReport applicationErrorReport = null;
        String str3 = null;
        Bundle bundle = null;
        String str4 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str4 = htl.m3504j(parcel, readInt);
                    break;
                case 3:
                    bundle = htl.m3506l(parcel, readInt);
                    break;
                case 5:
                    str3 = htl.m3504j(parcel, readInt);
                    break;
                case 6:
                    applicationErrorReport = (ApplicationErrorReport) htl.m3454a(parcel, readInt, ApplicationErrorReport.CREATOR);
                    break;
                case 7:
                    str2 = htl.m3504j(parcel, readInt);
                    break;
                case 8:
                    bitmapTeleporter = (BitmapTeleporter) htl.m3454a(parcel, readInt, BitmapTeleporter.CREATOR);
                    break;
                case 9:
                    str = htl.m3504j(parcel, readInt);
                    break;
                case 10:
                    list = htl.m3495c(parcel, readInt, FileTeleporter.CREATOR);
                    break;
                case 11:
                    z = htl.m3500f(parcel, readInt);
                    break;
                case 12:
                    themeSettings = (ThemeSettings) htl.m3454a(parcel, readInt, ThemeSettings.CREATOR);
                    break;
                case 13:
                    logOptions = (LogOptions) htl.m3454a(parcel, readInt, LogOptions.CREATOR);
                    break;
                default:
                    htl.m3499e(parcel, readInt);
                    break;
            }
        }
        if (parcel.dataPosition() == a) {
            return new FeedbackOptions(str4, bundle, str3, applicationErrorReport, str2, bitmapTeleporter, str, list, z, themeSettings, logOptions);
        }
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("Overread allowed size end=");
        stringBuilder.append(a);
        throw new aci(stringBuilder.toString(), parcel);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FeedbackOptions[i];
    }
}
