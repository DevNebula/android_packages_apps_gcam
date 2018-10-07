package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: esd */
public class esd implements etc {
    /* renamed from: a */
    public static final String f17704a = bli.m887a("MVCtrlImpl");
    /* renamed from: b */
    public final Executor f17705b;
    /* renamed from: c */
    public final gsi f17706c;
    /* renamed from: d */
    public final gsl f17707d;
    /* renamed from: e */
    public final euh f17708e;
    /* renamed from: f */
    public final Map f17709f = new ConcurrentHashMap();
    /* renamed from: g */
    public final Object f17710g = new Object();
    /* renamed from: h */
    public volatile ezj f17711h = ezj.TRIMMING_MODE_AUTO;
    /* renamed from: i */
    public long f17712i;
    /* renamed from: j */
    public long f17713j = Long.MAX_VALUE;
    /* renamed from: k */
    public List f17714k = new ArrayList();
    /* renamed from: l */
    public volatile eth f17715l = null;
    /* renamed from: m */
    private final Executor f17716m;
    /* renamed from: n */
    private final gtf f17717n;
    /* renamed from: o */
    private final Context f17718o;
    /* renamed from: p */
    private final ikd f17719p;
    /* renamed from: q */
    private final ilp f17720q;
    /* renamed from: r */
    private volatile esu f17721r = null;

    public esd(Executor executor, Executor executor2, gsi gsi, gsl gsl, gtf gtf, Context context, euh euh, ikd ikd, ilp ilp) {
        this.f17708e = euh;
        this.f17706c = gsi;
        this.f17707d = gsl;
        this.f17717n = gtf;
        this.f17718o = context;
        this.f17705b = (Executor) jri.m13404b((Object) executor);
        this.f17716m = (Executor) jri.m13404b((Object) executor2);
        this.f17719p = ikd;
        this.f17720q = ilp;
    }

    /* renamed from: a */
    public final void mo6581a(esu esu) {
        this.f17721r = esu;
    }

    /* renamed from: a */
    public final synchronized void mo6582a(eth eth) {
        if (this.f17715l == null) {
            this.f17715l = eth;
        } else {
            bli.m898e(f17704a, "Cannot attach UI controller when already attached!");
        }
    }

    /* renamed from: b */
    public final void mo6586b(esu esu) {
        if (esu != this.f17721r) {
            bli.m898e(f17704a, "Detaching perOneCamera resources that were not up to date");
        }
        esu.f4440a.mo6600a();
        this.f17721r = null;
        synchronized (this.f17710g) {
            this.f17712i = 0;
        }
    }

    /* renamed from: b */
    public final synchronized void mo6587b(eth eth) {
        if (this.f17715l == eth) {
            this.f17715l = null;
        } else {
            bli.m898e(f17704a, "Cannot detach UI controller. Values mismatch.");
        }
    }

