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
public class IntegrationRulesForExpressionsInvolvingTrigFunctionsOfTheFollowingForms3 { 
  public static IAST RULES = List( 
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C2),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times(C2,Power(a,C2)),Power(b,C2)),C1D2,x),Times(CN1,Power(b,C2),Cos(Plus(c,Times(d,x))),Sin(Plus(c,Times(d,x))),Power(Times(C2,d),CN1)),Times(C2,a,b,Int(Sin(Plus(c,Times(d,x))),x))),FreeQ(List(a,b,c,d),x))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C2),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Times(C2,Power(a,C2)),Power(b,C2)),C1D2,x),Times(Power(b,C2),Sin(Plus(c,Times(d,x))),Cos(Plus(c,Times(d,x))),Power(Times(C2,d),CN1)),Times(C2,a,b,Int(Cos(Plus(c,Times(d,x))),x))),FreeQ(List(a,b,c,d),x))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(CN2,b,Cos(Plus(c,Times(d,x))),Power(Times(d,Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))))),CN1)),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(C2,b,Sin(Plus(c,Times(d,x))),Power(Times(d,Sqrt(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))))),CN1)),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,n),CN1)),Times(a,Plus(Times(C2,n),Times(CN1,C1)),Power(n,CN1),Int(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),RationalQ(n)),Greater(n,C1)))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(b,Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,n),CN1)),Times(a,Plus(Times(C2,n),Times(CN1,C1)),Power(n,CN1),Int(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),RationalQ(n)),Greater(n,C1)))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$p(x,SymbolHead)),
    Condition(Times(CN1,Cos(Plus(c,Times(d,x))),Power(Times(d,Plus(b,Times(a,Sin(Plus(c,Times(d,x)))))),CN1)),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$p(x,SymbolHead)),
    Condition(Times(Sin(Plus(c,Times(d,x))),Power(Times(d,Plus(b,Times(a,Cos(Plus(c,Times(d,x)))))),CN1)),And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(CN1,Sqrt(C2),Rt(a,C2),ArcTanh(Times(Rt(a,C2),Cos(Plus(c,Times(d,x))),Power(Times(Sqrt(C2),Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))))),CN1))),Power(Times(b,d),CN1)),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PosQ(a)))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(Sqrt(C2),Rt(a,C2),ArcTanh(Times(Rt(a,C2),Sin(Plus(c,Times(d,x))),Power(Times(Sqrt(C2),Sqrt(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))))),CN1))),Power(Times(b,d),CN1)),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PosQ(a)))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(Sqrt(C2),Rt(Times(CN1,a),C2),ArcTan(Times(Rt(Times(CN1,a),C2),Cos(Plus(c,Times(d,x))),Power(Times(Sqrt(C2),Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))))),CN1))),Power(Times(b,d),CN1)),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),NegQ(a)))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(CN1,Sqrt(C2),Rt(Times(CN1,a),C2),ArcTan(Times(Rt(Times(CN1,a),C2),Sin(Plus(c,Times(d,x))),Power(Times(Sqrt(C2),Sqrt(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))))),CN1))),Power(Times(b,d),CN1)),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),NegQ(a)))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),n),Power(Times(a,d,Plus(Times(C2,n),C1)),CN1)),Times(Plus(n,C1),Power(Times(a,Plus(Times(C2,n),C1)),CN1),Int(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Less(n,CN1)),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),n),Power(Times(a,d,Plus(Times(C2,n),C1)),CN1)),Times(Plus(n,C1),Power(Times(a,Plus(Times(C2,n),C1)),CN1),Int(Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,C1)),x))),And(And(And(FreeQ(List(a,b,c,d),x),RationalQ(n)),Less(n,CN1)),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Times(a,Sqrt(C2),Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),n),Power(Times(b,d,Plus(Times(C2,n),C1),Sqrt(Times(Plus(a,Times(CN1,b,Sin(Plus(c,Times(d,x))))),Power(a,CN1)))),CN1),Hypergeometric2F1(C1D2,Plus(n,C1D2),Plus(n,QQ(3L,2L)),Times(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Power(Times(C2,a),CN1)))),And(And(FreeQ(List(a,b,c,d,n),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),Not(IntegerQ(Times(C2,n)))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Times(CN1,a,Sqrt(C2),Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),n),Power(Times(b,d,Plus(Times(C2,n),C1),Sqrt(Times(Plus(a,Times(CN1,b,Cos(Plus(c,Times(d,x))))),Power(a,CN1)))),CN1),Hypergeometric2F1(C1D2,Plus(n,C1D2),Plus(n,QQ(3L,2L)),Times(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Power(Times(C2,a),CN1)))),And(And(FreeQ(List(a,b,c,d,n),x),ZeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),Not(IntegerQ(Times(C2,n)))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(CN2,Sqrt(Plus(a,b)),Power(d,CN1),EllipticE(Plus(Times(C1D4,Pi),Times(CN1,C1D2,Plus(c,Times(d,x)))),Times(C2,b,Power(Plus(a,b),CN1)))),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PositiveQ(Plus(a,b))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(C2,Sqrt(Plus(a,b)),Power(d,CN1),EllipticE(Times(C1D2,Plus(c,Times(d,x))),Times(C2,b,Power(Plus(a,b),CN1)))),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PositiveQ(Plus(a,b))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(C2,Sqrt(Plus(a,Times(CN1,b))),Power(d,CN1),EllipticE(Plus(Times(C1D4,Pi),Times(C1D2,Plus(c,Times(d,x)))),Times(CN2,b,Power(Plus(a,Times(CN1,b)),CN1)))),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PositiveQ(Plus(a,Times(CN1,b)))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(CN2,Sqrt(Plus(a,Times(CN1,b))),Power(d,CN1),EllipticE(Plus(Times(C1D2,Pi),Times(CN1,C1D2,Plus(c,Times(d,x)))),Times(CN2,b,Power(Plus(a,Times(CN1,b)),CN1)))),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PositiveQ(Plus(a,Times(CN1,b)))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(d,x)))))),Power(Sqrt(Times(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Power(Plus(a,b),CN1))),CN1),Int(Sqrt(Plus(Times(a,Power(Plus(a,b),CN1)),Times(b,Power(Plus(a,b),CN1),Sin(Plus(c,Times(d,x)))))),x)),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),Not(PositiveQ(Plus(a,b)))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Plus(a,Times(b,Cos(Plus(c,Times(d,x)))))),Power(Sqrt(Times(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Power(Plus(a,b),CN1))),CN1),Int(Sqrt(Plus(Times(a,Power(Plus(a,b),CN1)),Times(b,Power(Plus(a,b),CN1),Cos(Plus(c,Times(d,x)))))),x)),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),Not(PositiveQ(Plus(a,b)))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,n),CN1)),Times(Power(n,CN1),Int(Times(Simp(Plus(Times(Power(a,C2),n),Times(Power(b,C2),Plus(n,Times(CN1,C1))),Times(a,b,Plus(Times(C2,n),Times(CN1,C1)),Sin(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),RationalQ(n)),Greater(n,C1)))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(b,Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,n),CN1)),Times(Power(n,CN1),Int(Times(Simp(Plus(Times(Power(a,C2),n),Times(Power(b,C2),Plus(n,Times(CN1,C1))),Times(a,b,Plus(Times(C2,n),Times(CN1,C1)),Cos(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C2)))),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),RationalQ(n)),Greater(n,C1)))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Power(Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2),CN1)),Times(C2,Power(Times(d,Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2)),CN1),ArcTan(Times(b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2),Times(b,Sin(Plus(c,Times(d,x))))),CN1))))),And(FreeQ(List(a,b,c,d),x),PositiveQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$p(x,SymbolHead)),
    Condition(Plus(Times(x,Power(Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2),CN1)),Times(CN1,C2,Power(Times(d,Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2)),CN1),ArcTan(Times(b,Sin(Plus(c,Times(d,x))),Power(Plus(a,Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2),Times(b,Cos(Plus(c,Times(d,x))))),CN1))))),And(FreeQ(List(a,b,c,d),x),PositiveQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$p(x,SymbolHead)),
    Condition(Times(C2,ArcTan(Times(Plus(b,Times(a,Tan(Times(C1D2,Plus(c,Times(d,x)))))),Power(Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2),CN1))),Power(Times(d,Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2)),CN1)),And(FreeQ(List(a,b,c,d),x),PosQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$p(x,SymbolHead)),
    Condition(Times(C2,ArcTan(Times(Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2),Tan(Times(C1D2,Plus(c,Times(d,x)))),Power(Plus(a,b),CN1))),Power(Times(d,Rt(Plus(Power(a,C2),Times(CN1,Power(b,C2))),C2)),CN1)),And(FreeQ(List(a,b,c,d),x),PosQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$p(x,SymbolHead)),
    Condition(Times(CN2,ArcTanh(Times(Plus(b,Times(a,Tan(Times(C1D2,Plus(c,Times(d,x)))))),Power(Rt(Plus(Power(b,C2),Times(CN1,Power(a,C2))),C2),CN1))),Power(Times(d,Rt(Plus(Power(b,C2),Times(CN1,Power(a,C2))),C2)),CN1)),And(FreeQ(List(a,b,c,d),x),NegQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1),$p(x,SymbolHead)),
    Condition(Times(C2,ArcTanh(Times(Rt(Plus(Power(b,C2),Times(CN1,Power(a,C2))),C2),Tan(Times(C1D2,Plus(c,Times(d,x)))),Power(Plus(a,b),CN1))),Power(Times(d,Rt(Plus(Power(b,C2),Times(CN1,Power(a,C2))),C2)),CN1)),And(FreeQ(List(a,b,c,d),x),NegQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(CN2,Power(Times(d,Sqrt(Plus(a,b))),CN1),EllipticF(Plus(Times(C1D4,Pi),Times(CN1,C1D2,Plus(c,Times(d,x)))),Times(C2,b,Power(Plus(a,b),CN1)))),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PositiveQ(Plus(a,b))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(C2,Power(Times(d,Sqrt(Plus(a,b))),CN1),EllipticF(Times(C1D2,Plus(c,Times(d,x))),Times(C2,b,Power(Plus(a,b),CN1)))),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PositiveQ(Plus(a,b))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(C2,Power(Times(d,Sqrt(Plus(a,Times(CN1,b)))),CN1),EllipticF(Plus(Times(C1D4,Pi),Times(C1D2,Plus(c,Times(d,x)))),Times(CN2,b,Power(Plus(a,Times(CN1,b)),CN1)))),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PositiveQ(Plus(a,Times(CN1,b)))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(CN2,Power(Times(d,Sqrt(Plus(a,Times(CN1,b)))),CN1),EllipticF(Plus(Times(C1D2,Pi),Times(CN1,C1D2,Plus(c,Times(d,x)))),Times(CN2,b,Power(Plus(a,Times(CN1,b)),CN1)))),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),PositiveQ(Plus(a,Times(CN1,b)))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Times(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Power(Plus(a,b),CN1))),Power(Sqrt(Plus(a,Times(b,Sin(Plus(c,Times(d,x)))))),CN1),Int(Power(Sqrt(Plus(Times(a,Power(Plus(a,b),CN1)),Times(b,Power(Plus(a,b),CN1),Sin(Plus(c,Times(d,x)))))),CN1),x)),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),Not(PositiveQ(Plus(a,b)))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),CN1D2),$p(x,SymbolHead)),
    Condition(Times(Sqrt(Times(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Power(Plus(a,b),CN1))),Power(Sqrt(Plus(a,Times(b,Cos(Plus(c,Times(d,x)))))),CN1),Int(Power(Sqrt(Plus(Times(a,Power(Plus(a,b),CN1)),Times(b,Power(Plus(a,b),CN1),Cos(Plus(c,Times(d,x)))))),CN1),x)),And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),Not(PositiveQ(Plus(a,b)))))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,Cos(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(d,Plus(n,C1),Plus(Power(a,C2),Times(CN1,Power(b,C2)))),CN1)),Times(Power(Times(Plus(n,C1),Plus(Power(a,C2),Times(CN1,Power(b,C2)))),CN1),Int(Times(Simp(Plus(Times(a,Plus(n,C1)),Times(CN1,b,Plus(n,C2),Sin(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1))),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),RationalQ(n)),Less(n,CN1)))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(b,Sin(Plus(c,Times(d,x))),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,C1)),Power(Times(d,Plus(n,C1),Plus(Power(a,C2),Times(CN1,Power(b,C2)))),CN1)),Times(Power(Times(Plus(n,C1),Plus(Power(a,C2),Times(CN1,Power(b,C2)))),CN1),Int(Times(Simp(Plus(Times(a,Plus(n,C1)),Times(CN1,b,Plus(n,C2),Cos(Plus(c,Times(d,x))))),x),Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,C1))),x))),And(And(And(FreeQ(List(a,b,c,d),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),RationalQ(n)),Less(n,CN1)))),
