package p000;

import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.database.Cursor;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: crh */
final class crh implements crg {
    /* renamed from: a */
    private static final String f13179a = bli.m887a("FSListBuilder");
    /* renamed from: b */
    private final String f13180b;
    /* renamed from: c */
    private final cqm f13181c;
    /* renamed from: d */
    private final cqx f13182d;
    /* renamed from: e */
    private final ContentResolver f13183e;
    /* renamed from: f */
    private final cow f13184f;
    /* renamed from: g */
    private long f13185g;
    /* renamed from: h */
    private long f13186h;

    public crh(long j, cqm cqm, cqx cqx, ContentResolver contentResolver, cow cow, gsx gsx) {
        this.f13185g = j;
        this.f13186h = j;
        this.f13181c = (cqm) jri.m13404b((Object) cqm);
        this.f13182d = (cqx) jri.m13404b((Object) cqx);
        this.f13183e = (ContentResolver) jri.m13404b((Object) contentResolver);
        this.f13184f = (cow) jri.m13404b((Object) cow);
        this.f13180b = String.valueOf(gsx.mo7426b()).concat("%");
        String str = f13179a;
        long j2 = this.f13185g;
        long j3 = this.f13186h;
        StringBuilder stringBuilder = new StringBuilder(86);
        stringBuilder.append("Initialized lastPhotoUtcTimeMs: ");
        stringBuilder.append(j2);
        stringBuilder.append(" lastVideoId: ");
        stringBuilder.append(j3);
        bli.m896d(str, stringBuilder.toString());
    }

    /* renamed from: a */
    private static err m8812a(Cursor cursor, cpo cpo) {
        err err = null;
        if (cursor != null && cursor.getColumnCount() != 0) {
            while (cursor.moveToNext()) {
                err = cpo.mo5663a(cursor);
                if (err != null) {
                    break;
                }
                bli.m888a(f13179a, "Skipping item because failed to load.");
            }
        }
        return err;
    }

