package p000;

import android.os.Handler.Callback;
import android.os.Message;
import android.support.design.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* renamed from: cw */
public final class C0177cw implements Callback {
    public final boolean handleMessage(Message message) {
        Object obj;
        switch (message.what) {
            case 0:
                obj = message.obj;
                BaseTransientBottomBar.m396b();
                return true;
            case 1:
                obj = message.obj;
                int i = message.arg1;
                BaseTransientBottomBar.m395a();
                return true;
            default:
                return false;
        }
    }
}
