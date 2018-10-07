package p000;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jkv */
public final class jkv extends jjq {
    /* renamed from: c */
    private final File f24779c;
    /* renamed from: d */
    private final jtv f24780d;

    public jkv(Context context, jtv jtv) {
        this(new File(context.getCacheDir().getPath(), jxr.m4741c()), jtv);
    }

    private jkv(File file, jtv jtv) {
        this("Video_VFR", file, jtv);
    }

    private jkv(String str, File file, jtv jtv) {
        super(str, -1);
        this.f24779c = file;
        this.f24780d = jtv;
    }

    /* renamed from: a */
    public final jaq mo9461a(juh juh, Executor executor) {
        boolean z;
        jri.m13404b((Object) juh);
        jri.m13404b((Object) executor);
        if (juh.mo9565d() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        return jli.m13199b(new jkt(this.f21555a, this.f21556b, juh.mo9561a(), this.f24779c, (long) (this.f24780d.mo9554a(juh.mo9561a()).mo9629a() * 1000000.0f), (long) (this.f24780d.mo9554a(juh.mo9564c()).mo9629a() * 1000000.0f)));
    }
}
