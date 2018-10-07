package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Handler;
import java.util.ArrayDeque;
import java.util.Deque;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: evb */
public final class evb implements eux {
    /* renamed from: a */
    public final Object f17854a = new Object();
    /* renamed from: b */
    public final kpw f17855b = kpw.m18486d();
    /* renamed from: c */
    public final evm f17856c;
    /* renamed from: d */
    public final Handler f17857d;
    /* renamed from: e */
    public final Deque f17858e = new ArrayDeque();
    /* renamed from: f */
    public volatile jgb f17859f;
    /* renamed from: g */
    public boolean f17860g = false;
    /* renamed from: h */
    public boolean f17861h = false;
    /* renamed from: i */
    private eva f17862i;
    /* renamed from: j */
    private euz f17863j;
    /* renamed from: k */
    private final MediaFormat f17864k;
    /* renamed from: l */
    private final etf f17865l;

    public evb(MediaFormat mediaFormat, etf etf, evm evm, iuw iuw, Handler handler) {
        this.f17864k = mediaFormat;
        this.f17865l = etf;
        this.f17856c = evm;
        this.f17857d = handler;
    }

    public final void close() {
        if (this.f17859f != null) {
            this.f17855b.mo10200a(new evf(this), kpq.f8776a);
        } else {
            this.f17857d.getLooper().quitSafely();
        }
    }

    /* renamed from: d */
    private final void m10145d() {
        this.f17861h = false;
        this.f17862i.mo6611a();
    }

    /* renamed from: a */
    public final void mo6605a(jgd jgd, euz euz, eva eva) {
        this.f17862i = eva;
        this.f17863j = euz;
        this.f17859f = jgd.mo9399a(this.f17864k).mo9397a(this.f17857d).mo9398a(new evj(this)).mo9396a();
    }

    /* renamed from: b */
    public final void mo6606b() {
        this.f17857d.post(new eve(this));
    }

    /* renamed from: c */
    public final void mo6607c() {
        this.f17857d.post(new evc(this));
    }

