package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Point;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: cqm */
public final class cqm implements cpo {
    /* renamed from: b */
    private static final String f13146b = bli.m887a("PhotoItemFact");
    /* renamed from: a */
    public final ContentResolver f13147a;
    /* renamed from: c */
    private final Context f13148c;
    /* renamed from: d */
    private final cqb f13149d;
    /* renamed from: e */
    private final gsp f13150e;

    public cqm(Context context, cqb cqb, ContentResolver contentResolver, cqi cqi, gsp gsp) {
        this.f13148c = (Context) jri.m13404b((Object) context);
        this.f13149d = (cqb) jri.m13404b((Object) cqb);
        this.f13147a = (ContentResolver) jri.m13404b((Object) contentResolver);
        jri.m13404b((Object) cqi);
        this.f13150e = (gsp) jri.m13404b((Object) gsp);
    }

    /* renamed from: a */
    public final cql mo12892a(Uri uri, boolean z, kbg kbg) {
        if (!this.f13150e.mo7409a(uri)) {
            return null;
        }
        Point e = this.f13150e.mo7414e(uri);
        if (e == null) {
            return null;
        }
        Context context = this.f13148c;
        cqb cqb = this.f13149d;
        iqp a = iqp.m4102a(e);
        return new cql(context, cqb, cql.m15428a(uri, a, this.f13150e.mo7415f(uri), z, kbg), this, this.f13150e);
    }

    /* renamed from: b */
    public final cql mo5663a(Cursor cursor) {
        eru a = cqi.m1456a(cursor);
        if (a != null) {
            return new cql(this.f13148c, this.f13149d, a, this, this.f13150e);
        }
        bli.m898e(f13146b, "skipping item with null data, returning null for item");
        return null;
    }

    /* JADX WARNING: Missing block: B:19:0x004d, code:
            if (r1 != null) goto L_0x004f;
     */
    /* JADX WARNING: Missing block: B:21:?, code:
            r1.close();
     */
    @android.annotation.TargetApi(21)
    /* renamed from: a */
    public final p000.cql mo12891a(android.net.Uri r8) {
        /*
        r7 = this;
        r6 = 0;
        r0 = r7.f13147a;	 Catch:{ SQLiteException -> 0x0023 }
        r2 = p000.cqk.f2770b;	 Catch:{ SQLiteException -> 0x0023 }
        r3 = 0;
        r4 = 0;
        r5 = 0;
        r1 = r8;
        r1 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ SQLiteException -> 0x0023 }
        if (r1 == 0) goto L_0x0021;
    L_0x000f:
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x004a }
        if (r0 == 0) goto L_0x001f;
    L_0x0015:
        r0 = r7.mo5663a(r1);	 Catch:{ all -> 0x004a }
    L_0x0019:
        if (r1 == 0) goto L_0x001e;
    L_0x001b:
        r1.close();	 Catch:{ SQLiteException -> 0x0023 }
    L_0x001e:
        return r0;
    L_0x001f:
        r0 = r6;
        goto L_0x0019;
    L_0x0021:
        r0 = r6;
        goto L_0x0019;
    L_0x0023:
        r0 = move-exception;
        r1 = f13146b;
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
        goto L_0x001e;
    L_0x004a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x004c }
    L_0x004c:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0052;
    L_0x004f:
        r1.close();	 Catch:{ all -> 0x0053 }
    L_0x0052:
        throw r2;	 Catch:{ SQLiteException -> 0x0023 }
    L_0x0053:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);	 Catch:{ SQLiteException -> 0x0023 }
        goto L_0x0052;
        */
        throw new UnsupportedOperationException("Method not decompiled: cqm.a(android.net.Uri):cql");
    }
}
