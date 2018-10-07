package p000;

import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* renamed from: kqa */
public final class kqa implements Runnable {
    /* renamed from: a */
    private kpz f8785a;

    public kqa(kpz kpz) {
        this.f8785a = kpz;
    }

    public final void run() {
        kpz kpz = this.f8785a;
        if (kpz != null) {
            kpk kpk = kpz.f26778e;
            if (kpk != null) {
                this.f8785a = null;
                if (kpk.isDone()) {
                    kpz.mo15644b(kpk);
                    return;
                }
                try {
                    String valueOf = String.valueOf(kpk);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                    stringBuilder.append("Future timed out: ");
                    stringBuilder.append(valueOf);
                    kpz.mo15642a(new TimeoutException(stringBuilder.toString()));
                } finally {
                    kpk.cancel(true);
                }
            }
        }
    }
}
