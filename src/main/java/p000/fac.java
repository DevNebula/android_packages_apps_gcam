package p000;

/* compiled from: PG */
/* renamed from: fac */
public final class fac implements kwk {
    /* renamed from: a */
    private final kwk f18083a;

    private fac(kwk kwk) {
        this.f18083a = kwk;
    }

    /* renamed from: a */
    public static fac m10318a(kwk kwk) {
        return new fac(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        bmb bmb = (bmb) this.f18083a.mo10566a();
        fab fab = new fab((byte) 0);
        fab.f4630a = Integer.valueOf(6);
        fab.f4631b = Integer.valueOf(2);
        fab a = fab.mo6700a(6);
        a.f4634e = Integer.valueOf(3);
        a.f4632c = Integer.valueOf(20);
        bsn bsn = bmb.f1335a;
        a.mo6700a(1);
        String str = "";
        if (a.f4630a == null) {
            str = String.valueOf(str).concat(" contiguousFrameCount");
        }
        if (a.f4631b == null) {
            str = String.valueOf(str).concat(" hdrPlusQueueLength");
        }
        if (a.f4632c == null) {
            str = String.valueOf(str).concat(" ringBufferCapacity");
        }
        if (a.f4633d == null) {
            str = String.valueOf(str).concat(" numFramesInSingleBurst");
        }
        if (a.f4634e == null) {
            str = String.valueOf(str).concat(" maxNumAlternatives");
        }
        if (str.isEmpty()) {
            return (faa) ktm.m14219a(new ezz(a.f4630a.intValue(), a.f4631b.intValue(), a.f4632c.intValue(), a.f4633d.intValue(), a.f4634e.intValue()), "Cannot return null from a non-@Nullable @Provides method");
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }
}
