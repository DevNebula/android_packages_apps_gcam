package p000;

import android.app.KeyguardManager.KeyguardDismissCallback;

/* compiled from: PG */
/* renamed from: gyp */
final class gyp extends KeyguardDismissCallback {
    /* renamed from: a */
    private final /* synthetic */ kpw f6178a;
    /* renamed from: b */
    private final /* synthetic */ gyl f6179b;

    gyp(gyl gyl, kpw kpw) {
        this.f6179b = gyl;
        this.f6178a = kpw;
    }

    public final void onDismissCancelled() {
        bli.m888a(gyl.f6169a, "Keyguard dismiss cancelled");
        this.f6178a.mo15641a(Boolean.valueOf(false));
    }

    public final void onDismissError() {
        bli.m891b(gyl.f6169a, "Error dismissing keyguard");
        this.f6178a.mo15641a(Boolean.valueOf(false));
    }

    public final void onDismissSucceeded() {
        bli.m888a(gyl.f6169a, "Keyguard successfully dismissed");
        gyl gyl = this.f6179b;
        gyl.f6172d.launchLensActivity(gyl.f6170b);
        this.f6178a.mo15641a(Boolean.valueOf(true));
    }
}
