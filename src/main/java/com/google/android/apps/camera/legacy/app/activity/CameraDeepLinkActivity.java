package com.google.android.apps.camera.legacy.app.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.activity.main.CameraActivity;
import java.util.Locale;
import p000.bli;
import p000.hhx;
import p000.kav;
import p000.kbg;

/* compiled from: PG */
public class CameraDeepLinkActivity extends Activity {
    /* renamed from: a */
    private static final String f2492a = bli.m887a(CameraDeepLinkActivity.class.getSimpleName());

    /* renamed from: a */
    private final void m1264a() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.GoogleCamera"));
        intent.setPackage("com.android.vending");
        startActivity(intent);
        finish();
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, CameraActivity.class);
        intent.setAction("android.media.action.STILL_IMAGE_CAMERA");
        intent.addFlags(268435456);
        Uri data = getIntent().getData();
        for (String str : data.getQueryParameterNames()) {
            if ("mode".equalsIgnoreCase(str)) {
                boolean z;
                String toUpperCase = data.getQueryParameter(str).toUpperCase(Locale.ROOT);
                kbg a = kav.m4788a(hhx.class, toUpperCase);
                if (!a.mo9709b() || !hhx.m3205a((hhx) a.mo9706a(), true)) {
                    bli.m898e(f2492a, String.format("Unsupported mode '%s', perhaps you need to upgrade", new Object[]{toUpperCase}));
                    m1264a();
                    z = false;
                } else if ("android.media.action.STILL_IMAGE_CAMERA".equals(intent.getAction())) {
                    intent.putExtra("android.intent.extra.STILL_IMAGE_MODE", toUpperCase);
                    z = true;
                } else {
                    throw new UnsupportedOperationException("Unreachable: only still-image modes supported");
                }
                if (!z) {
                    return;
                }
            } else if ("timer".equalsIgnoreCase(str)) {
                intent.putExtra("android.intent.extra.TIMER_DURATION_SECONDS", Integer.parseInt(data.getQueryParameter(str)));
            } else if ("use-front-camera".equalsIgnoreCase(str)) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", Boolean.parseBoolean(data.getQueryParameter(str)));
            } else {
                bli.m898e(f2492a, String.format("Unknown query parameter %s, with value %s", new Object[]{str, data.getQueryParameter(str)}));
                m1264a();
                return;
            }
        }
        startActivity(intent);
        finish();
    }
}
