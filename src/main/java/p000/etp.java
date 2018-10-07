package p000;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: etp */
public final class etp implements jgx {
    /* renamed from: a */
    public final long f17784a;
    /* renamed from: b */
    public final kpw f17785b;
    /* renamed from: c */
    public final kpk f17786c;
    /* renamed from: d */
    private final jgx f17787d;
    /* renamed from: e */
    private final MediaFormat f17788e;
    /* renamed from: f */
    private final List f17789f = new ArrayList();
    /* renamed from: g */
    private final Executor f17790g;

    public etp(jgx jgx, long j, kpw kpw, kpk kpk, Executor executor) {
        this.f17787d = jgx;
        this.f17790g = executor;
        this.f17784a = j;
        this.f17785b = kpw;
        this.f17786c = kpk;
        this.f17788e = new MediaFormat();
        this.f17788e.setString("mime", "application/microvideo-image-meta");
    }

    /* renamed from: a */
    public final synchronized jhf mo9414a(jhe jhe) {
        jhf a;
        kpw d;
        a = this.f17787d.mo9414a(jhe);
        d = kpw.m18486d();
        this.f17789f.add(d);
        return new etr(a, d);
    }

    /* renamed from: a */
    static byte[] m10090a(long j, long j2, kbg kbg) {
        iyo iyo = new iyo();
        iyo.f24714a = j2;
        iyo.f24715b = j2 - j;
        if (kbg.mo9709b()) {
            iyo.f24716c = (iyq) kbg.mo9706a();
        }
        byte[] bArr = new byte[iyo.getSerializedSize()];
        try {
            iyo.writeTo(kvd.m5482a(bArr, 0, bArr.length));
        } catch (Throwable e) {
            Log.w("AddMetaTrackMuxer", "Error trying to append meta data.", e);
        }
        return bArr;
    }

    /* renamed from: a */
    public final void mo9415a() {
        kpk a;
        kpk a2;
        jhf a3 = this.f17787d.mo9414a(jhe.m4548a(this.f17788e));
        synchronized (this) {
            a = kow.m13872a(this.f17789f);
        }
        synchronized (this) {
            a2 = kow.m13877a(a, this.f17786c);
        }
        a2.mo10200a(new etq(this, a, a3), this.f17790g);
        this.f17787d.mo9415a();
    }

    /* renamed from: b */
    public final kpk mo9416b() {
        return this.f17787d.mo9416b();
    }
}
