package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: PG */
/* renamed from: hqx */
public final class hqx extends hqb implements ServiceConnection, hqv {
    /* renamed from: a */
    public final Context f24505a;
    /* renamed from: b */
    public int f24506b;
    /* renamed from: c */
    private final Handler f24507c = new Handler(Looper.getMainLooper());
    /* renamed from: d */
    private final hqw f24508d;
    /* renamed from: e */
    private final hqq f24509e;
    /* renamed from: f */
    private int f24510f = 1;
    /* renamed from: g */
    private hpw f24511g;
    /* renamed from: h */
    private hpy f24512h;

    public hqx(Context context, hqw hqw, hqq hqq) {
        this.f24505a = context;
        this.f24508d = hqw;
        this.f24509e = hqq;
    }

    /* renamed from: a */
    public final void mo8038a() {
        int i = 1;
        hhz.m3212a();
        int i2 = this.f24510f;
        if (!(i2 == 2 || i2 == 3 || i2 == 5 || i2 == 6)) {
            i = 0;
        }
        hhz.m3214a(i ^ 1, "Attempting to bind service when already bound.");
        this.f24509e.mo8033a(new hqy(this));
    }

    /* renamed from: b */
    public final int mo8040b() {
        boolean z = true;
        hhz.m3212a();
        int i = this.f24510f;
        if (!(i == 3 || i == 6)) {
            z = false;
        }
        hhz.m3214a(z, "Attempted to use lensServiceSession before ready.");
        return this.f24506b;
    }

    /* renamed from: g */
    final boolean mo14953g() {
        int i = this.f24510f;
        return i == 2 || i == 3 || i == 5 || i == 6;
    }

    /* renamed from: c */
    public final boolean mo8042c() {
        hhz.m3212a();
        return hqx.m16242b(this.f24510f);
    }

    /* renamed from: d */
    public final boolean mo8043d() {
        hhz.m3212a();
        return hqx.m16243c(this.f24510f);
    }

    /* renamed from: b */
    private static boolean m16242b(int i) {
        return i == 4 || i == 5 || i == 6;
    }

    /* renamed from: c */
    private static boolean m16243c(int i) {
        return i == 3;
    }

    /* renamed from: b */
    public final void mo8041b(byte[] bArr) {
        hhz.m3212a();
        hhz.m3214a(mo8043d(), "Attempted to use lensServiceSession before ready.");
        ((hpy) hhz.m3210a(this.f24512h)).mo8026a(bArr);
    }

