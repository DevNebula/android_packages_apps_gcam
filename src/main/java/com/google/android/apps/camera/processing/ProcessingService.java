package com.google.android.apps.camera.processing;

import android.annotation.TargetApi;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import com.google.android.GoogleCamera.R;
import java.util.ArrayList;
import p000.C0245gh;
import p000.C0247gj;
import p000.C0252go;
import p000.bbv;
import p000.bli;
import p000.blr;
import p000.bls;
import p000.ccs;
import p000.geo;
import p000.geq;
import p000.ger;
import p000.ges;
import p000.geu;
import p000.gev;
import p000.gew;
import p000.hec;
import p000.ijj;
import p000.ikd;
import p000.iqz;
import p000.ird;
import p000.ivx;

@TargetApi(16)
/* compiled from: PG */
public class ProcessingService extends Service implements gew {
    /* renamed from: a */
    public static final String f12817a = bli.m887a("ProcessingService");
    /* renamed from: b */
    public Builder f12818b;
    /* renamed from: c */
    public final Object f12819c = new Object();
    /* renamed from: d */
    public geu f12820d;
    /* renamed from: e */
    public volatile boolean f12821e = false;
    /* renamed from: f */
    public final Object f12822f = new Object();
    /* renamed from: g */
    public boolean f12823g;
    /* renamed from: h */
    public boolean f12824h;
    /* renamed from: i */
    public boolean f12825i;
    /* renamed from: j */
    public NotificationManager f12826j;
    /* renamed from: k */
    public gev f12827k;
    /* renamed from: l */
    public PowerManager f12828l;
    /* renamed from: m */
    public C0245gh f12829m;
    /* renamed from: n */
    public ird f12830n;
    /* renamed from: o */
    public ikd f12831o;
    /* renamed from: p */
    public ivx f12832p;
    /* renamed from: q */
    public bls f12833q;
    /* renamed from: r */
    private final ges f12834r = new ges(this);
    /* renamed from: s */
    private WakeLock f12835s;
    /* renamed from: t */
    private Thread f12836t;
    /* renamed from: u */
    private bbv f12837u;
    /* renamed from: v */
    private boolean f12838v;

    /* renamed from: b */
    private final void m8519b() {
        if (!this.f12838v) {
            this.f12838v = true;
            ((ger) ((ccs) getApplication()).mo2253a(ger.class)).mo13335a(this);
            if (this.f12832p.f7868c) {
                this.f12826j.deleteNotificationChannel("camera");
                for (NotificationChannel id : this.f12826j.getNotificationChannels()) {
                    if ("processing".equals(id.getId())) {
                        return;
                    }
                }
                NotificationChannel id2 = new NotificationChannel("processing", getText(R.string.processing_notification_channel), 2);
                id2.setShowBadge(false);
                this.f12826j.createNotificationChannel(id2);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        Builder builder;
        bli.m894c(f12817a, "ProcessingService#onCreate");
        m8519b();
        super.onCreate();
        synchronized (this.f12822f) {
            this.f12823g = true;
            this.f12824h = false;
            this.f12825i = false;
        }
        this.f12830n.mo8856a("ProcessingService#onCreate");
        this.f12837u = new bbv("ProcServ", 1000);
        this.f12830n.mo8856a("WakeLock#new");
        this.f12835s = this.f12828l.newWakeLock(1, f12817a);
        this.f12835s.acquire();
        this.f12830n.mo8857b();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.PAUSE");
        intentFilter.addAction("com.google.android.apps.camera.legacy.app.processing.RESUME");
        C0245gh c0245gh = this.f12829m;
        BroadcastReceiver broadcastReceiver = this.f12834r;
        synchronized (c0245gh.f5425b) {
            C0247gj c0247gj = new C0247gj(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList) c0245gh.f5425b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                c0245gh.f5425b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(c0247gj);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                arrayList = (ArrayList) c0245gh.f5426c.get(action);
                if (arrayList == null) {
                    arrayList = new ArrayList(1);
                    c0245gh.f5426c.put(action, arrayList);
                }
                arrayList.add(c0247gj);
            }
        }
        if (this.f12832p.f7868c) {
            builder = new Builder(this, "processing");
        } else {
            builder = new Builder(this);
        }
        this.f12818b = builder.setSmallIcon(R.drawable.ic_notification).setColor(getResources().getColor(R.color.processing_notification)).setWhen(System.currentTimeMillis()).setOngoing(true).setContentTitle(getText(R.string.app_name));
        this.f12830n.mo8857b();
        if (this.f12833q.mo2015b()) {
            stopSelf();
            throw new blr();
        }
    }

    public void onDestroy() {
        bli.m894c(f12817a, "ProcessingService#onDestroy");
        this.f12837u.close();
        if (this.f12835s.isHeld()) {
            this.f12835s.release();
        }
        C0245gh c0245gh = this.f12829m;
        BroadcastReceiver broadcastReceiver = this.f12834r;
        synchronized (c0245gh.f5425b) {
            ArrayList arrayList = (ArrayList) c0245gh.f5425b.remove(broadcastReceiver);
            if (arrayList == null) {
            } else {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    C0247gj c0247gj = (C0247gj) arrayList.get(size);
                    c0247gj.f5501c = true;
                    for (int i = 0; i < c0247gj.f5499a.countActions(); i++) {
                        String action = c0247gj.f5499a.getAction(i);
                        ArrayList arrayList2 = (ArrayList) c0245gh.f5426c.get(action);
                        if (arrayList2 != null) {
                            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                C0247gj c0247gj2 = (C0247gj) arrayList2.get(size2);
                                if (c0247gj2.f5500b == broadcastReceiver) {
                                    c0247gj2.f5501c = true;
                                    arrayList2.remove(size2);
                                }
                            }
                            if (arrayList2.size() <= 0) {
                                c0245gh.f5426c.remove(action);
                            }
                        }
                    }
                }
            }
        }
        stopForeground(true);
        gev gev = this.f12827k;
        synchronized (gev.f5356b) {
            Object obj;
            gev.f5358d = C0252go.f5813aL;
            iqz iqz = gev.f5355a;
            String str = "Service destroyed, restarting? ";
            if (gev.f5359e) {
                obj = "Yes";
            } else {
                obj = "No";
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            iqz.mo8836d(valueOf);
            if (gev.f5359e) {
                gev.f5359e = false;
                gev.mo7084a();
            } else if (!gev.f5357c.isEmpty()) {
                throw new IllegalStateException("Service destroyed, not restarting but queue has items.");
            }
        }
    }

    /* renamed from: a */
    public final void mo7089a(int i) {
        this.f12818b.setProgress(100, i, false);
        mo12582a();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        bli.m894c(f12817a, "ProcessingService#onStartCommand");
        m8519b();
        startForeground(2, this.f12818b.build());
        if (this.f12836t == null) {
            this.f12836t = new ijj(9, new geo(this), "CameraProcessingThread");
            this.f12836t.start();
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo7090a(hec hec) {
        this.f12818b.setContentText(hec.mo7762a(getResources()));
        mo12582a();
    }

    /* renamed from: a */
    public final void mo12582a() {
        synchronized (this.f12822f) {
            if (!this.f12823g || this.f12825i) {
                this.f12824h = true;
            } else {
                bli.m888a(f12817a, "Posting notification");
                this.f12826j.notify(2, this.f12818b.build());
                this.f12823g = false;
                this.f12824h = false;
                this.f12837u.execute(new geq(this));
            }
        }
    }
}
