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
public class IntegrationRulesForExpressionsInvolvingTrigFunctionsOfTheFollowingForms18 { 
  public static IAST RULES = List( 
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(C2,Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C1))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Times(d,Plus(Times(C2,m),Times(CN1,C1))),CN1)),Times(CN1,Power(Plus(Times(C2,m),Times(CN1,C1)),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C2))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1),Plus(Times(C2,a,Plus(m,Times(CN1,C1))),Times(b,Plus(Times(C2,m),Times(CN1,C1)),Tan(Plus(c,Times(d,x)))),Times(CN1,a,Power(Tan(Plus(c,Times(d,x))),C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN2,Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C1))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Times(d,Plus(Times(C2,m),Times(CN1,C1))),CN1)),Times(CN1,Power(Plus(Times(C2,m),Times(CN1,C1)),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C2))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1),Plus(Times(C2,a,Plus(m,Times(CN1,C1))),Times(b,Plus(Times(C2,m),Times(CN1,C1)),Cot(Plus(c,Times(d,x)))),Times(CN1,a,Power(Cot(Plus(c,Times(d,x))),C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Int(Times(Plus(b,Times(CN1,a,Tan(Plus(c,Times(d,x))))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x),Times(a,Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Times(Tan(Plus(c,Times(d,x))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Int(Times(Plus(b,Times(CN1,a,Cot(Plus(c,Times(d,x))))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x),Times(a,Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Times(Cot(Plus(c,Times(d,x))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Times(d,Plus(m,C1)),CN1)),Times(CN1,Power(Times(C2,Plus(m,C1)),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1),Plus(b,Times(C2,a,Plus(m,C1),Tan(Plus(c,Times(d,x)))),Times(b,Plus(Times(C2,m),C3),Power(Tan(Plus(c,Times(d,x))),C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Times(d,Plus(m,C1)),CN1)),Times(CN1,Power(Times(C2,Plus(m,C1)),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1),Plus(b,Times(C2,a,Plus(m,C1),Cot(Plus(c,Times(d,x)))),Times(b,Plus(Times(C2,m),C3),Power(Cot(Plus(c,Times(d,x))),C2)))),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(C1D2,CN1,Plus(Times(CI,a),b),Int(Times(Power(Tan(Plus(c,Times(d,x))),m),Plus(CI,Times(CN1,Tan(Plus(c,Times(d,x))))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x)),Times(CN1,C1D2,Plus(Times(CI,a),Times(CN1,b)),Int(Times(Power(Tan(Plus(c,Times(d,x))),m),Plus(CI,Tan(Plus(c,Times(d,x)))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),Not(And(RationalQ(m),Or(Greater(m,C0),LessEqual(m,CN1))))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(C1D2,CN1,Plus(Times(CI,a),b),Int(Times(Power(Cot(Plus(c,Times(d,x))),m),Plus(CI,Times(CN1,Cot(Plus(c,Times(d,x))))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x)),Times(CN1,C1D2,Plus(Times(CI,a),Times(CN1,b)),Int(Times(Power(Cot(Plus(c,Times(d,x))),m),Plus(CI,Cot(Plus(c,Times(d,x)))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),Not(And(RationalQ(m),Or(Greater(m,C0),LessEqual(m,CN1))))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),n),Power(Times(d,n),CN1)),Times(CN1,Int(Times(Plus(b,Times(CN1,a,Tan(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Greater(n,C1)))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),n),Power(Times(d,n),CN1)),Times(CN1,Int(Times(Plus(b,Times(CN1,a,Cot(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Greater(n,C1)))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),QQ(3L,2L)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(C2,b,Power(Tan(Plus(c,Times(d,x))),m),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Times(d,Plus(Times(C2,m),C1)),CN1)),Times(CN1,Power(Plus(Times(C2,m),C1),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C1))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1),Simp(Plus(Times(C2,a,b,m),Times(CN1,Plus(Power(a,C2),Times(CN1,Power(b,C2))),Plus(Times(C2,m),C1),Tan(Plus(c,Times(d,x)))),Times(CN1,C2,a,b,Plus(m,C1),Power(Tan(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C0)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),QQ(3L,2L)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN2,b,Power(Cot(Plus(c,Times(d,x))),m),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Times(d,Plus(Times(C2,m),C1)),CN1)),Times(CN1,Power(Plus(Times(C2,m),C1),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C1))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1),Simp(Plus(Times(C2,a,b,m),Times(CN1,Plus(Power(a,C2),Times(CN1,Power(b,C2))),Plus(Times(C2,m),C1),Cot(Plus(c,Times(d,x)))),Times(CN1,C2,a,b,Plus(m,C1),Power(Cot(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C0)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),QQ(3L,2L)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Int(Times(Simp(Plus(Times(C2,a,b),Times(CN1,Plus(Power(a,C2),Times(CN1,Power(b,C2))),Tan(Plus(c,Times(d,x))))),x),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x),Times(Power(a,C2),Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Times(Tan(Plus(c,Times(d,x))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),QQ(3L,2L)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Int(Times(Simp(Plus(Times(C2,a,b),Times(CN1,Plus(Power(a,C2),Times(CN1,Power(b,C2))),Cot(Plus(c,Times(d,x))))),x),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x),Times(Power(a,C2),Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Times(Cot(Plus(c,Times(d,x))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),QQ(3L,2L)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Plus(Int(Times(Plus(Power(a,C2),Times(CN1,Power(b,C2)),Times(C2,a,b,Tan(Plus(c,Times(d,x))))),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x),Times(Power(b,C2),Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),QQ(3L,2L)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Plus(Int(Times(Plus(Power(a,C2),Times(CN1,Power(b,C2)),Times(C2,a,b,Cot(Plus(c,Times(d,x))))),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x),Times(Power(b,C2),Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),QQ(3L,2L)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(a,Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Times(d,Plus(m,C1)),CN1)),Times(Power(Times(C2,Plus(m,C1)),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1),Simp(Plus(Times(a,b,Plus(Times(C2,m),C1)),Times(CN1,C2,Plus(Power(a,C2),Times(CN1,Power(b,C2))),Plus(m,C1),Tan(Plus(c,Times(d,x)))),Times(CN1,a,b,Plus(Times(C2,m),C3),Power(Tan(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),QQ(3L,2L)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,a,Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Times(d,Plus(m,C1)),CN1)),Times(Power(Times(C2,Plus(m,C1)),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1),Simp(Plus(Times(a,b,Plus(Times(C2,m),C1)),Times(CN1,C2,Plus(Power(a,C2),Times(CN1,Power(b,C2))),Plus(m,C1),Cot(Plus(c,Times(d,x)))),Times(CN1,a,b,Plus(Times(C2,m),C3),Power(Cot(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(a,C2),Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C2))),Power(Times(d,Plus(m,C1)),CN1)),Times(Power(Plus(m,C1),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C3))),Simp(Plus(Times(Power(a,C2),b,Plus(Times(C2,m),Times(CN1,n),C4)),Times(CN1,a,Plus(Power(a,C2),Times(CN1,C3,Power(b,C2))),Plus(m,C1),Tan(Plus(c,Times(d,x)))),Times(CN1,b,Plus(Times(Power(a,C2),Plus(m,n,Times(CN1,C1))),Times(CN1,Power(b,C2),Plus(m,C1))),Power(Tan(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m,n)),Greater(n,C2)),Less(m,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(a,C2),Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C2))),Power(Times(d,Plus(m,C1)),CN1)),Times(Power(Plus(m,C1),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C3))),Simp(Plus(Times(Power(a,C2),b,Plus(Times(C2,m),Times(CN1,n),C4)),Times(CN1,a,Plus(Power(a,C2),Times(CN1,C3,Power(b,C2))),Plus(m,C1),Cot(Plus(c,Times(d,x)))),Times(CN1,b,Plus(Times(Power(a,C2),Plus(m,n,Times(CN1,C1))),Times(CN1,Power(b,C2),Plus(m,C1))),Power(Cot(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m,n)),Greater(n,C2)),Less(m,CN1)))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(b,C2),Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C2))),Power(Times(d,Plus(m,n,Times(CN1,C1))),CN1)),Times(Power(Plus(m,n,Times(CN1,C1)),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C3))),Simp(Plus(Times(a,Plus(Times(Power(a,C2),Plus(m,n,Times(CN1,C1))),Times(CN1,Power(b,C2),Plus(m,C1)))),Times(b,Plus(Times(C3,Power(a,C2)),Times(CN1,Power(b,C2))),Plus(m,n,Times(CN1,C1)),Tan(Plus(c,Times(d,x)))),Times(a,Power(b,C2),Plus(Times(C2,m),Times(C3,n),Times(CN1,C4)),Power(Tan(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Greater(n,C2)),Or(And(RationalQ(m),GreaterEqual(m,CN1)),IntegerQ(n))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(b,C2),Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C2))),Power(Times(d,Plus(m,n,Times(CN1,C1))),CN1)),Times(Power(Plus(m,n,Times(CN1,C1)),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),m),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C3))),Simp(Plus(Times(a,Plus(Times(Power(a,C2),Plus(m,n,Times(CN1,C1))),Times(CN1,Power(b,C2),Plus(m,C1)))),Times(b,Plus(Times(C3,Power(a,C2)),Times(CN1,Power(b,C2))),Plus(m,n,Times(CN1,C1)),Cot(Plus(c,Times(d,x)))),Times(a,Power(b,C2),Plus(Times(C2,m),Times(C3,n),Times(CN1,C4)),Power(Cot(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Greater(n,C2)),Or(And(RationalQ(m),GreaterEqual(m,CN1)),IntegerQ(n))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(b,x,Power(Plus(Power(a,C2),Power(b,C2)),CN1)),Times(CN1,a,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(b,Times(CN1,a,Tan(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(b,x,Power(Plus(Power(a,C2),Power(b,C2)),CN1)),Times(CN1,a,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(b,Times(CN1,a,Cot(Plus(c,Times(d,x))))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),C1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(b,Times(a,Tan(Plus(c,Times(d,x))))),Power(Sqrt(Tan(Plus(c,Times(d,x)))),CN1)),x)),Times(CN1,a,b,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),C1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(b,Times(a,Cot(Plus(c,Times(d,x))))),Power(Sqrt(Cot(Plus(c,Times(d,x)))),CN1)),x)),Times(CN1,a,b,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),QQ(3L,2L))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(a,Times(CN1,b,Tan(Plus(c,Times(d,x))))),Power(Sqrt(Tan(Plus(c,Times(d,x)))),CN1)),x)),Times(Power(a,C2),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),QQ(3L,2L))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(a,Times(CN1,b,Cot(Plus(c,Times(d,x))))),Power(Sqrt(Cot(Plus(c,Times(d,x)))),CN1)),x)),Times(Power(a,C2),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C2))),Power(Times(b,d,Plus(m,Times(CN1,C2))),CN1)),Times(CN1,Power(b,CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C3))),Plus(a,Times(b,Tan(Plus(c,Times(d,x)))),Times(a,Power(Tan(Plus(c,Times(d,x))),C2))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C2)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C2))),Power(Times(b,d,Plus(m,Times(CN1,C2))),CN1)),Times(CN1,Power(b,CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C3))),Plus(a,Times(b,Cot(Plus(c,Times(d,x)))),Times(a,Power(Cot(Plus(c,Times(d,x))),C2))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C2)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(a,Times(CN1,b,Tan(Plus(c,Times(d,x))))),Power(Sqrt(Tan(Plus(c,Times(d,x)))),CN1)),x)),Times(Power(b,C2),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(a,Times(CN1,b,Cot(Plus(c,Times(d,x))))),Power(Sqrt(Cot(Plus(c,Times(d,x)))),CN1)),x)),Times(Power(b,C2),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Times(a,d,Plus(m,C1)),CN1)),Times(CN1,Power(a,CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Plus(b,Times(a,Tan(Plus(c,Times(d,x)))),Times(b,Power(Tan(Plus(c,Times(d,x))),C2))),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Times(a,d,Plus(m,C1)),CN1)),Times(CN1,Power(a,CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Plus(b,Times(a,Cot(Plus(c,Times(d,x)))),Times(b,Power(Cot(Plus(c,Times(d,x))),C2))),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),CN1)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(a,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Power(Tan(Plus(c,Times(d,x))),m),x)),Times(CN1,b,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),x)),Times(Power(b,C2),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),m),Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),Not(IntegerQ(m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(a,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Power(Cot(Plus(c,Times(d,x))),m),x)),Times(CN1,b,Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),x)),Times(Power(b,C2),Power(Plus(Power(a,C2),Power(b,C2)),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),m),Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),CN1)),x))),And(And(FreeQ(List(a,b,c,d,m),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),Not(IntegerQ(m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(C1D2,Int(Times(Plus(CI,Tan(Plus(c,Times(d,x)))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x)),Times(CN1,C1D2,Int(Times(Plus(CI,Times(CN1,Tan(Plus(c,Times(d,x))))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true)))),$p(x,SymbolHead)),
    Condition(Plus(Times(C1D2,Int(Times(Plus(CI,Cot(Plus(c,Times(d,x)))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x)),Times(CN1,C1D2,Int(Times(Plus(CI,Times(CN1,Cot(Plus(c,Times(d,x))))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),C1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(C1D2,Int(Times(Plus(CI,Tan(Plus(c,Times(d,x)))),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x)),Times(CN1,C1D2,Int(Times(Plus(CI,Times(CN1,Tan(Plus(c,Times(d,x))))),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),C1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(C1D2,Int(Times(Plus(CI,Cot(Plus(c,Times(d,x)))),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x)),Times(CN1,C1D2,Int(Times(Plus(CI,Times(CN1,Cot(Plus(c,Times(d,x))))),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),QQ(3L,2L))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Int(Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1),x)),Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),QQ(3L,2L))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Int(Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1),x)),Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(C2,Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C2))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Times(b,d,Plus(Times(C2,m),Times(CN1,C3))),CN1)),Times(CN1,Power(Times(b,Plus(Times(C2,m),Times(CN1,C3))),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,Times(CN1,C3))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1),Simp(Plus(Times(C2,a,Plus(m,Times(CN1,C2))),Times(b,Plus(Times(C2,m),Times(CN1,C3)),Tan(Plus(c,Times(d,x)))),Times(C2,a,Plus(m,Times(CN1,C2)),Power(Tan(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C2)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN2,Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C2))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Times(b,d,Plus(Times(C2,m),Times(CN1,C3))),CN1)),Times(CN1,Power(Times(b,Plus(Times(C2,m),Times(CN1,C3))),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,Times(CN1,C3))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1),Simp(Plus(Times(C2,a,Plus(m,Times(CN1,C2))),Times(b,Plus(Times(C2,m),Times(CN1,C3)),Cot(Plus(c,Times(d,x)))),Times(C2,a,Plus(m,Times(CN1,C2)),Power(Cot(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Greater(m,C2)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Int(Times(Tan(Plus(c,Times(d,x))),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1)),x)),Int(Times(Plus(C1,Power(Tan(Plus(c,Times(d,x))),C2)),Power(Times(Tan(Plus(c,Times(d,x))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Int(Times(Cot(Plus(c,Times(d,x))),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1)),x)),Int(Times(Plus(C1,Power(Cot(Plus(c,Times(d,x))),C2)),Power(Times(Cot(Plus(c,Times(d,x))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x)),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(C1D2,Int(Times(Plus(C1,Times(CN1,CI,Tan(Plus(c,Times(d,x))))),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x)),Times(C1D2,Int(Times(Plus(C1,Times(CI,Tan(Plus(c,Times(d,x))))),Power(Times(Sqrt(Tan(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),CN1D2)),$p(x,SymbolHead)),
    Condition(Plus(Times(C1D2,Int(Times(Plus(C1,Times(CN1,CI,Cot(Plus(c,Times(d,x))))),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x)),Times(C1D2,Int(Times(Plus(C1,Times(CI,Cot(Plus(c,Times(d,x))))),Power(Times(Sqrt(Cot(Plus(c,Times(d,x)))),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))))),CN1)),x))),And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Times(a,d,Plus(m,C1)),CN1)),Times(CN1,Power(Times(C2,a,Plus(m,C1)),CN1),Int(Times(Power(Tan(Plus(c,Times(d,x))),Plus(m,C1)),Power(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),CN1),Simp(Plus(Times(C3,b),Times(C2,b,m),Times(C2,a,Plus(m,C1),Tan(Plus(c,Times(d,x)))),Times(b,Plus(Times(C2,m),C3),Power(Tan(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)),IntegerQ(Times(C2,m))))),
SetDelayed(Int(Times(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),Power($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(m))),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Times(a,d,Plus(m,C1)),CN1)),Times(CN1,Power(Times(C2,a,Plus(m,C1)),CN1),Int(Times(Power(Cot(Plus(c,Times(d,x))),Plus(m,C1)),Power(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),CN1),Simp(Plus(Times(C3,b),Times(C2,b,m),Times(C2,a,Plus(m,C1),Cot(Plus(c,Times(d,x)))),Times(b,Plus(Times(C2,m),C3),Power(Cot(Plus(c,Times(d,x))),C2))),x)),x))),And(And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(m)),Less(m,CN1)),IntegerQ(Times(C2,m)))))
  );
}
