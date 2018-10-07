package p000;

import com.google.android.libraries.smartburst.pipeline.Pipeline;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jsb */
public class jsb implements Pipeline {
    /* renamed from: a */
    public final jrg f21696a;
    /* renamed from: b */
    public final jso f21697b;
    /* renamed from: c */
    public final jir[] f21698c;
    /* renamed from: d */
    public final jbj f21699d = jbj.m13001d();
    /* renamed from: e */
    private final jll f21700e;
    /* renamed from: f */
    private final jbj f21701f = jbj.m13001d();
    /* renamed from: g */
    private final jaq f21702g;

    public jsb(jrg jrg, jso jso, jll jll, jir... jirArr) {
        jri.m13404b((Object) jrg);
        jri.m13404b((Object) jll);
        jri.m13404b((Object) jso);
        jri.m13404b((Object) jirArr);
        this.f21696a = jrg;
        this.f21700e = jll;
        this.f21697b = jso;
        this.f21698c = jirArr;
        this.f21702g = this.f21701f.mo9275a((Executor) jll, new jse(this)).mo9275a((Executor) jll, new jsc(this)).mo9275a((Executor) jll, new jsf(this)).mo9277a((Executor) jll, new jbc(new jsg())).mo9275a((Executor) jll, new jsd());
        this.f21699d.mo9282a(izw.f21401a);
    }

    public synchronized jaq process() {
        this.f21701f.mo13778a(izg.f7956a);
        return this.f21702g;
    }

    public void resume() {
        this.f21700e.mo9514a();
    }

    public void stop() {
    }

    public void suspend() {
        this.f21700e.mo9515b();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f21696a);
        String valueOf2 = String.valueOf(this.f21697b);
        String valueOf3 = String.valueOf(this.f21700e);
        String arrays = Arrays.toString(this.f21698c);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 93) + length2) + String.valueOf(valueOf3).length()) + String.valueOf(arrays).length());
        stringBuilder.append("ArtifactGenerationPipeline[mediaFileStore=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", artifactFilter=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", renderExecutor=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", artifactSpecs=");
        stringBuilder.append(arrays);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
