package p000;

import android.content.ContentResolver;

/* compiled from: PG */
/* renamed from: bsn */
public final class bsn {
    /* renamed from: a */
    private final bsl f1535a;

    bsn(bsl bsl) {
        this.f1535a = bsl;
    }

    /* renamed from: a */
    public final boolean mo2107a(bsq bsq) {
        bsl bsl = this.f1535a;
        String a = bsl.f1533a.mo2104a(bsq);
        if (a != null) {
            return bsu.m980a(a);
        }
        bso bso = bsl.f1534b;
        ContentResolver contentResolver = bso.f1536a;
        String valueOf = String.valueOf(bso.f1537b);
        String valueOf2 = String.valueOf(bsq.f1532b);
        if (valueOf2.length() == 0) {
            valueOf2 = new String(valueOf);
        } else {
            valueOf2 = valueOf.concat(valueOf2);
        }
        valueOf2 = ije.m3831a(contentResolver, valueOf2, "");
        if (kbi.m4811a(valueOf2)) {
            valueOf2 = null;
        }
        if (valueOf2 != null) {
            return bsu.m980a(valueOf2);
        }
        return bsq.f11743a;
    }

    /* renamed from: a */
    public final kbg mo2105a(bst bst) {
        Integer valueOf;
        bsl bsl = this.f1535a;
        String a = bsl.f1533a.mo2104a(bst);
        Integer valueOf2 = Integer.valueOf(kvl.UNSET_ENUM_VALUE);
        if (a != null) {
            valueOf2 = Integer.valueOf(Integer.parseInt(a));
        }
        bso bso = bsl.f1534b;
        ContentResolver contentResolver = bso.f1536a;
        String valueOf3 = String.valueOf(bso.f1537b);
        String valueOf4 = String.valueOf(bst.f1532b);
        if (valueOf4.length() == 0) {
            valueOf4 = new String(valueOf3);
        } else {
            valueOf4 = valueOf3.concat(valueOf4);
        }
        valueOf4 = ije.m3831a(contentResolver, valueOf4, "");
        if (kbi.m4811a(valueOf4)) {
            valueOf4 = null;
        }
        if (valueOf4 != null) {
            valueOf = Integer.valueOf(Integer.parseInt(valueOf4));
        } else {
            valueOf = valueOf2;
        }
        if (valueOf.intValue() == kvl.UNSET_ENUM_VALUE) {
            return kau.f21835a;
        }
        int i = bst.f11744a.isEmpty() ? 1 : !bst.f11744a.contains(valueOf) ? 0 : 1;
        a = bst.f1532b;
        keu keu = bst.f11744a;
        if (i != 0) {
            return kbg.m4804c(valueOf);
        }
        throw new IllegalStateException(jri.m13393a("%s must be one of: %s", a, keu));
    }

    /* renamed from: a */
    public final boolean mo2106a(bry bry) {
        if (!(bry instanceof bsq) && !(bry instanceof bst)) {
            return false;
        }
        brv brv = this.f1535a.f1533a;
        jri.m13404b((Object) bry);
        if (brv.f1531a.mo9116a(bry.f1532b) == null) {
            iwc iwc = brv.f1531a;
            String valueOf = String.valueOf("persist.");
            String valueOf2 = String.valueOf(bry.f1532b);
            if (valueOf2.length() == 0) {
                valueOf2 = new String(valueOf);
            } else {
                valueOf2 = valueOf.concat(valueOf2);
            }
            if (iwc.mo9116a(valueOf2) == null) {
                return false;
            }
        }
        return true;
    }
}
