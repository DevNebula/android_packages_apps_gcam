package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hwi */
final class hwi implements ServiceConnection {
    /* renamed from: a */
    public final Set f7142a = new HashSet();
    /* renamed from: b */
    public int f7143b = 2;
    /* renamed from: c */
    public boolean f7144c;
    /* renamed from: d */
    public IBinder f7145d;
    /* renamed from: e */
    public final hwg f7146e;
    /* renamed from: f */
    public ComponentName f7147f;
    /* renamed from: g */
    public final /* synthetic */ hwh f7148g;

    public hwi(hwh hwh, hwg hwg) {
        this.f7148g = hwh;
        this.f7146e = hwg;
    }

    /* renamed from: a */
    public final void mo8229a() {
        boolean z;
        this.f7143b = 3;
        this.f7148g.f20823d;
        Context c = this.f7148g.f20821b;
        Intent a = this.f7146e.mo8225a();
        if (hwt.m3626a(c, a)) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            z = false;
        } else {
            z = c.bindService(a, this, ScriptIntrinsicBLAS.RsBlas_ctrmm);
        }
        this.f7144c = z;
        if (this.f7144c) {
            this.f7148g.f20822c.sendMessageDelayed(this.f7148g.f20822c.obtainMessage(1, this.f7146e), this.f7148g.f20825f);
            return;
        }
        this.f7143b = 2;
        try {
            this.f7148g.f20823d;
            hwt.m3625a(this.f7148g.f20821b, (ServiceConnection) this);
        } catch (IllegalArgumentException e) {
        }
    }

    /* renamed from: a */
    public final boolean mo8230a(ServiceConnection serviceConnection) {
        return this.f7142a.contains(serviceConnection);
    }

    /* renamed from: b */
    public final void mo8231b(ServiceConnection serviceConnection) {
        this.f7148g.f20823d;
        this.f7148g.f20821b;
        this.f7146e.mo8225a();
        hwt.m3627b();
        this.f7142a.add(serviceConnection);
    }

    /* renamed from: b */
    public final boolean mo8232b() {
        return this.f7142a.isEmpty();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f7148g.f20820a) {
            this.f7148g.f20822c.removeMessages(1, this.f7146e);
            this.f7145d = iBinder;
            this.f7147f = componentName;
            for (ServiceConnection onServiceConnected : this.f7142a) {
                onServiceConnected.onServiceConnected(componentName, iBinder);
            }
            this.f7143b = 1;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7148g.f20820a) {
            this.f7148g.f20822c.removeMessages(1, this.f7146e);
            this.f7145d = null;
            this.f7147f = componentName;
            for (ServiceConnection onServiceDisconnected : this.f7142a) {
                onServiceDisconnected.onServiceDisconnected(componentName);
            }
            this.f7143b = 2;
        }
    }
}
