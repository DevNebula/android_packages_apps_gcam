package p000;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.util.TypedValue;
import com.google.android.GoogleCamera.R;

/* renamed from: bpe */
final /* synthetic */ class bpe implements Runnable {
    /* renamed from: a */
    private final bpd f1399a;
    /* renamed from: b */
    private final boolean f1400b;
    /* renamed from: c */
    private final Activity f1401c;
    /* renamed from: d */
    private final bpl f1402d;
    /* renamed from: e */
    private final Exception f1403e;

    bpe(bpd bpd, boolean z, Activity activity, bpl bpl, Exception exception) {
        this.f1399a = bpd;
        this.f1400b = z;
        this.f1401c = activity;
        this.f1402d = bpl;
        this.f1403e = exception;
    }

    public final void run() {
        bpd bpd = this.f1399a;
        boolean z = this.f1400b;
        Context context = this.f1401c;
        bpl bpl = this.f1402d;
        Exception exception = this.f1403e;
        if (z || bpd.f22829c.get()) {
            int i = bpl.f1419e;
            int i2 = bpl.f1420f;
            OnClickListener bpf = new bpf(bpd, context);
            OnClickListener bpg = new bpg(bpd, context, i2, exception);
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16843605, typedValue, true);
            if (!context.isFinishing()) {
                bli.m891b(bpd.f22827a, "Show fatal error dialog");
                new Builder(context, 16974546).setCancelable(false).setTitle(R.string.camera_error_title).setMessage(i).setNegativeButton(R.string.dialog_report, bpg).setPositiveButton(R.string.dialog_dismiss, bpf).setIcon(typedValue.resourceId).show();
            }
        } else if (bpd.f22828b.get()) {
            bpd.mo14572a("Activity received an error, but was not running. Executing finish()");
        }
    }
}
