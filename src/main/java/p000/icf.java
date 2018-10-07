package p000;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: icf */
public final class icf implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    /* renamed from: a */
    public static final icf f7296a = new icf();
    /* renamed from: b */
    public final AtomicBoolean f7297b = new AtomicBoolean();
    /* renamed from: c */
    public final AtomicBoolean f7298c = new AtomicBoolean();
    /* renamed from: d */
    public final ArrayList f7299d = new ArrayList();
    /* renamed from: e */
    public boolean f7300e = false;

    private icf() {
    }

    /* renamed from: a */
    private final void m3725a(boolean z) {
        synchronized (f7296a) {
            Iterator it = this.f7299d.iterator();
            while (it.hasNext()) {
                icg icg = (icg) it.next();
                icg.f7301a.f7319h.sendMessage(icg.f7301a.f7319h.obtainMessage(1, Boolean.valueOf(z)));
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f7297b.compareAndSet(true, false);
        this.f7298c.set(true);
        if (compareAndSet) {
            m3725a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f7297b.compareAndSet(true, false);
        this.f7298c.set(true);
        if (compareAndSet) {
            m3725a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f7297b.compareAndSet(false, true)) {
            this.f7298c.set(true);
            m3725a(true);
        }
    }
}
