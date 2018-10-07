package p000;

import android.app.ApplicationErrorReport;
import android.app.ApplicationErrorReport.CrashInfo;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.io.File;
import java.util.List;

/* renamed from: iae */
public final class iae extends hwc {
    /* renamed from: l */
    private Context f26506l;

    public iae(Context context, Looper looper, hus hus, hut hut, hvx hvx) {
        super(context, looper, 29, hvx, hus, hut);
        this.f26506l = context;
    }

    /* renamed from: a */
    public final ErrorReport mo15552a(FeedbackOptions feedbackOptions) {
        File cacheDir = this.f26506l.getCacheDir();
        ErrorReport errorReport = new ErrorReport();
        if (feedbackOptions != null) {
            CrashInfo crashInfo;
            Bundle bundle = feedbackOptions.f23455b;
            if (bundle != null && bundle.size() > 0) {
                errorReport.f23431d = feedbackOptions.f23455b;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f23454a)) {
                errorReport.f23430c = feedbackOptions.f23454a;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f23456c)) {
                errorReport.f23429b = feedbackOptions.f23456c;
            }
            ApplicationErrorReport applicationErrorReport = feedbackOptions.f23457d;
            if (applicationErrorReport != null) {
                crashInfo = applicationErrorReport.crashInfo;
            } else {
                crashInfo = null;
            }
            if (crashInfo != null) {
                errorReport.f23436i = crashInfo.throwMethodName;
                errorReport.f23434g = crashInfo.throwLineNumber;
                errorReport.f23435h = crashInfo.throwClassName;
                errorReport.f23437j = crashInfo.stackTrace;
                errorReport.f23432e = crashInfo.exceptionClassName;
                errorReport.f23438k = crashInfo.exceptionMessage;
                errorReport.f23433f = crashInfo.throwFileName;
            }
            ThemeSettings themeSettings = feedbackOptions.f23463j;
            if (themeSettings != null) {
                errorReport.f23444q = themeSettings;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f23458e)) {
                errorReport.f23439l = feedbackOptions.f23458e;
            }
            if (!TextUtils.isEmpty(feedbackOptions.f23460g)) {
                errorReport.f23424a.packageName = feedbackOptions.f23460g;
            }
            BitmapTeleporter bitmapTeleporter = feedbackOptions.f23459f;
            if (!(bitmapTeleporter == null || cacheDir == null)) {
                errorReport.f23440m = bitmapTeleporter;
                bitmapTeleporter = errorReport.f23440m;
                if (cacheDir == null) {
                    throw new NullPointerException("Cannot set null temp directory");
                }
                bitmapTeleporter.f23363a = cacheDir;
            }
            List list = feedbackOptions.f23461h;
            if (!(list == null || list.size() == 0 || cacheDir == null)) {
                for (FileTeleporter fileTeleporter : feedbackOptions.f23461h) {
                    if (cacheDir == null) {
                        throw new NullPointerException("Cannot set null temp directory");
                    }
                    fileTeleporter.f23465a = cacheDir;
                }
                list = feedbackOptions.f23461h;
                errorReport.f23441n = (FileTeleporter[]) list.toArray(new FileTeleporter[list.size()]);
            }
            LogOptions logOptions = feedbackOptions.f23464k;
            if (logOptions != null) {
                errorReport.f23445r = logOptions;
            }
            errorReport.f23442o = feedbackOptions.f23462i;
        }
        return errorReport;
    }

    /* renamed from: a */
    protected final String mo8177a() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* renamed from: b */
    protected final String mo8187b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }
}
