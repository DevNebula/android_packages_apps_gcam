package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: hwh */
final class hwh extends hwf implements Callback {
    /* renamed from: a */
    private final HashMap f20820a = new HashMap();
    /* renamed from: b */
    private final Context f20821b;
    /* renamed from: c */
    private final Handler f20822c;
    /* renamed from: d */
    private final hwt f20823d;
    /* renamed from: e */
    private final long f20824e;
    /* renamed from: f */
    private final long f20825f;

    hwh(Context context) {
        this.f20821b = context.getApplicationContext();
        this.f20822c = new Handler(context.getMainLooper(), this);
        this.f20823d = hwt.m3624a();
        this.f20824e = 5000;
        this.f20825f = 300000;
    }

    public final boolean handleMessage(Message message) {
        hwg hwg;
        switch (message.what) {
            case 0:
                synchronized (this.f20820a) {
                    hwg = (hwg) message.obj;
                    ServiceConnection serviceConnection = (hwi) this.f20820a.get(hwg);
                    if (serviceConnection != null && serviceConnection.mo8232b()) {
                        if (serviceConnection.f7144c) {
                            serviceConnection.f7148g.f20822c.removeMessages(1, serviceConnection.f7146e);
                            hwt.m3625a(serviceConnection.f7148g.f20821b, serviceConnection);
                            serviceConnection.f7144c = false;
                            serviceConnection.f7143b = 2;
                        }
                        this.f20820a.remove(hwg);
                    }
                }
                return true;
            case 1:
                synchronized (this.f20820a) {
                    hwg = (hwg) message.obj;
                    hwi hwi = (hwi) this.f20820a.get(hwg);
                    if (hwi != null && hwi.f7143b == 3) {
                        String valueOf = String.valueOf(hwg);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        stringBuilder.append("Timeout waiting for ServiceConnection callback ");
                        stringBuilder.append(valueOf);
                        Log.wtf("GmsClientSupervisor", stringBuilder.toString(), new Exception());
                        ComponentName componentName = hwi.f7147f;
                        if (componentName == null) {
                            componentName = null;
                        }
                        if (componentName == null) {
                            componentName = new ComponentName(hwg.f7140a, "unknown");
                        }
                        hwi.onServiceDisconnected(componentName);
                    }
                }
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    protected final boolean mo8223a(hwg hwg, ServiceConnection serviceConnection) {
        boolean z;
        htl.m3489b((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f20820a) {
            hwi hwi = (hwi) this.f20820a.get(hwg);
            if (hwi != null) {
                this.f20822c.removeMessages(0, hwg);
                if (!hwi.mo8230a(serviceConnection)) {
                    hwi.mo8231b(serviceConnection);
                    switch (hwi.f7143b) {
                        case 1:
                            serviceConnection.onServiceConnected(hwi.f7147f, hwi.f7145d);
                            break;
                        case 2:
                            hwi.mo8229a();
                            break;
                    }
                }
                String valueOf = String.valueOf(hwg);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 81);
                stringBuilder.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
            hwi = new hwi(this, hwg);
            hwi.mo8231b(serviceConnection);
            hwi.mo8229a();
            this.f20820a.put(hwg, hwi);
            z = hwi.f7144c;
        }
        return z;
    }

    /* renamed from: b */
    protected final void mo8224b(hwg hwg, ServiceConnection serviceConnection) {
        htl.m3489b((Object) serviceConnection, (Object) "ServiceConnection must not be null");
        synchronized (this.f20820a) {
            hwi hwi = (hwi) this.f20820a.get(hwg);
            String valueOf;
            StringBuilder stringBuilder;
            if (hwi == null) {
                valueOf = String.valueOf(hwg);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 50);
                stringBuilder.append("Nonexistent connection status for service config: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (hwi.mo8230a(serviceConnection)) {
                hwt.m3628c();
                hwi.f7142a.remove(serviceConnection);
                if (hwi.mo8232b()) {
                    this.f20822c.sendMessageDelayed(this.f20822c.obtainMessage(0, hwg), this.f20824e);
                }
            } else {
                valueOf = String.valueOf(hwg);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 76);
                stringBuilder.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
    }
}
