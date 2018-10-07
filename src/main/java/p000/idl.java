package p000;

/* renamed from: idl */
abstract class idl implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ idb f7306a;

    idl(idb idb) {
        this.f7306a = idb;
    }

    /* renamed from: a */
    protected abstract void mo8371a();

    public void run() {
        this.f7306a.f20924b.lock();
        try {
            if (!Thread.interrupted()) {
                mo8371a();
                this.f7306a.f20924b.unlock();
            }
        } catch (RuntimeException e) {
            idr idr = this.f7306a.f20923a;
            idr.f24602e.sendMessage(idr.f24602e.obtainMessage(2, e));
        } finally {
            this.f7306a.f20924b.unlock();
        }
    }
}
