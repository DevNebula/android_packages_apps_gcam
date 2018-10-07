package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: bpo */
public final class bpo implements bpn {
    /* renamed from: a */
    private final Context f11696a;
    /* renamed from: b */
    private final iqz f11697b;

    static {
        bsj bsj = new bsj("camera.dbg.bugtoast");
    }

    public bpo(Context context, bsn bsn, ira ira) {
        this.f11696a = context;
        this.f11697b = ira.mo8854a("ShotFailureHdlr");
    }

    /* renamed from: a */
    public final void mo2076a() {
        Throwable bpm = new bpm();
        this.f11697b.mo8835c("Shot Canceled!", bpm);
        bap.m800a(this.f11696a, bpm, "com.android.camera.silentfeedback.SILENT_FEEDBACK");
    }
}
