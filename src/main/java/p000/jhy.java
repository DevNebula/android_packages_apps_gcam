package p000;

import android.content.pm.IPackageStatsObserver;
import com.google.android.libraries.performance.primes.metriccapture.PackageStatsCapture.PackageStatsInvocation;

/* compiled from: PG */
/* renamed from: jhy */
public final class jhy extends PackageStatsInvocation {
    public jhy(String str, Class[] clsArr) {
        super(str, clsArr);
    }

    /* renamed from: a */
    final Object[] mo2816a(String str, int i, IPackageStatsObserver iPackageStatsObserver) {
        return new Object[]{str, Integer.valueOf(i), iPackageStatsObserver};
    }
}
