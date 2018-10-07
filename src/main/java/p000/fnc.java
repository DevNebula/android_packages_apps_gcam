package p000;

import android.os.Handler;

/* compiled from: PG */
/* renamed from: fnc */
final class fnc extends iwy {
    /* renamed from: a */
    public final iqz f26379a;

    public fnc(ixe ixe, ira ira) {
        super(ixe);
        this.f26379a = ira.mo8854a("LoggingImageWriter");
    }

    public final void close() {
        this.f26379a.mo8837e("close()");
        super.close();
    }

    /* renamed from: a */
    public final iwz mo13756a(long j) {
        iqz iqz = this.f26379a;
        StringBuilder stringBuilder = new StringBuilder(45);
        stringBuilder.append("dequeueInputImage(");
        stringBuilder.append(j);
        stringBuilder.append(") START");
        iqz.mo8837e(stringBuilder.toString());
        iwz a = super.mo13756a(j);
        iqz iqz2 = this.f26379a;
        StringBuilder stringBuilder2 = new StringBuilder(43);
        stringBuilder2.append("dequeueInputImage(");
        stringBuilder2.append(j);
        stringBuilder2.append(") END");
        iqz2.mo8837e(stringBuilder2.toString());
        return a;
    }

    /* renamed from: a */
    public final void mo13757a(iwz iwz) {
        iqz iqz = this.f26379a;
        String valueOf = String.valueOf(iwz);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
        stringBuilder.append("queueInputImage(");
        stringBuilder.append(valueOf);
        stringBuilder.append(") START");
        iqz.mo8837e(stringBuilder.toString());
        super.mo13757a(iwz);
        iqz = this.f26379a;
        valueOf = String.valueOf(iwz);
        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
        stringBuilder.append("queueInputImage(");
        stringBuilder.append(valueOf);
        stringBuilder.append(") END");
        iqz.mo8837e(stringBuilder.toString());
    }

    /* renamed from: a */
    public final void mo13758a(ixg ixg, Handler handler) {
        super.mo13758a(new fnd(this, ixg), handler);
    }
}
