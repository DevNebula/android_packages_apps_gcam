package p000;

import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dwr */
final class dwr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ dwd f3535a;

    dwr(dwd dwd) {
        this.f3535a = dwd;
    }

    public final void run() {
        dwd dwd = this.f3535a;
        dwd.f26225n.f2645a = false;
        dwd.f26227p.setText(R.string.refocus_instructions);
    }
}
