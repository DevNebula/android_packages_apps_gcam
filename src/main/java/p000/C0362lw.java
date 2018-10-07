package p000;

import android.support.p002v7.app.AlertController;
import android.view.View;
import android.view.View.OnClickListener;

/* compiled from: PG */
/* renamed from: lw */
public final class C0362lw implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ AlertController f9177a;

    public C0362lw(AlertController alertController) {
        this.f9177a = alertController;
    }

    public final void onClick(View view) {
        AlertController alertController = this.f9177a;
        alertController.f633u.obtainMessage(1, alertController.f614b).sendToTarget();
    }
}
