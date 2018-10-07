package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.p001v4.app.Fragment;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: apf */
public final class apf implements Callback {
    /* renamed from: e */
    private static final apg f854e = new apg();
    /* renamed from: a */
    private volatile acm f855a;
    /* renamed from: b */
    private final Map f856b = new HashMap();
    /* renamed from: c */
    private final Map f857c = new HashMap();
    /* renamed from: d */
    private final Handler f858d;

    public apf(apg apg) {
        C0691ih c0691ih = new C0691ih();
        c0691ih = new C0691ih();
        Bundle bundle = new Bundle();
        this.f858d = new Handler(Looper.getMainLooper(), this);
    }

    @TargetApi(17)
    /* renamed from: a */
    public static void m562a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: a */
    public final acm mo1654a(Context context) {
        if (this.f855a == null) {
            synchronized (this) {
                if (this.f855a == null) {
                    this.f855a = apg.m567a(acc.m98a(context.getApplicationContext()), new aot(), new aoz(), context.getApplicationContext());
                }
            }
        }
        return this.f855a;
    }

    /* renamed from: a */
    public final apd mo1655a(FragmentManager fragmentManager, boolean z) {
        apd apd = (apd) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (apd == null) {
            apd = (apd) this.f856b.get(fragmentManager);
            if (apd == null) {
                apd = new apd();
                apd.f851d = null;
                if (z) {
                    apd.f848a.mo12299b();
                }
                this.f856b.put(fragmentManager, apd);
                fragmentManager.beginTransaction().add(apd, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f858d.obtainMessage(1, fragmentManager).sendToTarget();
            }
        }
        return apd;
    }

    /* renamed from: a */
    public final apj mo1656a(android.support.p001v4.app.FragmentManager fragmentManager, boolean z) {
        apj apj = (apj) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (apj == null) {
            apj = (apj) this.f857c.get(fragmentManager);
            if (apj == null) {
                apj = new apj();
                apj.f22506d = null;
                if (z) {
                    apj.f22503a.mo12299b();
                }
                this.f857c.put(fragmentManager, apj);
                fragmentManager.beginTransaction().add((Fragment) apj, "com.bumptech.glide.manager").commitAllowingStateLoss();
                this.f858d.obtainMessage(2, fragmentManager).sendToTarget();
            }
        }
        return apj;
    }

    public final boolean handleMessage(Message message) {
        boolean z;
        Object obj;
        Object obj2 = null;
        switch (message.what) {
            case 1:
                FragmentManager fragmentManager = (FragmentManager) message.obj;
                obj2 = this.f856b.remove(fragmentManager);
                FragmentManager obj3 = fragmentManager;
                z = true;
                break;
            case 2:
                android.support.p001v4.app.FragmentManager fragmentManager2 = (android.support.p001v4.app.FragmentManager) message.obj;
                obj2 = this.f857c.remove(fragmentManager2);
                android.support.p001v4.app.FragmentManager obj32 = fragmentManager2;
                z = true;
                break;
            default:
                z = false;
                obj32 = null;
                break;
        }
        if (z && obj2 == null && Log.isLoggable("RMRetriever", 5)) {
            String valueOf = String.valueOf(obj32);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
            stringBuilder.append("Failed to remove expected request manager fragment, manager: ");
            stringBuilder.append(valueOf);
            Log.w("RMRetriever", stringBuilder.toString());
        }
        return z;
    }

    /* renamed from: b */
    static boolean m563b(Activity activity) {
        return activity.isFinishing() ^ 1;
    }
}
