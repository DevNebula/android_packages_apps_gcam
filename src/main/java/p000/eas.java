package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.google.android.apps.camera.legacy.app.tinyplanet.TinyPlanetPreview;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* renamed from: eas */
final class eas extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ ear f3675a;

    eas(ear ear) {
        this.f3675a = ear;
    }

    /* renamed from: a */
    private final Void m1789a() {
        this.f3675a.f3674a.f17116a.lock();
        try {
            eaq eaq = this.f3675a.f3674a;
            Bitmap bitmap = eaq.f17124i;
            if (bitmap != null) {
                Bitmap bitmap2 = eaq.f17125j;
                if (bitmap2 != null) {
                    eaq.mo13108a(bitmap, bitmap2);
                    return null;
                }
            }
            eaq.f17116a.unlock();
            return null;
        } finally {
            this.f3675a.f3674a.f17116a.unlock();
        }
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        eaq eaq = this.f3675a.f3674a;
        TinyPlanetPreview tinyPlanetPreview = eaq.f17119d;
        Bitmap bitmap = eaq.f17125j;
        Lock lock = eaq.f17116a;
        tinyPlanetPreview.f2558a = bitmap;
        tinyPlanetPreview.f2559b = lock;
        tinyPlanetPreview.invalidate();
        synchronized (this.f3675a.f3674a.f17126k) {
            eaq = this.f3675a.f3674a;
            Boolean valueOf = Boolean.valueOf(false);
            eaq.f17126k = valueOf;
            if (eaq.f17127l.booleanValue()) {
                eaq = this.f3675a.f3674a;
                eaq.f17127l = valueOf;
                eaq.mo13109b();
            }
        }
    }
}
