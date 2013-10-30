package org.matheclipse.core.integrate.rubi42;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi42.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi42.UtilityFunctions.*;

import org.matheclipse.core.interfaces.IAST;
import org.matheclipse.core.interfaces.IExpr;
import org.matheclipse.core.interfaces.ISymbol;
/** 
 * IntegrationRules rules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntegrationRulesForExpressionsInvolvingTrigFunctionsOfTheFollowingForms35 { 
  public static IAST RULES = List( 
SetDelayed(Int(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Plus(p,C2),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Plus(p,C1),CN1)),Times(x,Cot(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(b,n,Plus(p,C1)),CN1))),And(And(FreeQ(List(a,b,c,n,p),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),C1))),NonzeroQ(Plus(p,C1))))),
SetDelayed(Int(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Plus(p,C2),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Plus(p,C1),CN1)),Times(CN1,x,Tan(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(b,n,Plus(p,C1)),CN1))),And(And(FreeQ(List(a,b,c,n,p),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),C1))),NonzeroQ(Plus(p,C1))))),
SetDelayed(Int(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p,true)),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Power(Plus(Times(Power(E,Times(a,b,n,p)),Power(Times(C2,b,n,p),CN1),Power(Times(c,Power(x,n)),Times(CN1,Power(Times(n,p),CN1)))),Times(CN1,Power(E,Times(CN1,a,b,n,p)),Power(Times(C2,b,n,p),CN1),Power(Times(c,Power(x,n)),Power(Times(n,p),CN1)))),p),x),x),And(And(FreeQ(List(a,b,c,n),x),PositiveIntegerQ(p)),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p,true)),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Power(Plus(Times(C1D2,Power(E,Times(a,b,n,p)),Power(Times(c,Power(x,n)),Times(CN1,Power(Times(n,p),CN1)))),Times(CN1,C1D2,Power(E,Times(CN1,a,b,n,p)),Power(Times(c,Power(x,n)),Power(Times(n,p),CN1)))),p),x),x),And(And(FreeQ(List(a,b,c,n),x),PositiveIntegerQ(p)),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(Times(Power(b,C2),Power(n,C2)),C1),CN1)),Times(CN1,b,n,x,Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(Times(Power(b,C2),Power(n,C2)),C1),CN1))),And(FreeQ(List(a,b,c,n),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2)),C1))))),
SetDelayed(Int(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(C1,Times(Power(b,C2),Power(n,C2))),CN1)),Times(b,n,x,Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(Times(Power(b,C2),Power(n,C2)),C1),CN1))),And(FreeQ(List(a,b,c,n),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2)),C1))))),
SetDelayed(Int(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),p),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1)),Times(CN1,b,n,p,x,Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C1))),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1)),Times(Power(b,C2),Power(n,C2),p,Plus(p,Times(CN1,C1)),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1),Int(Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),x))),And(And(And(FreeQ(List(a,b,c,n),x),RationalQ(p)),Greater(p,C1)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),p),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1)),Times(b,n,p,x,Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C1))),Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1)),Times(Power(b,C2),Power(n,C2),p,Plus(p,Times(CN1,C1)),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1),Int(Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),x))),And(And(And(FreeQ(List(a,b,c,n),x),RationalQ(p)),Greater(p,C1)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Cot(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,x,Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(Power(b,C2),Power(n,C2),Plus(p,C1),Plus(p,C2)),CN1)),Times(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),C1),Power(Times(Power(b,C2),Power(n,C2),Plus(p,C1),Plus(p,C2)),CN1),Int(Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),x))),And(And(And(And(FreeQ(List(a,b,c,n),x),RationalQ(p)),Less(p,CN1)),Unequal(p,CN2)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),C1))))),
SetDelayed(Int(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,x,Tan(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,x,Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(Power(b,C2),Power(n,C2),Plus(p,C1),Plus(p,C2)),CN1)),Times(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),C1),Power(Times(Power(b,C2),Power(n,C2),Plus(p,C1),Plus(p,C2)),CN1),Int(Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),x))),And(And(And(And(FreeQ(List(a,b,c,n),x),RationalQ(p)),Less(p,CN1)),Unequal(p,CN2)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),C1))))),
SetDelayed(Int(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Times(x,Power(Plus(Times(CI,Power(Times(Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b))),CN1)),Times(CN1,CI,Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b)))),p),Power(Times(Plus(C1,Times(CN1,CI,b,n,p)),Power(Plus(C2,Times(CN1,C2,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),p)),CN1),Hypergeometric2F1(Times(CN1,p),Times(Plus(C1,Times(CN1,CI,b,n,p)),Power(Times(C2,CI,b,n),CN1)),Plus(C1,Times(Plus(C1,Times(CN1,CI,b,n,p)),Power(Times(C2,CI,b,n),CN1))),Times(Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b))))),And(FreeQ(List(a,b,c,n,p),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Times(x,Power(Plus(Power(Times(Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b))),CN1),Times(Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b)))),p),Power(Times(Plus(C1,Times(CN1,CI,b,n,p)),Power(Plus(C2,Times(C2,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),p)),CN1),Hypergeometric2F1(Times(CN1,p),Times(Plus(C1,Times(CN1,CI,b,n,p)),Power(Times(C2,CI,b,n),CN1)),Plus(C1,Times(Plus(C1,Times(CN1,CI,b,n,p)),Power(Times(C2,CI,b,n),CN1))),Times(CN1,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b))))),And(FreeQ(List(a,b,c,n,p),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Times(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(p,C2),Power(x,Plus(m,C1)),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(Plus(m,C1),Plus(p,C1)),CN1)),Times(Power(x,Plus(m,C1)),Cot(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(b,n,Plus(p,C1)),CN1))),And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),Power(Plus(m,C1),C2)))),NonzeroQ(Plus(p,C1))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(p,C2),Power(x,Plus(m,C1)),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(Plus(m,C1),Plus(p,C1)),CN1)),Times(CN1,Power(x,Plus(m,C1)),Tan(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(b,n,Plus(p,C1)),CN1))),And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),Power(Plus(m,C1),C2)))),NonzeroQ(Plus(p,C1))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Power(C2,p),CN1),Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(Times(Plus(m,C1),Power(Times(b,n,p),CN1),Power(E,Times(a,b,n,p,Power(Plus(m,C1),CN1))),Power(Times(c,Power(x,n)),Times(CN1,Plus(m,C1),Power(Times(n,p),CN1)))),Times(CN1,Plus(m,C1),Power(Times(b,n,p),CN1),Power(E,Times(CN1,a,b,n,p,Power(Plus(m,C1),CN1))),Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(Times(n,p),CN1))))),p)),x),x)),And(And(FreeQ(List(a,b,c,m,n),x),PositiveIntegerQ(p)),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Power(C2,p),CN1),Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(Times(Power(E,Times(a,b,n,p,Power(Plus(m,C1),CN1))),Power(Times(c,Power(x,n)),Times(CN1,Plus(m,C1),Power(Times(n,p),CN1)))),Times(CN1,Power(E,Times(CN1,a,b,n,p,Power(Plus(m,C1),CN1))),Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(Times(n,p),CN1))))),p)),x),x)),And(And(FreeQ(List(a,b,c,m,n),x),PositiveIntegerQ(p)),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power($p(x),$p(m,true)),Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(m,C1),Power(x,Plus(m,C1)),Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(Times(Power(b,C2),Power(n,C2)),Power(Plus(m,C1),C2)),CN1)),Times(CN1,b,n,Power(x,Plus(m,C1)),Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(Times(Power(b,C2),Power(n,C2)),Power(Plus(m,C1),C2)),CN1))),And(FreeQ(List(a,b,c,m,n),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(m,C1),Power(x,Plus(m,C1)),Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(Times(Power(b,C2),Power(n,C2)),Power(Plus(m,C1),C2)),CN1)),Times(b,n,Power(x,Plus(m,C1)),Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Plus(Times(Power(b,C2),Power(n,C2)),Power(Plus(m,C1),C2)),CN1))),And(FreeQ(List(a,b,c,m,n),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(m,C1),Power(x,Plus(m,C1)),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),p),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1)),Times(CN1,b,n,p,Power(x,Plus(m,C1)),Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C1))),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1)),Times(Power(b,C2),Power(n,C2),p,Plus(p,Times(CN1,C1)),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1),Int(Times(Power(x,m),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,m,n),x),RationalQ(p)),Greater(p,C1)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(m,C1),Power(x,Plus(m,C1)),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),p),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1)),Times(b,n,p,Power(x,Plus(m,C1)),Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C1))),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1)),Times(Power(b,C2),Power(n,C2),p,Plus(p,Times(CN1,C1)),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1),Int(Times(Power(x,m),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,m,n),x),RationalQ(p)),Greater(p,C1)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Cot(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,Plus(m,C1),Power(x,Plus(m,C1)),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(Power(b,C2),Power(n,C2),Plus(p,C1),Plus(p,C2)),CN1)),Times(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),Power(Plus(m,C1),C2)),Power(Times(Power(b,C2),Power(n,C2),Plus(p,C1),Plus(p,C2)),CN1),Int(Times(Power(x,m),Power(Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,m,n),x),RationalQ(p)),Less(p,CN1)),Unequal(p,CN2)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(x,Plus(m,C1)),Tan(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,Plus(m,C1),Power(x,Plus(m,C1)),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),Power(Times(Power(b,C2),Power(n,C2),Plus(p,C1),Plus(p,C2)),CN1)),Times(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),Power(Plus(m,C1),C2)),Power(Times(Power(b,C2),Power(n,C2),Plus(p,C1),Plus(p,C2)),CN1),Int(Times(Power(x,m),Power(Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,m,n),x),RationalQ(p)),Less(p,CN1)),Unequal(p,CN2)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,C2),C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Sin(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Plus(m,C1)),Power(Plus(Times(CI,Power(E,Times(CN1,CI,a)),Power(Times(c,Power(x,n)),Times(CN1,CI,b))),Times(CN1,CI,Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b)))),p),Power(Times(Plus(m,C1,Times(CN1,CI,b,n,p)),Power(Plus(C2,Times(CN1,C2,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),p)),CN1),Hypergeometric2F1(Times(CN1,p),Times(Plus(m,C1,Times(CN1,CI,b,n,p)),Power(Times(C2,CI,b,n),CN1)),Plus(C1,Times(Plus(m,C1,Times(CN1,CI,b,n,p)),Power(Times(C2,CI,b,n),CN1))),Times(Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b))))),And(FreeQ(List(a,b,c,m,n,p),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Cos(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Plus(m,C1)),Power(Plus(Times(Power(E,Times(CN1,CI,a)),Power(Times(c,Power(x,n)),Times(CN1,CI,b))),Times(Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b)))),p),Power(Times(Plus(m,C1,Times(CN1,CI,b,n,p)),Power(Plus(C2,Times(C2,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),p)),CN1),Hypergeometric2F1(Times(CN1,p),Times(Plus(m,C1,Times(CN1,CI,b,n,p)),Power(Times(C2,CI,b,n),CN1)),Plus(C1,Times(Plus(m,C1,Times(CN1,CI,b,n,p)),Power(Times(C2,CI,b,n),CN1))),Times(CN1,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b))))),And(FreeQ(List(a,b,c,m,n,p),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(x,SymbolHead)),
    Condition(Times(C2,Power(E,Times(a,b,n)),Int(Times(Power(Times(c,Power(x,n)),Power(n,CN1)),Power(Plus(Power(E,Times(C2,a,b,n)),Power(Times(c,Power(x,n)),Times(C2,Power(n,CN1)))),CN1)),x)),And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2)),C1))))),
SetDelayed(Int(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(x,SymbolHead)),
    Condition(Times(C2,b,n,Power(E,Times(a,b,n)),Int(Times(Power(Times(c,Power(x,n)),Power(n,CN1)),Power(Plus(Power(E,Times(C2,a,b,n)),Times(CN1,Power(Times(c,Power(x,n)),Times(C2,Power(n,CN1))))),CN1)),x)),And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2)),C1))))),
SetDelayed(Int(Power(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(p,Times(CN1,C2)),x,Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Plus(p,Times(CN1,C1)),CN1)),Times(x,Tan(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1))),And(And(FreeQ(List(a,b,c,n,p),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),C1))),NonzeroQ(Plus(p,Times(CN1,C1)))))),
SetDelayed(Int(Power(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(p,Times(CN1,C2)),x,Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Plus(p,Times(CN1,C1)),CN1)),Times(CN1,x,Cot(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1))),And(And(FreeQ(List(a,b,c,n,p),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),C1))),NonzeroQ(Plus(p,Times(CN1,C1)))))),
SetDelayed(Int(Power(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Tan(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1)),Times(CN1,x,Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(Power(b,C2),Power(n,C2),Plus(p,Times(CN1,C1)),Plus(p,Times(CN1,C2))),CN1)),Times(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),C1),Power(Times(Power(b,C2),Power(n,C2),Plus(p,Times(CN1,C1)),Plus(p,Times(CN1,C2))),CN1),Int(Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,n),x),RationalQ(p)),Greater(p,C1)),Unequal(p,C2)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),C1))))),
SetDelayed(Int(Power(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,x,Cot(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1)),Times(CN1,x,Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(Power(b,C2),Power(n,C2),Plus(p,Times(CN1,C1)),Plus(p,Times(CN1,C2))),CN1)),Times(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),C1),Power(Times(Power(b,C2),Power(n,C2),Plus(p,Times(CN1,C1)),Plus(p,Times(CN1,C2))),CN1),Int(Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),x))),And(And(And(And(FreeQ(List(a,b,c,n),x),RationalQ(p)),Greater(p,C1)),Unequal(p,C2)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),C1))))),
SetDelayed(Int(Power(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,n,p,x,Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C1)),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1)),Times(x,Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),p),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1)),Times(Power(b,C2),Power(n,C2),p,Plus(p,C1),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1),Int(Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),x))),And(And(And(FreeQ(List(a,b,c,n),x),RationalQ(p)),Less(p,CN1)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Power(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(b,n,p,x,Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C1)),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1)),Times(x,Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),p),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1)),Times(Power(b,C2),Power(n,C2),p,Plus(p,C1),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1),CN1),Int(Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2)),x))),And(And(And(FreeQ(List(a,b,c,n),x),RationalQ(p)),Less(p,CN1)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Power(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p,true)),$p(x,SymbolHead)),
    Condition(Times(x,Power(Plus(C2,Times(C2,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),p),Power(Plus(C1,Times(CI,b,n,p)),CN1),Power(Times(Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b)),Power(Plus(C1,Times(Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),CN1)),p),Hypergeometric2F1(p,Times(Plus(C1,Times(CI,b,n,p)),Power(Times(C2,CI,b,n),CN1)),Plus(C1,Times(Plus(C1,Times(CI,b,n,p)),Power(Times(C2,CI,b,n),CN1))),Times(CN1,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b))))),And(FreeQ(List(a,b,c,n,p),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Power(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p,true)),$p(x,SymbolHead)),
    Condition(Times(x,Power(Plus(C2,Times(CN1,C2,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),p),Power(Plus(C1,Times(CI,b,n,p)),CN1),Power(Times(CN1,CI,Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b)),Power(Plus(C1,Times(CN1,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),CN1)),p),Hypergeometric2F1(p,Times(Plus(C1,Times(CI,b,n,p)),Power(Times(C2,CI,b,n),CN1)),Plus(C1,Times(Plus(C1,Times(CI,b,n,p)),Power(Times(C2,CI,b,n),CN1))),Times(Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b))))),And(FreeQ(List(a,b,c,n,p),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),C1))))),
SetDelayed(Int(Times(Power($p(x),$p(m,true)),Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)))),$p(x,SymbolHead)),
    Condition(Times(C2,Power(E,Times(a,b,n,Power(Plus(m,C1),CN1))),Int(Times(Power(x,m),Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(n,CN1))),Power(Plus(Power(E,Times(C2,a,b,n,Power(Plus(m,C1),CN1))),Power(Times(c,Power(x,n)),Times(C2,Plus(m,C1),Power(n,CN1)))),CN1)),x)),And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(C2,b,n,Power(Plus(m,C1),CN1),Power(E,Times(a,b,n,Power(Plus(m,C1),CN1))),Int(Times(Power(x,m),Power(Times(c,Power(x,n)),Times(Plus(m,C1),Power(n,CN1))),Power(Plus(Power(E,Times(C2,a,b,n,Power(Plus(m,C1),CN1))),Times(CN1,Power(Times(c,Power(x,n)),Times(C2,Plus(m,C1),Power(n,CN1))))),CN1)),x)),And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(p,Times(CN1,C2)),Power(x,Plus(m,C1)),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(Plus(m,C1),Plus(p,Times(CN1,C1))),CN1)),Times(Power(x,Plus(m,C1)),Tan(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1))),And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),Power(Plus(m,C1),C2)))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(p,Times(CN1,C2)),Power(x,Plus(m,C1)),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(Plus(m,C1),Plus(p,Times(CN1,C1))),CN1)),Times(CN1,Power(x,Plus(m,C1)),Cot(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1))),And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),Power(Plus(m,C1),C2)))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Tan(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1)),Times(CN1,Plus(m,C1),Power(x,Plus(m,C1)),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(Power(b,C2),Power(n,C2),Plus(p,Times(CN1,C1)),Plus(p,Times(CN1,C2))),CN1)),Times(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),Power(Plus(m,C1),C2)),Power(Times(Power(b,C2),Power(n,C2),Plus(p,Times(CN1,C1)),Plus(p,Times(CN1,C2))),CN1),Int(Times(Power(x,m),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,m,n),x),RationalQ(p)),Greater(p,C1)),Unequal(p,C2)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(x,Plus(m,C1)),Cot(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(b,n,Plus(p,Times(CN1,C1))),CN1)),Times(CN1,Plus(m,C1),Power(x,Plus(m,C1)),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2))),Power(Times(Power(b,C2),Power(n,C2),Plus(p,Times(CN1,C1)),Plus(p,Times(CN1,C2))),CN1)),Times(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),Power(Plus(m,C1),C2)),Power(Times(Power(b,C2),Power(n,C2),Plus(p,Times(CN1,C1)),Plus(p,Times(CN1,C2))),CN1),Int(Times(Power(x,m),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,m,n),x),RationalQ(p)),Greater(p,C1)),Unequal(p,C2)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(Plus(p,Times(CN1,C2)),C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,n,p,Power(x,Plus(m,C1)),Sin(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C1)),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1)),Times(Plus(m,C1),Power(x,Plus(m,C1)),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),p),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1)),Times(Power(b,C2),Power(n,C2),p,Plus(p,C1),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1),Int(Times(Power(x,m),Power(Sec(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2))),x))),And(And(And(FreeQ(List(a,b,c,m,n),x),RationalQ(p)),Less(p,CN1)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(b,n,p,Power(x,Plus(m,C1)),Cos(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C1)),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1)),Times(Plus(m,C1),Power(x,Plus(m,C1)),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),p),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1)),Times(Power(b,C2),Power(n,C2),p,Plus(p,C1),Power(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)),CN1),Int(Times(Power(x,m),Power(Csc(Plus(a,Times(b,Log(Times(c,Power(x,n)))))),Plus(p,C2))),x))),And(And(And(FreeQ(List(a,b,c,m,n),x),RationalQ(p)),Less(p,CN1)),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Sec(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Plus(m,C1)),Power(Plus(C2,Times(C2,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),p),Power(Plus(m,C1,Times(CI,b,n,p)),CN1),Power(Times(Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b)),Power(Plus(C1,Times(Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),CN1)),p),Hypergeometric2F1(p,Times(Plus(m,C1,Times(CI,b,n,p)),Power(Times(C2,CI,b,n),CN1)),Plus(C1,Times(Plus(m,C1,Times(CI,b,n,p)),Power(Times(C2,CI,b,n),CN1))),Times(CN1,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b))))),And(FreeQ(List(a,b,c,m,n,p),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Csc(Plus(Times(Log(Times(Power($p(x),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true))),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Plus(m,C1)),Power(Plus(C2,Times(CN1,C2,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),p),Power(Plus(m,C1,Times(CI,b,n,p)),CN1),Power(Times(CN1,CI,Power(E,Times(CI,a)),Power(Times(c,Power(x,n)),Times(CI,b)),Power(Plus(C1,Times(CN1,Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b)))),CN1)),p),Hypergeometric2F1(p,Times(Plus(m,C1,Times(CI,b,n,p)),Power(Times(C2,CI,b,n),CN1)),Plus(C1,Times(Plus(m,C1,Times(CI,b,n,p)),Power(Times(C2,CI,b,n),CN1))),Times(Power(E,Times(C2,CI,a)),Power(Times(c,Power(x,n)),Times(C2,CI,b))))),And(FreeQ(List(a,b,c,m,n,p),x),NonzeroQ(Plus(Times(Power(b,C2),Power(n,C2),Power(p,C2)),Power(Plus(m,C1),C2)))))),
SetDelayed(Int(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),Sin(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),$p(a,true),$p(x)))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Cos(Times(a,x,Power(Log(Times(b,x)),p))),Power(a,CN1)),Times(CN1,p,Int(Times(Sin(Times(a,x,Power(Log(Times(b,x)),p))),Power(Log(Times(b,x)),Plus(p,Times(CN1,C1)))),x))),And(And(FreeQ(List(a,b),x),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Times(Cos(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),$p(a,true),$p(x))),Power(Log(Times($p(b,true),$p(x))),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Sin(Times(a,x,Power(Log(Times(b,x)),p))),Power(a,CN1)),Times(CN1,p,Int(Times(Cos(Times(a,x,Power(Log(Times(b,x)),p))),Power(Log(Times(b,x)),Plus(p,Times(CN1,C1)))),x))),And(And(FreeQ(List(a,b),x),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),Sin(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),Power($p(x),$p(n)),$p(a,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Cos(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Times(a,n,Power(x,Plus(n,Times(CN1,C1)))),CN1)),Times(CN1,p,Power(n,CN1),Int(Times(Sin(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Log(Times(b,x)),Plus(p,Times(CN1,C1)))),x)),Times(CN1,Plus(n,Times(CN1,C1)),Power(Times(a,n),CN1),Int(Times(Cos(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Power(x,n),CN1)),x))),And(And(FreeQ(List(a,b),x),RationalQ(n,p)),Greater(p,C0)))),
SetDelayed(Int(Times(Cos(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),Power($p(x),$p(n)),$p(a,true))),Power(Log(Times($p(b,true),$p(x))),$p(p,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Sin(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Times(a,n,Power(x,Plus(n,Times(CN1,C1)))),CN1)),Times(CN1,p,Power(n,CN1),Int(Times(Cos(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Log(Times(b,x)),Plus(p,Times(CN1,C1)))),x)),Times(Plus(n,Times(CN1,C1)),Power(Times(a,n),CN1),Int(Times(Sin(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Power(x,n),CN1)),x))),And(And(FreeQ(List(a,b),x),RationalQ(n,p)),Greater(p,C0)))),
SetDelayed(Int(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),Power($p(x),$p(m,true)),Sin(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),Power($p(x),$p(n,true)),$p(a,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Cos(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Times(a,n),CN1)),Times(CN1,p,Power(n,CN1),Int(Times(Power(x,m),Sin(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Log(Times(b,x)),Plus(p,Times(CN1,C1)))),x))),And(And(And(FreeQ(List(a,b,m,n),x),ZeroQ(Plus(m,Times(CN1,n),C1))),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Times(Cos(Times(Power(Log(Times($p(b,true),$p(x))),$p(p,true)),Power($p(x),$p(n,true)),$p(a,true))),Power(Log(Times($p(b,true),$p(x))),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Sin(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Times(a,n),CN1)),Times(CN1,p,Power(n,CN1),Int(Times(Power(x,m),Cos(Times(a,Power(x,n),Power(Log(Times(b,x)),p))),Power(Log(Times(b,x)),Plus(p,Times(CN1,C1)))),x))),And(And(And(FreeQ(List(a,b,m,n),x),ZeroQ(Plus(m,Times(CN1,n),C1))),RationalQ(p)),Greater(p,C0))))
  );
}
