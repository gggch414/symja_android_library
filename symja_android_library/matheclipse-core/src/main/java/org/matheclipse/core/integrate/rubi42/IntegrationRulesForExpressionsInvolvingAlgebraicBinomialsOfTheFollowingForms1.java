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
public class IntegrationRulesForExpressionsInvolvingAlgebraicBinomialsOfTheFollowingForms1 { 
  public static IAST RULES = List( 
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q),Power(x,CN1)),x),x,Power(x,n))),And(And(And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p,q)),Less(Less(CN1,p),C1)),Less(Less(CN1,q),C1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,CN1))),Times(CN1,C1))),Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),x),x,Power(x,n))),And(And(FreeQ(List(a,b,c,d,m,n,p,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PositiveIntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(m,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,Simplify(Times(n,Power(Plus(m,C1),CN1)))))),p),Power(Plus(c,Times(d,Power(x,Simplify(Times(n,Power(Plus(m,C1),CN1)))))),q)),x),x,Power(x,Plus(m,C1)))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(m,C1))),PositiveIntegerQ(Simplify(Times(n,Power(Plus(m,C1),CN1))))),RationalQ(p,q)),And(LessEqual(CN1,p),Less(p,C0))),And(LessEqual(CN1,q),Less(q,C0))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(c,Log(x),Power(a,CN1)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(a,CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,n))),CN1)),x))),And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(c,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(m,C1)),CN1)),And(And(And(FreeQ(List(a,b,c,d,m,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),ZeroQ(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Plus(c,Times(d,Power(x,n)))),x),x),And(And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))))),PositiveIntegerQ(n,p)),Or(Or(Or(Not(IntegerQ(Times(Plus(m,C1),Power(n,CN1)))),Equal(p,C1)),Less(Less(Times(CN1,n,Plus(p,C1)),m),CN1)),Less(m,Times(CN3,n,C1D2,Plus(p,C1))))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(c,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(m,C1)),CN1)),Times(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times(a,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,n)),Power(Plus(a,Times(b,Power(x,n))),p)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,m,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))))),RationalQ(m,n)),Less(m,CN1)),Greater(n,C0)),Not(And(IntegerQ(p),Less(p,CN1)))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,b,n,Plus(p,C1)),CN1)),Times(CN1,Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times(a,b,n,Plus(p,C1)),CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))))),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(d,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Plus(m,Times(n,Plus(p,C1)),C1)),CN1)),Times(CN1,Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))),Power(Times(b,Plus(m,Times(n,Plus(p,C1)),C1)),CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p)),x))),And(And(And(FreeQ(List(a,b,c,d,m,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))))),NonzeroQ(Plus(m,Times(n,Plus(p,C1)),C1))))),
SetDelayed(Int(Times(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Plus(c,Times(d,Power(x,n)))),x),x),And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(Times(a,d,Plus(m,C1)),Times(CN1,b,c,Plus(m,Times(n,Plus(p,C1)),C1))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),CN1),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Log(x),Power(Times(a,c),CN1)),Times(CN1,Power(b,C2),Power(Times(a,Plus(Times(b,c),Times(CN1,a,d))),CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,n))),CN1)),x)),Times(Power(d,C2),Power(Times(c,Plus(Times(b,c),Times(CN1,a,d))),CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Plus(c,Times(d,Power(x,n))),CN1)),x))),And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(b,Power(Plus(Times(b,c),Times(CN1,a,d)),CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),CN1)),x)),Times(CN1,d,Power(Plus(Times(b,c),Times(CN1,a,d)),CN1),Int(Times(Power(x,m),Power(Plus(c,Times(d,Power(x,n))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n)),Less(Less(CN1,m),n)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,a,Power(Plus(Times(b,c),Times(CN1,a,d)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Plus(a,Times(b,Power(x,n))),CN1)),x)),Times(c,Power(Plus(Times(b,c),Times(CN1,a,d)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Plus(c,Times(d,Power(x,n))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),Or(Or(And(RationalQ(m,n),LessEqual(LessEqual(n,m),Plus(Times(C2,n),Times(CN1,C1)))),ZeroQ(Plus(m,Times(CN1,n)))),ZeroQ(Plus(m,Times(CN1,C2,n),C1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),CN1D2),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(a,CN1),Int(Power(Times(x,Sqrt(Plus(c,Times(d,Power(x,n))))),CN1),x)),Times(CN1,b,Power(a,CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Times(Plus(a,Times(b,Power(x,n))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x))),And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),CN1D2),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,CN1)),C2))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,CN1)),C2)))),Plus(Times(r,Power(Times(C2,a),CN1),Int(Times(Power(x,m),Power(Times(Plus(r,Times(s,Power(x,Times(C1D2,n)))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x)),Times(r,Power(Times(C2,a),CN1),Int(Times(Power(x,m),Power(Times(Plus(r,Times(CN1,s,Power(x,Times(C1D2,n)))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x)))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PositiveIntegerQ(m,Times(C1D2,n))),Less(m,Times(C1D2,n))),CoprimeQ(Plus(m,C1),n)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),CN1D2),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Module(List(Set(r,Numerator(Rt(Times(CN1,a,Power(b,CN1)),C2))),Set(s,Denominator(Rt(Times(CN1,a,Power(b,CN1)),C2)))),Plus(Times(s,Power(Times(C2,b),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1D2,n))),Power(Times(Plus(r,Times(s,Power(x,Times(C1D2,n)))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x)),Times(CN1,s,Power(Times(C2,b),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1D2,n))),Power(Times(Plus(r,Times(CN1,s,Power(x,Times(C1D2,n)))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x)))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PositiveIntegerQ(m,Times(C1D2,n))),And(LessEqual(Times(C1D2,n),m),Less(m,n))),CoprimeQ(Plus(m,C1),n)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),CN1D2),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(b,CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Sqrt(Plus(c,Times(d,Power(x,n)))),CN1)),x)),Times(CN1,a,Power(b,CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Times(Plus(a,Times(b,Power(x,n))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PositiveIntegerQ(n,m)),Less(Less(n,Plus(m,C1)),Times(C2,n))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),C1D2),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(c,Power(a,CN1),Int(Power(Times(x,Sqrt(Plus(c,Times(d,Power(x,n))))),CN1),x)),Times(CN1,Plus(Times(b,c),Times(CN1,a,d)),Power(a,CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Times(Plus(a,Times(b,Power(x,n))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x))),And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),C1D2),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(d,Power(b,CN1),Int(Times(Power(x,m),Power(Sqrt(Plus(c,Times(d,Power(x,n)))),CN1)),x)),Times(Plus(Times(b,c),Times(CN1,a,d)),Power(b,CN1),Int(Times(Power(x,m),Power(Times(Plus(a,Times(b,Power(x,n))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n)),Less(Less(CN1,m),Plus(n,Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1D2),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),CN1D2),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Times(CN2,Power(Times(a,n,Rt(Times(c,Power(a,CN1)),C2)),CN1),ArcTanh(Times(Rt(Times(c,Power(a,CN1)),C2),Sqrt(Plus(a,Times(b,Power(x,n)))),Power(Sqrt(Plus(c,Times(d,Power(x,n)))),CN1)))),And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PosQ(Times(c,Power(a,CN1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1D2),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),CN1D2),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Times(CN2,Power(Times(a,n,Rt(Times(CN1,c,Power(a,CN1)),C2)),CN1),ArcTan(Times(Rt(Times(CN1,c,Power(a,CN1)),C2),Sqrt(Plus(a,Times(b,Power(x,n)))),Power(Sqrt(Plus(c,Times(d,Power(x,n)))),CN1)))),And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NegQ(Times(c,Power(a,CN1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),CN1D2),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c)),CN1D2),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(b,CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Sqrt(Plus(a,Times(b,Power(x,n)))),Power(Sqrt(Plus(c,Times(d,Power(x,n)))),CN1)),x)),Times(CN1,a,Power(b,CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Times(Sqrt(Plus(a,Times(b,Power(x,n)))),Sqrt(Plus(c,Times(d,Power(x,n))))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),PositiveIntegerQ(n,m)),Less(Less(n,Plus(m,C1)),Times(C2,n))),Not(And(Equal(n,C2),SimplerSqrtQ(Times(CN1,b,Power(a,CN1)),Times(CN1,d,Power(c,CN1)))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x),And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),Or(And(And(IntegersQ(m,p,q),GreaterEqual(p,CN2)),Or(GreaterEqual(q,CN2),And(Equal(q,CN3),OddQ(m)))),PositiveIntegerQ(p,q))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,CN1))),Times(CN1,C1))),Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),x),x,Power(x,n))),And(And(And(And(FreeQ(List(a,b,c,d,m,n,p,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(m,Times(n,Plus(p,C1)),C1))),NegativeIntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))),Or(Not(IntegerQ(p)),And(And(Not(PositiveIntegerQ(n)),Not(NegativeIntegerQ(p))),Or(RationalQ(n),Less(Less(C0,p),Times(CN1,Simplify(Times(Plus(m,C1),Power(n,CN1))))))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(CN1,Power(Plus(m,C1),CN1),Subst(Int(Times(Power(Plus(a,Times(b,Power(x,Simplify(Times(CN1,n,Power(Plus(m,C1),CN1)))))),p),Power(Plus(c,Times(d,Power(x,Simplify(Times(CN1,n,Power(Plus(m,C1),CN1)))))),q),Power(Power(x,C2),CN1)),x),x,Power(x,Times(CN1,Plus(m,C1))))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(m,C1))),NegativeIntegerQ(Simplify(Plus(Times(n,Power(Plus(m,C1),CN1)),C1)))),RationalQ(p,q)),And(LessEqual(CN1,p),Less(p,C0))),And(LessEqual(CN1,q),Less(q,C0))),Not(IntegerQ(n))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(n,CN1)),Times(CN1,C1))),Power(Plus(a,Times(b,x)),p),Power(Plus(c,Times(d,x)),q)),x),x,Power(x,n))),And(And(And(And(And(And(FreeQ(List(a,b,c,d,m,p,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(m,Times(CN1,n),C1))),RationalQ(n)),Less(Less(CN1,n),C1)),Not(And(NegativeIntegerQ(p),NegativeIntegerQ(Times(Plus(m,C1),Power(n,CN1)))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,Gcd(Plus(m,C1),n))),Condition(Times(Power(g,CN1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(g,CN1)),Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,Times(n,Power(g,CN1))))),p),Power(Plus(c,Times(d,Power(x,Times(n,Power(g,CN1))))),q)),x),x,Power(x,g))),Unequal(g,C1))),And(And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n,p,q)),Less(Less(C0,m),Plus(Times(C2,n),Times(CN1,C1)))),And(LessEqual(CN1,p),Less(p,C0))),And(LessEqual(CN1,q),Less(q,C0))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),C2),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(c,C2),Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,n)),Simp(Plus(Times(b,Power(c,C2),n,Plus(p,C1)),Times(c,Plus(Times(b,c),Times(CN1,C2,a,d)),Plus(m,C1)),Times(CN1,a,Plus(m,C1),Power(d,C2),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p)),x))),And(And(And(And(FreeQ(List(a,b,c,d,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n)),Less(m,CN1)),Greater(n,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),C2),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(Plus(Times(b,c),Times(CN1,a,d)),C2),Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(a,Power(b,C2),n,Plus(p,C1)),CN1)),Times(Power(Times(a,Power(b,C2),n,Plus(p,C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(Power(Plus(Times(b,c),Times(CN1,a,d)),C2),Plus(m,C1)),Times(Power(b,C2),Power(c,C2),n,Plus(p,C1)),Times(a,b,Power(d,C2),n,Plus(p,C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1))),x))),And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),C2),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(d,C2),Power(x,Plus(m,n,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Times(b,Plus(m,Times(n,Plus(p,C2)),C1)),CN1)),Times(Power(Times(b,Plus(m,Times(n,Plus(p,C2)),C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(b,Power(c,C2),Plus(m,Times(n,Plus(p,C2)),C1)),Times(d,Plus(Times(Plus(Times(C2,b,c),Times(CN1,a,d)),Plus(m,n,C1)),Times(C2,b,c,n,Plus(p,C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p)),x))),And(And(FreeQ(List(a,b,c,d,m,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(m,Times(n,Plus(p,C2)),C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(b,n,Plus(p,C1)),CN1)),Times(CN1,Power(Times(b,n,Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Simp(Plus(Times(c,Plus(m,Times(CN1,n),C1)),Times(d,Plus(m,Times(n,Plus(q,Times(CN1,C1))),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n,p,q)),Less(Less(C0,n),Plus(m,C1))),Less(p,CN1)),Greater(q,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(Times(c,b),Times(CN1,a,d)),Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1))),Power(Times(a,b,n,Plus(p,C1)),CN1)),Times(Power(Times(a,b,n,Plus(p,C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(c,Plus(Times(c,b,n,Plus(p,C1)),Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)))),Times(d,Plus(Times(c,b,n,Plus(p,C1)),Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,Times(n,Plus(q,Times(CN1,C1))),C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p,q)),Less(p,CN1)),Greater(q,C1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,n,Plus(p,C1)),CN1)),Times(Power(Times(a,n,Plus(p,C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(c,Plus(m,Times(n,Plus(p,C1)),C1)),Times(d,Plus(m,Times(n,Plus(p,q,C1)),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p,q)),Less(p,CN1)),And(Less(C0,q),LessEqual(q,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,a,Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(b,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),CN1)),Times(Power(Times(b,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Simp(Plus(Times(a,c,Plus(m,Times(CN1,C2,n),C1)),Times(Plus(Times(a,d,Plus(m,Times(CN1,n),Times(n,q),C1)),Times(b,c,n,Plus(p,C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q)),x))),And(And(And(And(FreeQ(List(a,b,c,d,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n,p)),Less(Less(C0,Times(C2,n)),Plus(m,C1))),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),CN1)),Times(CN1,Power(Times(n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Simp(Plus(Times(c,Plus(m,Times(CN1,n),C1)),Times(d,Plus(m,Times(n,Plus(p,q,C1)),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q)),x))),And(And(And(And(FreeQ(List(a,b,c,d,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n,p)),And(Less(Less(C0,n),Plus(m,C1)),LessEqual(Plus(m,C1),Times(C2,n)))),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(m,C1),CN1)),Times(CN1,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,n)),Simp(Plus(Times(n,Plus(Times(b,c,p),Times(a,d,q))),Times(b,d,n,Plus(p,q),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,Times(CN1,C1))),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n,p,q)),Less(m,CN1)),Greater(n,C0)),Greater(p,C0)),Greater(q,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(c,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1))),Power(Times(a,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,n)),Simp(Plus(Times(c,Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(c,n,Plus(Times(b,c,Plus(p,C1)),Times(a,d,Plus(q,Times(CN1,C1))))),Times(d,Plus(Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(c,b,n,Plus(p,q))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C2)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n,q)),Less(m,CN1)),Greater(n,C0)),Greater(q,C1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(a,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,n)),Simp(Plus(Times(c,b,Plus(m,C1)),Times(n,Plus(Times(b,c,Plus(p,C1)),Times(a,d,q))),Times(d,Plus(Times(b,Plus(m,C1)),Times(b,n,Plus(p,q,C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n,q)),Less(m,CN1)),Greater(n,C0)),And(Less(C0,q),LessEqual(q,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Plus(m,Times(n,Plus(p,q)),C1),CN1)),Times(n,Power(Plus(m,Times(n,Plus(p,q)),C1),CN1),Int(Times(Power(x,m),Simp(Plus(Times(a,c,Plus(p,q)),Times(Plus(Times(q,Plus(Times(b,c),Times(CN1,a,d))),Times(a,d,Plus(p,q))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,Times(CN1,C1))),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,m,n),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p,q)),Greater(p,C0)),Greater(q,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(d,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1))),Power(Times(b,Plus(m,Times(n,Plus(p,q)),C1)),CN1)),Times(Power(Times(b,Plus(m,Times(n,Plus(p,q)),C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(c,Plus(Times(Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(c,b,n,Plus(p,q)))),Times(Plus(Times(d,Plus(Times(c,b),Times(CN1,a,d)),Plus(m,C1)),Times(d,n,Plus(q,Times(CN1,C1)),Plus(Times(b,c),Times(CN1,a,d))),Times(c,b,d,n,Plus(p,q))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,d,m,n,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(q)),Greater(q,C1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),CN1)),Times(Power(Times(a,n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),CN1),Int(Times(Power(x,m),Simp(Plus(Times(c,b,Plus(m,C1)),Times(n,Plus(Times(b,c),Times(CN1,a,d)),Plus(p,C1)),Times(d,b,Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q)),x))),And(And(And(FreeQ(List(a,b,c,d,m,n,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(b,Plus(m,Times(n,Plus(p,q)),C1)),CN1)),Times(CN1,Power(Times(b,Plus(m,Times(n,Plus(p,q)),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Simp(Plus(Times(a,c,Plus(m,Times(CN1,n),C1)),Times(Plus(Times(a,d,Plus(m,Times(CN1,n),C1)),Times(CN1,n,q,Plus(Times(b,c),Times(CN1,a,d)))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),Plus(q,Times(CN1,C1)))),x))),And(And(And(And(FreeQ(List(a,b,c,d,p),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n,q)),Less(Less(C0,n),Plus(m,C1))),Greater(q,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(b,d,Plus(m,Times(n,Plus(p,q)),C1)),CN1)),Times(CN1,Power(Times(b,d,Plus(m,Times(n,Plus(p,q)),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Simp(Plus(Times(a,c,Plus(m,Times(CN1,C2,n),C1)),Times(Plus(Times(a,d,Plus(m,Times(n,Plus(q,Times(CN1,C1))),C1)),Times(b,c,Plus(m,Times(n,Plus(p,Times(CN1,C1))),C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x))),And(And(And(FreeQ(List(a,b,c,d,p,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n)),Less(Less(C0,Times(C2,n)),Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),Plus(p,C1)),Power(Plus(c,Times(d,Power(x,n))),Plus(q,C1)),Power(Times(a,c,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,c,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,n)),Simp(Plus(Times(Plus(Times(b,c),Times(a,d)),Plus(m,n,C1)),Times(n,Plus(Times(b,c,p),Times(a,d,q))),Times(b,d,Plus(m,Times(n,Plus(p,q,C2)),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x))),And(And(And(And(FreeQ(List(a,b,c,d,p,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),RationalQ(m,n)),Less(m,CN1)),Greater(n,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Times(Plus(m,C1),Power(Plus(C1,Times(b,Power(x,n),Power(a,CN1))),p),Power(Plus(C1,Times(d,Power(x,n),Power(c,CN1))),q)),CN1),AppellF1(Times(Plus(m,C1),Power(n,CN1)),Times(CN1,p),Times(CN1,q),Plus(C1,Times(Plus(m,C1),Power(n,CN1))),Times(CN1,b,Power(x,n),Power(a,CN1)),Times(CN1,d,Power(x,n),Power(c,CN1)))),And(And(And(FreeQ(List(a,b,c,d,m,n,p,q),x),NonzeroQ(Plus(Times(b,c),Times(CN1,a,d)))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(m,Times(CN1,n),C1))))),
SetDelayed(Int(Times(Power(Times(Power(Plus(Times(Power($p(x),$p(n,true)),$p(b,true)),$p(a,true)),$p(r,true)),$p(e,true)),$p(p)),Power(Times(Power(Plus(Times(Power($p(x),$p(n,true)),$p(d,true)),$p(c)),$p(s)),$p(f,true)),$p(q)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(e,Power(Plus(a,Times(b,Power(x,n))),r)),p),Power(Times(f,Power(Plus(c,Times(d,Power(x,n))),s)),q),Power(Times(Power(Plus(a,Times(b,Power(x,n))),Times(p,r)),Power(Plus(c,Times(d,Power(x,n))),Times(q,s))),CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),Times(p,r)),Power(Plus(c,Times(d,Power(x,n))),Times(q,s))),x)),FreeQ(List(a,b,c,d,e,f,m,n,p,q,r,s),x))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(v),$p(n)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(w),$p(n)),$p(d,true)),$p(c,true)),$p(q,true)),Power($p(u),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),CN1),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q)),x),x,v)),And(And(FreeQ(List(a,b,c,d,m,n,p,q),x),LinearPairQ(u,v,x)),ZeroQ(Plus(v,Times(CN1,w)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n,true)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(r,true)),$p(d,true)),$p(c)),$p(q,true))),$p(x,SymbolHead)),
    Condition(Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Power(x,Times(n,q)),CN1)),x),And(And(And(FreeQ(List(a,b,c,d,n,p),x),ZeroQ(Plus(n,r))),PosQ(n)),IntegerQ(q)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n,true)),$p(b,true)),$p(a,true)),$p(p,true)),Power(Plus(Times(Power($p(x),$p(r,true)),$p(d,true)),$p(c)),$p(q))),$p(x,SymbolHead)),
    Condition(Times(CN1,Subst(Int(Times(Power(Plus(b,Times(a,Power(x,n))),p),Power(Plus(c,Times(d,Power(x,n))),q),Power(Power(x,Plus(Times(n,p),C2)),CN1)),x),x,Power(x,CN1))),And(And(And(And(FreeQ(List(a,b,c,d,q),x),ZeroQ(Plus(n,r))),PosQ(n)),Not(IntegerQ(q))),IntegersQ(n,p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n,true)),$p(b,true)),$p(a,true)),$p(p)),Power(Plus(Times(Power($p(x),$p(r,true)),$p(d,true)),$p(c)),$p(q,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Times(n,q)),Power(Plus(c,Times(d,Power(Power(x,n),CN1))),q),Power(Power(Plus(d,Times(c,Power(x,n))),q),CN1),Int(Times(Power(Plus(a,Times(b,Power(x,n))),p),Power(Plus(d,Times(c,Power(x,n))),q),Power(Power(x,Times(n,q)),CN1)),x)),And(And(And(And(FreeQ(List(a,b,c,d,n,p,q),x),ZeroQ(Plus(n,r))),PosQ(n)),Not(IntegerQ(q))),Not(IntegersQ(n,p)))))
  );
}
