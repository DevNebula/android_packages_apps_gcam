package android.support.p003v8.renderscript;

import android.support.p003v8.renderscript.Script.KernelID;
import android.support.p003v8.renderscript.Script.LaunchOptions;

/* compiled from: PG */
/* renamed from: android.support.v8.renderscript.ScriptIntrinsicColorMatrix */
public class ScriptIntrinsicColorMatrix extends ScriptIntrinsic {
    public static final int INTRINSIC_API_LEVEL = 19;
    public final Float4 mAdd = new Float4();
    public Allocation mInput;
    public final Matrix4f mMatrix = new Matrix4f();

    protected ScriptIntrinsicColorMatrix(long j, RenderScript renderScript) {
        super(j, renderScript);
    }

    public static ScriptIntrinsicColorMatrix create(RenderScript renderScript, Element element) {
        if (element.isCompatible(Element.U8_4(renderScript))) {
            renderScript.isUseNative();
            ScriptIntrinsicColorMatrix scriptIntrinsicColorMatrix = new ScriptIntrinsicColorMatrix(renderScript.nScriptIntrinsicCreate(2, element.getID(renderScript), false), renderScript);
            scriptIntrinsicColorMatrix.setIncSupp(false);
            return scriptIntrinsicColorMatrix;
        }
        throw new RSIllegalArgumentException("Unsuported element type.");
    }

    public void forEach(Allocation allocation, Allocation allocation2) {
        forEach(0, allocation, allocation2, null);
    }

    public void forEach(Allocation allocation, Allocation allocation2, LaunchOptions launchOptions) {
        if (!allocation.getElement().isCompatible(Element.m6892U8(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_2(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_3(this.mRS)) && !allocation.getElement().isCompatible(Element.U8_4(this.mRS)) && !allocation.getElement().isCompatible(Element.F32(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_2(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_3(this.mRS)) && !allocation.getElement().isCompatible(Element.F32_4(this.mRS))) {
            throw new RSIllegalArgumentException("Unsuported element type.");
        } else if (allocation2.getElement().isCompatible(Element.m6892U8(this.mRS)) || allocation2.getElement().isCompatible(Element.U8_2(this.mRS)) || allocation2.getElement().isCompatible(Element.U8_3(this.mRS)) || allocation2.getElement().isCompatible(Element.U8_4(this.mRS)) || allocation2.getElement().isCompatible(Element.F32(this.mRS)) || allocation2.getElement().isCompatible(Element.F32_2(this.mRS)) || allocation2.getElement().isCompatible(Element.F32_3(this.mRS)) || allocation2.getElement().isCompatible(Element.F32_4(this.mRS))) {
            forEach(0, allocation, allocation2, null, launchOptions);
        } else {
            throw new RSIllegalArgumentException("Unsuported element type.");
        }
    }

    public KernelID getKernelID() {
        return createKernelID(0, 3, null, null);
    }

    public void setAdd(float f, float f2, float f3, float f4) {
        Float4 float4 = this.mAdd;
        float4.f792x = f;
        float4.f793y = f2;
        float4.f794z = f3;
        float4.f791w = f4;
        FieldPacker fieldPacker = new FieldPacker(16);
        fieldPacker.addF32(this.mAdd.f792x);
        fieldPacker.addF32(this.mAdd.f793y);
        fieldPacker.addF32(this.mAdd.f794z);
        fieldPacker.addF32(this.mAdd.f791w);
        setVar(1, fieldPacker);
    }

    public void setAdd(Float4 float4) {
        Float4 float42 = this.mAdd;
        float42.f792x = float4.f792x;
        float42.f793y = float4.f793y;
        float42.f794z = float4.f794z;
        float42.f791w = float4.f791w;
        FieldPacker fieldPacker = new FieldPacker(16);
        fieldPacker.addF32(float4.f792x);
        fieldPacker.addF32(float4.f793y);
        fieldPacker.addF32(float4.f794z);
        fieldPacker.addF32(float4.f791w);
        setVar(1, fieldPacker);
    }

    public void setColorMatrix(Matrix3f matrix3f) {
        this.mMatrix.load(matrix3f);
        setMatrix();
    }

    public void setColorMatrix(Matrix4f matrix4f) {
        this.mMatrix.load(matrix4f);
        setMatrix();
    }

    public void setGreyscale() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 0.299f);
        this.mMatrix.set(1, 0, 0.587f);
        this.mMatrix.set(2, 0, 0.114f);
        this.mMatrix.set(0, 1, 0.299f);
        this.mMatrix.set(1, 1, 0.587f);
        this.mMatrix.set(2, 1, 0.114f);
        this.mMatrix.set(0, 2, 0.299f);
        this.mMatrix.set(1, 2, 0.587f);
        this.mMatrix.set(2, 2, 0.114f);
        setMatrix();
    }

    private void setMatrix() {
        FieldPacker fieldPacker = new FieldPacker(64);
        fieldPacker.addMatrix(this.mMatrix);
        setVar(0, fieldPacker);
    }

    public void setRGBtoYUV() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 0.299f);
        this.mMatrix.set(1, 0, 0.587f);
        this.mMatrix.set(2, 0, 0.114f);
        this.mMatrix.set(0, 1, -0.14713f);
        this.mMatrix.set(1, 1, -0.28886f);
        this.mMatrix.set(2, 1, 0.436f);
        this.mMatrix.set(0, 2, 0.615f);
        this.mMatrix.set(1, 2, -0.51499f);
        this.mMatrix.set(2, 2, -0.10001f);
        setMatrix();
    }

    public void setYUVtoRGB() {
        this.mMatrix.loadIdentity();
        this.mMatrix.set(0, 0, 1.0f);
        this.mMatrix.set(1, 0, 0.0f);
        this.mMatrix.set(2, 0, 1.13983f);
        this.mMatrix.set(0, 1, 1.0f);
        this.mMatrix.set(1, 1, -0.39465f);
        this.mMatrix.set(2, 1, -0.5806f);
        this.mMatrix.set(0, 2, 1.0f);
        this.mMatrix.set(1, 2, 2.03211f);
        this.mMatrix.set(2, 2, 0.0f);
        setMatrix();
    }
}
