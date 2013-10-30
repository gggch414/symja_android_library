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
public class IntegrationRulesForExpressionsInvolvingTrigFunctionsOfTheFollowingForms19 { 
  public static IAST RULES = List( 
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Power(b,m),CN1),Int(Times(Plus($s("A"),Times($s("B"),Tan(Plus(c,Times(d,x))))),Power(Times(b,Tan(Plus(c,Times(d,x)))),Plus(m,n))),x)),And(FreeQ(List(b,c,d,$s("A"),$s("B"),n),x),IntegerQ(m)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times(Power(Power(b,m),CN1),Int(Times(Plus($s("A"),Times($s("B"),Cot(Plus(c,Times(d,x))))),Power(Times(b,Cot(Plus(c,Times(d,x)))),Plus(m,n))),x)),And(FreeQ(List(b,c,d,$s("A"),$s("B"),n),x),IntegerQ(m)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(b,Plus(n,Times(CN1,C1D2))),Sqrt(Times(b,Tan(Plus(c,Times(d,x))))),Power(Sqrt(Tan(Plus(c,Times(d,x)))),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,n)),Plus($s("A"),Times($s("B"),Tan(Plus(c,Times(d,x)))))),x)),And(And(FreeQ(List(b,c,d,$s("A"),$s("B")),x),Not(IntegerQ(m))),PositiveIntegerQ(Plus(n,C1D2))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(b,Plus(n,Times(CN1,C1D2))),Sqrt(Times(b,Cot(Plus(c,Times(d,x))))),Power(Sqrt(Cot(Plus(c,Times(d,x)))),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,n)),Plus($s("A"),Times($s("B"),Cot(Plus(c,Times(d,x)))))),x)),And(And(FreeQ(List(b,c,d,$s("A"),$s("B")),x),Not(IntegerQ(m))),PositiveIntegerQ(Plus(n,C1D2))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(b,Plus(n,C1D2)),Sqrt(Tan(Plus(c,Times(d,x)))),Power(Sqrt(Times(b,Tan(Plus(c,Times(d,x))))),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,n)),Plus($s("A"),Times($s("B"),Tan(Plus(c,Times(d,x)))))),x)),And(And(FreeQ(List(b,c,d,$s("A"),$s("B")),x),Not(IntegerQ(m))),NegativeIntegerQ(Plus(n,Times(CN1,C1D2)))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(b,Plus(n,C1D2)),Sqrt(Cot(Plus(c,Times(d,x)))),Power(Sqrt(Times(b,Cot(Plus(c,Times(d,x))))),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,n)),Plus($s("A"),Times($s("B"),Cot(Plus(c,Times(d,x)))))),x)),And(And(FreeQ(List(b,c,d,$s("A"),$s("B")),x),Not(IntegerQ(m))),NegativeIntegerQ(Plus(n,Times(CN1,C1D2)))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(b,Tan(Plus(c,Times(d,x)))),n),Power(Power(Tan(Plus(c,Times(d,x))),n),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,n)),Plus($s("A"),Times($s("B"),Tan(Plus(c,Times(d,x)))))),x)),And(And(FreeQ(List(b,c,d,$s("A"),$s("B"),m,n),x),Not(IntegerQ(m))),Not(IntegerQ(Plus(n,Times(CN1,C1D2))))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Times(Power(Times(b,Cot(Plus(c,Times(d,x)))),n),Power(Power(Cot(Plus(c,Times(d,x))),n),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,n)),Plus($s("A"),Times($s("B"),Cot(Plus(c,Times(d,x)))))),x)),And(And(FreeQ(List(b,c,d,$s("A"),$s("B"),m,n),x),Not(IntegerQ(m))),Not(IntegerQ(Plus(n,Times(CN1,C1D2))))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n,true)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times($s("B"),Power(b,CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1))),x)),And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m,n),x),ZeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n,true)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Times($s("B"),Power(b,CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1))),x)),And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m,n),x),ZeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times($s("A"),b),Times(a,$s("B"))),x),Times(b,$s("B"),Int(Tan(Plus(c,Times(d,x))),x)),Times(a,$s("A"),Int(Power(Tan(Plus(c,Times(d,x))),CN1),x))),And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times($s("A"),b),Times(a,$s("B"))),x),Times(b,$s("B"),Int(Cot(Plus(c,Times(d,x))),x)),Times(a,$s("A"),Int(Power(Cot(Plus(c,Times(d,x))),CN1),x))),And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(a,$s("A"),Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Simp(Plus(Times($s("A"),b),Times(a,$s("B")),Times(CN1,Plus(Times(a,$s("A")),Times(CN1,b,$s("B"))),Tan(Plus(c,Times(d,x))))),x)),x)),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),RationalQ(m)),Less(m,CN1)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,a,$s("A"),Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Simp(Plus(Times($s("A"),b),Times(a,$s("B")),Times(CN1,Plus(Times(a,$s("A")),Times(CN1,b,$s("B"))),Cot(Plus(c,Times(d,x))))),x)),x)),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),RationalQ(m)),Less(m,CN1)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(b,$s("B"),Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Tan(Plus(c,Times(d,x))),m),Simp(Plus(Times(a,$s("A")),Times(CN1,b,$s("B")),Times(Plus(Times($s("A"),b),Times(a,$s("B"))),Tan(Plus(c,Times(d,x))))),x)),x)),And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m,true))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,$s("B"),Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Times(d,Plus(m,C1)),CN1)),Int(Times(Power(Cot(Plus(c,Times(d,x))),m),Simp(Plus(Times(a,$s("A")),Times(CN1,b,$s("B")),Times(Plus(Times($s("A"),b),Times(a,$s("B"))),Cot(Plus(c,Times(d,x))))),x)),x)),And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),Not(And(RationalQ(m),LessEqual(m,CN1)))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("B"),Power(b,CN1),Int(Tan(Plus(c,Times(d,x))),x)),Times(Plus(Times(a,$s("A")),Times(b,$s("B"))),Power(a,CN1),Int(Times(Tan(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("B"),Power(b,CN1),Int(Cot(Plus(c,Times(d,x))),x)),Times(Plus(Times(a,$s("A")),Times(b,$s("B"))),Power(a,CN1),Int(Times(Cot(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("A"),x,Power(b,CN1)),Times(CN1,a,$s("A"),Power(b,CN1),Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times(a,$s("A")),Times(b,$s("B"))))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("A"),x,Power(b,CN1)),Times(CN1,a,$s("A"),Power(b,CN1),Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times(a,$s("A")),Times(b,$s("B"))))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(b,$s("B"))),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Tan(Plus(c,Times(d,x))),x)),Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Tan(Plus(c,Times(d,x))),Plus(b,Times(CN1,a,Tan(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),NonzeroQ(Plus(Times(a,$s("A")),Times(b,$s("B"))))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(b,$s("B"))),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Cot(Plus(c,Times(d,x))),x)),Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Cot(Plus(c,Times(d,x))),Plus(b,Times(CN1,a,Cot(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),CN1)),x))),And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),NonzeroQ(Plus(Times(a,$s("A")),Times(b,$s("B"))))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Tan(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n),Power(Times(C2,a,d,n),CN1)),Times(Power(Times(C2,Power(a,C2),n),CN1),Int(Times(Simp(Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(Plus(Times(a,$s("A"),Plus(n,C1)),Times(CN1,b,$s("B"),Plus(n,Times(CN1,C1)))),Tan(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),RationalQ(n)),Less(n,CN1)),ZeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Cot(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n),Power(Times(C2,a,d,n),CN1)),Times(Power(Times(C2,Power(a,C2),n),CN1),Int(Times(Simp(Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(Plus(Times(a,$s("A"),Plus(n,C1)),Times(CN1,b,$s("B"),Plus(n,Times(CN1,C1)))),Cot(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),RationalQ(n)),Less(n,CN1)),ZeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,a,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1),Plus(Power(a,C2),Power(b,C2))),CN1)),Times(Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Simp(Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(Plus(Times(a,$s("A")),Times(b,$s("B"))),Tan(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),RationalQ(n)),Less(n,CN1)),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(a,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1),Plus(Power(a,C2),Power(b,C2))),CN1)),Times(Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Simp(Plus(Times($s("A"),b),Times(CN1,a,$s("B")),Times(Plus(Times(a,$s("A")),Times(b,$s("B"))),Cot(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1))),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),RationalQ(n)),Less(n,CN1)),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("B"),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),Times(CN1,Int(Times(Plus($s("B"),Times(CN1,$s("A"),Tan(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n)),x))),And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),Not(And(RationalQ(n),LessEqual(n,CN1)))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,$s("B"),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(b,d,Plus(n,C1)),CN1)),Times(CN1,Int(Times(Plus($s("B"),Times(CN1,$s("A"),Cot(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n)),x))),And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),Not(And(RationalQ(n),LessEqual(n,CN1)))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(a,$s("A"),Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,Plus(m,C1)),CN1)),Times(Power(Plus(m,C1),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Simp(Plus(Times($s("A"),b,Plus(m,Times(CN1,n),C2)),Times(a,$s("B"),Plus(m,C1)),Times(CN1,Plus(Times(a,$s("A"),Plus(m,n)),Times(CN1,b,$s("B"),Plus(m,C1))),Tan(Plus(c,Times(d,x))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m,n)),Greater(n,C1)),Less(m,CN1)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,a,$s("A"),Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,Plus(m,C1)),CN1)),Times(Power(Plus(m,C1),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Simp(Plus(Times($s("A"),b,Plus(m,Times(CN1,n),C2)),Times(a,$s("B"),Plus(m,C1)),Times(CN1,Plus(Times(a,$s("A"),Plus(m,n)),Times(CN1,b,$s("B"),Plus(m,C1))),Cot(Plus(c,Times(d,x))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m,n)),Greater(n,C1)),Less(m,CN1)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(b,$s("B"),Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,Plus(m,n)),CN1)),Times(Power(Plus(m,n),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Simp(Plus(Times(a,$s("A"),Plus(m,n)),Times(CN1,b,$s("B"),Plus(m,C1)),Times(Plus(Times(a,$s("B"),Plus(n,Times(CN1,C1))),Times(Plus(Times($s("A"),b),Times(a,$s("B"))),Plus(m,n))),Tan(Plus(c,Times(d,x))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Greater(n,C1)),Not(And(RationalQ(m),Less(m,CN1)))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,$s("B"),Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,Plus(m,n)),CN1)),Times(Power(Plus(m,n),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Simp(Plus(Times(a,$s("A"),Plus(m,n)),Times(CN1,b,$s("B"),Plus(m,C1)),Times(Plus(Times(a,$s("B"),Plus(n,Times(CN1,C1))),Times(Plus(Times($s("A"),b),Times(a,$s("B"))),Plus(m,n))),Cot(Plus(c,Times(d,x))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Greater(n,C1)),Not(And(RationalQ(m),Less(m,CN1)))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(Tan(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n),Power(Times(C2,a,d,n),CN1)),Times(Power(Times(C2,Power(a,C2),n),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1)),Simp(Plus(Times(m,Plus(Times($s("A"),b),Times(CN1,a,$s("B")))),Times(Plus(Times(b,$s("B"),Plus(m,Times(CN1,n))),Times(a,$s("A"),Plus(m,n))),Tan(Plus(c,Times(d,x))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m,n)),Less(n,C0)),Greater(m,C0)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Power(Cot(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n),Power(Times(C2,a,d,n),CN1)),Times(Power(Times(C2,Power(a,C2),n),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C1))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1)),Simp(Plus(Times(m,Plus(Times($s("A"),b),Times(CN1,a,$s("B")))),Times(Plus(Times(b,$s("B"),Plus(m,Times(CN1,n))),Times(a,$s("A"),Plus(m,n))),Cot(Plus(c,Times(d,x))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m,n)),Less(n,C0)),Greater(m,C0)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Plus(Times(a,$s("A")),Times(b,$s("B"))),Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n),Power(Times(C2,a,d,n),CN1)),Times(Power(Times(C2,Power(a,C2),n),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,C1)),Simp(Plus(Times(b,$s("B"),Plus(m,C1)),Times(a,$s("A"),Plus(m,Times(C2,n),C1)),Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Plus(m,n,C1),Tan(Plus(c,Times(d,x))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Less(n,C0)),Not(And(RationalQ(m),Greater(m,C0)))))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times(a,$s("A")),Times(b,$s("B"))),Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n),Power(Times(C2,a,d,n),CN1)),Times(Power(Times(C2,Power(a,C2),n),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,C1)),Simp(Plus(Times(b,$s("B"),Plus(m,C1)),Times(a,$s("A"),Plus(m,Times(C2,n),C1)),Times(CN1,Plus(Times($s("A"),b),Times(CN1,a,$s("B"))),Plus(m,n,C1),Cot(Plus(c,Times(d,x))))),x)),x))),And(And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),m),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Less(n,C0)),Not(And(RationalQ(m),Greater(m,C0)))))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("B"),Power(Tan(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n),Power(Times(d,Plus(m,n)),CN1)),Times(CN1,Power(Times(a,Plus(m,n)),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C1))),Simp(Plus(Times($s("B"),a,m),Times(Plus(Times(b,$s("B"),n),Times(CN1,a,$s("A"),Plus(m,n))),Tan(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n)),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,$s("B"),Power(Cot(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n),Power(Times(d,Plus(m,n)),CN1)),Times(CN1,Power(Times(a,Plus(m,n)),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C1))),Simp(Plus(Times($s("B"),a,m),Times(Plus(Times(b,$s("B"),n),Times(CN1,a,$s("A"),Plus(m,n))),Cot(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n)),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C0)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times($s("A"),Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n),Power(Times(d,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,Plus(m,C1)),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Simp(Plus(Times($s("A"),b,n),Times(CN1,a,$s("B"),Plus(m,C1)),Times(a,$s("A"),Plus(m,n,C1),Tan(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n)),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,$s("A"),Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n),Power(Times(d,Plus(m,C1)),CN1)),Times(CN1,Power(Times(a,Plus(m,C1)),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Simp(Plus(Times($s("A"),b,n),Times(CN1,a,$s("B"),Plus(m,C1)),Times(a,$s("A"),Plus(m,n,C1),Cot(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n)),x))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B"),n),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Times(CN2,b,$s("B"),Power(Times(Rt(a,C2),d),CN1),ArcTanh(Times(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Rt(a,C2),CN1)))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),PosQ(a)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Times(C2,b,$s("B"),Power(Times(Rt(a,C2),d),CN1),ArcTanh(Times(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Rt(a,C2),CN1)))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),PosQ(a)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Times(C2,b,$s("B"),Power(Times(Rt(Times(CN1,a),C2),d),CN1),ArcTan(Times(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Rt(Times(CN1,a),C2),CN1)))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),NegQ(a)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Times(CN2,b,$s("B"),Power(Times(Rt(Times(CN1,a),C2),d),CN1),ArcTan(Times(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Rt(Times(CN1,a),C2),CN1)))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),NegQ(a)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Times(b,$s("B"),Power(d,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),Plus(n,Times(CN1,C1))),Power(x,CN1)),x),x,Tan(Plus(c,Times(d,x))))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),RationalQ(n)),Less(Less(C0,n),C1)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Times(CN1,b,$s("B"),Power(d,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),Plus(n,Times(CN1,C1))),Power(x,CN1)),x),x,Cot(Plus(c,Times(d,x))))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),RationalQ(n)),Less(Less(C0,n),C1)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Times(C2,Rt(b,C2),$s("B"),Power(d,CN1),ArcTanh(Times(Rt(b,C2),Sqrt(Tan(Plus(c,Times(d,x)))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),PosQ(b)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Times(CN2,Rt(b,C2),$s("B"),Power(d,CN1),ArcTanh(Times(Rt(b,C2),Sqrt(Cot(Plus(c,Times(d,x)))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),PosQ(b)))),
SetDelayed(Int(Times(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Times(CN2,Rt(Times(CN1,b),C2),$s("B"),Power(d,CN1),ArcTan(Times(Rt(Times(CN1,b),C2),Sqrt(Tan(Plus(c,Times(d,x)))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),NegQ(b)))),
SetDelayed(Int(Times(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p("B",true)),$p("A")),Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Times(C2,Rt(Times(CN1,b),C2),$s("B"),Power(d,CN1),ArcTan(Times(Rt(Times(CN1,b),C2),Sqrt(Cot(Plus(c,Times(d,x)))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)))),And(And(And(And(FreeQ(List(a,b,c,d,$s("A"),$s("B")),x),NonzeroQ(Plus(Times($s("A"),b),Times(CN1,a,$s("B"))))),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),ZeroQ(Plus(Times($s("A"),b),Times(a,$s("B"))))),NegQ(b))))
  );
}
