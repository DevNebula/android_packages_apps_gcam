package p000;

import android.os.SystemClock;

/* compiled from: PG */
/* renamed from: grj */
public final class grj implements glm {
    /* renamed from: f */
    private static final String f19513f = bli.m887a("CaptureTrace");
    /* renamed from: a */
    public long f19514a;
    /* renamed from: b */
    public long f19515b;
    /* renamed from: c */
    public long f19516c;
    /* renamed from: d */
    public long f19517d;
    /* renamed from: e */
    public klb[] f19518e;
    /* renamed from: g */
    private final irs f19519g;
    /* renamed from: h */
    private glw f19520h;
    /* renamed from: i */
    private long f19521i;
    /* renamed from: j */
    private long f19522j;
    /* renamed from: k */
    private long f19523k;
    /* renamed from: l */
    private long f19524l;
    /* renamed from: m */
    private boolean f19525m = false;
    /* renamed from: n */
    private boolean f19526n = false;

    public grj(irs irs, iya iya) {
        this.f19519g = irs;
    }

    public final void onCaptureCanceled(int i, int i2) {
        String str;
        String valueOf;
        String str2;
        if (!this.f19526n) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCaptureCanceled invoked before capture was started!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        } else if (this.f19525m) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCaptureCanceled invoked after final event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        } else {
            str = f19513f;
            valueOf = String.valueOf(toString());
            str2 = "onCaptureCanceled ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m888a(str, valueOf);
            this.f19525m = true;
            this.f19519g.mo8891a(this.f19521i, this.f19520h, i, i2);
        }
    }

    public final void onCaptureDeleted() {
        String str = f19513f;
        String valueOf = String.valueOf(toString());
        String str2 = "onCaptureDeleted ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m888a(str, valueOf);
        this.f19519g.mo8890a(this.f19521i, this.f19520h);
    }

    public final void onCaptureFailed(int i, int i2) {
        String str;
        String valueOf;
        String str2;
        if (!this.f19526n) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCaptureFailed invoked before capture was started!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        } else if (this.f19525m) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCaptureFailed invoked after final event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        } else {
            str = f19513f;
            valueOf = String.valueOf(toString());
            str2 = "onCaptureFailed ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m888a(str, valueOf);
            this.f19525m = true;
            this.f19519g.mo8909b(this.f19521i, this.f19520h, i, i2);
        }
    }

    public final void onCaptureFinalized() {
        String str;
        String valueOf;
        String str2;
        if (this.f19525m) {
            str = f19513f;
            valueOf = String.valueOf(toString());
            str2 = "onCaptureFinalized ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m888a(str, valueOf);
            return;
        }
        str = f19513f;
        valueOf = String.valueOf(ion.m4018b());
        str2 = "onCaptureFinalized invoked without the final result being set!";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m898e(str, valueOf);
    }

    public final void onCapturePersisted(int i, int i2) {
        String str;
        String valueOf;
        String str2;
        if (!this.f19526n) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCapturePersisted invoked before capture was started!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        } else if (this.f19525m) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCapturePersisted invoked after final event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        } else {
            str = f19513f;
            valueOf = String.valueOf(toString());
            str2 = "onCapturePersisted ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m888a(str, valueOf);
            this.f19525m = true;
            this.f19524l = SystemClock.elapsedRealtimeNanos();
            this.f19519g.mo8889a(this.f19521i, this.f19522j, this.f19523k, this.f19514a, this.f19515b, this.f19516c, this.f19517d, this.f19518e, this.f19524l, this.f19520h, i, i2);
        }
    }

    public final void onCaptureStartCommitted(int i, int i2) {
        String str;
        String valueOf;
        String str2;
        if (!this.f19526n) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCaptureStartCommitted invoked before capture was started!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        } else if (this.f19525m) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCaptureStartCommitted invoked after final event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
        } else {
            str = f19513f;
            valueOf = String.valueOf(toString());
            str2 = "onCaptureStartCommitted ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m888a(str, valueOf);
            this.f19519g.mo8913c(this.f19521i, this.f19520h, i, i2);
        }
    }

    public final void onCaptureStarted(glw glw) {
        String str;
        String valueOf;
        String str2;
        if (this.f19526n) {
            str = f19513f;
            valueOf = String.valueOf(ion.m4018b());
            str2 = "onCaptureStarted invoked after stated event was logged!";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m898e(str, valueOf);
            return;
        }
        str = f19513f;
        valueOf = String.valueOf(toString());
        str2 = "onCaptureStarted ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m888a(str, valueOf);
        this.f19526n = true;
        this.f19521i = SystemClock.elapsedRealtimeNanos();
        this.f19520h = glw;
        this.f19519g.mo8908b(this.f19521i, this.f19520h);
    }

    public final void onMediumThumb() {
        String str = f19513f;
        String valueOf = String.valueOf(toString());
        String str2 = "onMediumThumb ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m888a(str, valueOf);
        this.f19523k = SystemClock.elapsedRealtimeNanos();
    }

    public final void onTinyThumb() {
        String str = f19513f;
        String valueOf = String.valueOf(toString());
        String str2 = "onTinyThumb ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m888a(str, valueOf);
        this.f19522j = SystemClock.elapsedRealtimeNanos();
    }

    public final String toString() {
        return jqk.m13350b((Object) this).mo9702a("CaptureStartTimeNs", this.f19521i).mo9702a("TinyThumbTimeNs", this.f19522j).mo9702a("MediumThumbTimeNs", this.f19523k).mo9702a("CapturePersistedTimeNs", this.f19524l).mo9703a("SessionType", this.f19520h).toString();
    }
}
