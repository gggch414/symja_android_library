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
public class IntegrationRulesForExpressionsInvolvingAlgebraicTrinomialsOfTheFollowingForms3 { 
  public static IAST RULES = List( 
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Power(c,p),CN1),Int(Times(Power(x,m),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(C2,c,n,Plus(Times(C2,p),C1)),CN1)),And(And(And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))),ZeroQ(Plus(m,Times(CN1,n),C1))),NonzeroQ(Plus(Times(C2,p),C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Plus(m,C1)),Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(b,Plus(m,C1)),CN1)),And(And(And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))),ZeroQ(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),C1D2),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n))))),Power(n,CN1)),Times(b,Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n))))),Log(x),Power(Plus(b,Times(C2,c,Power(x,n))),CN1))),And(And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),C1D2),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n))))),Power(Plus(b,Times(C2,c,Power(x,n))),CN1),Int(Plus(Times(b,Power(x,m)),Times(C2,c,Power(x,Plus(m,n)))),x)),And(And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(m,C1))),ZeroQ(Plus(m,n,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),C1D2),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n))))),Power(Plus(m,n,C1),CN1)),Times(b,n,Power(x,Plus(m,C1)),Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n))))),Power(Times(Plus(m,C1),Plus(m,n,C1),Plus(b,Times(C2,c,Power(x,n)))),CN1))),And(And(And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NonzeroQ(Plus(m,Times(CN1,n),C1))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(m,n,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1D2),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(x,Plus(m,C1)),Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n))))),Power(Times(a,n),CN1)),Times(CN1,b,Power(Times(C2,a),CN1),Int(Power(Times(x,Sqrt(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))))),CN1),x))),And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),ZeroQ(Plus(m,n,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(C2,a,n,Plus(p,C1),Plus(Times(C2,p),C1)),CN1)),Times(CN1,Power(x,Plus(m,C1)),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(C2,a,n,Plus(Times(C2,p),C1)),CN1))),And(And(And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))),ZeroQ(Plus(m,Times(C2,n,Plus(p,C1)),C1))),NonzeroQ(Plus(Times(C2,p),C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(C2,c,n,Plus(p,C1)),CN1)),Times(CN1,b,Power(Times(C2,c),CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x))),And(And(And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))),ZeroQ(Plus(m,Times(CN1,C2,n),C1))),NonzeroQ(Plus(p,QQ(3L,2L)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Plus(m,Times(C2,n,p),C1),CN1)),Times(n,p,Power(x,Plus(m,C1)),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1))),Power(Times(Plus(m,C1),Plus(m,Times(C2,n,p),C1)),CN1)),Times(CN1,b,p,Power(n,C2),Plus(Times(C2,p),Times(CN1,C1)),Power(Times(Plus(m,C1),Plus(m,Times(C2,n,p),C1)),CN1),Int(Times(Power(x,Plus(m,n)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n,p)),Not(IntegerQ(p))),NonzeroQ(Plus(m,Times(C2,n,p),C1))),And(LessEqual(CN2,m),Less(m,CN1))),Greater(n,C0)),Greater(p,C1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(m,Times(CN1,n,Plus(Times(C2,p),Times(CN1,C1))),C1),Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1)),Times(n,p,Power(x,Plus(m,C1)),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1))),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1)),Times(C2,c,p,Power(n,C2),Plus(Times(C2,p),Times(CN1,C1)),Power(Times(Plus(m,C1),Plus(m,n,C1)),CN1),Int(Times(Power(x,Plus(m,Times(C2,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n,p)),Not(IntegerQ(p))),NonzeroQ(Plus(m,n,C1))),Less(m,CN2)),Greater(n,C0)),Greater(p,C1)),Not(And(NegativeIntegerQ(Times(Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(n,CN1))),Greater(Plus(Times(Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(n,CN1)),p),C0)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Plus(m,Times(C2,n,p),C1),CN1)),Times(n,p,Power(x,Plus(m,C1)),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1))),Power(Times(Plus(m,Times(C2,n,p),C1),Plus(m,Times(n,Plus(Times(C2,p),Times(CN1,C1))),C1)),CN1)),Times(C2,a,Power(n,C2),p,Plus(Times(C2,p),Times(CN1,C1)),Power(Times(Plus(m,Times(C2,n,p),C1),Plus(m,Times(n,Plus(Times(C2,p),Times(CN1,C1))),C1)),CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))),NonzeroQ(Plus(m,Times(C2,n,p),C1))),NonzeroQ(Plus(m,Times(n,Plus(Times(C2,p),Times(CN1,C1))),C1))),RationalQ(p)),Greater(p,C1)),Not(And(NegativeIntegerQ(Times(Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(n,CN1))),Greater(Plus(Times(Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(n,CN1)),p),C0)))),Not(And(And(And(And(IntegersQ(m,n),Greater(m,C0)),Greater(n,C0)),Divisible(Plus(m,C1),n)),Or(Not(IntegerQ(Times(C2,p))),Less(Plus(Times(Plus(m,C1),Power(n,CN1)),Times(CN1,C1)),Times(C2,p)))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),Power(x,Plus(m,Times(CN1,n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(b,Power(n,C2),Plus(p,C1),Plus(Times(C2,p),C1)),CN1)),Times(CN1,Power(x,Plus(m,C1)),Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(b,n,Plus(Times(C2,p),C1)),CN1)),Times(CN1,Plus(m,Times(CN1,n),C1),Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),Power(Times(b,Power(n,C2),Plus(p,C1),Plus(Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n,p)),Not(IntegerQ(p))),NonzeroQ(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1))),And(Less(Less(C0,n),Plus(m,C1)),LessEqual(Plus(m,C1),Times(C2,n)))),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(m,Times(CN1,C3,n),Times(CN1,C2,n,p),C1),Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(C2,c,Power(n,C2),Plus(p,C1),Plus(Times(C2,p),C1)),CN1)),Times(CN1,Power(x,Plus(m,Times(CN1,C2,n),C1)),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(C2,c,n,Plus(Times(C2,p),C1)),CN1)),Times(Plus(m,Times(CN1,n),C1),Plus(m,Times(CN1,C2,n),C1),Power(Times(C2,c,Power(n,C2),Plus(p,C1),Plus(Times(C2,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n,p)),Not(IntegerQ(p))),NonzeroQ(Plus(m,Times(CN1,n),C1))),NonzeroQ(Plus(m,Times(CN1,C2,n),C1))),Less(Less(C0,Times(C2,n)),Plus(m,C1))),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(C2,a,Power(n,C2),Plus(p,C1),Plus(Times(C2,p),C1)),CN1)),Times(CN1,Power(x,Plus(m,C1)),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(C2,a,n,Plus(Times(C2,p),C1)),CN1)),Times(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(Times(C2,a,Power(n,C2),Plus(p,C1),Plus(Times(C2,p),C1)),CN1),Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))),NonzeroQ(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1))),NonzeroQ(Plus(m,Times(C2,n,Plus(p,C1)),C1))),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(C2,c,Plus(m,Times(C2,n,p),C1)),CN1)),Times(CN1,b,Plus(m,Times(CN1,n),C1),Power(Times(C2,c,Plus(m,Times(C2,n,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n)),Not(IntegerQ(p))),NonzeroQ(Plus(m,Times(CN1,n),C1))),NonzeroQ(Plus(m,Times(C2,n,p),C1))),Less(Less(C0,n),Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(b,Plus(m,C1)),CN1)),Times(CN1,C2,c,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),Power(Times(b,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,n)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x))),And(And(And(And(And(And(And(FreeQ(List(a,b,c,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n)),Not(IntegerQ(p))),NonzeroQ(Plus(m,Times(n,Plus(Times(C2,p),C1)),C1))),Less(m,CN1)),Greater(n,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p)),CN1),Int(Times(Power(x,m),Power(Plus(Times(C1D2,b),Times(c,Power(x,n))),Times(C2,p))),x)),And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(IntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(ExpandIntegrand(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x),And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PositiveIntegerQ(p)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p,true)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(n,CN1),Subst(Int(Power(Plus(a,Times(b,x),Times(c,Power(x,C2))),p),x),x,Power(x,n))),And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),ZeroQ(Plus(m,Times(CN1,n),C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Int(Times(Power(x,Plus(m,Times(C2,n,p))),Power(Plus(c,Times(b,Power(x,Times(CN1,n))),Times(a,Power(x,Times(CN2,n)))),p)),x),And(And(And(And(And(FreeQ(List(a,b,c,m),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),NegativeIntegerQ(p)),RationalQ(n)),Less(n,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Log(x),Power(a,CN1)),Times(CN1,Power(a,CN1),Int(Times(Power(x,Plus(n,Times(CN1,C1))),Plus(b,Times(c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1)),x))),And(And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1),Power($p(x),C2)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(a,Power(c,CN1)),C2))),Plus(Times(C1D2,Int(Times(Plus(q,Power(x,C2)),Power(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4))),CN1)),x)),Times(CN1,C1D2,Int(Times(Plus(q,Times(CN1,Power(x,C2))),Power(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4))),CN1)),x)))),And(And(FreeQ(List(a,b,c),x),NegativeQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PosQ(Times(a,c))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Times(a,c),C2))),Condition(Module(List(Set(r,Rt(Plus(Times(C2,c,q),Times(CN1,b,c)),C2))),Plus(Times(c,Power(Times(C2,r),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1D2,n))),Power(Plus(q,Times(CN1,r,Power(x,Times(C1D2,n))),Times(c,Power(x,n))),CN1)),x)),Times(CN1,c,Power(Times(C2,r),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C1D2,n))),Power(Plus(q,Times(r,Power(x,Times(C1D2,n))),Times(c,Power(x,n))),CN1)),x)))),Not(NegativeQ(Plus(Times(C2,c,q),Times(CN1,b,c)))))),And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NegativeQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PositiveIntegerQ(Times(C1D2,n))),IntegerQ(m)),CoprimeQ(Plus(m,C1),n)),Less(And(Less(C1,Times(C1D2,n)),LessEqual(Times(C1D2,n),m)),Times(C2,n))),PosQ(Times(a,c))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(q,CN1),Int(Times(Power(x,m),Power(Plus(b,Times(CN1,q),Times(C2,c,Power(x,n))),CN1)),x)),Times(CN1,C2,c,Power(q,CN1),Int(Times(Power(x,m),Power(Plus(b,q,Times(C2,c,Power(x,n))),CN1)),x)))),And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PositiveIntegerQ(n)),IntegerQ(m)),CoprimeQ(Plus(m,C1),n)),Less(Less(C0,m),n)),Not(And(And(IntegerQ(Times(C1D2,n)),NegativeQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PosQ(Times(a,c))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Plus(Times(Plus(Times(b,Power(Times(C2,q),CN1)),C1D2),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Plus(Times(C1D2,b),Times(C1D2,q),Times(c,Power(x,n))),CN1)),x)),Times(CN1,Plus(Times(b,Power(Times(C2,q),CN1)),Times(CN1,C1D2)),Int(Times(Power(x,Plus(m,Times(CN1,n))),Power(Plus(Times(C1D2,b),Times(CN1,C1D2,q),Times(c,Power(x,n))),CN1)),x)))),And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PositiveIntegerQ(n)),IntegerQ(m)),CoprimeQ(Plus(m,C1),n)),And(LessEqual(n,m),Less(m,Times(C2,n)))),Not(And(And(IntegerQ(Times(C1D2,n)),NegativeQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),PosQ(Times(a,c))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,Gcd(Plus(m,C1),n))),Condition(Times(Power(g,CN1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(g,CN1)),Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,Times(n,Power(g,CN1)))),Times(c,Power(x,Times(C2,n,Power(g,CN1))))),CN1)),x),x,Power(x,g))),Unequal(g,C1))),And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n)),Less(Less(C0,Plus(m,C1)),Times(C2,n))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Int(PolynomialDivide(Power(x,m),Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),x),x),And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegersQ(m,n)),Less(Less(C0,Times(C3,n)),Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Times(c,Plus(m,Times(CN1,C2,n),C1)),CN1)),Times(CN1,Power(c,CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Plus(a,Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n)),Less(Less(C0,Times(C2,n)),Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Times(a,Plus(m,C1)),CN1)),Times(CN1,Power(a,CN1),Int(Times(Power(x,Plus(m,n)),Plus(b,Times(c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),CN1)),x))),And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n)),Greater(n,C0)),Less(Plus(m,C1),C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(Simplify(Times(Plus(m,C1),Power(n,CN1))),Times(CN1,C1))),Power(Plus(a,Times(b,x),Times(c,Power(x,C2))),CN1)),x),x,Power(x,n))),And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),IntegerQ(Simplify(Times(Plus(m,C1),Power(n,CN1))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Plus(Times(C2,c,Power(q,CN1),Int(Times(Power(x,m),Power(Plus(b,Times(CN1,q),Times(C2,c,Power(x,n))),CN1)),x)),Times(CN1,C2,c,Power(q,CN1),Int(Times(Power(x,m),Power(Plus(b,q,Times(C2,c,Power(x,n))),CN1)),x)))),And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),CN1D2),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Times(Power(n,CN1),Subst(Int(Power(Times(x,Sqrt(Plus(a,Times(b,x),Times(c,Power(x,C2))))),CN1),x),x,Power(x,n))),And(And(FreeQ(List(a,b,c,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(C2,n,p),CN1)),Times(C1D2,Int(Times(Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1))),Power(x,CN1)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),PositiveIntegerQ(n)),RationalQ(p)),Greater(p,C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(Power(b,C2),Times(CN1,C2,a,c),Times(b,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1)),Times(Power(Times(a,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1),Int(Times(Simp(Plus(Times(Power(b,C2),Plus(p,C1)),Times(CN1,C4,a,c,Plus(p,C1)),Times(b,c,Plus(Times(C2,p),C3),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(x,CN1)),x))),And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),PositiveIntegerQ(n)),RationalQ(p)),Less(p,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),C2),$p(b,true)),Times(Power($p(x),C4),$p(c,true)),$p(a)),CN1D2),Power($p(x),C2)),$p(x,SymbolHead)),
    Condition(Module(List(Set(q,Rt(Plus(Power(b,C2),Times(CN1,C4,a,c)),C2))),Plus(Times(CN1,Plus(b,Times(CN1,q)),Power(Times(C2,c),CN1),Int(Power(Sqrt(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4)))),CN1),x)),Times(Power(Times(C2,c),CN1),Int(Times(Plus(b,Times(CN1,q),Times(C2,c,Power(x,C2))),Power(Sqrt(Plus(a,Times(b,Power(x,C2)),Times(c,Power(x,C4)))),CN1)),x)))),And(FreeQ(List(a,b,c),x),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,Gcd(Plus(m,C1),n))),Times(Power(g,CN1),Subst(Int(Times(Power(x,Plus(Times(Plus(m,C1),Power(g,CN1)),Times(CN1,C1))),Power(Plus(a,Times(b,Power(x,Times(n,Power(g,CN1)))),Times(c,Power(x,Times(C2,n,Power(g,CN1))))),p)),x),x,Power(x,g)))),And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(m,n,p)),Not(PositiveIntegerQ(p))),Unequal(m,CN1)),Or(Not(PositiveIntegerQ(n)),And(And(Less(Less(C0,Plus(m,C1)),Times(C2,n)),And(LessEqual(CN1,p),Less(p,C0))),Not(And(IntegerQ(m),CoprimeQ(Plus(m,C1),n)))))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,Simplify(Times(Plus(m,C1),Power(n,CN1))))),Condition(Times(Power(n,CN1),Subst(Int(Times(Power(x,Plus(g,Times(CN1,C1))),Power(Plus(a,Times(b,x),Times(c,Power(x,C2))),p)),x),x,Power(x,n))),And(IntegerQ(g),Or(Greater(g,C0),Not(PositiveIntegerQ(n)))))),And(And(And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(n,Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Module(List(Set(g,Simplify(Times(n,Power(Plus(m,C1),CN1))))),Condition(Times(Power(Plus(m,C1),CN1),Subst(Int(Power(Plus(a,Times(b,Power(x,g)),Times(c,Power(x,Times(C2,g)))),p),x),x,Power(x,Plus(m,C1)))),And(IntegerQ(g),Or(Greater(g,C0),Not(PositiveIntegerQ(n)))))),And(And(And(And(And(FreeQ(List(a,b,c,m,n),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),RationalQ(p)),And(LessEqual(CN1,p),Less(p,C0))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Plus(Times(b,n,p),Times(c,Plus(m,Times(n,Plus(Times(C2,p),Times(CN1,C1))),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(c,Plus(m,Times(C2,n,p),C1),Plus(m,Times(n,Plus(Times(C2,p),Times(CN1,C1))),C1)),CN1)),Times(n,p,Power(Times(c,Plus(m,Times(C2,n,p),C1),Plus(m,Times(n,Plus(Times(C2,p),Times(CN1,C1))),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Simp(Plus(Times(CN1,a,b,Plus(m,Times(CN1,n),C1)),Times(Plus(Times(C2,a,c,Plus(m,Times(n,Plus(Times(C2,p),Times(CN1,C1))),C1)),Times(CN1,Power(b,C2),Plus(m,Times(n,Plus(p,Times(CN1,C1))),C1))),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,C1))),PositiveIntegerQ(n)),RationalQ(m,p)),Greater(p,C0)),GreaterEqual(Plus(m,Times(CN1,n)),C0)),Unequal(Plus(m,Times(C2,n,p),C1),C0)),Unequal(Plus(m,Times(n,Plus(Times(C2,p),Times(CN1,C1))),C1),C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Plus(m,C1),CN1)),Times(CN1,n,p,Power(Plus(m,C1),CN1),Int(Times(Power(x,Plus(m,n)),Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,C1))),PositiveIntegerQ(n)),RationalQ(m,p)),Greater(p,C0)),LessEqual(Plus(m,n),C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Plus(m,Times(C2,n,p),C1),CN1)),Times(n,p,Power(Plus(m,Times(C2,n,p),C1),CN1),Int(Times(Power(x,m),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,Times(CN1,C1)))),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,C1))),PositiveIntegerQ(n)),RationalQ(m,p)),Greater(p,C0)),Greater(Plus(m,n),C0)),Unequal(Plus(m,Times(C2,n,p),C1),C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(x,Plus(m,Times(CN1,C2,n),C1)),Plus(Times(C2,a),Times(b,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1)),Times(Power(Times(n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Plus(Times(C2,a,Plus(m,Times(CN1,C2,n),C1)),Times(b,Plus(m,Times(n,Plus(Times(C2,p),C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,C1))),PositiveIntegerQ(n)),RationalQ(m,p)),Less(p,CN1)),Greater(m,Plus(Times(C2,n),Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,n),C1)),Plus(b,Times(C2,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1)),Times(CN1,Power(Times(n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1),Int(Times(Power(x,Plus(m,Times(CN1,n))),Plus(Times(b,Plus(m,Times(CN1,n),C1)),Times(C2,c,Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,C1))),PositiveIntegerQ(n)),RationalQ(m,p)),Less(p,CN1)),Less(Less(Plus(n,Times(CN1,C1)),m),Plus(Times(C2,n),Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(x,Plus(m,C1)),Plus(Power(b,C2),Times(CN1,C2,a,c),Times(b,c,Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1)),Times(Power(Times(a,n,Plus(p,C1),Plus(Power(b,C2),Times(CN1,C4,a,c))),CN1),Int(Times(Power(x,m),Simp(Plus(Times(Power(b,C2),Plus(Times(n,Plus(p,C1)),m,C1)),Times(CN1,C2,a,c,Plus(m,Times(C2,n,Plus(p,C1)),C1)),Times(b,c,Plus(Times(C2,n,p),Times(C3,n),m,C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1))),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,C1))),PositiveIntegerQ(n)),RationalQ(m,p)),Less(p,CN1)),Less(m,Plus(n,Times(CN1,C1)))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,Times(CN1,C2,n),C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(c,Plus(m,Times(C2,n,p),C1)),CN1)),Times(CN1,Power(Times(c,Plus(m,Times(C2,n,p),C1)),CN1),Int(Times(Power(x,Plus(m,Times(CN1,C2,n))),Simp(Plus(Times(a,Plus(m,Times(CN1,C2,n),C1)),Times(b,Plus(m,Times(n,Plus(p,Times(CN1,C1))),C1),Power(x,n))),x),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x))),And(And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,C1))),PositiveIntegerQ(n)),RationalQ(m,p)),And(LessEqual(CN1,p),Less(p,C0))),GreaterEqual(m,Times(C2,n))),Unequal(Plus(m,Times(C2,n,p),C1),C0)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),Plus(p,C1)),Power(Times(a,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,Plus(m,C1)),CN1),Int(Times(Power(x,Plus(m,n)),Plus(Times(b,Plus(m,Times(n,Plus(p,C1)),C1)),Times(c,Plus(m,Times(C2,n,Plus(p,C1)),C1),Power(x,n))),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x))),And(And(And(And(And(And(And(And(And(FreeQ(List(a,b,c),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),NonzeroQ(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))),NonzeroQ(Plus(p,C1))),PositiveIntegerQ(n)),RationalQ(m,p)),And(LessEqual(CN1,p),Less(p,C0))),Less(m,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),CN1)),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(C2,n,p,Power(Plus(C1,Times(Plus(b,Times(CN1,Sqrt(Plus(Power(b,C2),Times(CN1,C4,a,c))))),Power(Times(C2,c,Power(x,n)),CN1))),p),Power(Plus(C1,Times(Plus(b,Sqrt(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Power(Times(C2,c,Power(x,n)),CN1))),p)),CN1),AppellF1(Times(CN2,p),Times(CN1,p),Times(CN1,p),Plus(C1,Times(CN1,C2,p)),Times(CN1,Plus(b,Sqrt(Plus(Power(b,C2),Times(CN1,C4,a,c)))),Power(Times(C2,c,Power(x,n)),CN1)),Times(CN1,Plus(b,Times(CN1,Sqrt(Plus(Power(b,C2),Times(CN1,C4,a,c))))),Power(Times(C2,c,Power(x,n)),CN1)))),And(And(FreeQ(List(a,b,c,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),Not(PositiveIntegerQ(p))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(x),$p(n)),$p(b,true)),Times(Power($p(x),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(x),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(x,Plus(m,C1)),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p),Power(Times(Plus(m,C1),Power(Plus(C1,Times(CN1,C2,c,Power(x,n),Power(Plus(Times(CN1,b),Sqrt(Plus(Power(b,C2),Times(CN1,C4,a,c)))),CN1))),p),Power(Plus(C1,Times(C2,c,Power(x,n),Power(Plus(b,Sqrt(Plus(Power(b,C2),Times(CN1,C4,a,c)))),CN1))),p)),CN1),AppellF1(Times(Plus(m,C1),Power(n,CN1)),Times(CN1,p),Times(CN1,p),Plus(C1,Times(Plus(m,C1),Power(n,CN1))),Times(CN2,c,Power(x,n),Power(Plus(b,Sqrt(Plus(Power(b,C2),Times(CN1,C4,a,c)))),CN1)),Times(C2,c,Power(x,n),Power(Plus(Times(CN1,b),Sqrt(Plus(Power(b,C2),Times(CN1,C4,a,c)))),CN1)))),And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),Not(PositiveIntegerQ(p))),NonzeroQ(Plus(m,C1))))),
SetDelayed(Int(Times(Power(Plus(Times(Power($p(v),$p(n)),$p(b,true)),Times(Power($p(w),$p(j,true)),$p(c,true)),$p(a)),$p(p)),Power($p(u),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(u,m),Power(Times(Coefficient(v,x,C1),Power(v,m)),CN1),Subst(Int(Times(Power(x,m),Power(Plus(a,Times(b,Power(x,n)),Times(c,Power(x,Times(C2,n)))),p)),x),x,v)),And(And(And(FreeQ(List(a,b,c,m,n,p),x),ZeroQ(Plus(j,Times(CN1,C2,n)))),LinearPairQ(u,v,x)),ZeroQ(Plus(v,Times(CN1,w))))))
  );
}
