package p000;

import android.media.AudioManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: bfl */
final class bfl implements bff, bfk {
    /* renamed from: a */
    public static final String f22635a = bli.m887a("CdrMgrImpl");
    /* renamed from: b */
    public final ExecutorService f22636b;
    /* renamed from: c */
    public final gtf f22637c;
    /* renamed from: d */
    public final bij f22638d;
    /* renamed from: e */
    public final ird f22639e;
    /* renamed from: f */
    public kpw f22640f;
    /* renamed from: g */
    public final Object f22641g = new Object();
    /* renamed from: h */
    public Map f22642h = new HashMap();
    /* renamed from: i */
    public final Handler f22643i;
    /* renamed from: j */
    public final ijx f22644j;
    /* renamed from: k */
    public final bjx f22645k;
    /* renamed from: l */
    private final bfa f22646l;
    /* renamed from: m */
    private final inn f22647m;
    /* renamed from: n */
    private final HandlerThread f22648n;
    /* renamed from: o */
    private final bir f22649o;
    /* renamed from: p */
    private final kwk f22650p;
    /* renamed from: q */
    private final fbn f22651q;
    /* renamed from: r */
    private final guf f22652r;
    /* renamed from: s */
    private final bja f22653s;
    /* renamed from: t */
    private final bkf f22654t;
    /* renamed from: u */
    private final iog f22655u;
    /* renamed from: v */
    private final ioe f22656v;
    /* renamed from: w */
    private Map f22657w = new HashMap();

    public bfl(bfa bfa, inn inn, ExecutorService executorService, gtf gtf, HandlerThread handlerThread, bir bir, kwk kwk, fbn fbn, guf guf, bij bij, bja bja, bkf bkf, ird ird, bjx bjx, iog iog, ioe ioe) {
        this.f22646l = (bfa) jri.m13404b((Object) bfa);
        this.f22647m = (inn) jri.m13404b((Object) inn);
        this.f22636b = (ExecutorService) jri.m13404b((Object) executorService);
        this.f22637c = (gtf) jri.m13404b((Object) gtf);
        this.f22648n = (HandlerThread) jri.m13404b((Object) handlerThread);
        this.f22649o = (bir) jri.m13404b((Object) bir);
        this.f22650p = (kwk) jri.m13404b((Object) kwk);
        this.f22651q = (fbn) jri.m13404b((Object) fbn);
        this.f22652r = (guf) jri.m13404b((Object) guf);
        this.f22638d = (bij) jri.m13404b((Object) bij);
        this.f22653s = (bja) jri.m13404b((Object) bja);
        this.f22654t = (bkf) jri.m13404b((Object) bkf);
        this.f22639e = (ird) jri.m13404b((Object) ird);
        this.f22645k = (bjx) jri.m13404b((Object) bjx);
        this.f22655u = iog;
        this.f22656v = ioe;
        this.f22648n.start();
        this.f22643i = new Handler(this.f22648n.getLooper());
        this.f22644j = new ijx(this.f22643i);
        this.f22640f = kpw.m18486d();
        this.f22640f.mo15641a(Boolean.valueOf(true));
    }

    /* renamed from: a */
    private final void m15044a(kpk kpk, ken ken) {
        kow.m13878a(kpk, new bfo(this, ken), kpq.f8776a);
    }

    public final void close() {
        synchronized (this.f22641g) {
            if (mo14560b()) {
                bli.m891b(f22635a, "Manager has been closed");
                return;
            }
            this.f22640f.mo15641a(Boolean.valueOf(false));
            bli.m888a(f22635a, "close");
            for (bfe close : this.f22642h.values()) {
                close.close();
            }
            this.f22636b.shutdown();
            this.f22648n.quit();
        }
    }

