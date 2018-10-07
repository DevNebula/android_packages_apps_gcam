package p000;

import android.widget.FrameLayout;
import com.google.android.apps.camera.optionsbar.OptionsBarView;

/* compiled from: PG */
/* renamed from: ein */
class ein extends eik {
    /* renamed from: a */
    private final /* synthetic */ eil f26344a;

    ein(eil eil) {
        this.f26344a = eil;
    }

    /* renamed from: a */
    public final void mo7343a() {
        bli.m888a("videoChart", "enter VideoRecording");
        eil eil = this.f26344a;
        eil.f26343k = true;
        eil.f26341i.f5222b.mo14607b();
        if (this.f26344a.f26342j.f19934a.mo10582c()) {
            OptionsBarView optionsBarView = this.f26344a.f26341i.f5222b;
            if (optionsBarView.f23294h || optionsBarView.f23289c.isRunning() || optionsBarView.f23289c.isStarted()) {
                optionsBarView.f23289c.cancel();
                FrameLayout frameLayout = optionsBarView.f23293g;
                if (frameLayout != null) {
                    frameLayout.setAlpha(0.0f);
                }
                optionsBarView.setAlpha(0.0f);
                optionsBarView.setVisibility(4);
                optionsBarView.f23294h = false;
            }
            this.f26344a.f26339g.mo2736a(false);
        } else {
            this.f26344a.f26341i.mo7004b();
        }
        this.f26344a.f26336d.startRecording();
        this.f26344a.f26337e.mo7670a(hbf.VIDEO_RECORDING);
        this.f26344a.f26340h.mo8001b();
        this.f26344a.f26338f.mo13473a(false);
        hnu.f6750a = false;
    }

    /* renamed from: b */
    public final void mo7344b() {
        bli.m888a("videoChart", "exit VideoRecording");
        eil eil = this.f26344a;
        eil.f26343k = false;
        eil.f26341i.mo7000a();
        this.f26344a.f26341i.f5222b.mo14609c();
        this.f26344a.f26339g.mo2736a(true);
        this.f26344a.f26336d.stopRecording();
        hcd hcd = this.f26344a.f26337e;
        hcd.mo7670a(hbf.VIDEO_IDLE);
        hcd.f6321a.animateToScale(1.0f);
        this.f26344a.f26340h.mo8005d();
        this.f26344a.f26338f.mo13473a(true);
        hnu.f6750a = true;
    }

    /* renamed from: A */
    public void mo6224A() {
    }
}