    /* renamed from: a */
    public final kpk mo6577a(Uri uri, InputStream inputStream, kbg kbg, String str, String str2, grg grg) {
        eto.m2161a();
        File a = this.f17717n.mo7436a(str, ixx.JPEG);
        File a2 = this.f17717n.mo7436a(str2, ixx.JPEG);
        String str3 = f17704a;
        String valueOf = String.valueOf(uri);
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 29) + String.valueOf(valueOf2).length());
        stringBuilder.append("Finishing microvideo for ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" as ");
        stringBuilder.append(valueOf2);
        bli.m888a(str3, stringBuilder.toString());
        eso eso = (eso) this.f17709f.remove(uri);
        if (eso == null) {
            str3 = f17704a;
            valueOf = String.valueOf(uri);
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder2.append("No in-flight session found for ");
            stringBuilder2.append(valueOf);
            bli.m888a(str3, stringBuilder2.toString());
            try {
                grg.mo7377b(this.f17706c.mo7392a(a2, inputStream, kbg));
                return kow.m13873a((Object) a2);
            } catch (Throwable e) {
                return kow.m13874a(e);
            }
        }
        str3 = f17704a;
        valueOf = String.valueOf(uri);
        StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 17);
        stringBuilder3.append("finishMicrovideo ");
        stringBuilder3.append(valueOf);
        bli.m888a(str3, stringBuilder3.toString());
        File a3 = this.f17717n.mo7435a(str2);
        try {
            InputStream a4 = esw.m2146a(this.f17706c, this.f17707d, inputStream, a3, kbg);
            kpk d = kpw.m18486d();
            eso.f4434a.f17819e.mo10200a(new esi(eso, d), kpq.f8776a);
            kpk a5 = ezu.m2253a(kny.m18475a(d, new esj(this, eso, a3, a2, grg, a, kbg, a4), this.f17716m), 15000, new Handler(Looper.getMainLooper()));
            a5.mo10200a(new esk(this, eso, grg), this.f17705b);
            a5 = kni.m18470a(a5, Throwable.class, new esl(this, grg, eso, a3, a2, str2), this.f17705b);
            a5.mo10200a(new esm(this, a3, eso), this.f17705b);
            return a5;
        } catch (Throwable e2) {
            return kow.m13874a(e2);
        }
    }

    /* renamed from: a */
    public final kbg mo6576a(long j) {
        if (this.f17721r == null) {
            return kau.f21835a;
        }
        iwz iwz = (iwz) this.f17721r.f4442c.mo6657a(j);
        if (iwz != null) {
            return kbg.m4803b(iwz);
        }
        return kau.f21835a;
    }

    /* renamed from: a */
    public final boolean mo6585a() {
        return this.f17721r != null;
    }

    /* renamed from: b */
    public final synchronized boolean mo6588b() {
        boolean z;
        gon a = gon.m2713a(((Integer) this.f17720q.mo13673b()).intValue());
        z = a == gon.MICRO_AUTO || a == gon.MICRO_ON;
        return z;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:esd.a(eso, java.io.File, java.io.File, grg, java.io.File, kbg, java.io.InputStream):java.io.File, dom blocks: [B:1:0x0002, B:30:0x010b]
        	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:89)
        	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.util.ArrayList.forEach(ArrayList.java:1257)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.ProcessClass.process(ProcessClass.java:32)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:51)
        	at java.lang.Iterable.forEach(Iterable.java:75)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:51)
        	at jadx.core.ProcessClass.process(ProcessClass.java:37)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:293)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        */
    /* renamed from: a */
    final /* synthetic */ java.io.File mo13175a(p000.eso r9, java.io.File r10, java.io.File r11, p000.grg r12, java.io.File r13, p000.kbg r14, java.io.InputStream r15) {
        /*
        r8 = this;
        if (r9 != 0) goto L_0x0011;
    L_0x0002:
        r0 = new java.lang.AssertionError;	 Catch:{ IOException -> 0x000a }
        r1 = "inFlightSession should not be null";	 Catch:{ IOException -> 0x000a }
        r0.<init>(r1);	 Catch:{ IOException -> 0x000a }
        throw r0;	 Catch:{ IOException -> 0x000a }
    L_0x000a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0011:
        r0 = r9.f4434a;	 Catch:{ IOException -> 0x000a }
        r0 = r0.f17819e;	 Catch:{ IOException -> 0x000a }
        r0 = r0.isCancelled();	 Catch:{ IOException -> 0x000a }
        if (r0 == 0) goto L_0x005b;	 Catch:{ IOException -> 0x000a }
    L_0x001b:
        r0 = r8.f17707d;	 Catch:{ IOException -> 0x000a }
        r0.mo7396a(r10, r11);	 Catch:{ IOException -> 0x000a }
        r0 = f17704a;	 Catch:{ IOException -> 0x000a }
        r1 = java.lang.String.valueOf(r11);	 Catch:{ IOException -> 0x000a }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x000a }
        r2 = r2.length();	 Catch:{ IOException -> 0x000a }
        r2 = r2 + 50;	 Catch:{ IOException -> 0x000a }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x000a }
        r3.<init>(r2);	 Catch:{ IOException -> 0x000a }
        r2 = "Microvideo cancelled, moving tmp file into place: ";	 Catch:{ IOException -> 0x000a }
        r3.append(r2);	 Catch:{ IOException -> 0x000a }
        r3.append(r1);	 Catch:{ IOException -> 0x000a }
        r1 = r3.toString();	 Catch:{ IOException -> 0x000a }
        p000.bli.m888a(r0, r1);	 Catch:{ IOException -> 0x000a }
        r0 = new klg;	 Catch:{ IOException -> 0x000a }
        r0.<init>();	 Catch:{ IOException -> 0x000a }
        r1 = 0;	 Catch:{ IOException -> 0x000a }
        r0.f25245e = r1;	 Catch:{ IOException -> 0x000a }
        r1 = 1;	 Catch:{ IOException -> 0x000a }
        r0.f25246f = r1;	 Catch:{ IOException -> 0x000a }
        r1 = r9.f4439f;	 Catch:{ IOException -> 0x000a }
        r1 = p000.esd.m10042b(r1);	 Catch:{ IOException -> 0x000a }
        r0.f25247g = r1;	 Catch:{ IOException -> 0x000a }
        r12.mo7373a(r0);	 Catch:{ IOException -> 0x000a }
    L_0x005a:
        return r11;	 Catch:{ IOException -> 0x000a }
    L_0x005b:
        r0 = r8.f17706c;	 Catch:{ IOException -> 0x000a }
        r3 = r0.mo7394b(r13);	 Catch:{ IOException -> 0x000a }
        r0 = r14.mo9709b();	 Catch:{ all -> 0x0108 }
        if (r0 == 0) goto L_0x0105;	 Catch:{ all -> 0x0108 }
    L_0x0067:
        r0 = r14.mo9706a();	 Catch:{ all -> 0x0108 }
        r0 = (com.google.android.libraries.camera.exif.ExifInterface) r0;	 Catch:{ all -> 0x0108 }
        r0 = r0.mo12670a(r3);	 Catch:{ all -> 0x0108 }
        r2 = r0;	 Catch:{ all -> 0x0108 }
    L_0x0072:
        r4 = r9.f4435b;	 Catch:{ all -> 0x0108 }
        r0 = r9.f4434a;	 Catch:{ all -> 0x0108 }
        r6 = r0.f17820f;	 Catch:{ Exception -> 0x010f }
        r0 = r0.f17821g;	 Catch:{ Exception -> 0x010f }
        r0 = p000.kow.m13879b(r0);	 Catch:{ Exception -> 0x010f }
        r0 = (java.lang.Long) r0;	 Catch:{ Exception -> 0x010f }
        r0 = r0.longValue();	 Catch:{ Exception -> 0x010f }
        r0 = r6 - r0;	 Catch:{ Exception -> 0x010f }
        r6 = 0;	 Catch:{ Exception -> 0x010f }
        r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1));	 Catch:{ Exception -> 0x010f }
        if (r5 >= 0) goto L_0x00a5;	 Catch:{ Exception -> 0x010f }
    L_0x008c:
        r0 = f17704a;	 Catch:{ Exception -> 0x010f }
        r1 = "Negative shutter presentation timestamp detected (%d). Resetting to 0.";	 Catch:{ Exception -> 0x010f }
        r5 = 1;	 Catch:{ Exception -> 0x010f }
        r5 = new java.lang.Object[r5];	 Catch:{ Exception -> 0x010f }
        r6 = 0;	 Catch:{ Exception -> 0x010f }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x010f }
        r7 = 0;	 Catch:{ Exception -> 0x010f }
        r5[r7] = r6;	 Catch:{ Exception -> 0x010f }
        r1 = java.lang.String.format(r1, r5);	 Catch:{ Exception -> 0x010f }
        p000.bli.m891b(r0, r1);	 Catch:{ Exception -> 0x010f }
        r0 = 0;	 Catch:{ Exception -> 0x010f }
    L_0x00a5:
        r5 = new iyy;	 Catch:{ Exception -> 0x010f }
        r5.<init>();	 Catch:{ Exception -> 0x010f }
        r5 = r5.mo9189b();	 Catch:{ Exception -> 0x010f }
        r0 = r5.mo9187a(r0);	 Catch:{ Exception -> 0x010f }
        r0 = r0.mo9188a(r15);	 Catch:{ Exception -> 0x010f }
        r0 = r0.mo9209a(r2);	 Catch:{ Exception -> 0x010f }
        r0 = r0.mo13765a(r4);	 Catch:{ Exception -> 0x010f }
        r0 = r0.mo13766a();	 Catch:{ Exception -> 0x010f }
        r0.call();	 Catch:{ Exception -> 0x010f }
        r3.close();	 Catch:{ IOException -> 0x000a }
        r0 = f17704a;	 Catch:{ IOException -> 0x000a }
        r1 = java.lang.String.valueOf(r13);	 Catch:{ IOException -> 0x000a }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x000a }
        r2 = r2.length();	 Catch:{ IOException -> 0x000a }
        r2 = r2 + 33;	 Catch:{ IOException -> 0x000a }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x000a }
        r3.<init>(r2);	 Catch:{ IOException -> 0x000a }
        r2 = "Successfully saved microvideo to ";	 Catch:{ IOException -> 0x000a }
        r3.append(r2);	 Catch:{ IOException -> 0x000a }
        r3.append(r1);	 Catch:{ IOException -> 0x000a }
        r1 = r3.toString();	 Catch:{ IOException -> 0x000a }
        p000.bli.m888a(r0, r1);	 Catch:{ IOException -> 0x000a }
        r0 = r13.length();	 Catch:{ IOException -> 0x000a }
        r12.mo7377b(r0);	 Catch:{ IOException -> 0x000a }
        p000.eto.m2161a();	 Catch:{ IOException -> 0x000a }
        p000.eto.m2164d();	 Catch:{ IOException -> 0x000a }
        p000.eto.m2164d();	 Catch:{ IOException -> 0x000a }
        p000.eto.m2164d();	 Catch:{ IOException -> 0x000a }
        p000.eto.m2164d();	 Catch:{ IOException -> 0x000a }
        r11 = r13;
        goto L_0x005a;
    L_0x0105:
        r2 = r3;
        goto L_0x0072;
    L_0x0108:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x010a }
    L_0x010a:
        r1 = move-exception;
        r3.close();	 Catch:{ all -> 0x0116 }
    L_0x010e:
        throw r1;	 Catch:{ IOException -> 0x000a }
    L_0x010f:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x0108 }
        r1.<init>(r0);	 Catch:{ all -> 0x0108 }
        throw r1;	 Catch:{ all -> 0x0108 }
    L_0x0116:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);	 Catch:{ IOException -> 0x000a }
        goto L_0x010e;
        */
        throw new UnsupportedOperationException("Method not decompiled: esd.a(eso, java.io.File, java.io.File, grg, java.io.File, kbg, java.io.InputStream):java.io.File");
    }

    /* renamed from: c */
    public final /* synthetic */ String mo13177c() {
        String stringBuilder;
        synchronized (this.f17710g) {
            long j = this.f17712i;
            StringBuilder stringBuilder2 = new StringBuilder(74);
            stringBuilder2.append("current latest frame when notifyPossibleStart CROSS <");
            stringBuilder2.append(j);
            stringBuilder2.append(">");
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    /* renamed from: c */
    static final /* synthetic */ void m10043c(eth eth) {
        if (eth != null) {
            eth.mo13183b();
        }
    }

    /* renamed from: d */
    public final /* synthetic */ String mo13178d() {
        String stringBuilder;
        synchronized (this.f17710g) {
            long j = this.f17712i;
            StringBuilder stringBuilder2 = new StringBuilder(63);
            stringBuilder2.append("current latest frame when trimming CROSS <");
            stringBuilder2.append(j);
            stringBuilder2.append(">");
            stringBuilder = stringBuilder2.toString();
        }
        return stringBuilder;
    }

    /* renamed from: e */
    static final /* synthetic */ void m10044e() {
        eto.m2161a();
        eto.m2164d();
    }

    /* renamed from: a */
    public final synchronized void mo6579a(Uri uri) {
        eso eso = (eso) this.f17709f.remove(uri);
        if (eso != null) {
            eso.f4434a.mo6683a();
            eso.f4434a.f17819e.mo10200a(new esh(this, eso), this.f17705b);
        }
        String str = f17704a;
        String valueOf = String.valueOf(uri.getPath());
        String str2 = "Cancellation ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m888a(str, valueOf);
    }

    /* renamed from: a */
    public final synchronized void mo6580a(Uri uri, int i, kpk kpk) {
        esu esu = this.f17721r;
        if (esu == null) {
            bli.m898e(f17704a, "Encoding not configured. Abandoning microvideo start.");
        } else {
            bli.m888a(f17704a, "notifyPossibleStart HLINE");
            if (mo6588b()) {
                long j;
                etd etd = new etd(this);
                eto.f4453a.clear();
                eto.f4454b.clear();
                eto.m2161a();
                this.f17719p.execute(new ese(this.f17715l));
                File file = new File(this.f17718o.getCacheDir(), String.valueOf(uri.getPath()).concat(".mp4"));
                synchronized (this.f17710g) {
                    j = this.f17712i;
                    this.f17714k.add(Long.valueOf(j));
                }
                this.f17705b.execute(new esg(this, esu, j, file, i, kpk, uri));
            }
        }
    }

    /* renamed from: a */
    public final void mo6578a(long j, esu esu) {
        if (this.f17721r != null && this.f17721r == esu) {
            synchronized (this.f17710g) {
                long convert = TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS);
                if (convert < this.f17712i) {
                    String str = f17704a;
                    long j2 = this.f17712i;
                    StringBuilder stringBuilder = new StringBuilder(75);
                    stringBuilder.append("Out of order timestamp ");
                    stringBuilder.append(convert);
                    stringBuilder.append(" came after ");
                    stringBuilder.append(j2);
                    bli.m891b(str, stringBuilder.toString());
                }
                this.f17712i = Math.max(this.f17712i, convert);
                esu esu2 = this.f17721r;
                if (esu2 != null && this.f17714k.isEmpty()) {
                    esu2.f4440a.mo6601a(this.f17712i - 1500000);
                }
                if (this.f17713j < this.f17712i) {
                    this.f17713j = Long.MAX_VALUE;
                    new ikd().execute(new esn(this));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo6584a(boolean z) {
        esu esu = this.f17721r;
        if (esu != null) {
            esu.f4443d.mo6602a(z);
        }
    }

    /* renamed from: a */
    public final void mo6583a(ezj ezj) {
        this.f17711h = ezj;
    }

    /* renamed from: b */
    static int m10042b(ezj ezj) {
        switch (ezj.ordinal()) {
            case 0:
                return 2;
            case 1:
                return 3;
            default:
                String valueOf = String.valueOf(ezj);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                stringBuilder.append("Unknown trimming mode: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
        }
    }
}
