package p000;

import android.app.KeyguardManager;

/* renamed from: gyn */
public final /* synthetic */ class gyn implements Runnable {
    /* renamed from: a */
    private final gyl f6176a;
    /* renamed from: b */
    private final kpw f6177b;

    public gyn(gyl gyl, kpw kpw) {
        this.f6176a = gyl;
        this.f6177b = kpw;
    }

    public final void run() {
        gyl gyl = this.f6176a;
        knk knk = this.f6177b;
        KeyguardManager keyguardManager = (KeyguardManager) gyl.f6170b.getSystemService("keyguard");
        if (keyguardManager.isKeyguardLocked()) {
            keyguardManager.requestDismissKeyguard(gyl.f6170b, new gyp(gyl, knk));
            return;
        }
        gyl.f6172d.launchLensActivity(gyl.f6170b);
        knk.mo15641a(Boolean.valueOf(true));
    }
}
