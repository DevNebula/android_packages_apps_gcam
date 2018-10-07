package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: bpg */
final /* synthetic */ class bpg implements OnClickListener {
    /* renamed from: a */
    private final bpd f1406a;
    /* renamed from: b */
    private final Activity f1407b;
    /* renamed from: c */
    private final int f1408c;
    /* renamed from: d */
    private final Exception f1409d;

    bpg(bpd bpd, Activity activity, int i, Exception exception) {
        this.f1406a = bpd;
        this.f1407b = activity;
        this.f1408c = i;
        this.f1409d = exception;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bpd bpd = this.f1406a;
        Activity activity = this.f1407b;
        new axi(activity).mo1834a(this.f1408c, this.f1409d);
        if (bpd.f22828b.get()) {
            activity.finish();
        }
    }
}
