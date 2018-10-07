package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* renamed from: mr */
final class C0374mr extends BroadcastReceiver {
    /* renamed from: a */
    private final /* synthetic */ C0373mq f9201a;

    C0374mr(C0373mq c0373mq) {
        this.f9201a = c0373mq;
    }

    public final void onReceive(Context context, Intent intent) {
        C0373mq c0373mq = this.f9201a;
        boolean a = c0373mq.f9196a.mo10702a();
        if (a != c0373mq.f9197b) {
            c0373mq.f9197b = a;
            c0373mq.f9200e.mo10675a();
        }
    }
}
