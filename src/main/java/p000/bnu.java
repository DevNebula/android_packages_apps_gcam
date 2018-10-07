package p000;

import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: bnu */
final class bnu implements bno {
    /* renamed from: a */
    private final bno f11620a;
    /* renamed from: b */
    private final C0291in f11621b = new C0291in();
    /* renamed from: c */
    private final iqz f11622c;
    /* renamed from: d */
    private final iqx f11623d;

    bnu(bno bno, iqz iqz, iqx iqx) {
        this.f11620a = bno;
        this.f11622c = iqz;
        this.f11623d = iqx;
    }

    /* renamed from: b */
    private static String m7717b(long j) {
        long convert = TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS);
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(convert);
        stringBuilder.append(" MS");
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo2056a(long j) {
        long nanoTime = System.nanoTime();
        long longValue = ((Long) this.f11621b.mo8629b(j)).longValue();
        iqz iqz = this.f11622c;
        String b = bnu.m7717b(nanoTime - longValue);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 49);
        stringBuilder.append("Compression time for image ");
        stringBuilder.append(j);
        stringBuilder.append(": ");
        stringBuilder.append(b);
        iqz.mo8832b(stringBuilder.toString());
        this.f11620a.mo2056a(j);
    }

    /* renamed from: a */
    public final void mo2059a(UUID uuid, long j, IOException iOException) {
        iqz iqz = this.f11622c;
        String message = iOException.getMessage();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(message).length() + 41);
        stringBuilder.append("Error saving image ");
        stringBuilder.append(j);
        stringBuilder.append(": ");
        stringBuilder.append(message);
        iqz.mo8834c(stringBuilder.toString());
        this.f11620a.mo2059a(uuid, j, iOException);
    }

    /* renamed from: a */
    public final void mo2057a(bnk bnk) {
        long nanoTime = System.nanoTime();
        this.f11623d.mo8829a();
        long longValue = ((Long) this.f11621b.mo8629b(bnk.f11581c)).longValue();
        this.f11621b.mo8626a(bnk.f11581c);
        iqz iqz = this.f11622c;
        long j = bnk.f11581c;
        String b = bnu.m7717b(nanoTime - longValue);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 48);
        stringBuilder.append("Total save time for image ");
        stringBuilder.append(j);
        stringBuilder.append(": ");
        stringBuilder.append(b);
        iqz.mo8832b(stringBuilder.toString());
        this.f11620a.mo2057a(bnk);
    }

    /* renamed from: a */
    public final void mo2058a(fkp fkp) {
        this.f11621b.mo8627a(fkp.mo13744f(), Long.valueOf(System.nanoTime()));
        this.f11620a.mo2058a(fkp);
    }
}
