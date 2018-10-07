package p000;

import java.util.Map.Entry;

/* renamed from: exe */
final /* synthetic */ class exe implements Runnable {
    /* renamed from: a */
    private final Entry f4557a;
    /* renamed from: b */
    private final gid f4558b;

    exe(Entry entry, gid gid) {
        this.f4557a = entry;
        this.f4558b = gid;
    }

    public final void run() {
        Entry entry = this.f4557a;
        ((exf) entry.getKey()).mo6668a(this.f4558b);
    }
}
