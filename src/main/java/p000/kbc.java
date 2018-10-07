package p000;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: kbc */
public final class kbc {
    /* renamed from: a */
    private final kaz f8545a;
    /* renamed from: b */
    private final String f8546b;

    kbc(kaz kaz, String str) {
        this.f8545a = kaz;
        this.f8546b = (String) jri.m13404b((Object) str);
    }

    /* renamed from: a */
    public final StringBuilder mo9700a(StringBuilder stringBuilder, Iterator it) {
        try {
            jri.m13404b((Object) stringBuilder);
            if (it.hasNext()) {
                Entry entry = (Entry) it.next();
                stringBuilder.append(this.f8545a.mo9692a(entry.getKey()));
                stringBuilder.append(this.f8546b);
                stringBuilder.append(this.f8545a.mo9692a(entry.getValue()));
                while (it.hasNext()) {
                    stringBuilder.append(this.f8545a.f8544a);
                    entry = (Entry) it.next();
                    stringBuilder.append(this.f8545a.mo9692a(entry.getKey()));
                    stringBuilder.append(this.f8546b);
                    stringBuilder.append(this.f8545a.mo9692a(entry.getValue()));
                }
            }
            return stringBuilder;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
