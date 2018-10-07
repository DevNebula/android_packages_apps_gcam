package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: dtx */
public class dtx implements fwl {
    /* renamed from: a */
    private final iqz f16775a;
    /* renamed from: b */
    public final Set f16776b;
    /* renamed from: c */
    public final fjn f16777c;
    /* renamed from: d */
    public final fjn f16778d;
    /* renamed from: e */
    private final ird f16779e;
    /* renamed from: f */
    private final dqo f16780f;
    /* renamed from: g */
    private final fwl f16781g;
    /* renamed from: h */
    private final dty f16782h;
    /* renamed from: i */
    private final fgr f16783i;
    /* renamed from: j */
    private final int f16784j;
    /* renamed from: k */
    private final int f16785k;
    /* renamed from: l */
    private final long f16786l;
    /* renamed from: m */
    private final fuw f16787m;

    public dtx(ira ira, ird ird, ffr ffr, dqo dqo, fwl fwl, dty dty, fgr fgr, int i, int i2, long j, Set set, fuw fuw) {
        boolean z;
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f16779e = ird;
        this.f16780f = dqo;
        this.f16784j = i;
        this.f16785k = i2;
        this.f16776b = set;
        this.f16787m = fuw;
        this.f16781g = fwl;
        this.f16782h = dty;
        this.f16783i = fgr;
        this.f16786l = j;
        this.f16775a = ira.mo8854a("ZSLImgCaptureCmd");
        this.f16777c = ffr.f4768b;
        this.f16778d = (fjn) kbg.m4803b(ffr.f4769c).mo9710c();
    }

