package p000;

import com.google.android.apps.camera.processing.ProcessingService;

/* compiled from: PG */
/* renamed from: geo */
public final class geo implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ProcessingService f5351a;

    public geo(ProcessingService processingService) {
        this.f5351a = processingService;
    }

    public final void run() {
        while (true) {
            try {
                geu c = this.f5351a.f12827k.mo7087c();
                if (c == null) {
                    synchronized (this.f5351a.f12819c) {
                        this.f5351a.f12820d = null;
                    }
                    synchronized (this.f5351a.f12822f) {
                        ProcessingService processingService = this.f5351a;
                        processingService.f12823g = false;
                        processingService.f12824h = false;
                        processingService.f12825i = true;
                    }
                    this.f5351a.stopSelf();
                    return;
                }
                synchronized (this.f5351a.f12819c) {
                    ProcessingService processingService2 = this.f5351a;
                    processingService2.f12820d = c;
                    if (processingService2.f12821e) {
                        processingService2.f12820d.suspend();
                    }
                }
                Object obj = this.f5351a;
                if (c == null) {
                    bli.m891b(ProcessingService.f12817a, "Reference to ProcessingTask is null");
                } else {
                    bli.m888a(ProcessingService.f12817a, "Resetting notification");
                    obj.f12818b.setContentText("…").setProgress(100, 0, false);
                    obj.mo12582a();
                    get session = c.getSession();
                    if (session != null) {
                        session.mo7075a(obj);
                    }
                    System.gc();
                    String str = ProcessingService.f12817a;
                    String valueOf = String.valueOf(c);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    stringBuilder.append("Processing start ");
                    stringBuilder.append(valueOf);
                    bli.m888a(str, stringBuilder.toString());
                    c.process(obj);
                    String str2 = ProcessingService.f12817a;
                    String valueOf2 = String.valueOf(c);
                    StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 16);
                    stringBuilder2.append("Processing done ");
                    stringBuilder2.append(valueOf2);
                    bli.m888a(str2, stringBuilder2.toString());
                }
            } catch (Exception e) {
                this.f5351a.f12831o.execute(new gep(e));
                this.f5351a.stopSelf();
                return;
            } catch (Throwable th) {
                this.f5351a.stopSelf();
            }
        }
    }
}
