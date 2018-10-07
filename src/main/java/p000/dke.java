package p000;

import android.app.NotificationManager;
import android.app.NotificationManager.Policy;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest.Builder;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.os.Handler;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dke */
public final class dke implements dkd {
    /* renamed from: a */
    public static final String f14138a = bli.m887a("CdrVideoSound");
    /* renamed from: b */
    private final AudioManager f14139b;
    /* renamed from: c */
    private final gpn f14140c;
    /* renamed from: d */
    private final OnAudioFocusChangeListener f14141d = new dkf();
    /* renamed from: e */
    private final NotificationManager f14142e;
    /* renamed from: f */
    private boolean f14143f;
    /* renamed from: g */
    private Policy f14144g;
    /* renamed from: h */
    private Policy f14145h;

    public dke(AudioManager audioManager, gpn gpn, NotificationManager notificationManager) {
        this.f14139b = audioManager;
        this.f14140c = gpn;
        this.f14142e = notificationManager;
    }

    /* renamed from: a */
    public final void mo6005a() {
        if (!this.f14143f) {
            this.f14139b.requestAudioFocus(new Builder(2).setOnAudioFocusChangeListener(this.f14141d, new Handler()).setAudioAttributes(new AudioAttributes.Builder().setContentType(2).setLegacyStreamType(1).build()).build());
            if (this.f14142e.getCurrentInterruptionFilter() == 1) {
                try {
                    this.f14144g = this.f14142e.getNotificationPolicy();
                    this.f14142e.setNotificationPolicy(new Policy(128, 0, 0));
                    this.f14145h = this.f14142e.getNotificationPolicy();
                    this.f14142e.setInterruptionFilter(2);
                    this.f14143f = true;
                    return;
                } catch (SecurityException e) {
                    String str = f14138a;
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 7);
                    stringBuilder.append("Error: ");
                    stringBuilder.append(valueOf);
                    bli.m891b(str, stringBuilder.toString());
                    return;
                }
            }
            this.f14143f = false;
        }
    }

    /* renamed from: b */
    public final void mo6006b() {
        this.f14140c.mo7328a(R.raw.video_start);
    }

    /* renamed from: c */
    public final void mo6007c() {
        this.f14140c.mo7328a(R.raw.video_stop);
    }

    /* renamed from: d */
    public final void mo6008d() {
        if (this.f14143f && this.f14142e.getNotificationPolicy().equals(this.f14145h) && this.f14142e.getCurrentInterruptionFilter() == 2) {
            try {
                this.f14142e.setInterruptionFilter(1);
                this.f14142e.setNotificationPolicy(this.f14144g);
                this.f14143f = false;
            } catch (SecurityException e) {
                String str = f14138a;
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 7);
                stringBuilder.append("Error: ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
            }
            this.f14139b.abandonAudioFocus(this.f14141d);
        }
    }
}
