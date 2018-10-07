package p000;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: PG */
/* renamed from: hak */
public final class hak {
    /* renamed from: a */
    private static final String f6243a = bli.m887a("OrnamentUtil");

    hak() {
    }

    /* renamed from: a */
    public static boolean m3034a(Context context) {
        kvo kvo = new kvo(context.getPackageManager());
        Intent intent = new Intent();
        intent.setClassName("com.google.vr.apps.ornament", "com.google.vr.apps.ornament.app.MainActivity");
        if (kvo.f9036b.resolveActivity(intent, 0) == null) {
            bli.m894c(f6243a, "Ornament not found.");
            return false;
        }
        String a = kvo.mo10529a("com.google.vr.apps.ornament", "ar_service_desc");
        if (a == null) {
            bli.m894c(f6243a, "Ornament found, but no AR service string provided.");
            return false;
        }
        boolean z;
        String[] split = a.split("/");
        if (split.length != 2) {
            Log.e(kvo.f9035a, "Ornament's AR service descriptor not valid");
            z = false;
        } else {
            Intent intent2 = new Intent();
            intent2.setClassName(split[0], split[1]);
            if (kvo.f9036b.resolveService(intent2, 0) != null) {
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            bli.m894c(f6243a, "Ornament and AR services are available.");
            return true;
        }
        bli.m894c(f6243a, "AR Service missing. Ornament not launchable!");
        return false;
    }
}