SetDelayed(Int(Power(Plus(Times($($s("§sin"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Times(Power(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Plus(n,C1)),Sqrt(Times(b,Plus(C1,Times(CN1,Sin(Plus(c,Times(d,x))))),Power(Plus(a,b),CN1))),Sqrt(Times(CN1,b,Plus(C1,Sin(Plus(c,Times(d,x)))),Power(Plus(a,Times(CN1,b)),CN1))),Power(Times(b,d,Plus(n,C1),Cos(Plus(c,Times(d,x)))),CN1),AppellF1(Plus(n,C1),C1D2,C1D2,Plus(n,C2),Times(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Power(Plus(a,Times(CN1,b)),CN1)),Times(Plus(a,Times(b,Sin(Plus(c,Times(d,x))))),Power(Plus(a,b),CN1)))),And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),Not(IntegerQ(n))))),
SetDelayed(Int(Power(Plus(Times($($s("§cos"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Times(CN1,Power(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Plus(n,C1)),Sqrt(Times(b,Plus(C1,Times(CN1,Cos(Plus(c,Times(d,x))))),Power(Plus(a,b),CN1))),Sqrt(Times(CN1,b,Plus(C1,Cos(Plus(c,Times(d,x)))),Power(Plus(a,Times(CN1,b)),CN1))),Power(Times(b,d,Plus(n,C1),Sin(Plus(c,Times(d,x)))),CN1),AppellF1(Plus(n,C1),C1D2,C1D2,Plus(n,C2),Times(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Power(Plus(a,Times(CN1,b)),CN1)),Times(Plus(a,Times(b,Cos(Plus(c,Times(d,x))))),Power(Plus(a,b),CN1)))),And(And(FreeQ(List(a,b,c,d,n),x),NonzeroQ(Plus(Power(a,C2),Times(CN1,Power(b,C2))))),Not(IntegerQ(n))))),
SetDelayed(Int(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C2),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Power(a,C2),Times(CN1,Power(b,C2))),x),Times(Power(b,C2),Tan(Plus(c,Times(d,x))),Power(d,CN1)),Times(C2,a,b,Int(Tan(Plus(c,Times(d,x))),x))),FreeQ(List(a,b,c,d),x))),
SetDelayed(Int(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C2),$p(x,SymbolHead)),
    Condition(Plus(Times(Plus(Power(a,C2),Times(CN1,Power(b,C2))),x),Times(CN1,Power(b,C2),Cot(Plus(c,Times(d,x))),Power(d,CN1)),Times(C2,a,b,Int(Cot(Plus(c,Times(d,x))),x))),FreeQ(List(a,b,c,d),x))),
SetDelayed(Int(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(CN1,b,Sqrt(C2),Power(Times(d,Rt(a,C2)),CN1),ArcTanh(Times(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Times(Sqrt(C2),Rt(a,C2)),CN1)))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),PosQ(a)))),
SetDelayed(Int(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(b,Sqrt(C2),Power(Times(d,Rt(a,C2)),CN1),ArcTanh(Times(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Times(Sqrt(C2),Rt(a,C2)),CN1)))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),PosQ(a)))),
SetDelayed(Int(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(b,Sqrt(C2),Power(Times(d,Rt(Times(CN1,a),C2)),CN1),ArcTan(Times(Sqrt(Plus(a,Times(b,Tan(Plus(c,Times(d,x)))))),Power(Times(Sqrt(C2),Rt(Times(CN1,a),C2)),CN1)))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),NegQ(a)))),
SetDelayed(Int(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),C1D2),$p(x,SymbolHead)),
    Condition(Times(CN1,b,Sqrt(C2),Power(Times(d,Rt(Times(CN1,a),C2)),CN1),ArcTan(Times(Sqrt(Plus(a,Times(b,Cot(Plus(c,Times(d,x)))))),Power(Times(Sqrt(C2),Rt(Times(CN1,a),C2)),CN1)))),And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),NegQ(a)))),
