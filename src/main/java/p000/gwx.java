package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* renamed from: gwx */
final class gwx extends Handler {
    /* renamed from: a */
    private final WeakReference f6102a;

    public gwx(gwv gwv, Looper looper) {
        super(looper);
        this.f6102a = new WeakReference(gwv);
    }

    public final void handleMessage(Message message) {
        gwv gwv = (gwv) this.f6102a.get();
        if (gwv != null) {
            switch (message.what) {
                case 0:
                    gwv.mo13476a();
                    gwv.f19764o.mo7488t();
                    return;
                default:
                    return;
            }
        }
    }
}
