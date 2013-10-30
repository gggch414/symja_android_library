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
public class IntegrationRulesForExpressionsInvolvingExponentialOrLogarithmFunctions1 { 
  public static IAST RULES = List( 
SetDelayed(Int(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,n,x),Times(Plus(d,Times(e,x)),Log(Times(c,Power(Plus(d,Times(e,x)),n))),Power(e,CN1))),FreeQ(List(c,d,e,n),x))),
SetDelayed(Int(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(d,Times(e,x)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(e,CN1)),Times(CN1,b,n,p,Int(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1))),x))),And(And(FreeQ(List(a,b,c,d,e,n),x),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Power(Log(Times(Plus(Times($p(b,true),$p(x)),$p(a,true)),$p(c,true))),CN1),$p(x,SymbolHead)),
    Condition(Times(LogIntegral(Times(c,Plus(a,Times(b,x)))),Power(Times(c,b),CN1)),FreeQ(List(a,b,c),x))),
SetDelayed(Int(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),CN1),$p(x,SymbolHead)),
    Condition(Times(Plus(d,Times(e,x)),Power(Times(b,e,n,Power(E,Times(a,Power(Times(b,n),CN1))),Power(Times(c,Power(Plus(d,Times(e,x)),n)),Power(n,CN1))),CN1),ExpIntegralEi(Times(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(b,n),CN1)))),FreeQ(List(a,b,c,d,e,n),x))),
