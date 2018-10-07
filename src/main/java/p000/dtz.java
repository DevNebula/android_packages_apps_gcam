package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dtz */
public final class dtz extends imq {
    /* renamed from: b */
    private final bkw f26167b;
    /* renamed from: c */
    private final boolean f26168c;
    /* renamed from: d */
    private final boolean f26169d;
    /* renamed from: e */
    private final boolean f26170e = true;

    static {
        bli.m887a("AHDRPSimpleMtrProc");
    }

    public dtz(bkw bkw, boolean z, boolean z2, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5) {
        super(ilq.m3880a(ilp, ilp2, ilp3, ilp4, ilp5));
        this.f26167b = bkw;
        this.f26168c = z;
        this.f26169d = z2;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15010b(Object obj) {
        float a;
        float a2;
        fxo fxo;
        boolean z = true;
        List list = (List) obj;
        fxp fxp = new fxp(this.f26168c, this.f26169d, ((fxi) list.get(0)).f5017e, ((fxj) list.get(1)).f5023e, ((Boolean) list.get(2)).booleanValue(), ((Boolean) list.get(3)).booleanValue());
        float floatValue = ((Float) list.get(4)).floatValue();
        if (this.f26169d) {
            a = ije.m3828a(this.f26167b.f1283a, "camera:simple_metering_bright_bmm_threshold_front", 500.0f);
        } else {
            a = ije.m3828a(this.f26167b.f1283a, "camera:simple_metering_bright_bmm_threshold_back", 250.0f);
        }
        if (this.f26169d) {
            a2 = ije.m3828a(this.f26167b.f1283a, "camera:simple_metering_dark_bmm_threshold_front", 80.0f);
        } else {
            a2 = ije.m3828a(this.f26167b.f1283a, "camera:simple_metering_dark_bmm_threshold_back", 80.0f);
        }
        if (this.f26168c || this.f26169d) {
            if (floatValue <= a2) {
                if (fxp.f5034e) {
                    fxo = fxo.HDR_PLUS_WITH_TORCH;
                } else if (fxp.f5033d) {
                    fxo = fxo.NORMAL_WITH_FLASH;
                } else {
                    fxo = fxo.NORMAL;
                }
            } else if (floatValue > a) {
                fxo = fxo.NORMAL;
            } else if (fxp.f5034e) {
                fxo = fxo.HDR_PLUS;
            } else if (fxp.f5033d) {
                fxo = fxo.NORMAL_WITH_FLASH;
            } else {
                fxo = fxo.NORMAL;
            }
        } else if (floatValue > a2 || !fxp.f5034e) {
            fxo = fxo.NORMAL;
        } else {
            fxo = fxo.HDR_PLUS;
        }
        if (this.f26170e) {
            if (fxo == fxo.NORMAL_WITH_FLASH) {
                boolean z2;
                if (!fxp.f5030a) {
                    z2 = false;
                } else if (fxp.f5033d) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                jri.m13405b(z2);
            } else if (fxo == fxo.HDR_PLUS || fxo == fxo.HDR_PLUS_ZSL || fxo == fxo.HDR_PLUS_WITH_TORCH) {
                jri.m13405b(fxp.f5034e);
            }
            if (fxo == fxo.HDR_PLUS_ZSL) {
                z = false;
            }
            jri.m13405b(z);
            if (fxp.f5031b == C0252go.f5802aA) {
                if (fxp.f5032c == C0252go.f5802aA) {
                    return fxo.NORMAL;
                }
                if (fxp.f5032c == C0252go.f5804aC) {
                    return fxo.HDR_PLUS;
                }
                if (fxp.f5034e) {
                    return fxo.HDR_PLUS_ZSL;
                }
                return fxo.NORMAL;
            } else if (fxp.f5031b != C0252go.f5804aC) {
                if (fxp.f5031b == C0252go.f5803aB) {
                    if (fxp.f5032c == C0252go.f5802aA) {
                        if (fxp.f5030a && fxp.f5033d) {
                            return fxo.NORMAL_WITH_FLASH;
                        }
                        return fxo.NORMAL;
                    } else if (fxp.f5032c == C0252go.f5804aC) {
                        if (fxo == fxo.HDR_PLUS || fxo == fxo.NORMAL) {
                            return fxo.HDR_PLUS;
                        }
                        return fxo.HDR_PLUS_WITH_TORCH;
                    } else if (!fxp.f5034e) {
                        return fxo;
                    } else {
                        if (fxo == fxo.HDR_PLUS_WITH_TORCH || fxo == fxo.NORMAL_WITH_FLASH) {
                            return fxo.HDR_PLUS_WITH_TORCH;
                        }
                        if (fxo == fxo.HDR_PLUS || fxo == fxo.NORMAL) {
                            return fxo.HDR_PLUS_ZSL;
                        }
                    }
                }
                throw new IllegalStateException("Unknown flash setting, or impossible combination!!");
            } else if (fxp.f5032c == C0252go.f5802aA) {
                return fxo.NORMAL_WITH_FLASH;
            } else {
                if (fxp.f5032c == C0252go.f5804aC) {
                    return fxo.HDR_PLUS_WITH_TORCH;
                }
                if (fxp.f5034e) {
                    return fxo.HDR_PLUS_WITH_TORCH;
                }
                return fxo.NORMAL_WITH_FLASH;
            }
        } else if (fxp.f5031b == C0252go.f5802aA) {
            if (fxp.f5032c == C0252go.f5802aA) {
                return fxo.NORMAL;
            }
            if (fxp.f5032c == C0252go.f5804aC) {
                return fxo.HDR_PLUS;
            }
            if (fxo == fxo.NORMAL || fxo == fxo.NORMAL_WITH_FLASH) {
                return fxo.NORMAL;
            }
            if (fxp.f5034e) {
                return fxo.HDR_PLUS;
            }
            return fxo.NORMAL;
        } else if (fxp.f5031b == C0252go.f5804aC) {
            if (fxp.f5032c == C0252go.f5802aA) {
                return fxo.NORMAL_WITH_FLASH;
            }
            if (fxp.f5032c == C0252go.f5804aC) {
                return fxo.HDR_PLUS_WITH_TORCH;
            }
            if (fxo == fxo.NORMAL || fxo == fxo.NORMAL_WITH_FLASH) {
                return fxo.NORMAL_WITH_FLASH;
            }
            if (fxp.f5034e) {
                return fxo.HDR_PLUS_WITH_TORCH;
            }
            return fxo.NORMAL_WITH_FLASH;
        } else if (fxp.f5031b != C0252go.f5803aB) {
            throw new AssertionError("Unknown flash setting!");
        } else if (fxp.f5032c == C0252go.f5802aA) {
            if (fxp.f5030a && fxp.f5033d) {
                return fxo.NORMAL_WITH_FLASH;
            }
            return fxo.NORMAL;
        } else if (fxp.f5032c == C0252go.f5804aC) {
            if (fxo == fxo.HDR_PLUS || fxo == fxo.HDR_PLUS_WITH_TORCH) {
                return fxo;
            }
            if (fxo == fxo.NORMAL) {
                return fxo.HDR_PLUS;
            }
            return fxo.HDR_PLUS_WITH_TORCH;
        } else if (fxo != fxo.NORMAL && fxo != fxo.NORMAL_WITH_FLASH && fxp.f5034e) {
            return fxo;
        } else {
            if (fxp.f5033d) {
                return fxo.NORMAL_WITH_FLASH;
            }
            return fxo.NORMAL;
        }
    }
}
