package p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

/* compiled from: PG */
/* renamed from: ht */
final class C0276ht implements Callback {
    /* renamed from: a */
    private final /* synthetic */ C0275hs f6999a;

    C0276ht(C0275hs c0275hs) {
        this.f6999a = c0275hs;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                C0275hs c0275hs = this.f6999a;
                synchronized (c0275hs.f6904a) {
                    if (c0275hs.f6906c.hasMessages(1)) {
                    } else {
                        c0275hs.f6905b.quit();
                        c0275hs.f6905b = null;
                        c0275hs.f6906c = null;
                    }
                }
            case 1:
                C0275hs c0275hs2 = this.f6999a;
                ((Runnable) message.obj).run();
                synchronized (c0275hs2.f6904a) {
                    c0275hs2.f6906c.removeMessages(0);
                    Handler handler = c0275hs2.f6906c;
                    handler.sendMessageDelayed(handler.obtainMessage(0), (long) c0275hs2.f6907d);
                }
        }
        return true;
    }
}
