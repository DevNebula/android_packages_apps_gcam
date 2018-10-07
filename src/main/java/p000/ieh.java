package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: ieh */
final class ieh extends Handler {
    /* renamed from: a */
    private final /* synthetic */ ieg f7339a;

    public ieh(ieg ieg, Looper looper) {
        this.f7339a = ieg;
        super(looper);
    }

    public final void handleMessage(Message message) {
        boolean z = true;
        if (message.what != 1) {
            z = false;
        }
        htl.m3492b(z);
        iej iej = (iej) message.obj;
        Object obj = this.f7339a.f7336a;
        if (obj != null) {
            try {
                iej.mo8409b(obj);
                return;
            } catch (RuntimeException e) {
                iej.mo8408a();
                throw e;
            }
        }
        iej.mo8408a();
    }
}
