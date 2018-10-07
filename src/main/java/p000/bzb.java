package p000;

import com.google.googlex.gcam.AeResults;
import com.google.googlex.gcam.BackgroundAeResultsCallback;

/* compiled from: PG */
/* renamed from: bzb */
final class bzb extends BackgroundAeResultsCallback {
    /* renamed from: a */
    private final /* synthetic */ byy f12031a;

    bzb(byy byy) {
        this.f12031a = byy;
    }

    public final void Run(AeResults aeResults) {
        if (aeResults != null && aeResults.getValid()) {
            this.f12031a.f1753f.mo8826a(new AeResults(aeResults));
        } else if (aeResults == null) {
            bli.m898e(byy.f1748a, "AeResults from HdrPlusSession is null!");
        } else {
            bli.m888a(byy.f1748a, "AeResults from HdrPlusSession is invalid.");
        }
    }
}