SetDelayed(Int(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Pi),Rt(Times(b,n),C2),Plus(d,Times(e,x)),Power(Times(b,e,n,Power(E,Times(a,Power(Times(b,n),CN1))),Power(Times(c,Power(Plus(d,Times(e,x)),n)),Power(n,CN1))),CN1),Erfi(Times(Sqrt(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n)))))),Power(Rt(Times(b,n),C2),CN1)))),And(FreeQ(List(a,b,c,d,e,n),x),PosQ(Times(b,n))))),
SetDelayed(Int(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Pi),Rt(Times(CN1,b,n),C2),Plus(d,Times(e,x)),Power(Times(b,e,n,Power(E,Times(a,Power(Times(b,n),CN1))),Power(Times(c,Power(Plus(d,Times(e,x)),n)),Power(n,CN1))),CN1),Erf(Times(Sqrt(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n)))))),Power(Rt(Times(CN1,b,n),C2),CN1)))),And(FreeQ(List(a,b,c,d,e,n),x),NegQ(Times(b,n))))),
SetDelayed(Int(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(d,Times(e,x)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1)),Power(Times(b,e,n,Plus(p,C1)),CN1)),Times(CN1,Power(Times(b,n,Plus(p,C1)),CN1),Int(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1)),x))),And(And(FreeQ(List(a,b,c,d,e,n),x),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p)),$p(x,SymbolHead)),
    Condition(Times(Plus(d,Times(e,x)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(e,Power(E,Times(a,Power(Times(b,n),CN1))),Power(Times(c,Power(Plus(d,Times(e,x)),n)),Power(n,CN1)),Power(Times(CN1,Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(b,n),CN1)),p)),CN1),Gamma(Plus(p,C1),Times(CN1,Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(b,n),CN1)))),And(FreeQ(List(a,b,c,d,e,n,p),x),Not(IntegerQ(Times(C2,p)))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times(Power($p(x),$p(q)),$p(e,true)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power($p(x),$p("q1"))),$p(x,SymbolHead)),
    Condition(Times(Power(q,CN1),Subst(Int(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),x),x,Power(x,q))),And(FreeQ(List(a,b,c,d,e,n,p,q),x),ZeroQ(Plus($s("q1"),Times(CN1,Plus(q,Times(CN1,C1)))))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Times(Power(Times(g,n),CN1),Subst(Int(Power(Plus(a,Times(b,x)),p),x),x,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),ZeroQ(Plus(Times(e,f),Times(CN1,d,g)))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(g,Plus(m,C1)),CN1)),Times(CN1,b,n,p,Power(Plus(m,C1),CN1),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(CN1,d,g)))),NonzeroQ(Plus(m,C1))),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),CN1),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Times(b,g,n,Power(E,Times(a,Plus(m,C1),Power(Times(b,n),CN1))),Power(Times(c,Power(Plus(d,Times(e,x)),n)),Times(Plus(m,C1),Power(n,CN1)))),CN1),ExpIntegralEi(Times(Plus(m,C1),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(b,n),CN1)))),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(CN1,d,g)))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),CN1D2),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Pi),Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Times(b,g,n,Rt(Times(Plus(m,C1),Power(Times(b,n),CN1)),C2),Power(E,Times(a,Plus(m,C1),Power(Times(b,n),CN1))),Power(Times(c,Power(Plus(d,Times(e,x)),n)),Times(Plus(m,C1),Power(n,CN1)))),CN1),Erfi(Times(Rt(Times(Plus(m,C1),Power(Times(b,n),CN1)),C2),Sqrt(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))))))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(CN1,d,g)))),NonzeroQ(Plus(m,C1))),PosQ(Times(Plus(m,C1),Power(Times(b,n),CN1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),CN1D2),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Pi),Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Times(b,g,n,Rt(Times(CN1,Plus(m,C1),Power(Times(b,n),CN1)),C2),Power(E,Times(a,Plus(m,C1),Power(Times(b,n),CN1))),Power(Times(c,Power(Plus(d,Times(e,x)),n)),Times(Plus(m,C1),Power(n,CN1)))),CN1),Erf(Times(Rt(Times(CN1,Plus(m,C1),Power(Times(b,n),CN1)),C2),Sqrt(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))))))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(CN1,d,g)))),NonzeroQ(Plus(m,C1))),NegQ(Times(Plus(m,C1),Power(Times(b,n),CN1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1)),Power(Times(b,g,n,Plus(p,C1)),CN1)),Times(CN1,Plus(m,C1),Power(Times(b,n,Plus(p,C1)),CN1),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),ZeroQ(Plus(Times(e,f),Times(CN1,d,g)))),NonzeroQ(Plus(m,C1))),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(g,Plus(m,C1),Power(E,Times(a,Plus(m,C1),Power(Times(b,n),CN1))),Power(Times(c,Power(Plus(d,Times(e,x)),n)),Times(Plus(m,C1),Power(n,CN1))),Power(Times(CN1,Plus(m,C1),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(b,n),CN1)),p)),CN1),Gamma(Plus(p,C1),Times(CN1,Plus(m,C1),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(b,n),CN1)))),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n,p),x),ZeroQ(Plus(Times(e,f),Times(CN1,d,g)))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(f,Times(g,x)),Plus(m,C1)),Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Power(Times(g,Plus(m,C1)),CN1)),Times(CN1,b,e,n,Power(Times(g,Plus(m,C1)),CN1),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Plus(d,Times(e,x)),CN1)),x))),And(And(FreeQ(List(a,b,c,d,e,f,g,m,n),x),NonzeroQ(Plus(Times(e,f),Times(CN1,d,g)))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(d,Times(e,x)),Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(e,Plus(m,C1)),CN1)),Times(m,Plus(Times(e,f),Times(CN1,d,g)),Power(Times(e,Plus(m,C1)),CN1),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x)),Times(CN1,b,n,p,Power(Plus(m,C1),CN1),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),NonzeroQ(Plus(Times(e,f),Times(CN1,d,g)))),RationalQ(m,p)),Greater(p,C0)),Greater(m,C0)))),
