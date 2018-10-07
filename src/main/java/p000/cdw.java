package p000;

import com.google.android.apps.camera.legacy.app.activity.TrampolineActivity;

/* compiled from: PG */
/* renamed from: cdw */
public final class cdw implements iqo {
    /* renamed from: a */
    private final /* synthetic */ TrampolineActivity f12231a;

    public cdw(TrampolineActivity trampolineActivity) {
        this.f12231a = trampolineActivity;
    }

    public final void close() {
        TrampolineActivity trampolineActivity = this.f12231a;
        trampolineActivity.unregisterReceiver(trampolineActivity.f2496b);
    }
}
