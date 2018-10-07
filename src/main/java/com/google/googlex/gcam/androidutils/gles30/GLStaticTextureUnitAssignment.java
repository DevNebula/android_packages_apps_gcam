package com.google.googlex.gcam.androidutils.gles30;

import android.opengl.GLES30;
import java.util.ArrayList;

/* compiled from: PG */
public class GLStaticTextureUnitAssignment {
    public GLProgram program;
    public ArrayList samplerIds = new ArrayList();
    public ArrayList textures = new ArrayList();

    public GLStaticTextureUnitAssignment(GLProgram gLProgram) {
        this.program = gLProgram;
    }

    public void apply() {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.textures.size()) {
                GLES30.glActiveTexture(33984 + i2);
                ((GLTexture) this.textures.get(i2)).bind();
                GLES30.glUniform1i(((Integer) this.samplerIds.get(i2)).intValue(), i2);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }

    public void assign(String str, GLTexture gLTexture) {
        this.textures.add(gLTexture);
        this.samplerIds.add(Integer.valueOf(this.program.getUniformLocation(str)));
    }

    public void reset() {
        this.textures.clear();
        this.samplerIds.clear();
    }
}
