package org.matheclipse.core.integrate.rubi;


import static org.matheclipse.core.expression.F.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctionCtors.*;
import static org.matheclipse.core.integrate.rubi.UtilityFunctions.*;
import org.matheclipse.core.interfaces.IAST;

/** 
 * IndefiniteIntegrationRules from the <a href="http://www.apmaths.uwo.ca/~arich/">Rubi -
 * rule-based integrator</a>.
 *  
 */
public class IntRules174 { 

	public static void initialize() {
		Initializer.init();
	}

	private static class Initializer  {

		private static void init() {
IIntegrate(4351,Int(Times(u_,Power(Tanh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_DEFAULT)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Coth(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Subtract(n,C1))),CN1),Subst(Int(SubstFor(Power(Times(Power(x,n),Subtract(C1,Times(Sqr(d),Sqr(x)))),CN1),Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),And(FunctionOfQ(Times(Coth(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x,True),TryPureTanSubst(Times(ActivateTrig(u),Power(Tanh(Times(c,Plus(a,Times(b,x)))),n)),x)))),And(FreeQ(List(a,b,c),x),IntegerQ(n))));
IIntegrate(4352,Int(u_,x_Symbol),
    With(List(Set(v,FunctionOfTrig(u,x))),Condition(Simp(With(List(Set(d,FreeFactors(Cot(v),x))),Dist(Times(CN1,d,Power(Coefficient(v,x,C1),CN1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),CN1),Times(Cot(v),Power(d,CN1)),u,x),x),x,Times(Cot(v),Power(d,CN1))),x)),x),And(Not(FalseQ(v)),FunctionOfQ(NonfreeFactors(Cot(v),x),u,x,True),TryPureTanSubst(ActivateTrig(u),x)))));
IIntegrate(4353,Int(u_,x_Symbol),
    With(List(Set(v,FunctionOfTrig(u,x))),Condition(Simp(With(List(Set(d,FreeFactors(Tan(v),x))),Dist(Times(d,Power(Coefficient(v,x,C1),CN1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),CN1),Times(Tan(v),Power(d,CN1)),u,x),x),x,Times(Tan(v),Power(d,CN1))),x)),x),And(Not(FalseQ(v)),FunctionOfQ(NonfreeFactors(Tan(v),x),u,x,True),TryPureTanSubst(ActivateTrig(u),x)))));