    /* renamed from: a */
    private static String m8813a(eru eru) {
        return new File(eru.f4383g).getParent();
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARNING: Missing block: B:21:0x00ae, code:
            if (r2 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            p000.crh.m8814a(r0, r2);
     */
    /* JADX WARNING: Missing block: B:29:0x00b7, code:
            if (r7 != null) goto L_0x00b9;
     */
    /* JADX WARNING: Missing block: B:31:?, code:
            p000.crh.m8814a(r0, r7);
     */
    /* renamed from: a */
    public final java.util.List mo5693a(int r12) {
        /*
        r11 = this;
        r10 = 68;
        r6 = new java.util.ArrayList;
        r6.<init>();
        r0 = 2;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x00bd }
        r0 = r11.f13180b;	 Catch:{ all -> 0x00bd }
        r1 = 0;
        r4[r1] = r0;	 Catch:{ all -> 0x00bd }
        r0 = r11.f13185g;	 Catch:{ all -> 0x00bd }
        r0 = java.lang.Long.toString(r0);	 Catch:{ all -> 0x00bd }
        r1 = 1;
        r4[r1] = r0;	 Catch:{ all -> 0x00bd }
        r0 = r11.f13183e;	 Catch:{ all -> 0x00bd }
        r1 = p000.cqk.f2769a;	 Catch:{ all -> 0x00bd }
        r2 = p000.cqk.f2770b;	 Catch:{ all -> 0x00bd }
        r3 = "_data LIKE ? AND datetaken <= ?";
        r5 = "datetaken DESC";
        r7 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00bd }
        r0 = 2;
        r4 = new java.lang.String[r0];	 Catch:{ all -> 0x00b4 }
        r0 = r11.f13180b;	 Catch:{ all -> 0x00b4 }
        r1 = 0;
        r4[r1] = r0;	 Catch:{ all -> 0x00b4 }
        r0 = r11.f13186h;	 Catch:{ all -> 0x00b4 }
        r0 = java.lang.Long.toString(r0);	 Catch:{ all -> 0x00b4 }
        r1 = 1;
        r4[r1] = r0;	 Catch:{ all -> 0x00b4 }
        r0 = r11.f13183e;	 Catch:{ all -> 0x00b4 }
        r1 = p000.cqr.f2773a;	 Catch:{ all -> 0x00b4 }
        r2 = p000.cqr.f2774b;	 Catch:{ all -> 0x00b4 }
        r3 = "_data LIKE ? AND datetaken <= ?";
        r5 = "datetaken DESC";
        r2 = r0.query(r1, r2, r3, r4, r5);	 Catch:{ all -> 0x00b4 }
        r0 = f13179a;	 Catch:{ all -> 0x00ab }
        r4 = r11.f13185g;	 Catch:{ all -> 0x00ab }
        r8 = r11.f13186h;	 Catch:{ all -> 0x00ab }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00ab }
        r3 = 67;
        r1.<init>(r3);	 Catch:{ all -> 0x00ab }
        r3 = "StartQuery with time: ";
        r1.append(r3);	 Catch:{ all -> 0x00ab }
        r1.append(r4);	 Catch:{ all -> 0x00ab }
        r3 = " and ";
        r1.append(r3);	 Catch:{ all -> 0x00ab }
        r1.append(r8);	 Catch:{ all -> 0x00ab }
        r1 = r1.toString();	 Catch:{ all -> 0x00ab }
        p000.bli.m896d(r0, r1);	 Catch:{ all -> 0x00ab }
        r1 = r11.m8811a(r7);	 Catch:{ all -> 0x00ab }
        r0 = r11.m8815b(r2);	 Catch:{ all -> 0x00ab }
        r4 = p000.cpy.m8716a(r1);	 Catch:{ all -> 0x00ab }
        r11.f13185g = r4;	 Catch:{ all -> 0x00ab }
        r4 = p000.cpy.m8716a(r0);	 Catch:{ all -> 0x00ab }
        r11.f13186h = r4;	 Catch:{ all -> 0x00ab }
    L_0x007d:
        if (r1 == 0) goto L_0x0110;
    L_0x007f:
        if (r12 <= 0) goto L_0x00e1;
    L_0x0081:
        if (r1 == 0) goto L_0x009d;
    L_0x0083:
        if (r0 == 0) goto L_0x008d;
    L_0x0085:
        r4 = r11.f13185g;	 Catch:{ all -> 0x00ab }
        r8 = r11.f13186h;	 Catch:{ all -> 0x00ab }
        r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1));
        if (r3 < 0) goto L_0x009d;
    L_0x008d:
        r6.add(r1);	 Catch:{ all -> 0x00ab }
        r1 = r11.m8811a(r7);	 Catch:{ all -> 0x00ab }
        r4 = p000.cpy.m8716a(r1);	 Catch:{ all -> 0x00ab }
        r11.f13185g = r4;	 Catch:{ all -> 0x00ab }
    L_0x009a:
        r12 = r12 + -1;
        goto L_0x007d;
    L_0x009d:
        r6.add(r0);	 Catch:{ all -> 0x00ab }
        r0 = r11.m8815b(r2);	 Catch:{ all -> 0x00ab }
        r4 = p000.cpy.m8716a(r0);	 Catch:{ all -> 0x00ab }
        r11.f13186h = r4;	 Catch:{ all -> 0x00ab }
        goto L_0x009a;
    L_0x00ab:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ad }
    L_0x00ad:
        r1 = move-exception;
        if (r2 == 0) goto L_0x00b3;
    L_0x00b0:
        p000.crh.m8814a(r0, r2);	 Catch:{ all -> 0x00b4 }
    L_0x00b3:
        throw r1;	 Catch:{ all -> 0x00b4 }
    L_0x00b4:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b6 }
    L_0x00b6:
        r1 = move-exception;
        if (r7 == 0) goto L_0x00bc;
    L_0x00b9:
        p000.crh.m8814a(r0, r7);	 Catch:{ all -> 0x00bd }
    L_0x00bc:
        throw r1;	 Catch:{ all -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        r1 = f13179a;
        r2 = r11.f13185g;
        r4 = r11.f13186h;
        r6 = new java.lang.StringBuilder;
        r6.<init>(r10);
        r7 = "EndingQuery with time: ";
        r6.append(r7);
        r6.append(r2);
        r2 = " and ";
        r6.append(r2);
        r6.append(r4);
        r2 = r6.toString();
        p000.bli.m896d(r1, r2);
        throw r0;
    L_0x00e1:
        if (r2 == 0) goto L_0x00e7;
    L_0x00e3:
        r0 = 0;
        p000.crh.m8814a(r0, r2);	 Catch:{ all -> 0x00b4 }
    L_0x00e7:
        if (r7 == 0) goto L_0x00ed;
    L_0x00e9:
        r0 = 0;
        p000.crh.m8814a(r0, r7);	 Catch:{ all -> 0x00bd }
    L_0x00ed:
        r0 = f13179a;
        r2 = r11.f13185g;
        r4 = r11.f13186h;
        r1 = new java.lang.StringBuilder;
        r1.<init>(r10);
        r7 = "EndingQuery with time: ";
        r1.append(r7);
        r1.append(r2);
        r2 = " and ";
        r1.append(r2);
        r1.append(r4);
        r1 = r1.toString();
        p000.bli.m896d(r0, r1);
        return r6;
    L_0x0110:
        if (r0 == 0) goto L_0x00e1;
    L_0x0112:
        goto L_0x007f;
        */
        throw new UnsupportedOperationException("Method not decompiled: crh.a(int):java.util.List");
    }

    /* renamed from: a */
    private final err m8811a(Cursor cursor) {
        err a = crh.m8812a(cursor, this.f13181c);
        if (a == null) {
            return null;
        }
        if (!cow.m1438a(a)) {
            return a;
        }
        int a2;
        String a3 = crh.m8813a(a.mo6541g());
        List arrayList = new ArrayList();
        arrayList.add(new cot((cql) a));
        while (cursor.moveToNext()) {
            cql b = this.f13181c.mo5663a(cursor);
            if (!cow.m1438a(b) || !a3.equals(crh.m8813a(b.f13139e))) {
                cursor.moveToPrevious();
                break;
            }
            arrayList.add(new cot(b));
        }
        cow cow = this.f13184f;
        a = new cou(cow.f2736e, cow.f2734c, cow.f2733b, cow.f2735d, cov.m8616a(arrayList), cow.f2737f);
        eru eru = ((cot) ((cov) a.f13139e).mo12885c().get(0)).f13151c.f13139e;
        if (System.currentTimeMillis() - eru.f4382f.getTime() <= 60000) {
            a2 = new ckm(new File(eru.f4383g).getParentFile()).mo2351a() ^ 1;
        } else {
            a2 = 0;
        }
        if (a2 != 0) {
            bli.m888a(cow.f2732a, "Burst creation failed because saving is in progress");
            a = null;
        }
        if (a == null) {
            m8811a(cursor);
            return null;
        }
        a3 = f13179a;
        int d = a.mo14825d();
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("moveToNextPhotoItem() found burst of size: ");
        stringBuilder.append(d);
        bli.m896d(a3, stringBuilder.toString());
        return a;
    }

    /* renamed from: b */
    private final cqs m8815b(Cursor cursor) {
        return (cqs) crh.m8812a(cursor, this.f13182d);
    }
}
