package p000;

import java.io.Writer;

/* compiled from: PG */
/* renamed from: jsv */
public final class jsv implements jst {
    /* renamed from: a */
    private final jst f21712a;

    public jsv(jst jst, String str, Writer writer) {
        jri.m13404b((Object) jst);
        jri.m13404b((Object) str);
        jri.m13404b((Object) writer);
        this.f21712a = jst;
    }

    public final String toString() {
        return String.format("%s[metric=%s]", new Object[]{"LoggingFrameSegmentDistanceMetric", this.f21712a});
    }
}
