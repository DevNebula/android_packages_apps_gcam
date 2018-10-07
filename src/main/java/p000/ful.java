package p000;

import android.annotation.TargetApi;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: ful */
public final class ful implements fue {
    /* renamed from: a */
    public final iqz f18794a;
    /* renamed from: b */
    public final ftp f18795b;
    /* renamed from: c */
    public final bmh f18796c;
    /* renamed from: d */
    private final Executor f18797d;

    ful(ira ira, fuf fuf, bmh bmh) {
        this(ira, fuf, bmh, Executors.newCachedThreadPool(iel.m3779d("TuneIoEx", 0)));
    }

    private ful(ira ira, fuf fuf, bmh bmh, Executor executor) {
        this.f18796c = bmh;
        this.f18794a = ira.mo8854a("TuningDataCollector");
        this.f18797d = executor;
        this.f18795b = new ftp("tuning");
    }

    /* renamed from: a */
    public final void mo6913a(fub fub) {
        this.f18797d.execute(new fum(this, fub));
    }

    /* JADX WARNING: Missing block: B:17:?, code:
            p000.ful.m10974a(r0, r1);
     */
    /* renamed from: a */
    final void mo13280a(p000.kbg r4, java.lang.String r5, java.lang.String r6) {
        /*
        r3 = this;
        r0 = r4.mo9709b();
        if (r0 == 0) goto L_0x0019;
    L_0x0006:
        r0 = r3.f18795b;	 Catch:{ IOException -> 0x001a }
        r1 = r0.mo6905a(r5, r6);	 Catch:{ IOException -> 0x001a }
        r0 = r4.mo9706a();	 Catch:{ all -> 0x0021 }
        r0 = (byte[]) r0;	 Catch:{ all -> 0x0021 }
        r1.write(r0);	 Catch:{ all -> 0x0021 }
        r0 = 0;
        p000.ful.m10974a(r0, r1);	 Catch:{ IOException -> 0x001a }
    L_0x0019:
        return;
    L_0x001a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0021:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0023 }
    L_0x0023:
        r2 = move-exception;
        p000.ful.m10974a(r0, r1);	 Catch:{ IOException -> 0x001a }
        throw r2;	 Catch:{ IOException -> 0x001a }
        */
        throw new UnsupportedOperationException("Method not decompiled: ful.a(kbg, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    final void mo13281a(kpk kpk, String str) {
        kow.m13878a(kpk, new fun(this, str), kpq.f8776a);
    }
}
