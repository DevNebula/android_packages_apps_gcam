package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import com.google.android.apps.camera.stats.Instrumentation;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: gkk */
public class gkk extends gkt {
    /* renamed from: F */
    private static final String f26419F = bli.m887a("BurstCaptureSession");
    /* renamed from: G */
    private final gtg f26420G;
    /* renamed from: H */
    private final gsl f26421H;
    /* renamed from: I */
    private final ContentResolver f26422I;
    /* renamed from: a */
    public final List f26423a = Collections.synchronizedList(new ArrayList());
    /* renamed from: b */
    public final iut f26424b;
    /* renamed from: c */
    public final gsx f26425c;
    /* renamed from: d */
    public final ixv f26426d;
    /* renamed from: e */
    public final BurstSessionStatistics f26427e;
    /* renamed from: f */
    public final irs f26428f;
    /* renamed from: g */
    public volatile boe f26429g;

    public gkk(ContentResolver contentResolver, glt glt, gmp gmp, eqa eqa, gsi gsi, gtf gtf, gsp gsp, gtg gtg, gsx gsx, gsl gsl, grg grg, bcv bcv, ixv ixv, ird ird, bls bls, hju hju, gnh gnh, irs irs, String str, kbg kbg, iut iut, long j, Executor executor, gev gev) {
        super(executor, gmp, glt, eqa, gsi, gtf, gsp, grg, bcv, ird, bls, gnh, str, kbg, j, hju, gev, new glv(false));
        this.f26424b = iut;
        this.f26420G = gtg;
        this.f26425c = gsx.mo7424a(str);
        this.f26421H = gsl;
        this.f26422I = contentResolver;
        this.f26426d = ixv;
        this.f26427e = (BurstSessionStatistics) Instrumentation.instance().burstStats().getCurrentSession();
        this.f26428f = irs;
        this.f24384E = new gfu(this);
    }

    /* renamed from: a */
    public final void mo13367a(bnl bnl) {
        if (this.f24391h.mo7218b()) {
            if (bnl.mo2051h()) {
                m17752b(bnl);
            }
            this.f26423a.add(bnl);
            return;
        }
        bnl.mo2045a();
    }

    /* renamed from: a */
    public final void mo13360a() {
        this.f24391h.mo7215a(C0252go.f5827aZ, C0252go.f5882bb, mo14924s());
        m17749F();
        mo14925w();
        Uri uri = this.f24402s;
        if (uri != null) {
            mo14921b(uri);
        }
        gmq gmq = this.f24397n;
        if (gmq != null) {
            this.f24404u.mo7236b(gmq);
            this.f24397n = null;
        }
        this.f24403t.onCaptureCanceled(this.f24382C, this.f24383D);
    }

    /* renamed from: c */
    public final gob mo13375c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public final void mo13376d() {
        this.f24391h.mo7215a(C0252go.f5827aZ, C0252go.f5882bb, mo14924s());
        m17749F();
        mo14925w();
        mo14921b(this.f24402s);
        this.f24403t.onCaptureDeleted();
    }

