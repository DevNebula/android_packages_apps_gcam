package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;

/* compiled from: PG */
/* renamed from: cqx */
public final class cqx implements cpo {
    /* renamed from: e */
    private static final String f13166e = bli.m887a("VideoItemFact");
    /* renamed from: a */
    public final Context f13167a;
    /* renamed from: b */
    public final cqb f13168b;
    /* renamed from: c */
    public final ContentResolver f13169c;
    /* renamed from: d */
    public final gsp f13170d;

    public cqx(Context context, ContentResolver contentResolver, cqb cqb, gsp gsp, cqp cqp) {
        this.f13167a = (Context) jri.m13404b((Object) context);
        this.f13169c = (ContentResolver) jri.m13404b((Object) contentResolver);
        this.f13168b = (cqb) jri.m13404b((Object) cqb);
        this.f13170d = (gsp) jri.m13404b((Object) gsp);
        jri.m13404b((Object) cqp);
    }

    /* renamed from: b */
    private final cqs m8786b(Cursor cursor) {
        cqv a = cqp.m1457a(cursor);
        if (a != null) {
            return new cqs(this.f13167a, this.f13168b, a, this);
        }
        bli.m898e(f13166e, "skipping item with null data, returning null for item");
        return null;
    }

    /* JADX WARNING: Missing block: B:19:0x0051, code:
            if (r1 != null) goto L_0x0053;
     */
    /* JADX WARNING: Missing block: B:21:?, code:
            r1.close();
     */
    @android.annotation.TargetApi(21)
    /* renamed from: a */
    public final p000.cqs mo12895a(android.net.Uri r8) {
        /*
        r7 = this;
        r6 = 0;
        r0 = r7.f13167a;	 Catch:{ SQLiteException -> 0x0027 }
        r0 = r0.getContentResolver();	 Catch:{ SQLiteException -> 0x0027 }
        r2 = p000.cqr.f2774b;	 Catch:{ SQLiteException -> 0x0027 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r8;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ SQLiteException -> 0x0027 }
        if (r1 == 0) goto L_0x0025;
    L_0x0013:
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x004e }
        if (r0 == 0) goto L_0x0023;
    L_0x0019:
        r0 = r7.m8786b(r1);	 Catch:{ all -> 0x004e }
    L_0x001d:
        if (r1 == 0) goto L_0x0022;
    L_0x001f:
        r1.close();	 Catch:{ SQLiteException -> 0x0027 }
    L_0x0022:
        return r0;
    L_0x0023:
        r0 = r6;
        goto L_0x001d;
    L_0x0025:
        r0 = r6;
        goto L_0x001d;
    L_0x0027:
        r0 = move-exception;
        r1 = f13166e;
        r2 = java.lang.String.valueOf(r8);
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 13;
        r4.<init>(r3);
        r3 = "Error in get ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        p000.bli.m899e(r1, r2, r0);
        r0 = r6;
        goto L_0x0022;
    L_0x004e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0050 }
    L_0x0050:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0056;
    L_0x0053:
        r1.close();	 Catch:{ all -> 0x0057 }
    L_0x0056:
        throw r2;	 Catch:{ SQLiteException -> 0x0027 }
    L_0x0057:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);	 Catch:{ SQLiteException -> 0x0027 }
        goto L_0x0056;
        */
        throw new UnsupportedOperationException("Method not decompiled: cqx.a(android.net.Uri):cqs");
    }
}
