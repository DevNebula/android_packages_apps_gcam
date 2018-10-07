package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.grp;
import p000.iya;
import p000.jri;

@UsedByReflection
/* compiled from: PG */
public class InstrumentationSession {
    /* renamed from: a */
    private static final String f2595a = bli.m887a("Instrumentation");
    /* renamed from: b */
    private final String f2596b;
    /* renamed from: k */
    public final long f2597k = SystemClock.elapsedRealtimeNanos();
    /* renamed from: l */
    public grp f2598l;
    /* renamed from: m */
    public final iya f2599m;

    public InstrumentationSession(iya iya, String str) {
        jri.m13404b((Object) iya);
        jri.m13404b((Object) str);
        this.f2599m = iya;
        this.f2596b = str;
    }

    /* renamed from: l */
    public final void mo2700l() {
        grp grp = this.f2598l;
        if (grp != null) {
            grp.handleClose(this);
            this.f2598l = null;
        }
    }

    /* renamed from: a */
    public final void mo2697a(String str, long j) {
        String str2 = f2595a;
        String str3 = this.f2596b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str3).length() + 27) + String.valueOf(str).length());
        stringBuilder.append(str3);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        stringBuilder.append(": @");
        stringBuilder.append(j / 1000000);
        stringBuilder.append("ms");
        bli.m888a(str2, stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo2698a(String str, long j, long j2) {
        if (j != 0 && j2 != 0) {
            String str2 = f2595a;
            String str3 = this.f2596b;
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(str3).length() + 35) + String.valueOf(str).length());
            stringBuilder.append(str3);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            stringBuilder.append(" duration: ");
            stringBuilder.append((j2 - j) / 1000000);
            stringBuilder.append("ms");
            bli.m894c(str2, stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final void mo2699a(String str, long j, String str2, long j2) {
        if (j != 0 && j2 != 0) {
            String str3 = f2595a;
            String str4 = this.f2596b;
            int length = String.valueOf(str4).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 30) + String.valueOf(str).length()) + String.valueOf(str2).length());
            stringBuilder.append(str4);
            stringBuilder.append(": ");
            stringBuilder.append(str);
            stringBuilder.append(" to ");
            stringBuilder.append(str2);
            stringBuilder.append(": ");
            stringBuilder.append((j2 - j) / 1000000);
            stringBuilder.append("ms");
            bli.m894c(str3, stringBuilder.toString());
        }
    }
}