SetDelayed(Int(Times(Log(Times(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(c,true))),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Times(CN1,Power(g,CN1),PolyLog(C2,Times(CN1,Together(Times(c,e,Power(g,CN1))),Plus(f,Times(g,x))))),And(FreeQ(List(c,d,e,f,g),x),ZeroQ(Plus(g,Times(c,Plus(Times(e,f),Times(CN1,d,g)))))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(g,CN1),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Log(Times(e,Plus(f,Times(g,x)),Power(Plus(Times(e,f),Times(CN1,d,g)),CN1)))),Times(CN1,b,e,n,p,Power(g,CN1),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1))),Log(Times(e,Plus(f,Times(g,x)),Power(Plus(Times(e,f),Times(CN1,d,g)),CN1))),Power(Plus(d,Times(e,x)),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),NonzeroQ(Plus(Times(e,f),Times(CN1,d,g)))),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN2)),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(d,Times(e,x)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(Plus(Times(e,f),Times(CN1,d,g)),Plus(f,Times(g,x))),CN1)),Times(CN1,b,e,n,p,Power(Plus(Times(e,f),Times(CN1,d,g)),CN1),Int(Times(Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1))),Power(Plus(f,Times(g,x)),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),NonzeroQ(Plus(Times(e,f),Times(CN1,d,g)))),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(d,Times(e,x)),Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p),Power(Times(Plus(Times(e,f),Times(CN1,d,g)),Plus(m,C1)),CN1)),Times(e,Plus(m,C2),Power(Times(Plus(Times(e,f),Times(CN1,d,g)),Plus(m,C1)),CN1),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x)),Times(b,e,n,p,Power(Times(Plus(Times(e,f),Times(CN1,d,g)),Plus(m,C1)),CN1),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,C1)),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),NonzeroQ(Plus(Times(e,f),Times(CN1,d,g)))),RationalQ(m,p)),Greater(p,C0)),Less(m,CN1)),Unequal(m,CN2)))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),CN1),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),CN1)),x),x),And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),NonzeroQ(Plus(Times(e,f),Times(CN1,d,g)))),PositiveIntegerQ(m)))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(d,Times(e,x)),Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1)),Power(Times(b,e,n,Plus(p,C1)),CN1)),Times(m,Plus(Times(e,f),Times(CN1,d,g)),Power(Times(b,e,n,Plus(p,C1)),CN1),Int(Times(Power(Plus(f,Times(g,x)),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1))),x)),Times(CN1,Plus(m,C1),Power(Times(b,n,Plus(p,C1)),CN1),Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n),x),NonzeroQ(Plus(Times(e,f),Times(CN1,d,g)))),RationalQ(m,p)),Less(p,CN1)),Greater(m,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x),x),And(And(FreeQ(List(a,b,c,d,e,f,g,n,p),x),NonzeroQ(Plus(Times(e,f),Times(CN1,d,g)))),PositiveIntegerQ(m)))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power($p(v),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power($p(u),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(Times(Power(ExpandToSum(u,x),m),Power(Plus(a,Times(b,Log(Times(c,Power(ExpandToSum(v,x),n))))),p)),x),And(And(FreeQ(List(a,b,c,m,n,p),x),LinearQ(List(u,v),x)),Not(LinearMatchQ(List(u,v),x))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power(Plus(Times(Power($p(x),$p(q)),$p(e,true)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(q)),$p(g,true)),$p(f,true)),$p(m,true)),Power($p(x),$p("q1",true))),$p(x,SymbolHead)),
    Condition(Times(Power(q,CN1),Subst(Int(Times(Power(Plus(f,Times(g,x)),m),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),x),x,Power(x,q))),And(FreeQ(List(a,b,c,d,e,f,g,m,n,p,q),x),ZeroQ(Plus($s("q1"),Times(CN1,Plus(q,Times(CN1,C1)))))))),
