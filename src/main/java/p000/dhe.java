package p000;

/* compiled from: PG */
/* renamed from: dhe */
public final class dhe implements dht {
    /* renamed from: a */
    private final kwk f13872a;
    /* renamed from: b */
    private final kwk f13873b;
    /* renamed from: c */
    private final kwk f13874c;
    /* renamed from: d */
    private final kwk f13875d;
    /* renamed from: e */
    private final kwk f13876e;
    /* renamed from: f */
    private final kwk f13877f;
    /* renamed from: g */
    private final kwk f13878g;
    /* renamed from: h */
    private final kwk f13879h;
    /* renamed from: i */
    private final kwk f13880i;
    /* renamed from: j */
    private final kwk f13881j;
    /* renamed from: k */
    private final kwk f13882k;
    /* renamed from: l */
    private final kwk f13883l;
    /* renamed from: m */
    private final kwk f13884m;

    public dhe(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13) {
        this.f13872a = (kwk) dhe.m9212a(kwk, 1);
        this.f13873b = (kwk) dhe.m9212a(kwk2, 2);
        this.f13874c = (kwk) dhe.m9212a(kwk3, 3);
        this.f13875d = (kwk) dhe.m9212a(kwk4, 4);
        this.f13876e = (kwk) dhe.m9212a(kwk5, 5);
        this.f13877f = (kwk) dhe.m9212a(kwk6, 6);
        this.f13878g = (kwk) dhe.m9212a(kwk7, 7);
        this.f13879h = (kwk) dhe.m9212a(kwk8, 8);
        this.f13880i = (kwk) dhe.m9212a(kwk9, 9);
        this.f13881j = (kwk) dhe.m9212a(kwk10, 10);
        this.f13882k = (kwk) dhe.m9212a(kwk11, 11);
        this.f13883l = (kwk) dhe.m9212a(kwk12, 12);
        this.f13884m = (kwk) dhe.m9212a(kwk13, 13);
    }

    /* renamed from: a */
    private static Object m9212a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }

    /* renamed from: a */
    public final /* synthetic */ dhs mo5970a(ilp ilp, ipv ipv, bsn bsn) {
        hjf hjf = (hjf) dhe.m9212a((hjf) this.f13872a.mo10566a(), 1);
        bfk bfk = (bfk) dhe.m9212a((bfk) this.f13873b.mo10566a(), 2);
        dzh dzh = (dzh) dhe.m9212a((dzh) this.f13874c.mo10566a(), 3);
        hjw hjw = (hjw) dhe.m9212a((hjw) this.f13875d.mo10566a(), 4);
        ilb ilb = (ilb) dhe.m9212a((ilb) this.f13876e.mo10566a(), 5);
        fbn fbn = (fbn) dhe.m9212a((fbn) this.f13877f.mo10566a(), 6);
        gci gci = (gci) dhe.m9212a((gci) this.f13878g.mo10566a(), 7);
        djq djq = (djq) dhe.m9212a((djq) this.f13879h.mo10566a(), 8);
        dkb dkb = (dkb) dhe.m9212a((dkb) this.f13880i.mo10566a(), 9);
        heq heq = (heq) dhe.m9212a((heq) this.f13881j.mo10566a(), 10);
        asu asu = (asu) dhe.m9212a((asu) this.f13882k.mo10566a(), 11);
        dim dim = (dim) dhe.m9212a((dim) this.f13883l.mo10566a(), 12);
        ilp ilp2 = (ilp) dhe.m9212a(ilp, 13);
        ipv ipv2 = (ipv) dhe.m9212a(ipv, 14);
        dhe.m9212a(bsn, 15);
        return new dhc(hjf, bfk, dzh, hjw, ilb, fbn, gci, djq, dkb, heq, asu, dim, ilp2, ipv2, (how) dhe.m9212a((how) this.f13884m.mo10566a(), 16));
    }
}
