package p000;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: jgb */
public final class jgb implements jgg {
    /* renamed from: a */
    public final jfw f21462a;
    /* renamed from: b */
    public final kpk f21463b;

    jgb(MediaFormat mediaFormat, jhf jhf, jgk jgk, Handler handler) {
        jfu jfu = new jfu(mediaFormat);
        jfu.f8144b = handler;
        this.f21462a = new jfw(MediaCodec.createEncoderByType(jfu.f8143a.getString("mime")), jfu.f8143a, null, false, jfu.f8144b);
        jfw jfw = this.f21462a;
        if (jfw.f8156j.get()) {
            throw new IllegalStateException("Not allowed to update the listener after start.");
        }
        jfw.f8158l = jgk;
        jhm jhp = new jhp(jhf);
        jfw jfw2 = this.f21462a;
        if (jfw2.f8156j.get()) {
            throw new IllegalStateException("Not allowed to update the frame processor after start.");
        }
        jfw2.f8157k = jhp;
        this.f21463b = jhp.mo9434a();
    }

    /* renamed from: a */
    public final kpk mo9402a() {
        jfw jfw = this.f21462a;
        if (!jfw.f8154h.getAndSet(true)) {
            switch (jfw.f8148b.get()) {
                case 1:
                    if (jfw.f8150d == null) {
                        int a = jfw.mo9390a();
                        if (a < 0 && jfw.f8148b.get() == 1) {
                            jfw.f8153g.set(true);
                            break;
                        }
                        jfw.mo9391a(a);
                        break;
                    }
                    jfw.mo9391a(0);
                    break;
                    break;
                case 3:
                case 4:
                    jfw.mo9392b();
                    break;
            }
        }
        return jfw.f8152f;
    }

    /* renamed from: b */
    public final void mo9403b() {
        jfw jfw = this.f21462a;
        jfw.f8147a.start();
        jfw.f8156j.set(true);
        jfw.f8148b.set(1);
        jfw.f8158l.mo9407a();
    }
}
