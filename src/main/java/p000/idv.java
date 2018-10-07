package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: idv */
public final class idv implements Callback {
    /* renamed from: a */
    public static final Status f7311a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* renamed from: b */
    public static final Status f7312b = new Status(4, "The user must be signed in to make this API call.");
    /* renamed from: c */
    public static final Object f7313c = new Object();
    /* renamed from: l */
    private static idv f7314l;
    /* renamed from: d */
    public final Context f7315d;
    /* renamed from: e */
    public final AtomicInteger f7316e = new AtomicInteger(1);
    /* renamed from: f */
    public final AtomicInteger f7317f = new AtomicInteger(0);
    /* renamed from: g */
    public final Map f7318g = new ConcurrentHashMap(5, 0.75f, 1);
    /* renamed from: h */
    public final Handler f7319h;
    /* renamed from: i */
    private long f7320i = 5000;
    /* renamed from: j */
    private long f7321j = 120000;
    /* renamed from: k */
    private long f7322k = 10000;
    /* renamed from: m */
    private final hua f7323m;
    /* renamed from: n */
    private int f7324n = -1;
    /* renamed from: o */
    private final Set f7325o = new hwv();
    /* renamed from: p */
    private final Set f7326p = new hwv();

    private idv(Context context, Looper looper, hua hua) {
        this.f7315d = context;
        this.f7319h = new Handler(looper, this);
        this.f7323m = hua;
        Handler handler = this.f7319h;
        handler.sendMessage(handler.obtainMessage(6));
    }

