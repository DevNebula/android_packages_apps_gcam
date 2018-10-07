package com.google.android.apps.camera.stats;

import android.os.SystemClock;
import com.google.android.apps.common.proguard.UsedByReflection;
import p000.bli;
import p000.gqz;
import p000.iya;
import p000.kwk;

@UsedByReflection
/* compiled from: PG */
public class BurstSessionStatistics extends InstrumentationSession {
    /* renamed from: a */
    public static final String f12839a = bli.m887a("BurstSessionStats");
    /* renamed from: b */
    private long f12840b = 0;
    /* renamed from: c */
    private long f12841c = 0;
    /* renamed from: d */
    private long f12842d;
    /* renamed from: e */
    private long f12843e;
    /* renamed from: f */
    private long f12844f;
    /* renamed from: g */
    private long f12845g;
    /* renamed from: h */
    private int f12846h;
    /* renamed from: i */
    private int f12847i;
    /* renamed from: j */
    private int f12848j;
    /* renamed from: n */
    private int f12849n;

    public BurstSessionStatistics(iya iya, String str) {
        super(iya, str);
    }

    @UsedByReflection
    public synchronized int getAcquiredFrameCount() {
        return this.f12846h;
    }

    @UsedByReflection
    public synchronized float getBurstAcquisitionFrameRate() {
        return ((float) this.f12846h) / getBurstDurationS();
    }

    @UsedByReflection
    public synchronized float getBurstDurationS() {
        return ((float) (this.f12841c - this.f12840b)) / 1.0E9f;
    }

    @UsedByReflection
    public synchronized long getBurstEndNs() {
        return this.f12841c;
    }

    @UsedByReflection
    public synchronized long getBurstFilesSavedNs() {
        return this.f12845g;
    }

    @UsedByReflection
    public synchronized long getBurstPreviewAvailableNs() {
        return this.f12844f;
    }

    @UsedByReflection
    public synchronized int getBurstSavedFrameCount() {
        return this.f12847i;
    }

    @UsedByReflection
    public synchronized float getBurstSavingFrameRate() {
        return ((float) this.f12847i) / getBurstDurationS();
    }

    @UsedByReflection
    public synchronized float getBurstScoringFrameRate() {
        return ((float) this.f12848j) / getBurstDurationS();
    }

    @UsedByReflection
    public synchronized long getBurstSoundStartNs() {
        return this.f12842d;
    }

    @UsedByReflection
    public synchronized long getBurstStartNs() {
        return this.f12840b;
    }

    @UsedByReflection
    public synchronized int getSaveErrorCount() {
        return this.f12849n;
    }

    @UsedByReflection
    public synchronized int getScoredFrameCount() {
        return this.f12848j;
    }

    /* renamed from: a */
    public static kwk m8523a() {
        return new gqz();
    }

    /* renamed from: b */
    public final synchronized void mo12587b() {
        if (this.f12845g == 0) {
            this.f12845g = SystemClock.elapsedRealtimeNanos();
            mo2697a("Burst all files saved", this.f12845g);
        }
    }

    /* renamed from: c */
    public final synchronized void mo12588c() {
        if (this.f12841c == 0 && this.f12840b != 0) {
            this.f12841c = SystemClock.elapsedRealtimeNanos();
            mo2697a("Burst ended", this.f12841c);
        }
    }

    /* renamed from: d */
    public final synchronized void mo12589d() {
        this.f12846h++;
    }

    /* renamed from: e */
    public final synchronized void mo12590e() {
        this.f12849n++;
    }

    /* renamed from: f */
    public final synchronized void mo12591f() {
        this.f12847i++;
    }

    /* renamed from: g */
    public final synchronized void mo12592g() {
        this.f12848j++;
    }

    /* renamed from: h */
    public final synchronized void mo12606h() {
        if (this.f12844f == 0) {
            this.f12844f = SystemClock.elapsedRealtimeNanos();
            mo2697a("Burst previews generated", this.f12844f);
        }
    }

    /* renamed from: i */
    public final synchronized void mo12607i() {
        if (this.f12842d == 0) {
            this.f12842d = SystemClock.elapsedRealtimeNanos();
            mo2697a("Burst sound indicator started", this.f12842d);
        }
    }

    /* renamed from: j */
    public final synchronized void mo12608j() {
        if (this.f12843e == 0) {
            this.f12843e = SystemClock.elapsedRealtimeNanos();
            mo2697a("Burst sound indicator stopped", this.f12843e);
        }
    }

    /* renamed from: k */
    public final synchronized void mo12609k() {
        if (this.f12840b == 0) {
            this.f12840b = SystemClock.elapsedRealtimeNanos();
            this.f12846h = 0;
            this.f12847i = 0;
            this.f12849n = 0;
            mo2697a("Burst started", this.f12840b);
        }
    }
}
