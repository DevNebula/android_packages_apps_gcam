package p000;

/* compiled from: PG */
/* renamed from: cyu */
final class cyu extends hci {
    /* renamed from: a */
    private final /* synthetic */ chx f23722a;
    /* renamed from: b */
    private final /* synthetic */ cyd f23723b;

    cyu(cyd cyd, chx chx) {
        this.f23723b = cyd;
        this.f23722a = chx;
    }

    public final void onShutterButtonClick() {
        cyd cyd = this.f23723b;
        if (cyd.f25896w == null) {
            Object obj;
            if (cyd.f25895v == null) {
                obj = "closed";
            } else {
                obj = "starting";
            }
            String str = cyd.f25814c;
            String valueOf = String.valueOf(obj);
            String str2 = "Not taking picture since Camera is ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
            return;
        }
        cyd.mo15492w();
    }

    public final void onShutterButtonLongPressRelease() {
        this.f23722a.mo2307a(chw.SHUTTER_BUTTON, true);
    }

    public final void onShutterButtonLongPressed() {
        this.f23722a.mo2306a(chw.SHUTTER_BUTTON);
    }

    public final void onShutterButtonPressedStateChanged(boolean z) {
        this.f23723b.f25823I = z;
    }
}
