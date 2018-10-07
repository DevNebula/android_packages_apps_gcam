package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: hvt */
public final class hvt implements ServiceConnection {
    /* renamed from: a */
    private final int f7109a;
    /* renamed from: b */
    private final /* synthetic */ hvm f7110b;

    public hvt(hvm hvm, int i) {
        this.f7110b = hvm;
        this.f7109a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (iBinder != null) {
            synchronized (this.f7110b.f7086e) {
                hwr hwr;
                hvm hvm = this.f7110b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    hwr = (queryLocalInterface != null && (queryLocalInterface instanceof hwr)) ? (hwr) queryLocalInterface : new hwr(iBinder);
                } else {
                    hwr = null;
                }
                hvm.f7087f = hwr;
            }
            this.f7110b.mo8178a(0, this.f7109a);
            return;
        }
        this.f7110b.mo8178a(8, this.f7109a);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f7110b.f7086e) {
            this.f7110b.f7087f = null;
        }
        Handler handler = this.f7110b.f7085d;
        handler.sendMessage(handler.obtainMessage(4, this.f7109a, 1));
    }
}
