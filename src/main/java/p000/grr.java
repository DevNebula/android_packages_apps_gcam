package p000;

import android.os.SystemClock;
import com.google.android.apps.camera.stats.InstrumentationSession;
import com.google.android.apps.common.proguard.UsedByReflection;

/* compiled from: PG */
/* renamed from: grr */
public final class grr extends InstrumentationSession {
    /* renamed from: a */
    public long f19529a;
    /* renamed from: b */
    private long f19530b;

    grr(iya iya) {
        super(iya, "MedRecInstrSes");
    }

    @UsedByReflection
    public final long getMediaRecorderPrepareEndNs() {
        return this.f19530b;
    }

    @UsedByReflection
    public final long getMediaRecorderPrepareStartNs() {
        return this.f19529a;
    }

    /* renamed from: a */
    public static kwk m11630a() {
        return new grs();
    }

    /* renamed from: b */
    public final void mo13461b() {
        this.f19530b = SystemClock.elapsedRealtimeNanos();
        mo2697a("MediaRecorder Prepare End", this.f19530b);
    }
}
