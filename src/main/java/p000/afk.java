package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: afk */
public final class afk {
    /* renamed from: a */
    public final aoo f405a;
    /* renamed from: b */
    private final Class f406b;
    /* renamed from: c */
    private final List f407c;
    /* renamed from: d */
    private final C0300iw f408d;
    /* renamed from: e */
    private final String f409e;

    public afk(Class cls, Class cls2, Class cls3, List list, aoo aoo, C0300iw c0300iw) {
        this.f406b = cls;
        this.f407c = list;
        this.f405a = aoo;
        this.f408d = c0300iw;
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 23) + String.valueOf(simpleName2).length()) + String.valueOf(simpleName3).length());
        stringBuilder.append("Failed DecodePath{");
        stringBuilder.append(simpleName);
        stringBuilder.append("->");
        stringBuilder.append(simpleName2);
        stringBuilder.append("->");
        stringBuilder.append(simpleName3);
        stringBuilder.append("}");
        this.f409e = stringBuilder.toString();
    }

    /* renamed from: a */
    final agn mo233a(ady ady, int i, int i2, adp adp) {
        List list = (List) aqe.m610a((List) this.f408d.mo9113a(), "Argument must not be null");
        try {
            agn a = m220a(ady, i, i2, adp, list);
            return a;
        } finally {
            this.f408d.mo9114a(list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A:{LOOP_END, LOOP:0: B:1:0x0009->B:11:0x0036} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0027 A:{SYNTHETIC, EDGE_INSN: B:22:0x0027->B:8:0x0027 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0027 A:{SYNTHETIC, EDGE_INSN: B:22:0x0027->B:8:0x0027 ?: BREAK  } */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A:{LOOP_END, LOOP:0: B:1:0x0009->B:11:0x0036} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036 A:{LOOP_END, LOOP:0: B:1:0x0009->B:11:0x0036} */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0027 A:{SYNTHETIC, EDGE_INSN: B:22:0x0027->B:8:0x0027 ?: BREAK  } */
    /* renamed from: a */
    private final p000.agn m220a(p000.ady r8, int r9, int r10, p000.adp r11, java.util.List r12) {
        /*
        r7 = this;
        r0 = r7.f407c;
        r4 = r0.size();
        r2 = 0;
        r0 = 0;
        r3 = r0;
    L_0x0009:
        if (r3 >= r4) goto L_0x003d;
    L_0x000b:
        r0 = r7.f407c;
        r0 = r0.get(r3);
        r0 = (p000.adq) r0;
        r1 = r8.mo194b();	 Catch:{ IOException -> 0x0075, RuntimeException -> 0x003f, OutOfMemoryError -> 0x0073 }
        r1 = r0.mo180a(r1, r11);	 Catch:{ IOException -> 0x0075, RuntimeException -> 0x003f, OutOfMemoryError -> 0x0073 }
        if (r1 == 0) goto L_0x003b;
    L_0x001d:
        r1 = r8.mo194b();	 Catch:{ IOException -> 0x0075, RuntimeException -> 0x003f, OutOfMemoryError -> 0x0073 }
        r0 = r0.mo179a(r1, r9, r10, r11);	 Catch:{ IOException -> 0x0075, RuntimeException -> 0x003f, OutOfMemoryError -> 0x0073 }
    L_0x0025:
        if (r0 == 0) goto L_0x0036;
    L_0x0027:
        if (r0 != 0) goto L_0x0072;
    L_0x0029:
        r0 = new agg;
        r1 = r7.f409e;
        r2 = new java.util.ArrayList;
        r2.<init>(r12);
        r0.<init>(r1, r2);
        throw r0;
    L_0x0036:
        r1 = r3 + 1;
        r3 = r1;
        r2 = r0;
        goto L_0x0009;
    L_0x003b:
        r0 = r2;
        goto L_0x0025;
    L_0x003d:
        r0 = r2;
        goto L_0x0027;
    L_0x003f:
        r1 = move-exception;
    L_0x0040:
        r5 = "DecodePath";
        r6 = 2;
        r5 = android.util.Log.isLoggable(r5, r6);
        if (r5 == 0) goto L_0x006d;
    L_0x0049:
        r0 = java.lang.String.valueOf(r0);
        r5 = java.lang.String.valueOf(r0);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r5 = r5 + 26;
        r6.<init>(r5);
        r5 = "Failed to decode data for ";
        r6.append(r5);
        r6.append(r0);
        r0 = "DecodePath";
        r5 = r6.toString();
        android.util.Log.v(r0, r5, r1);
    L_0x006d:
        r12.add(r1);
        r0 = r2;
        goto L_0x0025;
    L_0x0072:
        return r0;
    L_0x0073:
        r1 = move-exception;
        goto L_0x0040;
    L_0x0075:
        r1 = move-exception;
        goto L_0x0040;
        */
        throw new UnsupportedOperationException("Method not decompiled: afk.a(ady, int, int, adp, java.util.List):agn");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f406b);
        String valueOf2 = String.valueOf(this.f407c);
        String valueOf3 = String.valueOf(this.f405a);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 47) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("DecodePath{ dataClass=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", decoders=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", transcoder=");
        stringBuilder.append(valueOf3);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
