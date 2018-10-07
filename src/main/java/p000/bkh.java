package p000;

import android.media.AudioDeviceCallback;
import android.media.AudioManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* compiled from: PG */
/* renamed from: bkh */
public final class bkh implements bkg {
    /* renamed from: a */
    private final bkm f22808a;
    /* renamed from: b */
    private final AudioManager f22809b;
    /* renamed from: c */
    private final ilp f22810c;
    /* renamed from: d */
    private final AudioDeviceCallback f22811d;
    /* renamed from: e */
    private final HandlerThread f22812e;
    /* renamed from: f */
    private final Handler f22813f;
    /* renamed from: g */
    private boolean f22814g;
    /* renamed from: h */
    private boolean f22815h = false;
    /* renamed from: i */
    private final Object f22816i = new Object();

    public bkh(bkm bkm, AudioManager audioManager, ilp ilp) {
        this.f22808a = bkm;
        this.f22809b = audioManager;
        this.f22810c = ilp;
        this.f22811d = new bki(this);
        this.f22812e = new HandlerThread("AudioDeviceChangeListener");
        this.f22812e.start();
        this.f22813f = new Handler(this.f22812e.getLooper());
        this.f22814g = false;
    }

    public final void close() {
        synchronized (this.f22816i) {
            if (this.f22814g) {
                Log.w("AudioDeviceChangeListener", "Already closed");
                return;
            }
            mo12390b();
            this.f22814g = true;
            try {
                this.f22812e.quit();
                this.f22812e.join();
            } catch (InterruptedException e) {
                Log.e("AudioDeviceChangeListener", "Could not complete shutting down AudioDeviceChangeListener.");
            }
            Log.d("AudioDeviceChangeListener", "Audio devices listener thread stopped.");
            return;
        }
    }

    /* renamed from: a */
    public final void mo12389a() {
        synchronized (this.f22816i) {
            if (this.f22814g) {
                return;
            }
            if (this.f22815h) {
                mo12390b();
            }
            Log.d("AudioDeviceChangeListener", "Start");
            mo14570c();
            this.f22809b.registerAudioDeviceCallback(this.f22811d, this.f22813f);
            this.f22815h = true;
        }
    }

    /* renamed from: b */
    public final void mo12390b() {
        synchronized (this.f22816i) {
            if (this.f22814g) {
                return;
            }
            Log.d("AudioDeviceChangeListener", "Stop");
            this.f22809b.unregisterAudioDeviceCallback(this.f22811d);
            this.f22810c.mo8826a(Boolean.valueOf(false));
            this.f22815h = false;
        }
    }

    /* renamed from: c */
    final void mo14570c() {
        boolean z;
        jri.m13404b(this.f22810c);
        jri.m13404b(this.f22808a);
        ilp ilp = this.f22810c;
        if (this.f22808a.mo1994a() != null) {
            z = true;
        } else {
            z = false;
        }
        ilp.mo8826a(Boolean.valueOf(z));
        String valueOf = String.valueOf(this.f22810c.mo13673b());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
        stringBuilder.append("External audio devices updated to: ");
        stringBuilder.append(valueOf);
        Log.d("AudioDeviceChangeListener", stringBuilder.toString());
    }
}
