package p000;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* compiled from: PG */
/* renamed from: mq */
final class C0373mq {
    /* renamed from: a */
    public C0380nc f9196a;
    /* renamed from: b */
    public boolean f9197b;
    /* renamed from: c */
    public BroadcastReceiver f9198c;
    /* renamed from: d */
    public IntentFilter f9199d;
    /* renamed from: e */
    public final /* synthetic */ C0713mg f9200e;

    C0373mq(C0713mg c0713mg, C0380nc c0380nc) {
        this.f9200e = c0713mg;
        this.f9196a = c0380nc;
        this.f9197b = c0380nc.mo10702a();
    }

    /* renamed from: a */
    final void mo10692a() {
        BroadcastReceiver broadcastReceiver = this.f9198c;
        if (broadcastReceiver != null) {
            this.f9200e.f22059b.unregisterReceiver(broadcastReceiver);
            this.f9198c = null;
        }
    }
}
