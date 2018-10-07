package p000;

import android.graphics.PointF;
import android.hardware.camera2.CaptureRequest;

/* compiled from: PG */
/* renamed from: avy */
public final class avy implements asn {
    /* renamed from: a */
    public static final String f10906a = bli.m887a("TrackingTTF");
    /* renamed from: b */
    public final kbg f10907b;
    /* renamed from: c */
    public final fdw f10908c;
    /* renamed from: d */
    public final kpk f10909d;
    /* renamed from: e */
    public final fbr f10910e;
    /* renamed from: f */
    private final ffc f10911f;
    /* renamed from: g */
    private final ilb f10912g;
    /* renamed from: h */
    private final fdy f10913h;
    /* renamed from: i */
    private final gve f10914i = new gve();
    /* renamed from: j */
    private final auj f10915j;
    /* renamed from: k */
    private final fhg f10916k;

    avy(ffc ffc, ilb ilb, fdy fdy, kbg kbg, auj auj, fhg fhg, kpk kpk, fbr fbr) {
        this.f10911f = ffc;
        this.f10912g = ilb;
        this.f10913h = fdy;
        this.f10907b = kbg;
        this.f10908c = new fdw(ffc.mo9076o());
        this.f10915j = auj;
        this.f10916k = fhg;
        this.f10909d = kpk;
        this.f10910e = fbr;
    }

    /* renamed from: a */
    final void mo12323a() {
        this.f10910e.mo6731a();
        m7145b();
        this.f10912g.mo8826a(fdp.m10408a());
        if (this.f10907b.mo9709b()) {
            ((gva) this.f10907b.mo9706a()).mo13472e();
        }
    }

    /* JADX WARNING: Missing block: B:9:0x001e, code:
            if (r1 != null) goto L_0x0020;
     */
    /* JADX WARNING: Missing block: B:11:?, code:
            r1.close();
     */
    /* JADX WARNING: Missing block: B:13:0x0024, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:14:0x0025, code:
            p000.kqg.m5105a(r0, r1);
     */
    /* renamed from: a */
    final void mo12325a(p000.fim r4) {
        /*
        r3 = this;
        r0 = r3.f10916k;
        r1 = r0.mo6790a();
        r0 = 1;
        r0 = new p000.fim[r0];	 Catch:{ all -> 0x001b }
        r2 = 0;
        r0[r2] = r4;	 Catch:{ all -> 0x001b }
        r0 = java.util.Arrays.asList(r0);	 Catch:{ all -> 0x001b }
        r2 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x001b }
        r1.mo6816a(r0, r2);	 Catch:{ all -> 0x001b }
        if (r1 == 0) goto L_0x001a;
    L_0x0017:
        r1.close();
    L_0x001a:
        return;
    L_0x001b:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x001d }
    L_0x001d:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0023;
    L_0x0020:
        r1.close();	 Catch:{ all -> 0x0024 }
    L_0x0023:
        throw r2;
    L_0x0024:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: avy.a(fim):void");
    }

    /* renamed from: a */
    public final synchronized aub mo1782a(asw asw) {
        aub awc;
        if (this.f10907b.mo9709b()) {
            bli.m888a(f10906a, "Resetting ae/af on tracking touch to focus.");
            m7145b();
            this.f10914i.f6079b = new PointF(-1.0f, -1.0f);
            kpw d = kpw.m18486d();
            mo12324a(asw.f977a);
            gva gva = (gva) this.f10907b.mo9706a();
            this.f10908c.mo6763a(asw.f977a);
            ilp d2 = gva.mo13471d();
            if (((gvd) d2.mo13673b()).mo7464a()) {
                ilp a = ilq.m3875a(d2, new awb(this));
                a.mo13672a(new avz(this), kpq.f8776a);
                d2.mo13672a(new awa(this, d), kpq.f8776a);
                awc = new awc(this, d, a);
            } else {
                awc = this.f10915j.mo1782a(asw);
            }
        } else {
            awc = new atl();
        }
        return awc;
    }

    /* renamed from: b */
    private final void m7145b() {
        Object e;
        try {
            this.f10910e.f4691a.mo8826a(Boolean.valueOf(false));
            fio fio = new fio((fim) ((ffw) isr.m4201a(this.f10909d)).mo13673b());
            fio.mo6809a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
            mo12325a(fio.mo6807a());
            return;
        } catch (isr e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        String str = f10906a;
        String valueOf = String.valueOf(e);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("Error when unlocking ae/af. ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
    }

    /* renamed from: a */
    final void mo12324a(PointF pointF) {
        Object obj = null;
        gve gve = this.f10914i;
        if (pointF.x >= 0.0f && pointF.y >= 0.0f && (Math.abs(pointF.x - gve.f6079b.x) > gve.f6078a || Math.abs(pointF.y - gve.f6079b.y) > gve.f6078a)) {
            gve.f6079b = pointF;
            obj = 1;
        }
        if (obj != null) {
            this.f10912g.mo8826a(atz.m7074a(pointF, pointF, this.f10911f.mo9076o(), this.f10913h));
        }
    }
}
