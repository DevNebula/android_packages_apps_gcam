package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Intent;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: git */
public final class git {
    /* renamed from: a */
    private static final String f5495a = bli.m887a("SecureActivityM");

    /* renamed from: a */
    public static boolean m2621a(Activity activity, KeyguardManager keyguardManager) {
        if (!git.m2622a(activity.getIntent())) {
            return false;
        }
        if (keyguardManager.isKeyguardLocked() || ActivityManager.isRunningInTestHarness()) {
            return true;
        }
        bli.m898e(f5495a, "Warning: Overriding the secure camera intent because the keyguard is not currently locked. The camera will open in normal mode.");
        return false;
    }

    /* renamed from: a */
    private static boolean m2622a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if ("android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(action) || intent.getBooleanExtra("secure_camera", false)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static gqd m2620a(ikd ikd, Activity activity, enr enr, kwk kwk) {
        if (git.m2622a(activity.getIntent())) {
            return gly.m11391a(new giu(kwk, ikd, enr));
        }
        return gqf.f19483a;
    }
}
