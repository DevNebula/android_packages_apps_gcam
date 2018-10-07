package p000;

import android.media.AudioDeviceInfo;
import android.media.AudioRouting;
import android.media.AudioRouting.OnRoutingChangedListener;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;

/* compiled from: PG */
/* renamed from: iov */
public final class iov implements iqo {
    /* renamed from: a */
    public final OnRoutingChangedListener f21175a = new bko(this);
    /* renamed from: b */
    public final Handler f21176b;
    /* renamed from: c */
    public AudioRouting f21177c;
    /* renamed from: d */
    public boolean f21178d;
    /* renamed from: e */
    public final Object f21179e = new Object();
    /* renamed from: f */
    private final bkm f21180f;
    /* renamed from: g */
    private final ilp f21181g;
    /* renamed from: h */
    private final HandlerThread f21182h;

    public iov(bkm bkm, ilp ilp) {
        this.f21180f = bkm;
        this.f21181g = ilp;
        this.f21182h = new HandlerThread("AudioDeviceSelector");
        this.f21182h.start();
        this.f21176b = new Handler(this.f21182h.getLooper());
        this.f21178d = false;
    }

    /* renamed from: a */
    public final void mo13698a(AudioRouting audioRouting) {
        if (audioRouting != null && ((Boolean) this.f21181g.mo13673b()).booleanValue()) {
            AudioDeviceInfo a = this.f21180f.mo1994a();
            if (a != null) {
                String str;
                boolean preferredDevice = audioRouting.setPreferredDevice(a);
                String a2 = bkm.m871a(a);
                if (preferredDevice) {
                    str = " be used";
                } else {
                    str = " not be used";
                }
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(a2).length() + 39) + String.valueOf(str).length());
                stringBuilder.append("External audio device ");
                stringBuilder.append(a2);
                stringBuilder.append(" is found and can");
                stringBuilder.append(str);
                Log.d("AudioDeviceSelector", stringBuilder.toString());
            }
        }
    }

    public final void close() {
        synchronized (this.f21179e) {
            if (this.f21178d) {
                Log.w("AudioDeviceSelector", "Already closed");
                return;
            }
            mo13697a();
            this.f21178d = true;
            try {
                this.f21182h.quit();
                this.f21182h.join();
                Log.d("AudioDeviceSelector", "Audio devices routing changed thread stopped.");
            } catch (Throwable e) {
                throw new RuntimeException("Unable to stop audio routing changed thread AudioDeviceSelector", e);
            }
        }
    }

    /* renamed from: a */
    public final void mo13697a() {
        synchronized (this.f21179e) {
            if (this.f21178d) {
                return;
            }
            Log.d("AudioDeviceSelector", "Stop");
            AudioRouting audioRouting = this.f21177c;
            if (audioRouting != null) {
                audioRouting.removeOnRoutingChangedListener(this.f21175a);
            }
            this.f21177c = null;
        }
    }
}
