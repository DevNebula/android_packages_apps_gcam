package p000;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* renamed from: ekw */
public final class ekw implements geu {
    /* renamed from: c */
    private static final String f17509c = bli.m887a("LightCycleStTask");
    /* renamed from: a */
    public final eln f17510a;
    /* renamed from: b */
    public final AtomicBoolean f17511b = new AtomicBoolean();
    /* renamed from: d */
    private final String f17512d;
    /* renamed from: e */
    private final File f17513e;
    /* renamed from: f */
    private final String f17514f;
    /* renamed from: g */
    private final int f17515g;
    /* renamed from: h */
    private final Semaphore f17516h = new Semaphore(0);
    /* renamed from: i */
    private volatile boolean f17517i = false;
    /* renamed from: j */
    private final List f17518j;
    /* renamed from: k */
    private final irs f17519k;
    /* renamed from: l */
    private final bvm f17520l;
    /* renamed from: m */
    private final bus f17521m;

    public ekw(eln eln, irs irs, bvm bvm, bus bus) {
        this.f17510a = eln;
        this.f17519k = irs;
        this.f17512d = eln.f4166c;
        this.f17513e = eln.f4165b.mo13384m().mo7273a();
        this.f17514f = eln.f4165b.mo13385n();
        this.f17515g = eln.f4170g;
        this.f17520l = bvm;
        this.f17521m = bus;
        this.f17518j = new ArrayList();
    }

    public final void addFinishedCallback(iqb iqb) {
        jri.m13404b((Object) iqb);
        this.f17518j.add(iqb);
    }

    public final get getSession() {
        return this.f17510a.f4165b;
    }

    public final void process(Context context) {
        int i = 11;
        boolean z = true;
        int i2 = 0;
        this.f17511b.set(false);
        int c;
        Object obj;
        try {
            boolean z2;
            boolean z3;
            boolean z4;
            String str;
            mo13158a();
            c = LightCycle.m1330c();
            File file = this.f17513e;
            long length = file.length();
            this.f17510a.f4165b.mo13374b(0);
            LightCycle.f2564c.put(Integer.valueOf(c), new ekq(this, length, file));
            long uptimeMillis = SystemClock.uptimeMillis();
            String str2 = f17509c;
            String valueOf = String.valueOf(this.f17512d);
            String str3 = "Rendering panorama from source images at ";
            if (valueOf.length() == 0) {
                valueOf = new String(str3);
            } else {
                valueOf = str3.concat(valueOf);
            }
            bli.m888a(str2, valueOf);
            LightCycle.m1328b(c);
            Map a = emd.m1919a(this.f17510a.f4168e);
            float a2 = emd.m1915a(a);
            if (this.f17515g != C0252go.f5835ah) {
                z2 = false;
            } else if (a2 == 360.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.f17515g == C0252go.f5834ag && a2 >= 70.0f) {
                z3 = true;
            } else if (z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            uptimeMillis = SystemClock.uptimeMillis() - uptimeMillis;
            valueOf = f17509c;
            StringBuilder stringBuilder = new StringBuilder(49);
            stringBuilder.append("stitch time (milliseconds) = ");
            stringBuilder.append(uptimeMillis);
            bli.m896d(valueOf, stringBuilder.toString());
            if (this.f17515g == C0252go.f5835ah) {
                c = 1;
            } else if (this.f17515g == C0252go.f5836ai) {
                c = 2;
            } else if (this.f17515g == C0252go.f5838ak) {
                c = 4;
            } else if (this.f17515g == C0252go.f5837aj) {
                c = 3;
            } else {
                i = 5;
                c = 0;
            }
            this.f17519k.mo8883a(i, c, String.valueOf(this.f17514f).concat(".jpg"), ((float) uptimeMillis) * 0.001f, a2);
            if (this.f17515g == C0252go.f5834ag) {
                z4 = true;
            } else if (z2) {
                z4 = true;
            } else {
                z4 = false;
            }
            Uri o = this.f17510a.f4165b.mo13386o();
            kbg a3 = this.f17521m.mo2159a(o);
            kbg kbg = kau.f21835a;
            StringBuilder stringBuilder2;
            if (a3.mo9709b()) {
                long b = ((buo) a3.mo9706a()).mo12430b().mo6497b();
                kbg a4 = this.f17520l.mo2174a(b);
                if (a4.mo9709b()) {
                    kbg = kbg.m4804c(((bve) a4.mo9706a()).mo2167d());
                } else {
                    str = f17509c;
                    stringBuilder2 = new StringBuilder(63);
                    stringBuilder2.append("special type not found for mediastore id = ");
                    stringBuilder2.append(b);
                    bli.m891b(str, stringBuilder2.toString());
                }
            } else {
                String str4 = f17509c;
                valueOf = String.valueOf(o);
                stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder2.append("no processing media found for Uri ");
                stringBuilder2.append(valueOf);
                bli.m891b(str4, stringBuilder2.toString());
            }
            valueOf = this.f17513e.getPath();
            str = this.f17512d;
            if (this.f17515g != C0252go.f5834ag) {
                z = false;
            }
            emd.m1920a(valueOf, a, str, z3, z4, kbg, z);
            synchronized (this.f17511b) {
                this.f17511b.set(true);
                this.f17510a.f4165b.mo13378f();
                this.f17510a.f4165b.mo13368a(new gfu(this.f17510a.f4165b));
                ken a5 = ken.m13713a(this.f17518j);
                int size = a5.size();
                while (i2 < size) {
                    obj = a5.get(i2);
                    i2++;
                    ((iqb) obj).mo8765a(this);
                }
            }
        } catch (Throwable th) {
            Throwable th2 = th;
            synchronized (this.f17511b) {
                this.f17511b.set(true);
                this.f17510a.f4165b.mo13378f();
                this.f17510a.f4165b.mo13368a(new gfu(this.f17510a.f4165b));
                ken a6 = ken.m13713a(this.f17518j);
                int size2 = a6.size();
                c = 0;
                while (c < size2) {
                    obj = a6.get(c);
                    c++;
                    ((iqb) obj).mo8765a(this);
                }
            }
        }
    }

    public final void removeFinishedCallback(iqb iqb) {
        jri.m13404b((Object) iqb);
        this.f17518j.remove(iqb);
    }

    public final synchronized void resume() {
        this.f17517i = false;
        this.f17516h.release();
    }

    public final synchronized void suspend() {
        this.f17516h.drainPermits();
        this.f17517i = true;
    }

    /* renamed from: a */
    public final void mo13158a() {
        if (this.f17517i) {
            try {
                this.f17516h.acquire();
            } catch (InterruptedException e) {
                bli.m898e(f17509c, e.getMessage());
            }
        }
    }
}
