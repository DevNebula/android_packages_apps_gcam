package p000;

import java.io.Writer;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jic */
public final class jic implements jyv {
    /* renamed from: a */
    private final /* synthetic */ jia f21523a;

    public jic(jia jia) {
        this.f21523a = jia;
    }

    /* renamed from: a */
    public final void mo9620a(Writer writer) {
        writer.write("IDEAL");
        for (Thread name : this.f21523a.f21516b.keySet()) {
            String valueOf = String.valueOf(name.getName());
            String str = ",";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            writer.write(valueOf);
        }
        writer.write("\n");
        Set set = this.f21523a.f21515a;
        Long[] lArr = (Long[]) set.toArray(new Long[set.size()]);
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < lArr.length) {
                writer.write(String.valueOf(lArr[i2]));
                for (Thread thread : this.f21523a.f21516b.keySet()) {
                    List list = (List) this.f21523a.f21516b.get(thread);
                    if (list.size() > i2) {
                        String valueOf2 = String.valueOf(list.get(i2));
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf2).length() + 1);
                        stringBuilder.append(",");
                        stringBuilder.append(valueOf2);
                        writer.write(stringBuilder.toString());
                    } else {
                        writer.write(",");
                    }
                }
                writer.write("\n");
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
