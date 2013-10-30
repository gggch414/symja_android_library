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
public class IntegrationRulesForMiscellaneousExpressions11 { 
  public static IAST RULES = List( 
SetDelayed(FractionalPowerOfLinear($p(u),$p(n),$p(v),$p(x)),
    If(Or(AtomQ(u),FreeQ(u,x)),List(n,v),If(CalculusQ(u),False,If(And(And(FractionalPowerQ(u),LinearQ(Part(u,C1),x)),Or(FalseQ(v),ZeroQ(Plus(Part(u,C1),Times(CN1,v))))),List(LCM(Denominator(Part(u,C2)),n),Part(u,C1)),Catch(Module(List(Set($s("lst"),List(n,v))),CompoundExpression(Scan(Function(If(FalseQ(Set($s("lst"),FractionalPowerOfLinear(Slot1,Part($s("lst"),C1),Part($s("lst"),C2),x))),Throw(False))),u),$s("lst")))))))),
SetDelayed(InverseFunctionOfLinear($p(u),$p(x,SymbolHead)),
    If(Or(Or(AtomQ(u),CalculusQ(u)),FreeQ(u,x)),False,If(And(InverseFunctionQ(u),LinearQ(Part(u,C1),x)),u,Module(List($s("tmp")),Catch(CompoundExpression(Scan(Function(If(NotFalseQ(Set($s("tmp"),InverseFunctionOfLinear(Slot1,x))),Throw($s("tmp")))),u),False)))))),
SetDelayed(TryPureTanSubst($p(u),$p(x,SymbolHead)),
    Not(MatchQ(u,Condition($($p("F"),Times($p(c,true),Plus($p(a,true),Times($p(b,true),$($p("G"),$p(v)))))),And(And(And(FreeQ(List(a,b,c),x),MemberQ(List($s("ArcTan"),$s("ArcCot"),$s("ArcTanh"),$s("ArcCoth")),$s("§f"))),MemberQ(List($s("Tan"),$s("Cot"),$s("Tanh"),$s("Coth")),$s("§g"))),LinearQ(v,x)))))),
SetDelayed(TryTanhSubst($p(u),$p(x,SymbolHead)),
    And(And(And(And(And(And(FalseQ(FunctionOfLinear(u,x)),Not(MatchQ(u,Condition(Times($p(r,true),Power(Plus($p(s),$p(t)),$p(n,true))),And(IntegerQ(n),Greater(n,C0)))))),Not(MatchQ(u,Log($p(v))))),Not(MatchQ(u,Condition(Power(Plus($p(a),Times($p(b,true),Power($($p(f),x),$p(n)))),CN1),And(And(SinhCoshQ(f),IntegerQ(n)),Greater(n,C2)))))),Not(MatchQ(u,Condition(Times($($p(f),Times($p(m,true),x)),$($p(g),Times($p(n,true),x))),And(And(IntegersQ(m,n),SinhCoshQ(f)),SinhCoshQ(g)))))),Not(MatchQ(u,Condition(Times($p(r,true),Power(Times($p(a,true),Power($p(s),$p(m))),$p(p))),And(FreeQ(List(a,m,p),x),Not(And(SameQ(m,C2),Or(SameQ(s,Sech(x)),SameQ(s,Csch(x)))))))))),SameQ(u,ExpandIntegrand(u,x)))),
SetDelayed(TryPureTanhSubst($p(u),$p(x,SymbolHead)),
    And(And(And(And(And(Not(MatchQ(u,Log($p(v)))),Not(MatchQ(u,Condition(ArcTanh(Times($p(a,true),Tanh($p(v)))),FreeQ(a,x))))),Not(MatchQ(u,Condition(ArcTanh(Times($p(a,true),Coth($p(v)))),FreeQ(a,x))))),Not(MatchQ(u,Condition(ArcCoth(Times($p(a,true),Tanh($p(v)))),FreeQ(a,x))))),Not(MatchQ(u,Condition(ArcCoth(Times($p(a,true),Coth($p(v)))),FreeQ(a,x))))),SameQ(u,ExpandIntegrand(u,x)))),
SetDelayed(InertTrigQ($p(f)),
    MemberQ(List($s("§sin"),$s("§cos"),$s("§tan"),$s("§cot"),$s("§sec"),$s("§csc")),f)),
SetDelayed(InertTrigQ($p(f),$p(g)),
    If(SameQ(f,g),InertTrigQ(f),Or(InertReciprocalQ(f,g),InertReciprocalQ(g,f)))),
SetDelayed(InertTrigQ($p(f),$p(g),$p(h)),
    And(InertTrigQ(f,g),InertTrigQ(g,h))),
SetDelayed(InertReciprocalQ($p(f),$p(g)),
    Or(Or(And(SameQ(f,$s("§sin")),SameQ(g,$s("§csc"))),And(SameQ(f,$s("§cos")),SameQ(g,$s("§sec")))),And(SameQ(f,$s("§tan")),SameQ(g,$s("§cot"))))),
SetDelayed(InertTrigFreeQ($p(u)),
    And(And(And(And(And(FreeQ(u,$s("§sin")),FreeQ(u,$s("§cos"))),FreeQ(u,$s("§tan"))),FreeQ(u,$s("§cot"))),FreeQ(u,$s("§sec"))),FreeQ(u,$s("§csc")))),
SetDelayed(ActivateTrig($p(u)),
    ReplaceAll(u,List(Rule($s("§sin"),$s("Sin")),Rule($s("§cos"),$s("Cos")),Rule($s("§tan"),$s("Tan")),Rule($s("§cot"),$s("Cot")),Rule($s("§sec"),$s("Sec")),Rule($s("§csc"),$s("Csc"))))),
SetDelayed(DeactivateTrig($p(u),$p(x)),
    FixInertTrigFunction(DeactivateTrigAux(u,x),x)),
SetDelayed(DeactivateTrigAux($p(u),$p(x)),
    If(AtomQ(u),u,If(And(TrigQ(u),LinearQ(Part(u,C1),x)),Module(List(Set(v,ExpandToSum(Part(u,C1),x))),If(SinQ(u),$($s("§sin"),v),If(CosQ(u),$($s("§cos"),v),If(TanQ(u),$($s("§tan"),v),If(CotQ(u),$($s("§cot"),v),If(SecQ(u),$($s("§sec"),v),$($s("§csc"),v))))))),If(And(HyperbolicQ(u),LinearQ(Part(u,C1),x)),Module(List(Set(v,ExpandToSum(Times(CI,Part(u,C1)),x))),If(SinhQ(u),Times(CN1,CI,$($s("§sin"),v)),If(CoshQ(u),$($s("§cos"),v),If(TanhQ(u),Times(CN1,CI,$($s("§tan"),v)),If(CothQ(u),Times(CI,$($s("§cot"),v)),If(SechQ(u),$($s("§sec"),v),Times(CI,$($s("§csc"),v)))))))),Map(Function(DeactivateTrigAux(Slot1,x)),u))))),
SetDelayed(FixInertTrigFunction(Times($p(a),$p(u)),$p(x)),
    Condition(Times(a,FixInertTrigFunction(u,x)),FreeQ(a,x))),
SetDelayed(FixInertTrigFunction(Times(Power(Times(Plus($p(b),$p(v)),$p(a)),$p(n)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power(Plus(Times(a,b),Times(a,v)),n)),x),And(FreeQ(List(a,b,n),x),Not(FreeQ(v,x))))),
SetDelayed(FixInertTrigFunction(Times(Power(Times($($s("§sin"),$p(w)),$p(c,true)),$p(n,true)),Power($($s("§sec"),$p(v)),$p(m,true))),$p(x)),
    Condition(FixInertTrigFunction(Times(Power($($s("§cos"),v),Times(CN1,m)),Power(Times(c,$($s("§sin"),w)),n)),x),And(FreeQ(List(c,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Times($($s("§sin"),$p(w)),$p(c,true)),$p(n,true)),Power($($s("§csc"),$p(v)),$p(m,true))),$p(x)),
    Condition(FixInertTrigFunction(Times(Power($($s("§sin"),v),Times(CN1,m)),Power(Times(c,$($s("§sin"),w)),n)),x),And(FreeQ(List(c,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Times($($s("§cos"),$p(w)),$p(c,true)),$p(n,true)),Power($($s("§sec"),$p(v)),$p(m,true))),$p(x)),
    Condition(FixInertTrigFunction(Times(Power($($s("§cos"),v),Times(CN1,m)),Power(Times(c,$($s("§cos"),w)),n)),x),And(FreeQ(List(c,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Times($($s("§cos"),$p(w)),$p(c,true)),$p(n,true)),Power($($s("§csc"),$p(v)),$p(m,true))),$p(x)),
    Condition(FixInertTrigFunction(Times(Power($($s("§sin"),v),Times(CN1,m)),Power(Times(c,$($s("§cos"),w)),n)),x),And(FreeQ(List(c,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§sec"),$p(v)),$p(m,true)),Power($($s("§sec"),$p(w)),$p(n,true))),$p(x)),
    Condition(FixInertTrigFunction(Times(Power($($s("§cos"),v),Times(CN1,m)),Power($($s("§cos"),w),Times(CN1,n))),x),IntegersQ(m,n))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§csc"),$p(v)),$p(m,true)),Power($($s("§csc"),$p(w)),$p(n,true))),$p(x)),
    Condition(FixInertTrigFunction(Times(Power($($s("§sin"),v),Times(CN1,m)),Power($($s("§sin"),w),Times(CN1,n))),x),IntegersQ(m,n))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times(Power(Times($($s("§sin"),$p(w)),$p(c,true)),$p(p)),$p(b,true)),$p(a)),$p(n,true)),Power($($s("§cot"),$p(v)),$p(m,true))),$p(x)),
    Condition(FixInertTrigFunction(Times(Power($($s("§tan"),v),Times(CN1,m)),Power(Plus(a,Times(b,Power(Times(c,$($s("§sin"),w)),p))),n)),x),And(FreeQ(List(a,b,c,n,p),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times($($s("§sin"),$p(w)),$p(b,true)),$p(a)),$p(n,true)),Power($($s("§tan"),$p(v)),$p(m,true)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),m),Power(Power($($s("§cos"),v),m),CN1),Power(Plus(a,Times(b,$($s("§sin"),w))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times($($s("§sin"),$p(w)),$p(b,true)),$p(a)),$p(n,true)),Power($($s("§cot"),$p(v)),$p(m,true)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),m),Power(Power($($s("§sin"),v),m),CN1),Power(Plus(a,Times(b,$($s("§sin"),w))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§sec"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§sin"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§csc"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§sin"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times(Power(Times($($s("§cos"),$p(w)),$p(c,true)),$p(p)),$p(b,true)),$p(a)),$p(n,true)),Power($($s("§tan"),$p(v)),$p(m,true))),$p(x)),
    Condition(FixInertTrigFunction(Times(Power($($s("§cot"),v),Times(CN1,m)),Power(Plus(a,Times(b,Power(Times(c,$($s("§cos"),w)),p))),n)),x),And(FreeQ(List(a,b,c,n,p),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times($($s("§cos"),$p(w)),$p(b,true)),$p(a)),$p(n,true)),Power($($s("§tan"),$p(v)),$p(m,true)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),m),Power(Power($($s("§cos"),v),m),CN1),Power(Plus(a,Times(b,$($s("§cos"),w))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times($($s("§cos"),$p(w)),$p(b,true)),$p(a)),$p(n,true)),Power($($s("§cot"),$p(v)),$p(m,true)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),m),Power(Power($($s("§sin"),v),m),CN1),Power(Plus(a,Times(b,$($s("§cos"),w))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§sec"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§cos"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§csc"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§cos"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§cot"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§tan"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§tan"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§sec"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§tan"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§csc"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§tan"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§tan"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cot"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§cot"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§sec"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§cot"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§csc"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§cot"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§cos"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sec"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§sec"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§cot"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§tan"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§sec"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§csc"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§sec"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§sin"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§csc"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§csc"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§tan"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cot"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§csc"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power($($s("§sec"),$p(v)),$p(m,true)),$p(u,true),$p(w)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),Times(CN1,m)),w),x),And(InertTrigSumQ(w,$s("§csc"),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times($($s("§sin"),$p(v)),$p(a,true)),Times($($s("§cos"),$p(v)),$p(b,true))),$p(n,true)),Power($($s("§tan"),$p(v)),$p(m,true)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),m),Power($($s("§cos"),v),Times(CN1,m)),Power(Plus(Times(a,$($s("§sin"),v)),Times(b,$($s("§cos"),v))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times($($s("§sin"),$p(v)),$p(a,true)),Times($($s("§cos"),$p(v)),$p(b,true))),$p(n,true)),Power($($s("§cot"),$p(v)),$p(m,true)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),m),Power($($s("§sin"),v),Times(CN1,m)),Power(Plus(Times(a,$($s("§sin"),v)),Times(b,$($s("§cos"),v))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times($($s("§sin"),$p(v)),$p(a,true)),Times($($s("§cos"),$p(v)),$p(b,true))),$p(n,true)),Power($($s("§sec"),$p(v)),$p(m,true)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§cos"),v),Times(CN1,m)),Power(Plus(Times(a,$($s("§sin"),v)),Times(b,$($s("§cos"),v))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Power(Plus(Times($($s("§sin"),$p(v)),$p(a,true)),Times($($s("§cos"),$p(v)),$p(b,true))),$p(n,true)),Power($($s("§csc"),$p(v)),$p(m,true)),$p(u,true)),$p(x)),
    Condition(FixInertTrigFunction(Times(u,Power($($s("§sin"),v),Times(CN1,m)),Power(Plus(Times(a,$($s("§sin"),v)),Times(b,$($s("§cos"),v))),n)),x),And(FreeQ(List(a,b,n),x),IntegerQ(m)))),
SetDelayed(FixInertTrigFunction(Times(Plus(Times($($p(g),$p(v)),$p("B",true)),Times(Power($($p(g),$p(v)),C2),$p("C",true)),$p("A",true)),Power($($p(f),$p(v)),$p(m,true))),$p(x)),
    Condition(Times(Power($(g,v),Times(CN1,m)),Plus($s("A"),Times($s("B"),$(g,v)),Times($s("C"),Power($(g,v),C2)))),And(And(FreeQ(List($s("A"),$s("B"),$s("C")),x),IntegerQ(m)),Or(InertReciprocalQ(f,g),InertReciprocalQ(g,f))))),
SetDelayed(FixInertTrigFunction(Times(Plus(Times(Power($($p(g),$p(v)),C2),$p("C",true)),$p("A",true)),Power($($p(f),$p(v)),$p(m,true))),$p(x)),
    Condition(Times(Power($(g,v),Times(CN1,m)),Plus($s("A"),Times($s("C"),Power($(g,v),C2)))),And(And(FreeQ(List($s("A"),$s("C")),x),IntegerQ(m)),Or(InertReciprocalQ(f,g),InertReciprocalQ(g,f)))))
  );
}
