package p000;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: awi */
public final class awi {
    /* renamed from: a */
    private static final String f1005a = bli.m887a("ActivityCloser");
    /* renamed from: b */
    private final WeakReference f1006b;
    /* renamed from: c */
    private final AtomicBoolean f1007c = new AtomicBoolean(false);

    awi(WeakReference weakReference) {
        this.f1006b = weakReference;
    }

    /* renamed from: a */
    public final void mo1814a(String str) {
        ikd.m12501a();
        jri.m13395a(kbi.m4811a(str) ^ 1);
        Activity activity = (Activity) this.f1006b.get();
        if (activity != null && !this.f1007c.getAndSet(true)) {
            String str2 = f1005a;
            String valueOf = String.valueOf(str);
            String str3 = "WARNING: Activity was artificially finished: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m898e(str2, valueOf);
            activity.finish();
        }
    }
}
