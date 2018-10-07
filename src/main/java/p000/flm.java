package p000;

/* compiled from: PG */
/* renamed from: flm */
public final class flm implements kwk {
    /* renamed from: a */
    private final kwk f18401a;
    /* renamed from: b */
    private final kwk f18402b;
    /* renamed from: c */
    private final kwk f18403c;

    public flm(kwk kwk, kwk kwk2, kwk kwk3) {
        this.f18401a = kwk;
        this.f18402b = kwk2;
        this.f18403c = kwk3;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f18401a;
        kwk kwk2 = this.f18402b;
        ikb ikb = (ikb) kwk.mo10566a();
        ixb ixb = (ixb) kwk2.mo10566a();
        fjv fjz = new fjz(ixb, ((fjx) this.f18403c.mo10566a()).f4822a);
        ikb.mo8557a(fjz);
        String b = ion.m4019b(ixb.mo13751e());
        int h = ixb.mo13754h();
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(b).length() + 12);
        stringBuilder.append(b);
        stringBuilder.append("w");
        stringBuilder.append(h);
        b = String.valueOf(stringBuilder.toString());
        String str = "IR-";
        if (b.length() == 0) {
            b = new String(str);
        } else {
            b = str.concat(b);
        }
        ixb.mo13747a(new fkf(fjz), ijy.m3846a(ikb, b));
        Object fkk = new fkk(fjz);
        ikb.mo8557a(fkk);
        return (fjv) ktm.m14219a(new fkg(fkk), "Cannot return null from a non-@Nullable @Provides method");
    }
}
