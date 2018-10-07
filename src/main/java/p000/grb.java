package p000;

import com.google.android.apps.camera.stats.InstrumentationSession;

/* compiled from: PG */
/* renamed from: grb */
public final class grb extends InstrumentationSession {
    /* renamed from: c */
    private static grb f19491c;
    /* renamed from: a */
    public long f19492a;
    /* renamed from: b */
    public long f19493b;

    private grb(iya iya) {
        super(iya, "CameraApp");
    }

    /* renamed from: a */
    public static grb m11604a() {
        if (f19491c == null) {
            f19491c = new grb(new iya());
        }
        return f19491c;
    }
}
