package android.support.p003v8.renderscript;

import android.support.p003v8.renderscript.Script.FieldID;
import android.support.p003v8.renderscript.Script.KernelID;

/* compiled from: PG */
/* renamed from: android.support.v8.renderscript.ScriptIntrinsicBlur */
public class ScriptIntrinsicBlur extends ScriptIntrinsic {
    public static final int INTRINSIC_API_LEVEL = 19;
    public Allocation mInput;
    public final float[] mValues = new float[9];

    protected ScriptIntrinsicBlur(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicBlur create(RenderScript renderScript, Element element) {
        if (element.isCompatible(Element.U8_4(renderScript)) || element.isCompatible(Element.m6892U8(renderScript))) {
            renderScript.isUseNative();
            ScriptIntrinsicBlur scriptIntrinsicBlur = new ScriptIntrinsicBlur(renderScript.nScriptIntrinsicCreate(5, element.getID(renderScript), false), renderScript);
            scriptIntrinsicBlur.setIncSupp(false);
            scriptIntrinsicBlur.setRadius(5.0f);
            return scriptIntrinsicBlur;
        }
        throw new RSIllegalArgumentException("Unsuported element type.");
    }

    public void forEach(Allocation allocation) {
        forEach(0, null, allocation, null);
    }

    public FieldID getFieldID_Input() {
        return createFieldID(1, null);
    }

    public KernelID getKernelID() {
        return createKernelID(0, 2, null, null);
    }

    public void setInput(Allocation allocation) {
        this.mInput = allocation;
        setVar(1, (BaseObj) allocation);
    }

    public void setRadius(float f) {
        if (f <= 0.0f || f > 25.0f) {
            throw new RSIllegalArgumentException("Radius out of range (0 < r <= 25).");
        }
        setVar(0, f);
    }
}