SetDelayed(Int(Times(Log(Times(Plus(Times($p(i,true),$p(x)),$p(h,true)),$p(j,true))),Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,PolyLog(C2,Together(Plus(C1,Times(CN1,j,Plus(h,Times(i,x)))))),Power(g,CN1),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),Times(b,e,n,p,Power(g,CN1),Int(Times(PolyLog(C2,Together(Plus(C1,Times(CN1,j,Plus(h,Times(i,x)))))),Power(Plus(d,Times(e,x)),CN1),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1)))),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,h,i,j,n),x),RationalQ(p)),Greater(p,C0)),ZeroQ(Plus(g,Times(CN1,j,Plus(Times(g,h),Times(CN1,f,i)))))))),
SetDelayed(Int(Times(Log(Plus(C1,Times(Power(Plus(Times($p(i,true),$p(x)),$p(h,true)),$p(m,true)),$p(j,true)))),Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,PolyLog(C2,Times(CN1,j,Power(Plus(h,Times(i,x)),m))),Power(Times(g,m),CN1),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),Times(b,e,n,p,Power(Times(g,m),CN1),Int(Times(PolyLog(C2,Times(CN1,j,Power(Plus(h,Times(i,x)),m))),Power(Plus(d,Times(e,x)),CN1),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1)))),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,h,i,j,m,n),x),RationalQ(p)),Greater(p,C0)),ZeroQ(Plus(Times(g,h),Times(CN1,f,i)))))),
SetDelayed(Int(Times(PolyLog($p(q),Times(Power(Plus(Times($p(i,true),$p(x)),$p(h,true)),$p(m,true)),$p(j,true))),Power(Plus(Times(Log(Times(Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(PolyLog(Plus(q,C1),Times(j,Power(Plus(h,Times(i,x)),m))),Power(Times(g,m),CN1),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),p)),Times(CN1,b,e,n,p,Power(Times(g,m),CN1),Int(Times(PolyLog(Plus(q,C1),Times(j,Power(Plus(h,Times(i,x)),m))),Power(Plus(d,Times(e,x)),CN1),Power(Plus(a,Times(b,Log(Times(c,Power(Plus(d,Times(e,x)),n))))),Plus(p,Times(CN1,C1)))),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,h,i,j,m,n,q),x),RationalQ(p)),Greater(p,C0)),ZeroQ(Plus(Times(g,h),Times(CN1,f,i)))))),
SetDelayed(Int(Times(Power(Plus(Times(Log(Times(Power($p(v),$p(n,true)),$p(c,true))),$p(b,true)),$p(a,true)),$p(p,true)),$p(u,true)),$p(x,SymbolHead)),
    Condition(Int(Times(u,Power(Plus(a,Times(b,Log(Times(c,Power(ExpandToSum(v,x),n))))),p)),x),And(And(FreeQ(List(a,b,c,n,p),x),LinearQ(v,x)),Not(LinearMatchQ(v,x))))),
SetDelayed(Int(Log(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),$p(c,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Log(Times(c,Power(Plus(a,Times(b,Power(x,n))),p)))),Times(CN1,b,n,p,Int(Times(Power(x,n),Power(Plus(a,Times(b,Power(x,n))),CN1)),x))),FreeQ(List(a,b,c,n,p),x))),
SetDelayed(Int(Times(Log(Times(Plus(Times(Power($p(x),$p(n,true)),$p(b,true)),$p(a)),$p(c,true))),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Times(CN1,PolyLog(C2,Times(CN1,b,c,Power(x,n))),Power(n,CN1)),And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(Times(a,c),Times(CN1,C1)))))),
SetDelayed(Int(Times(Log(Times(Plus(Times(Power($p(x),$p(n,true)),$p(b,true)),$p(a)),$p(c,true))),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Log(Times(a,c)),Log(x)),Int(Times(Log(Plus(C1,Times(b,Power(x,n),Power(a,CN1)))),Power(x,CN1)),x)),And(And(FreeQ(List(a,b,c,n),x),PositiveQ(Times(a,c))),NonzeroQ(Plus(Times(a,c),Times(CN1,C1)))))),
SetDelayed(Int(Times(Log(Times(Power(Plus(Times(Power($p(x),$p(n,true)),$p(b,true)),$p(a)),$p(p,true)),$p(c,true))),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Log(Times(c,Power(Plus(a,Times(b,Power(x,n))),p))),Log(Times(CN1,b,Power(x,n),Power(a,CN1))),Power(n,CN1)),Times(CN1,b,p,Int(Times(Power(x,Plus(n,Times(CN1,C1))),Log(Times(CN1,b,Power(x,n),Power(a,CN1))),Power(Plus(a,Times(b,Power(x,n))),CN1)),x))),And(FreeQ(List(a,b,c,n,p),x),Not(PositiveQ(Times(a,c)))))),
SetDelayed(Int(Times(Log(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),$p(c,true))),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(n,CN1),Subst(Int(Log(Times(c,Power(Plus(a,Times(b,x)),p))),x),x,Power(x,n))),And(FreeQ(List(a,b,c,n,p),x),ZeroQ(Plus(m,Times(CN1,Plus(n,Times(CN1,C1)))))))),
SetDelayed(Int(Times(Log(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),$p(c,true))),Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Log(Plus(d,Times(e,x))),Log(Times(c,Power(Plus(a,Times(b,Power(x,n))),p))),Power(e,CN1)),Times(CN1,b,n,p,Power(e,CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Log(Plus(d,Times(e,x))),Power(Plus(a,Times(b,Power(x,n))),CN1)),x))),FreeQ(List(a,b,c,d,e,p),x))),
SetDelayed(Int(Times(Log(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),$p(c,true))),Power(Plus(Times($p(e,true),$p(x)),$p(d,true)),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(d,Times(e,x)),Plus(m,C1)),Log(Times(c,Power(Plus(a,Times(b,Power(x,n))),p))),Power(Times(e,Plus(m,C1)),CN1)),Times(CN1,b,n,p,Power(Times(e,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Plus(d,Times(e,x)),Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),CN1)),x))),And(FreeQ(List(a,b,c,d,e,m,n,p),x),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Log(Times(Power($p(v),$p(p,true)),$p(c,true))),$p(u,true)),$p(x,SymbolHead)),
    Condition(Int(Times(u,Log(Times(c,Power(ExpandToSum(v,x),p)))),x),And(And(FreeQ(List(c,p),x),BinomialQ(v,x)),Not(BinomialMatchQ(v,x))))),
