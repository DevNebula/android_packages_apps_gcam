package p000;

import android.os.AsyncTask;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.GoogleCamera.R;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: eav */
final class eav implements OnClickListener {
    /* renamed from: a */
    private final /* synthetic */ eaq f3678a;

    eav(eaq eaq) {
        this.f3678a = eaq;
    }

    public final void onClick(View view) {
        eaq eaq = this.f3678a;
        synchronized (eaq.f17126k) {
            eaq.f17127l = Boolean.valueOf(false);
        }
        String string = eaq.getActivity().getResources().getString(R.string.saving_tiny_planet);
        AtomicReference atomicReference = new AtomicReference();
        long currentTimeMillis = System.currentTimeMillis();
        String str = eaq.f17123h;
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 32);
        stringBuilder.append("TINYPLANET_");
        stringBuilder.append(str);
        stringBuilder.append("_");
        stringBuilder.append(currentTimeMillis);
        new eaw(eaq, atomicReference, stringBuilder.toString(), currentTimeMillis, string).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
