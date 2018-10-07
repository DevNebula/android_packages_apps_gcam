package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* renamed from: gn */
final class C0251gn extends Handler {
    C0251gn() {
        super(Looper.getMainLooper());
    }

    public final void handleMessage(Message message) {
        C0351ll c0351ll = (C0351ll) message.obj;
        switch (message.what) {
            case 1:
                C0248gk c0248gk = c0351ll.f9147a;
                Object obj = c0351ll.f9148b[0];
                if (c0248gk.f5516f.get()) {
                    c0248gk.mo7156b();
                } else {
                    c0248gk.mo7154a(obj);
                }
                c0248gk.f5515e = C0252go.f5907c;
                return;
            case 2:
                C0248gk.m2624c();
                return;
            default:
                return;
        }
    }
}
