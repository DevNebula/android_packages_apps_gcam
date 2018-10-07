package p000;

import android.opengl.GLES20;
import com.google.googlex.gcam.androidutils.gles30.GLBufferObject.Target;
import com.google.googlex.gcam.androidutils.gles30.GLBufferObject.Usage;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* renamed from: jdj */
final class jdj implements Callable {
    /* renamed from: a */
    private final /* synthetic */ jdo f8086a;
    /* renamed from: b */
    private final /* synthetic */ int f8087b = Target.ARRAY_BUFFER;
    /* renamed from: c */
    private final /* synthetic */ int f8088c = 34964;
    /* renamed from: d */
    private final /* synthetic */ ByteBuffer f8089d;

    jdj(jdo jdo, ByteBuffer byteBuffer) {
        this.f8086a = jdo;
        this.f8089d = byteBuffer;
    }

    public final /* synthetic */ Object call() {
        jfj d = this.f8086a.mo15032d();
        int i = this.f8087b;
        int i2 = this.f8088c;
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        jet jet = new jet(d, iArr[0], i, i2);
        Buffer buffer = this.f8089d;
        jet.mo15715b();
        jet.f26728c = buffer.limit();
        jet.f26729d = 0;
        GLES20.glBufferData(jet.f26727b, jet.f26728c, buffer, Usage.STATIC_DRAW);
        return jet;
    }

    public final String toString() {
        return "create-gl-buffer-with-static";
    }
}
