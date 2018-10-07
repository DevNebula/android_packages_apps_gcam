package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: gmp */
public final class gmp {
    /* renamed from: c */
    private static final String f5692c = bli.m887a("PlaceholderMgr");
    /* renamed from: d */
    private static final agx f5693d = new agx();
    /* renamed from: a */
    public final Context f5694a;
    /* renamed from: b */
    public final gsp f5695b;

    public gmp(Context context, gsp gsp) {
        this.f5694a = context;
        this.f5695b = gsp;
    }

    /* renamed from: a */
    private final alt m2670a(Bitmap bitmap) {
        return new alt(new BitmapDrawable(this.f5694a.getResources(), bitmap), f5693d);
    }

    /* JADX WARNING: Missing block: B:21:0x008f, code:
            if (r1 != null) goto L_0x0091;
     */
    /* JADX WARNING: Missing block: B:23:?, code:
            r1.close();
     */
    /* JADX WARNING: Missing block: B:25:0x0095, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:26:0x0096, code:
            p000.kqg.m5105a(r0, r1);
     */
    @android.annotation.TargetApi(21)
    /* renamed from: a */
    final p000.gmq mo7229a(android.net.Uri r8) {
        /*
        r7 = this;
        r4 = 0;
        r3 = 0;
        r0 = r7.f5694a;
        r0 = r0.getContentResolver();
        r1 = 3;
        r2 = new java.lang.String[r1];
        r1 = "datetaken";
        r2[r4] = r1;
        r1 = 1;
        r4 = "_display_name";
        r2[r1] = r4;
        r1 = 2;
        r4 = "_data";
        r2[r1] = r4;
        r1 = r8;
        r4 = r3;
        r5 = r3;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x0086;
    L_0x0022:
        r0 = r1.getCount();	 Catch:{ all -> 0x008c }
        if (r0 == 0) goto L_0x0086;
    L_0x0028:
        r0 = "datetaken";
        r0 = r1.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x008c }
        r2 = "_display_name";
        r2 = r1.getColumnIndexOrThrow(r2);	 Catch:{ all -> 0x008c }
        r1.moveToFirst();	 Catch:{ all -> 0x008c }
        r4 = r1.getLong(r0);	 Catch:{ all -> 0x008c }
        r0 = r1.getString(r2);	 Catch:{ all -> 0x008c }
        if (r0 != 0) goto L_0x005b;
    L_0x0041:
        r0 = f5692c;	 Catch:{ all -> 0x008c }
        r2 = "Name is not available will use file path instead";
        p000.bli.m898e(r0, r2);	 Catch:{ all -> 0x008c }
        r0 = "_data";
        r0 = r1.getColumnIndexOrThrow(r0);	 Catch:{ all -> 0x008c }
        r0 = r1.getString(r0);	 Catch:{ all -> 0x008c }
        r2 = new java.io.File;	 Catch:{ all -> 0x008c }
        r2.<init>(r0);	 Catch:{ all -> 0x008c }
        r0 = r2.getName();	 Catch:{ all -> 0x008c }
    L_0x005b:
        r2 = r0.toLowerCase();	 Catch:{ all -> 0x008c }
        r3 = p000.ixx.JPEG;	 Catch:{ all -> 0x008c }
        r3 = r3.f7912j;	 Catch:{ all -> 0x008c }
        r2 = r2.endsWith(r3);	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x007b;
    L_0x0069:
        r2 = r0.length();	 Catch:{ all -> 0x008c }
        r3 = p000.ixx.JPEG;	 Catch:{ all -> 0x008c }
        r3 = r3.f7912j;	 Catch:{ all -> 0x008c }
        r3 = r3.length();	 Catch:{ all -> 0x008c }
        r6 = 0;
        r2 = r2 - r3;
        r0 = r0.substring(r6, r2);	 Catch:{ all -> 0x008c }
    L_0x007b:
        r3 = new gmq;	 Catch:{ all -> 0x008c }
        r3.<init>(r0, r8, r4);	 Catch:{ all -> 0x008c }
        if (r1 == 0) goto L_0x0085;
    L_0x0082:
        r1.close();
    L_0x0085:
        return r3;
    L_0x0086:
        if (r1 == 0) goto L_0x0085;
    L_0x0088:
        r1.close();
        goto L_0x0085;
    L_0x008c:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x008e }
    L_0x008e:
        r2 = move-exception;
        if (r1 == 0) goto L_0x0094;
    L_0x0091:
        r1.close();	 Catch:{ all -> 0x0095 }
    L_0x0094:
        throw r2;
    L_0x0095:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);
        goto L_0x0094;
        */
        throw new UnsupportedOperationException("Method not decompiled: gmp.a(android.net.Uri):gmq");
    }

    /* renamed from: a */
    public final kbg mo7233a(gmq gmq) {
        return this.f5695b.mo7412c(gmq.f5697b);
    }

    /* renamed from: a */
    public final gmq mo7231a(String str, iqp iqp, long j, Uri uri) {
        this.f5695b.mo7408a(iqp, j, uri);
        return new gmq(str, uri, j);
    }

    /* renamed from: a */
    public final gmq mo7230a(String str, anq anq, long j, Uri uri) {
        if (str == null || anq == null) {
            throw new IllegalArgumentException("Null argument passed to insertPlaceholder");
        }
        this.f5695b.mo7407a(anq, j, uri);
        return new gmq(str, uri, j);
    }

    /* renamed from: a */
    public final gmq mo7232a(String str, byte[] bArr, long j, Uri uri) {
        return mo7230a(str, m2670a(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, new Options())), j, uri);
    }

    /* renamed from: b */
    public final void mo7236b(gmq gmq) {
        if (gmq != null) {
            this.f5695b.mo7417h(gmq.f5697b);
        } else {
            bli.m896d(f5692c, "Ignoring request to remove placeholder, as placeholder is null.");
        }
    }

    /* renamed from: a */
    public final void mo7234a(gmq gmq, Bitmap bitmap) {
        mo7235a(gmq, m2670a(bitmap));
    }

    /* renamed from: a */
    public final void mo7235a(gmq gmq, anq anq) {
        jri.m13404b((Object) gmq);
        this.f5695b.mo7406a(gmq.f5697b, anq);
    }
}
