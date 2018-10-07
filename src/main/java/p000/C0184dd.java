package p000;

import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: dd */
final class C0184dd implements Callback {
    /* renamed from: a */
    private final /* synthetic */ C0183dc f3201a;

    C0184dd(C0183dc c0183dc) {
        this.f3201a = c0183dc;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C0183dc c0183dc = this.f3201a;
                C0186df c0186df = (C0186df) message.obj;
                synchronized (c0183dc.f3188a) {
                    if (c0186df == null || c0186df == null) {
                        C0185de c0185de = (C0185de) c0186df.f3227a.get();
                        if (c0185de != null) {
                            c0183dc.f3189b.removeCallbacksAndMessages(c0186df);
                            c0185de.mo5934a();
                        }
                    }
                }
                return true;
            default:
                return false;
        }
    }
}
