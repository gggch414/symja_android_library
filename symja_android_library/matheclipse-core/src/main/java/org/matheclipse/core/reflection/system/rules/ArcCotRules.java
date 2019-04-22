package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * <p>Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.</p>
 * <p>See GIT repository at: <a href="https://github.com/axkr/symja_android_library">github.com/axkr/symja_android_library under the tools directory</a>.</p>
 */
public interface ArcCotRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 16, 0 };

  final public static IAST RULES = List(
    IInit(ArcCot, SIZES),
    // ArcCot(0)=Pi/2
    ISet(ArcCot(C0),
      CPiHalf),
    // ArcCot(2-Sqrt(3))=5/12*Pi
    ISet(ArcCot(Subtract(C2,CSqrt3)),
      Times(QQ(5L,12L),Pi)),
    // ArcCot(-1+Sqrt(2))=3/8*Pi
    ISet(ArcCot(Plus(CN1,CSqrt2)),
      Times(QQ(3L,8L),Pi)),
    // ArcCot(1/Sqrt(3))=Pi/3
    ISet(ArcCot(C1DSqrt3),
      Times(C1D3,Pi)),
    // ArcCot(1)=Pi/4
    ISet(ArcCot(C1),
      Times(C1D4,Pi)),
    // ArcCot(Sqrt(1+2/Sqrt(5)))=Pi/5
    ISet(ArcCot(Sqrt(Plus(C1,Times(C2,C1DSqrt5)))),
      Times(QQ(1L,5L),Pi)),
    // ArcCot(Sqrt(3))=Pi/6
    ISet(ArcCot(CSqrt3),
      Times(QQ(1L,6L),Pi)),
    // ArcCot(1+Sqrt(2))=Pi/8
    ISet(ArcCot(Plus(C1,CSqrt2)),
      Times(QQ(1L,8L),Pi)),
    // ArcCot(Sqrt(5+2*Sqrt(5)))=Pi/10
    ISet(ArcCot(Sqrt(Plus(C5,Times(C2,CSqrt5)))),
      Times(QQ(1L,10L),Pi)),
    // ArcCot(2+Sqrt(3))=Pi/12
    ISet(ArcCot(Plus(C2,CSqrt3)),
      Times(QQ(1L,12L),Pi)),
    // ArcCot(I)=-I*Infinity
    ISet(ArcCot(CI),
      DirectedInfinity(CNI)),
    // ArcCot(Infinity)=0
    ISet(ArcCot(oo),
      C0),
    // ArcCot(-Infinity)=0
    ISet(ArcCot(Noo),
      C0),
    // ArcCot(I*Infinity)=0
    ISet(ArcCot(DirectedInfinity(CI)),
      C0),
    // ArcCot(-I*Infinity)=0
    ISet(ArcCot(DirectedInfinity(CNI)),
      C0),
    // ArcCot(ComplexInfinity)=0
    ISet(ArcCot(CComplexInfinity),
      C0)
  );
}
