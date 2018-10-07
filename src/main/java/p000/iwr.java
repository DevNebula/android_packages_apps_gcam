package p000;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: iwr */
final class iwr extends iwu {
    /* renamed from: a */
    private final int f21332a;
    /* renamed from: b */
    private final List f21333b;
    /* renamed from: c */
    private final Executor f21334c;
    /* renamed from: d */
    private final iwi f21335d;
    /* renamed from: e */
    private final iwo f21336e;

    iwr(int i, List list, Executor executor, iwi iwi, iwo iwo) {
        this.f21332a = i;
        this.f21333b = list;
        this.f21334c = executor;
        this.f21335d = iwi;
        this.f21336e = iwo;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof iwu)) {
            return false;
        }
        iwu iwu = (iwu) obj;
        if (this.f21332a == iwu.mo9140d() && this.f21333b.equals(iwu.mo9138b()) && this.f21334c.equals(iwu.mo9137a()) && this.f21335d.equals(iwu.mo9141e()) && this.f21336e.equals(iwu.mo9139c())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Executor mo9137a() {
        return this.f21334c;
    }

    /* renamed from: b */
    public final List mo9138b() {
        return this.f21333b;
    }

    /* renamed from: c */
    public final iwo mo9139c() {
        return this.f21336e;
    }

    /* renamed from: d */
    public final int mo9140d() {
        return this.f21332a;
    }

    /* renamed from: e */
    public final iwi mo9141e() {
        return this.f21335d;
    }

    public final int hashCode() {
        return ((((((((this.f21332a ^ 1000003) * 1000003) ^ this.f21333b.hashCode()) * 1000003) ^ this.f21334c.hashCode()) * 1000003) ^ this.f21335d.hashCode()) * 1000003) ^ this.f21336e.hashCode();
    }

    /* renamed from: f */
    public final iwv mo9142f() {
        return new iwv((iwu) this);
    }

    public final String toString() {
        int i = this.f21332a;
        String valueOf = String.valueOf(this.f21333b);
        String valueOf2 = String.valueOf(this.f21334c);
        String valueOf3 = String.valueOf(this.f21335d);
        String valueOf4 = String.valueOf(this.f21336e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 114) + length2) + String.valueOf(valueOf3).length()) + String.valueOf(valueOf4).length());
        stringBuilder.append("SessionConfigurationProxy{sessionType=");
        stringBuilder.append(i);
        stringBuilder.append(", outputSurfaces=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", executor=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", stateCallback=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", sessionParameters=");
        stringBuilder.append(valueOf4);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
