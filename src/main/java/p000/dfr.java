package p000;

import android.app.AlertDialog;

/* compiled from: PG */
/* renamed from: dfr */
final class dfr implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ des f3243a;

    dfr(des des) {
        this.f3243a = des;
    }

    public final void run() {
        AlertDialog alertDialog = this.f3243a.f25927K;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        alertDialog = this.f3243a.f25928L;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }
}
