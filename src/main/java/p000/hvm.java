package p000;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.zzc;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: hvm */
public abstract class hvm {
    /* renamed from: a */
    public int f7082a;
    /* renamed from: b */
    public long f7083b;
    /* renamed from: c */
    public final Context f7084c;
    /* renamed from: d */
    public final Handler f7085d;
    /* renamed from: e */
    public final Object f7086e = new Object();
    /* renamed from: f */
    public hwr f7087f;
    /* renamed from: g */
    public hvs f7088g;
    /* renamed from: h */
    public final ArrayList f7089h = new ArrayList();
    /* renamed from: i */
    public final hvo f7090i;
    /* renamed from: j */
    public final hvp f7091j;
    /* renamed from: k */
    public AtomicInteger f7092k = new AtomicInteger(0);
    /* renamed from: l */
    private long f7093l;
    /* renamed from: m */
    private int f7094m;
    /* renamed from: n */
    private long f7095n;
    /* renamed from: o */
    private final hwf f7096o;
    /* renamed from: p */
    private final Object f7097p = new Object();
    /* renamed from: q */
    private IInterface f7098q;
    /* renamed from: r */
    private hvt f7099r;
    /* renamed from: s */
    private int f7100s = 1;
    /* renamed from: t */
    private final int f7101t;
    /* renamed from: u */
    private final String f7102u;

    protected hvm(Context context, Looper looper, hwf hwf, huc huc, int i, hvo hvo, hvp hvp, String str) {
        this.f7084c = (Context) htl.m3489b((Object) context, (Object) "Context must not be null");
        htl.m3489b((Object) looper, (Object) "Looper must not be null");
        this.f7096o = (hwf) htl.m3489b((Object) hwf, (Object) "Supervisor must not be null");
        htl.m3489b((Object) huc, (Object) "API availability must not be null");
        this.f7085d = new hvq(this, looper);
        this.f7101t = i;
        this.f7090i = hvo;
        this.f7091j = hvp;
        this.f7102u = str;
    }

    /* renamed from: i */
    private final String mo14964i() {
        String str = this.f7102u;
        return str == null ? this.f7084c.getClass().getName() : str;
    }

    /* renamed from: a */
    public abstract IInterface mo8176a(IBinder iBinder);

    /* renamed from: a */
    public abstract String mo8177a();

    /* renamed from: a */
    protected final void mo8178a(int i, int i2) {
        Handler handler = this.f7085d;
        handler.sendMessage(handler.obtainMessage(5, i2, -1, new hvw(this, i)));
    }

