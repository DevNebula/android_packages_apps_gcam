package p000;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: era */
public final class era {
    /* renamed from: a */
    private static final String f4335a = bli.m887a("MemoryManager");
    /* renamed from: b */
    private final Object f4336b = new Object();
    /* renamed from: c */
    private final Executor f4337c;
    /* renamed from: d */
    private final long f4338d;
    /* renamed from: e */
    private final EnumMap f4339e = new EnumMap(eqv.class);

    public era(eqy eqy, Executor executor) {
        this.f4338d = eqy.f4332a;
        String str = f4335a;
        long j = this.f4338d;
        StringBuilder stringBuilder = new StringBuilder(72);
        stringBuilder.append("Max native memory: ");
        stringBuilder.append(j);
        stringBuilder.append(" bytes. (");
        stringBuilder.append(j / 1000000);
        stringBuilder.append("MB).");
        bli.m894c(str, stringBuilder.toString());
        this.f4337c = executor;
    }

    /* renamed from: b */
    private final long m2073b() {
        long j;
        synchronized (this.f4336b) {
            Iterator it = this.f4339e.keySet().iterator();
            j = 0;
            while (true) {
                long j2 = j;
                if (it.hasNext()) {
                    j = ((Long) ((erd) this.f4339e.get((eqv) it.next())).f17683a.mo6517b().mo13673b()).longValue() + j2;
                } else {
                    j = this.f4338d - j2;
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public final ilp mo6519a(eqv eqv) {
        ilp ilp;
        synchronized (this.f4336b) {
            if (this.f4339e.containsKey(eqv)) {
                ilp = ((erd) this.f4339e.get(eqv)).f17684b;
            } else {
                String valueOf = String.valueOf(eqv);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Feature not registered: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        return ilp;
    }

    /* renamed from: b */
    private final boolean m2074b(eqv eqv) {
        synchronized (this.f4336b) {
            long b = m2073b();
            long longValue = ((Long) ((erd) this.f4339e.get(eqv)).f17683a.mo6516a().mo13673b()).longValue();
            String name;
            StringBuilder stringBuilder;
            if (longValue < 0) {
                String str = f4335a;
                name = eqv.name();
                stringBuilder = new StringBuilder(String.valueOf(name).length() + 73);
                stringBuilder.append("Feature (");
                stringBuilder.append(name);
                stringBuilder.append(") reports negative shot memory: ");
                stringBuilder.append(longValue);
                stringBuilder.append(". Disabling.");
                bli.m898e(str, stringBuilder.toString());
                return false;
            }
            boolean z;
            if (longValue <= b) {
                z = true;
            } else {
                z = false;
            }
            String str2 = f4335a;
            name = eqv.name();
            stringBuilder = new StringBuilder(String.valueOf(name).length() + 68);
            stringBuilder.append("Feature available: ");
            stringBuilder.append(name);
            stringBuilder.append(": ");
            stringBuilder.append(z);
            stringBuilder.append(" (Additional memory: ");
            stringBuilder.append(longValue);
            stringBuilder.append(")");
            bli.m888a(str2, stringBuilder.toString());
            return z;
        }
    }

    /* renamed from: a */
    public final boolean mo6521a(eqw eqw) {
        synchronized (this.f4336b) {
            String str;
            String valueOf;
            if (this.f4339e.containsKey(eqw.mo6518c())) {
                str = f4335a;
                String str2 = "Feature already registered: ";
                valueOf = String.valueOf(eqw.mo6518c().name());
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m894c(str, valueOf);
                return false;
            }
            valueOf = f4335a;
            str = "Registering feature: ";
            String valueOf2 = String.valueOf(eqw.mo6518c().name());
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str);
            } else {
                valueOf2 = str.concat(valueOf2);
            }
            bli.m894c(valueOf, valueOf2);
            this.f4339e.put(eqw.mo6518c(), new erd(eqw, new ilb(Boolean.valueOf(false)), ken.m13709a(eqw.mo6517b().mo13672a(new erb(this), this.f4337c), eqw.mo6516a().mo13672a(new erc(this), this.f4337c))));
            mo6520a();
            return true;
        }
    }

    /* renamed from: a */
    final void mo6520a() {
        synchronized (this.f4336b) {
            long b = m2073b();
            for (eqv eqv : this.f4339e.keySet()) {
                ((erd) this.f4339e.get(eqv)).f17684b.mo8826a(Boolean.valueOf(m2074b(eqv)));
            }
            String str = f4335a;
            StringBuilder stringBuilder = new StringBuilder(48);
            stringBuilder.append("State updated. Free Memory: ");
            stringBuilder.append(b);
            bli.m894c(str, stringBuilder.toString());
        }
    }
}
