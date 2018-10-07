package p000;

import android.opengl.GLES20;

/* compiled from: PG */
/* renamed from: dfk */
final class dfk implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ kpw f3236a;
    /* renamed from: b */
    private final /* synthetic */ des f3237b;

    dfk(des des, kpw kpw) {
        this.f3237b = des;
        this.f3236a = kpw;
    }

    public final void run() {
        int i = 0;
        eki eki = this.f3237b.f25985t;
        if (eki != null) {
            ejo ejo;
            eki.f4023o = false;
            eko eko = eki.f4011c;
            if (eko != null) {
                eko.mo6252a();
            }
            GLES20.glDeleteTextures(2, new int[]{eki.f4026r, eki.f4025q}, 0);
            ekn ekn = eki.f4010b;
            if (ekn.f3889d.size() > 0) {
                ejo = (ejo) ekn.f3889d.get(0);
            } else {
                ejo = null;
            }
            if (ejo != null) {
                ejo.mo6257d();
            }
            ejq ejq = eki.f4017i;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3898d);
            }
            ejq = eki.f4018j;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3898d);
            }
            ejq = eki.f4019k;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3898d);
            }
            ejq = eki.f4020l;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3898d);
            }
            ejq = eki.f4021m;
            if (ejq != null) {
                GLES20.glDeleteProgram(ejq.f3898d);
            }
            ejn ejn = eki.f3985a;
            if (ejn != null) {
                ejn.mo6252a();
            }
            eks eks = eki.f4016h;
            if (eks != null) {
                while (i < eks.f4053a.size()) {
                    if (eks.f4053a.get(i) != null) {
                        ((ejt) eks.f4053a.get(i)).mo6252a();
                    }
                    i++;
                }
                ejq = eks.f4056d;
                if (ejq != null) {
                    GLES20.glDeleteProgram(ejq.f3898d);
                }
            }
            ejm ejm = eki.f4014f;
            if (ejm != null) {
                ejm.mo6252a();
            }
            if (eki.f4015g != null) {
                eki.f4014f.mo6252a();
            }
            ekt ekt = eki.f4012d;
            if (ekt != null) {
                ejq ejq2 = ekt.f4068g;
                if (ejq2 != null) {
                    GLES20.glDeleteProgram(ejq2.f3898d);
                }
                ejq2 = ekt.f4069h;
                if (ejq2 != null) {
                    GLES20.glDeleteProgram(ejq2.f3898d);
                }
                ejt ejt = ekt.f4066e;
                if (ejt != null) {
                    ejt.mo6252a();
                }
                ejt ejt2 = ekt.f4067f;
                if (ejt2 != null) {
                    ejt2.mo6252a();
                }
            }
            ekn = eki.f4010b;
            if (ekn != null) {
                ekn.mo6252a();
            }
            this.f3237b.f25985t = null;
            this.f3236a.mo15641a(null);
        }
    }
}
