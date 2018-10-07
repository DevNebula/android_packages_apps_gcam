package p000;

import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvq */
final class hvq extends Handler {
    /* renamed from: a */
    private final /* synthetic */ hvm f7105a;

    public hvq(hvm hvm, Looper looper) {
        this.f7105a = hvm;
        super(looper);
    }

    /* renamed from: a */
    private static void m3586a(Message message) {
        hvr hvr = (hvr) message.obj;
        hvr.mo8204a();
        hvr.mo8206c();
    }

    /* renamed from: b */
    private static boolean m3587b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 5;
    }

    public final void handleMessage(Message message) {
        PendingIntent pendingIntent = null;
        if (this.f7105a.f7092k.get() == message.arg1) {
            if ((message.what == 1 || message.what == 5) && !this.f7105a.mo8190e()) {
                hvq.m3586a(message);
            } else if (message.what == 3) {
                if (message.obj instanceof PendingIntent) {
                    pendingIntent = (PendingIntent) message.obj;
                }
                ConnectionResult connectionResult = new ConnectionResult(message.arg2, pendingIntent);
                this.f7105a.f7088g.mo8208a(connectionResult);
                this.f7105a.mo8181a(connectionResult);
            } else if (message.what == 4) {
                this.f7105a.mo8180a(4, null);
                hvo hvo = this.f7105a.f7090i;
                if (hvo != null) {
                    hvo.f7103a.mo8148a(message.arg2);
                }
                hvm hvm = this.f7105a;
                hvm.f7082a = message.arg2;
                hvm.f7083b = System.currentTimeMillis();
                this.f7105a.mo8186a(4, 1, null);
            } else if (message.what == 2 && !this.f7105a.mo8189d()) {
                hvq.m3586a(message);
            } else if (hvq.m3587b(message)) {
                Object obj;
                hvr hvr = (hvr) message.obj;
                synchronized (hvr) {
                    obj = hvr.f7106a;
                    if (hvr.f7107b) {
                        String valueOf = String.valueOf(hvr);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        stringBuilder.append("Callback proxy ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" being reused. This is not safe.");
                        Log.w("GmsClient", stringBuilder.toString());
                    }
                }
                if (obj == null) {
                    hvr.mo8204a();
                } else {
                    try {
                        hvr.mo8205a(obj);
                    } catch (RuntimeException e) {
                        hvr.mo8204a();
                        throw e;
                    }
                }
                synchronized (hvr) {
                    hvr.f7107b = true;
                }
                hvr.mo8206c();
            } else {
                int i = message.what;
                StringBuilder stringBuilder2 = new StringBuilder(45);
                stringBuilder2.append("Don't know how to handle message: ");
                stringBuilder2.append(i);
                Log.wtf("GmsClient", stringBuilder2.toString(), new Exception());
            }
        } else if (hvq.m3587b(message)) {
            hvq.m3586a(message);
        }
    }
}
