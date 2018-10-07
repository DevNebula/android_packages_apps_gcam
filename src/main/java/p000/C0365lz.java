package p000;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: lz */
public final class C0365lz extends Handler {
    /* renamed from: a */
    private WeakReference f9190a;

    public C0365lz(DialogInterface dialogInterface) {
        this.f9190a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case -3:
            case -2:
            case -1:
                ((OnClickListener) message.obj).onClick((DialogInterface) this.f9190a.get(), message.what);
                return;
            case 1:
                ((DialogInterface) message.obj).dismiss();
                return;
            default:
                return;
        }
    }
}
