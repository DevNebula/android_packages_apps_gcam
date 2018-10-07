package p000;

import android.util.Log;
import com.google.android.libraries.smartburst.filterfw.GraphRunner;
import com.google.android.libraries.smartburst.filterfw.GraphRunner.Listener;

/* compiled from: PG */
/* renamed from: jsj */
final class jsj implements Listener {
    /* renamed from: a */
    private final /* synthetic */ jsi f21706a;

    jsj(jsi jsi) {
        this.f21706a = jsi;
    }

    public final void onGraphRunnerError(Exception exception, boolean z) {
        Log.d("BAP", "Error");
        this.f21706a.f24791b.mo13777a(jar.m4449a(exception));
        this.f21706a.mo15052a();
    }

    public final void onGraphRunnerStopped(GraphRunner graphRunner) {
        Log.d("BAP", "Stopped");
        jsi jsi = this.f21706a;
        jsi.f24791b.mo13778a(jsi.f24790a);
        this.f21706a.mo15052a();
    }
}
