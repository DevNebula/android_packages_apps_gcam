package p000;

import android.content.Context;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.uiutils.ReplaceableView;
import java.util.Date;
import java.util.PriorityQueue;

/* compiled from: PG */
/* renamed from: far */
public final class far implements fbg {
    /* renamed from: a */
    public static final Object f18096a = new Object();
    /* renamed from: f */
    private static final String f18097f = bli.m887a("NtfcnChip");
    /* renamed from: b */
    public final ikd f18098b;
    /* renamed from: c */
    public TextView f18099c;
    /* renamed from: d */
    public fba f18100d;
    /* renamed from: e */
    public fbe f18101e;
    /* renamed from: g */
    private final PriorityQueue f18102g;
    /* renamed from: h */
    private fbe f18103h;
    /* renamed from: i */
    private fbe f18104i;
    /* renamed from: j */
    private fbe f18105j;
    /* renamed from: k */
    private final Runnable f18106k = new fax(this);

    public far(ikd ikd) {
        this.f18098b = ikd;
        this.f18102g = new PriorityQueue();
    }

    /* renamed from: g */
    private final void m10330g() {
        this.f18099c.removeCallbacks(this.f18106k);
    }

    /* renamed from: a */
    public final fbf mo6717a() {
        return new fbf();
    }

    /* renamed from: c */
    private final boolean m10329c(fbe fbe) {
        if (this.f18102g.contains(fbe)) {
            this.f18102g.remove(fbe);
        }
        return this.f18102g.offer(fbe);
    }

    /* renamed from: b */
    public final void mo6720b() {
        bli.m888a(f18097f, "hideAeAfLock");
        mo6719a(this.f18103h);
    }

    /* renamed from: h */
    private final void m10331h() {
        this.f18098b.execute(new faw(this));
    }

    /* JADX WARNING: Missing block: B:8:0x000c, code:
            r1 = f18096a;
     */
    /* JADX WARNING: Missing block: B:9:0x000e, code:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:12:?, code:
            r2.f18101e = null;
            m10330g();
     */
    /* JADX WARNING: Missing block: B:13:0x0015, code:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:15:0x001c, code:
            if (r2.f18102g.isEmpty() != false) goto L_0x0030;
     */
    /* JADX WARNING: Missing block: B:16:0x001e, code:
            mo6721b((p000.fbe) p000.jqk.m13354c((p000.fbe) r2.f18102g.peek()));
     */
    /* JADX WARNING: Missing block: B:17:0x0030, code:
            m10331h();
     */
    /* JADX WARNING: Missing block: B:34:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:35:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo6719a(p000.fbe r3) {
        /*
        r2 = this;
        if (r3 != 0) goto L_0x0034;
    L_0x0002:
        r1 = f18096a;
        monitor-enter(r1);
        r0 = r2.f18101e;	 Catch:{ all -> 0x003a }
        if (r0 == r3) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
    L_0x000a:
        return;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        r1 = f18096a;
        monitor-enter(r1);
        r0 = 0;
        r2.f18101e = r0;	 Catch:{ all -> 0x003d }
        r2.m10330g();	 Catch:{ all -> 0x003d }
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        r0 = r2.f18102g;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0030;
    L_0x001e:
        r0 = r2.f18102g;
        r0 = r0.peek();
        r0 = (p000.fbe) r0;
        r0 = p000.jqk.m13354c(r0);
        r0 = (p000.fbe) r0;
        r2.mo6721b(r0);
        goto L_0x000a;
    L_0x0030:
        r2.m10331h();
        goto L_0x000a;
    L_0x0034:
        r0 = r2.f18102g;
        r0.remove(r3);
        goto L_0x0002;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: far.a(fbe):void");
    }

    /* renamed from: c */
    public final void mo6722c() {
        bli.m888a(f18097f, "hideWarmLightOn");
        mo6719a(this.f18104i);
    }

    /* renamed from: a */
    public final void mo6718a(Context context, ReplaceableView replaceableView) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService("layout_inflater");
        jri.m13391a(replaceableView.getParent(), (Object) "can't replace a view with no parent");
        this.f18099c = (TextView) replaceableView.mo2753a(layoutInflater.inflate(R.layout.notification_chip_layout, (ViewGroup) replaceableView.getParent(), false));
        this.f18100d = new fba();
        Object obj = this.f18099c;
        fba fba = this.f18100d;
        hic a = hic.m3218a(100, new LinearInterpolator());
        a.mo7879a(obj, "alpha", 0.0f, 1.0f);
        a.f6584a = ScriptIntrinsicBLAS.RsBlas_zsyrk;
        a.mo7879a(obj, "scaleX", 0.5f, 1.0f);
        a.mo7879a(obj, "scaleY", 0.5f, 1.0f);
        fba.f4649a = a.f6585b.clone();
        a = hic.m3218a(500, new LinearInterpolator());
        a.mo7879a(obj, "alpha", 1.0f, 0.0f);
        fba.f4650b = a.f6585b.clone();
        fba.f4650b.addListener(new faz(this));
        fbf a2 = mo6717a();
        a2.f4670d = context.getResources().getString(R.string.af_ae_lock);
        a2.f4667a = true;
        this.f18103h = a2.mo6716a();
        a2 = mo6717a();
        a2.f4670d = context.getResources().getString(R.string.warm_light_on);
        a2.f4667a = false;
        this.f18104i = a2.mo6716a();
        a2 = mo6717a();
        a2.f4670d = context.getResources().getString(R.string.update_camera_to_use_lens);
        a2.f4667a = false;
        this.f18105j = a2.mo6716a();
    }

    /* renamed from: d */
    public final void mo6723d() {
        bli.m888a(f18097f, "showAeAfLock");
        mo6721b(this.f18103h);
    }

    /* renamed from: b */
    public final void mo6721b(fbe fbe) {
        fbe.f4664d = new Date();
        m10331h();
        synchronized (f18096a) {
            Object obj;
            fbe fbe2 = this.f18101e;
            if (fbe2 == null) {
                this.f18101e = fbe;
                obj = 1;
            } else if (fbe.f4662b > fbe2.f4662b) {
                m10329c(fbe);
                obj = null;
            } else if (fbe2.f4661a) {
                m10329c(fbe2);
                this.f18101e = fbe;
                obj = null;
            } else {
                mo6719a(fbe2);
                this.f18101e = fbe;
                obj = null;
            }
            fbe fbe3 = (fbe) jqk.m13354c(this.f18101e);
            this.f18099c.setOnClickListener(null);
            this.f18098b.execute(new fas(this, fbe3));
            if (obj != null) {
                this.f18098b.execute(new fat(this));
            } else {
                this.f18098b.execute(new fau(this));
            }
            this.f18098b.execute(new fav(this));
            m10330g();
            if (!((fbe) jqk.m13354c(this.f18101e)).f4661a) {
                this.f18099c.postDelayed(this.f18106k, (long) fbe3.f4663c);
            }
        }
    }

    /* renamed from: e */
    public final void mo6724e() {
        bli.m888a(f18097f, "showUpdateCameraChip");
        mo6721b(this.f18105j);
    }

    /* renamed from: f */
    public final void mo6725f() {
        bli.m888a(f18097f, "showWarmLightOn");
        mo6721b(this.f18104i);
    }
}