SetDelayed(Int(Power(Log(Times(Power(Plus(Times(Power($p(x),C2),$p(b,true)),$p(a)),$p(n,true)),$p(c,true))),$p(p)),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Power(Log(Times(c,Power(Plus(a,Times(b,Power(x,C2))),n))),p)),Times(CN1,C2,b,n,p,Int(Times(Power(x,C2),Power(Log(Times(c,Power(Plus(a,Times(b,Power(x,C2))),n))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,C2))),CN1)),x))),And(FreeQ(List(a,b,c,n),x),PositiveIntegerQ(p)))),
SetDelayed(Int(Times(Power(Log(Times(Power(Plus(Times(Power($p(x),C2),$p(b,true)),$p(a)),$p(n,true)),$p(c,true))),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Log(Times(c,Power(Plus(a,Times(b,Power(x,C2))),n))),p),Power(Plus(m,C1),CN1)),Times(CN1,C2,b,n,p,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,C2)),Power(Log(Times(c,Power(Plus(a,Times(b,Power(x,C2))),n))),Plus(p,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,C2))),CN1)),x))),And(And(FreeQ(List(a,b,c,m,n),x),PositiveIntegerQ(p)),Not(IntegerQ(Times(C1D2,Plus(m,Times(CN1,C1)))))))),
SetDelayed(Int(Times(Power(Log(Times(Power(Times(Plus(Times($p(b,true),$p(x)),$p(a,true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),CN1),$p("e1",true)),$p(n,true)),$p(e,true))),$p(p,true)),$p(u,true)),$p(x,SymbolHead)),
    Condition(Times(Power(Log(Times(e,Power(Times($s("e1"),b,Power(d,CN1)),n))),p),Int(u,x)),And(FreeQ(List(a,b,c,d,e,n,p,$s("e1")),x),ZeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
SetDelayed(Int(Power(Log(Times(Power(Times(Power(Plus(Times($p(b,true),$p(x)),$p(a,true)),$p("n1",true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),$p("n2")),$p("e1",true)),$p(n,true)),$p(e,true))),$p(p,true)),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(a,Times(b,x)),Power(b,CN1),Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))),p)),Times(CN1,n,$s("n1"),p,Plus(Times(b,c),Times(CN1,a,d)),Power(b,CN1),Int(Times(Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))),Plus(p,Times(CN1,C1))),Power(Plus(c,Times(d,x)),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,n,$s("e1"),$s("n1")),x),ZeroQ(Plus($s("n1"),$s("n2")))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PositiveIntegerQ(p)))),
SetDelayed(Int(Times(Log(Times(Plus(Times($p(b,true),$p(x)),$p(a,true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),CN1),$p(e,true))),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Times(Power(g,CN1),PolyLog(C2,Times(Together(Plus(c,Times(CN1,a,e))),Power(Plus(c,Times(d,x)),CN1)))),And(And(And(FreeQ(List(a,b,c,d,e,f,g),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,f),Times(CN1,c,g)))),ZeroQ(Plus(d,Times(CN1,b,e)))))),
SetDelayed(Int(Times(Power(Log(Times(Power(Times(Power(Plus(Times($p(b,true),$p(x)),$p(a,true)),$p("n1",true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),$p("n2")),$p("e1",true)),$p(n,true)),$p(e,true))),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(g,CN1),Log(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(Times(b,Plus(c,Times(d,x))),CN1))),Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))),p)),Times(n,$s("n1"),p,Plus(Times(b,c),Times(CN1,a,d)),Power(g,CN1),Int(Times(Log(Times(Plus(Times(b,c),Times(CN1,a,d)),Power(Times(b,Plus(c,Times(d,x))),CN1))),Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),CN1),Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,$s("e1"),$s("n1")),x),ZeroQ(Plus($s("n1"),$s("n2")))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,f),Times(CN1,c,g)))),PositiveIntegerQ(p)))),
SetDelayed(Int(Times(Power(Log(Times(Power(Times(Power(Plus(Times($p(b,true),$p(x)),$p(a,true)),$p("n1",true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),$p("n2")),$p("e1",true)),$p(n,true)),$p(e,true))),$p(p,true)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(g,CN1),Log(Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(Times(d,Plus(a,Times(b,x))),CN1))),Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))),p)),Times(n,$s("n1"),p,Plus(Times(b,c),Times(CN1,a,d)),Power(g,CN1),Int(Times(Log(Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(Times(d,Plus(a,Times(b,x))),CN1))),Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),CN1),Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,$s("e1"),$s("n1")),x),ZeroQ(Plus($s("n1"),$s("n2")))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(b,f),Times(CN1,a,g)))),PositiveIntegerQ(p)))),
SetDelayed(Int(Times(Log(Times(Power(Times(Power(Plus(Times($p(b,true),$p(x)),$p(a,true)),$p("n1",true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),$p("n2")),$p("e1",true)),$p(n,true)),$p(e,true))),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Log(Plus(f,Times(g,x))),Power(g,CN1),Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n)))),Times(CN1,n,$s("n1"),Plus(Times(b,c),Times(CN1,a,d)),Power(g,CN1),Int(Times(Log(Plus(f,Times(g,x))),Power(Times(Plus(a,Times(b,x)),Plus(c,Times(d,x))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,$s("e1"),$s("n1")),x),ZeroQ(Plus($s("n1"),$s("n2")))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(d,f),Times(CN1,c,g)))))),
SetDelayed(Int(Times(Power(Log(Times(Power(Times(Power(Plus(Times($p(b,true),$p(x)),$p(a,true)),$p("n1",true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),$p("n2")),$p("e1",true)),$p(n,true)),$p(e,true))),$p(p)),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(d,Power(g,CN1),Int(Times(Power(Plus(c,Times(d,x)),CN1),Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))),p)),x)),Times(CN1,Plus(Times(d,f),Times(CN1,c,g)),Power(g,CN1),Int(Times(Power(Times(Plus(c,Times(d,x)),Plus(f,Times(g,x))),CN1),Power(Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))),p)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,$s("e1"),$s("n1")),x),ZeroQ(Plus($s("n1"),$s("n2")))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(d,f),Times(CN1,c,g)))),IntegerQ(p)),Greater(p,C1)))),
SetDelayed(Int(Times(Power(Log(Times(Plus(Times($p(b,true),$p(x)),$p(a,true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),CN1),$p(e,true))),CN1),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN2)),$p(x,SymbolHead)),
    Condition(Times(Power(d,C2),Power(Times(Plus(Times(b,c),Times(CN1,a,d)),e,Power(g,C2)),CN1),LogIntegral(Times(e,Plus(a,Times(b,x)),Power(Plus(c,Times(d,x)),CN1)))),And(And(FreeQ(List(a,b,c,d,e,f,g),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,f),Times(CN1,c,g)))))),
