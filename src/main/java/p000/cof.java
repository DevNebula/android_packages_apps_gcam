package p000;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: cof */
public final class cof implements geu {
    /* renamed from: b */
    private static final String f12750b = bli.m887a("GenSingleAfctTask");
    /* renamed from: a */
    public final AtomicReference f12751a = new AtomicReference();
    /* renamed from: c */
    private final gln f12752c;
    /* renamed from: d */
    private final File f12753d;
    /* renamed from: e */
    private final jyt f12754e;
    /* renamed from: f */
    private final jqo f12755f;
    /* renamed from: g */
    private final Executor f12756g;
    /* renamed from: h */
    private final jip f12757h;
    /* renamed from: i */
    private final gsp f12758i;
    /* renamed from: j */
    private final jbj f12759j;
    /* renamed from: k */
    private final irs f12760k;
    /* renamed from: l */
    private final glj f12761l;
    /* renamed from: m */
    private volatile gkr f12762m;

    public cof(gln gln, File file, jip jip, jyt jyt, jqo jqo, Executor executor, gsp gsp, jbj jbj, irs irs, glj glj) {
        this.f12752c = gln;
        this.f12753d = file;
        this.f12757h = jip;
        this.f12754e = jyt;
        this.f12755f = jqo;
        this.f12756g = executor;
        this.f12758i = gsp;
        this.f12759j = jbj;
        this.f12760k = irs;
        this.f12761l = glj;
    }

    public final void addFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final get getSession() {
        return this.f12762m;
    }

    public final void process(Context context) {
        StringBuilder stringBuilder;
        try {
            Object a;
            jxy a2 = jxr.m4738a(jli.m13194a(this.f12753d));
            jrg a3;
            if (jiu.m4572c(this.f12757h.f21537a)) {
                File[] f = a2.mo9614f(this.f12753d);
                if (f == null) {
                    f = new File[0];
                }
                File a4 = coc.m1239a(this.f12753d);
                jxy b = jxr.m4740b();
                File[] f2 = b.mo9614f(a4);
                if (f2 == null) {
                    f2 = new File[0];
                }
                if (f2.length > f.length) {
                    a3 = jqk.m13339a(a4, b).mo9536a();
                } else {
                    a3 = jqk.m13339a(this.f12753d, a2).mo9536a();
                }
            } else {
                a3 = jqk.m13339a(this.f12753d, a2).mo9536a();
            }
            if (a3.mo13836f() == 0) {
                throw new RuntimeException("Loaded summary does not contain images.");
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f12762m = this.f12761l.mo7187a(coc.m1240a(this.f12757h, currentTimeMillis), currentTimeMillis, kau.f21835a);
            this.f12759j.mo13778a(this.f12762m);
            jwx jwx = (jwx) this.f12757h.mo9467a(a3);
            glw glw = glw.RENDER_PHOTO;
            if (jiu.m4573d(this.f12757h.f21537a)) {
                glw = glw.RENDER_VIDEO;
            }
            this.f12752c.mo7199a(this.f12762m);
            this.f12762m.mo13371a(new iqp(jwx.f8439e, jwx.f8438d), glw);
            File file = this.f12753d;
            if (r4 != 0) {
                kbg a5;
                UUID uuid;
                for (File file2 : jxr.m4737a().mo9614f(file2)) {
                    a5 = eio.m1803a(file2);
                    if (a5.mo9709b()) {
                        break;
                    }
                }
                a5 = kau.f21835a;
                if (a5.mo9709b()) {
                    uuid = (UUID) a5.mo9706a();
                } else {
                    uuid = UUID.randomUUID();
                }
                Object jwy = new jwy();
                jxo bdc = new bdc(jwy, uuid);
                jaq a6 = cnz.m1236a(this.f12757h, this.f12753d, this.f12756g);
                a6.mo9275a(this.f12756g, new cog(this)).mo9282a(izw.f21401a);
                jli.m13202c(jli.m13187a(this.f12757h.mo9466a((jrg) a3, bdc, this.f12756g, this.f12755f), a6).mo9277a(this.f12756g, new jkm(this.f12762m, jwy.f21792a)).mo9275a(this.f12756g, new grq(context.getContentResolver(), true, jiy.m4574a(this.f12757h.f21537a), this.f12753d.getName(), this.f12758i, this.f12760k)));
                jli.m13199b(a3).mo9275a(this.f12756g, ion.m4002a()).mo9282a(izw.f21401a);
                jyt jyt = this.f12754e;
                if (jyt != null) {
                    try {
                        jyt.mo9617a();
                        return;
                    } catch (Throwable e) {
                        bli.m892b(f12750b, "Could not write logs", e);
                        return;
                    }
                }
                return;
            }
            String valueOf = String.valueOf(file2);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("No summary files in ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" to read UUID from");
            throw new RuntimeException(stringBuilder.toString());
        } catch (IOException e2) {
            String valueOf2 = String.valueOf(this.f12753d);
            stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 29);
            stringBuilder.append("Failed to load metadata from ");
            stringBuilder.append(valueOf2);
            throw new RuntimeException(stringBuilder.toString());
        }
    }

    public final void removeFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final void resume() {
    }

    public final void suspend() {
    }
}
