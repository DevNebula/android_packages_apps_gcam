package p000;

import android.content.Context;
import android.media.SoundPool;
import android.media.SoundPool.OnLoadCompleteListener;
import android.util.SparseArray;
import com.google.android.GoogleCamera.R;
import java.util.NoSuchElementException;
import java.util.Timer;

/* compiled from: PG */
/* renamed from: gpv */
public final class gpv implements gpu, iqo {
    /* renamed from: a */
    public static final String f19466a = bli.m887a("SoundPlayer");
    /* renamed from: b */
    public final Object f19467b;
    /* renamed from: c */
    public boolean f19468c;
    /* renamed from: d */
    private final Context f19469d;
    /* renamed from: e */
    private final SparseArray f19470e;
    /* renamed from: f */
    private SoundPool f19471f;
    /* renamed from: g */
    private final ilp f19472g;
    /* renamed from: h */
    private final kwk f19473h;
    /* renamed from: i */
    private final OnLoadCompleteListener f19474i = new gpw(this);

    public gpv(Context context, ilp ilp, kwk kwk) {
        this.f19469d = context;
        this.f19467b = new Object();
        this.f19470e = new SparseArray();
        this.f19472g = ilp;
        this.f19473h = kwk;
        this.f19468c = false;
    }

    /* JADX WARNING: Missing block: B:14:?, code:
            return;
     */
    public final void close() {
        /*
        r3 = this;
        r1 = r3.f19467b;
        monitor-enter(r1);
        r0 = r3.f19468c;	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
    L_0x0008:
        return;
    L_0x0009:
        r0 = 1;
        r3.f19468c = r0;	 Catch:{ all -> 0x0037 }
        r0 = r3.f19471f;	 Catch:{ all -> 0x0037 }
        if (r0 == 0) goto L_0x0035;
    L_0x0010:
        r0 = f19466a;	 Catch:{ all -> 0x0037 }
        r2 = "Closing SoundPool";
        p000.bli.m894c(r0, r2);	 Catch:{ all -> 0x0037 }
        r0 = r3.f19470e;	 Catch:{ all -> 0x0037 }
        r0.clear();	 Catch:{ all -> 0x0037 }
        r0 = r3.f19471f;	 Catch:{ all -> 0x0037 }
        r0 = p000.jqk.m13354c(r0);	 Catch:{ all -> 0x0037 }
        r0 = (android.media.SoundPool) r0;	 Catch:{ all -> 0x0037 }
        r0.autoPause();	 Catch:{ all -> 0x0037 }
        r0 = r3.f19471f;	 Catch:{ all -> 0x0037 }
        r0 = p000.jqk.m13354c(r0);	 Catch:{ all -> 0x0037 }
        r0 = (android.media.SoundPool) r0;	 Catch:{ all -> 0x0037 }
        r0.release();	 Catch:{ all -> 0x0037 }
        r0 = 0;
        r3.f19471f = r0;	 Catch:{ all -> 0x0037 }
    L_0x0035:
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        goto L_0x0008;
    L_0x0037:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0037 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: gpv.close():void");
    }

    /* renamed from: e */
    final gpz mo13395e(int i) {
        synchronized (this.f19467b) {
            int i2 = 0;
            while (true) {
                int i3 = i2;
                if (i3 < this.f19470e.size()) {
                    gpz gpz = (gpz) this.f19470e.valueAt(i3);
                    if (gpz.f5991b == i) {
                        return gpz;
                    }
                    i2 = i3 + 1;
                } else {
                    StringBuilder stringBuilder = new StringBuilder(45);
                    stringBuilder.append("SoundInfo for sampleId ");
                    stringBuilder.append(i);
                    stringBuilder.append(" not found.");
                    throw new NoSuchElementException(stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: c */
    private final SoundPool m11515c() {
        if (this.f19471f == null && !this.f19468c) {
            bli.m894c(f19466a, "Creating SoundPool");
            this.f19471f = (SoundPool) this.f19473h.mo10566a();
            ((SoundPool) jqk.m13354c(this.f19471f)).setOnLoadCompleteListener(this.f19474i);
        }
        return (SoundPool) jqk.m13354c(this.f19471f);
    }

    /* renamed from: a */
    public final kpk mo7334a(int i) {
        kpk a;
        synchronized (this.f19467b) {
            if (this.f19468c) {
                a = kow.m13873a(Boolean.valueOf(false));
            } else {
                gpz gpz = (gpz) this.f19470e.get(i);
                String str;
                if (gpz == null) {
                    String str2 = f19466a;
                    StringBuilder stringBuilder = new StringBuilder(26);
                    stringBuilder.append("Loading sound: ");
                    stringBuilder.append(i);
                    bli.m888a(str2, stringBuilder.toString());
                    gpz = new gpz();
                    gpz.f5990a = i;
                    this.f19470e.put(i, gpz);
                    gpz.f5991b = m11515c().load(this.f19469d, i, 1);
                    str = f19466a;
                    int i2 = gpz.f5991b;
                    StringBuilder stringBuilder2 = new StringBuilder(44);
                    stringBuilder2.append("Sound: ");
                    stringBuilder2.append(i);
                    stringBuilder2.append(" got sampleId: ");
                    stringBuilder2.append(i2);
                    bli.m896d(str, stringBuilder2.toString());
                } else {
                    str = f19466a;
                    StringBuilder stringBuilder3 = new StringBuilder(62);
                    stringBuilder3.append("Ignoring loadSound for previously loaded resource: ");
                    stringBuilder3.append(i);
                    bli.m896d(str, stringBuilder3.toString());
                }
                a = gpz.f5992c;
            }
        }
        return a;
    }

    /* renamed from: a */
    public final void mo7335a() {
        synchronized (this.f19467b) {
            if (!this.f19468c) {
                m11515c().autoPause();
            }
        }
    }

    /* renamed from: b */
    public final void mo7337b(int i) {
        kow.m13878a(mo7334a(i), new gpx(this, i), kpq.f8776a);
    }

    /* renamed from: a */
    public final int mo13394a(int i, float f, int i2) {
        if (((Boolean) this.f19472g.mo13673b()).booleanValue()) {
            int i3;
            synchronized (this.f19467b) {
                if (this.f19468c) {
                    i3 = -1;
                } else {
                    gpz gpz = (gpz) this.f19470e.get(i);
                    if (gpz != null) {
                        i3 = m11515c().play(gpz.f5991b, f, f, 0, i2, 1.0f);
                    } else {
                        String str = f19466a;
                        StringBuilder stringBuilder = new StringBuilder(50);
                        stringBuilder.append("Ignoring sound that is not yet loaded: ");
                        stringBuilder.append(i);
                        bli.m894c(str, stringBuilder.toString());
                        i3 = -1;
                    }
                }
            }
            return i3;
        }
        bli.m888a(f19466a, "Sounds disabled by settings.");
        return -1;
    }

    /* renamed from: c */
    public final kpk mo7338c(int i) {
        kpk d = kpw.m18486d();
        new Timer().schedule(new gpy(this, d, R.raw.camera_burst_loop), 300);
        return d;
    }

    /* renamed from: b */
    public final void mo7336b() {
        synchronized (this.f19467b) {
            if (!this.f19468c) {
                m11515c().autoResume();
            }
        }
    }

    /* renamed from: d */
    public final void mo7339d(int i) {
        synchronized (this.f19467b) {
            if (!(this.f19468c || i == -1)) {
                m11515c().stop(i);
            }
        }
    }

    /* renamed from: f */
    public final boolean mo13396f(int i) {
        synchronized (this.f19467b) {
            if (this.f19468c) {
                return false;
            }
            gpz gpz = (gpz) this.f19470e.get(i);
            if (gpz == null) {
                return false;
            }
            this.f19470e.remove(i);
            boolean unload = m11515c().unload(gpz.f5991b);
            return unload;
        }
    }
}
