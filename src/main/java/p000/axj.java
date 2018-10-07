package p000;

import android.app.ApplicationErrorReport.CrashInfo;

/* compiled from: PG */
/* renamed from: axj */
final class axj implements kov {
    /* renamed from: a */
    private final /* synthetic */ int f11002a;
    /* renamed from: b */
    private final /* synthetic */ Exception f11003b;
    /* renamed from: c */
    private final /* synthetic */ axi f11004c;

    axj(axi axi, int i, Exception exception) {
        this.f11004c = axi;
        this.f11002a = i;
        this.f11003b = exception;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m888a(axi.f1029a, "Google API client connection suspended");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        hjk hjk = (hjk) obj;
        axi axi = this.f11004c;
        int i = this.f11002a;
        CrashInfo crashInfo = new CrashInfo(this.f11003b);
        hxv hxv = new hxv();
        hxv.f20832e = axi.f1033e;
        hxv = hxv.mo13596a(crashInfo.exceptionClassName).mo13598c(crashInfo.throwClassName).mo13599d(crashInfo.throwFileName).mo13600e(crashInfo.throwMethodName).mo13597b(crashInfo.stackTrace);
        hxv.f20831d.crashInfo.exceptionMessage = crashInfo.exceptionMessage;
        hxu a = hxv.mo13595a(crashInfo.throwLineNumber);
        String valueOf = String.valueOf(axi.f1033e);
        String valueOf2 = String.valueOf(".CAMERA_ACCESS");
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        a.f7162b = valueOf2;
        a.f7161a = axi.f1034f.getString(i);
        hxp.m3634b(hjk.f6637a.f20167a, a.mo8253a()).mo8151a(new axk(hjk));
    }
}