    /* renamed from: a */
    private final inm m15041a(inc inc, ioa ioa) {
        if (inc.mo8636c()) {
            return new inm(imz.m3920a(ioa.mo8658c()), ioa.mo8656a(), ioa.mo8659d(), ioa.mo8657b());
        }
        boolean z;
        inn inn = this.f22647m;
        int d = ioa.mo8659d() / inc.mo8635a();
        imz a = imz.m3920a(ioa.mo8658c());
        inb inb = a.f7482b;
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) inn.f7534a.f7529a.get(inb.toString());
        jqk.m13354c(mediaCodecInfo);
        CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(inb.toString());
        jqk.m13354c(capabilitiesForType);
        AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
        jqk.m13354c(audioCapabilities);
        int[] iArr = inn.f7535b;
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = iArr[i];
            if (!audioCapabilities.isSampleRateSupported(i3)) {
                i3 = i2;
            } else if (i3 >= d) {
                i2 = i3;
                break;
            }
            i++;
            i2 = i3;
        }
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        jqk.m13347a(z);
        return new inm(a, ioa.mo8656a(), i2, ioa.mo8657b());
    }

    /* renamed from: a */
    private final ioa m15043a(inc inc, boolean z, ine ine, iur iur) {
        ioa a;
        kbg c;
        ivy ivy;
        Object a2;
        if (inc.mo8636c()) {
            iog iog = this.f22655u;
            a2 = inx.m3958a(iur, (iob) jri.m13404b(iob.m3976a(ine)));
            if (a2 != null) {
                ivy = iog.f7590a;
                if (ivy.f7878h || ivy.f7876f || ivy.f7877g || ivy.f7875e || ivy.f7874d) {
                    int g = a2.mo8662g();
                    if (ine.equals(ine.RES_2160P)) {
                        g = 48000000;
                    }
                    if (z) {
                        a2 = ioc.m12560a(a2).mo8677h(5).mo8679j(1).mo8678i(65536).mo8676g(g).mo8669a();
                    } else {
                        a2 = ioc.m12560a(a2).mo8677h(2).mo8679j(8).mo8678i(32768).mo8676g(g).mo8669a();
                    }
                }
                c = kbg.m4804c(a2);
            } else {
                c = kau.f21835a;
            }
        } else {
            ioe ioe = this.f22656v;
            a2 = inx.m3957a(iur, (inz) jri.m13404b(inz.m3960a(ine)));
            if (a2 != null) {
                ivy = ioe.f7589a;
                if (ivy.f7878h || ivy.f7876f || ivy.f7877g || ivy.f7875e || ivy.f7874d) {
                    if (z) {
                        a2 = ioc.m12560a(a2).mo8677h(5).mo8679j(1).mo8678i(65536).mo8669a();
                    } else {
                        a2 = ioc.m12560a(a2).mo8677h(2).mo8679j(8).mo8678i(32768).mo8669a();
                    }
                }
                c = kbg.m4804c(a2);
            } else {
                c = kau.f21835a;
            }
        }
        if (c.mo9709b()) {
            a2 = (ioa) c.mo9706a();
            String str = f22635a;
            String valueOf = String.valueOf(a2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
            stringBuilder.append("Selected CamcorderProfileProxy: ");
            stringBuilder.append(valueOf);
            bli.m896d(str, stringBuilder.toString());
            return a2;
        }
        bli.m891b(f22635a, "immediateFailedFuture: No supported CamcorderProfile");
        throw new bdx("no supported CamcorderProfile");
    }

    /* renamed from: a */
    private final inp m15042a(inc inc, ioa ioa, ine ine) {
        int l;
        int i;
        int g;
        if (inc.mo8636c()) {
            jri.m13395a(inn.m3945b(ioa, inc, ine));
            l = ioa.mo8667l();
            i = inc.f7508f;
            g = ioa.mo8662g();
            if (i == 30 && l == 60) {
                g = (int) (((double) g) / 1.5d);
            }
            return inn.m3941a(ioa, ine, g, inc);
        }
        jri.m13395a(inn.m3943a(ioa, inc, ine));
        l = ioa.mo8667l();
        i = inc.f7508f;
        g = ioa.mo8662g();
        if (i < l) {
            g = (int) (((float) g) * (((float) i) / ((float) l)));
        }
        return inn.m3941a(ioa, ine, g, inc);
    }

    /* JADX WARNING: Missing block: B:80:?, code:
            return r2;
     */
    /* renamed from: b */
    public final p000.kbg mo12367b(p000.iur r17) {
        /*
        r16 = this;
        r0 = r16;
        r4 = r0.f22641g;
        monitor-enter(r4);
        r1 = r16.mo14560b();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0016;
    L_0x000b:
        r1 = f22635a;	 Catch:{ all -> 0x0034 }
        r2 = "Manager has been closed";
        p000.bli.m898e(r1, r2);	 Catch:{ all -> 0x0034 }
        r1 = p000.kau.f21835a;	 Catch:{ all -> 0x0034 }
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
    L_0x0015:
        return r1;
    L_0x0016:
        r0 = r16;
        r1 = r0.f22657w;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r1 = r1.containsKey(r0);	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0037;
    L_0x0022:
        r0 = r16;
        r1 = r0.f22657w;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r1 = r1.get(r0);	 Catch:{ all -> 0x0034 }
        r1 = (p000.bez) r1;	 Catch:{ all -> 0x0034 }
        r1 = p000.kbg.m4804c(r1);	 Catch:{ all -> 0x0034 }
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        goto L_0x0015;
    L_0x0034:
        r1 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        throw r1;
    L_0x0037:
        r0 = r16;
        r5 = r0.f22646l;	 Catch:{ all -> 0x0034 }
        r1 = r5.f1147d;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r6 = r1.mo13218b(r0);	 Catch:{ all -> 0x0034 }
        r7 = new java.util.HashMap;	 Catch:{ all -> 0x0034 }
        r7.<init>();	 Catch:{ all -> 0x0034 }
        r1 = p000.inc.FPS_30;	 Catch:{ all -> 0x0034 }
        r2 = p000.inc.FPS_30;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r2 = p000.bfa.m831a(r0, r2);	 Catch:{ all -> 0x0034 }
        r7.put(r1, r2);	 Catch:{ all -> 0x0034 }
        r1 = p000.inc.FPS_60;	 Catch:{ all -> 0x0034 }
        r2 = p000.inc.FPS_60;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r2 = p000.bfa.m831a(r0, r2);	 Catch:{ all -> 0x0034 }
        r7.put(r1, r2);	 Catch:{ all -> 0x0034 }
        r1 = p000.inc.FPS_AUTO;	 Catch:{ all -> 0x0034 }
        r2 = p000.inc.FPS_AUTO;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r2 = p000.bfa.m831a(r0, r2);	 Catch:{ all -> 0x0034 }
        r7.put(r1, r2);	 Catch:{ all -> 0x0034 }
        r8 = new java.util.HashMap;	 Catch:{ all -> 0x0034 }
        r8.<init>();	 Catch:{ all -> 0x0034 }
        r1 = p000.inc.m3931b();	 Catch:{ all -> 0x0034 }
        r2 = r1.iterator();	 Catch:{ all -> 0x0034 }
    L_0x007c:
        r1 = r2.hasNext();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x0091;
    L_0x0082:
        r1 = r2.next();	 Catch:{ all -> 0x0034 }
        r1 = (p000.inc) r1;	 Catch:{ all -> 0x0034 }
        r3 = new java.util.ArrayList;	 Catch:{ all -> 0x0034 }
        r3.<init>();	 Catch:{ all -> 0x0034 }
        r8.put(r1, r3);	 Catch:{ all -> 0x0034 }
        goto L_0x007c;
    L_0x0091:
        r1 = r6.mo9086y();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x01d8;
    L_0x0097:
        r1 = r6.mo13236u_();	 Catch:{ all -> 0x0034 }
        r2 = p000.bfa.f1144a;	 Catch:{ all -> 0x0034 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0034 }
        r9 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0034 }
        r9 = r9.length();	 Catch:{ all -> 0x0034 }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
        r9 = r9 + 46;
        r10.<init>(r9);	 Catch:{ all -> 0x0034 }
        r9 = "query CameraCharacteristics.HfrVideoSizeList: ";
        r10.append(r9);	 Catch:{ all -> 0x0034 }
        r10.append(r3);	 Catch:{ all -> 0x0034 }
        r3 = r10.toString();	 Catch:{ all -> 0x0034 }
        p000.bli.m896d(r2, r3);	 Catch:{ all -> 0x0034 }
        r9 = r1.iterator();	 Catch:{ all -> 0x0034 }
    L_0x00c3:
        r1 = r9.hasNext();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x01a1;
    L_0x00c9:
        r1 = r9.next();	 Catch:{ all -> 0x0034 }
        r1 = (p000.ine) r1;	 Catch:{ all -> 0x0034 }
        r10 = p000.inz.m3960a(r1);	 Catch:{ all -> 0x0034 }
        if (r10 == 0) goto L_0x00c3;
    L_0x00d5:
        r2 = r5.f1146c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r2 = p000.inx.m3959b(r0, r10);	 Catch:{ all -> 0x0034 }
        if (r2 != 0) goto L_0x0104;
    L_0x00df:
        r1 = p000.bfa.f1144a;	 Catch:{ all -> 0x0034 }
        r2 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x0034 }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0034 }
        r3 = r3.length();	 Catch:{ all -> 0x0034 }
        r10 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
        r3 = r3 + 42;
        r10.<init>(r3);	 Catch:{ all -> 0x0034 }
        r3 = "CamcorderProfile doesn't support quality: ";
        r10.append(r3);	 Catch:{ all -> 0x0034 }
        r10.append(r2);	 Catch:{ all -> 0x0034 }
        r2 = r10.toString();	 Catch:{ all -> 0x0034 }
        p000.bli.m896d(r1, r2);	 Catch:{ all -> 0x0034 }
        goto L_0x00c3;
    L_0x0104:
        r2 = r1.mo8639c();	 Catch:{ all -> 0x0034 }
        r11 = r6.mo13235a(r2);	 Catch:{ all -> 0x0034 }
        r2 = p000.bfa.f1144a;	 Catch:{ all -> 0x0034 }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0034 }
        r12 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x0034 }
        r13 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0034 }
        r13 = r13.length();	 Catch:{ all -> 0x0034 }
        r14 = java.lang.String.valueOf(r12);	 Catch:{ all -> 0x0034 }
        r14 = r14.length();	 Catch:{ all -> 0x0034 }
        r15 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0034 }
        r13 = r13 + 53;
        r13 = r13 + r14;
        r15.<init>(r13);	 Catch:{ all -> 0x0034 }
        r13 = "query CameraCharacteristics.HfrVideoFpsRangeList: [";
        r15.append(r13);	 Catch:{ all -> 0x0034 }
        r15.append(r3);	 Catch:{ all -> 0x0034 }
        r3 = "]=";
        r15.append(r3);	 Catch:{ all -> 0x0034 }
        r15.append(r12);	 Catch:{ all -> 0x0034 }
        r3 = r15.toString();	 Catch:{ all -> 0x0034 }
        p000.bli.m896d(r2, r3);	 Catch:{ all -> 0x0034 }
        r2 = p000.inc.m3931b();	 Catch:{ all -> 0x0034 }
        r12 = r2.iterator();	 Catch:{ all -> 0x0034 }
    L_0x014d:
        r2 = r12.hasNext();	 Catch:{ all -> 0x0034 }
        if (r2 == 0) goto L_0x00c3;
    L_0x0153:
        r2 = r12.next();	 Catch:{ all -> 0x0034 }
        r2 = (p000.inc) r2;	 Catch:{ all -> 0x0034 }
        r3 = r5.f1146c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r3 = p000.inx.m3959b(r0, r10);	 Catch:{ all -> 0x0034 }
        if (r3 == 0) goto L_0x014d;
    L_0x0163:
        r3 = r5.f1146c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r3 = p000.inx.m3957a(r0, r10);	 Catch:{ all -> 0x0034 }
        p000.jri.m13404b(r3);	 Catch:{ all -> 0x0034 }
        r13 = r5.f1145b;	 Catch:{ all -> 0x0034 }
        r3 = p000.inn.m3943a(r3, r2, r1);	 Catch:{ all -> 0x0034 }
        if (r3 == 0) goto L_0x014d;
    L_0x0176:
        r13 = r11.iterator();	 Catch:{ all -> 0x0034 }
    L_0x017a:
        r3 = r13.hasNext();	 Catch:{ all -> 0x0034 }
        if (r3 == 0) goto L_0x014d;
    L_0x0180:
        r3 = r13.next();	 Catch:{ all -> 0x0034 }
        r3 = (android.util.Range) r3;	 Catch:{ all -> 0x0034 }
        r14 = r2.f7508f;	 Catch:{ all -> 0x0034 }
        r3 = r3.getUpper();	 Catch:{ all -> 0x0034 }
        r3 = (java.lang.Integer) r3;	 Catch:{ all -> 0x0034 }
        r3 = r3.intValue();	 Catch:{ all -> 0x0034 }
        if (r14 != r3) goto L_0x017a;
    L_0x0194:
        r2 = r8.get(r2);	 Catch:{ all -> 0x0034 }
        r2 = (java.util.List) r2;	 Catch:{ all -> 0x0034 }
        p000.jri.m13404b(r2);	 Catch:{ all -> 0x0034 }
        r2.add(r1);	 Catch:{ all -> 0x0034 }
        goto L_0x014d;
    L_0x01a1:
        r2 = p000.inz.values();	 Catch:{ all -> 0x0034 }
        r3 = r2.length;	 Catch:{ all -> 0x0034 }
        r1 = 0;
    L_0x01a7:
        if (r1 >= r3) goto L_0x021f;
    L_0x01a9:
        r9 = r2[r1];	 Catch:{ all -> 0x0034 }
        r10 = r5.f1146c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r10 = p000.inx.m3959b(r0, r9);	 Catch:{ all -> 0x0034 }
        if (r10 != 0) goto L_0x01b8;
    L_0x01b5:
        r1 = r1 + 1;
        goto L_0x01a7;
    L_0x01b8:
        r10 = r5.f1146c;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r9 = p000.inx.m3957a(r0, r9);	 Catch:{ all -> 0x0034 }
        p000.jri.m13404b(r9);	 Catch:{ all -> 0x0034 }
        r9 = r9.mo8667l();	 Catch:{ all -> 0x0034 }
        r10 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;
        if (r9 != r10) goto L_0x01b5;
    L_0x01cb:
        r1 = 1;
    L_0x01cc:
        if (r1 != 0) goto L_0x01d8;
    L_0x01ce:
        r1 = p000.inc.FPS_240;	 Catch:{ all -> 0x0034 }
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x0034 }
        r2.<init>();	 Catch:{ all -> 0x0034 }
        r8.put(r1, r2);	 Catch:{ all -> 0x0034 }
    L_0x01d8:
        r7.putAll(r8);	 Catch:{ all -> 0x0034 }
        r1 = r7.keySet();	 Catch:{ all -> 0x0034 }
        r2 = r1.iterator();	 Catch:{ all -> 0x0034 }
    L_0x01e3:
        r1 = r2.hasNext();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x01fd;
    L_0x01e9:
        r1 = r2.next();	 Catch:{ all -> 0x0034 }
        r1 = (p000.inc) r1;	 Catch:{ all -> 0x0034 }
        r1 = r7.get(r1);	 Catch:{ all -> 0x0034 }
        r1 = (java.util.List) r1;	 Catch:{ all -> 0x0034 }
        r3 = p000.ine.m3937a();	 Catch:{ all -> 0x0034 }
        java.util.Collections.sort(r1, r3);	 Catch:{ all -> 0x0034 }
        goto L_0x01e3;
    L_0x01fd:
        r1 = new bez;	 Catch:{ all -> 0x0034 }
        r1.<init>(r6, r7);	 Catch:{ all -> 0x0034 }
        r2 = p000.kbg.m4804c(r1);	 Catch:{ all -> 0x0034 }
        r1 = r2.mo9709b();	 Catch:{ all -> 0x0034 }
        if (r1 == 0) goto L_0x021b;
    L_0x020c:
        r0 = r16;
        r3 = r0.f22657w;	 Catch:{ all -> 0x0034 }
        r1 = r2.mo9706a();	 Catch:{ all -> 0x0034 }
        r1 = (p000.bez) r1;	 Catch:{ all -> 0x0034 }
        r0 = r17;
        r3.put(r0, r1);	 Catch:{ all -> 0x0034 }
    L_0x021b:
        monitor-exit(r4);	 Catch:{ all -> 0x0034 }
        r1 = r2;
        goto L_0x0015;
    L_0x021f:
        r1 = 0;
        goto L_0x01cc;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfl.b(iur):kbg");
    }

    /* renamed from: a */
    public final fbn mo12364a() {
        return this.f22651q;
    }

    /* renamed from: b */
    final boolean mo14560b() {
        boolean z;
        synchronized (this.f22641g) {
            z = this.f22640f.isDone() ? !((Boolean) kow.m13881c(this.f22640f)).booleanValue() : false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo1937a(iur iur) {
        synchronized (this.f22641g) {
            if (mo14560b()) {
                return;
            }
            String str = f22635a;
            String valueOf = String.valueOf(iur);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
            stringBuilder.append("close camcorder device ");
            stringBuilder.append(valueOf);
            bli.m894c(str, stringBuilder.toString());
            this.f22642h.remove(iur);
        }
    }

    /* renamed from: a */
    public final kpk mo12365a(inc inc, ipv ipv, ine ine, iur iur, kbg kbg, ilp ilp, ilp ilp2, kbg kbg2, boolean z, boolean z2, int i, int i2, kbg kbg3) {
        bli.m888a(f22635a, "openFastCamcorder");
        synchronized (this.f22641g) {
            if (m15045c(iur)) {
                ilp b = ilq.m3889b(ilp);
                try {
                    ioa a = m15043a(inc, false, ine, iur);
                    inp a2 = m15042a(inc, a, ine);
                    inm a3 = m15041a(inc, a);
                    ipy ipy = (ipy) this.f22650p.mo10566a();
                    bir bir = this.f22649o;
                    ExecutorService executorService = this.f22636b;
                    gtf gtf = this.f22637c;
                    guf guf = this.f22652r;
                    ird ird = this.f22639e;
                    bir.m851a((inj) bir.f1222a.mo10566a(), 1);
                    bir.m851a((ipw) bir.f1223b.mo10566a(), 2);
                    ipy = (ipy) bir.m851a(ipy, 3);
                    Executor executor = (Executor) bir.m851a(executorService, 4);
                    a3 = (inm) bir.m851a(a3, 5);
                    inp inp = (inp) bir.m851a(a2, 6);
                    ipv ipv2 = (ipv) bir.m851a(ipv, 7);
                    bir.m851a(ipv, 8);
                    Object bis = new bis(ipy, executor, a3, inp, ipv2, (gtf) bir.m851a(gtf, 9), (guf) bir.m851a(guf, 10), (kbg) bir.m851a(kbg, 11), (ilp) bir.m851a(b, 12), (ilp) bir.m851a(ilp2, 13), (kbg) bir.m851a(kbg2, 14), z, i, i2, (kbg) bir.m851a(kbg3, 18), (ird) bir.m851a(ird, 19));
                    kpk a4 = kny.m18476a(bis.mo12384a(), new bfm(this, inc, a2, iur, bis, ilp, ilp2, kbg2), kpq.f8776a);
                    m15044a(a4, ken.m13708a(bis));
                    return a4;
                } catch (Throwable e) {
                    return kow.m13874a(e);
                }
            }
            kpk a5 = kow.m13874a(new IllegalStateException("CamcorderManager has been closed."));
            return a5;
        }
    }

    /* renamed from: a */
    public final kpk mo12366a(inc inc, ipv ipv, ine ine, iur iur, kbg kbg, ilp ilp, ilp ilp2, kbg kbg2, boolean z, boolean z2, int i, kbg kbg3) {
        kpk a;
        bli.m888a(f22635a, "openCamcorder with mediacodec");
        synchronized (this.f22641g) {
            if (m15045c(iur)) {
                try {
                    ioa a2 = m15043a(inc, false, ine, iur);
                    inp a3 = m15042a(inc, a2, ine);
                    inm a4 = m15041a(inc, a2);
                    bkf bkf = this.f22654t;
                    ExecutorService executorService = this.f22636b;
                    Handler handler = this.f22643i;
                    guf guf = this.f22652r;
                    gtf gtf = this.f22637c;
                    bja bja = this.f22653s;
                    ird ird = this.f22639e;
                    ilp ilp3 = (ilp) bkf.m870a((ilp) bkf.f1264a.mo10566a(), 1);
                    AudioManager audioManager = (AudioManager) bkf.m870a((AudioManager) bkf.f1265b.mo10566a(), 2);
                    bkf.m870a((inj) bkf.f1266c.mo10566a(), 3);
                    iou iou = new iou(ilp3, audioManager, (bkm) bkf.m870a((bkm) bkf.f1267d.mo10566a(), 4), (inm) bkf.m870a(a4, 5), (inp) bkf.m870a(a3, 6), (Executor) bkf.m870a(executorService, 7), (Handler) bkf.m870a(handler, 8), (ing) bkf.m870a(ipv, 9), (ilp) bkf.m870a(ilp2, 10), (kbg) bkf.m870a(kbg2, 11), true, (guf) bkf.m870a(guf, 13), (gtf) bkf.m870a(gtf, 14), (bja) bkf.m870a(bja, 15), i, (kbg) bkf.m870a(kbg, 17), (kbg) bkf.m870a(kbg3, 18), (ird) bkf.m870a(ird, 19));
                    a = kny.m18476a(iou.mo13696a(), new bfn(this, inc, a3, iur, iou, ilp, ilp2, kbg2), kpq.f8776a);
                    m15044a(a, ken.m13719e());
                } catch (Throwable e) {
                    a = kow.m13874a(e);
                }
            } else {
                a = kow.m13874a(new IllegalStateException("CamcorderManager has been closed."));
            }
        }
        return a;
    }

    /* renamed from: c */
    private final boolean m15045c(iur iur) {
        synchronized (this.f22641g) {
            if (this.f22642h.containsKey(iur)) {
                String str = f22635a;
                String valueOf = String.valueOf(iur);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 63);
                stringBuilder.append("immediateFailedFuture: The camera was already opened. cameraId=");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
                this.f22642h.remove(iur);
            }
            try {
                boolean booleanValue = ((Boolean) this.f22640f.get()).booleanValue();
                this.f22640f = kpw.m18486d();
                return booleanValue;
            } catch (ExecutionException e) {
                bli.m891b(f22635a, "Fail to wait for the state becoming ready");
                return false;
            } catch (InterruptedException e2) {
                bli.m891b(f22635a, "Fail to wait for the state becoming ready");
                return false;
            }
        }
    }
}