    /* renamed from: a */
    public void mo8179a(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f7085d;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new hvv(this, i, iBinder, bundle)));
    }

    /* renamed from: a */
    protected final void mo8181a(ConnectionResult connectionResult) {
        this.f7094m = connectionResult.f23349b;
        this.f7095n = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void mo8182a(hvs hvs) {
        this.f7088g = (hvs) htl.m3489b((Object) hvs, (Object) "Connection progress callbacks cannot be null.");
        mo8180a(2, null);
    }

    /* renamed from: a */
    public final void mo8183a(hvs hvs, int i, PendingIntent pendingIntent) {
        this.f7088g = (hvs) htl.m3489b((Object) hvs, (Object) "Connection progress callbacks cannot be null.");
        Handler handler = this.f7085d;
        handler.sendMessage(handler.obtainMessage(3, this.f7092k.get(), i, pendingIntent));
    }

    /* renamed from: a */
    public final void mo8185a(String str, PrintWriter printWriter) {
        int i;
        IInterface iInterface;
        hwr hwr;
        PrintWriter append;
        long j;
        String valueOf;
        StringBuilder stringBuilder;
        synchronized (this.f7097p) {
            i = this.f7100s;
            iInterface = this.f7098q;
        }
        synchronized (this.f7086e) {
            hwr = this.f7087f;
        }
        printWriter.append(str).append("mConnectState=");
        switch (i) {
            case 1:
                printWriter.print("DISCONNECTED");
                break;
            case 2:
                printWriter.print("CONNECTING");
                break;
            case 3:
                printWriter.print("CONNECTED");
                break;
            case 4:
                printWriter.print("DISCONNECTING");
                break;
            default:
                printWriter.print("UNKNOWN");
                break;
        }
        printWriter.append(" mService=");
        if (iInterface != null) {
            printWriter.append(mo8187b()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        } else {
            printWriter.append("null");
        }
        printWriter.append(" mServiceBroker=");
        if (hwr != null) {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(hwr.asBinder())));
        } else {
            printWriter.println("null");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f7093l > 0) {
            append = printWriter.append(str).append("lastConnectedTime=");
            j = this.f7093l;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(j)));
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(valueOf);
            append.println(stringBuilder.toString());
        }
        if (this.f7083b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f7082a;
            switch (i2) {
                case 1:
                    printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                    break;
                case 2:
                    printWriter.append("CAUSE_NETWORK_LOST");
                    break;
                default:
                    printWriter.append(String.valueOf(i2));
                    break;
            }
            append = printWriter.append(" lastSuspendedTime=");
            j = this.f7083b;
            valueOf = String.valueOf(simpleDateFormat.format(new Date(j)));
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append(j);
            stringBuilder.append(" ");
            stringBuilder.append(valueOf);
            append.println(stringBuilder.toString());
        }
        if (this.f7095n > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(htl.m3458a(this.f7094m));
            append = printWriter.append(" lastFailedTime=");
            j = this.f7095n;
            String valueOf2 = String.valueOf(simpleDateFormat.format(new Date(j)));
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
            stringBuilder2.append(j);
            stringBuilder2.append(" ");
            stringBuilder2.append(valueOf2);
            append.println(stringBuilder2.toString());
        }
    }

    /* renamed from: a */
    final boolean mo8186a(int i, int i2, IInterface iInterface) {
        synchronized (this.f7097p) {
            if (this.f7100s == i) {
                mo8180a(i2, iInterface);
                return true;
            }
            return false;
        }
    }

    /* renamed from: b */
    public abstract String mo8187b();

    /* renamed from: c */
    public void mo8188c() {
        this.f7092k.incrementAndGet();
        synchronized (this.f7089h) {
            int size = this.f7089h.size();
            for (int i = 0; i < size; i++) {
                ((hvr) this.f7089h.get(i)).mo8207d();
            }
            this.f7089h.clear();
        }
        synchronized (this.f7086e) {
            this.f7087f = null;
        }
        mo8180a(1, null);
    }

    /* renamed from: d */
    public final boolean mo8189d() {
        boolean z;
        synchronized (this.f7097p) {
            z = this.f7100s == 3;
        }
        return z;
    }

    /* renamed from: e */
    public final boolean mo8190e() {
        boolean z;
        synchronized (this.f7097p) {
            z = this.f7100s == 2;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo8191f() {
        return false;
    }

    /* renamed from: g */
    public final boolean mo8192g() {
        return false;
    }

    /* renamed from: h */
    public boolean mo8193h() {
        return true;
    }

    /* renamed from: j */
    public Account mo8194j() {
        return null;
    }

    /* renamed from: k */
    public Bundle mo8195k() {
        return new Bundle();
    }

    /* renamed from: l */
    public final Bundle mo8196l() {
        return null;
    }

    /* renamed from: m */
    public String mo8197m() {
        return "com.google.android.gms";
    }

    /* renamed from: n */
    public zzc[] mo8198n() {
        return new zzc[0];
    }

    /* renamed from: o */
    public final void mo8199o() {
        if (!mo8189d()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* renamed from: p */
    public final IInterface mo8200p() {
        IInterface iInterface;
        synchronized (this.f7097p) {
            if (this.f7100s == 4) {
                throw new DeadObjectException();
            }
            mo8199o();
            htl.m3479a(this.f7098q != null, (Object) "Client is connected but service is null");
            iInterface = this.f7098q;
        }
        return iInterface;
    }

    /* renamed from: q */
    protected Set mo8201q() {
        return Collections.EMPTY_SET;
    }

    /* renamed from: a */
    final void mo8180a(int i, IInterface iInterface) {
        boolean z = true;
        if ((i == 3) != (iInterface != null)) {
            z = false;
        }
        htl.m3492b(z);
        synchronized (this.f7097p) {
            this.f7100s = i;
            this.f7098q = iInterface;
            hwf hwf;
            String a;
            String m;
            ServiceConnection serviceConnection;
            switch (i) {
                case 1:
                    if (this.f7099r != null) {
                        hwf = this.f7096o;
                        a = mo8177a();
                        m = mo8197m();
                        serviceConnection = this.f7099r;
                        mo14964i();
                        hwf.mo8222a(a, m, serviceConnection);
                        this.f7099r = null;
                        break;
                    }
                    break;
                case 2:
                    String valueOf;
                    StringBuilder stringBuilder;
                    if (this.f7099r != null) {
                        valueOf = String.valueOf(mo8177a());
                        a = String.valueOf(mo8197m());
                        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(a).length());
                        stringBuilder.append("Calling connect() while still connected, missing disconnect() for ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" on ");
                        stringBuilder.append(a);
                        Log.e("GmsClient", stringBuilder.toString());
                        hwf = this.f7096o;
                        a = mo8177a();
                        m = mo8197m();
                        serviceConnection = this.f7099r;
                        mo14964i();
                        hwf.mo8222a(a, m, serviceConnection);
                        this.f7092k.incrementAndGet();
                    }
                    this.f7099r = new hvt(this, this.f7092k.get());
                    hwf = this.f7096o;
                    a = mo8177a();
                    m = mo8197m();
                    serviceConnection = this.f7099r;
                    mo14964i();
                    if (!hwf.mo8223a(new hwg(a, m), serviceConnection)) {
                        valueOf = String.valueOf(mo8177a());
                        a = String.valueOf(mo8197m());
                        stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 34) + String.valueOf(a).length());
                        stringBuilder.append("unable to connect to service: ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" on ");
                        stringBuilder.append(a);
                        Log.e("GmsClient", stringBuilder.toString());
                        mo8178a(16, this.f7092k.get());
                        break;
                    }
                    break;
                case 3:
                    this.f7093l = System.currentTimeMillis();
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo8184a(hwk hwk, Set set) {
        Throwable e;
        Bundle k = mo8195k();
        zzj zzj = new zzj(this.f7101t);
        zzj.f23387a = this.f7084c.getPackageName();
        zzj.f23390d = k;
        if (set != null) {
            zzj.f23389c = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo8191f()) {
            zzj.f23391e = mo8194j() == null ? new Account("<<default account>>", "com.google") : mo8194j();
            if (hwk != null) {
                zzj.f23388b = hwk.asBinder();
            }
        }
        zzj.f23392f = mo8198n();
        Parcel obtain;
        Parcel obtain2;
        try {
            synchronized (this.f7086e) {
                hwr hwr = this.f7087f;
                if (hwr == null) {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                } else {
                    hwp hwq = new hwq(this, this.f7092k.get());
                    obtain = Parcel.obtain();
                    obtain2 = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(hwq.asBinder());
                    obtain.writeInt(1);
                    zzj.writeToParcel(obtain, 0);
                    hwr.f7149a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        } catch (Throwable e2) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            Handler handler = this.f7085d;
            handler.sendMessage(handler.obtainMessage(4, this.f7092k.get(), 1));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RemoteException e4) {
            e2 = e4;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            mo8179a(8, null, null, this.f7092k.get());
        } catch (RuntimeException e5) {
            e2 = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
            mo8179a(8, null, null, this.f7092k.get());
        } catch (Throwable th) {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
