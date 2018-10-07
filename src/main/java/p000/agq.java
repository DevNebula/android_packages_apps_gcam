package p000;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* renamed from: agq */
final class agq {
    /* renamed from: a */
    private boolean f443a;
    /* renamed from: b */
    private final Handler f444b = new Handler(Looper.getMainLooper(), new agr());

    agq() {
    }

    /* renamed from: a */
    final void mo266a(agn agn) {
        arq.m678a();
        if (this.f443a) {
            this.f444b.obtainMessage(1, agn).sendToTarget();
            return;
        }
        this.f443a = true;
        agn.mo265e();
        this.f443a = false;
    }
}