IIntegrate(4354,Int(Times(Power($(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(ActivateTrig(Times(Power(F(Plus(a,Times(b,x))),p),Power(G(Plus(c,Times(d,x))),q))),x),x),And(FreeQ(List(a,b,c,d),x),Or(EqQ(FSymbol,$s("§sin")),EqQ(FSymbol,$s("§cos"))),Or(EqQ(GSymbol,$s("§sin")),EqQ(GSymbol,$s("§cos"))),IGtQ(p,C0),IGtQ(q,C0))));
IIntegrate(4355,Int(Times(Power($(F_,Plus(a_DEFAULT,Times(b_DEFAULT,x_))),p_DEFAULT),Power($(G_,Plus(c_DEFAULT,Times(d_DEFAULT,x_))),q_DEFAULT),Power($($p("H"),Plus(e_DEFAULT,Times(f_DEFAULT,x_))),r_DEFAULT)),x_Symbol),
    Condition(Int(ExpandTrigReduce(ActivateTrig(Times(Power(F(Plus(a,Times(b,x))),p),Power(G(Plus(c,Times(d,x))),q),Power(H(Plus(e,Times(f,x))),r))),x),x),And(FreeQ(List(a,b,c,d,e,f),x),Or(EqQ(FSymbol,$s("§sin")),EqQ(FSymbol,$s("§cos"))),Or(EqQ(GSymbol,$s("§sin")),EqQ(GSymbol,$s("§cos"))),Or(EqQ($s("H"),$s("§sin")),EqQ($s("H"),$s("§cos"))),IGtQ(p,C0),IGtQ(q,C0),IGtQ(r,C0))));
IIntegrate(4356,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,Cos),EqQ(FSymbol,$s("§cos"))))));
IIntegrate(4357,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,Sin),EqQ(FSymbol,$s("§sin"))))));
IIntegrate(4358,Int(Times(Cosh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),FreeQ(List(a,b,c),x)));
IIntegrate(4359,Int(Times(u_,Sinh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(C1,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),FreeQ(List(a,b,c),x)));
IIntegrate(4360,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),CN1),Subst(Int(SubstFor(Power(x,CN1),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,Cot),EqQ(FSymbol,$s("§cot"))))));
IIntegrate(4361,Int(Times(u_,$(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Power(Times(b,c),CN1),Subst(Int(SubstFor(Power(x,CN1),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),Or(EqQ(FSymbol,Tan),EqQ(FSymbol,$s("§tan"))))));
IIntegrate(4362,Int(Times(Coth(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),CN1),Subst(Int(SubstFor(Power(x,CN1),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),FreeQ(List(a,b,c),x)));
IIntegrate(4363,Int(Times(u_,Tanh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_))))),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c),CN1),Subst(Int(SubstFor(Power(x,CN1),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),FreeQ(List(a,b,c),x)));
IIntegrate(4364,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(Power(Subtract(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(n,C1))),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u),Or(EqQ(FSymbol,Cos),EqQ(FSymbol,$s("§cos"))))));
IIntegrate(4365,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(Power(Subtract(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(Negate(n),C1))),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u),Or(EqQ(FSymbol,Sec),EqQ(FSymbol,$s("§sec"))))));
IIntegrate(4366,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(Power(Subtract(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(n,C1))),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u),Or(EqQ(FSymbol,Sin),EqQ(FSymbol,$s("§sin"))))));
IIntegrate(4367,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(Power(Subtract(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(Negate(n),C1))),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u),Or(EqQ(FSymbol,Csc),EqQ(FSymbol,$s("§csc"))))));
IIntegrate(4368,Int(Times(Power(Cosh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(n,C1))),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u))));
IIntegrate(4369,Int(Times(u_,Power(Sech(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(Power(Plus(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(Negate(n),C1))),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u))));
IIntegrate(4370,Int(Times(u_,Power(Sinh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(Power(Plus(CN1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(n,C1))),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u))));
IIntegrate(4371,Int(Times(Power(Csch(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Times(d,Power(Times(b,c),CN1)),Subst(Int(SubstFor(Power(Plus(CN1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(Negate(n),C1))),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u))));
IIntegrate(4372,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sin(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Subtract(n,C1))),CN1),Subst(Int(SubstFor(Times(Power(Subtract(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(n,C1))),Power(Power(x,n),CN1)),Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sin(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u),Or(EqQ(FSymbol,Cot),EqQ(FSymbol,$s("§cot"))))));
IIntegrate(4373,Int(Times(u_,Power($(F_,Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cos(Times(c,Plus(a,Times(b,x)))),x))),Condition(Negate(Dist(Power(Times(b,c,Power(d,Subtract(n,C1))),CN1),Subst(Int(SubstFor(Times(Power(Subtract(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(n,C1))),Power(Power(x,n),CN1)),Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x)),FunctionOfQ(Times(Cos(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u),Or(EqQ(FSymbol,Tan),EqQ(FSymbol,$s("§tan"))))));
IIntegrate(4374,Int(Times(Power(Coth(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_),u_),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Sinh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Subtract(n,C1))),CN1),Subst(Int(SubstFor(Times(Power(Plus(C1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(n,C1))),Power(Power(x,n),CN1)),Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Sinh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u))));
IIntegrate(4375,Int(Times(u_,Power(Tanh(Times(c_DEFAULT,Plus(a_DEFAULT,Times(b_DEFAULT,x_)))),n_)),x_Symbol),
    Condition(With(List(Set(d,FreeFactors(Cosh(Times(c,Plus(a,Times(b,x)))),x))),Condition(Dist(Power(Times(b,c,Power(d,Subtract(n,C1))),CN1),Subst(Int(SubstFor(Times(Power(Plus(CN1,Times(Sqr(d),Sqr(x))),Times(C1D2,Subtract(n,C1))),Power(Power(x,n),CN1)),Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x),x),x,Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1))),x),FunctionOfQ(Times(Cosh(Times(c,Plus(a,Times(b,x)))),Power(d,CN1)),u,x))),And(FreeQ(List(a,b,c),x),IntegerQ(Times(C1D2,Subtract(n,C1))),NonsumQ(u))));
  }
}
}