    /* JADX WARNING: Missing block: B:14:0x003b, code:
            if (r13.f17858e.isEmpty() != false) goto L_?;
     */
    /* JADX WARNING: Missing block: B:15:0x003d, code:
            r0 = (p000.iwz) r13.f17865l.f4445a.mo6661c();
     */
    /* JADX WARNING: Missing block: B:16:0x0047, code:
            if (r0 != null) goto L_0x005d;
     */
    /* JADX WARNING: Missing block: B:19:0x004b, code:
            if (r13.f17860g == false) goto L_0x0057;
     */
    /* JADX WARNING: Missing block: B:20:0x004d, code:
            m10145d();
            r13.f17855b.mo15641a(p000.izg.f7956a);
     */
    /* JADX WARNING: Missing block: B:21:0x0057, code:
            if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Missing block: B:22:0x0059, code:
            p000.evb.m10143a(null, r0);
     */
    /* JADX WARNING: Missing block: B:24:?, code:
            r4 = r0.mo13744f();
            r6 = java.util.concurrent.TimeUnit.MICROSECONDS.convert(r4, java.util.concurrent.TimeUnit.NANOSECONDS);
            r2 = r3.mo6609b(r6);
     */
    /* JADX WARNING: Missing block: B:25:0x0073, code:
            if (r2.equals(p000.euy.ENCODE) != false) goto L_0x007e;
     */
    /* JADX WARNING: Missing block: B:27:0x007b, code:
            if (r2.equals(p000.euy.ENCODE_AND_PAUSE) != false) goto L_0x007e;
     */
    /* JADX WARNING: Missing block: B:28:0x007d, code:
            r1 = null;
     */
    /* JADX WARNING: Missing block: B:29:0x007e, code:
            if (r1 == null) goto L_0x0140;
     */
    /* JADX WARNING: Missing block: B:30:0x0080, code:
            r1 = new p000.evg(r6);
            r3 = ((p000.evl) p000.jri.m13391a((p000.evl) r13.f17858e.pollFirst(), (java.lang.Object) "Got no input buffers after checking emptiness; is someone else removing them???")).mo6619a();
     */
    /* JADX WARNING: Missing block: B:32:?, code:
            p000.iuw.m4317a(r0, new p000.itv((android.media.Image) r3.mo9393a()));
            r3.mo9394a(r6);
            r1 = r13.f17856c;
     */
    /* JADX WARNING: Missing block: B:33:0x00ac, code:
            if (r1 != null) goto L_0x00f2;
     */
    /* JADX WARNING: Missing block: B:34:0x00ae, code:
            r4 = new java.lang.StringBuilder(46);
            r4.append("actually encoding a frame ");
            r4.append(r6);
            p000.bli.m888a("VideoTrackSampler", r4.toString());
     */
    /* JADX WARNING: Missing block: B:35:0x00c6, code:
            if (r3 == null) goto L_0x00cc;
     */
    /* JADX WARNING: Missing block: B:38:?, code:
            p000.evb.m10144a(null, r3);
     */
    /* JADX WARNING: Missing block: B:40:0x00d2, code:
            if (r2.equals(p000.euy.ENCODE_AND_PAUSE) == false) goto L_0x00de;
     */
    /* JADX WARNING: Missing block: B:41:0x00d4, code:
            m10145d();
     */
    /* JADX WARNING: Missing block: B:42:0x00d7, code:
            if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Missing block: B:43:0x00d9, code:
            p000.evb.m10143a(null, r0);
     */
    /* JADX WARNING: Missing block: B:45:?, code:
            r13.f17857d.post(new p000.evh(r13));
     */
    /* JADX WARNING: Missing block: B:50:0x00ec, code:
            if (r0 != null) goto L_0x00ee;
     */
    /* JADX WARNING: Missing block: B:51:0x00ee, code:
            p000.evb.m10143a(r1, r0);
     */
    /* JADX WARNING: Missing block: B:54:?, code:
            r8 = r1.f4503b;
            r10 = java.util.concurrent.TimeUnit.MICROSECONDS.convert(r4, java.util.concurrent.TimeUnit.NANOSECONDS);
            r9 = new p000.euk(r10);
     */
    /* JADX WARNING: Missing block: B:55:0x0103, code:
            if (r8.f17824a == null) goto L_0x0122;
     */
    /* JADX WARNING: Missing block: B:57:0x0107, code:
            if (r8.f17825b == null) goto L_0x0122;
     */
    /* JADX WARNING: Missing block: B:58:0x0109, code:
            p000.eto.m2161a();
            r4 = r8.f17824a.mo13191a(r4, r10);
            p000.eto.m2161a();
            p000.eto.m2164d();
            p000.kow.m13878a(r4, new p000.eul(r8), r8.f17826c);
     */
    /* JADX WARNING: Missing block: B:60:0x0128, code:
            if (r1.f4504c.mo9709b() == false) goto L_0x00ae;
     */
    /* JADX WARNING: Missing block: B:61:0x012a, code:
            ((p000.ets) r1.f4504c.mo9706a()).mo13187a();
     */
    /* JADX WARNING: Missing block: B:66:0x013a, code:
            if (r3 != null) goto L_0x013c;
     */
    /* JADX WARNING: Missing block: B:68:?, code:
            p000.evb.m10144a(r1, r3);
     */
    /* JADX WARNING: Missing block: B:70:0x0140, code:
            r3 = new java.lang.StringBuilder(46);
            r3.append("Dropping starting frame <");
            r3.append(r6);
            r3.append(">");
            p000.bli.m888a("VideoTrackSampler", r3.toString());
     */
    /* JADX WARNING: Missing block: B:78:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:79:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:80:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:81:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:82:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:83:?, code:
            return;
     */
    /* renamed from: a */
    final void mo13190a() {
        /*
        r13 = this;
        r1 = 1;
        r12 = 0;
        r0 = java.lang.Thread.currentThread();
        r2 = r0.getId();
        r0 = r13.f17857d;
        r0 = r0.getLooper();
        r0 = r0.getThread();
        r4 = r0.getId();
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 == 0) goto L_0x0023;
    L_0x001c:
        r0 = "VideoTrackSampler";
        r2 = "Sampling video on a non-video-encoder thread";
        p000.bli.m898e(r0, r2);
    L_0x0023:
        r2 = r13.f17854a;
        monitor-enter(r2);
        r0 = r13.f17859f;	 Catch:{ all -> 0x015f }
        r3 = r13.f17863j;	 Catch:{ all -> 0x015f }
        if (r0 == 0) goto L_0x0032;
    L_0x002c:
        if (r3 == 0) goto L_0x0032;
    L_0x002e:
        r0 = r13.f17861h;	 Catch:{ all -> 0x015f }
        if (r0 != 0) goto L_0x0034;
    L_0x0032:
        monitor-exit(r2);	 Catch:{ all -> 0x015f }
    L_0x0033:
        return;
    L_0x0034:
        monitor-exit(r2);	 Catch:{ all -> 0x015f }
        r0 = r13.f17858e;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0033;
    L_0x003d:
        r0 = r13.f17865l;
        r0 = r0.f4445a;
        r0 = r0.mo6661c();
        r0 = (p000.iwz) r0;
        if (r0 != 0) goto L_0x005d;
    L_0x0049:
        r1 = r13.f17860g;	 Catch:{ all -> 0x00e9 }
        if (r1 == 0) goto L_0x0057;
    L_0x004d:
        r13.m10145d();	 Catch:{ all -> 0x00e9 }
        r1 = r13.f17855b;	 Catch:{ all -> 0x00e9 }
        r2 = p000.izg.f7956a;	 Catch:{ all -> 0x00e9 }
        r1.mo15641a(r2);	 Catch:{ all -> 0x00e9 }
    L_0x0057:
        if (r0 == 0) goto L_0x0033;
    L_0x0059:
        p000.evb.m10143a(r12, r0);
        goto L_0x0033;
    L_0x005d:
        r4 = r0.mo13744f();	 Catch:{ all -> 0x00e9 }
        r2 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ all -> 0x00e9 }
        r6 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x00e9 }
        r6 = r2.convert(r4, r6);	 Catch:{ all -> 0x00e9 }
        r2 = r3.mo6609b(r6);	 Catch:{ all -> 0x00e9 }
        r3 = p000.euy.ENCODE;	 Catch:{ all -> 0x00e9 }
        r3 = r2.equals(r3);	 Catch:{ all -> 0x00e9 }
        if (r3 != 0) goto L_0x007e;
    L_0x0075:
        r3 = p000.euy.ENCODE_AND_PAUSE;	 Catch:{ all -> 0x00e9 }
        r3 = r2.equals(r3);	 Catch:{ all -> 0x00e9 }
        if (r3 != 0) goto L_0x007e;
    L_0x007d:
        r1 = 0;
    L_0x007e:
        if (r1 == 0) goto L_0x0140;
    L_0x0080:
        r1 = new evg;	 Catch:{ all -> 0x00e9 }
        r1.<init>(r6);	 Catch:{ all -> 0x00e9 }
        r1 = r13.f17858e;	 Catch:{ all -> 0x00e9 }
        r1 = r1.pollFirst();	 Catch:{ all -> 0x00e9 }
        r1 = (p000.evl) r1;	 Catch:{ all -> 0x00e9 }
        r3 = "Got no input buffers after checking emptiness; is someone else removing them???";
        r1 = p000.jri.m13391a(r1, r3);	 Catch:{ all -> 0x00e9 }
        r1 = (p000.evl) r1;	 Catch:{ all -> 0x00e9 }
        r3 = r1.mo6619a();	 Catch:{ all -> 0x00e9 }
        r8 = new itv;	 Catch:{ all -> 0x0137 }
        r1 = r3.mo9393a();	 Catch:{ all -> 0x0137 }
        r1 = (android.media.Image) r1;	 Catch:{ all -> 0x0137 }
        r8.<init>(r1);	 Catch:{ all -> 0x0137 }
        p000.iuw.m4317a(r0, r8);	 Catch:{ all -> 0x0137 }
        r3.mo9394a(r6);	 Catch:{ all -> 0x0137 }
        r1 = r13.f17856c;	 Catch:{ all -> 0x0137 }
        if (r1 != 0) goto L_0x00f2;
    L_0x00ae:
        r1 = "VideoTrackSampler";
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0137 }
        r5 = 46;
        r4.<init>(r5);	 Catch:{ all -> 0x0137 }
        r5 = "actually encoding a frame ";
        r4.append(r5);	 Catch:{ all -> 0x0137 }
        r4.append(r6);	 Catch:{ all -> 0x0137 }
        r4 = r4.toString();	 Catch:{ all -> 0x0137 }
        p000.bli.m888a(r1, r4);	 Catch:{ all -> 0x0137 }
        if (r3 == 0) goto L_0x00cc;
    L_0x00c8:
        r1 = 0;
        p000.evb.m10144a(r1, r3);	 Catch:{ all -> 0x00e9 }
    L_0x00cc:
        r1 = p000.euy.ENCODE_AND_PAUSE;	 Catch:{ all -> 0x00e9 }
        r1 = r2.equals(r1);	 Catch:{ all -> 0x00e9 }
        if (r1 == 0) goto L_0x00de;
    L_0x00d4:
        r13.m10145d();	 Catch:{ all -> 0x00e9 }
    L_0x00d7:
        if (r0 == 0) goto L_0x0033;
    L_0x00d9:
        p000.evb.m10143a(r12, r0);
        goto L_0x0033;
    L_0x00de:
        r1 = r13.f17857d;	 Catch:{ all -> 0x00e9 }
        r2 = new evh;	 Catch:{ all -> 0x00e9 }
        r2.<init>(r13);	 Catch:{ all -> 0x00e9 }
        r1.post(r2);	 Catch:{ all -> 0x00e9 }
        goto L_0x00d7;
    L_0x00e9:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x00eb }
    L_0x00eb:
        r2 = move-exception;
        if (r0 == 0) goto L_0x00f1;
    L_0x00ee:
        p000.evb.m10143a(r1, r0);
    L_0x00f1:
        throw r2;
    L_0x00f2:
        r8 = r1.f4503b;	 Catch:{ all -> 0x0137 }
        r9 = java.util.concurrent.TimeUnit.MICROSECONDS;	 Catch:{ all -> 0x0137 }
        r10 = java.util.concurrent.TimeUnit.NANOSECONDS;	 Catch:{ all -> 0x0137 }
        r10 = r9.convert(r4, r10);	 Catch:{ all -> 0x0137 }
        r9 = new euk;	 Catch:{ all -> 0x0137 }
        r9.<init>(r10);	 Catch:{ all -> 0x0137 }
        r9 = r8.f17824a;	 Catch:{ all -> 0x0137 }
        if (r9 == 0) goto L_0x0122;
    L_0x0105:
        r9 = r8.f17825b;	 Catch:{ all -> 0x0137 }
        if (r9 == 0) goto L_0x0122;
    L_0x0109:
        p000.eto.m2161a();	 Catch:{ all -> 0x0137 }
        r9 = r8.f17824a;	 Catch:{ all -> 0x0137 }
        r4 = r9.mo13191a(r4, r10);	 Catch:{ all -> 0x0137 }
        p000.eto.m2161a();	 Catch:{ all -> 0x0137 }
        p000.eto.m2164d();	 Catch:{ all -> 0x0137 }
        r5 = new eul;	 Catch:{ all -> 0x0137 }
        r5.<init>(r8);	 Catch:{ all -> 0x0137 }
        r8 = r8.f17826c;	 Catch:{ all -> 0x0137 }
        p000.kow.m13878a(r4, r5, r8);	 Catch:{ all -> 0x0137 }
    L_0x0122:
        r4 = r1.f4504c;	 Catch:{ all -> 0x0137 }
        r4 = r4.mo9709b();	 Catch:{ all -> 0x0137 }
        if (r4 == 0) goto L_0x00ae;
    L_0x012a:
        r1 = r1.f4504c;	 Catch:{ all -> 0x0137 }
        r1 = r1.mo9706a();	 Catch:{ all -> 0x0137 }
        r1 = (p000.ets) r1;	 Catch:{ all -> 0x0137 }
        r1.mo13187a();	 Catch:{ all -> 0x0137 }
        goto L_0x00ae;
    L_0x0137:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0139 }
    L_0x0139:
        r2 = move-exception;
        if (r3 == 0) goto L_0x013f;
    L_0x013c:
        p000.evb.m10144a(r1, r3);	 Catch:{ all -> 0x00e9 }
    L_0x013f:
        throw r2;	 Catch:{ all -> 0x00e9 }
    L_0x0140:
        r1 = "VideoTrackSampler";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00e9 }
        r4 = 46;
        r3.<init>(r4);	 Catch:{ all -> 0x00e9 }
        r4 = "Dropping starting frame <";
        r3.append(r4);	 Catch:{ all -> 0x00e9 }
        r3.append(r6);	 Catch:{ all -> 0x00e9 }
        r4 = ">";
        r3.append(r4);	 Catch:{ all -> 0x00e9 }
        r3 = r3.toString();	 Catch:{ all -> 0x00e9 }
        p000.bli.m888a(r1, r3);	 Catch:{ all -> 0x00e9 }
        goto L_0x00cc;
    L_0x015f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x015f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: evb.a():void");
    }
}
