package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.app.Notification;
import android.app.Notification.BigTextStyle;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.support.p001v4.app.DialogFragment;
import android.support.p001v4.app.FragmentActivity;
import android.support.p001v4.app.FragmentManager;
import android.support.p001v4.app.NotificationCompat;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.GoogleCamera.R;

/* renamed from: hua */
public final class hua extends huc {
    /* renamed from: a */
    public static final hua f20814a = new hua();
    /* renamed from: b */
    public static final int f20815b = huc.f7033c;

    hua() {
    }

    /* renamed from: a */
    public static Dialog m12220a(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Builder builder = null;
        OnClickListener hwa = new hwa(huc.m3512a(activity, i, "d"), activity, i2);
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new Builder(activity, 5);
        }
        if (builder == null) {
            builder = new Builder(activity);
        }
        builder.setMessage(hvz.m3599c(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        CharSequence e = hvz.m3601e(activity, i);
        if (e != null) {
            builder.setPositiveButton(e, hwa);
        }
        e = hvz.m3595a((Context) activity, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    /* renamed from: b */
    public final boolean mo13571b(Activity activity, int i, int i2, OnCancelListener onCancelListener) {
        Object a = hua.m12220a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        String str = "GooglePlayServicesErrorDialog";
        Dialog dialog;
        if (activity instanceof FragmentActivity) {
            FragmentManager supportFragmentManager = ((FragmentActivity) activity).getSupportFragmentManager();
            DialogFragment hug = new hug();
            dialog = (Dialog) htl.m3489b(a, (Object) "Cannot display null dialog");
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            hug.mDialog = dialog;
            if (onCancelListener != null) {
                hug.f26502a = onCancelListener;
            }
            hug.show(supportFragmentManager, str);
        } else {
            android.app.FragmentManager fragmentManager = activity.getFragmentManager();
            android.app.DialogFragment htz = new htz();
            dialog = (Dialog) htl.m3489b(a, (Object) "Cannot display null dialog");
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            htz.f7026a = dialog;
            if (onCancelListener != null) {
                htz.f7027b = onCancelListener;
            }
            htz.show(fragmentManager, str);
        }
        return true;
    }

    @TargetApi(20)
    /* renamed from: a */
    public final void mo13570a(Context context, int i, PendingIntent pendingIntent) {
        if (i == 18) {
            new hub(this, context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            Notification build;
            int i2;
            CharSequence b = hvz.m3598b(context, i);
            CharSequence d = hvz.m3600d(context, i);
            Resources resources = context.getResources();
            if (htl.m3481a(context)) {
                htl.m3478a(true);
                build = new Notification.Builder(context).setSmallIcon(context.getApplicationInfo().icon).setPriority(2).setAutoCancel(true).setContentTitle(b).setStyle(new BigTextStyle().bigText(d)).addAction(R.drawable.common_full_open_on_phone, resources.getString(R.string.common_open_on_phone), pendingIntent).build();
            } else {
                build = new NotificationCompat.Builder(context).setSmallIcon(17301642).setTicker(resources.getString(R.string.common_google_play_services_notification_ticker)).setWhen(System.currentTimeMillis()).setAutoCancel(true).setContentIntent(pendingIntent).setContentTitle(b).setContentText(d).setLocalOnly(true).setStyle(new NotificationCompat.BigTextStyle().bigText(d)).build();
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                    hue.f7035b.set(false);
                    i2 = 10436;
                    break;
                default:
                    i2 = 39789;
                    break;
            }
            ((NotificationManager) context.getSystemService("notification")).notify(i2, build);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }

    /* renamed from: a */
    public static ieb m12221a(Context context, iec iec) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        ieb ieb = new ieb(iec);
        context.registerReceiver(ieb, intentFilter);
        ieb.f7333a = context;
        if (hue.m3520a(context, "com.google.android.gms")) {
            return ieb;
        }
        iec.mo8393a();
        ieb.mo8391a();
        return null;
    }
}
