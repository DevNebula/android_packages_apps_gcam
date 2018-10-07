package p000;

import android.os.Environment;

/* compiled from: PG */
/* renamed from: guh */
final class guh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ kpw f6065a;
    /* renamed from: b */
    private final /* synthetic */ boolean f6066b;
    /* renamed from: c */
    private final /* synthetic */ gug f6067c;

    guh(gug gug, kpw kpw, boolean z) {
        this.f6067c = gug;
        this.f6065a = kpw;
        this.f6066b = z;
    }

    public final void run() {
        long j = -1;
        bli.m888a(gug.f19616a, "start calculating the available storage space");
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted".equals(externalStorageState)) {
            String valueOf;
            StringBuilder stringBuilder;
            if (!this.f6067c.f19619d.mo7425a().exists()) {
                externalStorageState = gug.f19616a;
                valueOf = String.valueOf(this.f6067c.f19619d.mo7425a());
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 25);
                stringBuilder.append("create the media folder: ");
                stringBuilder.append(valueOf);
                bli.m888a(externalStorageState, stringBuilder.toString());
                if (!(this.f6067c.f19619d.mo7425a().mkdirs() || this.f6067c.f19619d.mo7425a().exists())) {
                    externalStorageState = gug.f19616a;
                    valueOf = String.valueOf(this.f6067c.f19619d.mo7425a());
                    stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 35);
                    stringBuilder.append("failed to create the media folder: ");
                    stringBuilder.append(valueOf);
                    bli.m898e(externalStorageState, stringBuilder.toString());
                    this.f6065a.mo15641a(Long.valueOf(-1));
                    return;
                }
            }
            if (!this.f6067c.f19619d.mo7425a().isDirectory()) {
                externalStorageState = gug.f19616a;
                valueOf = String.valueOf(this.f6067c.f19619d.mo7425a());
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("the media folder is not a folder: ");
                stringBuilder.append(valueOf);
                bli.m898e(externalStorageState, stringBuilder.toString());
                this.f6065a.mo15641a(Long.valueOf(-1));
                return;
            } else if (this.f6067c.f19619d.mo7425a().canWrite()) {
                long j2;
                gug gug = this.f6067c;
                long a = gug.f19620e.mo7455a(gug.f19619d);
                if (this.f6066b) {
                    j2 = this.f6067c.f19618c;
                } else {
                    j2 = this.f6067c.f19617b;
                }
                if (a > j2) {
                    j = a - j2;
                }
                this.f6065a.mo15641a(Long.valueOf(j));
                return;
            } else {
                externalStorageState = gug.f19616a;
                valueOf = String.valueOf(this.f6067c.f19619d.mo7425a());
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("the media folder is not writable: ");
                stringBuilder.append(valueOf);
                bli.m898e(externalStorageState, stringBuilder.toString());
                this.f6065a.mo15641a(Long.valueOf(-1));
                return;
            }
        }
        this.f6065a.mo15641a(Long.valueOf(-1));
        String str = gug.f19616a;
        String valueOf2 = String.valueOf(externalStorageState);
        externalStorageState = "the current state of the primary shared/external storage media: ";
        if (valueOf2.length() == 0) {
            valueOf2 = new String(externalStorageState);
        } else {
            valueOf2 = externalStorageState.concat(valueOf2);
        }
        bli.m898e(str, valueOf2);
    }
}