SetDelayed(Int(Times(Power(Log(Times(Power(Times(Power(Plus(Times($p(b,true),$p(x)),$p(a,true)),$p("n1",true)),Power(Plus(Times($p(d,true),$p(x)),$p(c,true)),$p("n2")),$p("e1",true)),$p(n,true)),$p(e,true))),CN1),Power(Plus(Times($p(g,true),$p(x)),$p(f,true)),CN2)),$p(x,SymbolHead)),
    Condition(Times(Power(d,C2),Plus(a,Times(b,x)),Power(Times(Power(g,C2),n,$s("n1"),Plus(Times(b,c),Times(CN1,a,d)),Plus(c,Times(d,x))),CN1),ExpIntegralEi(Times(Power(Times(n,$s("n1")),CN1),Log(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Power(Plus(c,Times(d,x)),$s("n1")),CN1)),n))))),Power(Power(Times(e,Power(Times($s("e1"),Power(Plus(a,Times(b,x)),$s("n1")),Power(Plus(c,Times(d,x)),$s("n2"))),n)),Power(Times(n,$s("n1")),CN1)),CN1)),And(And(And(FreeQ(List(a,b,c,d,e,f,g,n,$s("e1"),$s("n1")),x),ZeroQ(Plus($s("n1"),$s("n2")))),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(d,f),Times(CN1,c,g))))))
  );
}
