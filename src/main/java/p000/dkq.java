package p000;

/* compiled from: PG */
/* renamed from: dkq */
final class dkq implements iqt {
    /* renamed from: a */
    private final /* synthetic */ dkp f14171a;

    dkq(dkp dkp) {
        this.f14171a = dkp;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        gom gom = (gom) obj;
        synchronized (this.f14171a.f26052j) {
            String valueOf;
            StringBuilder stringBuilder;
            if (this.f14171a.f26055m == dii.CAMCORDER_OPENED) {
                inc inc;
                switch (gom.ordinal()) {
                    case 0:
                        inc = inc.FPS_AUTO;
                        break;
                    case 1:
                        inc = inc.FPS_30;
                        break;
                    case 2:
                        inc = inc.FPS_60;
                        break;
                    default:
                        valueOf = String.valueOf(gom);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                        stringBuilder.append("Unsupported FPS option ");
                        stringBuilder.append(valueOf);
                        throw new IllegalArgumentException(stringBuilder.toString());
                }
                this.f14171a.mo15507a(inc);
                return;
            }
            String str = dkp.f26624c;
            valueOf = String.valueOf(this.f14171a.f26055m);
            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
            stringBuilder.append("Do nothing on FpsOption update. mState=");
            stringBuilder.append(valueOf);
            bli.m898e(str, stringBuilder.toString());
        }
    }
}
