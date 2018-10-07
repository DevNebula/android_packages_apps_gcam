package p000;

import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* renamed from: kci */
final class kci extends kcg implements ListIterator {
    /* renamed from: b */
    private final /* synthetic */ kch f21858b;

    kci(kch kch) {
        this.f21858b = kch;
        super(kch);
    }

    public kci(kch kch, int i) {
        this.f21858b = kch;
        super(kch, ((List) kch.f8566b).listIterator(i));
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f21858b.isEmpty();
        mo9743a();
        ((ListIterator) this.f8570a).add(obj);
        this.f21858b.f21857d.f24900b = this.f21858b.f21857d.f24900b + 1;
        if (isEmpty) {
            this.f21858b.mo9727a();
        }
    }

    /* renamed from: b */
    private final ListIterator m13645b() {
        mo9743a();
        return (ListIterator) this.f8570a;
    }

    public final boolean hasPrevious() {
        return m13645b().hasPrevious();
    }

    public final int nextIndex() {
        return m13645b().nextIndex();
    }

    public final Object previous() {
        return m13645b().previous();
    }

    public final int previousIndex() {
        return m13645b().previousIndex();
    }

    public final void set(Object obj) {
        m13645b().set(obj);
    }
}
