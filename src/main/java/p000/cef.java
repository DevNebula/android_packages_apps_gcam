package p000;

import android.os.Bundle;
import com.google.android.apps.camera.legacy.app.app.CameraApp;

/* compiled from: PG */
/* renamed from: cef */
public class cef extends eoq {
    /* renamed from: d */
    private static final String f12247d = bli.m887a("GcaActivity");
    /* renamed from: a */
    public ird f12248a;
    /* renamed from: b */
    public ivw f12249b;
    /* renamed from: c */
    public enf f12250c;
    /* renamed from: e */
    private final Object f12251e = new Object();
    /* renamed from: f */
    private boolean f12252f = false;
    /* renamed from: g */
    private cbh f12253g;
    /* renamed from: h */
    private ceg f12254h;
    /* renamed from: i */
    private awt f12255i;

    /* renamed from: d */
    private final aws mo2276d() {
        m8168e();
        return this.f12255i;
    }

    /* renamed from: a */
    public final cbh mo12456a() {
        if (this.f12253g == null) {
            synchronized (this.f12251e) {
                if (this.f12253g == null) {
                    this.f12253g = new cbh(this);
                }
            }
        }
        return this.f12253g;
    }

    /* renamed from: b */
    public final ceg mo12457b() {
        m8168e();
        if (this.f12254h == null) {
            synchronized (this.f12251e) {
                if (this.f12254h == null) {
                    this.f4220t.mo6355a(this.f12250c);
                    this.f12254h = new ceg(this, this.f4220t, mo2276d());
                }
            }
        }
        return this.f12254h;
    }

    /* renamed from: e */
    private final void m8168e() {
        if (!this.f12252f) {
            synchronized (this.f12251e) {
                if (!this.f12252f) {
                    ((CameraApp) getApplicationContext()).mo2290a().mo14592a(this);
                    this.f12255i = awt.m7169a(this.f12249b);
                    this.f12252f = true;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m8166a(String str) {
        String toHexString = Integer.toHexString(hashCode());
        String str2 = f12247d;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(toHexString).length() + 3) + String.valueOf(str).length());
        stringBuilder.append("[");
        stringBuilder.append(toHexString);
        stringBuilder.append("] ");
        stringBuilder.append(str);
        bli.m894c(str2, stringBuilder.toString());
    }

    public void onCreate(Bundle bundle) {
        m8168e();
        m8166a("GcaActivity#onCreate");
        this.f12248a.mo8856a("GcaActivity#onCreate");
        awt awt = this.f12255i;
        synchronized (awt.f10960b) {
            bli.m888a(awt.f10959a, "onCreate()");
            if (awt.f10967i.f11172a.get()) {
                awt.f10964f = awt.f10961c.mo1880a();
                awt.f10967i = (bcl) awt.f10964f.mo8557a(new bcl());
                awt.f10963e = awt.f10961c.mo1882b(awt.f10964f);
                awt.f10966h = (bcl) awt.f10963e.mo8557a(new bcl());
                awt.f10962d = awt.f10961c.mo1881a(awt.f10963e);
                awt.f10965g = (bcl) awt.f10962d.mo8557a(new bcl());
            }
        }
        super.onCreate(bundle);
        this.f12248a.mo8857b();
    }

    public void onDestroy() {
        m8166a("GcaActivity#onDestroy");
        this.f12248a.mo8856a("GcaActivity#onDestroy");
        super.onDestroy();
        this.f12255i.mo6365f();
        this.f12248a.mo8857b();
    }

    public void onPause() {
        m8166a("GcaActivity#onPause");
        this.f12248a.mo8856a("GcaActivity#onPause");
        super.onPause();
        this.f12255i.mo6368g();
        this.f12248a.mo8857b();
    }

    public void onResume() {
        m8166a("GcaActivity#onResume");
        this.f12248a.mo8856a("GcaActivity#onResume");
        this.f12255i.mo6370h();
        super.onResume();
        this.f12248a.mo8857b();
    }

    public void onStart() {
        m8166a("GcaActivity#onStart");
        this.f12248a.mo8856a("GcaActivity#onStart");
        this.f12255i.mo6372i();
        super.onStart();
        this.f12248a.mo8857b();
    }

    protected void onStop() {
        m8166a("GcaActivity#onStop");
        this.f12248a.mo8856a("GcaActivity#onStop");
        super.onStop();
        this.f12255i.mo6373j();
        this.f12248a.mo8857b();
    }

    /* renamed from: c */
    public final ird mo12458c() {
        m8168e();
        return this.f12248a;
    }
}