    /* renamed from: e */
    private final bbo m9551e() {
        List<fjj> c = mo13050c();
        List emptyList;
        if (c.isEmpty()) {
            emptyList = Collections.emptyList();
        } else {
            emptyList = new ArrayList();
            long max = Math.max(((fjj) c.get(c.size() - 1)).mo13251e(), this.f16783i.mo13240b()) - this.f16786l;
            for (fjj fjj : c) {
                if (fjj.mo13251e() > max) {
                    emptyList.add(fjj);
                } else {
                    fjj.close();
                }
            }
        }
        long j = 0;
        for (fjj fjj2 : emptyList) {
            j = Math.max(j, fjj2.mo13251e());
        }
        j = this.f16780f.mo6046a(j);
        Collection arrayList = new ArrayList();
        for (fjj fjj22 : emptyList) {
            if (fjj22.mo13251e() <= j) {
                fjj22.close();
            } else {
                arrayList.add(fjj22);
            }
        }
        Collection bbo = new bbo();
        Set<fjj> hashSet;
        try {
            List arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                arrayList2.add((iwp) ((fjj) obj).mo13250d().get());
            }
            arrayList2 = this.f16782h.mo6058a(arrayList2);
            for (i = 0; i < arrayList.size(); i++) {
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    bbo.add((fjj) arrayList.get(i));
                }
            }
            hashSet = new HashSet(arrayList);
            hashSet.removeAll(bbo);
            for (fjj fjj222 : hashSet) {
                fjj222.close();
            }
            return bbo;
        } catch (Throwable e) {
            throw new isr(e);
        } catch (Throwable e2) {
            Throwable th = e2;
            hashSet = new HashSet(arrayList);
            hashSet.removeAll(bbo);
            for (fjj fjj2222 : hashSet) {
                fjj2222.close();
            }
        }
    }

    /* renamed from: c */
    public List mo13050c() {
        return this.f16777c.mo13253c();
    }

    /* renamed from: d */
    public bbo mo13051d() {
        fjn fjn = this.f16778d;
        if (fjn != null) {
            return new bbo(new ArrayList(fjn.mo13253c()));
        }
        return new bbo();
    }

    /* renamed from: a */
    public final ilp mo6936a() {
        return this.f16781g.mo9689a();
    }

    /* renamed from: b */
    public ilp mo6938b() {
        fis a;
        fis[] fisArr = new fis[3];
        switch (this.f16787m.mo6918b().f4959a - 1) {
            case 0:
                a = fds.m10412a(2);
                break;
            case 1:
                fis[] fisArr2 = new fis[2];
                fisArr2[0] = fds.m10412a(5);
                fisArr2[1] = fds.m10417a(Arrays.asList(new fin[]{new fin(CaptureRequest.EDGE_MODE, Integer.valueOf(3)), new fin(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(4))}));
                a = fds.m10418a(fisArr2);
                break;
            case 2:
                a = fds.m10412a(5);
                break;
            default:
                throw new AssertionError();
        }
        fisArr[0] = a;
        fisArr[1] = fds.m10414a(this.f16777c);
        fisArr[2] = fds.m10417a(khb.m4955c(this.f16776b));
        return ilq.m3876a(fds.m10418a(fisArr));
    }

    /* renamed from: a */
    public static void m9547a(fwa fwa) {
        fwa.f4983c.mo6927b().mo8826a(null);
    }

    /* renamed from: a */
    public final void mo6937a(fwm fwm, fwa fwa) {
        this.f16775a.mo8836d("Executing zsl capture command.");
        this.f16779e.mo8856a("ZslImageCapture");
        try {
            Object b = m9550b(fwm, fwa);
            if (b == null) {
                iqz iqz = this.f16775a;
                String valueOf = String.valueOf(this.f16781g);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 32);
                stringBuilder.append("Executing zsl fallback command: ");
                stringBuilder.append(valueOf);
                iqz.mo8836d(stringBuilder.toString());
                this.f16781g.mo6937a(fwm, fwa);
            }
        } finally {
            this.f16779e.mo8857b();
        }
    }

    public String toString() {
        return "ZslImageCaptureCommand";
    }

    /* JADX WARNING: Missing block: B:20:0x0042, code:
            if (r3 != null) goto L_0x0044;
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            p000.dtx.m9548a(r0, r3);
     */
    /* JADX WARNING: Missing block: B:28:0x004b, code:
            if (r2 != null) goto L_0x004d;
     */
    /* JADX WARNING: Missing block: B:30:?, code:
            p000.dtx.m9548a(r0, r2);
     */
    /* renamed from: b */
    private final boolean m9550b(p000.fwm r13, p000.fwa r14) {
        /*
        r12 = this;
        r2 = r12.m9551e();	 Catch:{ isr -> 0x0051 }
        r3 = r12.mo13051d();	 Catch:{ all -> 0x0048 }
        r4 = new java.util.LinkedList;	 Catch:{ all -> 0x003f }
        r4.<init>(r2);	 Catch:{ all -> 0x003f }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x003f }
        r5.<init>();	 Catch:{ all -> 0x003f }
        r0 = 0;
        r1 = r0;
    L_0x0014:
        r0 = r12.f16785k;	 Catch:{ all -> 0x003f }
        if (r1 >= r0) goto L_0x002b;
    L_0x0018:
        r0 = r4.isEmpty();	 Catch:{ all -> 0x003f }
        if (r0 != 0) goto L_0x002b;
    L_0x001e:
        r0 = r4.pollLast();	 Catch:{ all -> 0x003f }
        r0 = (p000.fjj) r0;	 Catch:{ all -> 0x003f }
        r5.add(r0);	 Catch:{ all -> 0x003f }
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0014;
    L_0x002b:
        r1 = r4.iterator();	 Catch:{ all -> 0x003f }
    L_0x002f:
        r0 = r1.hasNext();	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x005b;
    L_0x0035:
        r0 = r1.next();	 Catch:{ all -> 0x003f }
        r0 = (p000.fjj) r0;	 Catch:{ all -> 0x003f }
        r0.close();	 Catch:{ all -> 0x003f }
        goto L_0x002f;
    L_0x003f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0041 }
    L_0x0041:
        r1 = move-exception;
        if (r3 == 0) goto L_0x0047;
    L_0x0044:
        p000.dtx.m9548a(r0, r3);	 Catch:{ all -> 0x0048 }
    L_0x0047:
        throw r1;	 Catch:{ all -> 0x0048 }
    L_0x0048:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004a }
    L_0x004a:
        r1 = move-exception;
        if (r2 == 0) goto L_0x0050;
    L_0x004d:
        p000.dtx.m9548a(r0, r2);	 Catch:{ isr -> 0x0051 }
    L_0x0050:
        throw r1;	 Catch:{ isr -> 0x0051 }
    L_0x0051:
        r0 = move-exception;
        r0 = r12.f16775a;
        r1 = "Unable to read images from zsl buffer.";
        r0.mo8838f(r1);
        r0 = 0;
    L_0x005a:
        return r0;
    L_0x005b:
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x003f }
        r4.<init>();	 Catch:{ all -> 0x003f }
        r6 = r2.iterator();	 Catch:{ all -> 0x003f }
    L_0x0064:
        r0 = r6.hasNext();	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x0097;
    L_0x006a:
        r0 = r6.next();	 Catch:{ all -> 0x003f }
        r0 = (p000.fjj) r0;	 Catch:{ all -> 0x003f }
        r7 = r3.iterator();	 Catch:{ all -> 0x003f }
    L_0x0074:
        r1 = r7.hasNext();	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x0095;
    L_0x007a:
        r1 = r7.next();	 Catch:{ all -> 0x003f }
        r1 = (p000.fjj) r1;	 Catch:{ all -> 0x003f }
        r8 = r1.mo13251e();	 Catch:{ all -> 0x003f }
        r10 = r0.mo13251e();	 Catch:{ all -> 0x003f }
        r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r8 != 0) goto L_0x0074;
    L_0x008c:
        if (r1 == 0) goto L_0x0064;
    L_0x008e:
        r4.add(r1);	 Catch:{ all -> 0x003f }
        r3.remove(r1);	 Catch:{ all -> 0x003f }
        goto L_0x0064;
    L_0x0095:
        r1 = 0;
        goto L_0x008c;
    L_0x0097:
        r1 = r3.iterator();	 Catch:{ all -> 0x003f }
    L_0x009b:
        r0 = r1.hasNext();	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x00ab;
    L_0x00a1:
        r0 = r1.next();	 Catch:{ all -> 0x003f }
        r0 = (p000.fjj) r0;	 Catch:{ all -> 0x003f }
        r0.close();	 Catch:{ all -> 0x003f }
        goto L_0x009b;
    L_0x00ab:
        r0 = r5.size();	 Catch:{ all -> 0x003f }
        r1 = r12.f16784j;	 Catch:{ all -> 0x003f }
        if (r0 >= r1) goto L_0x010d;
    L_0x00b3:
        r0 = r12.f16775a;	 Catch:{ all -> 0x003f }
        r1 = "Too few 3A-converged images found: %d / %d";
        r6 = 2;
        r6 = new java.lang.Object[r6];	 Catch:{ all -> 0x003f }
        r7 = r5.size();	 Catch:{ all -> 0x003f }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x003f }
        r8 = 0;
        r6[r8] = r7;	 Catch:{ all -> 0x003f }
        r7 = r12.f16784j;	 Catch:{ all -> 0x003f }
        r7 = java.lang.Integer.valueOf(r7);	 Catch:{ all -> 0x003f }
        r8 = 1;
        r6[r8] = r7;	 Catch:{ all -> 0x003f }
        r7 = 0;
        r1 = java.lang.String.format(r7, r1, r6);	 Catch:{ all -> 0x003f }
        r0.mo8836d(r1);	 Catch:{ all -> 0x003f }
        r6 = r5.size();	 Catch:{ all -> 0x003f }
        r0 = 0;
        r1 = r0;
    L_0x00dc:
        if (r1 >= r6) goto L_0x00ea;
    L_0x00de:
        r0 = r5.get(r1);	 Catch:{ all -> 0x003f }
        r1 = r1 + 1;
        r0 = (p000.fjj) r0;	 Catch:{ all -> 0x003f }
        r0.close();	 Catch:{ all -> 0x003f }
        goto L_0x00dc;
    L_0x00ea:
        r5 = r4.size();	 Catch:{ all -> 0x003f }
        r0 = 0;
        r1 = r0;
    L_0x00f0:
        if (r1 >= r5) goto L_0x00fe;
    L_0x00f2:
        r0 = r4.get(r1);	 Catch:{ all -> 0x003f }
        r1 = r1 + 1;
        r0 = (p000.fjj) r0;	 Catch:{ all -> 0x003f }
        r0.close();	 Catch:{ all -> 0x003f }
        goto L_0x00f0;
    L_0x00fe:
        if (r3 == 0) goto L_0x0104;
    L_0x0100:
        r0 = 0;
        p000.dtx.m9548a(r0, r3);	 Catch:{ all -> 0x0048 }
    L_0x0104:
        if (r2 == 0) goto L_0x010a;
    L_0x0106:
        r0 = 0;
        p000.dtx.m9548a(r0, r2);	 Catch:{ isr -> 0x0051 }
    L_0x010a:
        r0 = 0;
        goto L_0x005a;
    L_0x010d:
        r0 = r12.mo13049a(r13, r14, r5, r4);	 Catch:{ all -> 0x003f }
        if (r3 == 0) goto L_0x0117;
    L_0x0113:
        r1 = 0;
        p000.dtx.m9548a(r1, r3);	 Catch:{ all -> 0x0048 }
    L_0x0117:
        if (r2 == 0) goto L_0x005a;
    L_0x0119:
        r1 = 0;
        p000.dtx.m9548a(r1, r2);	 Catch:{ isr -> 0x0051 }
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: dtx.b(fwm, fwa):boolean");
    }

    /* JADX WARNING: Missing block: B:17:0x003b, code:
            if (r1 != null) goto L_0x003d;
     */
    /* JADX WARNING: Missing block: B:18:0x003d, code:
            p000.dtx.m9549a(r0, r1);
     */
    /* renamed from: a */
    public boolean mo13049a(p000.fwm r5, p000.fwa r6, java.util.List r7, java.util.List r8) {
        /*
        r4 = this;
        r3 = 0;
        r0 = r4.f16787m;
        r1 = r0.mo6917b(r6);
        if (r1 != 0) goto L_0x0017;
    L_0x0009:
        r0 = r4.f16775a;	 Catch:{ all -> 0x0038 }
        r2 = "Unable to acquire image saver immediately.";
        r0.mo8838f(r2);	 Catch:{ all -> 0x0038 }
        if (r1 == 0) goto L_0x0015;
    L_0x0012:
        p000.dtx.m9549a(r3, r1);
    L_0x0015:
        r0 = 0;
    L_0x0016:
        return r0;
    L_0x0017:
        r0 = r4.f16775a;	 Catch:{ all -> 0x0038 }
        r2 = "ZSL image available.";
        r0.mo8836d(r2);	 Catch:{ all -> 0x0038 }
        p000.dtx.m9547a(r6);	 Catch:{ all -> 0x0038 }
        r5.close();	 Catch:{ all -> 0x0038 }
        r2 = r7.iterator();	 Catch:{ all -> 0x0038 }
    L_0x0028:
        r0 = r2.hasNext();	 Catch:{ all -> 0x0038 }
        if (r0 == 0) goto L_0x0041;
    L_0x002e:
        r0 = r2.next();	 Catch:{ all -> 0x0038 }
        r0 = (p000.fjj) r0;	 Catch:{ all -> 0x0038 }
        p000.fpo.m10810a(r1, r0);	 Catch:{ all -> 0x0038 }
        goto L_0x0028;
    L_0x0038:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003a }
    L_0x003a:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0040;
    L_0x003d:
        p000.dtx.m9549a(r0, r1);
    L_0x0040:
        throw r2;
    L_0x0041:
        if (r1 == 0) goto L_0x0046;
    L_0x0043:
        p000.dtx.m9549a(r3, r1);
    L_0x0046:
        r0 = 1;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: dtx.a(fwm, fwa, java.util.List, java.util.List):boolean");
    }
}
