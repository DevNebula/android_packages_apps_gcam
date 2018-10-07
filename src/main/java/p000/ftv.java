package p000;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ftv */
final class ftv implements fux {
    /* renamed from: a */
    public final fud f24308a;
    /* renamed from: b */
    private final fux f24309b;
    /* renamed from: c */
    private final kpk f24310c;
    /* renamed from: d */
    private final fuc f24311d;

    ftv(fux fux, kpk kpk, fud fud, fuc fuc) {
        this.f24309b = fux;
        this.f24310c = kpk;
        this.f24308a = fud;
        this.f24311d = fuc;
    }

    /* renamed from: a */
    public final void mo13282a(iwz iwz, kpk kpk) {
        fud fud = this.f24308a;
        long f = iwz.mo13744f();
        synchronized (fud.f18788b.f4955d) {
            Set set = fud.f18787a.f4947e;
            Long valueOf = Long.valueOf(f);
            set.add(valueOf);
            fud.f18788b.f4956e.put(valueOf, fud.f18787a);
        }
        iwz iuz;
        fuc fuc;
        iwz fkp;
        long f2;
        fub a;
        Map map;
        Long valueOf2;
        OutputStream byteArrayOutputStream;
        if (Arrays.asList(new Integer[]{Integer.valueOf(37), Integer.valueOf(38), Integer.valueOf(32)}).contains(Integer.valueOf(iwz.mo13741c()))) {
            iuz = new iuz(iwz, 2);
            fuc = this.f24311d;
            fkp = new fkp(new iva(iuz), kpk);
            synchronized (fuc.f4955d) {
                f2 = fkp.mo13744f();
                a = fuc.mo6912a(f2);
                map = a.f4945c;
                valueOf2 = Long.valueOf(f2);
                jri.m13406b(map.containsKey(valueOf2) ^ 1, (Object) "Image already added");
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    fuc.f4952a.mo6906a(fkp, byteArrayOutputStream);
                    a.f4945c.put(valueOf2, byteArrayOutputStream.toByteArray());
                } catch (Throwable e) {
                    throw new RuntimeException(e);
                }
            }
            this.f24309b.mo13282a(new iva(iuz), kpk);
        } else if (iwz.mo13741c() == 35) {
            iuz = new iuz(iwz, 2);
            fuc = this.f24311d;
            fkp = new fkp(new iva(iuz), kpk);
            synchronized (fuc.f4955d) {
                f2 = fkp.mo13744f();
                a = fuc.mo6912a(f2);
                map = a.f4944b;
                valueOf2 = Long.valueOf(f2);
                jri.m13406b(map.containsKey(valueOf2) ^ 1, (Object) "Image already added");
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    fuc.f4953b.mo6906a(fkp, byteArrayOutputStream);
                    a.f4944b.put(valueOf2, byteArrayOutputStream.toByteArray());
                } catch (Throwable e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f24309b.mo13282a(new iva(iuz), kpk);
        } else {
            this.f24309b.mo13282a(iwz, kpk);
        }
        fuc fuc2 = this.f24311d;
        f = iwz.mo13744f();
        synchronized (fuc2.f4955d) {
            fuc2.mo6912a(f).f4946d.put(Long.valueOf(f), kpk);
        }
    }

    public final void close() {
        kow.m13878a(this.f24310c, new ftw(this), kpq.f8776a);
        this.f24309b.close();
    }
}