SetDelayed(Int(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Times(Power(a,C2),Power(d,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),Plus(n,Times(CN1,C1))),Power(Plus(a,Times(CN1,b,x)),CN1)),x),x,Tan(Plus(c,Times(d,x))))),And(And(And(FreeQ(List(a,b,c,d,n),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Less(Less(C0,n),C1)))),
SetDelayed(Int(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Times(CN1,Power(a,C2),Power(d,CN1),Subst(Int(Times(Power(Plus(a,Times(b,x)),Plus(n,Times(CN1,C1))),Power(Plus(a,Times(CN1,b,x)),CN1)),x),x,Cot(Plus(c,Times(d,x))))),And(And(And(FreeQ(List(a,b,c,d,n),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Less(Less(C0,n),C1)))),
SetDelayed(Int(Power(Plus(Times($($s("§tan"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(b,Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,Plus(n,Times(CN1,C1))),CN1)),Times(C2,a,Int(Power(Plus(a,Times(b,Tan(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Greater(n,C1)))),
SetDelayed(Int(Power(Plus(Times($($s("§cot"),Plus(Times($p(d,true),$p(x)),$p(c,true))),$p(b,true)),$p(a)),$p(n)),$p(x,SymbolHead)),
    Condition(Plus(Times(CN1,b,Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),Power(Times(d,Plus(n,Times(CN1,C1))),CN1)),Times(C2,a,Int(Power(Plus(a,Times(b,Cot(Plus(c,Times(d,x))))),Plus(n,Times(CN1,C1))),x))),And(And(And(FreeQ(List(a,b,c,d),x),ZeroQ(Plus(Power(a,C2),Power(b,C2)))),RationalQ(n)),Greater(n,C1))))
  );
}
