package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* renamed from: idt */
final class idt extends Handler {
    /* renamed from: a */
    private final /* synthetic */ idr f7309a;

    idt(idr idr, Looper looper) {
        this.f7309a = idr;
        super(looper);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case 1:
                ids ids = (ids) message.obj;
                idr idr = this.f7309a;
                idr.f24598a.lock();
                try {
                    if (idr.f24608k == ids.f7308a) {
                        ids.mo8382a();
                        idr.f24598a.unlock();
                        return;
                    }
                    return;
                } finally {
                    idr.f24598a.unlock();
                }
            case 2:
                throw ((RuntimeException) message.obj);
            default:
                int i = message.what;
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("Unknown message id: ");
                stringBuilder.append(i);
                Log.w("GACStateManager", stringBuilder.toString());
                return;
        }
    }
}
