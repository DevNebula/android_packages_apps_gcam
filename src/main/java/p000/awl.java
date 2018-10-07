package p000;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: awl */
public final class awl {
    static {
        bli.m887a("IntentHelper");
    }

    /* renamed from: a */
    public static kbg m735a(Intent intent) {
        return kbg.m4803b(intent.getStringExtra("android.intent.extra.STILL_IMAGE_MODE"));
    }

    /* renamed from: b */
    public static int m738b(Intent intent) {
        int intExtra = intent.getIntExtra("android.intent.extra.TIMER_DURATION_SECONDS", 0);
        if (intExtra < 3) {
            return 3;
        }
        if (intExtra > 30) {
            return 30;
        }
        return intExtra;
    }

    /* renamed from: a */
    public static Intent m734a(Uri uri) {
        return new Intent("android.intent.action.VIEW").setDataAndType(uri, "video/*");
    }

    /* renamed from: c */
    public static boolean m740c(Intent intent) {
        return intent.hasExtra("android.intent.extra.USE_FRONT_CAMERA") || intent.hasExtra("android.intent.extra.FRONT_CAMERA");
    }

    /* renamed from: a */
    public static boolean m736a(awr awr) {
        Intent intent = awr.f1017a.getIntent();
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!awl.m737a(action)) {
            boolean z = !"android.media.action.STILL_IMAGE_CAMERA".equals(action) ? "android.media.action.STILL_IMAGE_CAMERA_SECURE".equals(action) : true;
            if (!z) {
                return false;
            }
        }
        if (intent.hasExtra("android.intent.extra.TIMER_DURATION_SECONDS")) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m739b(awr awr) {
        Intent intent = awr.f1017a.getIntent();
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if ("android.media.action.VIDEO_CAPTURE".equals(action) || awl.m737a(action)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m737a(String str) {
        if ("android.media.action.IMAGE_CAPTURE".equals(str) || "android.media.action.IMAGE_CAPTURE_SECURE".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m741d(Intent intent) {
        if (intent.getBooleanExtra("android.intent.extra.USE_FRONT_CAMERA", false) || intent.getBooleanExtra("android.intent.extra.FRONT_CAMERA", false)) {
            return true;
        }
        return false;
    }
}
