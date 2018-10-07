package p000;

import android.app.AlertDialog.Builder;
import com.google.android.GoogleCamera.R;

/* renamed from: awy */
final /* synthetic */ class awy implements Runnable {
    /* renamed from: a */
    private final aww f1019a;
    /* renamed from: b */
    private final int f1020b;
    /* renamed from: c */
    private final boolean f1021c;

    awy(aww aww, int i, boolean z) {
        this.f1019a = aww;
        this.f1020b = i;
        this.f1021c = z;
    }

    public final void run() {
        aww aww = this.f1019a;
        int i = this.f1020b;
        boolean z = this.f1021c;
        ikd.m12501a();
        Builder onKeyListener = new Builder(aww.f10972a, 16974546).setTitle(aww.f10974c.getString(R.string.camera_error_title)).setMessage(aww.f10974c.getString(i)).setCancelable(false).setOnKeyListener(new awz(aww));
        if (z) {
            onKeyListener.setPositiveButton(aww.f10974c.getString(R.string.dialog_dismiss), aww.f10976e);
        } else {
            onKeyListener.setPositiveButton(aww.f10974c.getString(R.string.camera_menu_settings_label), new axa(aww)).setNegativeButton(aww.f10974c.getString(R.string.dialog_dismiss), aww.f10976e);
        }
        onKeyListener.show();
    }
}
