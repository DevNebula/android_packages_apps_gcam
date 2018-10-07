package p000;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hwd */
public final class hwd implements Callback {
    /* renamed from: a */
    public final hwe f7129a;
    /* renamed from: b */
    public final ArrayList f7130b = new ArrayList();
    /* renamed from: c */
    public final ArrayList f7131c = new ArrayList();
    /* renamed from: d */
    public final ArrayList f7132d = new ArrayList();
    /* renamed from: e */
    public volatile boolean f7133e = false;
    /* renamed from: f */
    public final AtomicInteger f7134f = new AtomicInteger(0);
    /* renamed from: g */
    public boolean f7135g = false;
    /* renamed from: h */
    public final Handler f7136h;
    /* renamed from: i */
    public final Object f7137i = new Object();

    public hwd(Looper looper, hwe hwe) {
        this.f7129a = hwe;
        this.f7136h = new Handler(looper, this);
    }

    /* renamed from: a */
    public final void mo8216a() {
        this.f7133e = false;
        this.f7134f.incrementAndGet();
    }

    /* renamed from: a */
    public final void mo8217a(hus hus) {
        htl.m3488b((Object) hus);
        synchronized (this.f7137i) {
            if (this.f7130b.contains(hus)) {
                String valueOf = String.valueOf(hus);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 62);
                stringBuilder.append("registerConnectionCallbacks(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f7130b.add(hus);
            }
        }
        if (this.f7129a.mo8220d()) {
            Handler handler = this.f7136h;
            handler.sendMessage(handler.obtainMessage(1, hus));
        }
    }

    /* renamed from: a */
    public final void mo8218a(hut hut) {
        htl.m3488b((Object) hut);
        synchronized (this.f7137i) {
            if (this.f7132d.contains(hut)) {
                String valueOf = String.valueOf(hut);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 67);
                stringBuilder.append("registerConnectionFailedListener(): listener ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is already registered");
                Log.w("GmsClientEvents", stringBuilder.toString());
            } else {
                this.f7132d.add(hut);
            }
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            hus hus = (hus) message.obj;
            synchronized (this.f7137i) {
                if (this.f7133e && this.f7129a.mo8220d() && this.f7130b.contains(hus)) {
                    this.f7129a.mo8221l();
                    hus.mo8149a(null);
                }
            }
            return true;
        }
        int i = message.what;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("Don't know how to handle message: ");
        stringBuilder.append(i);
        Log.wtf("GmsClientEvents", stringBuilder.toString(), new Exception());
        return false;
    }
}