    /* renamed from: F */
    private final void m17749F() {
        Set<File> hashSet = new HashSet();
        synchronized (this.f26423a) {
            for (bnl bnl : this.f26423a) {
                if (bnl.mo2048d() != null) {
                    hashSet.add((File) jri.m13404b(bnl.mo2048d().getParentFile()));
                }
            }
        }
        for (File file : hashSet) {
            String s;
            try {
                s = mo14924s();
                String valueOf = String.valueOf(file);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
                stringBuilder.append("Deleting burst directory ");
                stringBuilder.append(valueOf);
                bli.m888a(s, stringBuilder.toString());
                this.f26421H.mo7397b(file);
            } catch (IOException e) {
                s = mo14924s();
                String valueOf2 = String.valueOf(file);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 43);
                stringBuilder2.append("Error attempting to delete burst directory ");
                stringBuilder2.append(valueOf2);
                bli.m891b(s, stringBuilder2.toString());
            }
        }
    }

    /* renamed from: q */
    protected void mo15539q() {
    }

    /* renamed from: r */
    protected void mo15540r() {
    }

    /* renamed from: e */
    public final void mo13377e() {
        this.f24404u.mo7236b(this.f24397n);
        this.f24403t.onCaptureFinalized();
        mo15539q();
    }

    /* renamed from: f */
    public final void mo13378f() {
        this.f24391h.mo7215a(C0252go.f5827aZ, C0252go.f5881ba, mo14924s());
        long elapsedRealtime = SystemClock.elapsedRealtime();
        grw grw = new grw();
        int size = this.f26423a.size();
        grw.mo7384a(size, size);
        grw.mo7383a(1000);
        BurstSessionStatistics burstSessionStatistics = this.f26427e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(grw.m2815a("DBSC", burstSessionStatistics.getScoredFrameCount()));
        grw.mo7385b().f25319a = burstSessionStatistics.getAcquiredFrameCount();
        grw.mo7385b().f25320b = (kma[]) arrayList.toArray(new kma[0]);
        grw.f6021a.f25313a = burstSessionStatistics.getBurstDurationS();
        grw.f6021a.f25314b = burstSessionStatistics.getBurstSavedFrameCount();
        this.f24399p.execute(new gkl(this, grw, elapsedRealtime));
    }

    /* renamed from: a */
    public final void mo7076a(hec hec, boolean z, String str) {
        String s = mo14924s();
        String valueOf = String.valueOf(str);
        String str2 = "Error persisting burst: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m891b(s, valueOf);
        mo14917a(this.f24402s, hci.m11977a(), z);
    }

    /* renamed from: a */
    private final File m17750a(bnl bnl, gsx gsx, String str) {
        return this.f26420G.mo7440a(gsx).mo7436a(str, bnl.mo2046b());
    }

    /* renamed from: k */
    public final glw mo13382k() {
        return this.f24394k;
    }

    /* renamed from: s */
    String mo14924s() {
        return f26419F;
    }

    /* renamed from: t */
    protected void mo15541t() {
    }

    /* renamed from: u */
    final List mo15542u() {
        gsq b = this.f24400q.mo7411b();
        synchronized (this.f26423a) {
            if (this.f26423a.isEmpty()) {
                throw new IllegalStateException("No burst images available to save!");
            }
            Object obj;
            Object obj2 = this.f26423a;
            List arrayList = new ArrayList(obj2);
            Collections.sort(arrayList, new gkm(this));
            List subList = arrayList.subList(0, Math.min(8, obj2.size()));
            if (subList.isEmpty()) {
                obj = null;
            } else {
                obj = (bnl) subList.get(0);
            }
            mo15541t();
            for (bnl bnl : this.f26423a) {
                boolean contains = subList.contains(bnl) ^ 1;
                m17751a(b, bnl, this.f26425c, bnl.equals(obj), contains);
            }
        }
        m17749F();
        mo13374b(100);
        return b.mo7418a();
    }

    /* renamed from: a */
    private final synchronized void m17751a(gsq gsq, bnl bnl, gsx gsx, boolean z, boolean z2) {
        String a = bnl.mo2044a(z, z2);
        ird C = mo14911C();
        String valueOf = String.valueOf(a);
        String str = "Save ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        C.mo8856a(valueOf);
        try {
            File a2 = m17750a(bnl, gsx, a);
            String s = mo14924s();
            str = String.valueOf(a2);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 21) + String.valueOf(str).length());
            stringBuilder.append("Persisting image ");
            stringBuilder.append(a);
            stringBuilder.append(" to ");
            stringBuilder.append(str);
            bli.m888a(s, stringBuilder.toString());
            boe a3 = bnl.mo2043a(this.f26421H, a2, z, z2);
            if (z) {
                this.f26429g = a3;
            } else if (a2.length() > 0) {
                gsq.mo7419a(this.f26422I, a, this.f24406w, this.f24405v, bnl.mo2047c().f7692e, a2.getAbsolutePath(), bnl.mo2052i(), bnl.mo2050f(), bnl.mo2046b());
            }
            mo14911C().mo8857b();
        } catch (Throwable e) {
            bli.m892b(mo14924s(), String.format("Unable to persist image %s!", new Object[]{bnl}), e);
            mo14911C().mo8857b();
        } catch (Throwable th) {
            mo14911C().mo8857b();
        }
        return;
    }

    /* renamed from: b */
    private final synchronized void m17752b(bnl bnl) {
        String a = bnl.mo2044a(false, false);
        String s;
        try {
            File a2 = m17750a(bnl, this.f26425c, a);
            s = mo14924s();
            String valueOf = String.valueOf(a2);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 41);
            stringBuilder.append("Persisting image without notification to ");
            stringBuilder.append(valueOf);
            bli.m888a(s, stringBuilder.toString());
            bnl.mo2043a(this.f26421H, a2, false, false);
        } catch (IOException e) {
            String s2 = mo14924s();
            a = String.valueOf(a);
            s = "Error persisting image: ";
            if (a.length() == 0) {
                a = new String(s);
            } else {
                a = s.concat(a);
            }
            bli.m891b(s2, a);
        }
    }

    /* renamed from: a */
    public final kpk mo7074a(InputStream inputStream, glz glz) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo13371a(iqp iqp, glw glw) {
        mo14911C().mo8856a("BurstCaptureSession#startEmpty");
        this.f24391h.mo7215a(C0252go.f5826aY, C0252go.f5827aZ, mo14924s());
        this.f24394k = glw;
        mo15543v();
        mo15540r();
        this.f24396m = -1;
        this.f24397n = this.f24404u.mo7231a(this.f24392i, iqp, this.f24406w, this.f24402s);
        mo14913E();
        String s = mo14924s();
        String valueOf = String.valueOf(this.f24402s);
        String str = this.f24392i;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 32) + String.valueOf(str).length());
        stringBuilder.append("Starting empty with URI=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", TITLE=");
        stringBuilder.append(str);
        bli.m888a(s, stringBuilder.toString());
        mo14915a(this.f24402s, this.f24394k);
        this.f24403t.onCaptureStarted(this.f24394k);
        mo14911C().mo8857b();
    }

    /* renamed from: a */
    public final void mo13363a(Bitmap bitmap, int i) {
        bli.m888a(mo14924s(), "Updating burst capture indicator thumbnail");
        mo14920b(bitmap, i);
        this.f24403t.onTinyThumb();
    }

    /* renamed from: a */
    public final void mo13362a(Bitmap bitmap) {
        if (!this.f24391h.mo7217a()) {
            jri.m13404b(this.f24397n);
            bli.m888a(mo14924s(), "Updating burst thumbnail");
            this.f26427e.mo12606h();
            this.f24404u.mo7234a((gmq) jri.m13404b(this.f24397n), bitmap);
            mo14914a(this.f24402s);
            this.f24403t.onMediumThumb();
        }
    }

    /* renamed from: v */
    protected void mo15543v() {
        boolean z;
        if (this.f24394k == glw.BURST) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
    }
}