    /* renamed from: b */
    public final void mo8385b() {
        Handler handler = this.f7319h;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:79:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e4  */
    public final boolean handleMessage(android.os.Message r10) {
        /*
        r9 = this;
        r2 = 300000; // 0x493e0 float:4.2039E-40 double:1.482197E-318;
        r8 = 12;
        r5 = 8;
        r1 = 0;
        r4 = 1;
        r0 = r10.what;
        switch(r0) {
            case 1: goto L_0x02c6;
            case 2: goto L_0x0252;
            case 3: goto L_0x02a9;
            case 4: goto L_0x002a;
            case 5: goto L_0x01c2;
            case 6: goto L_0x0155;
            case 7: goto L_0x014c;
            case 8: goto L_0x002a;
            case 9: goto L_0x0128;
            case 10: goto L_0x0103;
            case 11: goto L_0x00bc;
            case 12: goto L_0x006f;
            case 13: goto L_0x002a;
            default: goto L_0x000e;
        };
    L_0x000e:
        r0 = r10.what;
        r2 = new java.lang.StringBuilder;
        r3 = 31;
        r2.<init>(r3);
        r3 = "Unknown message id: ";
        r2.append(r3);
        r2.append(r0);
        r0 = "GoogleApiManager";
        r2 = r2.toString();
        android.util.Log.w(r0, r2);
        r0 = r1;
    L_0x0029:
        return r0;
    L_0x002a:
        r0 = r10.obj;
        r0 = (p000.hzp) r0;
        r1 = r9.f7318g;
        r2 = r0.f7214c;
        r2 = r2.f7067b;
        r1 = r1.get(r2);
        r1 = (p000.ief) r1;
        if (r1 != 0) goto L_0x004d;
    L_0x003c:
        r1 = r0.f7214c;
        r9.m3743a(r1);
        r1 = r9.f7318g;
        r2 = r0.f7214c;
        r2 = r2.f7067b;
        r1 = r1.get(r2);
        r1 = (p000.ief) r1;
    L_0x004d:
        r2 = r1.mo14995d();
        if (r2 == 0) goto L_0x0069;
    L_0x0053:
        r2 = r9.f7317f;
        r2 = r2.get();
        r3 = r0.f7213b;
        if (r2 == r3) goto L_0x0069;
    L_0x005d:
        r0 = r0.f7212a;
        r2 = f7311a;
        r0.mo8348a(r2);
        r1.mo14994c();
    L_0x0067:
        r0 = r4;
        goto L_0x0029;
    L_0x0069:
        r0 = r0.f7212a;
        r1.mo14992a(r0);
        goto L_0x0067;
    L_0x006f:
        r0 = r9.f7318g;
        r2 = r10.obj;
        r0 = r0.containsKey(r2);
        if (r0 == 0) goto L_0x0067;
    L_0x0079:
        r0 = r9.f7318g;
        r2 = r10.obj;
        r0 = r0.get(r2);
        r0 = (p000.ief) r0;
        r2 = r0.f24621h;
        r2 = r2.f7319h;
        p000.htl.m3462a(r2);
        r2 = r0.f24614a;
        r2 = r2.mo13577d();
        if (r2 == 0) goto L_0x0067;
    L_0x0092:
        r2 = r0.f24617d;
        r2 = r2.size();
        if (r2 != 0) goto L_0x0067;
    L_0x009a:
        r2 = r0.f24615b;
        r3 = r2.f7303a;
        r3 = r3.isEmpty();
        if (r3 == 0) goto L_0x00ba;
    L_0x00a4:
        r2 = r2.f7304b;
        r2 = r2.isEmpty();
        if (r2 == 0) goto L_0x00b8;
    L_0x00ac:
        if (r1 != 0) goto L_0x00b4;
    L_0x00ae:
        r0 = r0.f24614a;
        r0.mo13576c();
        goto L_0x0067;
    L_0x00b4:
        r0.mo15001j();
        goto L_0x0067;
    L_0x00b8:
        r1 = r4;
        goto L_0x00ac;
    L_0x00ba:
        r1 = r4;
        goto L_0x00ac;
    L_0x00bc:
        r0 = r9.f7318g;
        r1 = r10.obj;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x0067;
    L_0x00c6:
        r0 = r9.f7318g;
        r1 = r10.obj;
        r0 = r0.get(r1);
        r0 = (p000.ief) r0;
        r1 = r0.f24621h;
        r1 = r1.f7319h;
        p000.htl.m3462a(r1);
        r1 = r0.f24620g;
        if (r1 == 0) goto L_0x0067;
    L_0x00db:
        r0.mo15000i();
        r1 = r0.f24621h;
        r1 = r1.f7315d;
        r1 = p000.huc.m3510a(r1);
        r2 = 18;
        if (r1 == r2) goto L_0x00fb;
    L_0x00ea:
        r1 = new com.google.android.gms.common.api.Status;
        r2 = "API failed to connect while resuming due to an unknown error.";
        r1.<init>(r5, r2);
    L_0x00f1:
        r0.mo14991a(r1);
        r0 = r0.f24614a;
        r0.mo13576c();
        goto L_0x0067;
    L_0x00fb:
        r1 = new com.google.android.gms.common.api.Status;
        r2 = "Connection timed out while waiting for Google Play services update to complete.";
        r1.<init>(r5, r2);
        goto L_0x00f1;
    L_0x0103:
        r0 = r9.f7326p;
        r1 = r0.iterator();
    L_0x0109:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0121;
    L_0x010f:
        r0 = r1.next();
        r0 = (p000.icd) r0;
        r2 = r9.f7318g;
        r0 = r2.remove(r0);
        r0 = (p000.ief) r0;
        r0.mo14994c();
        goto L_0x0109;
    L_0x0121:
        r0 = r9.f7326p;
        r0.clear();
        goto L_0x0067;
    L_0x0128:
        r0 = r9.f7318g;
        r1 = r10.obj;
        r0 = r0.containsKey(r1);
        if (r0 == 0) goto L_0x0067;
    L_0x0132:
        r0 = r9.f7318g;
        r1 = r10.obj;
        r0 = r0.get(r1);
        r0 = (p000.ief) r0;
        r1 = r0.f24621h;
        r1 = r1.f7319h;
        p000.htl.m3462a(r1);
        r1 = r0.f24620g;
        if (r1 == 0) goto L_0x0067;
    L_0x0147:
        r0.mo14990a();
        goto L_0x0067;
    L_0x014c:
        r0 = r10.obj;
        r0 = (p000.hva) r0;
        r9.m3743a(r0);
        goto L_0x0067;
    L_0x0155:
        r0 = r9.f7315d;
        r0 = r0.getApplicationContext();
        r0 = r0 instanceof android.app.Application;
        if (r0 == 0) goto L_0x0067;
    L_0x015f:
        r0 = r9.f7315d;
        r0 = r0.getApplicationContext();
        r0 = (android.app.Application) r0;
        r1 = p000.icf.f7296a;
        monitor-enter(r1);
        r5 = p000.icf.f7296a;	 Catch:{ all -> 0x02fd }
        r5 = r5.f7300e;	 Catch:{ all -> 0x02fd }
        if (r5 != 0) goto L_0x017f;
    L_0x0170:
        r5 = p000.icf.f7296a;	 Catch:{ all -> 0x02fd }
        r0.registerActivityLifecycleCallbacks(r5);	 Catch:{ all -> 0x02fd }
        r5 = p000.icf.f7296a;	 Catch:{ all -> 0x02fd }
        r0.registerComponentCallbacks(r5);	 Catch:{ all -> 0x02fd }
        r0 = p000.icf.f7296a;	 Catch:{ all -> 0x02fd }
        r5 = 1;
        r0.f7300e = r5;	 Catch:{ all -> 0x02fd }
    L_0x017f:
        monitor-exit(r1);	 Catch:{ all -> 0x02fd }
        r0 = p000.icf.f7296a;
        r1 = new icg;
        r1.<init>(r9);
        r5 = p000.icf.f7296a;
        monitor-enter(r5);
        r0 = r0.f7299d;	 Catch:{ all -> 0x0300 }
        r0.add(r1);	 Catch:{ all -> 0x0300 }
        monitor-exit(r5);	 Catch:{ all -> 0x0300 }
        r0 = p000.icf.f7296a;
        r1 = r0.f7298c;
        r1 = r1.get();
        if (r1 != 0) goto L_0x01b0;
    L_0x019a:
        r1 = new android.app.ActivityManager$RunningAppProcessInfo;
        r1.<init>();
        android.app.ActivityManager.getMyMemoryState(r1);
        r5 = r0.f7298c;
        r5 = r5.getAndSet(r4);
        if (r5 != 0) goto L_0x01b0;
    L_0x01aa:
        r1 = r1.importance;
        r5 = 100;
        if (r1 > r5) goto L_0x01bc;
    L_0x01b0:
        r0 = r0.f7297b;
        r0 = r0.get();
        if (r0 != 0) goto L_0x0067;
    L_0x01b8:
        r9.f7322k = r2;
        goto L_0x0067;
    L_0x01bc:
        r1 = r0.f7297b;
        r1.set(r4);
        goto L_0x01b0;
    L_0x01c2:
        r2 = r10.arg1;
        r0 = r10.obj;
        r0 = (com.google.android.gms.common.ConnectionResult) r0;
        r1 = r9.f7318g;
        r1 = r1.values();
        r3 = r1.iterator();
    L_0x01d2:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x0250;
    L_0x01d8:
        r1 = r3.next();
        r1 = (p000.ief) r1;
        r5 = r1.f24618e;
        if (r5 != r2) goto L_0x01d2;
    L_0x01e2:
        if (r1 == 0) goto L_0x022c;
    L_0x01e4:
        r2 = new com.google.android.gms.common.api.Status;
        r3 = r0.f23349b;
        r3 = p000.huc.m3513a(r3);
        r3 = java.lang.String.valueOf(r3);
        r0 = r0.f23351d;
        r0 = java.lang.String.valueOf(r0);
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r6 = java.lang.String.valueOf(r0);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r5 = r5 + 69;
        r5 = r5 + r6;
        r7.<init>(r5);
        r5 = "Error resolution was canceled by the user, original error message: ";
        r7.append(r5);
        r7.append(r3);
        r3 = ": ";
        r7.append(r3);
        r7.append(r0);
        r0 = 17;
        r3 = r7.toString();
        r2.<init>(r0, r3);
        r1.mo14991a(r2);
        goto L_0x0067;
    L_0x022c:
        r0 = new java.lang.StringBuilder;
        r1 = 76;
        r0.<init>(r1);
        r1 = "Could not find API instance ";
        r0.append(r1);
        r0.append(r2);
        r1 = " while trying to fail enqueued calls.";
        r0.append(r1);
        r0 = r0.toString();
        r1 = new java.lang.Exception;
        r1.<init>();
        r2 = "GoogleApiManager";
        android.util.Log.wtf(r2, r0, r1);
        goto L_0x0067;
    L_0x0250:
        r1 = 0;
        goto L_0x01e2;
    L_0x0252:
        r0 = r10.obj;
        r0 = (p000.ice) r0;
        r1 = r0.f7292a;
        r1 = r1.keySet();
        r3 = r1.iterator();
    L_0x0260:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x0067;
    L_0x0266:
        r1 = r3.next();
        r1 = (p000.icd) r1;
        r2 = r9.f7318g;
        r2 = r2.get(r1);
        r2 = (p000.ief) r2;
        if (r2 != 0) goto L_0x0282;
    L_0x0276:
        r2 = new com.google.android.gms.common.ConnectionResult;
        r3 = 13;
        r2.<init>(r3);
        r0.mo8353a(r1, r2);
        goto L_0x0067;
    L_0x0282:
        r5 = r2.mo14993b();
        if (r5 == 0) goto L_0x028e;
    L_0x0288:
        r2 = com.google.android.gms.common.ConnectionResult.f23348a;
        r0.mo8353a(r1, r2);
        goto L_0x0260;
    L_0x028e:
        r5 = r2.mo14999h();
        if (r5 != 0) goto L_0x02a1;
    L_0x0294:
        r1 = r2.f24621h;
        r1 = r1.f7319h;
        p000.htl.m3462a(r1);
        r1 = r2.f24616c;
        r1.add(r0);
        goto L_0x0260;
    L_0x02a1:
        r2 = r2.mo14999h();
        r0.mo8353a(r1, r2);
        goto L_0x0260;
    L_0x02a9:
        r0 = r9.f7318g;
        r0 = r0.values();
        r1 = r0.iterator();
    L_0x02b3:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0067;
    L_0x02b9:
        r0 = r1.next();
        r0 = (p000.ief) r0;
        r0.mo14998g();
        r0.mo14990a();
        goto L_0x02b3;
    L_0x02c6:
        r0 = r10.obj;
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 != 0) goto L_0x02fa;
    L_0x02d0:
        r0 = r2;
    L_0x02d1:
        r9.f7322k = r0;
        r0 = r9.f7319h;
        r0.removeMessages(r8);
        r0 = r9.f7318g;
        r0 = r0.keySet();
        r1 = r0.iterator();
    L_0x02e2:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0067;
    L_0x02e8:
        r0 = r1.next();
        r0 = (p000.icd) r0;
        r2 = r9.f7319h;
        r0 = r2.obtainMessage(r8, r0);
        r6 = r9.f7322k;
        r2.sendMessageDelayed(r0, r6);
        goto L_0x02e2;
    L_0x02fa:
        r0 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        goto L_0x02d1;
    L_0x02fd:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x02fd }
        throw r0;
    L_0x0300:
        r0 = move-exception;
        monitor-exit(r5);	 Catch:{ all -> 0x0300 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: idv.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: a */
    public static idv m3742a(Context context) {
        idv idv;
        synchronized (f7313c) {
            if (f7314l == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f7314l = new idv(context.getApplicationContext(), handlerThread.getLooper(), hua.f20814a);
            }
            idv = f7314l;
        }
        return idv;
    }

    /* renamed from: a */
    public final boolean mo8384a(ConnectionResult connectionResult, int i) {
        hua hua = this.f7323m;
        Context context = this.f7315d;
        Parcelable a = !connectionResult.mo14630a() ? huc.m3511a(context, connectionResult.f23349b, 0, null) : connectionResult.f23350c;
        if (a == null) {
            return false;
        }
        int i2 = connectionResult.f23349b;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", a);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        hua.mo13570a(context, i2, PendingIntent.getActivity(context, 0, intent, 134217728));
        return true;
    }

    /* renamed from: a */
    private final void m3743a(hva hva) {
        icd icd = hva.f7067b;
        ief ief = (ief) this.f7318g.get(icd);
        if (ief == null) {
            ief = new ief(this, hva);
            this.f7318g.put(icd, ief);
        }
        if (ief.mo14995d()) {
            this.f7326p.add(icd);
        }
        ief.mo14990a();
    }
}
