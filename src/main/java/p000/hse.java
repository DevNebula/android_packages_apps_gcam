package p000;

import android.content.Context;
import android.preference.PreferenceManager;
import android.support.p003v8.renderscript.RenderScript;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: hse */
public final class hse {
    /* renamed from: a */
    public static final ReentrantLock f6932a = new ReentrantLock();
    /* renamed from: b */
    private static RenderScript f6933b = null;
    /* renamed from: c */
    private static String f6934c = "camera.renderscript";
    /* renamed from: d */
    private static String f6935d = "1";
    /* renamed from: e */
    private static final String f6936e = bli.m887a("RenderScriptPool");

    /* renamed from: a */
    public static RenderScript m3391a(Context context) {
        boolean equals;
        bkw bkw = new bkw(context.getContentResolver(), hjf.m3248a(), PreferenceManager.getDefaultSharedPreferences(context));
        String a = iwd.f7884a.mo9116a(f6934c);
        if ((kbi.m4811a(a) ^ 1) != 0) {
            equals = f6935d.equals(a);
        } else {
            equals = bkw.mo1998a(bkw.f1283a, "camera:use_renderscript", hjf.f6630a);
        }
        if (!equals) {
            bli.m888a(f6936e, "RenderScript not configured");
            return null;
        } else if (f6932a.tryLock()) {
            if (f6933b == null) {
                f6933b = RenderScript.create(context.getApplicationContext());
            }
            bli.m888a(f6936e, "RenderScript acquired");
            return f6933b;
        } else {
            bli.m888a(f6936e, "RenderScript already used");
            return null;
        }
    }
}
