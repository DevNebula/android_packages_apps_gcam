package p000;

import android.app.ActivityManager;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* renamed from: dyz */
public final class dyz implements kwk {
    /* renamed from: a */
    private final kwk f17003a;
    /* renamed from: b */
    private final kwk f17004b;
    /* renamed from: c */
    private final kwk f17005c;
    /* renamed from: d */
    private final kwk f17006d;
    /* renamed from: e */
    private final kwk f17007e;

    private dyz(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f17003a = kwk;
        this.f17004b = kwk2;
        this.f17005c = kwk3;
        this.f17006d = kwk4;
        this.f17007e = kwk5;
    }

    /* renamed from: a */
    public static dyz m9724a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        return new dyz(kwk, kwk2, kwk3, kwk4, kwk5);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17003a;
        kwk kwk2 = this.f17004b;
        kwk kwk3 = this.f17005c;
        kwk kwk4 = this.f17006d;
        kwk kwk5 = this.f17007e;
        kwk.mo10566a();
        epc epc = (epc) kwk2.mo10566a();
        eio eio = (eio) kwk3.mo10566a();
        PackageInfo packageInfo = (PackageInfo) kwk5.mo10566a();
        return (irs) ktm.m14219a(new grx(ept.m2032a(), new iya(), new Random().nextInt(), TimeZone.getDefault().getID(), Build.DISPLAY, Executors.newSingleThreadScheduledExecutor(iel.m3778c("UsageStatEx", 10)), (bku) kwk4.mo10566a(), ActivityManager.isRunningInTestHarness(), epc, eio, packageInfo.versionName), "Cannot return null from a non-@Nullable @Provides method");
    }
}
