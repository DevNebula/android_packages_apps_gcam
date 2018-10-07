package p000;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bap */
public final class bap {
    /* renamed from: a */
    private static final String f1072a = bli.m887a("SilentFeedback");

    /* renamed from: b */
    private static Intent m802b(Context context, Throwable th, String str) {
        bli.m896d(f1072a, "Building feedback intent.");
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (th.getStackTrace().length == 0) {
            return null;
        }
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 4);
        } catch (Throwable e) {
            bli.m892b(f1072a, "Could not find our own package. This should never happen. Not sending crash info.", e);
            packageInfo = null;
        }
        String str2 = null;
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (serviceInfo.name.equals("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService")) {
                str2 = serviceInfo.name;
            }
        }
        if (str2 == null) {
            bli.m891b(f1072a, "Could not find SilentFeedbackService, not sending crash info.");
            return null;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context.getApplicationContext(), str2));
        intent.setPackage(context.getApplicationContext().getPackageName());
        StringBuilder stringBuilder = new StringBuilder();
        bli.m896d(f1072a, "Printing cleaned throwable.");
        bap.m801a(th, stringBuilder, new HashSet(), null);
        StackTraceElement stackTraceElement = stackTrace[0];
        if (stackTraceElement.getFileName() == null) {
            str2 = "Unknown Source";
        } else {
            str2 = stackTraceElement.getFileName();
        }
        intent.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.exceptionClass", th.getClass().getName());
        intent.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.stackTrace", stringBuilder.toString());
        intent.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingClass", stackTraceElement.getClassName());
        intent.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingFile", str2);
        intent.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingLine", stackTraceElement.getLineNumber());
        intent.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.throwingMethod", stackTraceElement.getMethodName());
        if (str != null) {
            intent.putExtra("com.google.android.apps.camera.app.silentfeedback.SilentFeedbackService.categoryTag", str);
        }
        return intent;
    }

    @TargetApi(19)
    /* renamed from: a */
    private static void m801a(Throwable th, StringBuilder stringBuilder, Set set, String str) {
        while (th != null && !set.contains(th)) {
            set.add(th);
            if (str != null) {
                stringBuilder.append(str);
            }
            stringBuilder.append(th.getClass().getName());
            stringBuilder.append(':');
            for (Object obj : th.getStackTrace()) {
                stringBuilder.append("\n\tat ");
                stringBuilder.append(obj);
            }
            if (VERSION.SDK_INT >= 19) {
                for (Throwable a : kqg.f8786a.mo10212a(th)) {
                    bap.m801a(a, stringBuilder, set, "\nSuppressed: ");
                }
            }
            if (th.getCause() != null) {
                th = th.getCause();
                str = "\nCaused by: ";
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m800a(Context context, Throwable th, String str) {
        bli.m896d(f1072a, "Sending silent feedback.");
        Intent b = bap.m802b(context, th, str);
        if (b != null) {
            context.startService(b);
        }
    }
}