    /* renamed from: a */
    public final void mo8039a(byte[] bArr, hqc hqc) {
        hhz.m3212a();
        hhz.m3214a(mo8043d(), "Attempted to use lensServiceSession before ready.");
        ((hpy) hhz.m3210a(this.f24512h)).mo8027a(bArr, hqc);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00b9  */
    public final void onServiceConnected(android.content.ComponentName r8, android.os.IBinder r9) {
        /*
        r7 = this;
        r6 = 5;
        r1 = 0;
        p000.hhz.m3212a();
        if (r9 == 0) goto L_0x00c4;
    L_0x0007:
        r0 = "com.google.android.apps.gsa.publicsearch.IPublicSearchService";
        r0 = r9.queryLocalInterface(r0);
        r2 = r0 instanceof p000.hpw;
        if (r2 == 0) goto L_0x00bd;
    L_0x0011:
        r0 = (p000.hpw) r0;
    L_0x0013:
        r7.f24511g = r0;
        r0 = p000.hqg.f26751c;
        r2 = p000.C0252go.f5880bZ;
        r0 = r0.mo15667a(r2, r1);
        r0 = (p000.krz) r0;
        r0 = (p000.ksa) r0;
        r2 = p000.hqe.START_CLIENT;
        r2 = r2.f20569h;
        r0 = r0.mo15746a(r2);
        r0 = r0.mo14191c();
        r2 = r0;
        r2 = (p000.hqg) r2;
        r0 = p000.hqg.f26751c;
        r3 = p000.C0252go.f5880bZ;
        r0 = r0.mo15667a(r3, r1);
        r0 = (p000.krz) r0;
        r0 = (p000.ksa) r0;
        r3 = p000.hqe.LENS_SERVICE_TARGET_API_VERSION;
        r3 = r3.f20569h;
        r3 = r0.mo15746a(r3);
        r4 = p000.hqh.f6812a;
        r0 = p000.hqi.f26678c;
        r5 = p000.C0252go.f5880bZ;
        r0 = r0.mo15667a(r5, r1);
        r0 = (p000.krz) r0;
        r0.mo15674h();
        r1 = r0.f26609b;
        r1 = (p000.hqi) r1;
        r5 = r1.f26680a;
        r5 = r5 | 1;
        r1.f26680a = r5;
        r5 = 1;
        r1.f26681b = r5;
        r0 = r0.mo14191c();
        r0 = (p000.hqi) r0;
        r0 = r3.mo15747a(r4, r0);
        r0 = r0.mo14191c();
        r0 = (p000.hqg) r0;
        r1 = r7.f24511g;	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1 = p000.hhz.m3210a(r1);	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1 = (p000.hpw) r1;	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r3 = "LENS_SERVICE_SESSION";
        r1 = r1.mo8025a(r3, r7);	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r7.f24512h = r1;	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1 = r7.f24512h;	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        if (r1 != 0) goto L_0x0090;
    L_0x0084:
        r0 = "LensServiceConnImpl";
        r1 = "Failed to create a Lens service session.";
        android.util.Log.e(r0, r1);	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r0 = 5;
        r7.mo14952a(r0);	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
    L_0x008f:
        return;
    L_0x0090:
        r1 = p000.hhz.m3210a(r1);	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1 = (p000.hpy) r1;	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r2 = r2.mo15156b();	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1.mo8026a(r2);	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1 = r7.f24512h;	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1 = p000.hhz.m3210a(r1);	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1 = (p000.hpy) r1;	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r0 = r0.mo15156b();	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        r1.mo8026a(r0);	 Catch:{ RemoteException -> 0x00ad, SecurityException -> 0x00cc }
        goto L_0x008f;
    L_0x00ad:
        r0 = move-exception;
    L_0x00ae:
        r1 = "LensServiceConnImpl";
        r2 = "Unable to begin Lens service session.";
        android.util.Log.e(r1, r2, r0);
        r0 = r7.f24512h;
        if (r0 != 0) goto L_0x00c7;
    L_0x00b9:
        r7.mo14952a(r6);
        goto L_0x008f;
    L_0x00bd:
        r0 = new hpx;
        r0.<init>(r9);
        goto L_0x0013;
    L_0x00c4:
        r0 = r1;
        goto L_0x0013;
    L_0x00c7:
        r0 = 6;
        r7.mo14952a(r0);
        goto L_0x008f;
    L_0x00cc:
        r0 = move-exception;
        goto L_0x00ae;
        */
        throw new UnsupportedOperationException("Method not decompiled: hqx.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        hhz.m3212a();
        mo14952a(5);
    }

    /* renamed from: a */
    public final void mo8028a(byte[] bArr) {
        this.f24507c.post(new hqz(this, bArr));
    }

    /* renamed from: e */
    public final void mo8044e() {
        Throwable e;
        hhz.m3212a();
        hhz.m3214a(mo8043d(), "Attempted to handover when not ready.");
        ksa a = ((ksa) ((krz) hqg.f26751c.mo15667a(C0252go.f5880bZ, null))).mo15746a(hqe.STOP_CLIENT.f20569h);
        krl krl = hql.f6814a;
        krz krz = (krz) hqm.f26686c.mo15667a(C0252go.f5880bZ, null);
        krz.mo15674h();
        hqm hqm = (hqm) krz.f26609b;
        hqm.f26688a |= 1;
        hqm.f26689b = true;
        try {
            ((hpy) hhz.m3210a(this.f24512h)).mo8026a(((hqg) a.mo15747a(krl, (hqm) krz.mo14191c()).mo14191c()).mo15156b());
        } catch (RemoteException e2) {
            e = e2;
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
            mo14952a(6);
        } catch (SecurityException e3) {
            e = e3;
            Log.e("LensServiceConnImpl", "Unable to stop Lens service session.", e);
            mo14952a(6);
        }
        mo14952a(6);
    }

    /* renamed from: a */
    final void mo14952a(int i) {
        Log.d("LensServiceConnImpl", String.format("Transitioning from state %s to %s.", new Object[]{Integer.valueOf(this.f24510f), Integer.valueOf(i)}));
        int i2 = this.f24510f;
        this.f24510f = i;
        if (hqx.m16243c(i) && !hqx.m16243c(i2)) {
            hqw hqw = this.f24508d;
            hhz.m3212a();
            hqw.mo8046a();
        }
        if (hqx.m16242b(i) && !hqx.m16242b(i2)) {
            hqw hqw2 = this.f24508d;
            hhz.m3212a();
            hqw2.mo8046a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* renamed from: f */
    public final void mo8045f() {
        /*
        r6 = this;
        r2 = 0;
        r5 = 0;
        r3 = 1;
        p000.hhz.m3212a();
        r0 = r6.f24510f;
        r1 = 3;
        if (r0 == r1) goto L_0x0051;
    L_0x000b:
        r1 = 6;
        if (r0 == r1) goto L_0x004f;
    L_0x000e:
        r0 = r2;
    L_0x000f:
        if (r0 == 0) goto L_0x003e;
    L_0x0011:
        r0 = p000.hqg.f26751c;
        r1 = p000.C0252go.f5880bZ;
        r0 = r0.mo15667a(r1, r5);
        r0 = (p000.krz) r0;
        r0 = (p000.ksa) r0;
        r1 = p000.hqe.END_SESSION;
        r1 = r1.f20569h;
        r0 = r0.mo15746a(r1);
        r0 = r0.mo14191c();
        r0 = (p000.hqg) r0;
        r1 = r6.f24512h;	 Catch:{ RemoteException -> 0x0053, SecurityException -> 0x005c }
        r1 = p000.hhz.m3210a(r1);	 Catch:{ RemoteException -> 0x0053, SecurityException -> 0x005c }
        r1 = (p000.hpy) r1;	 Catch:{ RemoteException -> 0x0053, SecurityException -> 0x005c }
        r0 = r0.mo15156b();	 Catch:{ RemoteException -> 0x0053, SecurityException -> 0x005c }
        r1.mo8026a(r0);	 Catch:{ RemoteException -> 0x0053, SecurityException -> 0x005c }
    L_0x003a:
        r6.f24512h = r5;
        r6.f24506b = r2;
    L_0x003e:
        r0 = r6.mo14953g();
        if (r0 == 0) goto L_0x004b;
    L_0x0044:
        r0 = r6.f24505a;
        r0.unbindService(r6);
        r6.f24511g = r5;
    L_0x004b:
        r6.mo14952a(r3);
        return;
    L_0x004f:
        r0 = r3;
        goto L_0x000f;
    L_0x0051:
        r0 = r3;
        goto L_0x000f;
    L_0x0053:
        r0 = move-exception;
    L_0x0054:
        r1 = "LensServiceConnImpl";
        r4 = "Unable to end Lens service session.";
        android.util.Log.e(r1, r4, r0);
        goto L_0x003a;
    L_0x005c:
        r0 = move-exception;
        goto L_0x0054;
        */
        throw new UnsupportedOperationException("Method not decompiled: hqx.f():void");
    }
}
