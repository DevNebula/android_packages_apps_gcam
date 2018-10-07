package p000;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: ear */
final class ear implements Runnable {
    /* renamed from: a */
    public final /* synthetic */ eaq f3674a;

    ear(eaq eaq) {
        this.f3674a = eaq;
    }

    public final void run() {
        synchronized (this.f3674a.f17126k) {
            if (this.f3674a.f17126k.booleanValue()) {
                this.f3674a.f17127l = Boolean.valueOf(true);
                return;
            }
            this.f3674a.f17126k = Boolean.valueOf(true);
            new eas(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }
}
