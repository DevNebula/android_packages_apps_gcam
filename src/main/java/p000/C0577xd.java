package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: xd */
public final class C0577xd {
    /* renamed from: a */
    private List f10013a = new ArrayList(5);

    /* renamed from: a */
    public final void mo11529a(C0578xe c0578xe) {
        this.f10013a.add(c0578xe);
    }

    /* renamed from: a */
    public final C0578xe mo11528a(int i) {
        return (C0578xe) this.f10013a.get(i);
    }

    /* renamed from: a */
    public final int mo11527a() {
        return this.f10013a.size();
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i < mo11527a(); i++) {
            stringBuffer.append(mo11528a(i));
            if (i < mo11527a() - 1) {
                int i2 = mo11528a(i + 1).f10015b;
                if (i2 == 1 || i2 == 2) {
                    stringBuffer.append('/');
                }
            }
        }
        return stringBuffer.toString();
    }
}
