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
public class IntegrationRulesForExpressionsInvolvingTrigFunctionsOfTheFollowingForms4 { 
  public static IAST RULES = List( 
SetDelayed(Int(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(u,Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(u,Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),CN1),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(q,CN1),Int(Power(Plus(b,Times(CN1,q),Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),CN1),x)),Times(CN1,C2,c,Power(q,CN1),Int(Power(Plus(b,q,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),CN1),x)))),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),CN1),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(q,CN1),Int(Power(Plus(b,Times(CN1,q),Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),CN1),x)),Times(CN1,C2,c,Power(q,CN1),Int(Power(Plus(b,q,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),CN1),x)))),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2")),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Times(CN1,f,Power(e,CN1),Subst(Int(Times(Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Power(x,C2)),Times(C1D2,n))),Times(a,Power(Plus(C1,Power(x,C2)),n))),x),p),Power(Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Plus(Times(C1D2,m),Times(n,p),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),EvenQ(n)),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2")),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Times(f,Power(e,CN1),Subst(Int(Times(Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Power(x,C2)),Times(C1D2,n))),Times(a,Power(Plus(C1,Power(x,C2)),n))),x),p),Power(Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Plus(Times(C1D2,m),Times(n,p),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),EvenQ(n)),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandTrig(Times(Power($($s("§sin"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sin"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(m,n,p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandTrig(Times(Power($($s("§cos"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§cos"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§cos"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(m,n,p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power(Times($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p(n,true)),$p(b,true)),Times(Power(Times($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Times(g,Power(e,CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Power(g,C2),Power(x,C2))),Times(C1D2,Plus(m,Times(CN1,C1)))),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(g,CN1))))),And(And(FreeQ(List(a,b,c,d,e,f,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),OddQ(m)))),
SetDelayed(Int(Times(Power(Plus(Times(Power(Times($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p(n,true)),$p(b,true)),Times(Power(Times($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Times(CN1,g,Power(e,CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Power(g,C2),Power(x,C2))),Times(C1D2,Plus(m,Times(CN1,C1)))),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(g,CN1))))),And(And(FreeQ(List(a,b,c,d,e,f,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),OddQ(m)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Cos(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Sin(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2")),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Times(CN1,Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Power(x,C2)),Times(C1D2,n))),Times(a,Power(Plus(C1,Power(x,C2)),n))),x),p),Power(Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Plus(Times(C1D2,m),Times(n,p),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),EvenQ(n)),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2")),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Times(Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Power(x,C2)),Times(C1D2,n))),Times(a,Power(Plus(C1,Power(x,C2)),n))),x),p),Power(Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Plus(Times(C1D2,m),Times(n,p),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),EvenQ(n)),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandTrig(Times(Power(Plus(C1,Times(CN1,Power($($s("§sin"),Plus(d,Times(e,x))),C2))),Times(C1D2,m)),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sin"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(n,p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandTrig(Times(Power(Plus(C1,Times(CN1,Power($($s("§cos"),Plus(d,Times(e,x))),C2))),Times(C1D2,m)),Power(Plus(a,Times(b,Power($($s("§cos"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§cos"),Plus(d,Times(e,x))),Times(C2,n)))),p)),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(n,p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power(Times($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p(n)),$p(b,true)),Times(Power(Times($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p("n2",true)),$p(c,true)),$p(a)),$p(p,true)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Times(Power(g,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p),Power(Power(Plus(C1,Times(CN1,Power(g,C2),Power(x,C2))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(g,CN1))))),And(And(FreeQ(List(a,b,c,d,e,f,n),x),OddQ(m)),IntegerQ(Times(C2,p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power(Times($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p(n)),$p(b,true)),Times(Power(Times($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p("n2",true)),$p(c,true)),$p(a)),$p(p,true)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Times(CN1,Power(g,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p),Power(Power(Plus(C1,Times(CN1,Power(g,C2),Power(x,C2))),Times(C1D2,Plus(m,C1))),CN1)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(g,CN1))))),And(And(FreeQ(List(a,b,c,d,e,f,n),x),OddQ(m)),IntegerQ(Times(C2,p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2")),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Times(Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(Times(c,Power(x,Times(C2,n))),Times(b,Power(x,n),Power(Plus(C1,Power(x,C2)),Times(C1D2,n))),Times(a,Power(Plus(C1,Power(x,C2)),n))),x),p),Power(Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Plus(Times(n,p),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),EvenQ(n)),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2")),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Times(CN1,Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(Times(c,Power(x,Times(C2,n))),Times(b,Power(x,n),Power(Plus(C1,Power(x,C2)),Times(C1D2,n))),Times(a,Power(Plus(C1,Power(x,C2)),n))),x),p),Power(Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Plus(Times(n,p),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),EvenQ(n)),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandTrig(Times(Power($($s("§sin"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sin"),Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(C1,Times(CN1,Power($($s("§sin"),Plus(d,Times(e,x))),C2))),Times(C1D2,m)),CN1)),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(n,p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandTrig(Times(Power($($s("§cos"),Plus(d,Times(e,x))),m),Power(Plus(a,Times(b,Power($($s("§cos"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§cos"),Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(C1,Times(CN1,Power($($s("§cos"),Plus(d,Times(e,x))),C2))),Times(C1D2,m)),CN1)),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(n,p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power(Times($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p(n)),$p(b,true)),Times(Power(Times($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p("n2",true)),$p(c,true)),$p(a)),$p(p,true)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,FreeFactors(Sin(Plus(d,Times(e,x))),x))),Times(Power(g,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Power(g,C2),Power(x,C2))),Times(C1D2,Plus(m,Times(CN1,C1)))),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p),Power(Power(x,m),CN1)),x),x,Times(Sin(Plus(d,Times(e,x))),Power(g,CN1))))),And(And(FreeQ(List(a,b,c,d,e,f,n),x),OddQ(m)),IntegerQ(Times(C2,p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power(Times($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p(n)),$p(b,true)),Times(Power(Times($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(f,true)),$p("n2",true)),$p(c,true)),$p(a)),$p(p,true)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,FreeFactors(Cos(Plus(d,Times(e,x))),x))),Times(CN1,Power(g,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(Plus(C1,Times(CN1,Power(g,C2),Power(x,C2))),Times(C1D2,Plus(m,Times(CN1,C1)))),Power(Plus(a,Times(b,Power(Times(f,g,x),n)),Times(c,Power(Times(f,g,x),Times(C2,n)))),p),Power(Power(x,m),CN1)),x),x,Times(Cos(Plus(d,Times(e,x))),Power(g,CN1))))),And(And(FreeQ(List(a,b,c,d,e,f,n),x),OddQ(m)),IntegerQ(Times(C2,p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Sin(Plus(d,Times(e,x))),n)),Times(c,Power(Sin(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Cot(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Sin(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Cos(Plus(d,Times(e,x))),n)),Times(c,Power(Cos(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Times(Power(Tan(Plus(d,Times(e,x))),m),Power(Plus(b,Times(C2,c,Power(Cos(Plus(d,Times(e,x))),n))),Times(C2,p))),x)),And(And(And(And(FreeQ(List(a,b,c,d,e,m,n,p),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),Not(OddQ(m))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2")),$p(c,true)),$p(a)),$p(p,true)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(f,FreeFactors(Cot(Plus(d,Times(e,x))),x))),Times(CN1,Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Times(C1D2,n))),Times(a,Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),n))),x),p),Power(Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Plus(Times(n,p),C1)),CN1)),x),x,Times(Cot(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(n)),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2")),$p(c,true)),$p(a)),$p(p,true)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(f,FreeFactors(Tan(Plus(d,Times(e,x))),x))),Times(Power(f,Plus(m,C1)),Power(e,CN1),Subst(Int(Times(Power(x,m),Power(ExpandToSum(Plus(c,Times(b,Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Times(C1D2,n))),Times(a,Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),n))),x),p),Power(Power(Plus(C1,Times(Power(f,C2),Power(x,C2))),Plus(Times(n,p),C1)),CN1)),x),x,Times(Tan(Plus(d,Times(e,x))),Power(f,CN1))))),And(And(And(FreeQ(List(a,b,c,d,e,m),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(n)),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§sin"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandTrig(Times(Power(Plus(C1,Times(CN1,Power($($s("§sin"),Plus(d,Times(e,x))),C2))),Times(C1D2,m)),Power(Plus(a,Times(b,Power($($s("§sin"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§sin"),Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power($($s("§sin"),Plus(d,Times(e,x))),m),CN1)),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(n,p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cos"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),$p(p,true)),Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandTrig(Times(Power(Plus(C1,Times(CN1,Power($($s("§cos"),Plus(d,Times(e,x))),C2))),Times(C1D2,m)),Power(Plus(a,Times(b,Power($($s("§cos"),Plus(d,Times(e,x))),n)),Times(c,Power($($s("§cos"),Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power($($s("§cos"),Plus(d,Times(e,x))),m),CN1)),x),x),And(And(And(And(FreeQ(List(a,b,c,d,e),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),EvenQ(m)),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(n,p)))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a)),$p(p,true)),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a)),$p(p,true)),$p(x,SymbolHead)),
    Condition(Times(Power(Times(Power(C4,p),Power(c,p)),CN1),Int(Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a)),$p(p)),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Tan(Plus(d,Times(e,x))),n)),Times(c,Power(Tan(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Power(Plus(b,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),Times(C2,p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a)),$p(p)),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(Cot(Plus(d,Times(e,x))),n)),Times(c,Power(Cot(Plus(d,Times(e,x))),Times(C2,n)))),p),Power(Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p)),CN1),Int(Power(Plus(b,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),Times(C2,p)),x)),And(And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§tan"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),CN1),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(q,CN1),Int(Power(Plus(b,Times(CN1,q),Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),CN1),x)),Times(CN1,C2,c,Power(q,CN1),Int(Power(Plus(b,q,Times(C2,c,Power(Tan(Plus(d,Times(e,x))),n))),CN1),x)))),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Power(Plus(Times(Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p(n,true)),$p(b,true)),Times(Power($($s("§cot"),Plus(Times($p(e,true),$p(x)),$p(d,true))),$p("n2",true)),$p(c,true)),$p(a,true)),CN1),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(q,CN1),Int(Power(Plus(b,Times(CN1,q),Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),CN1),x)),Times(CN1,C2,c,Power(q,CN1),Int(Power(Plus(b,q,Times(C2,c,Power(Cot(Plus(d,Times(e,x))),n))),CN1),x)))),And(And(FreeQ(List(a,b,c,d,e,n),x),ZeroQ(Plus($s("n2"),Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c))))))
  );
}
