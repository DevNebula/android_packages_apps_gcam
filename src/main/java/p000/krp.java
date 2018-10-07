package p000;

import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: krp */
final class krp {
    krp() {
    }

    krp(byte b) {
        this();
    }

    /* renamed from: a */
    static int m5167a(Entry entry) {
        return ((krs) entry.getKey()).f8822b;
    }

    /* renamed from: a */
    static Object m5168a(krn krn, kte kte, int i) {
        return (krl) krn.f8812b.get(new kro(kte, i));
    }

    /* renamed from: a */
    static krr m5169a(Object obj) {
        ksb ksb = (ksb) obj;
        krr krr = ksb.f26750g;
        if (!krr.f8819b) {
            return krr;
        }
        krr = krr.clone();
        ksb.f26750g = krr;
        return krr;
    }

    /* renamed from: b */
    static void m5172b(Object obj) {
        ((ksb) obj).f26750g.mo10273d();
    }

    /* renamed from: a */
    static void m5170a(ktq ktq, Object obj, krn krn, krr krr) {
        krl krl = (krl) obj;
        krr.mo10269b(krl.f8808d, ktq.mo10323b(krl.f8807c.getClass(), krn));
    }

    /* renamed from: a */
    static void m5171a(kvb kvb, Entry entry) {
        krs krs = (krs) entry.getKey();
        switch (krs.f8823c.ordinal()) {
            case 0:
                kvb.mo10452a(krs.f8822b, ((Double) entry.getValue()).doubleValue());
                return;
            case 1:
                kvb.mo10453a(krs.f8822b, ((Float) entry.getValue()).floatValue());
                return;
            case 2:
                kvb.mo10463b(krs.f8822b, ((Long) entry.getValue()).longValue());
                return;
            case 3:
                kvb.mo10470e(krs.f8822b, ((Long) entry.getValue()).longValue());
                return;
            case 4:
                kvb.mo10465c(krs.f8822b, ((Integer) entry.getValue()).intValue());
                return;
            case 5:
                kvb.mo10455a(krs.f8822b, ((Long) entry.getValue()).longValue());
                return;
            case 6:
                kvb.mo10462b(krs.f8822b, ((Integer) entry.getValue()).intValue());
                return;
            case 7:
                kvb.mo10460a(krs.f8822b, ((Boolean) entry.getValue()).booleanValue());
                return;
            case 8:
                kvb.mo10458a(krs.f8822b, (String) entry.getValue());
                return;
            case 9:
                kvb.mo10457a(krs.f8822b, entry.getValue(), kto.f8910a.mo10314a(entry.getValue().getClass()));
                return;
            case 10:
                kvb.mo10464b(krs.f8822b, entry.getValue(), kto.f8910a.mo10314a(entry.getValue().getClass()));
                return;
            case 11:
                kvb.mo10459a(krs.f8822b, (kqx) entry.getValue());
                return;
            case 12:
                kvb.mo10471f(krs.f8822b, ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                kvb.mo10465c(krs.f8822b, ((Integer) entry.getValue()).intValue());
                return;
            case 14:
                kvb.mo10467d(krs.f8822b, ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                kvb.mo10466c(krs.f8822b, ((Long) entry.getValue()).longValue());
                return;
            case 16:
                kvb.mo10469e(krs.f8822b, ((Integer) entry.getValue()).intValue());
                return;
            case 17:
                kvb.mo10468d(krs.f8822b, ((Long) entry.getValue()).longValue());
                return;
            default:
                return;
        }
    }
}
