package org.matheclipse.core.reflection.system.rules;

import static org.matheclipse.core.expression.F.*;
import org.matheclipse.core.interfaces.IAST;

/**
 * Generated by <code>org.matheclipse.core.preprocessor.RulePreprocessor</code>.<br />
 * See GIT repository at: <a href="https://bitbucket.org/axelclk/symja_android_library">https://bitbucket.org/axelclk/symja_android_library under the tools directory</a>.
 */
public interface SinhRules {
  /**
   * <ul>
   * <li>index 0 - number of equal rules in <code>RULES</code></li>
	 * </ul>
	 */
  final public static int[] SIZES = { 19, 0 };

  final public static IAST RULES = List(
    IInit(Sinh, SIZES),
    ISet(Sinh(C0),
      C0),
    ISet(Sinh(Times(CC(0L,1L,1L,6L),Pi)),
      CC(0L,1L,1L,2L)),
    ISet(Sinh(Times(CC(0L,1L,1L,4L),Pi)),
      Times(CC(0L,1L,1L,2L),CSqrt2)),
    ISet(Sinh(Times(CC(0L,1L,1L,3L),Pi)),
      Times(CC(0L,1L,1L,2L),CSqrt3)),
    ISet(Sinh(Times(CC(0L,1L,1L,2L),Pi)),
      CI),
    ISet(Sinh(Times(CC(0L,1L,2L,3L),Pi)),
      Times(CC(0L,1L,1L,2L),CSqrt3)),
    ISet(Sinh(Times(CC(0L,1L,3L,4L),Pi)),
      Times(CC(0L,1L,1L,2L),CSqrt2)),
    ISet(Sinh(Times(CC(0L,1L,5L,6L),Pi)),
      CC(0L,1L,1L,2L)),
    ISet(Sinh(Times(CI,Pi)),
      C0),
    ISet(Sinh(Times(CC(0L,1L,7L,6L),Pi)),
      CC(0L,1L,-1L,2L)),
    ISet(Sinh(Times(CC(0L,1L,5L,4L),Pi)),
      Times(CC(0L,1L,-1L,2L),CSqrt2)),
    ISet(Sinh(Times(CC(0L,1L,4L,3L),Pi)),
      Times(CC(0L,1L,-1L,2L),CSqrt3)),
    ISet(Sinh(Times(CC(0L,1L,3L,2L),Pi)),
      CNI),
    ISet(Sinh(Times(CC(0L,1L,5L,3L),Pi)),
      Times(CC(0L,1L,-1L,2L),CSqrt3)),
    ISet(Sinh(Times(CC(0L,1L,7L,4L),Pi)),
      Times(CC(0L,1L,-1L,2L),CSqrt2)),
    ISet(Sinh(Times(CC(0L,1L,11L,6L),Pi)),
      CC(0L,1L,-1L,2L)),
    ISet(Sinh(Times(CC(0L,1L,2L,1L),Pi)),
      C0),
    ISet(Sinh(CInfinity),
      CInfinity),
    ISet(Sinh(CComplexInfinity),
      Indeterminate)
  );
}
