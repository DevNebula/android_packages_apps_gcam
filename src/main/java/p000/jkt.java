package p000;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkt */
public final class jkt extends jip {
    /* renamed from: d */
    private final File f24776d;
    /* renamed from: e */
    private final long f24777e;
    /* renamed from: f */
    private final long f24778f;

    public jkt(String str, int i, long j, File file, long j2, long j3) {
        super(str, i, j);
        jri.m13404b((Object) file);
        this.f24776d = file;
        this.f24777e = j2;
        this.f24778f = j3;
    }

    /* renamed from: a */
    public final /* synthetic */ jxn mo9467a(jrg jrg) {
        return new jwx(this.f21537a, "video/mp4", this.f21539c, jrg.f21668a, jrg.f21669b);
    }

    /* renamed from: a */
    public final Collection mo13807a() {
        return Arrays.asList(new Long[]{Long.valueOf(this.f21539c)});
    }

    /* JADX WARNING: Missing block: B:29:0x00b3, code:
            if (r2 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Missing block: B:31:?, code:
            r2.close();
     */
    /* renamed from: a */
    public final p000.jaq mo9466a(p000.jrg r13, p000.jxo r14, java.util.concurrent.Executor r15, p000.jqo r16) {
        /*
        r12 = this;
        p000.jri.m13404b(r13);
        p000.jri.m13404b(r14);
        p000.jri.m13404b(r15);
        r1 = new jwx;	 Catch:{ IOException -> 0x0081 }
        r2 = r12.f21537a;	 Catch:{ IOException -> 0x0081 }
        r3 = "video/mp4";
        r4 = r12.f21539c;	 Catch:{ IOException -> 0x0081 }
        r6 = r13.f21668a;	 Catch:{ IOException -> 0x0081 }
        r7 = r13.f21669b;	 Catch:{ IOException -> 0x0081 }
        r8 = r12.f24778f;	 Catch:{ IOException -> 0x0081 }
        r10 = r12.f24777e;	 Catch:{ IOException -> 0x0081 }
        r8 = r8 - r10;
        r10 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r8 = r8 / r10;
        r1.<init>(r2, r3, r4, r6, r7, r8);	 Catch:{ IOException -> 0x0081 }
        r0 = r1.f8439e;	 Catch:{ IOException -> 0x0081 }
        r2 = r1.f8438d;	 Catch:{ IOException -> 0x0081 }
        r3 = r0 * r2;
        r4 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x0081 }
        r0 = r14.mo9601a(r1);	 Catch:{ IOException -> 0x0081 }
        r4.<init>(r0, r3);	 Catch:{ IOException -> 0x0081 }
        r0 = "tempVideo";
        r2 = ".mp4";
        r5 = java.io.File.createTempFile(r0, r2);	 Catch:{ IOException -> 0x0081 }
        r0 = r12.f24776d;	 Catch:{ IOException -> 0x0081 }
        r2 = p000.jqk.m13352b();	 Catch:{ IOException -> 0x008a }
        if (r2 == 0) goto L_0x0073;
    L_0x0040:
        r0 = r0.getPath();	 Catch:{ IOException -> 0x008a }
        r2 = r5.getPath();	 Catch:{ IOException -> 0x008a }
        r0 = com.google.android.libraries.smartburst.filterpacks.video.Transcoders.newCPUTranscoder(r0, r2);	 Catch:{ IOException -> 0x008a }
        r2 = r0;
    L_0x004d:
        r6 = r12.f24777e;	 Catch:{ all -> 0x00b0 }
        r8 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r6 = r6 / r8;
        r8 = r12.f24778f;	 Catch:{ all -> 0x00b0 }
        r10 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r8 = r8 / r10;
        r2.transcode(r6, r8);	 Catch:{ all -> 0x00b0 }
        if (r2 == 0) goto L_0x005f;
    L_0x005c:
        r2.close();	 Catch:{ IOException -> 0x008a }
    L_0x005f:
        r0 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x0081 }
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x0081 }
        r2.<init>(r5);	 Catch:{ IOException -> 0x0081 }
        r0.<init>(r2, r3);	 Catch:{ IOException -> 0x0081 }
        r2 = new jku;	 Catch:{ IOException -> 0x0081 }
        r2.<init>(r0, r4, r1);	 Catch:{ IOException -> 0x0081 }
        r0 = p000.jli.m13190a(r15, r2);	 Catch:{ IOException -> 0x0081 }
        return r0;
    L_0x0073:
        r0 = r0.getPath();	 Catch:{ IOException -> 0x008a }
        r2 = r5.getPath();	 Catch:{ IOException -> 0x008a }
        r0 = com.google.android.libraries.smartburst.filterpacks.video.Transcoders.newGPUTranscoder(r0, r2);	 Catch:{ IOException -> 0x008a }
        r2 = r0;
        goto L_0x004d;
    L_0x0081:
        r0 = move-exception;
        r0 = new java.lang.RuntimeException;
        r1 = "Temporary variable frame rate video not found.";
        r0.<init>(r1);
        throw r0;
    L_0x008a:
        r0 = move-exception;
        r0 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x0081 }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x0081 }
        r2 = r2.length();	 Catch:{ IOException -> 0x0081 }
        r6 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0081 }
        r2 = r2 + 32;
        r6.<init>(r2);	 Catch:{ IOException -> 0x0081 }
        r2 = "Error transcoding file. Error = ";
        r6.append(r2);	 Catch:{ IOException -> 0x0081 }
        r6.append(r0);	 Catch:{ IOException -> 0x0081 }
        r0 = "VFRVideoArtifact";
        r2 = r6.toString();	 Catch:{ IOException -> 0x0081 }
        android.util.Log.e(r0, r2);	 Catch:{ IOException -> 0x0081 }
        goto L_0x005f;
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00b2 }
    L_0x00b2:
        r6 = move-exception;
        if (r2 == 0) goto L_0x00b8;
    L_0x00b5:
        r2.close();	 Catch:{ all -> 0x00b9 }
    L_0x00b8:
        throw r6;	 Catch:{ IOException -> 0x008a }
    L_0x00b9:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);	 Catch:{ IOException -> 0x008a }
        goto L_0x00b8;
        */
        throw new UnsupportedOperationException("Method not decompiled: jkt.a(jrg, jxo, java.util.concurrent.Executor, jqo):jaq");
    }

    /* renamed from: a */
    public final jaq mo9465a(jrg jrg, Context context, Executor executor, jqo jqo) {
        jri.m13404b((Object) jrg);
        jri.m13404b((Object) executor);
        return jrg.mo13829b(this.f21539c).mo9275a(executor, jkm.m13148b(jqo, context));
    }
}
