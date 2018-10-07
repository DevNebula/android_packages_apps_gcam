package p000;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

/* renamed from: bpf */
final /* synthetic */ class bpf implements OnClickListener {
    /* renamed from: a */
    private final bpd f1404a;
    /* renamed from: b */
    private final Activity f1405b;

    bpf(bpd bpd, Activity activity) {
        this.f1404a = bpd;
        this.f1405b = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        bpd bpd = this.f1404a;
        Activity activity = this.f1405b;
        if (bpd.f22828b.get()) {
            activity.finish();
        }
    }
}
