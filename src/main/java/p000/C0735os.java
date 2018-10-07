package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* renamed from: os */
final class C0735os implements OnClickListener, OnDismissListener, OnKeyListener, C0411pf {
    /* renamed from: a */
    public C0734op f22200a;
    /* renamed from: b */
    public C0822mb f22201b;
    /* renamed from: c */
    public C0733om f22202c;

    public C0735os(C0734op c0734op) {
        this.f22200a = c0734op;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f22200a.mo14299a((C0736ot) this.f22202c.mo14290b().getItem(i), null, 0);
    }

    /* renamed from: a */
    public final void mo10854a(C0734op c0734op, boolean z) {
        if (z || c0734op == this.f22200a) {
            C0822mb c0822mb = this.f22201b;
            if (c0822mb != null) {
                c0822mb.dismiss();
            }
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.f22202c.mo10847a(this.f22200a, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.f22201b.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                window = this.f22201b.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.f22200a.mo14298a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f22200a.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public final boolean mo10855a(C0734op c0734op) {
        return false;
    }
}
