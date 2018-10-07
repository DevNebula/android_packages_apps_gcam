package android.support.p003v8.renderscript;

/* compiled from: PG */
/* renamed from: android.support.v8.renderscript.ScriptIntrinsic */
public class ScriptIntrinsic extends Script {
    ScriptIntrinsic(long j, RenderScript renderScript) {
        super(j, renderScript);
        if (j == 0) {
            throw new RSRuntimeException("Loading of ScriptIntrinsic failed.");
        }
    }
}
