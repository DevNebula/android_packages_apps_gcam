package p000;

import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jfg */
final class jfg implements Callable {
    /* renamed from: a */
    private final /* synthetic */ int f8120a;
    /* renamed from: b */
    private final /* synthetic */ String f8121b;

    jfg(int i, String str) {
        this.f8120a = i;
        this.f8121b = str;
    }

    /* JADX WARNING: Missing block: B:11:?, code:
            r1.close();
     */
    /* JADX WARNING: Missing block: B:17:0x004a, code:
            r1 = move-exception;
     */
    /* JADX WARNING: Missing block: B:18:0x004b, code:
            p000.kqg.m5105a(r0, r1);
     */
    /* renamed from: a */
    private final p000.jfd m4504a() {
        /*
        r6 = this;
        r0 = r6.f8120a;
        r1 = r6.f8121b;
        r2 = new jfd;
        r0 = android.opengl.GLES20.glCreateShader(r0);
        r2.<init>(r0, r1);
        r1 = p000.jcc.m4458a(r2);
        r0 = r1.mo15044c();	 Catch:{ all -> 0x0039 }
        r0 = (p000.jfd) r0;	 Catch:{ all -> 0x0039 }
        r2 = r0.f26563e;	 Catch:{ all -> 0x0039 }
        android.opengl.GLES20.glCompileShader(r2);	 Catch:{ all -> 0x0039 }
        r2 = 1;
        r2 = new int[r2];	 Catch:{ all -> 0x0039 }
        r3 = r0.f26563e;	 Catch:{ all -> 0x0039 }
        r4 = 35713; // 0x8b81 float:5.0045E-41 double:1.76446E-319;
        r5 = 0;
        android.opengl.GLES20.glGetShaderiv(r3, r4, r2, r5);	 Catch:{ all -> 0x0039 }
        r3 = 0;
        r2 = r2[r3];	 Catch:{ all -> 0x0039 }
        if (r2 != 0) goto L_0x0040;
    L_0x002d:
        r0 = r0.f26563e;	 Catch:{ all -> 0x0039 }
        r0 = android.opengl.GLES20.glGetShaderInfoLog(r0);	 Catch:{ all -> 0x0039 }
        r2 = new dzs;	 Catch:{ all -> 0x0039 }
        r2.<init>(r0);	 Catch:{ all -> 0x0039 }
        throw r2;	 Catch:{ all -> 0x0039 }
    L_0x0039:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003b }
    L_0x003b:
        r2 = move-exception;
        r1.close();	 Catch:{ all -> 0x004a }
    L_0x003f:
        throw r2;
    L_0x0040:
        r0 = r1.mo15043b();	 Catch:{ all -> 0x0039 }
        r0 = (p000.jfd) r0;	 Catch:{ all -> 0x0039 }
        r1.close();
        return r0;
    L_0x004a:
        r1 = move-exception;
        p000.kqg.m5105a(r0, r1);
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: jfg.a():jfd");
    }
}
